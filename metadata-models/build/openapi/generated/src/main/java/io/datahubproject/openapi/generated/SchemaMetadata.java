package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.ForeignKeyConstraint;
import io.datahubproject.openapi.generated.ForeignKeySpec;
import io.datahubproject.openapi.generated.SchemaField;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * SchemaMetadata to describe metadata related to store schema
 */
@Schema(description = "SchemaMetadata to describe metadata related to store schema")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SchemaMetadata  implements OneOfDatasetSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "SchemaMetadata") @Builder.Default
  private String __type = "SchemaMetadata";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"SchemaMetadata"},
  defaultValue = "SchemaMetadata")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("schemaName") @Builder.Default
  private String schemaName = null;

  @JsonProperty("platform") @Builder.Default
  private String platform = null;

  @JsonProperty("version") @Builder.Default
  private Long version = null;

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private AuditStamp lastModified = null;

  @JsonProperty("deleted") @Builder.Default
  private AuditStamp deleted = null;

  @JsonProperty("dataset") @Builder.Default
  private String dataset = null;

  @JsonProperty("cluster") @Builder.Default
  private String cluster = null;

  @JsonProperty("hash") @Builder.Default
  private String hash = null;

  @JsonProperty("platformSchema") @Builder.Default
  private OneOfSchemaMetadataPlatformSchema platformSchema = null;

  @JsonProperty("fields") @Builder.Default
  @Valid
  private List<SchemaField> fields = new ArrayList<>();

  @JsonProperty("primaryKeys") @Builder.Default
  @Valid
  private List<String> primaryKeys = null;

  @JsonProperty("foreignKeysSpecs") @Builder.Default
  @Valid
  private Map<String, ForeignKeySpec> foreignKeysSpecs = null;

  @JsonProperty("foreignKeys") @Builder.Default
  @Valid
  private List<ForeignKeyConstraint> foreignKeys = null;

  public SchemaMetadata schemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  /**
   * Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking
   * @return schemaName
   **/
  @Schema(required = true, description = "Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking")
      @NotNull

    public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }

  public SchemaMetadata platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})
   * @return platform
   **/
  @Schema(required = true, description = "Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})")
      @NotNull

    public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public SchemaMetadata version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return version
   **/
  @Schema(required = true, description = "Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public SchemaMetadata created(AuditStamp created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AuditStamp getCreated() {
    return created;
  }

  public void setCreated(AuditStamp created) {
    this.created = created;
  }

  public SchemaMetadata lastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AuditStamp getLastModified() {
    return lastModified;
  }

  public void setLastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
  }

  public SchemaMetadata deleted(AuditStamp deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Get deleted
   * @return deleted
   **/
  @Schema(description = "")
  
    @Valid
    public AuditStamp getDeleted() {
    return deleted;
  }

  public void setDeleted(AuditStamp deleted) {
    this.deleted = deleted;
  }

  public SchemaMetadata dataset(String dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * Dataset this schema metadata is associated with.
   * @return dataset
   **/
  @Schema(description = "Dataset this schema metadata is associated with.")
  
    public String getDataset() {
    return dataset;
  }

  public void setDataset(String dataset) {
    this.dataset = dataset;
  }

  public SchemaMetadata cluster(String cluster) {
    this.cluster = cluster;
    return this;
  }

  /**
   * The cluster this schema metadata resides from
   * @return cluster
   **/
  @Schema(description = "The cluster this schema metadata resides from")
  
    public String getCluster() {
    return cluster;
  }

  public void setCluster(String cluster) {
    this.cluster = cluster;
  }

  public SchemaMetadata hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * the SHA1 hash of the schema content
   * @return hash
   **/
  @Schema(required = true, description = "the SHA1 hash of the schema content")
      @NotNull

    public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public SchemaMetadata platformSchema(OneOfSchemaMetadataPlatformSchema platformSchema) {
    this.platformSchema = platformSchema;
    return this;
  }

  /**
   * The native schema in the dataset's platform.
   * @return platformSchema
   **/
  @Schema(required = true, description = "The native schema in the dataset's platform.")
      @NotNull

    public OneOfSchemaMetadataPlatformSchema getPlatformSchema() {
    return platformSchema;
  }

  public void setPlatformSchema(OneOfSchemaMetadataPlatformSchema platformSchema) {
    this.platformSchema = platformSchema;
  }

  public SchemaMetadata fields(List<SchemaField> fields) {
    this.fields = fields;
    return this;
  }

  public SchemaMetadata addFieldsItem(SchemaField fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Client provided a list of fields from document schema.
   * @return fields
   **/
  @Schema(required = true, description = "Client provided a list of fields from document schema.")
      @NotNull
    @Valid
    public List<SchemaField> getFields() {
    return fields;
  }

  public void setFields(List<SchemaField> fields) {
    this.fields = fields;
  }

  public SchemaMetadata primaryKeys(List<String> primaryKeys) {
    this.primaryKeys = primaryKeys;
    return this;
  }

  public SchemaMetadata addPrimaryKeysItem(String primaryKeysItem) {
    if (this.primaryKeys == null) {
      this.primaryKeys = new ArrayList<>();
    }
    this.primaryKeys.add(primaryKeysItem);
    return this;
  }

  /**
   * Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.
   * @return primaryKeys
   **/
  @Schema(description = "Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.")
  
    public List<String> getPrimaryKeys() {
    return primaryKeys;
  }

  public void setPrimaryKeys(List<String> primaryKeys) {
    this.primaryKeys = primaryKeys;
  }

  public SchemaMetadata foreignKeysSpecs(Map<String, ForeignKeySpec> foreignKeysSpecs) {
    this.foreignKeysSpecs = foreignKeysSpecs;
    return this;
  }

  public SchemaMetadata putForeignKeysSpecsItem(String key, ForeignKeySpec foreignKeysSpecsItem) {
    if (this.foreignKeysSpecs == null) {
      this.foreignKeysSpecs = new HashMap<>();
    }
    this.foreignKeysSpecs.put(key, foreignKeysSpecsItem);
    return this;
  }

  /**
   * Map captures all the references schema makes to external datasets. Map key is ForeignKeySpecName typeref.
   * @return foreignKeysSpecs
   **/
  @Schema(description = "Map captures all the references schema makes to external datasets. Map key is ForeignKeySpecName typeref.")
      @Valid
    public Map<String, ForeignKeySpec> getForeignKeysSpecs() {
    return foreignKeysSpecs;
  }

  public void setForeignKeysSpecs(Map<String, ForeignKeySpec> foreignKeysSpecs) {
    this.foreignKeysSpecs = foreignKeysSpecs;
  }

  public SchemaMetadata foreignKeys(List<ForeignKeyConstraint> foreignKeys) {
    this.foreignKeys = foreignKeys;
    return this;
  }

  public SchemaMetadata addForeignKeysItem(ForeignKeyConstraint foreignKeysItem) {
    if (this.foreignKeys == null) {
      this.foreignKeys = new ArrayList<>();
    }
    this.foreignKeys.add(foreignKeysItem);
    return this;
  }

  /**
   * List of foreign key constraints for the schema
   * @return foreignKeys
   **/
  @Schema(description = "List of foreign key constraints for the schema")
      @Valid
    public List<ForeignKeyConstraint> getForeignKeys() {
    return foreignKeys;
  }

  public void setForeignKeys(List<ForeignKeyConstraint> foreignKeys) {
    this.foreignKeys = foreignKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaMetadata schemaMetadata = (SchemaMetadata) o;
    return Objects.equals(this.schemaName, schemaMetadata.schemaName) &&
        Objects.equals(this.platform, schemaMetadata.platform) &&
        Objects.equals(this.version, schemaMetadata.version) &&
        Objects.equals(this.created, schemaMetadata.created) &&
        Objects.equals(this.lastModified, schemaMetadata.lastModified) &&
        Objects.equals(this.deleted, schemaMetadata.deleted) &&
        Objects.equals(this.dataset, schemaMetadata.dataset) &&
        Objects.equals(this.cluster, schemaMetadata.cluster) &&
        Objects.equals(this.hash, schemaMetadata.hash) &&
        Objects.equals(this.platformSchema, schemaMetadata.platformSchema) &&
        Objects.equals(this.fields, schemaMetadata.fields) &&
        Objects.equals(this.primaryKeys, schemaMetadata.primaryKeys) &&
        Objects.equals(this.foreignKeysSpecs, schemaMetadata.foreignKeysSpecs) &&
        Objects.equals(this.foreignKeys, schemaMetadata.foreignKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaName, platform, version, created, lastModified, deleted, dataset, cluster, hash, platformSchema, fields, primaryKeys, foreignKeysSpecs, foreignKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaMetadata {\n");
    
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    platformSchema: ").append(toIndentedString(platformSchema)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    primaryKeys: ").append(toIndentedString(primaryKeys)).append("\n");
    sb.append("    foreignKeysSpecs: ").append(toIndentedString(foreignKeysSpecs)).append("\n");
    sb.append("    foreignKeys: ").append(toIndentedString(foreignKeys)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}