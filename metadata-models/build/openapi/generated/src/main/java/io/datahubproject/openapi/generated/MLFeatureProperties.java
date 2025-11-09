package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.MLFeatureDataType;
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
 * Properties associated with a MLFeature
 */
@Schema(description = "Properties associated with a MLFeature")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLFeatureProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfMLFeatureSnapshotAspectsItems, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MLFeatureProperties") @Builder.Default
  private String __type = "MLFeatureProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MLFeatureProperties"},
  defaultValue = "MLFeatureProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("dataType") @Builder.Default
  private MLFeatureDataType dataType = null;

  @JsonProperty("version") @Builder.Default
  private VersionTag version = null;

  @JsonProperty("sources") @Builder.Default
  @Valid
  private List<String> sources = null;

  public MLFeatureProperties customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public MLFeatureProperties putCustomPropertiesItem(String key, String customPropertiesItem) {
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

  public MLFeatureProperties description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Documentation of the MLFeature
   * @return description
   **/
  @Schema(description = "Documentation of the MLFeature")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MLFeatureProperties dataType(MLFeatureDataType dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Get dataType
   * @return dataType
   **/
  @Schema(description = "")
  
    @Valid
    public MLFeatureDataType getDataType() {
    return dataType;
  }

  public void setDataType(MLFeatureDataType dataType) {
    this.dataType = dataType;
  }

  public MLFeatureProperties version(VersionTag version) {
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

  public MLFeatureProperties sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public MLFeatureProperties addSourcesItem(String sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * Source of the MLFeature
   * @return sources
   **/
  @Schema(description = "Source of the MLFeature")
  
    public List<String> getSources() {
    return sources;
  }

  public void setSources(List<String> sources) {
    this.sources = sources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLFeatureProperties mlFeatureProperties = (MLFeatureProperties) o;
    return Objects.equals(this.customProperties, mlFeatureProperties.customProperties) &&
        Objects.equals(this.description, mlFeatureProperties.description) &&
        Objects.equals(this.dataType, mlFeatureProperties.dataType) &&
        Objects.equals(this.version, mlFeatureProperties.version) &&
        Objects.equals(this.sources, mlFeatureProperties.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, description, dataType, version, sources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLFeatureProperties {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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