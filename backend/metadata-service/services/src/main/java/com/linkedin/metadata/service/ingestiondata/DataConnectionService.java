package com.linkedin.metadata.service.ingestiondata;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.linkedin.metadata.service.ingestiondata.model.ColumnInfo;
import com.linkedin.metadata.service.ingestiondata.model.DataConnection;
import com.linkedin.metadata.service.ingestiondata.model.TableInfo;
import com.linkedin.metadata.service.ingestiondata.repository.DataConnectionRepository;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nonnull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 数据连接服务
 *
 * <p>提供外部数据库连接管理、测试连接、获取元数据等功能
 */
@Slf4j
@Service
public class DataConnectionService {

  private final DataConnectionRepository repository;
  private final ObjectMapper objectMapper;

  public DataConnectionService(DataConnectionRepository repository, ObjectMapper objectMapper) {
    this.repository = repository;
    this.objectMapper = objectMapper;
  }

  /**
   * 创建数据连接
   */
  public DataConnection createConnection(@Nonnull DataConnection connection) {
    log.info(
        "Creating data connection: name={}, type={}, host={}",
        connection.getConnectionName(),
        connection.getConnectionType(),
        connection.getHost());
    return repository.create(connection);
  }

  /**
   * 获取连接
   */
  public Optional<DataConnection> getConnection(@Nonnull Long id) {
    return repository.findById(id);
  }

  /**
   * 根据 IngestionSource URN 获取连接
   */
  public Optional<DataConnection> getConnectionByIngestionSourceUrn(@Nonnull String urn) {
    return repository.findByIngestionSourceUrn(urn);
  }

  /**
   * 获取所有活跃连接
   */
  public List<DataConnection> getActiveConnections() {
    return repository.findAllActive();
  }

  /**
   * 获取所有连接
   */
  public List<DataConnection> getAllConnections() {
    return repository.findAll();
  }

  /**
   * 测试连接
   */
  public TestConnectionResult testConnection(@Nonnull DataConnection connection) {
    log.info(
        "Testing connection: type={}, host={}, port={}, database={}",
        connection.getConnectionType(),
        connection.getHost(),
        connection.getPort(),
        connection.getDatabaseName());

    try (HikariDataSource ds = createDataSource(connection);
        Connection conn = ds.getConnection()) {

      DatabaseMetaData metaData = conn.getMetaData();
      String productName = metaData.getDatabaseProductName();
      String productVersion = metaData.getDatabaseProductVersion();

      String message =
          String.format(
              "Connected successfully to %s %s", productName, productVersion);

      log.info("Connection test successful: {}", message);

      // 更新测试结果
      if (connection.getId() != null) {
        repository.updateTestResult(connection.getId(), "SUCCESS", message);
      }

      return TestConnectionResult.success(message);

    } catch (Exception e) {
      String errorMessage = "Connection failed: " + e.getMessage();
      log.error("Connection test failed: {}", errorMessage, e);

      // 更新测试结果
      if (connection.getId() != null) {
        repository.updateTestResult(connection.getId(), "FAILED", errorMessage);
      }

      return TestConnectionResult.failure(errorMessage);
    }
  }

  /**
   * 测试连接（根据ID）
   */
  public TestConnectionResult testConnection(@Nonnull Long connectionId) {
    Optional<DataConnection> connection = getConnection(connectionId);
    if (connection.isEmpty()) {
      return TestConnectionResult.failure("Connection not found: " + connectionId);
    }
    return testConnection(connection.get());
  }

  /**
   * 获取外部数据库的所有表信息
   */
  public List<TableInfo> getTables(@Nonnull DataConnection connection) {
    log.info(
        "Getting tables from: type={}, host={}, database={}",
        connection.getConnectionType(),
        connection.getHost(),
        connection.getDatabaseName());

    List<TableInfo> tables = new ArrayList<>();

    try (HikariDataSource ds = createDataSource(connection);
        Connection conn = ds.getConnection()) {

      DatabaseMetaData metaData = conn.getMetaData();

      // 获取所有表
      try (ResultSet rs =
          metaData.getTables(
              connection.getDatabaseName(), null, "%", new String[] {"TABLE", "VIEW"})) {

        while (rs.next()) {
          String tableName = rs.getString("TABLE_NAME");
          String tableType = rs.getString("TABLE_TYPE");
          String remarks = rs.getString("REMARKS");

          // 获取列信息
          List<ColumnInfo> columns = getColumns(metaData, connection.getDatabaseName(), tableName);

          // 获取主键
          List<String> primaryKeys = getPrimaryKeys(metaData, connection.getDatabaseName(), tableName);

          TableInfo tableInfo =
              TableInfo.builder()
                  .tableName(tableName)
                  .databaseName(connection.getDatabaseName())
                  .tableType(tableType)
                  .comment(remarks)
                  .columns(columns)
                  .primaryKeys(primaryKeys)
                  .build();

          tables.add(tableInfo);
        }
      }

      log.info("Found {} tables in database {}", tables.size(), connection.getDatabaseName());

    } catch (Exception e) {
      log.error("Failed to get tables: {}", e.getMessage(), e);
      throw new RuntimeException("Failed to get tables: " + e.getMessage(), e);
    }

    return tables;
  }

