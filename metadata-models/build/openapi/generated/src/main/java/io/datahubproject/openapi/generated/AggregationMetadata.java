package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FilterValue;
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
/**
 * AggregationMetadata
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AggregationMetadata   {

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("displayName") @Builder.Default
  private String displayName = null;

  @JsonProperty("entity") @Builder.Default
  private String entity = null;

  @JsonProperty("aggregations") @Builder.Default
  @Valid
  private Map<String, Long> aggregations = new HashMap<>();

  @JsonProperty("filterValues") @Builder.Default
  @Valid
  private List<FilterValue> filterValues = new ArrayList<>();

  public AggregationMetadata name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the aggregation, e.g, platform, origin
   * @return name
   **/
  @Schema(required = true, description = "The name of the aggregation, e.g, platform, origin")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AggregationMetadata displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Name of the filter to be displayed in the UI
   * @return displayName
   **/
  @Schema(description = "Name of the filter to be displayed in the UI")
  
    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AggregationMetadata entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Entity associated with this facet
   * @return entity
   **/
  @Schema(description = "Entity associated with this facet")
  
    public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public AggregationMetadata aggregations(Map<String, Long> aggregations) {
    this.aggregations = aggregations;
    return this;
  }

  public AggregationMetadata putAggregationsItem(String key, Long aggregationsItem) {
    this.aggregations.put(key, aggregationsItem);
    return this;
  }

  /**
   * List of aggregations showing the number of documents falling into each bucket. e.g, for platform aggregation, the bucket can be hive, kafka, etc
   * @return aggregations
   **/
  @Schema(required = true, description = "List of aggregations showing the number of documents falling into each bucket. e.g, for platform aggregation, the bucket can be hive, kafka, etc")
      @NotNull

    public Map<String, Long> getAggregations() {
    return aggregations;
  }

  public void setAggregations(Map<String, Long> aggregations) {
    this.aggregations = aggregations;
  }

  public AggregationMetadata filterValues(List<FilterValue> filterValues) {
    this.filterValues = filterValues;
    return this;
  }

  public AggregationMetadata addFilterValuesItem(FilterValue filterValuesItem) {
    this.filterValues.add(filterValuesItem);
    return this;
  }

  /**
   * Get filterValues
   * @return filterValues
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<FilterValue> getFilterValues() {
    return filterValues;
  }

  public void setFilterValues(List<FilterValue> filterValues) {
    this.filterValues = filterValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationMetadata aggregationMetadata = (AggregationMetadata) o;
    return Objects.equals(this.name, aggregationMetadata.name) &&
        Objects.equals(this.displayName, aggregationMetadata.displayName) &&
        Objects.equals(this.entity, aggregationMetadata.entity) &&
        Objects.equals(this.aggregations, aggregationMetadata.aggregations) &&
        Objects.equals(this.filterValues, aggregationMetadata.filterValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, entity, aggregations, filterValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationMetadata {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("    filterValues: ").append(toIndentedString(filterValues)).append("\n");
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