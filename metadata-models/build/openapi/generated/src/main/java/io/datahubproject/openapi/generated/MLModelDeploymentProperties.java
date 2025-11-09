package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DeploymentStatus;
import io.datahubproject.openapi.generated.VersionTag;
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
 * Properties associated with an ML Model Deployment
 */
@Schema(description = "Properties associated with an ML Model Deployment")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLModelDeploymentProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfMLModelDeploymentSnapshotAspectsItems {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MLModelDeploymentProperties") @Builder.Default
  private String __type = "MLModelDeploymentProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MLModelDeploymentProperties"},
  defaultValue = "MLModelDeploymentProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("externalUrl") @Builder.Default
  private String externalUrl = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("createdAt") @Builder.Default
  private Long createdAt = null;

  @JsonProperty("version") @Builder.Default
  private VersionTag version = null;

  @JsonProperty("status") @Builder.Default
  private DeploymentStatus status = null;

  public MLModelDeploymentProperties customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public MLModelDeploymentProperties putCustomPropertiesItem(String key, String customPropertiesItem) {
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

  public MLModelDeploymentProperties externalUrl(String externalUrl) {
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

  public MLModelDeploymentProperties description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Documentation of the MLModelDeployment
   * @return description
   **/
  @Schema(description = "Documentation of the MLModelDeployment")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MLModelDeploymentProperties createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date when the MLModelDeployment was developed
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return createdAt
   **/
  @Schema(description = "Date when the MLModelDeployment was developed")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public MLModelDeploymentProperties version(VersionTag version) {
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

  public MLModelDeploymentProperties status(DeploymentStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    @Valid
    public DeploymentStatus getStatus() {
    return status;
  }

  public void setStatus(DeploymentStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLModelDeploymentProperties mlModelDeploymentProperties = (MLModelDeploymentProperties) o;
    return Objects.equals(this.customProperties, mlModelDeploymentProperties.customProperties) &&
        Objects.equals(this.externalUrl, mlModelDeploymentProperties.externalUrl) &&
        Objects.equals(this.description, mlModelDeploymentProperties.description) &&
        Objects.equals(this.createdAt, mlModelDeploymentProperties.createdAt) &&
        Objects.equals(this.version, mlModelDeploymentProperties.version) &&
        Objects.equals(this.status, mlModelDeploymentProperties.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, externalUrl, description, createdAt, version, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLModelDeploymentProperties {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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