  /**
   * 获取单个表信息
   */
  public Optional<TableInfo> getTableInfo(
      @Nonnull DataConnection connection, @Nonnull String tableName) {
    try (HikariDataSource ds = createDataSource(connection);
        Connection conn = ds.getConnection()) {

      DatabaseMetaData metaData = conn.getMetaData();

      try (ResultSet rs =
          metaData.getTables(
              connection.getDatabaseName(), null, tableName, new String[] {"TABLE", "VIEW"})) {

        if (rs.next()) {
          String tableType = rs.getString("TABLE_TYPE");
          String remarks = rs.getString("REMARKS");

          List<ColumnInfo> columns = getColumns(metaData, connection.getDatabaseName(), tableName);
          List<String> primaryKeys = getPrimaryKeys(metaData, connection.getDatabaseName(), tableName);

          return Optional.of(
              TableInfo.builder()
                  .tableName(tableName)
                  .databaseName(connection.getDatabaseName())
                  .tableType(tableType)
                  .comment(remarks)
                  .columns(columns)
                  .primaryKeys(primaryKeys)
                  .build());
        }
      }

    } catch (Exception e) {
      log.error("Failed to get table info for {}: {}", tableName, e.getMessage(), e);
    }

    return Optional.empty();
  }

  /**
   * 获取表的列信息
   */
  private List<ColumnInfo> getColumns(
      DatabaseMetaData metaData, String database, String tableName) throws SQLException {

    List<ColumnInfo> columns = new ArrayList<>();

    try (ResultSet rs = metaData.getColumns(database, null, tableName, "%")) {
      while (rs.next()) {
        String columnName = rs.getString("COLUMN_NAME");
        String typeName = rs.getString("TYPE_NAME");
        int columnSize = rs.getInt("COLUMN_SIZE");
        int decimalDigits = rs.getInt("DECIMAL_DIGITS");
        int nullable = rs.getInt("NULLABLE");
        String defaultValue = rs.getString("COLUMN_DEF");
        String remarks = rs.getString("REMARKS");
        int ordinalPosition = rs.getInt("ORDINAL_POSITION");
        String isAutoIncrement = rs.getString("IS_AUTOINCREMENT");

        // 构建完整数据类型
        String fullDataType = buildFullDataType(typeName, columnSize, decimalDigits);

        columns.add(
            ColumnInfo.builder()
                .name(columnName)
                .dataType(fullDataType)
                .length(columnSize)
                .precision(columnSize)
                .scale(decimalDigits)
                .nullable(nullable == DatabaseMetaData.columnNullable)
                .defaultValue(defaultValue)
                .comment(remarks)
                .ordinalPosition(ordinalPosition)
                .autoIncrement("YES".equalsIgnoreCase(isAutoIncrement))
                .build());
      }
    }

    return columns;
  }

  /**
   * 获取表的主键
   */
  private List<String> getPrimaryKeys(DatabaseMetaData metaData, String database, String tableName)
      throws SQLException {

    List<String> primaryKeys = new ArrayList<>();

    try (ResultSet rs = metaData.getPrimaryKeys(database, null, tableName)) {
      while (rs.next()) {
        primaryKeys.add(rs.getString("COLUMN_NAME"));
      }
    }

    return primaryKeys;
  }

