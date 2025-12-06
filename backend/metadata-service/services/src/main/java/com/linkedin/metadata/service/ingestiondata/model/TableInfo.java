package com.linkedin.metadata.service.ingestiondata.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 表信息模型
 *
 * <p>用于存储和传输外部数据库表的元数据信息
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TableInfo {

  /** 表名 */
  private String tableName;

  /** Schema 名（PostgreSQL/Oracle） */
  private String schemaName;

  /** 数据库名 */
  private String databaseName;

  /** 表类型: TABLE, VIEW */
  private String tableType;

  /** 表注释 */
  private String comment;

  /** 列信息列表 */
  private List<ColumnInfo> columns;

  /** 主键列名列表 */
  private List<String> primaryKeys;

  /** 预估行数 */
  private Long estimatedRowCount;

  /** 数据大小（字节） */
  private Long dataSizeBytes;

  /** 表引擎（如 InnoDB） */
  private String engine;

  /** 字符集 */
  private String charset;

  /** 排序规则 */
  private String collation;
}
