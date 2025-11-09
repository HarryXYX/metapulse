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
 * Attributes defining a CRON-formatted schedule.
 */
@Schema(description = "Attributes defining a CRON-formatted schedule.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CronSchedule   {

  @JsonProperty("cron") @Builder.Default
  private String cron = null;

  @JsonProperty("timezone") @Builder.Default
  private String timezone = null;

  public CronSchedule cron(String cron) {
    this.cron = cron;
    return this;
  }

  /**
   * A cron-formatted execution interval, as a cron string, e.g. 1 * * * *
   * @return cron
   **/
  @Schema(required = true, description = "A cron-formatted execution interval, as a cron string, e.g. 1 * * * *")
      @NotNull

    public String getCron() {
    return cron;
  }

  public void setCron(String cron) {
    this.cron = cron;
  }

  public CronSchedule timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Timezone in which the cron interval applies, e.g. America/Los Angeles
   * @return timezone
   **/
  @Schema(required = true, description = "Timezone in which the cron interval applies, e.g. America/Los Angeles")
      @NotNull

    public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CronSchedule cronSchedule = (CronSchedule) o;
    return Objects.equals(this.cron, cronSchedule.cron) &&
        Objects.equals(this.timezone, cronSchedule.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cron, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CronSchedule {\n");
    
    sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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