package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
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
/**
 * Aggregation results for operations query
 */
@Schema(description = "Aggregation results for operations query")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperationsAggregationsResult   {

  @JsonProperty("totalOperations") @Builder.Default
  private Integer totalOperations = null;

  @JsonProperty("totalInserts") @Builder.Default
  private Integer totalInserts = null;

  @JsonProperty("totalUpdates") @Builder.Default
  private Integer totalUpdates = null;

  @JsonProperty("totalDeletes") @Builder.Default
  private Integer totalDeletes = null;

  @JsonProperty("totalCreates") @Builder.Default
  private Integer totalCreates = null;

  @JsonProperty("totalAlters") @Builder.Default
  private Integer totalAlters = null;

  @JsonProperty("totalDrops") @Builder.Default
  private Integer totalDrops = null;

  @JsonProperty("totalCustoms") @Builder.Default
  private Integer totalCustoms = null;

  @JsonProperty("customOperationsMap") @Builder.Default
  @Valid
  private Map<String, Integer> customOperationsMap = null;

  public OperationsAggregationsResult totalOperations(Integer totalOperations) {
    this.totalOperations = totalOperations;
    return this;
  }

  /**
   *  Total number of operations in the bucket 
   * minimum: -2147483648
   * maximum: 2147483647
   * @return totalOperations
   **/
  @Schema(description = " Total number of operations in the bucket ")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getTotalOperations() {
    return totalOperations;
  }

  public void setTotalOperations(Integer totalOperations) {
    this.totalOperations = totalOperations;
  }

  public OperationsAggregationsResult totalInserts(Integer totalInserts) {
    this.totalInserts = totalInserts;
    return this;
  }

  /**
   *  Total number of inserts in the bucket 
   * minimum: -2147483648
   * maximum: 2147483647
   * @return totalInserts
   **/
  @Schema(description = " Total number of inserts in the bucket ")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getTotalInserts() {
    return totalInserts;
  }

  public void setTotalInserts(Integer totalInserts) {
    this.totalInserts = totalInserts;
  }

  public OperationsAggregationsResult totalUpdates(Integer totalUpdates) {
    this.totalUpdates = totalUpdates;
    return this;
  }

  /**
   *  Total number of updates in the bucket 
   * minimum: -2147483648
   * maximum: 2147483647
   * @return totalUpdates
   **/
  @Schema(description = " Total number of updates in the bucket ")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getTotalUpdates() {
    return totalUpdates;
  }

  public void setTotalUpdates(Integer totalUpdates) {
    this.totalUpdates = totalUpdates;
  }

  public OperationsAggregationsResult totalDeletes(Integer totalDeletes) {
    this.totalDeletes = totalDeletes;
    return this;
  }

  /**
   *  Total number of deletes in the bucket 
   * minimum: -2147483648
   * maximum: 2147483647
   * @return totalDeletes
   **/
  @Schema(description = " Total number of deletes in the bucket ")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getTotalDeletes() {
    return totalDeletes;
  }

  public void setTotalDeletes(Integer totalDeletes) {
    this.totalDeletes = totalDeletes;
  }

  public OperationsAggregationsResult totalCreates(Integer totalCreates) {
    this.totalCreates = totalCreates;
    return this;
  }

  /**
   *  Total number of creates in the bucket 
   * minimum: -2147483648
   * maximum: 2147483647
   * @return totalCreates
   **/
  @Schema(description = " Total number of creates in the bucket ")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getTotalCreates() {
    return totalCreates;
  }

  public void setTotalCreates(Integer totalCreates) {
    this.totalCreates = totalCreates;
  }

  public OperationsAggregationsResult totalAlters(Integer totalAlters) {
    this.totalAlters = totalAlters;
    return this;
  }

  /**
   *  Total number of alters in the bucket 
   * minimum: -2147483648
   * maximum: 2147483647
   * @return totalAlters
   **/
  @Schema(description = " Total number of alters in the bucket ")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getTotalAlters() {
    return totalAlters;
  }

  public void setTotalAlters(Integer totalAlters) {
    this.totalAlters = totalAlters;
  }

  public OperationsAggregationsResult totalDrops(Integer totalDrops) {
    this.totalDrops = totalDrops;
    return this;
  }

  /**
   *  Total number of drops in the bucket 
   * minimum: -2147483648
   * maximum: 2147483647
   * @return totalDrops
   **/
  @Schema(description = " Total number of drops in the bucket ")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getTotalDrops() {
    return totalDrops;
  }

  public void setTotalDrops(Integer totalDrops) {
    this.totalDrops = totalDrops;
  }

  public OperationsAggregationsResult totalCustoms(Integer totalCustoms) {
    this.totalCustoms = totalCustoms;
    return this;
  }

  /**
   *  Total number of custom types in the bucket 
   * minimum: -2147483648
   * maximum: 2147483647
   * @return totalCustoms
   **/
  @Schema(description = " Total number of custom types in the bucket ")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getTotalCustoms() {
    return totalCustoms;
  }

  public void setTotalCustoms(Integer totalCustoms) {
    this.totalCustoms = totalCustoms;
  }

  public OperationsAggregationsResult customOperationsMap(Map<String, Integer> customOperationsMap) {
    this.customOperationsMap = customOperationsMap;
    return this;
  }

  public OperationsAggregationsResult putCustomOperationsMapItem(String key, Integer customOperationsMapItem) {
    if (this.customOperationsMap == null) {
      this.customOperationsMap = new HashMap<>();
    }
    this.customOperationsMap.put(key, customOperationsMapItem);
    return this;
  }

  /**
   *  A map from each custom operation type to the total count for that type
   * @return customOperationsMap
   **/
  @Schema(description = " A map from each custom operation type to the total count for that type")
  
    public Map<String, Integer> getCustomOperationsMap() {
    return customOperationsMap;
  }

  public void setCustomOperationsMap(Map<String, Integer> customOperationsMap) {
    this.customOperationsMap = customOperationsMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationsAggregationsResult operationsAggregationsResult = (OperationsAggregationsResult) o;
    return Objects.equals(this.totalOperations, operationsAggregationsResult.totalOperations) &&
        Objects.equals(this.totalInserts, operationsAggregationsResult.totalInserts) &&
        Objects.equals(this.totalUpdates, operationsAggregationsResult.totalUpdates) &&
        Objects.equals(this.totalDeletes, operationsAggregationsResult.totalDeletes) &&
        Objects.equals(this.totalCreates, operationsAggregationsResult.totalCreates) &&
        Objects.equals(this.totalAlters, operationsAggregationsResult.totalAlters) &&
        Objects.equals(this.totalDrops, operationsAggregationsResult.totalDrops) &&
        Objects.equals(this.totalCustoms, operationsAggregationsResult.totalCustoms) &&
        Objects.equals(this.customOperationsMap, operationsAggregationsResult.customOperationsMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalOperations, totalInserts, totalUpdates, totalDeletes, totalCreates, totalAlters, totalDrops, totalCustoms, customOperationsMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationsAggregationsResult {\n");
    
    sb.append("    totalOperations: ").append(toIndentedString(totalOperations)).append("\n");
    sb.append("    totalInserts: ").append(toIndentedString(totalInserts)).append("\n");
    sb.append("    totalUpdates: ").append(toIndentedString(totalUpdates)).append("\n");
    sb.append("    totalDeletes: ").append(toIndentedString(totalDeletes)).append("\n");
    sb.append("    totalCreates: ").append(toIndentedString(totalCreates)).append("\n");
    sb.append("    totalAlters: ").append(toIndentedString(totalAlters)).append("\n");
    sb.append("    totalDrops: ").append(toIndentedString(totalDrops)).append("\n");
    sb.append("    totalCustoms: ").append(toIndentedString(totalCustoms)).append("\n");
    sb.append("    customOperationsMap: ").append(toIndentedString(customOperationsMap)).append("\n");
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