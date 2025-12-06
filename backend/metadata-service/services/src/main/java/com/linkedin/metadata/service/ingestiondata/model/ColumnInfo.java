package com.linkedin.metadata.service.ingestiondata.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 列信息模型
 *
 * <p>用于存储和传输表列的元数据信息
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnInfo {

  /** 列名 */
  private String name;

  /** 列数据类型（原始类型，如 VARCHAR(255)） */
  private String dataType;

  /** 列长度（如 VARCHAR 的长度） */
  private Integer length;

  /** 精度（用于 DECIMAL 类型） */
  private Integer precision;

  /** 小数位数（用于 DECIMAL 类型） */
  private Integer scale;

  /** 是否可为 NULL */
  private Boolean nullable;

  /** 是否为主键 */
  private Boolean primaryKey;

  /** 默认值 */
  private String defaultValue;

  /** 列注释 */
  private String comment;

  /** 列位置（顺序） */
  private Integer ordinalPosition;

  /** 是否自增 */
  private Boolean autoIncrement;

  /**
   * 生成 MySQL 列定义 DDL
   *
   * @return 列定义字符串
   */
  public String toMySqlColumnDefinition() {
    StringBuilder sb = new StringBuilder();
    sb.append("`").append(name).append("` ").append(dataType);

    if (Boolean.FALSE.equals(nullable)) {
      sb.append(" NOT NULL");
    }

    if (defaultValue != null && !defaultValue.isEmpty()) {
      sb.append(" DEFAULT ").append(formatDefaultValue(defaultValue));
    }

    if (Boolean.TRUE.equals(autoIncrement)) {
      sb.append(" AUTO_INCREMENT");
    }

    if (comment != null && !comment.isEmpty()) {
      sb.append(" COMMENT '").append(comment.replace("'", "''")).append("'");
    }

    return sb.toString();
  }

  /**
   * 格式化默认值，为字符串类型添加引号
   */
  private String formatDefaultValue(String value) {
    if (value == null || value.isEmpty()) {
      return value;
    }

    String upperValue = value.toUpperCase();

    // 不需要引号的情况：NULL, 数字, 函数调用, 已有引号
    if (upperValue.equals("NULL")
        || upperValue.equals("CURRENT_TIMESTAMP")
        || upperValue.startsWith("CURRENT_")
        || upperValue.startsWith("NOW(")
        || upperValue.startsWith("'")
        || upperValue.matches("^-?\\d+(\\.\\d+)?$")) {
      return value;
    }

    // 其他情况需要加引号（如 ENUM 值 ACTIVE、字符串等）
    return "'" + value.replace("'", "''") + "'";
  }
}
