package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssertionStdParameter;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Parameters for AssertionStdOperators.
 */
@Schema(description = "Parameters for AssertionStdOperators.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssertionStdParameters   {

  @JsonProperty("value") @Builder.Default
  private AssertionStdParameter value = null;

  @JsonProperty("maxValue") @Builder.Default
  private AssertionStdParameter maxValue = null;

  @JsonProperty("minValue") @Builder.Default
  private AssertionStdParameter minValue = null;

  public AssertionStdParameters value(AssertionStdParameter value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionStdParameter getValue() {
    return value;
  }

  public void setValue(AssertionStdParameter value) {
    this.value = value;
  }

  public AssertionStdParameters maxValue(AssertionStdParameter maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * Get maxValue
   * @return maxValue
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionStdParameter getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(AssertionStdParameter maxValue) {
    this.maxValue = maxValue;
  }

  public AssertionStdParameters minValue(AssertionStdParameter minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * Get minValue
   * @return minValue
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionStdParameter getMinValue() {
    return minValue;
  }

  public void setMinValue(AssertionStdParameter minValue) {
    this.minValue = minValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssertionStdParameters assertionStdParameters = (AssertionStdParameters) o;
    return Objects.equals(this.value, assertionStdParameters.value) &&
        Objects.equals(this.maxValue, assertionStdParameters.maxValue) &&
        Objects.equals(this.minValue, assertionStdParameters.minValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, maxValue, minValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssertionStdParameters {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
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