package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.TimeStamp;
import io.datahubproject.openapi.generated.VersionTag;
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
 * Properties associated with an ML Model Group
 */
@Schema(description = "Properties associated with an ML Model Group")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLModelGroupProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfMLModelGroupSnapshotAspectsItems {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MLModelGroupProperties") @Builder.Default
  private String __type = "MLModelGroupProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MLModelGroupProperties"},
  defaultValue = "MLModelGroupProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("trainingJobs") @Builder.Default
  @Valid
  private List<String> trainingJobs = null;

  @JsonProperty("downstreamJobs") @Builder.Default
  @Valid
  private List<String> downstreamJobs = null;

  @JsonProperty("externalUrl") @Builder.Default
  private String externalUrl = null;

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("createdAt") @Builder.Default
  private Long createdAt = null;

  @JsonProperty("created") @Builder.Default
  private TimeStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private TimeStamp lastModified = null;

  @JsonProperty("version") @Builder.Default
  private VersionTag version = null;

  public MLModelGroupProperties customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public MLModelGroupProperties putCustomPropertiesItem(String key, String customPropertiesItem) {
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

  public MLModelGroupProperties trainingJobs(List<String> trainingJobs) {
    this.trainingJobs = trainingJobs;
    return this;
  }

  public MLModelGroupProperties addTrainingJobsItem(String trainingJobsItem) {
    if (this.trainingJobs == null) {
      this.trainingJobs = new ArrayList<>();
    }
    this.trainingJobs.add(trainingJobsItem);
    return this;
  }

  /**
   * List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.
   * @return trainingJobs
   **/
  @Schema(description = "List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.")
  
    public List<String> getTrainingJobs() {
    return trainingJobs;
  }

  public void setTrainingJobs(List<String> trainingJobs) {
    this.trainingJobs = trainingJobs;
  }

  public MLModelGroupProperties downstreamJobs(List<String> downstreamJobs) {
    this.downstreamJobs = downstreamJobs;
    return this;
  }

  public MLModelGroupProperties addDownstreamJobsItem(String downstreamJobsItem) {
    if (this.downstreamJobs == null) {
      this.downstreamJobs = new ArrayList<>();
    }
    this.downstreamJobs.add(downstreamJobsItem);
    return this;
  }

  /**
   * List of jobs or process instances (if any) that use the model or group.
   * @return downstreamJobs
   **/
  @Schema(description = "List of jobs or process instances (if any) that use the model or group.")
  
    public List<String> getDownstreamJobs() {
    return downstreamJobs;
  }

  public void setDownstreamJobs(List<String> downstreamJobs) {
    this.downstreamJobs = downstreamJobs;
  }

  public MLModelGroupProperties externalUrl(String externalUrl) {
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

  public MLModelGroupProperties name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the MLModelGroup
   * @return name
   **/
  @Schema(description = "Display name of the MLModelGroup")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MLModelGroupProperties description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Documentation of the MLModelGroup
   * @return description
   **/
  @Schema(description = "Documentation of the MLModelGroup")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MLModelGroupProperties createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date when the MLModelGroup was developed
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return createdAt
   **/
  @Schema(description = "Date when the MLModelGroup was developed")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public MLModelGroupProperties created(TimeStamp created) {
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

  public MLModelGroupProperties lastModified(TimeStamp lastModified) {
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

  public MLModelGroupProperties version(VersionTag version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @Schema(description = "")
  
    @Valid
    public VersionTag getVersion() {
    return version;
  }

  public void setVersion(VersionTag version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLModelGroupProperties mlModelGroupProperties = (MLModelGroupProperties) o;
    return Objects.equals(this.customProperties, mlModelGroupProperties.customProperties) &&
        Objects.equals(this.trainingJobs, mlModelGroupProperties.trainingJobs) &&
        Objects.equals(this.downstreamJobs, mlModelGroupProperties.downstreamJobs) &&
        Objects.equals(this.externalUrl, mlModelGroupProperties.externalUrl) &&
        Objects.equals(this.name, mlModelGroupProperties.name) &&
        Objects.equals(this.description, mlModelGroupProperties.description) &&
        Objects.equals(this.createdAt, mlModelGroupProperties.createdAt) &&
        Objects.equals(this.created, mlModelGroupProperties.created) &&
        Objects.equals(this.lastModified, mlModelGroupProperties.lastModified) &&
        Objects.equals(this.version, mlModelGroupProperties.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, trainingJobs, downstreamJobs, externalUrl, name, description, createdAt, created, lastModified, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLModelGroupProperties {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    trainingJobs: ").append(toIndentedString(trainingJobs)).append("\n");
    sb.append("    downstreamJobs: ").append(toIndentedString(downstreamJobs)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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