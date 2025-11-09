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
 * A standard event timestamp
 */
@Schema(description = "A standard event timestamp")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimeStamp   {

  @JsonProperty("time") @Builder.Default
  private Long time = null;

  @JsonProperty("actor") @Builder.Default
  private String actor = null;

  public TimeStamp time(Long time) {
    this.time = time;
    return this;
  }

  /**
   * When did the event occur
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return time
   **/
  @Schema(required = true, description = "When did the event occur")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public TimeStamp actor(String actor) {
    this.actor = actor;
    return this;
  }

  /**
   * Optional: The actor urn involved in the event.
   * @return actor
   **/
  @Schema(description = "Optional: The actor urn involved in the event.")
  
    public String getActor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeStamp timeStamp = (TimeStamp) o;
    return Objects.equals(this.time, timeStamp.time) &&
        Objects.equals(this.actor, timeStamp.actor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, actor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeStamp {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
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