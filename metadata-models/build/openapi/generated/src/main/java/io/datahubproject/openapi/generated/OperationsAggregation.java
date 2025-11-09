package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.OperationsAggregationsResult;
import io.datahubproject.openapi.generated.WindowDuration;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Operations data for a given resource, rolled up into a bucket.
 */
@Schema(description = "Operations data for a given resource, rolled up into a bucket.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperationsAggregation   {

  @JsonProperty("bucket") @Builder.Default
  private Long bucket = null;

  @JsonProperty("duration") @Builder.Default
  private WindowDuration duration = null;

  @JsonProperty("resource") @Builder.Default
  private String resource = null;

  @JsonProperty("aggregations") @Builder.Default
  private OperationsAggregationsResult aggregations = null;

  public OperationsAggregation bucket(Long bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   *  Bucket start time in milliseconds 
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return bucket
   **/
  @Schema(required = true, description = " Bucket start time in milliseconds ")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getBucket() {
    return bucket;
  }

  public void setBucket(Long bucket) {
    this.bucket = bucket;
  }

  public OperationsAggregation duration(WindowDuration duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public WindowDuration getDuration() {
    return duration;
  }

  public void setDuration(WindowDuration duration) {
    this.duration = duration;
  }

  public OperationsAggregation resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   *  Resource associated with these usage stats 
   * @return resource
   **/
  @Schema(required = true, description = " Resource associated with these usage stats ")
      @NotNull

    public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public OperationsAggregation aggregations(OperationsAggregationsResult aggregations) {
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
    OperationsAggregation operationsAggregation = (OperationsAggregation) o;
    return Objects.equals(this.bucket, operationsAggregation.bucket) &&
        Objects.equals(this.duration, operationsAggregation.duration) &&
        Objects.equals(this.resource, operationsAggregation.resource) &&
        Objects.equals(this.aggregations, operationsAggregation.aggregations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucket, duration, resource, aggregations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationsAggregation {\n");
    
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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