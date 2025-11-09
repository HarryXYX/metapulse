package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.GlobalTags;
import io.datahubproject.openapi.generated.GlossaryTerms;
import io.datahubproject.openapi.generated.SchemaFieldDataType;
import io.swagger.v3.oas.annotations.media.Schema;
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
 * Properties associated with a BusinessAttribute
 */
@Schema(description = "Properties associated with a BusinessAttribute")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessAttributeInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "BusinessAttributeInfo") @Builder.Default
  private String __type = "BusinessAttributeInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"BusinessAttributeInfo"},
  defaultValue = "BusinessAttributeInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("fieldPath") @Builder.Default
  private String fieldPath = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTags globalTags = null;

  @JsonProperty("glossaryTerms") @Builder.Default
  private GlossaryTerms glossaryTerms = null;

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private AuditStamp lastModified = null;

  @JsonProperty("deleted") @Builder.Default
  private AuditStamp deleted = null;

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("type") @Builder.Default
  private SchemaFieldDataType type = null;

  public BusinessAttributeInfo fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  /**
   * FieldPath uniquely identifying the SchemaField this metadata is associated with
   * @return fieldPath
   **/
  @Schema(required = true, description = "FieldPath uniquely identifying the SchemaField this metadata is associated with")
      @NotNull

    public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public BusinessAttributeInfo description(String description) {
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

  public BusinessAttributeInfo globalTags(GlobalTags globalTags) {
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

  public BusinessAttributeInfo glossaryTerms(GlossaryTerms glossaryTerms) {
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

  public BusinessAttributeInfo customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public BusinessAttributeInfo putCustomPropertiesItem(String key, String customPropertiesItem) {
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

  /**
   * Custom property bag.
   * @return customProperties
   **/
  @Schema(required = true, description = "Custom property bag.")
      @NotNull

    public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public BusinessAttributeInfo created(AuditStamp created) {
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

  public BusinessAttributeInfo lastModified(AuditStamp lastModified) {
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

  public BusinessAttributeInfo deleted(AuditStamp deleted) {
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

  public BusinessAttributeInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the BusinessAttribute
   * @return name
   **/
  @Schema(required = true, description = "Display name of the BusinessAttribute")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BusinessAttributeInfo type(SchemaFieldDataType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(description = "")
  
    @Valid
    public SchemaFieldDataType getType() {
    return type;
  }

  public void setType(SchemaFieldDataType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessAttributeInfo businessAttributeInfo = (BusinessAttributeInfo) o;
    return Objects.equals(this.fieldPath, businessAttributeInfo.fieldPath) &&
        Objects.equals(this.description, businessAttributeInfo.description) &&
        Objects.equals(this.globalTags, businessAttributeInfo.globalTags) &&
        Objects.equals(this.glossaryTerms, businessAttributeInfo.glossaryTerms) &&
        Objects.equals(this.customProperties, businessAttributeInfo.customProperties) &&
        Objects.equals(this.created, businessAttributeInfo.created) &&
        Objects.equals(this.lastModified, businessAttributeInfo.lastModified) &&
        Objects.equals(this.deleted, businessAttributeInfo.deleted) &&
        Objects.equals(this.name, businessAttributeInfo.name) &&
        Objects.equals(this.type, businessAttributeInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldPath, description, globalTags, glossaryTerms, customProperties, created, lastModified, deleted, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessAttributeInfo {\n");
    
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    globalTags: ").append(toIndentedString(globalTags)).append("\n");
    sb.append("    glossaryTerms: ").append(toIndentedString(glossaryTerms)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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