package com.linkedin.metadata.service.ingestiondata;

import com.linkedin.common.AuditStamp;
import com.linkedin.common.urn.DataPlatformUrn;
import com.linkedin.common.urn.DatasetUrn;
import com.linkedin.common.urn.Urn;
import com.linkedin.data.template.StringMap;
import com.linkedin.dataset.DatasetProperties;
import com.linkedin.entity.client.SystemEntityClient;
import com.linkedin.metadata.Constants;
import com.linkedin.metadata.service.ingestiondata.model.ColumnInfo;
import com.linkedin.metadata.service.ingestiondata.model.MirrorTable;
import com.linkedin.metadata.service.ingestiondata.model.TableInfo;
import com.linkedin.events.metadata.ChangeType;
import com.linkedin.mxe.MetadataChangeProposal;
import com.linkedin.schema.BooleanType;
import com.linkedin.schema.BytesType;
import com.linkedin.schema.DateType;
import com.linkedin.schema.MySqlDDL;
import com.linkedin.schema.NumberType;
import com.linkedin.schema.SchemaField;
import com.linkedin.schema.SchemaFieldArray;
import com.linkedin.schema.SchemaFieldDataType;
import com.linkedin.schema.SchemaMetadata;
import com.linkedin.schema.StringType;
import com.linkedin.schema.TimeType;
import io.datahubproject.metadata.context.OperationContext;
import java.net.URISyntaxException;
import java.util.List;
import javax.annotation.Nonnull;
import lombok.extern.slf4j.Slf4j;

/**
 * 数据集元数据发布服务
 *
 * <p>负责在导入主数据后，将表结构信息发布到 DataHub 元数据库
 */
@Slf4j
public class DatasetMetadataPublisher {

  private static final String MASTER_DATA_PLATFORM = "mysql";
  private static final String MASTER_DATA_DATABASE = "master_data";
  private static final String FABRIC_TYPE = "PROD";
  private static final String SYSTEM_ACTOR = "urn:li:corpuser:__datahub_system";

  private final SystemEntityClient entityClient;

  public DatasetMetadataPublisher(@Nonnull SystemEntityClient entityClient) {
    this.entityClient = entityClient;
  }

  /**
   * 发布镜像表的元数据到 DataHub
   */
  public void publishDatasetMetadata(
      @Nonnull OperationContext opContext,
      @Nonnull MirrorTable mirrorTable,
      @Nonnull TableInfo tableInfo) {

    try {
      String tableName = mirrorTable.getMirrorTableName();
      log.info("Publishing dataset metadata for table: {}", tableName);

      // 创建 Dataset URN
      DatasetUrn datasetUrn = createDatasetUrn(tableName);

      // 创建 AuditStamp
      AuditStamp auditStamp = createAuditStamp();

      // 发布 DatasetProperties
      publishDatasetProperties(opContext, datasetUrn, mirrorTable, tableInfo, auditStamp);

      // 发布 SchemaMetadata
      publishSchemaMetadata(opContext, datasetUrn, tableInfo, auditStamp);

      log.info("Successfully published dataset metadata for: {}", datasetUrn);

    } catch (Exception e) {
      log.error("Failed to publish dataset metadata for table: {}", mirrorTable.getMirrorTableName(), e);
      throw new RuntimeException("Failed to publish dataset metadata", e);
    }
  }

  /**
   * 创建 Dataset URN
   */
  private DatasetUrn createDatasetUrn(String tableName) throws URISyntaxException {
    String datasetName = MASTER_DATA_DATABASE + "." + tableName;
    return new DatasetUrn(
        new DataPlatformUrn(MASTER_DATA_PLATFORM),
        datasetName,
        com.linkedin.common.FabricType.valueOf(FABRIC_TYPE));
  }

  /**
   * 创建审计戳
   */
  private AuditStamp createAuditStamp() throws URISyntaxException {
    return new AuditStamp()
        .setTime(System.currentTimeMillis())
        .setActor(Urn.createFromString(SYSTEM_ACTOR));
  }

