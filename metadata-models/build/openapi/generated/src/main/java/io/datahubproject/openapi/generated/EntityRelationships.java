package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.EntityRelationship;
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
 * Downstream lineage of a dataset
 */
@Schema(description = "Downstream lineage of a dataset")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityRelationships   {

  @JsonProperty("relationships") @Builder.Default
  @Valid
  private List<EntityRelationship> relationships = new ArrayList<>();

  @JsonProperty("start") @Builder.Default
  private Integer start = null;

  @JsonProperty("count") @Builder.Default
  private Integer count = null;

  @JsonProperty("total") @Builder.Default
  private Integer total = null;

  public EntityRelationships relationships(List<EntityRelationship> relationships) {
    this.relationships = relationships;
    return this;
  }

  public EntityRelationships addRelationshipsItem(EntityRelationship relationshipsItem) {
    this.relationships.add(relationshipsItem);
    return this;
  }

  /**
   * List of related entities
   * @return relationships
   **/
  @Schema(required = true, description = "List of related entities")
      @NotNull
    @Valid
    public List<EntityRelationship> getRelationships() {
    return relationships;
  }

  public void setRelationships(List<EntityRelationship> relationships) {
    this.relationships = relationships;
  }

  public EntityRelationships start(Integer start) {
    this.start = start;
    return this;
  }

  /**
   * The start of the result set
   * minimum: -2147483648
   * maximum: 2147483647
   * @return start
   **/
  @Schema(required = true, description = "The start of the result set")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public EntityRelationships count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The start of the result set
   * minimum: -2147483648
   * maximum: 2147483647
   * @return count
   **/
  @Schema(required = true, description = "The start of the result set")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public EntityRelationships total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of edges found.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return total
   **/
  @Schema(required = true, description = "Total number of edges found.")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityRelationships entityRelationships = (EntityRelationships) o;
    return Objects.equals(this.relationships, entityRelationships.relationships) &&
        Objects.equals(this.start, entityRelationships.start) &&
        Objects.equals(this.count, entityRelationships.count) &&
        Objects.equals(this.total, entityRelationships.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationships, start, count, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityRelationships {\n");
    
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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