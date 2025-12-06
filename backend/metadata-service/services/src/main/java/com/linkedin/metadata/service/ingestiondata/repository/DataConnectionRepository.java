package com.linkedin.metadata.service.ingestiondata.repository;

import com.linkedin.metadata.service.ingestiondata.model.DataConnection;
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
 * 数据连接配置 Repository
 *
 * <p>用于操作 master_data.data_connection 表
 */
@Slf4j
@Repository
public class DataConnectionRepository {

  private final JdbcTemplate jdbcTemplate;

  private static final String TABLE_NAME = "data_connection";

  private static final RowMapper<DataConnection> ROW_MAPPER =
      (rs, rowNum) -> mapRow(rs);

  public DataConnectionRepository(
      @Qualifier("masterDataJdbcTemplate") JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  private static DataConnection mapRow(ResultSet rs) throws SQLException {
    return DataConnection.builder()
        .id(rs.getLong("id"))
        .ingestionSourceUrn(rs.getString("ingestion_source_urn"))
        .connectionName(rs.getString("connection_name"))
        .connectionType(rs.getString("connection_type"))
        .host(rs.getString("host"))
        .port(rs.getInt("port"))
        .databaseName(rs.getString("database_name"))
        .username(rs.getString("username"))
        .passwordEncrypted(rs.getString("password_encrypted"))
        .useSsl(rs.getBoolean("use_ssl"))
        .sslMode(rs.getString("ssl_mode"))
        .maxPoolSize(rs.getInt("max_pool_size"))
        .minIdleConnections(rs.getInt("min_idle_connections"))
        .connectionTimeoutMs(rs.getInt("connection_timeout_ms"))
        .tableFilterConfig(rs.getString("table_filter_config"))
        .schemaFilterConfig(rs.getString("schema_filter_config"))
        .status(rs.getString("status"))
        .lastTestAt(rs.getTimestamp("last_test_at"))
        .lastTestResult(rs.getString("last_test_result"))
        .lastTestMessage(rs.getString("last_test_message"))
        .createdAt(rs.getTimestamp("created_at"))
        .createdBy(rs.getString("created_by"))
        .updatedAt(rs.getTimestamp("updated_at"))
        .updatedBy(rs.getString("updated_by"))
        .build();
  }

  /**
   * 创建数据连接
   */
  public DataConnection create(@Nonnull DataConnection connection) {
    String sql =
        "INSERT INTO "
            + TABLE_NAME
            + " (ingestion_source_urn, connection_name, connection_type, host, port, "
            + "database_name, username, password_encrypted, use_ssl, ssl_mode, "
            + "max_pool_size, min_idle_connections, connection_timeout_ms, "
            + "table_filter_config, schema_filter_config, status, created_by) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    KeyHolder keyHolder = new GeneratedKeyHolder();

    jdbcTemplate.update(
        conn -> {
          var ps = conn.prepareStatement(sql, new String[] {"id"});
          ps.setString(1, connection.getIngestionSourceUrn());
          ps.setString(2, connection.getConnectionName());
          ps.setString(3, connection.getConnectionType());
          ps.setString(4, connection.getHost());
          ps.setInt(5, connection.getPort());
          ps.setString(6, connection.getDatabaseName());
          ps.setString(7, connection.getUsername());
          ps.setString(8, connection.getPasswordEncrypted());
          ps.setBoolean(9, connection.getUseSsl() != null && connection.getUseSsl());
          ps.setString(10, connection.getSslMode());
          ps.setInt(11, connection.getMaxPoolSize() != null ? connection.getMaxPoolSize() : 10);
          ps.setInt(
              12, connection.getMinIdleConnections() != null ? connection.getMinIdleConnections() : 2);
          ps.setInt(
              13,
              connection.getConnectionTimeoutMs() != null ? connection.getConnectionTimeoutMs() : 30000);
          ps.setString(14, connection.getTableFilterConfig());
          ps.setString(15, connection.getSchemaFilterConfig());
          ps.setString(
              16, connection.getStatus() != null ? connection.getStatus() : DataConnection.Status.ACTIVE.name());
          ps.setString(17, connection.getCreatedBy());
          return ps;
        },
        keyHolder);

    Long id = keyHolder.getKey().longValue();
    connection.setId(id);
    log.info("Created data connection: id={}, name={}", id, connection.getConnectionName());
    return connection;
  }

  /**
   * 根据 ID 查找
   */
  public Optional<DataConnection> findById(@Nonnull Long id) {
    String sql = "SELECT * FROM " + TABLE_NAME + " WHERE id = ?";
    List<DataConnection> results = jdbcTemplate.query(sql, ROW_MAPPER, id);
    return results.isEmpty() ? Optional.empty() : Optional.of(results.get(0));
  }

  /**
   * 根据 IngestionSource URN 查找
   */
  public Optional<DataConnection> findByIngestionSourceUrn(@Nonnull String urn) {
    String sql = "SELECT * FROM " + TABLE_NAME + " WHERE ingestion_source_urn = ?";
    List<DataConnection> results = jdbcTemplate.query(sql, ROW_MAPPER, urn);
    return results.isEmpty() ? Optional.empty() : Optional.of(results.get(0));
  }

  /**
   * 查找所有活跃连接
   */
  public List<DataConnection> findAllActive() {
    String sql = "SELECT * FROM " + TABLE_NAME + " WHERE status = 'ACTIVE' ORDER BY created_at DESC";
    return jdbcTemplate.query(sql, ROW_MAPPER);
  }

  /**
   * 查找所有连接
   */
  public List<DataConnection> findAll() {
    String sql = "SELECT * FROM " + TABLE_NAME + " ORDER BY created_at DESC";
    return jdbcTemplate.query(sql, ROW_MAPPER);
  }

  /**
   * 更新连接测试结果
   */
  public void updateTestResult(
      @Nonnull Long id,
      @Nonnull String result,
      String message) {
    String sql =
        "UPDATE "
            + TABLE_NAME
            + " SET last_test_at = ?, last_test_result = ?, last_test_message = ? "
            + "WHERE id = ?";
    jdbcTemplate.update(sql, new Timestamp(System.currentTimeMillis()), result, message, id);
  }

  /**
   * 更新状态
   */
  public void updateStatus(@Nonnull Long id, @Nonnull String status) {
    String sql = "UPDATE " + TABLE_NAME + " SET status = ? WHERE id = ?";
    jdbcTemplate.update(sql, status, id);
  }

  /**
   * 删除连接
   */
  public void delete(@Nonnull Long id) {
    String sql = "DELETE FROM " + TABLE_NAME + " WHERE id = ?";
    jdbcTemplate.update(sql, id);
    log.info("Deleted data connection: id={}", id);
  }

  /**
   * 软删除连接
   */
  public void softDelete(@Nonnull Long id) {
    updateStatus(id, DataConnection.Status.DELETED.name());
    log.info("Soft deleted data connection: id={}", id);
  }
}
