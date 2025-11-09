package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.GlobalTags;
import io.datahubproject.openapi.generated.GlossaryTerms;
import io.datahubproject.openapi.generated.SchemaFieldDataType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * SchemaField to describe metadata related to dataset schema.
 */
@Schema(description = "SchemaField to describe metadata related to dataset schema.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SchemaField   {

  @JsonProperty("fieldPath") @Builder.Default
  private String fieldPath = null;

  @JsonProperty("jsonPath") @Builder.Default
  private String jsonPath = null;

  @JsonProperty("nullable") @Builder.Default
  private Boolean nullable = false;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("label") @Builder.Default
  private String label = null;

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private AuditStamp lastModified = null;

  @JsonProperty("type") @Builder.Default
  private SchemaFieldDataType type = null;

  @JsonProperty("nativeDataType") @Builder.Default
  private String nativeDataType = null;

  @JsonProperty("recursive") @Builder.Default
  private Boolean recursive = false;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTags globalTags = null;

  @JsonProperty("glossaryTerms") @Builder.Default
  private GlossaryTerms glossaryTerms = null;

  @JsonProperty("isPartOfKey") @Builder.Default
  private Boolean isPartOfKey = false;

  @JsonProperty("isPartitioningKey") @Builder.Default
  private Boolean isPartitioningKey = null;

  @JsonProperty("jsonProps") @Builder.Default
  private String jsonProps = null;

  public SchemaField fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  /**
   * Flattened name of the field. Field is computed from jsonPath field.
   * @return fieldPath
   **/
  @Schema(required = true, description = "Flattened name of the field. Field is computed from jsonPath field.")
      @NotNull

    public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public SchemaField jsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
    return this;
  }

  /**
   * Flattened name of a field in JSON Path notation.
   * @return jsonPath
   **/
  @Schema(description = "Flattened name of a field in JSON Path notation.")
  
    public String getJsonPath() {
    return jsonPath;
  }

  public void setJsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
  }

  public SchemaField nullable(Boolean nullable) {
    this.nullable = nullable;
    return this;
  }

  /**
   * Indicates if this field is optional or nullable
   * @return nullable
   **/
  @Schema(required = true, description = "Indicates if this field is optional or nullable")
      @NotNull

    public Boolean isNullable() {
    return nullable;
  }

  public void setNullable(Boolean nullable) {
    this.nullable = nullable;
  }

  public SchemaField description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description
   * @return description
   **/
  @Schema(description = "Description")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SchemaField label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Label of the field. Provides a more human-readable name for the field than field path. Some sources will provide this metadata but not all sources have the concept of a label. If just one string is associated with a field in a source, that is most likely a description.  Note that this field is deprecated and is not surfaced in the UI.
   * @return label
   **/
  @Schema(description = "Label of the field. Provides a more human-readable name for the field than field path. Some sources will provide this metadata but not all sources have the concept of a label. If just one string is associated with a field in a source, that is most likely a description.  Note that this field is deprecated and is not surfaced in the UI.")
  
    public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public SchemaField created(AuditStamp created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @Schema(description = "")
  
    @Valid
    public AuditStamp getCreated() {
    return created;
  }

  public void setCreated(AuditStamp created) {
    this.created = created;
  }

  public SchemaField lastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   **/
  @Schema(description = "")
  
    @Valid
    public AuditStamp getLastModified() {
    return lastModified;
  }

  public void setLastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
  }

  public SchemaField type(SchemaFieldDataType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SchemaFieldDataType getType() {
    return type;
  }

  public void setType(SchemaFieldDataType type) {
    this.type = type;
  }

  public SchemaField nativeDataType(String nativeDataType) {
    this.nativeDataType = nativeDataType;
    return this;
  }

  /**
   * The native type of the field in the dataset's platform as declared by platform schema.
   * @return nativeDataType
   **/
  @Schema(required = true, description = "The native type of the field in the dataset's platform as declared by platform schema.")
      @NotNull

    public String getNativeDataType() {
    return nativeDataType;
  }

  public void setNativeDataType(String nativeDataType) {
    this.nativeDataType = nativeDataType;
  }

  public SchemaField recursive(Boolean recursive) {
    this.recursive = recursive;
    return this;
  }

  /**
   * There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.
   * @return recursive
   **/
  @Schema(required = true, description = "There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.")
      @NotNull

    public Boolean isRecursive() {
    return recursive;
  }

  public void setRecursive(Boolean recursive) {
    this.recursive = recursive;
  }

  public SchemaField globalTags(GlobalTags globalTags) {
    this.globalTags = globalTags;
    return this;
  }

  /**
   * Get globalTags
   * @return globalTags
   **/
  @Schema(description = "")
  
    @Valid
    public GlobalTags getGlobalTags() {
    return globalTags;
  }

  public void setGlobalTags(GlobalTags globalTags) {
    this.globalTags = globalTags;
  }

  public SchemaField glossaryTerms(GlossaryTerms glossaryTerms) {
    this.glossaryTerms = glossaryTerms;
    return this;
  }

  /**
   * Get glossaryTerms
   * @return glossaryTerms
   **/
  @Schema(description = "")
  
    @Valid
    public GlossaryTerms getGlossaryTerms() {
    return glossaryTerms;
  }

  public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
    this.glossaryTerms = glossaryTerms;
  }

  public SchemaField isPartOfKey(Boolean isPartOfKey) {
    this.isPartOfKey = isPartOfKey;
    return this;
  }

  /**
   * For schema fields that are part of complex keys, set this field to true We do this to easily distinguish between value and key fields
   * @return isPartOfKey
   **/
  @Schema(required = true, description = "For schema fields that are part of complex keys, set this field to true We do this to easily distinguish between value and key fields")
      @NotNull

    public Boolean isIsPartOfKey() {
    return isPartOfKey;
  }

  public void setIsPartOfKey(Boolean isPartOfKey) {
    this.isPartOfKey = isPartOfKey;
  }

  public SchemaField isPartitioningKey(Boolean isPartitioningKey) {
    this.isPartitioningKey = isPartitioningKey;
    return this;
  }

  /**
   * For Datasets which are partitioned, this determines the partitioning key. Note that multiple columns can be part of a partitioning key, but currently we do not support rendering the ordered partitioning key.
   * @return isPartitioningKey
   **/
  @Schema(description = "For Datasets which are partitioned, this determines the partitioning key. Note that multiple columns can be part of a partitioning key, but currently we do not support rendering the ordered partitioning key.")
  
    public Boolean isIsPartitioningKey() {
    return isPartitioningKey;
  }

  public void setIsPartitioningKey(Boolean isPartitioningKey) {
    this.isPartitioningKey = isPartitioningKey;
  }

  public SchemaField jsonProps(String jsonProps) {
    this.jsonProps = jsonProps;
    return this;
  }

  /**
   * For schema fields that have other properties that are not modeled explicitly, use this field to serialize those properties into a JSON string
   * @return jsonProps
   **/
  @Schema(description = "For schema fields that have other properties that are not modeled explicitly, use this field to serialize those properties into a JSON string")
  
    public String getJsonProps() {
    return jsonProps;
  }

  public void setJsonProps(String jsonProps) {
    this.jsonProps = jsonProps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaField schemaField = (SchemaField) o;
    return Objects.equals(this.fieldPath, schemaField.fieldPath) &&
        Objects.equals(this.jsonPath, schemaField.jsonPath) &&
        Objects.equals(this.nullable, schemaField.nullable) &&
        Objects.equals(this.description, schemaField.description) &&
        Objects.equals(this.label, schemaField.label) &&
        Objects.equals(this.created, schemaField.created) &&
        Objects.equals(this.lastModified, schemaField.lastModified) &&
        Objects.equals(this.type, schemaField.type) &&
        Objects.equals(this.nativeDataType, schemaField.nativeDataType) &&
        Objects.equals(this.recursive, schemaField.recursive) &&
        Objects.equals(this.globalTags, schemaField.globalTags) &&
        Objects.equals(this.glossaryTerms, schemaField.glossaryTerms) &&
        Objects.equals(this.isPartOfKey, schemaField.isPartOfKey) &&
        Objects.equals(this.isPartitioningKey, schemaField.isPartitioningKey) &&
        Objects.equals(this.jsonProps, schemaField.jsonProps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldPath, jsonPath, nullable, description, label, created, lastModified, type, nativeDataType, recursive, globalTags, glossaryTerms, isPartOfKey, isPartitioningKey, jsonProps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaField {\n");
    
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    jsonPath: ").append(toIndentedString(jsonPath)).append("\n");
    sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    nativeDataType: ").append(toIndentedString(nativeDataType)).append("\n");
    sb.append("    recursive: ").append(toIndentedString(recursive)).append("\n");
    sb.append("    globalTags: ").append(toIndentedString(globalTags)).append("\n");
    sb.append("    glossaryTerms: ").append(toIndentedString(glossaryTerms)).append("\n");
    sb.append("    isPartOfKey: ").append(toIndentedString(isPartOfKey)).append("\n");
    sb.append("    isPartitioningKey: ").append(toIndentedString(isPartitioningKey)).append("\n");
    sb.append("    jsonProps: ").append(toIndentedString(jsonProps)).append("\n");
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