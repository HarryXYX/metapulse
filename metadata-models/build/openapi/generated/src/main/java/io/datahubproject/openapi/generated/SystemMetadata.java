package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
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
 * Metadata associated with each metadata change that is processed by the system
 */
@Schema(description = "Metadata associated with each metadata change that is processed by the system")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SystemMetadata  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "SystemMetadata") @Builder.Default
  private String __type = "SystemMetadata";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"SystemMetadata"},
  defaultValue = "SystemMetadata")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("lastObserved") @Builder.Default
  private Long lastObserved = 0l;

  @JsonProperty("runId") @Builder.Default
  private String runId = "no-run-id-provided";

  @JsonProperty("lastRunId") @Builder.Default
  private String lastRunId = "no-run-id-provided";

  @JsonProperty("pipelineName") @Builder.Default
  private String pipelineName = null;

  @JsonProperty("registryName") @Builder.Default
  private String registryName = null;

  @JsonProperty("registryVersion") @Builder.Default
  private String registryVersion = null;

  @JsonProperty("properties") @Builder.Default
  @Valid
  private Map<String, String> properties = null;

  @JsonProperty("version") @Builder.Default
  private String version = null;

  @JsonProperty("aspectCreated") @Builder.Default
  private AuditStamp aspectCreated = null;

  @JsonProperty("aspectModified") @Builder.Default
  private AuditStamp aspectModified = null;

  public SystemMetadata lastObserved(Long lastObserved) {
    this.lastObserved = lastObserved;
    return this;
  }

  /**
   * The timestamp the metadata was observed at
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return lastObserved
   **/
  @Schema(required = true, description = "The timestamp the metadata was observed at")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getLastObserved() {
    return lastObserved;
  }

  public void setLastObserved(Long lastObserved) {
    this.lastObserved = lastObserved;
  }

  public SystemMetadata runId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * The original run id that produced the metadata. Populated in case of batch-ingestion.
   * @return runId
   **/
  @Schema(required = true, description = "The original run id that produced the metadata. Populated in case of batch-ingestion.")
      @NotNull

    public String getRunId() {
    return runId;
  }

  public void setRunId(String runId) {
    this.runId = runId;
  }

  public SystemMetadata lastRunId(String lastRunId) {
    this.lastRunId = lastRunId;
    return this;
  }

  /**
   * The last run id that produced the metadata. Populated in case of batch-ingestion.
   * @return lastRunId
   **/
  @Schema(required = true, description = "The last run id that produced the metadata. Populated in case of batch-ingestion.")
      @NotNull

    public String getLastRunId() {
    return lastRunId;
  }

  public void setLastRunId(String lastRunId) {
    this.lastRunId = lastRunId;
  }

  public SystemMetadata pipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
    return this;
  }

  /**
   * The ingestion pipeline id that produced the metadata. Populated in case of batch ingestion.
   * @return pipelineName
   **/
  @Schema(description = "The ingestion pipeline id that produced the metadata. Populated in case of batch ingestion.")
  
    public String getPipelineName() {
    return pipelineName;
  }

  public void setPipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
  }

  public SystemMetadata registryName(String registryName) {
    this.registryName = registryName;
    return this;
  }

  /**
   * The model registry name that was used to process this event
   * @return registryName
   **/
  @Schema(description = "The model registry name that was used to process this event")
  
    public String getRegistryName() {
    return registryName;
  }

  public void setRegistryName(String registryName) {
    this.registryName = registryName;
  }

  public SystemMetadata registryVersion(String registryVersion) {
    this.registryVersion = registryVersion;
    return this;
  }

  /**
   * The model registry version that was used to process this event
   * @return registryVersion
   **/
  @Schema(description = "The model registry version that was used to process this event")
  
    public String getRegistryVersion() {
    return registryVersion;
  }

  public void setRegistryVersion(String registryVersion) {
    this.registryVersion = registryVersion;
  }

  public SystemMetadata properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public SystemMetadata putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Additional properties
   * @return properties
   **/
  @Schema(description = "Additional properties")
  
    public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public SystemMetadata version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Aspect version    Initial implementation will use the aspect version's number, however stored as    a string in the case where a different aspect versioning scheme is later adopted.
   * @return version
   **/
  @Schema(description = "Aspect version    Initial implementation will use the aspect version's number, however stored as    a string in the case where a different aspect versioning scheme is later adopted.")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public SystemMetadata aspectCreated(AuditStamp aspectCreated) {
    this.aspectCreated = aspectCreated;
    return this;
  }

  /**
   * Get aspectCreated
   * @return aspectCreated
   **/
  @Schema(description = "")
  
    @Valid
    public AuditStamp getAspectCreated() {
    return aspectCreated;
  }

  public void setAspectCreated(AuditStamp aspectCreated) {
    this.aspectCreated = aspectCreated;
  }

  public SystemMetadata aspectModified(AuditStamp aspectModified) {
    this.aspectModified = aspectModified;
    return this;
  }

  /**
   * Get aspectModified
   * @return aspectModified
   **/
  @Schema(description = "")
  
    @Valid
    public AuditStamp getAspectModified() {
    return aspectModified;
  }

  public void setAspectModified(AuditStamp aspectModified) {
    this.aspectModified = aspectModified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemMetadata systemMetadata = (SystemMetadata) o;
    return Objects.equals(this.lastObserved, systemMetadata.lastObserved) &&
        Objects.equals(this.runId, systemMetadata.runId) &&
        Objects.equals(this.lastRunId, systemMetadata.lastRunId) &&
        Objects.equals(this.pipelineName, systemMetadata.pipelineName) &&
        Objects.equals(this.registryName, systemMetadata.registryName) &&
        Objects.equals(this.registryVersion, systemMetadata.registryVersion) &&
        Objects.equals(this.properties, systemMetadata.properties) &&
        Objects.equals(this.version, systemMetadata.version) &&
        Objects.equals(this.aspectCreated, systemMetadata.aspectCreated) &&
        Objects.equals(this.aspectModified, systemMetadata.aspectModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastObserved, runId, lastRunId, pipelineName, registryName, registryVersion, properties, version, aspectCreated, aspectModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemMetadata {\n");
    
    sb.append("    lastObserved: ").append(toIndentedString(lastObserved)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    lastRunId: ").append(toIndentedString(lastRunId)).append("\n");
    sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
    sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
    sb.append("    registryVersion: ").append(toIndentedString(registryVersion)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    aspectCreated: ").append(toIndentedString(aspectCreated)).append("\n");
    sb.append("    aspectModified: ").append(toIndentedString(aspectModified)).append("\n");
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