package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.OperationsAggregation;
import io.datahubproject.openapi.generated.OperationsAggregationsResult;
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
 * Results of a query for operations data.
 */
@Schema(description = "Results of a query for operations data.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperationsQueryResult   {

  @JsonProperty("buckets") @Builder.Default
  @Valid
  private List<OperationsAggregation> buckets = null;

  @JsonProperty("aggregations") @Builder.Default
  private OperationsAggregationsResult aggregations = null;

  public OperationsQueryResult buckets(List<OperationsAggregation> buckets) {
    this.buckets = buckets;
    return this;
  }

  public OperationsQueryResult addBucketsItem(OperationsAggregation bucketsItem) {
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
    public List<OperationsAggregation> getBuckets() {
    return buckets;
  }

  public void setBuckets(List<OperationsAggregation> buckets) {
    this.buckets = buckets;
  }

  public OperationsQueryResult aggregations(OperationsAggregationsResult aggregations) {
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
    public OperationsAggregationsResult getAggregations() {
    return aggregations;
  }

  public void setAggregations(OperationsAggregationsResult aggregations) {
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
    OperationsQueryResult operationsQueryResult = (OperationsQueryResult) o;
    return Objects.equals(this.buckets, operationsQueryResult.buckets) &&
        Objects.equals(this.aggregations, operationsQueryResult.aggregations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buckets, aggregations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationsQueryResult {\n");
    
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