package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssertionResult;
import io.datahubproject.openapi.generated.AssertionRunStatus;
import io.datahubproject.openapi.generated.BatchSpec;
import io.datahubproject.openapi.generated.PartitionSpec;
import io.datahubproject.openapi.generated.TimeWindowSize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * An event representing the current status of evaluating an assertion on a batch. AssertionRunEvent should be used for reporting the status of a run as an assertion evaluation progresses.
 */
@Schema(description = "An event representing the current status of evaluating an assertion on a batch. AssertionRunEvent should be used for reporting the status of a run as an assertion evaluation progresses.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssertionRunEvent  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "AssertionRunEvent") @Builder.Default
  private String __type = "AssertionRunEvent";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"AssertionRunEvent"},
  defaultValue = "AssertionRunEvent")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("timestampMillis") @Builder.Default
  private Long timestampMillis = null;

  @JsonProperty("runId") @Builder.Default
  private String runId = null;

  @JsonProperty("asserteeUrn") @Builder.Default
  private String asserteeUrn = null;

  @JsonProperty("status") @Builder.Default
  private AssertionRunStatus status = null;

  @JsonProperty("result") @Builder.Default
  private AssertionResult result = null;

  @JsonProperty("runtimeContext") @Builder.Default
  @Valid
  private Map<String, String> runtimeContext = null;

  @JsonProperty("batchSpec") @Builder.Default
  private BatchSpec batchSpec = null;

  @JsonProperty("assertionUrn") @Builder.Default
  private String assertionUrn = null;

  @JsonProperty("eventGranularity") @Builder.Default
  private TimeWindowSize eventGranularity = null;

  @JsonProperty("partitionSpec") @Builder.Default
  private PartitionSpec partitionSpec = null;

  @JsonProperty("messageId") @Builder.Default
  private String messageId = null;

  public AssertionRunEvent timestampMillis(Long timestampMillis) {
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

  public AssertionRunEvent runId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   *  Native (platform-specific) identifier for this run
   * @return runId
   **/
  @Schema(required = true, description = " Native (platform-specific) identifier for this run")
      @NotNull

    public String getRunId() {
    return runId;
  }

  public void setRunId(String runId) {
    this.runId = runId;
  }

  public AssertionRunEvent asserteeUrn(String asserteeUrn) {
    this.asserteeUrn = asserteeUrn;
    return this;
  }

  /**
   * Get asserteeUrn
   * @return asserteeUrn
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getAsserteeUrn() {
    return asserteeUrn;
  }

  public void setAsserteeUrn(String asserteeUrn) {
    this.asserteeUrn = asserteeUrn;
  }

  public AssertionRunEvent status(AssertionRunStatus status) {
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
    public AssertionRunStatus getStatus() {
    return status;
  }

  public void setStatus(AssertionRunStatus status) {
    this.status = status;
  }

  public AssertionRunEvent result(AssertionResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionResult getResult() {
    return result;
  }

  public void setResult(AssertionResult result) {
    this.result = result;
  }

  public AssertionRunEvent runtimeContext(Map<String, String> runtimeContext) {
    this.runtimeContext = runtimeContext;
    return this;
  }

  public AssertionRunEvent putRuntimeContextItem(String key, String runtimeContextItem) {
    if (this.runtimeContext == null) {
      this.runtimeContext = new HashMap<>();
    }
    this.runtimeContext.put(key, runtimeContextItem);
    return this;
  }

  /**
   * Runtime parameters of evaluation
   * @return runtimeContext
   **/
  @Schema(description = "Runtime parameters of evaluation")
  
    public Map<String, String> getRuntimeContext() {
    return runtimeContext;
  }

  public void setRuntimeContext(Map<String, String> runtimeContext) {
    this.runtimeContext = runtimeContext;
  }

  public AssertionRunEvent batchSpec(BatchSpec batchSpec) {
    this.batchSpec = batchSpec;
    return this;
  }

  /**
   * Get batchSpec
   * @return batchSpec
   **/
  @Schema(description = "")
  
    @Valid
    public BatchSpec getBatchSpec() {
    return batchSpec;
  }

  public void setBatchSpec(BatchSpec batchSpec) {
    this.batchSpec = batchSpec;
  }

  public AssertionRunEvent assertionUrn(String assertionUrn) {
    this.assertionUrn = assertionUrn;
    return this;
  }

  /**
   * Get assertionUrn
   * @return assertionUrn
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getAssertionUrn() {
    return assertionUrn;
  }

  public void setAssertionUrn(String assertionUrn) {
    this.assertionUrn = assertionUrn;
  }

  public AssertionRunEvent eventGranularity(TimeWindowSize eventGranularity) {
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

  public AssertionRunEvent partitionSpec(PartitionSpec partitionSpec) {
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

  public AssertionRunEvent messageId(String messageId) {
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
    AssertionRunEvent assertionRunEvent = (AssertionRunEvent) o;
    return Objects.equals(this.timestampMillis, assertionRunEvent.timestampMillis) &&
        Objects.equals(this.runId, assertionRunEvent.runId) &&
        Objects.equals(this.asserteeUrn, assertionRunEvent.asserteeUrn) &&
        Objects.equals(this.status, assertionRunEvent.status) &&
        Objects.equals(this.result, assertionRunEvent.result) &&
        Objects.equals(this.runtimeContext, assertionRunEvent.runtimeContext) &&
        Objects.equals(this.batchSpec, assertionRunEvent.batchSpec) &&
        Objects.equals(this.assertionUrn, assertionRunEvent.assertionUrn) &&
        Objects.equals(this.eventGranularity, assertionRunEvent.eventGranularity) &&
        Objects.equals(this.partitionSpec, assertionRunEvent.partitionSpec) &&
        Objects.equals(this.messageId, assertionRunEvent.messageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestampMillis, runId, asserteeUrn, status, result, runtimeContext, batchSpec, assertionUrn, eventGranularity, partitionSpec, messageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssertionRunEvent {\n");
    
    sb.append("    timestampMillis: ").append(toIndentedString(timestampMillis)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    asserteeUrn: ").append(toIndentedString(asserteeUrn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    runtimeContext: ").append(toIndentedString(runtimeContext)).append("\n");
    sb.append("    batchSpec: ").append(toIndentedString(batchSpec)).append("\n");
    sb.append("    assertionUrn: ").append(toIndentedString(assertionUrn)).append("\n");
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