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
 * ValueFrequency
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValueFrequency   {

  @JsonProperty("value") @Builder.Default
  private String value = null;

  @JsonProperty("frequency") @Builder.Default
  private Long frequency = null;

  public ValueFrequency value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ValueFrequency frequency(Long frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return frequency
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getFrequency() {
    return frequency;
  }

  public void setFrequency(Long frequency) {
    this.frequency = frequency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueFrequency valueFrequency = (ValueFrequency) o;
    return Objects.equals(this.value, valueFrequency.value) &&
        Objects.equals(this.frequency, valueFrequency.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, frequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueFrequency {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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