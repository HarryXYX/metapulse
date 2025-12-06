package com.linkedin.metadata.service.ingestiondata;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.linkedin.metadata.service.ingestiondata.model.ColumnInfo;
import com.linkedin.metadata.service.ingestiondata.model.DataConnection;
import com.linkedin.metadata.service.ingestiondata.model.MirrorTable;
import com.linkedin.metadata.service.ingestiondata.model.TableInfo;
import com.linkedin.metadata.service.ingestiondata.repository.MirrorTableRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.entity.client.SystemEntityClient;
import com.zaxxer.hikari.HikariDataSource;
import io.datahubproject.metadata.context.OperationContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * 全量导入服务
 *
 * <p>负责从外部数据库全量导入表结构和数据到 master_data 数据库
 */
@Slf4j
@Service
public class FullImportService {

  private final DataConnectionService connectionService;
  private final MirrorTableRepository mirrorTableRepository;
  private final JdbcTemplate masterDataJdbcTemplate;
  private final ObjectMapper objectMapper;
  private final DatasetMetadataPublisher metadataPublisher;

  /** 批量插入大小 */
  private static final int BATCH_SIZE = 1000;

  public FullImportService(
      DataConnectionService connectionService,
      MirrorTableRepository mirrorTableRepository,
      @Qualifier("masterDataJdbcTemplate") JdbcTemplate masterDataJdbcTemplate,
      ObjectMapper objectMapper,
      @Nullable SystemEntityClient systemEntityClient) {
    this.connectionService = connectionService;
    this.mirrorTableRepository = mirrorTableRepository;
    this.masterDataJdbcTemplate = masterDataJdbcTemplate;
    this.objectMapper = objectMapper;
    this.metadataPublisher = systemEntityClient != null ?
        new DatasetMetadataPublisher(systemEntityClient) : null;
  }

  /**
   * 执行全量导入
   *
   * @param opContext 操作上下文（用于发布元数据到 DataHub）
   * @param connectionId 连接 ID
   * @param tableNames 要导入的表名列表，如果为空则导入所有表
   * @return 导入结果
   */
  public ImportResult fullImport(
      @Nullable OperationContext opContext,
      @Nonnull Long connectionId,
      List<String> tableNames) {
    log.info("Starting full import for connection: {}, tables: {}", connectionId, tableNames);

    Optional<DataConnection> connectionOpt = connectionService.getConnection(connectionId);
    if (connectionOpt.isEmpty()) {
      return ImportResult.failure("Connection not found: " + connectionId);
    }

    DataConnection connection = connectionOpt.get();
    ImportResult result = new ImportResult();
    result.setConnectionId(connectionId);

    try {
      // 获取要导入的表列表
      List<TableInfo> tables = connectionService.getTables(connection);

      if (tableNames != null && !tableNames.isEmpty()) {
        tables =
            tables.stream()
                .filter(t -> tableNames.contains(t.getTableName()))
                .collect(Collectors.toList());
      }

      log.info("Found {} tables to import", tables.size());
      result.setTotalTables(tables.size());

      // 逐表导入
      for (TableInfo tableInfo : tables) {
        try {
          TableImportResult tableResult = importTable(opContext, connection, tableInfo);
          result.addTableResult(tableResult);

          if (tableResult.isSuccess()) {
            result.incrementSuccessCount();
          } else {
            result.incrementFailedCount();
          }

        } catch (Exception e) {
          log.error("Failed to import table {}: {}", tableInfo.getTableName(), e.getMessage(), e);
          result.addTableResult(
              TableImportResult.failure(tableInfo.getTableName(), e.getMessage()));
          result.incrementFailedCount();
        }
      }

      result.setSuccess(result.getFailedTables() == 0);
      result.setMessage(
          String.format(
              "Imported %d/%d tables successfully",
              result.getSuccessTables(), result.getTotalTables()));

    } catch (Exception e) {
      log.error("Full import failed: {}", e.getMessage(), e);
      result.setSuccess(false);
      result.setMessage("Import failed: " + e.getMessage());
    }

    log.info("Full import completed: {}", result.getMessage());
    return result;
  }

