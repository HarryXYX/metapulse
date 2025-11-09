package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DatasetUserUsageCounts;
import io.datahubproject.openapi.generated.PartitionSpec;
import io.datahubproject.openapi.generated.TimeWindowSize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
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
public class QueryUsageStatistics  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "QueryUsageStatistics") @Builder.Default
  private String __type = "QueryUsageStatistics";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"QueryUsageStatistics"},
  defaultValue = "QueryUsageStatistics")
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

  @JsonProperty("queryCount") @Builder.Default
  private Integer queryCount = null;

  @JsonProperty("queryCost") @Builder.Default
  private BigDecimal queryCost = null;

  @JsonProperty("lastExecutedAt") @Builder.Default
  private Long lastExecutedAt = null;

  @JsonProperty("uniqueUserCount") @Builder.Default
  private Integer uniqueUserCount = null;

  @JsonProperty("userCounts") @Builder.Default
  @Valid
  private List<DatasetUserUsageCounts> userCounts = null;

  public QueryUsageStatistics timestampMillis(Long timestampMillis) {
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

  public QueryUsageStatistics eventGranularity(TimeWindowSize eventGranularity) {
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

  public QueryUsageStatistics partitionSpec(PartitionSpec partitionSpec) {
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

  public QueryUsageStatistics messageId(String messageId) {
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

  public QueryUsageStatistics queryCount(Integer queryCount) {
    this.queryCount = queryCount;
    return this;
  }

  /**
   * Total query count in this bucket
   * minimum: -2147483648
   * maximum: 2147483647
   * @return queryCount
   **/
  @Schema(description = "Total query count in this bucket")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getQueryCount() {
    return queryCount;
  }

  public void setQueryCount(Integer queryCount) {
    this.queryCount = queryCount;
  }

  public QueryUsageStatistics queryCost(BigDecimal queryCost) {
    this.queryCost = queryCost;
    return this;
  }

  /**
   * Query cost for this query and bucket
   * @return queryCost
   **/
  @Schema(description = "Query cost for this query and bucket")
  
    @Valid
    public BigDecimal getQueryCost() {
    return queryCost;
  }

  public void setQueryCost(BigDecimal queryCost) {
    this.queryCost = queryCost;
  }

  public QueryUsageStatistics lastExecutedAt(Long lastExecutedAt) {
    this.lastExecutedAt = lastExecutedAt;
    return this;
  }

  /**
   * Last executed timestamp
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return lastExecutedAt
   **/
  @Schema(description = "Last executed timestamp")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getLastExecutedAt() {
    return lastExecutedAt;
  }

  public void setLastExecutedAt(Long lastExecutedAt) {
    this.lastExecutedAt = lastExecutedAt;
  }

  public QueryUsageStatistics uniqueUserCount(Integer uniqueUserCount) {
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

  public QueryUsageStatistics userCounts(List<DatasetUserUsageCounts> userCounts) {
    this.userCounts = userCounts;
    return this;
  }

  public QueryUsageStatistics addUserCountsItem(DatasetUserUsageCounts userCountsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryUsageStatistics queryUsageStatistics = (QueryUsageStatistics) o;
    return Objects.equals(this.timestampMillis, queryUsageStatistics.timestampMillis) &&
        Objects.equals(this.eventGranularity, queryUsageStatistics.eventGranularity) &&
        Objects.equals(this.partitionSpec, queryUsageStatistics.partitionSpec) &&
        Objects.equals(this.messageId, queryUsageStatistics.messageId) &&
        Objects.equals(this.queryCount, queryUsageStatistics.queryCount) &&
        Objects.equals(this.queryCost, queryUsageStatistics.queryCost) &&
        Objects.equals(this.lastExecutedAt, queryUsageStatistics.lastExecutedAt) &&
        Objects.equals(this.uniqueUserCount, queryUsageStatistics.uniqueUserCount) &&
        Objects.equals(this.userCounts, queryUsageStatistics.userCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestampMillis, eventGranularity, partitionSpec, messageId, queryCount, queryCost, lastExecutedAt, uniqueUserCount, userCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryUsageStatistics {\n");
    
    sb.append("    timestampMillis: ").append(toIndentedString(timestampMillis)).append("\n");
    sb.append("    eventGranularity: ").append(toIndentedString(eventGranularity)).append("\n");
    sb.append("    partitionSpec: ").append(toIndentedString(partitionSpec)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    queryCount: ").append(toIndentedString(queryCount)).append("\n");
    sb.append("    queryCost: ").append(toIndentedString(queryCost)).append("\n");
    sb.append("    lastExecutedAt: ").append(toIndentedString(lastExecutedAt)).append("\n");
    sb.append("    uniqueUserCount: ").append(toIndentedString(uniqueUserCount)).append("\n");
    sb.append("    userCounts: ").append(toIndentedString(userCounts)).append("\n");
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