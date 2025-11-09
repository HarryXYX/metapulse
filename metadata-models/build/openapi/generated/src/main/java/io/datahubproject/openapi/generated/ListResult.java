package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * The model for the result of a list query
 */
@Schema(description = "The model for the result of a list query")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListResult   {

  @JsonProperty("entities") @Builder.Default
  @Valid
  private List<String> entities = new ArrayList<>();

  @JsonProperty("start") @Builder.Default
  private Integer start = null;

  @JsonProperty("count") @Builder.Default
  private Integer count = null;

  @JsonProperty("total") @Builder.Default
  private Integer total = null;

  public ListResult entities(List<String> entities) {
    this.entities = entities;
    return this;
  }

  public ListResult addEntitiesItem(String entitiesItem) {
    this.entities.add(entitiesItem);
    return this;
  }

  /**
   * A list of entities returned in the list
   * @return entities
   **/
  @Schema(required = true, description = "A list of entities returned in the list")
      @NotNull

    public List<String> getEntities() {
    return entities;
  }

  public void setEntities(List<String> entities) {
    this.entities = entities;
  }

  public ListResult start(Integer start) {
    this.start = start;
    return this;
  }

  /**
   * Offset of the first entity in the result
   * minimum: -2147483648
   * maximum: 2147483647
   * @return start
   **/
  @Schema(required = true, description = "Offset of the first entity in the result")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public ListResult count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Size of each page in the result
   * minimum: -2147483648
   * maximum: 2147483647
   * @return count
   **/
  @Schema(required = true, description = "Size of each page in the result")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ListResult total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * The total number of entities directly under searched path
   * minimum: -2147483648
   * maximum: 2147483647
   * @return total
   **/
  @Schema(required = true, description = "The total number of entities directly under searched path")
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
    ListResult listResult = (ListResult) o;
    return Objects.equals(this.entities, listResult.entities) &&
        Objects.equals(this.start, listResult.start) &&
        Objects.equals(this.count, listResult.count) &&
        Objects.equals(this.total, listResult.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, start, count, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListResult {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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