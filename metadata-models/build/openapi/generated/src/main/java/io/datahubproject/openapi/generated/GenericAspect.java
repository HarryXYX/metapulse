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
/**
 * Generic record structure for serializing an Aspect
 */
@Schema(description = "Generic record structure for serializing an Aspect")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenericAspect   {

  @JsonProperty("value") @Builder.Default
  private OneOfGenericAspectValue value = null;

  @JsonProperty("contentType") @Builder.Default
  private String contentType = null;

  public GenericAspect value(OneOfGenericAspectValue value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(required = true, description = "")
      @NotNull

    public OneOfGenericAspectValue getValue() {
    return value;
  }

  public void setValue(OneOfGenericAspectValue value) {
    this.value = value;
  }

  public GenericAspect contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * The content type, which represents the fashion in which the aspect was serialized. The only type currently supported is application/json.
   * @return contentType
   **/
  @Schema(required = true, description = "The content type, which represents the fashion in which the aspect was serialized. The only type currently supported is application/json.")
      @NotNull

    public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericAspect genericAspect = (GenericAspect) o;
    return Objects.equals(this.value, genericAspect.value) &&
        Objects.equals(this.contentType, genericAspect.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, contentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericAspect {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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