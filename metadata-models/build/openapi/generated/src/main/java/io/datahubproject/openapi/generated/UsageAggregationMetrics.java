package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FieldUsageCounts;
import io.datahubproject.openapi.generated.UserUsageCounts;
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
/**
 * Metrics for usage data for a given resource and bucket. Not all fields make sense for all buckets, so every field is optional.
 */
@Schema(description = "Metrics for usage data for a given resource and bucket. Not all fields make sense for all buckets, so every field is optional.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsageAggregationMetrics   {

  @JsonProperty("uniqueUserCount") @Builder.Default
  private Integer uniqueUserCount = null;

  @JsonProperty("users") @Builder.Default
  @Valid
  private List<UserUsageCounts> users = null;

  @JsonProperty("totalSqlQueries") @Builder.Default
  private Integer totalSqlQueries = null;

  @JsonProperty("topSqlQueries") @Builder.Default
  @Valid
  private List<String> topSqlQueries = null;

  @JsonProperty("fields") @Builder.Default
  @Valid
  private List<FieldUsageCounts> fields = null;

  public UsageAggregationMetrics uniqueUserCount(Integer uniqueUserCount) {
    this.uniqueUserCount = uniqueUserCount;
    return this;
  }

  /**
   *  Unique user count 
   * minimum: -2147483648
   * maximum: 2147483647
   * @return uniqueUserCount
   **/
  @Schema(description = " Unique user count ")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getUniqueUserCount() {
    return uniqueUserCount;
  }

  public void setUniqueUserCount(Integer uniqueUserCount) {
    this.uniqueUserCount = uniqueUserCount;
  }

  public UsageAggregationMetrics users(List<UserUsageCounts> users) {
    this.users = users;
    return this;
  }

  public UsageAggregationMetrics addUsersItem(UserUsageCounts usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   *  Users within this bucket, with frequency counts 
   * @return users
   **/
  @Schema(description = " Users within this bucket, with frequency counts ")
      @Valid
    public List<UserUsageCounts> getUsers() {
    return users;
  }

  public void setUsers(List<UserUsageCounts> users) {
    this.users = users;
  }

  public UsageAggregationMetrics totalSqlQueries(Integer totalSqlQueries) {
    this.totalSqlQueries = totalSqlQueries;
    return this;
  }

  /**
   *  Total SQL query count 
   * minimum: -2147483648
   * maximum: 2147483647
   * @return totalSqlQueries
   **/
  @Schema(description = " Total SQL query count ")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getTotalSqlQueries() {
    return totalSqlQueries;
  }

  public void setTotalSqlQueries(Integer totalSqlQueries) {
    this.totalSqlQueries = totalSqlQueries;
  }

  public UsageAggregationMetrics topSqlQueries(List<String> topSqlQueries) {
    this.topSqlQueries = topSqlQueries;
    return this;
  }

  public UsageAggregationMetrics addTopSqlQueriesItem(String topSqlQueriesItem) {
    if (this.topSqlQueries == null) {
      this.topSqlQueries = new ArrayList<>();
    }
    this.topSqlQueries.add(topSqlQueriesItem);
    return this;
  }

  /**
   *  Frequent SQL queries; mostly makes sense for datasets in SQL databases 
   * @return topSqlQueries
   **/
  @Schema(description = " Frequent SQL queries; mostly makes sense for datasets in SQL databases ")
  
    public List<String> getTopSqlQueries() {
    return topSqlQueries;
  }

  public void setTopSqlQueries(List<String> topSqlQueries) {
    this.topSqlQueries = topSqlQueries;
  }

  public UsageAggregationMetrics fields(List<FieldUsageCounts> fields) {
    this.fields = fields;
    return this;
  }

  public UsageAggregationMetrics addFieldsItem(FieldUsageCounts fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   *  Field-level usage stats 
   * @return fields
   **/
  @Schema(description = " Field-level usage stats ")
      @Valid
    public List<FieldUsageCounts> getFields() {
    return fields;
  }

  public void setFields(List<FieldUsageCounts> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAggregationMetrics usageAggregationMetrics = (UsageAggregationMetrics) o;
    return Objects.equals(this.uniqueUserCount, usageAggregationMetrics.uniqueUserCount) &&
        Objects.equals(this.users, usageAggregationMetrics.users) &&
        Objects.equals(this.totalSqlQueries, usageAggregationMetrics.totalSqlQueries) &&
        Objects.equals(this.topSqlQueries, usageAggregationMetrics.topSqlQueries) &&
        Objects.equals(this.fields, usageAggregationMetrics.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueUserCount, users, totalSqlQueries, topSqlQueries, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAggregationMetrics {\n");
    
    sb.append("    uniqueUserCount: ").append(toIndentedString(uniqueUserCount)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    totalSqlQueries: ").append(toIndentedString(totalSqlQueries)).append("\n");
    sb.append("    topSqlQueries: ").append(toIndentedString(topSqlQueries)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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