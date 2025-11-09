package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DatasetFieldUsageCounts;
import io.datahubproject.openapi.generated.DatasetUserUsageCounts;
import io.datahubproject.openapi.generated.PartitionSpec;
import io.datahubproject.openapi.generated.TimeWindowSize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Stats corresponding to dataset&#x27;s usage.
 */
@Schema(description = "Stats corresponding to dataset's usage.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatasetUsageStatistics  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DatasetUsageStatistics") @Builder.Default
  private String __type = "DatasetUsageStatistics";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DatasetUsageStatistics"},
  defaultValue = "DatasetUsageStatistics")
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

  @JsonProperty("uniqueUserCount") @Builder.Default
  private Integer uniqueUserCount = null;

  @JsonProperty("totalSqlQueries") @Builder.Default
  private Integer totalSqlQueries = null;

  @JsonProperty("topSqlQueries") @Builder.Default
  @Valid
  private List<String> topSqlQueries = null;

  @JsonProperty("userCounts") @Builder.Default
  @Valid
  private List<DatasetUserUsageCounts> userCounts = null;

  @JsonProperty("fieldCounts") @Builder.Default
  @Valid
  private List<DatasetFieldUsageCounts> fieldCounts = null;

  public DatasetUsageStatistics timestampMillis(Long timestampMillis) {
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

  public DatasetUsageStatistics eventGranularity(TimeWindowSize eventGranularity) {
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

  public DatasetUsageStatistics partitionSpec(PartitionSpec partitionSpec) {
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

  public DatasetUsageStatistics messageId(String messageId) {
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

  public DatasetUsageStatistics uniqueUserCount(Integer uniqueUserCount) {
    this.uniqueUserCount = uniqueUserCount;
    return this;
  }

  /**
   * Unique user count
   * minimum: -2147483648
   * maximum: 2147483647
   * @return uniqueUserCount
   **/
  @Schema(description = "Unique user count")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getUniqueUserCount() {
    return uniqueUserCount;
  }

  public void setUniqueUserCount(Integer uniqueUserCount) {
    this.uniqueUserCount = uniqueUserCount;
  }

  public DatasetUsageStatistics totalSqlQueries(Integer totalSqlQueries) {
    this.totalSqlQueries = totalSqlQueries;
    return this;
  }

  /**
   * Total SQL query count
   * minimum: -2147483648
   * maximum: 2147483647
   * @return totalSqlQueries
   **/
  @Schema(description = "Total SQL query count")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getTotalSqlQueries() {
    return totalSqlQueries;
  }

  public void setTotalSqlQueries(Integer totalSqlQueries) {
    this.totalSqlQueries = totalSqlQueries;
  }

  public DatasetUsageStatistics topSqlQueries(List<String> topSqlQueries) {
    this.topSqlQueries = topSqlQueries;
    return this;
  }

  public DatasetUsageStatistics addTopSqlQueriesItem(String topSqlQueriesItem) {
    if (this.topSqlQueries == null) {
      this.topSqlQueries = new ArrayList<>();
    }
    this.topSqlQueries.add(topSqlQueriesItem);
    return this;
  }

  /**
   * Frequent SQL queries; mostly makes sense for datasets in SQL databases
   * @return topSqlQueries
   **/
  @Schema(description = "Frequent SQL queries; mostly makes sense for datasets in SQL databases")
  
    public List<String> getTopSqlQueries() {
    return topSqlQueries;
  }

  public void setTopSqlQueries(List<String> topSqlQueries) {
    this.topSqlQueries = topSqlQueries;
  }

  public DatasetUsageStatistics userCounts(List<DatasetUserUsageCounts> userCounts) {
    this.userCounts = userCounts;
    return this;
  }

  public DatasetUsageStatistics addUserCountsItem(DatasetUserUsageCounts userCountsItem) {
    if (this.userCounts == null) {
      this.userCounts = new ArrayList<>();
    }
    this.userCounts.add(userCountsItem);
    return this;
  }

  /**
   * Users within this bucket, with frequency counts
   * @return userCounts
   **/
  @Schema(description = "Users within this bucket, with frequency counts")
      @Valid
    public List<DatasetUserUsageCounts> getUserCounts() {
    return userCounts;
  }

  public void setUserCounts(List<DatasetUserUsageCounts> userCounts) {
    this.userCounts = userCounts;
  }

  public DatasetUsageStatistics fieldCounts(List<DatasetFieldUsageCounts> fieldCounts) {
    this.fieldCounts = fieldCounts;
    return this;
  }

  public DatasetUsageStatistics addFieldCountsItem(DatasetFieldUsageCounts fieldCountsItem) {
    if (this.fieldCounts == null) {
      this.fieldCounts = new ArrayList<>();
    }
    this.fieldCounts.add(fieldCountsItem);
    return this;
  }

  /**
   * Field-level usage stats
   * @return fieldCounts
   **/
  @Schema(description = "Field-level usage stats")
      @Valid
    public List<DatasetFieldUsageCounts> getFieldCounts() {
    return fieldCounts;
  }

  public void setFieldCounts(List<DatasetFieldUsageCounts> fieldCounts) {
    this.fieldCounts = fieldCounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetUsageStatistics datasetUsageStatistics = (DatasetUsageStatistics) o;
    return Objects.equals(this.timestampMillis, datasetUsageStatistics.timestampMillis) &&
        Objects.equals(this.eventGranularity, datasetUsageStatistics.eventGranularity) &&
        Objects.equals(this.partitionSpec, datasetUsageStatistics.partitionSpec) &&
        Objects.equals(this.messageId, datasetUsageStatistics.messageId) &&
        Objects.equals(this.uniqueUserCount, datasetUsageStatistics.uniqueUserCount) &&
        Objects.equals(this.totalSqlQueries, datasetUsageStatistics.totalSqlQueries) &&
        Objects.equals(this.topSqlQueries, datasetUsageStatistics.topSqlQueries) &&
        Objects.equals(this.userCounts, datasetUsageStatistics.userCounts) &&
        Objects.equals(this.fieldCounts, datasetUsageStatistics.fieldCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestampMillis, eventGranularity, partitionSpec, messageId, uniqueUserCount, totalSqlQueries, topSqlQueries, userCounts, fieldCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetUsageStatistics {\n");
    
    sb.append("    timestampMillis: ").append(toIndentedString(timestampMillis)).append("\n");
    sb.append("    eventGranularity: ").append(toIndentedString(eventGranularity)).append("\n");
    sb.append("    partitionSpec: ").append(toIndentedString(partitionSpec)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    uniqueUserCount: ").append(toIndentedString(uniqueUserCount)).append("\n");
    sb.append("    totalSqlQueries: ").append(toIndentedString(totalSqlQueries)).append("\n");
    sb.append("    topSqlQueries: ").append(toIndentedString(topSqlQueries)).append("\n");
    sb.append("    userCounts: ").append(toIndentedString(userCounts)).append("\n");
    sb.append("    fieldCounts: ").append(toIndentedString(fieldCounts)).append("\n");
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