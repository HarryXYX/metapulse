package com.linkedin.metadata.service.ingestiondata.repository;

import com.linkedin.metadata.service.ingestiondata.model.MirrorTable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nonnull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

/**
 * 镜像表注册 Repository
 *
 * <p>用于操作 master_data.mirror_table 表
 */
@Slf4j
@Repository
public class MirrorTableRepository {

  private final JdbcTemplate jdbcTemplate;

  private static final String TABLE_NAME = "mirror_table";

  private static final RowMapper<MirrorTable> ROW_MAPPER = (rs, rowNum) -> mapRow(rs);

  public MirrorTableRepository(@Qualifier("masterDataJdbcTemplate") JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  private static MirrorTable mapRow(ResultSet rs) throws SQLException {
    return MirrorTable.builder()
        .id(rs.getLong("id"))
        .connectionId(rs.getLong("connection_id"))
        .datasetUrn(rs.getString("dataset_urn"))
        .sourceDatabase(rs.getString("source_database"))
        .sourceSchema(rs.getString("source_schema"))
        .sourceTable(rs.getString("source_table"))
        .mirrorTableName(rs.getString("mirror_table_name"))
        .columnSchema(rs.getString("column_schema"))
        .primaryKeyColumns(rs.getString("primary_key_columns"))
        .indexDefinitions(rs.getString("index_definitions"))
        .syncStatus(rs.getString("sync_status"))
        .lastFullSyncAt(rs.getTimestamp("last_full_sync_at"))
        .lastIncrementalAt(rs.getTimestamp("last_incremental_at"))
        .rowCount(rs.getLong("row_count"))
        .createdAt(rs.getTimestamp("created_at"))
        .updatedAt(rs.getTimestamp("updated_at"))
        .build();
  }

  /**
   * 创建镜像表记录
   */
  public MirrorTable create(@Nonnull MirrorTable mirrorTable) {
    String sql =
        "INSERT INTO "
            + TABLE_NAME
            + " (connection_id, dataset_urn, source_database, source_schema, source_table, "
            + "mirror_table_name, column_schema, primary_key_columns, index_definitions, sync_status) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    KeyHolder keyHolder = new GeneratedKeyHolder();

    jdbcTemplate.update(
        conn -> {
          var ps = conn.prepareStatement(sql, new String[] {"id"});
          ps.setLong(1, mirrorTable.getConnectionId());
          ps.setString(2, mirrorTable.getDatasetUrn());
          ps.setString(3, mirrorTable.getSourceDatabase());
          ps.setString(4, mirrorTable.getSourceSchema());
          ps.setString(5, mirrorTable.getSourceTable());
          ps.setString(6, mirrorTable.getMirrorTableName());
          ps.setString(7, mirrorTable.getColumnSchema());
          ps.setString(8, mirrorTable.getPrimaryKeyColumns());
          ps.setString(9, mirrorTable.getIndexDefinitions());
          ps.setString(
              10,
              mirrorTable.getSyncStatus() != null
                  ? mirrorTable.getSyncStatus()
                  : MirrorTable.SyncStatus.PENDING.name());
          return ps;
        },
        keyHolder);

    Long id = keyHolder.getKey().longValue();
    mirrorTable.setId(id);
    log.info(
        "Created mirror table record: id={}, mirrorTableName={}",
        id,
        mirrorTable.getMirrorTableName());
    return mirrorTable;
  }

  /**
   * 根据 ID 查找
   */
  public Optional<MirrorTable> findById(@Nonnull Long id) {
    String sql = "SELECT * FROM " + TABLE_NAME + " WHERE id = ?";
    List<MirrorTable> results = jdbcTemplate.query(sql, ROW_MAPPER, id);
    return results.isEmpty() ? Optional.empty() : Optional.of(results.get(0));
  }

  /**
   * 根据镜像表名查找
   */
  public Optional<MirrorTable> findByMirrorTableName(@Nonnull String mirrorTableName) {
    String sql = "SELECT * FROM " + TABLE_NAME + " WHERE mirror_table_name = ?";
    List<MirrorTable> results = jdbcTemplate.query(sql, ROW_MAPPER, mirrorTableName);
    return results.isEmpty() ? Optional.empty() : Optional.of(results.get(0));
  }

  /**
   * 根据连接 ID 查找所有镜像表
   */
  public List<MirrorTable> findByConnectionId(@Nonnull Long connectionId) {
    String sql = "SELECT * FROM " + TABLE_NAME + " WHERE connection_id = ? ORDER BY source_table";
    return jdbcTemplate.query(sql, ROW_MAPPER, connectionId);
  }

  /**
   * 根据源表查找
   */
  public Optional<MirrorTable> findBySourceTable(
      @Nonnull Long connectionId,
      @Nonnull String sourceDatabase,
      String sourceSchema,
      @Nonnull String sourceTable) {
    String sql =
        "SELECT * FROM "
            + TABLE_NAME
            + " WHERE connection_id = ? AND source_database = ? "
            + "AND (source_schema = ? OR (source_schema IS NULL AND ? IS NULL)) "
            + "AND source_table = ?";
    List<MirrorTable> results =
        jdbcTemplate.query(sql, ROW_MAPPER, connectionId, sourceDatabase, sourceSchema, sourceSchema, sourceTable);
    return results.isEmpty() ? Optional.empty() : Optional.of(results.get(0));
  }

  /**
   * 更新同步状态
   */
  public void updateSyncStatus(@Nonnull Long id, @Nonnull String status) {
    String sql = "UPDATE " + TABLE_NAME + " SET sync_status = ? WHERE id = ?";
    jdbcTemplate.update(sql, status, id);
  }

  /**
   * 更新全量同步完成时间和行数
   */
  public void updateFullSyncComplete(@Nonnull Long id, @Nonnull Long rowCount) {
    String sql =
        "UPDATE "
            + TABLE_NAME
            + " SET sync_status = ?, last_full_sync_at = ?, row_count = ? "
            + "WHERE id = ?";
    jdbcTemplate.update(
        sql,
        MirrorTable.SyncStatus.SYNCED.name(),
        new Timestamp(System.currentTimeMillis()),
        rowCount,
        id);
  }

  /**
   * 更新增量同步时间
   */
  public void updateIncrementalSync(@Nonnull Long id) {
    String sql = "UPDATE " + TABLE_NAME + " SET last_incremental_at = ? WHERE id = ?";
    jdbcTemplate.update(sql, new Timestamp(System.currentTimeMillis()), id);
  }

  /**
   * 更新 Dataset URN
   */
  public void updateDatasetUrn(@Nonnull Long id, @Nonnull String datasetUrn) {
    String sql = "UPDATE " + TABLE_NAME + " SET dataset_urn = ? WHERE id = ?";
    jdbcTemplate.update(sql, datasetUrn, id);
  }

  /**
   * 更新列结构信息
   *
   * <p>用于在重新导入时更新表结构发生变化的情况
   */
  public void updateColumnSchema(
      @Nonnull Long id, @Nonnull String columnSchema, @Nonnull String primaryKeyColumns) {
    String sql =
        "UPDATE " + TABLE_NAME + " SET column_schema = ?, primary_key_columns = ?, updated_at = ? WHERE id = ?";
    jdbcTemplate.update(sql, columnSchema, primaryKeyColumns, new Timestamp(System.currentTimeMillis()), id);
    log.debug("Updated column schema for mirror table: id={}", id);
  }

  /**
   * 删除镜像表记录
   */
  public void delete(@Nonnull Long id) {
    String sql = "DELETE FROM " + TABLE_NAME + " WHERE id = ?";
    jdbcTemplate.update(sql, id);
    log.info("Deleted mirror table record: id={}", id);
  }

  /**
   * 删除连接下的所有镜像表记录
   */
  public void deleteByConnectionId(@Nonnull Long connectionId) {
    String sql = "DELETE FROM " + TABLE_NAME + " WHERE connection_id = ?";
    int deleted = jdbcTemplate.update(sql, connectionId);
    log.info("Deleted {} mirror table records for connection: {}", deleted, connectionId);
  }
}