  /**
   * 导入单个表
   *
   * @param opContext 操作上下文（用于发布元数据到 DataHub）
   * @param connection 数据连接
   * @param tableInfo 表信息
   * @return 导入结果
   */
  public TableImportResult importTable(
      @Nullable OperationContext opContext,
      @Nonnull DataConnection connection,
      @Nonnull TableInfo tableInfo) {

    String tableName = tableInfo.getTableName();
    log.info("Importing table: {}", tableName);

    try {
      // 1. 生成镜像表名
      String mirrorTableName =
          MirrorTable.generateMirrorTableName(
              connection.getId(), connection.getDatabaseName(), tableName);

      // 2. 检查是否已存在镜像表记录
      Optional<MirrorTable> existingMirror =
          mirrorTableRepository.findByMirrorTableName(mirrorTableName);

      MirrorTable mirrorTable;
      String columnSchemaJson = columnsToJson(tableInfo.getColumns());
      String primaryKeysJson = primaryKeysToJson(tableInfo.getPrimaryKeys());

      if (existingMirror.isPresent()) {
        mirrorTable = existingMirror.get();
        log.info("Mirror table record already exists: {}, updating schema", mirrorTableName);
        // 更新已存在的记录的列结构信息（以便处理表结构变化的情况）
        mirrorTableRepository.updateColumnSchema(mirrorTable.getId(), columnSchemaJson, primaryKeysJson);
      } else {
        // 创建新的镜像表记录
        mirrorTable =
            MirrorTable.builder()
                .connectionId(connection.getId())
                .sourceDatabase(connection.getDatabaseName())
                .sourceTable(tableName)
                .mirrorTableName(mirrorTableName)
                .columnSchema(columnSchemaJson)
                .primaryKeyColumns(primaryKeysJson)
                .syncStatus(MirrorTable.SyncStatus.SYNCING.name())
                .build();
        mirrorTable = mirrorTableRepository.create(mirrorTable);
        log.info("Created new mirror table record: {}", mirrorTableName);
      }

      // 3. 更新状态为 SYNCING
      mirrorTableRepository.updateSyncStatus(mirrorTable.getId(), MirrorTable.SyncStatus.SYNCING.name());

      // 4. 创建或重建镜像表结构
      createMirrorTable(mirrorTableName, tableInfo);

      // 5. 复制数据
      long rowCount = copyTableData(connection, tableName, mirrorTableName, tableInfo);

      // 6. 更新同步完成状态
      mirrorTableRepository.updateFullSyncComplete(mirrorTable.getId(), rowCount);

      // 7. 发布数据集元数据到 DataHub
      if (metadataPublisher != null && opContext != null) {
        try {
          metadataPublisher.publishDatasetMetadata(opContext, mirrorTable, tableInfo);
          log.info("Published dataset metadata for table: {}", mirrorTableName);
        } catch (Exception e) {
          // 元数据发布失败不应该阻止导入成功
          log.warn("Failed to publish dataset metadata for table {}: {}", mirrorTableName, e.getMessage(), e);
        }
      }

      log.info("Table {} imported successfully, {} rows", tableName, rowCount);
      return TableImportResult.success(tableName, mirrorTableName, rowCount);

    } catch (Exception e) {
      log.error("Failed to import table {}: {}", tableName, e.getMessage(), e);
      return TableImportResult.failure(tableName, e.getMessage());
    }
  }

