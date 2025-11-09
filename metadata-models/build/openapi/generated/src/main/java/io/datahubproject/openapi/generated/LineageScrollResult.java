package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.LineageSearchEntity;
import io.datahubproject.openapi.generated.SearchResultMetadata;
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
 * The model for the result of a lineage search query
 */
@Schema(description = "The model for the result of a lineage search query")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LineageScrollResult   {

  @JsonProperty("entities") @Builder.Default
  @Valid
  private List<LineageSearchEntity> entities = new ArrayList<>();

  @JsonProperty("metadata") @Builder.Default
  private SearchResultMetadata metadata = null;

  @JsonProperty("scrollId") @Builder.Default
  private String scrollId = null;

  @JsonProperty("pageSize") @Builder.Default
  private Integer pageSize = null;

  @JsonProperty("numEntities") @Builder.Default
  private Integer numEntities = null;

  public LineageScrollResult entities(List<LineageSearchEntity> entities) {
    this.entities = entities;
    return this;
  }

  public LineageScrollResult addEntitiesItem(LineageSearchEntity entitiesItem) {
    this.entities.add(entitiesItem);
    return this;
  }

  /**
   * A list of entities returned from the search results
   * @return entities
   **/
  @Schema(required = true, description = "A list of entities returned from the search results")
      @NotNull
    @Valid
    public List<LineageSearchEntity> getEntities() {
    return entities;
  }

  public void setEntities(List<LineageSearchEntity> entities) {
    this.entities = entities;
  }

  public LineageScrollResult metadata(SearchResultMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SearchResultMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(SearchResultMetadata metadata) {
    this.metadata = metadata;
  }

  public LineageScrollResult scrollId(String scrollId) {
    this.scrollId = scrollId;
    return this;
  }

  /**
   * Scroll Identifier for subsequent requests, if not present then no further results to fetch
   * @return scrollId
   **/
  @Schema(description = "Scroll Identifier for subsequent requests, if not present then no further results to fetch")
  
    public String getScrollId() {
    return scrollId;
  }

  public void setScrollId(String scrollId) {
    this.scrollId = scrollId;
  }

  public LineageScrollResult pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Size of each page in the result
   * minimum: -2147483648
   * maximum: 2147483647
   * @return pageSize
   **/
  @Schema(required = true, description = "Size of each page in the result")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public LineageScrollResult numEntities(Integer numEntities) {
    this.numEntities = numEntities;
    return this;
  }

  /**
   * The total number of entities directly under searched path
   * minimum: -2147483648
   * maximum: 2147483647
   * @return numEntities
   **/
  @Schema(required = true, description = "The total number of entities directly under searched path")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getNumEntities() {
    return numEntities;
  }

  public void setNumEntities(Integer numEntities) {
    this.numEntities = numEntities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineageScrollResult lineageScrollResult = (LineageScrollResult) o;
    return Objects.equals(this.entities, lineageScrollResult.entities) &&
        Objects.equals(this.metadata, lineageScrollResult.metadata) &&
        Objects.equals(this.scrollId, lineageScrollResult.scrollId) &&
        Objects.equals(this.pageSize, lineageScrollResult.pageSize) &&
        Objects.equals(this.numEntities, lineageScrollResult.numEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, metadata, scrollId, pageSize, numEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineageScrollResult {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    scrollId: ").append(toIndentedString(scrollId)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    numEntities: ").append(toIndentedString(numEntities)).append("\n");
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