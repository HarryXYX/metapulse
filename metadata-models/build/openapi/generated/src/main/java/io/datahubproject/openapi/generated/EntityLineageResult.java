package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.LineageRelationship;
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
 * A list of lineage information associated with a source Entity
 */
@Schema(description = "A list of lineage information associated with a source Entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityLineageResult   {

  @JsonProperty("start") @Builder.Default
  private Integer start = null;

  @JsonProperty("count") @Builder.Default
  private Integer count = null;

  @JsonProperty("total") @Builder.Default
  private Integer total = null;

  @JsonProperty("filtered") @Builder.Default
  private Integer filtered = 0;

  @JsonProperty("relationships") @Builder.Default
  @Valid
  private List<LineageRelationship> relationships = new ArrayList<>();

  public EntityLineageResult start(Integer start) {
    this.start = start;
    return this;
  }

  /**
   * Start offset of the result set
   * minimum: -2147483648
   * maximum: 2147483647
   * @return start
   **/
  @Schema(required = true, description = "Start offset of the result set")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public EntityLineageResult count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of results in the returned result set
   * minimum: -2147483648
   * maximum: 2147483647
   * @return count
   **/
  @Schema(required = true, description = "Number of results in the returned result set")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public EntityLineageResult total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of results in the result set
   * minimum: -2147483648
   * maximum: 2147483647
   * @return total
   **/
  @Schema(required = true, description = "Total number of results in the result set")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public EntityLineageResult filtered(Integer filtered) {
    this.filtered = filtered;
    return this;
  }

  /**
   * The number of results that were filtered out of the page (soft-deleted or non-existent)
   * minimum: -2147483648
   * maximum: 2147483647
   * @return filtered
   **/
  @Schema(required = true, description = "The number of results that were filtered out of the page (soft-deleted or non-existent)")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getFiltered() {
    return filtered;
  }

  public void setFiltered(Integer filtered) {
    this.filtered = filtered;
  }

  public EntityLineageResult relationships(List<LineageRelationship> relationships) {
    this.relationships = relationships;
    return this;
  }

  public EntityLineageResult addRelationshipsItem(LineageRelationship relationshipsItem) {
    this.relationships.add(relationshipsItem);
    return this;
  }

  /**
   * Relationships in the result set
   * @return relationships
   **/
  @Schema(required = true, description = "Relationships in the result set")
      @NotNull
    @Valid
    public List<LineageRelationship> getRelationships() {
    return relationships;
  }

  public void setRelationships(List<LineageRelationship> relationships) {
    this.relationships = relationships;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityLineageResult entityLineageResult = (EntityLineageResult) o;
    return Objects.equals(this.start, entityLineageResult.start) &&
        Objects.equals(this.count, entityLineageResult.count) &&
        Objects.equals(this.total, entityLineageResult.total) &&
        Objects.equals(this.filtered, entityLineageResult.filtered) &&
        Objects.equals(this.relationships, entityLineageResult.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, count, total, filtered, relationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityLineageResult {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    filtered: ").append(toIndentedString(filtered)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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