  /**
   * 构建完整数据类型字符串
   */
  private String buildFullDataType(String typeName, int size, int decimalDigits) {
    String upperType = typeName.toUpperCase();

    if (upperType.contains("INT")
        || upperType.contains("BOOL")
        || upperType.contains("DATE")
        || upperType.contains("TIME")
        || upperType.contains("TEXT")
        || upperType.contains("BLOB")
        || upperType.contains("JSON")) {
      return typeName;
    }

    if (upperType.contains("DECIMAL") || upperType.contains("NUMERIC")) {
      return String.format("%s(%d,%d)", typeName, size, decimalDigits);
    }

    if (size > 0) {
      return String.format("%s(%d)", typeName, size);
    }

    return typeName;
  }

  /**
   * 创建数据源
   */
  public HikariDataSource createDataSource(@Nonnull DataConnection connection) {
    HikariConfig config = new HikariConfig();

    String jdbcUrl = buildJdbcUrl(connection);
    config.setJdbcUrl(jdbcUrl);
    config.setUsername(connection.getUsername());
    config.setPassword(decryptPassword(connection.getPasswordEncrypted()));
    config.setDriverClassName(getDriverClassName(connection.getConnectionType()));

    // 使用较小的连接池，因为这是临时连接
    config.setMaximumPoolSize(3);
    config.setMinimumIdle(1);
    config.setConnectionTimeout(
        connection.getConnectionTimeoutMs() != null ? connection.getConnectionTimeoutMs() : 30000);
    config.setPoolName("temp-" + connection.getId());

    return new HikariDataSource(config);
  }

  /**
   * 构建 JDBC URL
   */
  public String buildJdbcUrl(@Nonnull DataConnection connection) {
    String type = connection.getConnectionType().toLowerCase();
    String host = connection.getHost();
    int port = connection.getPort();
    String database = connection.getDatabaseName();

    switch (type) {
      case "mysql":
        return String.format(
            "jdbc:mysql://%s:%d/%s?useUnicode=true&characterEncoding=UTF-8&useSSL=%s&allowPublicKeyRetrieval=true",
            host, port, database, connection.getUseSsl());
      case "postgres":
      case "postgresql":
        return String.format("jdbc:postgresql://%s:%d/%s", host, port, database);
      case "oracle":
        return String.format("jdbc:oracle:thin:@%s:%d:%s", host, port, database);
      case "sqlserver":
      case "mssql":
        return String.format("jdbc:sqlserver://%s:%d;databaseName=%s", host, port, database);
      default:
        throw new IllegalArgumentException("Unsupported connection type: " + type);
    }
  }

  /**
   * 获取驱动类名
   */
  private String getDriverClassName(String connectionType) {
    switch (connectionType.toLowerCase()) {
      case "mysql":
        return "com.mysql.cj.jdbc.Driver";
      case "postgres":
      case "postgresql":
        return "org.postgresql.Driver";
      case "oracle":
        return "oracle.jdbc.OracleDriver";
      case "sqlserver":
      case "mssql":
        return "com.microsoft.sqlserver.jdbc.SQLServerDriver";
      default:
        throw new IllegalArgumentException("Unsupported connection type: " + connectionType);
    }
  }

  /**
   * 解密密码（目前简单返回，后续实现加密）
   */
  private String decryptPassword(String encryptedPassword) {
    // TODO: 实现密码加解密
    return encryptedPassword;
  }

  /**
   * 加密密码
   */
  public String encryptPassword(String plainPassword) {
    // TODO: 实现密码加解密
    return plainPassword;
  }

  /**
   * 将列信息转换为 JSON
   */
  public String columnsToJson(List<ColumnInfo> columns) {
    try {
      return objectMapper.writeValueAsString(columns);
    } catch (JsonProcessingException e) {
      throw new RuntimeException("Failed to serialize columns to JSON", e);
    }
  }

  /**
   * 删除连接
   */
  public void deleteConnection(@Nonnull Long id) {
    repository.delete(id);
  }

  /**
   * 软删除连接
   */
  public void softDeleteConnection(@Nonnull Long id) {
    repository.softDelete(id);
  }

  /**
   * 测试连接结果
   */
  public static class TestConnectionResult {
    private final boolean success;
    private final String message;

    private TestConnectionResult(boolean success, String message) {
      this.success = success;
      this.message = message;
    }

    public static TestConnectionResult success(String message) {
      return new TestConnectionResult(true, message);
    }

    public static TestConnectionResult failure(String message) {
      return new TestConnectionResult(false, message);
    }

    public boolean isSuccess() {
      return success;
    }

    public String getMessage() {
      return message;
    }
  }
}