  /**
   * 创建或更新镜像表
   *
   * <p>如果表结构相同，只清空数据；如果结构不同或表不存在，则重建表
   */
  private void createMirrorTable(String mirrorTableName, TableInfo tableInfo) {
    // 检查表是否已存在
    boolean tableExists = checkTableExists(mirrorTableName);

    if (tableExists) {
      // 比较表结构是否相同
      boolean structureSame = compareTableStructure(mirrorTableName, tableInfo);

      if (structureSame) {
        // 结构相同，只清空数据（比 DROP+CREATE 更快）
        log.info("Mirror table {} exists with same structure, truncating data", mirrorTableName);
        masterDataJdbcTemplate.execute("TRUNCATE TABLE `" + mirrorTableName + "`");
        return;
      } else {
        // 结构不同，需要重建表
        log.info("Mirror table {} structure changed, rebuilding table", mirrorTableName);
        masterDataJdbcTemplate.execute("DROP TABLE `" + mirrorTableName + "`");
      }
    }

    // 构建建表语句
    StringBuilder sql = new StringBuilder();
    sql.append("CREATE TABLE `").append(mirrorTableName).append("` (\n");

    List<String> columnDefs = new ArrayList<>();
    List<String> primaryKeyCols = new ArrayList<>();

    for (ColumnInfo column : tableInfo.getColumns()) {
      String colDef = "  " + column.toMySqlColumnDefinition();
      columnDefs.add(colDef);

      if (Boolean.TRUE.equals(column.getPrimaryKey())) {
        primaryKeyCols.add("`" + column.getName() + "`");
      }
    }

    // 如果没有从列信息中获取到主键，使用表级主键信息
    if (primaryKeyCols.isEmpty() && tableInfo.getPrimaryKeys() != null) {
      for (String pk : tableInfo.getPrimaryKeys()) {
        primaryKeyCols.add("`" + pk + "`");
      }
    }

    sql.append(String.join(",\n", columnDefs));

    if (!primaryKeyCols.isEmpty()) {
      sql.append(",\n  PRIMARY KEY (").append(String.join(", ", primaryKeyCols)).append(")");
    }

    sql.append("\n) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci");
    sql.append(" COMMENT='Mirror of ").append(tableInfo.getDatabaseName())
        .append(".").append(tableInfo.getTableName()).append("'");

    log.debug("Creating mirror table: {}", sql);
    masterDataJdbcTemplate.execute(sql.toString());
    log.info("Created mirror table: {}", mirrorTableName);
  }

  /**
   * 检查表是否存在
   */
  private boolean checkTableExists(String tableName) {
    try {
      String sql = "SELECT COUNT(*) FROM information_schema.TABLES WHERE TABLE_SCHEMA = DATABASE() AND TABLE_NAME = ?";
      Integer count = masterDataJdbcTemplate.queryForObject(sql, Integer.class, tableName);
      return count != null && count > 0;
    } catch (Exception e) {
      log.warn("Failed to check if table {} exists: {}", tableName, e.getMessage());
      return false;
    }
  }

  /**
   * 比较表结构是否相同
   */
  private boolean compareTableStructure(String tableName, TableInfo newTableInfo) {
    try {
      // 获取现有表的列信息
      String sql = "SELECT COLUMN_NAME, DATA_TYPE, COLUMN_TYPE FROM information_schema.COLUMNS " +
          "WHERE TABLE_SCHEMA = DATABASE() AND TABLE_NAME = ? ORDER BY ORDINAL_POSITION";

      List<String> existingColumns = masterDataJdbcTemplate.query(sql,
          (rs, rowNum) -> rs.getString("COLUMN_NAME") + ":" + rs.getString("COLUMN_TYPE"),
          tableName);

      // 构建新表的列签名
      List<String> newColumns = new ArrayList<>();
      for (ColumnInfo column : newTableInfo.getColumns()) {
        newColumns.add(column.getName() + ":" + column.getDataType());
      }

      // 简单比较列数量和列名+类型是否相同
      if (existingColumns.size() != newColumns.size()) {
        log.debug("Column count different: existing={}, new={}", existingColumns.size(), newColumns.size());
        return false;
      }

      for (int i = 0; i < existingColumns.size(); i++) {
        if (!existingColumns.get(i).equalsIgnoreCase(newColumns.get(i))) {
          log.debug("Column {} different: existing={}, new={}", i, existingColumns.get(i), newColumns.get(i));
          return false;
        }
      }

      return true;
    } catch (Exception e) {
      log.warn("Failed to compare table structure for {}: {}", tableName, e.getMessage());
      return false;
    }
  }

