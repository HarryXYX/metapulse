package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.PartitionSpec;
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
 * TimeseriesAspectBase
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimeseriesAspectBase   {

  @JsonProperty("timestampMillis") @Builder.Default
  private Long timestampMillis = null;

  @JsonProperty("eventGranularity") @Builder.Default
  private TimeWindowSize eventGranularity = null;

  @JsonProperty("partitionSpec") @Builder.Default
  private PartitionSpec partitionSpec = null;

  @JsonProperty("messageId") @Builder.Default
  private String messageId = null;

  public TimeseriesAspectBase timestampMillis(Long timestampMillis) {
    this.timestampMillis = timestampMillis;
    return this;
  }

  /**
   * The event timestamp field as epoch at UTC in milli seconds.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return timestampMillis
   **/
  @Schema(required = true, description = "The event timestamp field as epoch at UTC in milli seconds.")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getTimestampMillis() {
    return timestampMillis;
  }

  public void setTimestampMillis(Long timestampMillis) {
    this.timestampMillis = timestampMillis;
  }

  public TimeseriesAspectBase eventGranularity(TimeWindowSize eventGranularity) {
    this.eventGranularity = eventGranularity;
    return this;
  }

  /**
   * Get eventGranularity
   * @return eventGranularity
   **/
  @Schema(description = "")
  
    @Valid
    public TimeWindowSize getEventGranularity() {
    return eventGranularity;
  }

  public void setEventGranularity(TimeWindowSize eventGranularity) {
    this.eventGranularity = eventGranularity;
  }

  public TimeseriesAspectBase partitionSpec(PartitionSpec partitionSpec) {
    this.partitionSpec = partitionSpec;
    return this;
  }

  /**
   * Get partitionSpec
   * @return partitionSpec
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PartitionSpec getPartitionSpec() {
    return partitionSpec;
  }

  public void setPartitionSpec(PartitionSpec partitionSpec) {
    this.partitionSpec = partitionSpec;
  }

  public TimeseriesAspectBase messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * The optional messageId, if provided serves as a custom user-defined unique identifier for an aspect value.
   * @return messageId
   **/
  @Schema(description = "The optional messageId, if provided serves as a custom user-defined unique identifier for an aspect value.")
  
    public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesAspectBase timeseriesAspectBase = (TimeseriesAspectBase) o;
    return Objects.equals(this.timestampMillis, timeseriesAspectBase.timestampMillis) &&
        Objects.equals(this.eventGranularity, timeseriesAspectBase.eventGranularity) &&
        Objects.equals(this.partitionSpec, timeseriesAspectBase.partitionSpec) &&
        Objects.equals(this.messageId, timeseriesAspectBase.messageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestampMillis, eventGranularity, partitionSpec, messageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesAspectBase {\n");
    
    sb.append("    timestampMillis: ").append(toIndentedString(timestampMillis)).append("\n");
    sb.append("    eventGranularity: ").append(toIndentedString(eventGranularity)).append("\n");
    sb.append("    partitionSpec: ").append(toIndentedString(partitionSpec)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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