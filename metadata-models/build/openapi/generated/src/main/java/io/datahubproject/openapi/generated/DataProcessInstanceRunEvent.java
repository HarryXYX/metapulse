package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataProcessInstanceRunResult;
import io.datahubproject.openapi.generated.DataProcessRunStatus;
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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * An event representing the current status of data process run. DataProcessRunEvent should be used for reporting the status of a dataProcess&#x27; run.
 */
@Schema(description = "An event representing the current status of data process run. DataProcessRunEvent should be used for reporting the status of a dataProcess' run.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataProcessInstanceRunEvent  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataProcessInstanceRunEvent") @Builder.Default
  private String __type = "DataProcessInstanceRunEvent";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataProcessInstanceRunEvent"},
  defaultValue = "DataProcessInstanceRunEvent")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("timestampMillis") @Builder.Default
  private Long timestampMillis = null;

  @JsonProperty("eventGranularity") @Builder.Default
  private TimeWindowSize eventGranularity = null;

  @JsonProperty("partitionSpec") @Builder.Default
  private PartitionSpec partitionSpec = null;

  @JsonProperty("messageId") @Builder.Default
  private String messageId = null;

  @JsonProperty("externalUrl") @Builder.Default
  private String externalUrl = null;

  @JsonProperty("status") @Builder.Default
  private DataProcessRunStatus status = null;

  @JsonProperty("attempt") @Builder.Default
  private Integer attempt = null;

  @JsonProperty("result") @Builder.Default
  private DataProcessInstanceRunResult result = null;

  @JsonProperty("durationMillis") @Builder.Default
  private Long durationMillis = null;

  public DataProcessInstanceRunEvent timestampMillis(Long timestampMillis) {
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

  public DataProcessInstanceRunEvent eventGranularity(TimeWindowSize eventGranularity) {
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

  public DataProcessInstanceRunEvent partitionSpec(PartitionSpec partitionSpec) {
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

  public DataProcessInstanceRunEvent messageId(String messageId) {
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

  public DataProcessInstanceRunEvent externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

  /**
   * URL where the reference exist
   * @return externalUrl
   **/
  @Schema(description = "URL where the reference exist")
  
    public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public DataProcessInstanceRunEvent status(DataProcessRunStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DataProcessRunStatus getStatus() {
    return status;
  }

  public void setStatus(DataProcessRunStatus status) {
    this.status = status;
  }

  public DataProcessInstanceRunEvent attempt(Integer attempt) {
    this.attempt = attempt;
    return this;
  }

  /**
   * Return the try number that this Instance Run is in
   * minimum: -2147483648
   * maximum: 2147483647
   * @return attempt
   **/
  @Schema(description = "Return the try number that this Instance Run is in")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getAttempt() {
    return attempt;
  }

  public void setAttempt(Integer attempt) {
    this.attempt = attempt;
  }

  public DataProcessInstanceRunEvent result(DataProcessInstanceRunResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   **/
  @Schema(description = "")
  
    @Valid
    public DataProcessInstanceRunResult getResult() {
    return result;
  }

  public void setResult(DataProcessInstanceRunResult result) {
    this.result = result;
  }

  public DataProcessInstanceRunEvent durationMillis(Long durationMillis) {
    this.durationMillis = durationMillis;
    return this;
  }

  /**
   * The duration of the run in milliseconds.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return durationMillis
   **/
  @Schema(description = "The duration of the run in milliseconds.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getDurationMillis() {
    return durationMillis;
  }

  public void setDurationMillis(Long durationMillis) {
    this.durationMillis = durationMillis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataProcessInstanceRunEvent dataProcessInstanceRunEvent = (DataProcessInstanceRunEvent) o;
    return Objects.equals(this.timestampMillis, dataProcessInstanceRunEvent.timestampMillis) &&
        Objects.equals(this.eventGranularity, dataProcessInstanceRunEvent.eventGranularity) &&
        Objects.equals(this.partitionSpec, dataProcessInstanceRunEvent.partitionSpec) &&
        Objects.equals(this.messageId, dataProcessInstanceRunEvent.messageId) &&
        Objects.equals(this.externalUrl, dataProcessInstanceRunEvent.externalUrl) &&
        Objects.equals(this.status, dataProcessInstanceRunEvent.status) &&
        Objects.equals(this.attempt, dataProcessInstanceRunEvent.attempt) &&
        Objects.equals(this.result, dataProcessInstanceRunEvent.result) &&
        Objects.equals(this.durationMillis, dataProcessInstanceRunEvent.durationMillis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestampMillis, eventGranularity, partitionSpec, messageId, externalUrl, status, attempt, result, durationMillis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataProcessInstanceRunEvent {\n");
    
    sb.append("    timestampMillis: ").append(toIndentedString(timestampMillis)).append("\n");
    sb.append("    eventGranularity: ").append(toIndentedString(eventGranularity)).append("\n");
    sb.append("    partitionSpec: ").append(toIndentedString(partitionSpec)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    attempt: ").append(toIndentedString(attempt)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    durationMillis: ").append(toIndentedString(durationMillis)).append("\n");
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