package com.linkedin.metadata.service.ingestiondata.model;

import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 镜像表注册实体
 *
 * <p>记录所有动态创建的镜像表元信息。表命名规范: conn_{connection_id}_{database}_{table}
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MirrorTable {

  private Long id;

  /** 关联的 data_connection.id */
  private Long connectionId;

  /** 关联的元数据库 Dataset URN */
  private String datasetUrn;

  /** 源数据库名 */
  private String sourceDatabase;

  /** 源 Schema（PostgreSQL/Oracle） */
  private String sourceSchema;

  /** 源表名 */
  private String sourceTable;

  /** 镜像表名，格式: conn_{id}_{db}_{table} */
  private String mirrorTableName;

  /** 列定义 JSON */
  private String columnSchema;

  /** 主键列名 JSON 数组 */
  private String primaryKeyColumns;

  /** 索引定义 JSON */
  private String indexDefinitions;

  /** 同步状态: PENDING, SYNCING, SYNCED, ERROR */
  private String syncStatus;

  /** 最后全量同步时间 */
  private Timestamp lastFullSyncAt;

  /** 最后增量同步时间 */
  private Timestamp lastIncrementalAt;

  /** 当前行数（估算） */
  private Long rowCount;

  /** 创建时间 */
  private Timestamp createdAt;

  /** 更新时间 */
  private Timestamp updatedAt;

  /** 同步状态枚举 */
  public enum SyncStatus {
    PENDING,
    SYNCING,
    SYNCED,
    ERROR
  }

  /**
   * 生成镜像表名
   *
   * @param connectionId 连接ID
   * @param database 数据库名
   * @param table 表名
   * @return 镜像表名
   */
  public static String generateMirrorTableName(Long connectionId, String database, String table) {
    // 移除特殊字符，只保留字母、数字和下划线
    String safeDatabase = database.replaceAll("[^a-zA-Z0-9_]", "_").toLowerCase();
    String safeTable = table.replaceAll("[^a-zA-Z0-9_]", "_").toLowerCase();
    return String.format("conn_%d_%s_%s", connectionId, safeDatabase, safeTable);
  }
}
