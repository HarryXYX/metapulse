package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.CalendarInterval;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Defines the size of a time window.
 */
@Schema(description = "Defines the size of a time window.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimeWindowSize   {

  @JsonProperty("unit") @Builder.Default
  private CalendarInterval unit = null;

  @JsonProperty("multiple") @Builder.Default
  private Integer multiple = 1;

  public TimeWindowSize unit(CalendarInterval unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public CalendarInterval getUnit() {
    return unit;
  }

  public void setUnit(CalendarInterval unit) {
    this.unit = unit;
  }

  public TimeWindowSize multiple(Integer multiple) {
    this.multiple = multiple;
    return this;
  }

  /**
   * How many units. Defaults to 1.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return multiple
   **/
  @Schema(required = true, description = "How many units. Defaults to 1.")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getMultiple() {
    return multiple;
  }

  public void setMultiple(Integer multiple) {
    this.multiple = multiple;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeWindowSize timeWindowSize = (TimeWindowSize) o;
    return Objects.equals(this.unit, timeWindowSize.unit) &&
        Objects.equals(this.multiple, timeWindowSize.multiple);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, multiple);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeWindowSize {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    multiple: ").append(toIndentedString(multiple)).append("\n");
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