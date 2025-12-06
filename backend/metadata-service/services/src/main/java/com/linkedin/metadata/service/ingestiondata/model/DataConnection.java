package com.linkedin.metadata.service.ingestiondata.model;

import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 数据连接配置实体
 *
 * <p>存储外部数据库的连接配置信息，与前端 IngestionSource 通过 URN 关联
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataConnection {

  private Long id;

  /** 关联的 IngestionSource URN */
  private String ingestionSourceUrn;

  /** 连接名称 */
  private String connectionName;

  /** 连接类型: mysql, postgres, oracle, mongodb 等 */
  private String connectionType;

  /** 主机地址 */
  private String host;

  /** 端口号 */
  private Integer port;

  /** 数据库名 */
  private String databaseName;

  /** 用户名 */
  private String username;

  /** 加密后的密码 */
  private String passwordEncrypted;

  /** 是否使用 SSL */
  private Boolean useSsl;

  /** SSL 模式 */
  private String sslMode;

  /** 最大连接池大小 */
  private Integer maxPoolSize;

  /** 最小空闲连接数 */
  private Integer minIdleConnections;

  /** 连接超时（毫秒） */
  private Integer connectionTimeoutMs;

  /** 表过滤配置 JSON */
  private String tableFilterConfig;

  /** Schema 过滤配置 JSON */
  private String schemaFilterConfig;

  /** 状态: ACTIVE, INACTIVE, ERROR, DELETED */
  private String status;

  /** 最后测试时间 */
  private Timestamp lastTestAt;

  /** 最后测试结果 */
  private String lastTestResult;

  /** 最后测试消息 */
  private String lastTestMessage;

  /** 创建时间 */
  private Timestamp createdAt;

  /** 创建人 */
  private String createdBy;

  /** 更新时间 */
  private Timestamp updatedAt;

  /** 更新人 */
  private String updatedBy;

  /** 状态枚举 */
  public enum Status {
    ACTIVE,
    INACTIVE,
    ERROR,
    DELETED
  }

  /** 连接类型枚举 */
  public enum ConnectionType {
    MYSQL("mysql", "com.mysql.cj.jdbc.Driver", 3306),
    POSTGRES("postgres", "org.postgresql.Driver", 5432),
    ORACLE("oracle", "oracle.jdbc.OracleDriver", 1521),
    SQLSERVER("sqlserver", "com.microsoft.sqlserver.jdbc.SQLServerDriver", 1433),
    MONGODB("mongodb", "mongodb.jdbc.MongoDriver", 27017);

    private final String type;
    private final String driverClass;
    private final int defaultPort;

    ConnectionType(String type, String driverClass, int defaultPort) {
      this.type = type;
      this.driverClass = driverClass;
      this.defaultPort = defaultPort;
    }

    public String getType() {
      return type;
    }

    public String getDriverClass() {
      return driverClass;
    }

    public int getDefaultPort() {
      return defaultPort;
    }

    public static ConnectionType fromType(String type) {
      for (ConnectionType ct : values()) {
        if (ct.type.equalsIgnoreCase(type)) {
          return ct;
        }
      }
      throw new IllegalArgumentException("Unknown connection type: " + type);
    }
  }
}
