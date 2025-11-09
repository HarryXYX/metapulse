package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FabricType;
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
 * Information about a Asset Container as received from a 3rd party source system
 */
@Schema(description = "Information about a Asset Container as received from a 3rd party source system")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContainerProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "ContainerProperties") @Builder.Default
  private String __type = "ContainerProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"ContainerProperties"},
  defaultValue = "ContainerProperties")
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

  @JsonProperty("qualifiedName") @Builder.Default
  private String qualifiedName = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("env") @Builder.Default
  private FabricType env = null;

  @JsonProperty("created") @Builder.Default
  private TimeStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private TimeStamp lastModified = null;

  public ContainerProperties customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public ContainerProperties putCustomPropertiesItem(String key, String customPropertiesItem) {
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

  public ContainerProperties externalUrl(String externalUrl) {
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

  public ContainerProperties name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the Asset Container
   * @return name
   **/
  @Schema(required = true, description = "Display name of the Asset Container")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContainerProperties qualifiedName(String qualifiedName) {
    this.qualifiedName = qualifiedName;
    return this;
  }

  /**
   * Fully-qualified name of the Container
   * @return qualifiedName
   **/
  @Schema(description = "Fully-qualified name of the Container")
  
    public String getQualifiedName() {
    return qualifiedName;
  }

  public void setQualifiedName(String qualifiedName) {
    this.qualifiedName = qualifiedName;
  }

  public ContainerProperties description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the Asset Container as it exists inside a source system
   * @return description
   **/
  @Schema(description = "Description of the Asset Container as it exists inside a source system")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ContainerProperties env(FabricType env) {
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

  public ContainerProperties created(TimeStamp created) {
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

  public ContainerProperties lastModified(TimeStamp lastModified) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerProperties containerProperties = (ContainerProperties) o;
    return Objects.equals(this.customProperties, containerProperties.customProperties) &&
        Objects.equals(this.externalUrl, containerProperties.externalUrl) &&
        Objects.equals(this.name, containerProperties.name) &&
        Objects.equals(this.qualifiedName, containerProperties.qualifiedName) &&
        Objects.equals(this.description, containerProperties.description) &&
        Objects.equals(this.env, containerProperties.env) &&
        Objects.equals(this.created, containerProperties.created) &&
        Objects.equals(this.lastModified, containerProperties.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, externalUrl, name, qualifiedName, description, env, created, lastModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerProperties {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    qualifiedName: ").append(toIndentedString(qualifiedName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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