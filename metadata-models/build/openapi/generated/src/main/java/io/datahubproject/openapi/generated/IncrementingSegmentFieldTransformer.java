package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.IncrementingSegmentFieldTransformerType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * The definition of the transformer function  that should be applied to a given field / column value in a dataset in order to determine the segment or bucket that it belongs to, which in turn is used to evaluate volume assertions.
 */
@Schema(description = "The definition of the transformer function  that should be applied to a given field / column value in a dataset in order to determine the segment or bucket that it belongs to, which in turn is used to evaluate volume assertions.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncrementingSegmentFieldTransformer   {

  @JsonProperty("type") @Builder.Default
  private IncrementingSegmentFieldTransformerType type = null;

  @JsonProperty("nativeType") @Builder.Default
  private String nativeType = null;

  public IncrementingSegmentFieldTransformer type(IncrementingSegmentFieldTransformerType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public IncrementingSegmentFieldTransformerType getType() {
    return type;
  }

  public void setType(IncrementingSegmentFieldTransformerType type) {
    this.type = type;
  }

  public IncrementingSegmentFieldTransformer nativeType(String nativeType) {
    this.nativeType = nativeType;
    return this;
  }

  /**
   * The 'native' transformer type, useful as a back door if a custom operator is required. This field is required if the type is NATIVE.
   * @return nativeType
   **/
  @Schema(description = "The 'native' transformer type, useful as a back door if a custom operator is required. This field is required if the type is NATIVE.")
  
    public String getNativeType() {
    return nativeType;
  }

  public void setNativeType(String nativeType) {
    this.nativeType = nativeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncrementingSegmentFieldTransformer incrementingSegmentFieldTransformer = (IncrementingSegmentFieldTransformer) o;
    return Objects.equals(this.type, incrementingSegmentFieldTransformer.type) &&
        Objects.equals(this.nativeType, incrementingSegmentFieldTransformer.nativeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, nativeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncrementingSegmentFieldTransformer {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    nativeType: ").append(toIndentedString(nativeType)).append("\n");
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