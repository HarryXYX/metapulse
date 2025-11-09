package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssertionSource;
import io.datahubproject.openapi.generated.AssertionType;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.CustomAssertionInfo;
import io.datahubproject.openapi.generated.DatasetAssertionInfo;
import io.datahubproject.openapi.generated.FieldAssertionInfo;
import io.datahubproject.openapi.generated.FreshnessAssertionInfo;
import io.datahubproject.openapi.generated.SchemaAssertionInfo;
import io.datahubproject.openapi.generated.SqlAssertionInfo;
import io.datahubproject.openapi.generated.VolumeAssertionInfo;
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
 * Information about an assertion
 */
@Schema(description = "Information about an assertion")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssertionInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "AssertionInfo") @Builder.Default
  private String __type = "AssertionInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"AssertionInfo"},
  defaultValue = "AssertionInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("externalUrl") @Builder.Default
  private String externalUrl = null;

  @JsonProperty("type") @Builder.Default
  private AssertionType type = null;

  @JsonProperty("datasetAssertion") @Builder.Default
  private DatasetAssertionInfo datasetAssertion = null;

  @JsonProperty("freshnessAssertion") @Builder.Default
  private FreshnessAssertionInfo freshnessAssertion = null;

  @JsonProperty("volumeAssertion") @Builder.Default
  private VolumeAssertionInfo volumeAssertion = null;

  @JsonProperty("sqlAssertion") @Builder.Default
  private SqlAssertionInfo sqlAssertion = null;

  @JsonProperty("fieldAssertion") @Builder.Default
  private FieldAssertionInfo fieldAssertion = null;

  @JsonProperty("schemaAssertion") @Builder.Default
  private SchemaAssertionInfo schemaAssertion = null;

  @JsonProperty("customAssertion") @Builder.Default
  private CustomAssertionInfo customAssertion = null;

  @JsonProperty("source") @Builder.Default
  private AssertionSource source = null;

  @JsonProperty("lastUpdated") @Builder.Default
  private AuditStamp lastUpdated = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  public AssertionInfo customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public AssertionInfo putCustomPropertiesItem(String key, String customPropertiesItem) {
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

  public AssertionInfo externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

  /**
   * URL where the reference exist
   * @return externalUrl
   **/
  @Schema(description = "URL where the reference exist")
  
    public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public AssertionInfo type(AssertionType type) {
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
    public AssertionType getType() {
    return type;
  }

  public void setType(AssertionType type) {
    this.type = type;
  }

  public AssertionInfo datasetAssertion(DatasetAssertionInfo datasetAssertion) {
    this.datasetAssertion = datasetAssertion;
    return this;
  }

  /**
   * Get datasetAssertion
   * @return datasetAssertion
   **/
  @Schema(description = "")
  
    @Valid
    public DatasetAssertionInfo getDatasetAssertion() {
    return datasetAssertion;
  }

  public void setDatasetAssertion(DatasetAssertionInfo datasetAssertion) {
    this.datasetAssertion = datasetAssertion;
  }

  public AssertionInfo freshnessAssertion(FreshnessAssertionInfo freshnessAssertion) {
    this.freshnessAssertion = freshnessAssertion;
    return this;
  }

  /**
   * Get freshnessAssertion
   * @return freshnessAssertion
   **/
  @Schema(description = "")
  
    @Valid
    public FreshnessAssertionInfo getFreshnessAssertion() {
    return freshnessAssertion;
  }

  public void setFreshnessAssertion(FreshnessAssertionInfo freshnessAssertion) {
    this.freshnessAssertion = freshnessAssertion;
  }

  public AssertionInfo volumeAssertion(VolumeAssertionInfo volumeAssertion) {
    this.volumeAssertion = volumeAssertion;
    return this;
  }

  /**
   * Get volumeAssertion
   * @return volumeAssertion
   **/
  @Schema(description = "")
  
    @Valid
    public VolumeAssertionInfo getVolumeAssertion() {
    return volumeAssertion;
  }

  public void setVolumeAssertion(VolumeAssertionInfo volumeAssertion) {
    this.volumeAssertion = volumeAssertion;
  }

  public AssertionInfo sqlAssertion(SqlAssertionInfo sqlAssertion) {
    this.sqlAssertion = sqlAssertion;
    return this;
  }

  /**
   * Get sqlAssertion
   * @return sqlAssertion
   **/
  @Schema(description = "")
  
    @Valid
    public SqlAssertionInfo getSqlAssertion() {
    return sqlAssertion;
  }

  public void setSqlAssertion(SqlAssertionInfo sqlAssertion) {
    this.sqlAssertion = sqlAssertion;
  }

  public AssertionInfo fieldAssertion(FieldAssertionInfo fieldAssertion) {
    this.fieldAssertion = fieldAssertion;
    return this;
  }

  /**
   * Get fieldAssertion
   * @return fieldAssertion
   **/
  @Schema(description = "")
  
    @Valid
    public FieldAssertionInfo getFieldAssertion() {
    return fieldAssertion;
  }

  public void setFieldAssertion(FieldAssertionInfo fieldAssertion) {
    this.fieldAssertion = fieldAssertion;
  }

  public AssertionInfo schemaAssertion(SchemaAssertionInfo schemaAssertion) {
    this.schemaAssertion = schemaAssertion;
    return this;
  }

  /**
   * Get schemaAssertion
   * @return schemaAssertion
   **/
  @Schema(description = "")
  
    @Valid
    public SchemaAssertionInfo getSchemaAssertion() {
    return schemaAssertion;
  }

  public void setSchemaAssertion(SchemaAssertionInfo schemaAssertion) {
    this.schemaAssertion = schemaAssertion;
  }

  public AssertionInfo customAssertion(CustomAssertionInfo customAssertion) {
    this.customAssertion = customAssertion;
    return this;
  }

  /**
   * Get customAssertion
   * @return customAssertion
   **/
  @Schema(description = "")
  
    @Valid
    public CustomAssertionInfo getCustomAssertion() {
    return customAssertion;
  }

  public void setCustomAssertion(CustomAssertionInfo customAssertion) {
    this.customAssertion = customAssertion;
  }

  public AssertionInfo source(AssertionSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionSource getSource() {
    return source;
  }

  public void setSource(AssertionSource source) {
    this.source = source;
  }

  public AssertionInfo lastUpdated(AuditStamp lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Get lastUpdated
   * @return lastUpdated
   **/
  @Schema(description = "")
  
    @Valid
    public AuditStamp getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(AuditStamp lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public AssertionInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An optional human-readable description of the assertion
   * @return description
   **/
  @Schema(description = "An optional human-readable description of the assertion")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssertionInfo assertionInfo = (AssertionInfo) o;
    return Objects.equals(this.customProperties, assertionInfo.customProperties) &&
        Objects.equals(this.externalUrl, assertionInfo.externalUrl) &&
        Objects.equals(this.type, assertionInfo.type) &&
        Objects.equals(this.datasetAssertion, assertionInfo.datasetAssertion) &&
        Objects.equals(this.freshnessAssertion, assertionInfo.freshnessAssertion) &&
        Objects.equals(this.volumeAssertion, assertionInfo.volumeAssertion) &&
        Objects.equals(this.sqlAssertion, assertionInfo.sqlAssertion) &&
        Objects.equals(this.fieldAssertion, assertionInfo.fieldAssertion) &&
        Objects.equals(this.schemaAssertion, assertionInfo.schemaAssertion) &&
        Objects.equals(this.customAssertion, assertionInfo.customAssertion) &&
        Objects.equals(this.source, assertionInfo.source) &&
        Objects.equals(this.lastUpdated, assertionInfo.lastUpdated) &&
        Objects.equals(this.description, assertionInfo.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, externalUrl, type, datasetAssertion, freshnessAssertion, volumeAssertion, sqlAssertion, fieldAssertion, schemaAssertion, customAssertion, source, lastUpdated, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssertionInfo {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    datasetAssertion: ").append(toIndentedString(datasetAssertion)).append("\n");
    sb.append("    freshnessAssertion: ").append(toIndentedString(freshnessAssertion)).append("\n");
    sb.append("    volumeAssertion: ").append(toIndentedString(volumeAssertion)).append("\n");
    sb.append("    sqlAssertion: ").append(toIndentedString(sqlAssertion)).append("\n");
    sb.append("    fieldAssertion: ").append(toIndentedString(fieldAssertion)).append("\n");
    sb.append("    schemaAssertion: ").append(toIndentedString(schemaAssertion)).append("\n");
    sb.append("    customAssertion: ").append(toIndentedString(customAssertion)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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