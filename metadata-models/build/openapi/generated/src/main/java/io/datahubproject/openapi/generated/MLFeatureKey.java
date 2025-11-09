package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Key for an MLFeature
 */
@Schema(description = "Key for an MLFeature")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLFeatureKey  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfMLFeatureSnapshotAspectsItems, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MLFeatureKey") @Builder.Default
  private String __type = "MLFeatureKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MLFeatureKey"},
  defaultValue = "MLFeatureKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("featureNamespace") @Builder.Default
  private String featureNamespace = null;

  @JsonProperty("name") @Builder.Default
  private String name = null;

  public MLFeatureKey featureNamespace(String featureNamespace) {
    this.featureNamespace = featureNamespace;
    return this;
  }

  /**
   * Namespace for the feature
   * @return featureNamespace
   **/
  @Schema(required = true, description = "Namespace for the feature")
      @NotNull

    public String getFeatureNamespace() {
    return featureNamespace;
  }

  public void setFeatureNamespace(String featureNamespace) {
    this.featureNamespace = featureNamespace;
  }

  public MLFeatureKey name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the feature
   * @return name
   **/
  @Schema(required = true, description = "Name of the feature")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLFeatureKey mlFeatureKey = (MLFeatureKey) o;
    return Objects.equals(this.featureNamespace, mlFeatureKey.featureNamespace) &&
        Objects.equals(this.name, mlFeatureKey.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureNamespace, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLFeatureKey {\n");
    
    sb.append("    featureNamespace: ").append(toIndentedString(featureNamespace)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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