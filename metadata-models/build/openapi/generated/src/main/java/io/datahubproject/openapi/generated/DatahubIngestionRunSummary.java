package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.JobStatus;
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
 * Summary of a datahub ingestion run for a given platform.
 */
@Schema(description = "Summary of a datahub ingestion run for a given platform.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatahubIngestionRunSummary  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DatahubIngestionRunSummary") @Builder.Default
  private String __type = "DatahubIngestionRunSummary";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DatahubIngestionRunSummary"},
  defaultValue = "DatahubIngestionRunSummary")
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

  @JsonProperty("runId") @Builder.Default
  private String runId = null;

  @JsonProperty("runStatus") @Builder.Default
  private JobStatus runStatus = null;

  @JsonProperty("numWorkUnitsCommitted") @Builder.Default
  private Long numWorkUnitsCommitted = null;

  @JsonProperty("numWorkUnitsCreated") @Builder.Default
  private Long numWorkUnitsCreated = null;

  @JsonProperty("numEvents") @Builder.Default
  private Long numEvents = null;

  @JsonProperty("numEntities") @Builder.Default
  private Long numEntities = null;

  @JsonProperty("numAspects") @Builder.Default
  private Long numAspects = null;

  @JsonProperty("numSourceAPICalls") @Builder.Default
  private Long numSourceAPICalls = null;

  @JsonProperty("totalLatencySourceAPICalls") @Builder.Default
  private Long totalLatencySourceAPICalls = null;

  @JsonProperty("numSinkAPICalls") @Builder.Default
  private Long numSinkAPICalls = null;

  @JsonProperty("totalLatencySinkAPICalls") @Builder.Default
  private Long totalLatencySinkAPICalls = null;

  @JsonProperty("numWarnings") @Builder.Default
  private Long numWarnings = null;

  @JsonProperty("numErrors") @Builder.Default
  private Long numErrors = null;

  @JsonProperty("numEntitiesSkipped") @Builder.Default
  private Long numEntitiesSkipped = null;

  @JsonProperty("config") @Builder.Default
  private String config = null;

  @JsonProperty("custom_summary") @Builder.Default
  private String customSummary = null;

  @JsonProperty("softwareVersion") @Builder.Default
  private String softwareVersion = null;

  @JsonProperty("systemHostName") @Builder.Default
  private String systemHostName = null;

  @JsonProperty("operatingSystemName") @Builder.Default
  private String operatingSystemName = null;

  @JsonProperty("numProcessors") @Builder.Default
  private Integer numProcessors = null;

  @JsonProperty("totalMemory") @Builder.Default
  private Long totalMemory = null;

  @JsonProperty("availableMemory") @Builder.Default
  private Long availableMemory = null;

  public DatahubIngestionRunSummary timestampMillis(Long timestampMillis) {
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

  public DatahubIngestionRunSummary eventGranularity(TimeWindowSize eventGranularity) {
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

  public DatahubIngestionRunSummary partitionSpec(PartitionSpec partitionSpec) {
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

  public DatahubIngestionRunSummary messageId(String messageId) {
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

  public DatahubIngestionRunSummary pipelineName(String pipelineName) {
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

  public DatahubIngestionRunSummary platformInstanceId(String platformInstanceId) {
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

  public DatahubIngestionRunSummary runId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * The runId for this pipeline instance.
   * @return runId
   **/
  @Schema(required = true, description = "The runId for this pipeline instance.")
      @NotNull

    public String getRunId() {
    return runId;
  }

  public void setRunId(String runId) {
    this.runId = runId;
  }

  public DatahubIngestionRunSummary runStatus(JobStatus runStatus) {
    this.runStatus = runStatus;
    return this;
  }

  /**
   * Get runStatus
   * @return runStatus
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public JobStatus getRunStatus() {
    return runStatus;
  }

  public void setRunStatus(JobStatus runStatus) {
    this.runStatus = runStatus;
  }

  public DatahubIngestionRunSummary numWorkUnitsCommitted(Long numWorkUnitsCommitted) {
    this.numWorkUnitsCommitted = numWorkUnitsCommitted;
    return this;
  }

  /**
   * The number of workunits written to sink.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return numWorkUnitsCommitted
   **/
  @Schema(description = "The number of workunits written to sink.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getNumWorkUnitsCommitted() {
    return numWorkUnitsCommitted;
  }

  public void setNumWorkUnitsCommitted(Long numWorkUnitsCommitted) {
    this.numWorkUnitsCommitted = numWorkUnitsCommitted;
  }

  public DatahubIngestionRunSummary numWorkUnitsCreated(Long numWorkUnitsCreated) {
    this.numWorkUnitsCreated = numWorkUnitsCreated;
    return this;
  }

  /**
   * The number of workunits that are produced.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return numWorkUnitsCreated
   **/
  @Schema(description = "The number of workunits that are produced.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getNumWorkUnitsCreated() {
    return numWorkUnitsCreated;
  }

  public void setNumWorkUnitsCreated(Long numWorkUnitsCreated) {
    this.numWorkUnitsCreated = numWorkUnitsCreated;
  }

  public DatahubIngestionRunSummary numEvents(Long numEvents) {
    this.numEvents = numEvents;
    return this;
  }

  /**
   * The number of events produced (MCE + MCP).
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return numEvents
   **/
  @Schema(description = "The number of events produced (MCE + MCP).")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getNumEvents() {
    return numEvents;
  }

  public void setNumEvents(Long numEvents) {
    this.numEvents = numEvents;
  }

  public DatahubIngestionRunSummary numEntities(Long numEntities) {
    this.numEntities = numEntities;
    return this;
  }

  /**
   * The total number of entities produced (unique entity urns).
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return numEntities
   **/
  @Schema(description = "The total number of entities produced (unique entity urns).")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getNumEntities() {
    return numEntities;
  }

  public void setNumEntities(Long numEntities) {
    this.numEntities = numEntities;
  }

  public DatahubIngestionRunSummary numAspects(Long numAspects) {
    this.numAspects = numAspects;
    return this;
  }

  /**
   * The total number of aspects produced across all entities.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return numAspects
   **/
  @Schema(description = "The total number of aspects produced across all entities.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getNumAspects() {
    return numAspects;
  }

  public void setNumAspects(Long numAspects) {
    this.numAspects = numAspects;
  }

  public DatahubIngestionRunSummary numSourceAPICalls(Long numSourceAPICalls) {
    this.numSourceAPICalls = numSourceAPICalls;
    return this;
  }

  /**
   * Total number of source API calls.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return numSourceAPICalls
   **/
  @Schema(description = "Total number of source API calls.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getNumSourceAPICalls() {
    return numSourceAPICalls;
  }

  public void setNumSourceAPICalls(Long numSourceAPICalls) {
    this.numSourceAPICalls = numSourceAPICalls;
  }

  public DatahubIngestionRunSummary totalLatencySourceAPICalls(Long totalLatencySourceAPICalls) {
    this.totalLatencySourceAPICalls = totalLatencySourceAPICalls;
    return this;
  }

  /**
   * Total latency across all source API calls.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return totalLatencySourceAPICalls
   **/
  @Schema(description = "Total latency across all source API calls.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getTotalLatencySourceAPICalls() {
    return totalLatencySourceAPICalls;
  }

  public void setTotalLatencySourceAPICalls(Long totalLatencySourceAPICalls) {
    this.totalLatencySourceAPICalls = totalLatencySourceAPICalls;
  }

  public DatahubIngestionRunSummary numSinkAPICalls(Long numSinkAPICalls) {
    this.numSinkAPICalls = numSinkAPICalls;
    return this;
  }

  /**
   * Total number of sink API calls.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return numSinkAPICalls
   **/
  @Schema(description = "Total number of sink API calls.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getNumSinkAPICalls() {
    return numSinkAPICalls;
  }

  public void setNumSinkAPICalls(Long numSinkAPICalls) {
    this.numSinkAPICalls = numSinkAPICalls;
  }

  public DatahubIngestionRunSummary totalLatencySinkAPICalls(Long totalLatencySinkAPICalls) {
    this.totalLatencySinkAPICalls = totalLatencySinkAPICalls;
    return this;
  }

  /**
   * Total latency across all sink API calls.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return totalLatencySinkAPICalls
   **/
  @Schema(description = "Total latency across all sink API calls.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getTotalLatencySinkAPICalls() {
    return totalLatencySinkAPICalls;
  }

  public void setTotalLatencySinkAPICalls(Long totalLatencySinkAPICalls) {
    this.totalLatencySinkAPICalls = totalLatencySinkAPICalls;
  }

  public DatahubIngestionRunSummary numWarnings(Long numWarnings) {
    this.numWarnings = numWarnings;
    return this;
  }

  /**
   * Number of warnings generated.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return numWarnings
   **/
  @Schema(description = "Number of warnings generated.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getNumWarnings() {
    return numWarnings;
  }

  public void setNumWarnings(Long numWarnings) {
    this.numWarnings = numWarnings;
  }

  public DatahubIngestionRunSummary numErrors(Long numErrors) {
    this.numErrors = numErrors;
    return this;
  }

  /**
   * Number of errors generated.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return numErrors
   **/
  @Schema(description = "Number of errors generated.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getNumErrors() {
    return numErrors;
  }

  public void setNumErrors(Long numErrors) {
    this.numErrors = numErrors;
  }

  public DatahubIngestionRunSummary numEntitiesSkipped(Long numEntitiesSkipped) {
    this.numEntitiesSkipped = numEntitiesSkipped;
    return this;
  }

  /**
   * Number of entities skipped.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return numEntitiesSkipped
   **/
  @Schema(description = "Number of entities skipped.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getNumEntitiesSkipped() {
    return numEntitiesSkipped;
  }

  public void setNumEntitiesSkipped(Long numEntitiesSkipped) {
    this.numEntitiesSkipped = numEntitiesSkipped;
  }

  public DatahubIngestionRunSummary config(String config) {
    this.config = config;
    return this;
  }

  /**
   * The non-sensitive key-value pairs of the yaml config used as json string.
   * @return config
   **/
  @Schema(description = "The non-sensitive key-value pairs of the yaml config used as json string.")
  
    public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }

  public DatahubIngestionRunSummary customSummary(String customSummary) {
    this.customSummary = customSummary;
    return this;
  }

  /**
   * Custom value.
   * @return customSummary
   **/
  @Schema(description = "Custom value.")
  
    public String getCustomSummary() {
    return customSummary;
  }

  public void setCustomSummary(String customSummary) {
    this.customSummary = customSummary;
  }

  public DatahubIngestionRunSummary softwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
    return this;
  }

  /**
   * The software version of this ingestion.
   * @return softwareVersion
   **/
  @Schema(description = "The software version of this ingestion.")
  
    public String getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  public DatahubIngestionRunSummary systemHostName(String systemHostName) {
    this.systemHostName = systemHostName;
    return this;
  }

  /**
   * The hostname the ingestion pipeline ran on.
   * @return systemHostName
   **/
  @Schema(description = "The hostname the ingestion pipeline ran on.")
  
    public String getSystemHostName() {
    return systemHostName;
  }

  public void setSystemHostName(String systemHostName) {
    this.systemHostName = systemHostName;
  }

  public DatahubIngestionRunSummary operatingSystemName(String operatingSystemName) {
    this.operatingSystemName = operatingSystemName;
    return this;
  }

  /**
   * The os the ingestion pipeline ran on.
   * @return operatingSystemName
   **/
  @Schema(description = "The os the ingestion pipeline ran on.")
  
    public String getOperatingSystemName() {
    return operatingSystemName;
  }

  public void setOperatingSystemName(String operatingSystemName) {
    this.operatingSystemName = operatingSystemName;
  }

  public DatahubIngestionRunSummary numProcessors(Integer numProcessors) {
    this.numProcessors = numProcessors;
    return this;
  }

  /**
   * The number of processors on the host the ingestion pipeline ran on.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return numProcessors
   **/
  @Schema(description = "The number of processors on the host the ingestion pipeline ran on.")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getNumProcessors() {
    return numProcessors;
  }

  public void setNumProcessors(Integer numProcessors) {
    this.numProcessors = numProcessors;
  }

  public DatahubIngestionRunSummary totalMemory(Long totalMemory) {
    this.totalMemory = totalMemory;
    return this;
  }

  /**
   * The total amount of memory on the host the ingestion pipeline ran on.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return totalMemory
   **/
  @Schema(description = "The total amount of memory on the host the ingestion pipeline ran on.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getTotalMemory() {
    return totalMemory;
  }

  public void setTotalMemory(Long totalMemory) {
    this.totalMemory = totalMemory;
  }

  public DatahubIngestionRunSummary availableMemory(Long availableMemory) {
    this.availableMemory = availableMemory;
    return this;
  }

  /**
   * The available memory on the host the ingestion pipeline ran on.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return availableMemory
   **/
  @Schema(description = "The available memory on the host the ingestion pipeline ran on.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getAvailableMemory() {
    return availableMemory;
  }

  public void setAvailableMemory(Long availableMemory) {
    this.availableMemory = availableMemory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatahubIngestionRunSummary datahubIngestionRunSummary = (DatahubIngestionRunSummary) o;
    return Objects.equals(this.timestampMillis, datahubIngestionRunSummary.timestampMillis) &&
        Objects.equals(this.eventGranularity, datahubIngestionRunSummary.eventGranularity) &&
        Objects.equals(this.partitionSpec, datahubIngestionRunSummary.partitionSpec) &&
        Objects.equals(this.messageId, datahubIngestionRunSummary.messageId) &&
        Objects.equals(this.pipelineName, datahubIngestionRunSummary.pipelineName) &&
        Objects.equals(this.platformInstanceId, datahubIngestionRunSummary.platformInstanceId) &&
        Objects.equals(this.runId, datahubIngestionRunSummary.runId) &&
        Objects.equals(this.runStatus, datahubIngestionRunSummary.runStatus) &&
        Objects.equals(this.numWorkUnitsCommitted, datahubIngestionRunSummary.numWorkUnitsCommitted) &&
        Objects.equals(this.numWorkUnitsCreated, datahubIngestionRunSummary.numWorkUnitsCreated) &&
        Objects.equals(this.numEvents, datahubIngestionRunSummary.numEvents) &&
        Objects.equals(this.numEntities, datahubIngestionRunSummary.numEntities) &&
        Objects.equals(this.numAspects, datahubIngestionRunSummary.numAspects) &&
        Objects.equals(this.numSourceAPICalls, datahubIngestionRunSummary.numSourceAPICalls) &&
        Objects.equals(this.totalLatencySourceAPICalls, datahubIngestionRunSummary.totalLatencySourceAPICalls) &&
        Objects.equals(this.numSinkAPICalls, datahubIngestionRunSummary.numSinkAPICalls) &&
        Objects.equals(this.totalLatencySinkAPICalls, datahubIngestionRunSummary.totalLatencySinkAPICalls) &&
        Objects.equals(this.numWarnings, datahubIngestionRunSummary.numWarnings) &&
        Objects.equals(this.numErrors, datahubIngestionRunSummary.numErrors) &&
        Objects.equals(this.numEntitiesSkipped, datahubIngestionRunSummary.numEntitiesSkipped) &&
        Objects.equals(this.config, datahubIngestionRunSummary.config) &&
        Objects.equals(this.customSummary, datahubIngestionRunSummary.customSummary) &&
        Objects.equals(this.softwareVersion, datahubIngestionRunSummary.softwareVersion) &&
        Objects.equals(this.systemHostName, datahubIngestionRunSummary.systemHostName) &&
        Objects.equals(this.operatingSystemName, datahubIngestionRunSummary.operatingSystemName) &&
        Objects.equals(this.numProcessors, datahubIngestionRunSummary.numProcessors) &&
        Objects.equals(this.totalMemory, datahubIngestionRunSummary.totalMemory) &&
        Objects.equals(this.availableMemory, datahubIngestionRunSummary.availableMemory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestampMillis, eventGranularity, partitionSpec, messageId, pipelineName, platformInstanceId, runId, runStatus, numWorkUnitsCommitted, numWorkUnitsCreated, numEvents, numEntities, numAspects, numSourceAPICalls, totalLatencySourceAPICalls, numSinkAPICalls, totalLatencySinkAPICalls, numWarnings, numErrors, numEntitiesSkipped, config, customSummary, softwareVersion, systemHostName, operatingSystemName, numProcessors, totalMemory, availableMemory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatahubIngestionRunSummary {\n");
    
    sb.append("    timestampMillis: ").append(toIndentedString(timestampMillis)).append("\n");
    sb.append("    eventGranularity: ").append(toIndentedString(eventGranularity)).append("\n");
    sb.append("    partitionSpec: ").append(toIndentedString(partitionSpec)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
    sb.append("    platformInstanceId: ").append(toIndentedString(platformInstanceId)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
    sb.append("    numWorkUnitsCommitted: ").append(toIndentedString(numWorkUnitsCommitted)).append("\n");
    sb.append("    numWorkUnitsCreated: ").append(toIndentedString(numWorkUnitsCreated)).append("\n");
    sb.append("    numEvents: ").append(toIndentedString(numEvents)).append("\n");
    sb.append("    numEntities: ").append(toIndentedString(numEntities)).append("\n");
    sb.append("    numAspects: ").append(toIndentedString(numAspects)).append("\n");
    sb.append("    numSourceAPICalls: ").append(toIndentedString(numSourceAPICalls)).append("\n");
    sb.append("    totalLatencySourceAPICalls: ").append(toIndentedString(totalLatencySourceAPICalls)).append("\n");
    sb.append("    numSinkAPICalls: ").append(toIndentedString(numSinkAPICalls)).append("\n");
    sb.append("    totalLatencySinkAPICalls: ").append(toIndentedString(totalLatencySinkAPICalls)).append("\n");
    sb.append("    numWarnings: ").append(toIndentedString(numWarnings)).append("\n");
    sb.append("    numErrors: ").append(toIndentedString(numErrors)).append("\n");
    sb.append("    numEntitiesSkipped: ").append(toIndentedString(numEntitiesSkipped)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    customSummary: ").append(toIndentedString(customSummary)).append("\n");
    sb.append("    softwareVersion: ").append(toIndentedString(softwareVersion)).append("\n");
    sb.append("    systemHostName: ").append(toIndentedString(systemHostName)).append("\n");
    sb.append("    operatingSystemName: ").append(toIndentedString(operatingSystemName)).append("\n");
    sb.append("    numProcessors: ").append(toIndentedString(numProcessors)).append("\n");
    sb.append("    totalMemory: ").append(toIndentedString(totalMemory)).append("\n");
    sb.append("    availableMemory: ").append(toIndentedString(availableMemory)).append("\n");
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