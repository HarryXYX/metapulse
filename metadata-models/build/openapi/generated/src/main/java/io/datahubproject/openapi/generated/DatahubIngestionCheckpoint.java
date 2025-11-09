package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.IngestionCheckpointState;
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
 * Checkpoint of a datahub ingestion run for a given job.
 */
@Schema(description = "Checkpoint of a datahub ingestion run for a given job.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatahubIngestionCheckpoint  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DatahubIngestionCheckpoint") @Builder.Default
  private String __type = "DatahubIngestionCheckpoint";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DatahubIngestionCheckpoint"},
  defaultValue = "DatahubIngestionCheckpoint")
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

  @JsonProperty("pipelineName") @Builder.Default
  private String pipelineName = null;

  @JsonProperty("platformInstanceId") @Builder.Default
  private String platformInstanceId = null;

  @JsonProperty("config") @Builder.Default
  private String config = null;

  @JsonProperty("state") @Builder.Default
  private IngestionCheckpointState state = null;

  @JsonProperty("runId") @Builder.Default
  private String runId = null;

  public DatahubIngestionCheckpoint timestampMillis(Long timestampMillis) {
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

  public DatahubIngestionCheckpoint eventGranularity(TimeWindowSize eventGranularity) {
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

  public DatahubIngestionCheckpoint partitionSpec(PartitionSpec partitionSpec) {
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

  public DatahubIngestionCheckpoint messageId(String messageId) {
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

  public DatahubIngestionCheckpoint pipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
    return this;
  }

  /**
   * The name of the pipeline that ran ingestion, a stable unique user provided identifier.  e.g. my_snowflake1-to-datahub.
   * @return pipelineName
   **/
  @Schema(required = true, description = "The name of the pipeline that ran ingestion, a stable unique user provided identifier.  e.g. my_snowflake1-to-datahub.")
      @NotNull

    public String getPipelineName() {
    return pipelineName;
  }

  public void setPipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
  }

  public DatahubIngestionCheckpoint platformInstanceId(String platformInstanceId) {
    this.platformInstanceId = platformInstanceId;
    return this;
  }

  /**
   * The id of the instance against which the ingestion pipeline ran. e.g.: Bigquery project ids, MySQL hostnames etc.
   * @return platformInstanceId
   **/
  @Schema(required = true, description = "The id of the instance against which the ingestion pipeline ran. e.g.: Bigquery project ids, MySQL hostnames etc.")
      @NotNull

    public String getPlatformInstanceId() {
    return platformInstanceId;
  }

  public void setPlatformInstanceId(String platformInstanceId) {
    this.platformInstanceId = platformInstanceId;
  }

  public DatahubIngestionCheckpoint config(String config) {
    this.config = config;
    return this;
  }

  /**
   * Json-encoded string representation of the non-secret members of the config .
   * @return config
   **/
  @Schema(required = true, description = "Json-encoded string representation of the non-secret members of the config .")
      @NotNull

    public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }

  public DatahubIngestionCheckpoint state(IngestionCheckpointState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public IngestionCheckpointState getState() {
    return state;
  }

  public void setState(IngestionCheckpointState state) {
    this.state = state;
  }

  public DatahubIngestionCheckpoint runId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * The run identifier of this job.
   * @return runId
   **/
  @Schema(required = true, description = "The run identifier of this job.")
      @NotNull

    public String getRunId() {
    return runId;
  }

  public void setRunId(String runId) {
    this.runId = runId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatahubIngestionCheckpoint datahubIngestionCheckpoint = (DatahubIngestionCheckpoint) o;
    return Objects.equals(this.timestampMillis, datahubIngestionCheckpoint.timestampMillis) &&
        Objects.equals(this.eventGranularity, datahubIngestionCheckpoint.eventGranularity) &&
        Objects.equals(this.partitionSpec, datahubIngestionCheckpoint.partitionSpec) &&
        Objects.equals(this.messageId, datahubIngestionCheckpoint.messageId) &&
        Objects.equals(this.pipelineName, datahubIngestionCheckpoint.pipelineName) &&
        Objects.equals(this.platformInstanceId, datahubIngestionCheckpoint.platformInstanceId) &&
        Objects.equals(this.config, datahubIngestionCheckpoint.config) &&
        Objects.equals(this.state, datahubIngestionCheckpoint.state) &&
        Objects.equals(this.runId, datahubIngestionCheckpoint.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestampMillis, eventGranularity, partitionSpec, messageId, pipelineName, platformInstanceId, config, state, runId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatahubIngestionCheckpoint {\n");
    
    sb.append("    timestampMillis: ").append(toIndentedString(timestampMillis)).append("\n");
    sb.append("    eventGranularity: ").append(toIndentedString(eventGranularity)).append("\n");
    sb.append("    partitionSpec: ").append(toIndentedString(partitionSpec)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
    sb.append("    platformInstanceId: ").append(toIndentedString(platformInstanceId)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
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