package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FixedIntervalSchedule;
import io.datahubproject.openapi.generated.FreshnessAssertionScheduleType;
import io.datahubproject.openapi.generated.FreshnessCronSchedule;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Attributes defining a single Freshness schedule.
 */
@Schema(description = "Attributes defining a single Freshness schedule.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FreshnessAssertionSchedule   {

  @JsonProperty("type") @Builder.Default
  private FreshnessAssertionScheduleType type = null;

  @JsonProperty("cron") @Builder.Default
  private FreshnessCronSchedule cron = null;

  @JsonProperty("fixedInterval") @Builder.Default
  private FixedIntervalSchedule fixedInterval = null;

  public FreshnessAssertionSchedule type(FreshnessAssertionScheduleType type) {
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
    public FreshnessAssertionScheduleType getType() {
    return type;
  }

  public void setType(FreshnessAssertionScheduleType type) {
    this.type = type;
  }

  public FreshnessAssertionSchedule cron(FreshnessCronSchedule cron) {
    this.cron = cron;
    return this;
  }

  /**
   * Get cron
   * @return cron
   **/
  @Schema(description = "")
  
    @Valid
    public FreshnessCronSchedule getCron() {
    return cron;
  }

  public void setCron(FreshnessCronSchedule cron) {
    this.cron = cron;
  }

  public FreshnessAssertionSchedule fixedInterval(FixedIntervalSchedule fixedInterval) {
    this.fixedInterval = fixedInterval;
    return this;
  }

  /**
   * Get fixedInterval
   * @return fixedInterval
   **/
  @Schema(description = "")
  
    @Valid
    public FixedIntervalSchedule getFixedInterval() {
    return fixedInterval;
  }

  public void setFixedInterval(FixedIntervalSchedule fixedInterval) {
    this.fixedInterval = fixedInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreshnessAssertionSchedule freshnessAssertionSchedule = (FreshnessAssertionSchedule) o;
    return Objects.equals(this.type, freshnessAssertionSchedule.type) &&
        Objects.equals(this.cron, freshnessAssertionSchedule.cron) &&
        Objects.equals(this.fixedInterval, freshnessAssertionSchedule.fixedInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, cron, fixedInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreshnessAssertionSchedule {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
    sb.append("    fixedInterval: ").append(toIndentedString(fixedInterval)).append("\n");
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