package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Properties associated with a MLFeatureTable
 */
@Schema(description = "Properties associated with a MLFeatureTable")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLFeatureTableProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfMLFeatureTableSnapshotAspectsItems {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MLFeatureTableProperties") @Builder.Default
  private String __type = "MLFeatureTableProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MLFeatureTableProperties"},
  defaultValue = "MLFeatureTableProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("mlFeatures") @Builder.Default
  @Valid
  private List<String> mlFeatures = null;

  @JsonProperty("mlPrimaryKeys") @Builder.Default
  @Valid
  private List<String> mlPrimaryKeys = null;

  public MLFeatureTableProperties customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public MLFeatureTableProperties putCustomPropertiesItem(String key, String customPropertiesItem) {
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

  public MLFeatureTableProperties description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Documentation of the MLFeatureTable
   * @return description
   **/
  @Schema(description = "Documentation of the MLFeatureTable")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MLFeatureTableProperties mlFeatures(List<String> mlFeatures) {
    this.mlFeatures = mlFeatures;
    return this;
  }

  public MLFeatureTableProperties addMlFeaturesItem(String mlFeaturesItem) {
    if (this.mlFeatures == null) {
      this.mlFeatures = new ArrayList<>();
    }
    this.mlFeatures.add(mlFeaturesItem);
    return this;
  }

  /**
   * List of features contained in the feature table
   * @return mlFeatures
   **/
  @Schema(description = "List of features contained in the feature table")
  
    public List<String> getMlFeatures() {
    return mlFeatures;
  }

  public void setMlFeatures(List<String> mlFeatures) {
    this.mlFeatures = mlFeatures;
  }

  public MLFeatureTableProperties mlPrimaryKeys(List<String> mlPrimaryKeys) {
    this.mlPrimaryKeys = mlPrimaryKeys;
    return this;
  }

  public MLFeatureTableProperties addMlPrimaryKeysItem(String mlPrimaryKeysItem) {
    if (this.mlPrimaryKeys == null) {
      this.mlPrimaryKeys = new ArrayList<>();
    }
    this.mlPrimaryKeys.add(mlPrimaryKeysItem);
    return this;
  }

  /**
   * List of primary keys in the feature table (if multiple, assumed to act as a composite key)
   * @return mlPrimaryKeys
   **/
  @Schema(description = "List of primary keys in the feature table (if multiple, assumed to act as a composite key)")
  
    public List<String> getMlPrimaryKeys() {
    return mlPrimaryKeys;
  }

  public void setMlPrimaryKeys(List<String> mlPrimaryKeys) {
    this.mlPrimaryKeys = mlPrimaryKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLFeatureTableProperties mlFeatureTableProperties = (MLFeatureTableProperties) o;
    return Objects.equals(this.customProperties, mlFeatureTableProperties.customProperties) &&
        Objects.equals(this.description, mlFeatureTableProperties.description) &&
        Objects.equals(this.mlFeatures, mlFeatureTableProperties.mlFeatures) &&
        Objects.equals(this.mlPrimaryKeys, mlFeatureTableProperties.mlPrimaryKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, description, mlFeatures, mlPrimaryKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLFeatureTableProperties {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mlFeatures: ").append(toIndentedString(mlFeatures)).append("\n");
    sb.append("    mlPrimaryKeys: ").append(toIndentedString(mlPrimaryKeys)).append("\n");
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