package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataTransform;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Information about a Query against one or more data assets (e.g. Tables or Views).
 */
@Schema(description = "Information about a Query against one or more data assets (e.g. Tables or Views).")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataTransformLogic  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataTransformLogic") @Builder.Default
  private String __type = "DataTransformLogic";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataTransformLogic"},
  defaultValue = "DataTransformLogic")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("transforms") @Builder.Default
  @Valid
  private List<DataTransform> transforms = new ArrayList<>();

  public DataTransformLogic transforms(List<DataTransform> transforms) {
    this.transforms = transforms;
    return this;
  }

  public DataTransformLogic addTransformsItem(DataTransform transformsItem) {
    this.transforms.add(transformsItem);
    return this;
  }

  /**
   * List of transformations applied
   * @return transforms
   **/
  @Schema(required = true, description = "List of transformations applied")
      @NotNull
    @Valid
    public List<DataTransform> getTransforms() {
    return transforms;
  }

  public void setTransforms(List<DataTransform> transforms) {
    this.transforms = transforms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataTransformLogic dataTransformLogic = (DataTransformLogic) o;
    return Objects.equals(this.transforms, dataTransformLogic.transforms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transforms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataTransformLogic {\n");
    
    sb.append("    transforms: ").append(toIndentedString(transforms)).append("\n");
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