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
 * Keep records that are less than X seconds old
 */
@Schema(description = "Keep records that are less than X seconds old")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimeBasedRetention   {

  @JsonProperty("maxAgeInSeconds") @Builder.Default
  private Integer maxAgeInSeconds = null;

  public TimeBasedRetention maxAgeInSeconds(Integer maxAgeInSeconds) {
    this.maxAgeInSeconds = maxAgeInSeconds;
    return this;
  }

  /**
   * Get maxAgeInSeconds
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maxAgeInSeconds
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getMaxAgeInSeconds() {
    return maxAgeInSeconds;
  }

  public void setMaxAgeInSeconds(Integer maxAgeInSeconds) {
    this.maxAgeInSeconds = maxAgeInSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeBasedRetention timeBasedRetention = (TimeBasedRetention) o;
    return Objects.equals(this.maxAgeInSeconds, timeBasedRetention.maxAgeInSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxAgeInSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeBasedRetention {\n");
    
    sb.append("    maxAgeInSeconds: ").append(toIndentedString(maxAgeInSeconds)).append("\n");
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