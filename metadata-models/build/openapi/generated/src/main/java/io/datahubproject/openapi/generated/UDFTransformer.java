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
 * Field transformation expressed in UDF
 */
@Schema(description = "Field transformation expressed in UDF")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UDFTransformer  implements OneOfBaseFieldMappingTransformation, OneOfDatasetFieldMappingTransformation {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "UDFTransformer") @Builder.Default
  private String __type = "UDFTransformer";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"UDFTransformer"},
  defaultValue = "UDFTransformer")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("udf") @Builder.Default
  private String udf = null;

  public UDFTransformer udf(String udf) {
    this.udf = udf;
    return this;
  }

  /**
   * A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.
   * @return udf
   **/
  @Schema(required = true, description = "A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.")
      @NotNull

    public String getUdf() {
    return udf;
  }

  public void setUdf(String udf) {
    this.udf = udf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UDFTransformer udFTransformer = (UDFTransformer) o;
    return Objects.equals(this.udf, udFTransformer.udf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(udf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UDFTransformer {\n");
    
    sb.append("    udf: ").append(toIndentedString(udf)).append("\n");
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