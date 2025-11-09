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
 * UsageQueryResultAggregations
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsageQueryResultAggregations   {

  @JsonProperty("uniqueUserCount") @Builder.Default
  private Integer uniqueUserCount = null;

  @JsonProperty("totalSqlQueries") @Builder.Default
  private Integer totalSqlQueries = null;

  @JsonProperty("users") @Builder.Default
  @Valid
  private List<UserUsageCounts> users = null;

  @JsonProperty("fields") @Builder.Default
  @Valid
  private List<FieldUsageCounts> fields = null;

  public UsageQueryResultAggregations uniqueUserCount(Integer uniqueUserCount) {
    this.uniqueUserCount = uniqueUserCount;
    return this;
  }

  /**
   * Get uniqueUserCount
   * minimum: -2147483648
   * maximum: 2147483647
   * @return uniqueUserCount
   **/
  @Schema(description = "")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getUniqueUserCount() {
    return uniqueUserCount;
  }

  public void setUniqueUserCount(Integer uniqueUserCount) {
    this.uniqueUserCount = uniqueUserCount;
  }

  public UsageQueryResultAggregations totalSqlQueries(Integer totalSqlQueries) {
    this.totalSqlQueries = totalSqlQueries;
    return this;
  }

  /**
   * Get totalSqlQueries
   * minimum: -2147483648
   * maximum: 2147483647
   * @return totalSqlQueries
   **/
  @Schema(description = "")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getTotalSqlQueries() {
    return totalSqlQueries;
  }

  public void setTotalSqlQueries(Integer totalSqlQueries) {
    this.totalSqlQueries = totalSqlQueries;
  }

  public UsageQueryResultAggregations users(List<UserUsageCounts> users) {
    this.users = users;
    return this;
  }

  public UsageQueryResultAggregations addUsersItem(UserUsageCounts usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
   **/
  @Schema(description = "")
      @Valid
    public List<UserUsageCounts> getUsers() {
    return users;
  }

  public void setUsers(List<UserUsageCounts> users) {
    this.users = users;
  }

  public UsageQueryResultAggregations fields(List<FieldUsageCounts> fields) {
    this.fields = fields;
    return this;
  }

  public UsageQueryResultAggregations addFieldsItem(FieldUsageCounts fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
   **/
  @Schema(description = "")
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
    UsageQueryResultAggregations usageQueryResultAggregations = (UsageQueryResultAggregations) o;
    return Objects.equals(this.uniqueUserCount, usageQueryResultAggregations.uniqueUserCount) &&
        Objects.equals(this.totalSqlQueries, usageQueryResultAggregations.totalSqlQueries) &&
        Objects.equals(this.users, usageQueryResultAggregations.users) &&
        Objects.equals(this.fields, usageQueryResultAggregations.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueUserCount, totalSqlQueries, users, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageQueryResultAggregations {\n");
    
    sb.append("    uniqueUserCount: ").append(toIndentedString(uniqueUserCount)).append("\n");
    sb.append("    totalSqlQueries: ").append(toIndentedString(totalSqlQueries)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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