  /**
   * 发布 DatasetProperties
   */
  private void publishDatasetProperties(
      OperationContext opContext,
      DatasetUrn datasetUrn,
      MirrorTable mirrorTable,
      TableInfo tableInfo,
      AuditStamp auditStamp) throws Exception {

    DatasetProperties properties = new DatasetProperties();
    properties.setName(mirrorTable.getMirrorTableName());

    // 设置描述
    String description = buildDescription(mirrorTable, tableInfo);
    properties.setDescription(description);

    // 设置自定义属性
    StringMap customProperties = new StringMap();
    customProperties.put("sourceTable", mirrorTable.getSourceTable());
    customProperties.put("sourceDatabase", mirrorTable.getSourceDatabase());
    customProperties.put("connectionId", String.valueOf(mirrorTable.getConnectionId()));
    customProperties.put("importTime", mirrorTable.getLastFullSyncAt() != null ?
        mirrorTable.getLastFullSyncAt().toString() : "");
    customProperties.put("rowCount", String.valueOf(mirrorTable.getRowCount()));
    customProperties.put("isMirrorTable", "true");
    properties.setCustomProperties(customProperties);

    // 创建 MCP 并发送
    MetadataChangeProposal mcp = new MetadataChangeProposal();
    mcp.setEntityUrn(datasetUrn);
    mcp.setEntityType(Constants.DATASET_ENTITY_NAME);
    mcp.setAspectName(Constants.DATASET_PROPERTIES_ASPECT_NAME);
    mcp.setAspect(com.linkedin.entity.Aspect.create(properties));
    mcp.setChangeType(ChangeType.UPSERT);

    entityClient.ingestProposal(opContext, mcp);
    log.debug("Published DatasetProperties for: {}", datasetUrn);
  }

  /**
   * 发布 SchemaMetadata
   */
  private void publishSchemaMetadata(
      OperationContext opContext,
      DatasetUrn datasetUrn,
      TableInfo tableInfo,
      AuditStamp auditStamp) throws Exception {

    SchemaMetadata schemaMetadata = new SchemaMetadata();
    schemaMetadata.setSchemaName(tableInfo.getTableName());
    schemaMetadata.setPlatform(new DataPlatformUrn(MASTER_DATA_PLATFORM));
    schemaMetadata.setVersion(0L);
    schemaMetadata.setHash("");
    schemaMetadata.setLastModified(auditStamp);

    // 设置平台 schema
    schemaMetadata.setPlatformSchema(
        SchemaMetadata.PlatformSchema.create(
            new MySqlDDL().setTableSchema(buildCreateTableDDL(tableInfo))));

    // 构建字段信息
    SchemaFieldArray fields = new SchemaFieldArray();
    for (ColumnInfo column : tableInfo.getColumns()) {
      SchemaField field = createSchemaField(column, auditStamp);
      fields.add(field);
    }
    schemaMetadata.setFields(fields);

    // 创建 MCP 并发送
    MetadataChangeProposal mcp = new MetadataChangeProposal();
    mcp.setEntityUrn(datasetUrn);
    mcp.setEntityType(Constants.DATASET_ENTITY_NAME);
    mcp.setAspectName(Constants.SCHEMA_METADATA_ASPECT_NAME);
    mcp.setAspect(com.linkedin.entity.Aspect.create(schemaMetadata));
    mcp.setChangeType(ChangeType.UPSERT);

    entityClient.ingestProposal(opContext, mcp);
    log.debug("Published SchemaMetadata for: {}", datasetUrn);
  }

  /**
   * 创建 SchemaField
   */
  private SchemaField createSchemaField(ColumnInfo column, AuditStamp auditStamp) {
    SchemaField field = new SchemaField();
    field.setFieldPath(column.getName());
    field.setNativeDataType(column.getDataType());
    field.setNullable(column.isNullable());
    field.setLastModified(auditStamp);

    if (column.getComment() != null && !column.getComment().isEmpty()) {
      field.setDescription(column.getComment());
    }

    // 设置数据类型
    SchemaFieldDataType dataType = new SchemaFieldDataType();
    dataType.setType(mapToSchemaFieldType(column.getDataType()));
    field.setType(dataType);

    return field;
  }

