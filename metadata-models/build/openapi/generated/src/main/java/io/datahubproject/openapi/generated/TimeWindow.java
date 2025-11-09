package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.TimeWindowSize;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * TimeWindow
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimeWindow   {

  @JsonProperty("startTimeMillis") @Builder.Default
  private Long startTimeMillis = null;

  @JsonProperty("length") @Builder.Default
  private TimeWindowSize length = null;

  public TimeWindow startTimeMillis(Long startTimeMillis) {
    this.startTimeMillis = startTimeMillis;
    return this;
  }

  /**
   * Start time as epoch at UTC.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return startTimeMillis
   **/
  @Schema(required = true, description = "Start time as epoch at UTC.")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getStartTimeMillis() {
    return startTimeMillis;
  }

  public void setStartTimeMillis(Long startTimeMillis) {
    this.startTimeMillis = startTimeMillis;
  }

  public TimeWindow length(TimeWindowSize length) {
    this.length = length;
    return this;
  }

  /**
   * Get length
   * @return length
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public TimeWindowSize getLength() {
    return length;
  }

  public void setLength(TimeWindowSize length) {
    this.length = length;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeWindow timeWindow = (TimeWindow) o;
    return Objects.equals(this.startTimeMillis, timeWindow.startTimeMillis) &&
        Objects.equals(this.length, timeWindow.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTimeMillis, length);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeWindow {\n");
    
    sb.append("    startTimeMillis: ").append(toIndentedString(startTimeMillis)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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