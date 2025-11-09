package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FabricType;
import io.datahubproject.openapi.generated.JobStatus;
import io.datahubproject.openapi.generated.TimeStamp;
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
 * Information about a Data processing job
 */
@Schema(description = "Information about a Data processing job")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataJobInfo  implements OneOfDataJobSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataJobInfo") @Builder.Default
  private String __type = "DataJobInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataJobInfo"},
  defaultValue = "DataJobInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("externalUrl") @Builder.Default
  private String externalUrl = null;

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("type") @Builder.Default
  private String type = null;

  @JsonProperty("flowUrn") @Builder.Default
  private String flowUrn = null;

  @JsonProperty("created") @Builder.Default
  private TimeStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private TimeStamp lastModified = null;

  @JsonProperty("status") @Builder.Default
  private JobStatus status = null;

  @JsonProperty("env") @Builder.Default
  private FabricType env = null;

  public DataJobInfo customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public DataJobInfo putCustomPropertiesItem(String key, String customPropertiesItem) {
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

  public DataJobInfo externalUrl(String externalUrl) {
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

  public DataJobInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Job name
   * @return name
   **/
  @Schema(required = true, description = "Job name")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataJobInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Job description
   * @return description
   **/
  @Schema(description = "Job description")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DataJobInfo type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Datajob type *NOTE**: AzkabanJobType is deprecated. Please use strings instead.
   * @return type
   **/
  @Schema(required = true, description = "Datajob type *NOTE**: AzkabanJobType is deprecated. Please use strings instead.")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DataJobInfo flowUrn(String flowUrn) {
    this.flowUrn = flowUrn;
    return this;
  }

  /**
   * DataFlow urn that this job is part of
   * @return flowUrn
   **/
  @Schema(description = "DataFlow urn that this job is part of")
  
    public String getFlowUrn() {
    return flowUrn;
  }

  public void setFlowUrn(String flowUrn) {
    this.flowUrn = flowUrn;
  }

  public DataJobInfo created(TimeStamp created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @Schema(description = "")
  
    @Valid
    public TimeStamp getCreated() {
    return created;
  }

  public void setCreated(TimeStamp created) {
    this.created = created;
  }

  public DataJobInfo lastModified(TimeStamp lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   **/
  @Schema(description = "")
  
    @Valid
    public TimeStamp getLastModified() {
    return lastModified;
  }

  public void setLastModified(TimeStamp lastModified) {
    this.lastModified = lastModified;
  }

  public DataJobInfo status(JobStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    @Valid
    public JobStatus getStatus() {
    return status;
  }

  public void setStatus(JobStatus status) {
    this.status = status;
  }

  public DataJobInfo env(FabricType env) {
    this.env = env;
    return this;
  }

  /**
   * Get env
   * @return env
   **/
  @Schema(description = "")
  
    @Valid
    public FabricType getEnv() {
    return env;
  }

  public void setEnv(FabricType env) {
    this.env = env;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataJobInfo dataJobInfo = (DataJobInfo) o;
    return Objects.equals(this.customProperties, dataJobInfo.customProperties) &&
        Objects.equals(this.externalUrl, dataJobInfo.externalUrl) &&
        Objects.equals(this.name, dataJobInfo.name) &&
        Objects.equals(this.description, dataJobInfo.description) &&
        Objects.equals(this.type, dataJobInfo.type) &&
        Objects.equals(this.flowUrn, dataJobInfo.flowUrn) &&
        Objects.equals(this.created, dataJobInfo.created) &&
        Objects.equals(this.lastModified, dataJobInfo.lastModified) &&
        Objects.equals(this.status, dataJobInfo.status) &&
        Objects.equals(this.env, dataJobInfo.env);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, externalUrl, name, description, type, flowUrn, created, lastModified, status, env);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataJobInfo {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    flowUrn: ").append(toIndentedString(flowUrn)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
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