  /**
   * 将 SQL 数据类型映射到 SchemaFieldDataType
   */
  private SchemaFieldDataType.Type mapToSchemaFieldType(String sqlType) {
    String upperType = sqlType.toUpperCase();

    if (upperType.contains("INT") || upperType.contains("DECIMAL") ||
        upperType.contains("NUMERIC") || upperType.contains("FLOAT") ||
        upperType.contains("DOUBLE") || upperType.contains("REAL")) {
      return SchemaFieldDataType.Type.create(new NumberType());
    }

    if (upperType.contains("CHAR") || upperType.contains("TEXT") ||
        upperType.contains("ENUM") || upperType.contains("SET")) {
      return SchemaFieldDataType.Type.create(new StringType());
    }

    if (upperType.contains("BOOL") || upperType.contains("BIT")) {
      return SchemaFieldDataType.Type.create(new BooleanType());
    }

    if (upperType.contains("DATE") && !upperType.contains("TIME")) {
      return SchemaFieldDataType.Type.create(new DateType());
    }

    if (upperType.contains("TIME") || upperType.contains("TIMESTAMP")) {
      return SchemaFieldDataType.Type.create(new TimeType());
    }

    if (upperType.contains("BLOB") || upperType.contains("BINARY")) {
      return SchemaFieldDataType.Type.create(new BytesType());
    }

    // 默认返回 String 类型
    return SchemaFieldDataType.Type.create(new StringType());
  }

  /**
   * 构建描述信息
   */
  private String buildDescription(MirrorTable mirrorTable, TableInfo tableInfo) {
    StringBuilder sb = new StringBuilder();
    sb.append("Mirror table from external source.\n\n");
    sb.append("**Source Table:** ").append(mirrorTable.getSourceTable()).append("\n");
    sb.append("**Source Database:** ").append(mirrorTable.getSourceDatabase()).append("\n");

    if (tableInfo.getComment() != null && !tableInfo.getComment().isEmpty()) {
      sb.append("**Original Comment:** ").append(tableInfo.getComment()).append("\n");
    }

    return sb.toString();
  }

  /**
   * 构建 CREATE TABLE DDL
   */
  private String buildCreateTableDDL(TableInfo tableInfo) {
    StringBuilder ddl = new StringBuilder();
    ddl.append("CREATE TABLE `").append(tableInfo.getTableName()).append("` (\n");

    List<ColumnInfo> columns = tableInfo.getColumns();
    for (int i = 0; i < columns.size(); i++) {
      ColumnInfo col = columns.get(i);
      ddl.append("  `").append(col.getName()).append("` ").append(col.getDataType());

      if (!col.isNullable()) {
        ddl.append(" NOT NULL");
      }

      if (col.getDefaultValue() != null) {
        ddl.append(" DEFAULT '").append(col.getDefaultValue()).append("'");
      }

      if (col.getComment() != null && !col.getComment().isEmpty()) {
        ddl.append(" COMMENT '").append(col.getComment()).append("'");
      }

      if (i < columns.size() - 1) {
        ddl.append(",");
      }
      ddl.append("\n");
    }

    if (tableInfo.getPrimaryKeys() != null && !tableInfo.getPrimaryKeys().isEmpty()) {
      ddl.append("  PRIMARY KEY (");
      ddl.append(String.join(", ", tableInfo.getPrimaryKeys().stream()
          .map(pk -> "`" + pk + "`")
          .toArray(String[]::new)));
      ddl.append(")\n");
    }

    ddl.append(")");
    return ddl.toString();
  }

  /**
   * 获取 Dataset URN 字符串
   */
  public String getDatasetUrnString(String tableName) {
    return String.format("urn:li:dataset:(urn:li:dataPlatform:%s,%s.%s,%s)",
        MASTER_DATA_PLATFORM, MASTER_DATA_DATABASE, tableName, FABRIC_TYPE);
  }
}
