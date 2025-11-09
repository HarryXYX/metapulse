package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DashboardUserUsageCounts;
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
 * Experimental (Subject to breaking change) -- Stats corresponding to dashboard&#x27;s usage.  If this aspect represents the latest snapshot of the statistics about a Dashboard, the eventGranularity field should be null.  If this aspect represents a bucketed window of usage statistics (e.g. over a day), then the eventGranularity field should be set accordingly. 
 */
@Schema(description = "Experimental (Subject to breaking change) -- Stats corresponding to dashboard's usage.  If this aspect represents the latest snapshot of the statistics about a Dashboard, the eventGranularity field should be null.  If this aspect represents a bucketed window of usage statistics (e.g. over a day), then the eventGranularity field should be set accordingly. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DashboardUsageStatistics  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DashboardUsageStatistics") @Builder.Default
  private String __type = "DashboardUsageStatistics";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DashboardUsageStatistics"},
  defaultValue = "DashboardUsageStatistics")
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

  @JsonProperty("viewsCount") @Builder.Default
  private Integer viewsCount = null;

  @JsonProperty("executionsCount") @Builder.Default
  private Integer executionsCount = null;

  @JsonProperty("uniqueUserCount") @Builder.Default
  private Integer uniqueUserCount = null;

  @JsonProperty("userCounts") @Builder.Default
  @Valid
  private List<DashboardUserUsageCounts> userCounts = null;

  @JsonProperty("favoritesCount") @Builder.Default
  private Integer favoritesCount = null;

  @JsonProperty("lastViewedAt") @Builder.Default
  private Long lastViewedAt = null;

  public DashboardUsageStatistics timestampMillis(Long timestampMillis) {
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

  public DashboardUsageStatistics eventGranularity(TimeWindowSize eventGranularity) {
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

  public DashboardUsageStatistics partitionSpec(PartitionSpec partitionSpec) {
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

  public DashboardUsageStatistics messageId(String messageId) {
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

  public DashboardUsageStatistics viewsCount(Integer viewsCount) {
    this.viewsCount = viewsCount;
    return this;
  }

  /**
   * The total number of times dashboard has been viewed
   * minimum: -2147483648
   * maximum: 2147483647
   * @return viewsCount
   **/
  @Schema(description = "The total number of times dashboard has been viewed")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getViewsCount() {
    return viewsCount;
  }

  public void setViewsCount(Integer viewsCount) {
    this.viewsCount = viewsCount;
  }

  public DashboardUsageStatistics executionsCount(Integer executionsCount) {
    this.executionsCount = executionsCount;
    return this;
  }

  /**
   * The total number of dashboard executions (refreshes / syncs) 
   * minimum: -2147483648
   * maximum: 2147483647
   * @return executionsCount
   **/
  @Schema(description = "The total number of dashboard executions (refreshes / syncs) ")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getExecutionsCount() {
    return executionsCount;
  }

  public void setExecutionsCount(Integer executionsCount) {
    this.executionsCount = executionsCount;
  }

  public DashboardUsageStatistics uniqueUserCount(Integer uniqueUserCount) {
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

  public DashboardUsageStatistics userCounts(List<DashboardUserUsageCounts> userCounts) {
    this.userCounts = userCounts;
    return this;
  }

  public DashboardUsageStatistics addUserCountsItem(DashboardUserUsageCounts userCountsItem) {
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
    public List<DashboardUserUsageCounts> getUserCounts() {
    return userCounts;
  }

  public void setUserCounts(List<DashboardUserUsageCounts> userCounts) {
    this.userCounts = userCounts;
  }

  public DashboardUsageStatistics favoritesCount(Integer favoritesCount) {
    this.favoritesCount = favoritesCount;
    return this;
  }

  /**
   * The total number of times that the dashboard has been favorited 
   * minimum: -2147483648
   * maximum: 2147483647
   * @return favoritesCount
   **/
  @Schema(description = "The total number of times that the dashboard has been favorited ")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getFavoritesCount() {
    return favoritesCount;
  }

  public void setFavoritesCount(Integer favoritesCount) {
    this.favoritesCount = favoritesCount;
  }

  public DashboardUsageStatistics lastViewedAt(Long lastViewedAt) {
    this.lastViewedAt = lastViewedAt;
    return this;
  }

  /**
   * Last viewed at  This should not be set in cases where statistics are windowed. 
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return lastViewedAt
   **/
  @Schema(description = "Last viewed at  This should not be set in cases where statistics are windowed. ")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getLastViewedAt() {
    return lastViewedAt;
  }

  public void setLastViewedAt(Long lastViewedAt) {
    this.lastViewedAt = lastViewedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardUsageStatistics dashboardUsageStatistics = (DashboardUsageStatistics) o;
    return Objects.equals(this.timestampMillis, dashboardUsageStatistics.timestampMillis) &&
        Objects.equals(this.eventGranularity, dashboardUsageStatistics.eventGranularity) &&
        Objects.equals(this.partitionSpec, dashboardUsageStatistics.partitionSpec) &&
        Objects.equals(this.messageId, dashboardUsageStatistics.messageId) &&
        Objects.equals(this.viewsCount, dashboardUsageStatistics.viewsCount) &&
        Objects.equals(this.executionsCount, dashboardUsageStatistics.executionsCount) &&
        Objects.equals(this.uniqueUserCount, dashboardUsageStatistics.uniqueUserCount) &&
        Objects.equals(this.userCounts, dashboardUsageStatistics.userCounts) &&
        Objects.equals(this.favoritesCount, dashboardUsageStatistics.favoritesCount) &&
        Objects.equals(this.lastViewedAt, dashboardUsageStatistics.lastViewedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestampMillis, eventGranularity, partitionSpec, messageId, viewsCount, executionsCount, uniqueUserCount, userCounts, favoritesCount, lastViewedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardUsageStatistics {\n");
    
    sb.append("    timestampMillis: ").append(toIndentedString(timestampMillis)).append("\n");
    sb.append("    eventGranularity: ").append(toIndentedString(eventGranularity)).append("\n");
    sb.append("    partitionSpec: ").append(toIndentedString(partitionSpec)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    viewsCount: ").append(toIndentedString(viewsCount)).append("\n");
    sb.append("    executionsCount: ").append(toIndentedString(executionsCount)).append("\n");
    sb.append("    uniqueUserCount: ").append(toIndentedString(uniqueUserCount)).append("\n");
    sb.append("    userCounts: ").append(toIndentedString(userCounts)).append("\n");
    sb.append("    favoritesCount: ").append(toIndentedString(favoritesCount)).append("\n");
    sb.append("    lastViewedAt: ").append(toIndentedString(lastViewedAt)).append("\n");
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