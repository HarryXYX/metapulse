package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FabricType;
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
 * Key for an ML model group
 */
@Schema(description = "Key for an ML model group")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLModelGroupKey  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfMLModelGroupSnapshotAspectsItems {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MLModelGroupKey") @Builder.Default
  private String __type = "MLModelGroupKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MLModelGroupKey"},
  defaultValue = "MLModelGroupKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("platform") @Builder.Default
  private String platform = null;

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("origin") @Builder.Default
  private FabricType origin = null;

  public MLModelGroupKey platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Standardized platform urn for the model group
   * @return platform
   **/
  @Schema(required = true, description = "Standardized platform urn for the model group")
      @NotNull

    public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public MLModelGroupKey name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the MLModelGroup
   * @return name
   **/
  @Schema(required = true, description = "Name of the MLModelGroup")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MLModelGroupKey origin(FabricType origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Get origin
   * @return origin
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public FabricType getOrigin() {
    return origin;
  }

  public void setOrigin(FabricType origin) {
    this.origin = origin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLModelGroupKey mlModelGroupKey = (MLModelGroupKey) o;
    return Objects.equals(this.platform, mlModelGroupKey.platform) &&
        Objects.equals(this.name, mlModelGroupKey.name) &&
        Objects.equals(this.origin, mlModelGroupKey.origin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, name, origin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLModelGroupKey {\n");
    
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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