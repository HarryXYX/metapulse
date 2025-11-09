package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.UsageAggregation;
import io.datahubproject.openapi.generated.UsageQueryResultAggregations;
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
 * Results of a query for usage data.
 */
@Schema(description = "Results of a query for usage data.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsageQueryResult   {

  @JsonProperty("buckets") @Builder.Default
  @Valid
  private List<UsageAggregation> buckets = null;

  @JsonProperty("aggregations") @Builder.Default
  private UsageQueryResultAggregations aggregations = null;

  public UsageQueryResult buckets(List<UsageAggregation> buckets) {
    this.buckets = buckets;
    return this;
  }

  public UsageQueryResult addBucketsItem(UsageAggregation bucketsItem) {
    if (this.buckets == null) {
      this.buckets = new ArrayList<>();
    }
    this.buckets.add(bucketsItem);
    return this;
  }

  /**
   *  Raw buckets 
   * @return buckets
   **/
  @Schema(description = " Raw buckets ")
      @Valid
    public List<UsageAggregation> getBuckets() {
    return buckets;
  }

  public void setBuckets(List<UsageAggregation> buckets) {
    this.buckets = buckets;
  }

  public UsageQueryResult aggregations(UsageQueryResultAggregations aggregations) {
    this.aggregations = aggregations;
    return this;
  }

  /**
   * Get aggregations
   * @return aggregations
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public UsageQueryResultAggregations getAggregations() {
    return aggregations;
  }

  public void setAggregations(UsageQueryResultAggregations aggregations) {
    this.aggregations = aggregations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageQueryResult usageQueryResult = (UsageQueryResult) o;
    return Objects.equals(this.buckets, usageQueryResult.buckets) &&
        Objects.equals(this.aggregations, usageQueryResult.aggregations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buckets, aggregations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageQueryResult {\n");
    
    sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
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