  /**
   * 复制表数据
   */
  private long copyTableData(
      DataConnection connection,
      String sourceTable,
      String mirrorTableName,
      TableInfo tableInfo) {

    AtomicLong totalRows = new AtomicLong(0);

    try (HikariDataSource sourceDs = connectionService.createDataSource(connection);
        Connection sourceConn = sourceDs.getConnection();
        Statement sourceStmt = sourceConn.createStatement()) {

      // 设置为流式读取，避免内存溢出
      sourceStmt.setFetchSize(Integer.MIN_VALUE);

      String selectSql = "SELECT * FROM `" + sourceTable + "`";
      try (ResultSet rs = sourceStmt.executeQuery(selectSql)) {

        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();

        // 构建 INSERT 语句
        StringBuilder insertSql = new StringBuilder();
        insertSql.append("INSERT INTO `").append(mirrorTableName).append("` (");

        List<String> columnNames = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
          columnNames.add("`" + metaData.getColumnName(i) + "`");
        }
        insertSql.append(String.join(", ", columnNames));
        insertSql.append(") VALUES (");
        insertSql.append(String.join(", ", columnNames.stream().map(c -> "?").collect(Collectors.toList())));
        insertSql.append(")");

        String insertSqlStr = insertSql.toString();

        // 使用批量插入
        try (Connection targetConn = masterDataJdbcTemplate.getDataSource().getConnection();
            PreparedStatement insertStmt = targetConn.prepareStatement(insertSqlStr)) {

          targetConn.setAutoCommit(false);
          int batchCount = 0;

          while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
              insertStmt.setObject(i, rs.getObject(i));
            }
            insertStmt.addBatch();
            batchCount++;
            totalRows.incrementAndGet();

            if (batchCount >= BATCH_SIZE) {
              insertStmt.executeBatch();
              targetConn.commit();
              batchCount = 0;
              log.debug("Inserted {} rows into {}", totalRows.get(), mirrorTableName);
            }
          }

          // 处理剩余的批次
          if (batchCount > 0) {
            insertStmt.executeBatch();
            targetConn.commit();
          }

          targetConn.setAutoCommit(true);
        }
      }

    } catch (SQLException e) {
      log.error("Failed to copy table data: {}", e.getMessage(), e);
      throw new RuntimeException("Failed to copy table data: " + e.getMessage(), e);
    }

    return totalRows.get();
  }

  /**
   * 将列信息转换为 JSON
   */
  private String columnsToJson(List<ColumnInfo> columns) {
    try {
      return objectMapper.writeValueAsString(columns);
    } catch (JsonProcessingException e) {
      log.warn("Failed to serialize columns to JSON", e);
      return "[]";
    }
  }

  /**
   * 将主键列表转换为 JSON
   */
  private String primaryKeysToJson(List<String> primaryKeys) {
    try {
      return objectMapper.writeValueAsString(primaryKeys);
    } catch (JsonProcessingException e) {
      log.warn("Failed to serialize primary keys to JSON", e);
      return "[]";
    }
  }

  /**
   * 获取连接下的所有镜像表
   */
  public List<MirrorTable> getMirrorTables(@Nonnull Long connectionId) {
    return mirrorTableRepository.findByConnectionId(connectionId);
  }

  /**
   * 导入结果
   */
  public static class ImportResult {
    private Long connectionId;
    private boolean success;
    private String message;
    private int totalTables;
    private int successTables;
    private int failedTables;
    private List<TableImportResult> tableResults = new ArrayList<>();

    public static ImportResult failure(String message) {
      ImportResult result = new ImportResult();
      result.setSuccess(false);
      result.setMessage(message);
      return result;
    }

    public void addTableResult(TableImportResult tableResult) {
      tableResults.add(tableResult);
    }

    public void incrementSuccessCount() {
      successTables++;
    }

    public void incrementFailedCount() {
      failedTables++;
    }

    // Getters and Setters
    public Long getConnectionId() { return connectionId; }
    public void setConnectionId(Long connectionId) { this.connectionId = connectionId; }
    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public int getTotalTables() { return totalTables; }
    public void setTotalTables(int totalTables) { this.totalTables = totalTables; }
    public int getSuccessTables() { return successTables; }
    public int getFailedTables() { return failedTables; }
    public List<TableImportResult> getTableResults() { return tableResults; }
  }

  /**
   * 单表导入结果
   */
  public static class TableImportResult {
    private String sourceTable;
    private String mirrorTable;
    private boolean success;
    private String message;
    private long rowCount;

    public static TableImportResult success(String sourceTable, String mirrorTable, long rowCount) {
      TableImportResult result = new TableImportResult();
      result.sourceTable = sourceTable;
      result.mirrorTable = mirrorTable;
      result.success = true;
      result.rowCount = rowCount;
      result.message = "Success";
      return result;
    }

    public static TableImportResult failure(String sourceTable, String message) {
      TableImportResult result = new TableImportResult();
      result.sourceTable = sourceTable;
      result.success = false;
      result.message = message;
      return result;
    }

    // Getters
    public String getSourceTable() { return sourceTable; }
    public String getMirrorTable() { return mirrorTable; }
    public boolean isSuccess() { return success; }
    public String getMessage() { return message; }
    public long getRowCount() { return rowCount; }
  }
}
