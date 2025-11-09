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
 * Key for an MLFeatureTable
 */
@Schema(description = "Key for an MLFeatureTable")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLFeatureTableKey  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfMLFeatureTableSnapshotAspectsItems {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MLFeatureTableKey") @Builder.Default
  private String __type = "MLFeatureTableKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MLFeatureTableKey"},
  defaultValue = "MLFeatureTableKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("platform") @Builder.Default
  private String platform = null;

  @JsonProperty("name") @Builder.Default
  private String name = null;

  public MLFeatureTableKey platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Data platform urn associated with the feature table
   * @return platform
   **/
  @Schema(required = true, description = "Data platform urn associated with the feature table")
      @NotNull

    public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public MLFeatureTableKey name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the feature table
   * @return name
   **/
  @Schema(required = true, description = "Name of the feature table")
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
    MLFeatureTableKey mlFeatureTableKey = (MLFeatureTableKey) o;
    return Objects.equals(this.platform, mlFeatureTableKey.platform) &&
        Objects.equals(this.name, mlFeatureTableKey.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLFeatureTableKey {\n");
    
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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