package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.OperationSourceType;
import io.datahubproject.openapi.generated.OperationType;
import io.datahubproject.openapi.generated.PartitionSpec;
import io.datahubproject.openapi.generated.TimeWindowSize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
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
 * Operational info for an entity.
 */
@Schema(description = "Operational info for an entity.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Operation  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "Operation") @Builder.Default
  private String __type = "Operation";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"Operation"},
  defaultValue = "Operation")
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

  @JsonProperty("actor") @Builder.Default
  private String actor = null;

  @JsonProperty("operationType") @Builder.Default
  private OperationType operationType = null;

  @JsonProperty("customOperationType") @Builder.Default
  private String customOperationType = null;

  @JsonProperty("numAffectedRows") @Builder.Default
  private Long numAffectedRows = null;

  @JsonProperty("affectedDatasets") @Builder.Default
  @Valid
  private List<String> affectedDatasets = null;

  @JsonProperty("sourceType") @Builder.Default
  private OperationSourceType sourceType = null;

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = null;

  @JsonProperty("lastUpdatedTimestamp") @Builder.Default
  private Long lastUpdatedTimestamp = null;

  @JsonProperty("queries") @Builder.Default
  @Valid
  private List<String> queries = null;

  public Operation timestampMillis(Long timestampMillis) {
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

  public Operation eventGranularity(TimeWindowSize eventGranularity) {
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

  public Operation partitionSpec(PartitionSpec partitionSpec) {
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

  public Operation messageId(String messageId) {
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

  public Operation actor(String actor) {
    this.actor = actor;
    return this;
  }

  /**
   * Actor who issued this operation.
   * @return actor
   **/
  @Schema(description = "Actor who issued this operation.")
  
    public String getActor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }

  public Operation operationType(OperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Get operationType
   * @return operationType
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }

  public Operation customOperationType(String customOperationType) {
    this.customOperationType = customOperationType;
    return this;
  }

  /**
   * A custom type of operation. Required if operationType is CUSTOM.
   * @return customOperationType
   **/
  @Schema(description = "A custom type of operation. Required if operationType is CUSTOM.")
  
    public String getCustomOperationType() {
    return customOperationType;
  }

  public void setCustomOperationType(String customOperationType) {
    this.customOperationType = customOperationType;
  }

  public Operation numAffectedRows(Long numAffectedRows) {
    this.numAffectedRows = numAffectedRows;
    return this;
  }

  /**
   * How many rows were affected by this operation.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return numAffectedRows
   **/
  @Schema(description = "How many rows were affected by this operation.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getNumAffectedRows() {
    return numAffectedRows;
  }

  public void setNumAffectedRows(Long numAffectedRows) {
    this.numAffectedRows = numAffectedRows;
  }

  public Operation affectedDatasets(List<String> affectedDatasets) {
    this.affectedDatasets = affectedDatasets;
    return this;
  }

  public Operation addAffectedDatasetsItem(String affectedDatasetsItem) {
    if (this.affectedDatasets == null) {
      this.affectedDatasets = new ArrayList<>();
    }
    this.affectedDatasets.add(affectedDatasetsItem);
    return this;
  }

  /**
   * Which other datasets were affected by this operation.
   * @return affectedDatasets
   **/
  @Schema(description = "Which other datasets were affected by this operation.")
  
    public List<String> getAffectedDatasets() {
    return affectedDatasets;
  }

  public void setAffectedDatasets(List<String> affectedDatasets) {
    this.affectedDatasets = affectedDatasets;
  }

  public Operation sourceType(OperationSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
   **/
  @Schema(description = "")
  
    @Valid
    public OperationSourceType getSourceType() {
    return sourceType;
  }

  public void setSourceType(OperationSourceType sourceType) {
    this.sourceType = sourceType;
  }

  public Operation customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public Operation putCustomPropertiesItem(String key, String customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new HashMap<>();
    }
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

  /**
   * Custom properties
   * @return customProperties
   **/
  @Schema(description = "Custom properties")
  
    public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public Operation lastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  /**
   * The time at which the operation occurred. Would be better named 'operationTime'
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return lastUpdatedTimestamp
   **/
  @Schema(required = true, description = "The time at which the operation occurred. Would be better named 'operationTime'")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public void setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
  }

  public Operation queries(List<String> queries) {
    this.queries = queries;
    return this;
  }

  public Operation addQueriesItem(String queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    return this;
  }

  /**
   * Which queries were used in this operation.
   * @return queries
   **/
  @Schema(description = "Which queries were used in this operation.")
  
    public List<String> getQueries() {
    return queries;
  }

  public void setQueries(List<String> queries) {
    this.queries = queries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operation operation = (Operation) o;
    return Objects.equals(this.timestampMillis, operation.timestampMillis) &&
        Objects.equals(this.eventGranularity, operation.eventGranularity) &&
        Objects.equals(this.partitionSpec, operation.partitionSpec) &&
        Objects.equals(this.messageId, operation.messageId) &&
        Objects.equals(this.actor, operation.actor) &&
        Objects.equals(this.operationType, operation.operationType) &&
        Objects.equals(this.customOperationType, operation.customOperationType) &&
        Objects.equals(this.numAffectedRows, operation.numAffectedRows) &&
        Objects.equals(this.affectedDatasets, operation.affectedDatasets) &&
        Objects.equals(this.sourceType, operation.sourceType) &&
        Objects.equals(this.customProperties, operation.customProperties) &&
        Objects.equals(this.lastUpdatedTimestamp, operation.lastUpdatedTimestamp) &&
        Objects.equals(this.queries, operation.queries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestampMillis, eventGranularity, partitionSpec, messageId, actor, operationType, customOperationType, numAffectedRows, affectedDatasets, sourceType, customProperties, lastUpdatedTimestamp, queries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operation {\n");
    
    sb.append("    timestampMillis: ").append(toIndentedString(timestampMillis)).append("\n");
    sb.append("    eventGranularity: ").append(toIndentedString(eventGranularity)).append("\n");
    sb.append("    partitionSpec: ").append(toIndentedString(partitionSpec)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    customOperationType: ").append(toIndentedString(customOperationType)).append("\n");
    sb.append("    numAffectedRows: ").append(toIndentedString(numAffectedRows)).append("\n");
    sb.append("    affectedDatasets: ").append(toIndentedString(affectedDatasets)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    lastUpdatedTimestamp: ").append(toIndentedString(lastUpdatedTimestamp)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
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