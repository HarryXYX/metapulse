package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FreshnessStats;
import io.datahubproject.openapi.generated.LineageSearchEntity;
import io.datahubproject.openapi.generated.LineageSearchPath;
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
public class LineageSearchResult   {

  @JsonProperty("freshness") @Builder.Default
  private FreshnessStats freshness = null;

  @JsonProperty("entities") @Builder.Default
  @Valid
  private List<LineageSearchEntity> entities = new ArrayList<>();

  @JsonProperty("metadata") @Builder.Default
  private SearchResultMetadata metadata = null;

  @JsonProperty("from") @Builder.Default
  private Integer from = null;

  @JsonProperty("pageSize") @Builder.Default
  private Integer pageSize = null;

  @JsonProperty("numEntities") @Builder.Default
  private Integer numEntities = null;

  @JsonProperty("lineageSearchPath") @Builder.Default
  private LineageSearchPath lineageSearchPath = null;

  public LineageSearchResult freshness(FreshnessStats freshness) {
    this.freshness = freshness;
    return this;
  }

  /**
   * Get freshness
   * @return freshness
   **/
  @Schema(description = "")
  
    @Valid
    public FreshnessStats getFreshness() {
    return freshness;
  }

  public void setFreshness(FreshnessStats freshness) {
    this.freshness = freshness;
  }

  public LineageSearchResult entities(List<LineageSearchEntity> entities) {
    this.entities = entities;
    return this;
  }

  public LineageSearchResult addEntitiesItem(LineageSearchEntity entitiesItem) {
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

  public LineageSearchResult metadata(SearchResultMetadata metadata) {
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

  public LineageSearchResult from(Integer from) {
    this.from = from;
    return this;
  }

  /**
   * Offset of the first entity in the result
   * minimum: -2147483648
   * maximum: 2147483647
   * @return from
   **/
  @Schema(required = true, description = "Offset of the first entity in the result")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public LineageSearchResult pageSize(Integer pageSize) {
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

  public LineageSearchResult numEntities(Integer numEntities) {
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

  public LineageSearchResult lineageSearchPath(LineageSearchPath lineageSearchPath) {
    this.lineageSearchPath = lineageSearchPath;
    return this;
  }

  /**
   * Get lineageSearchPath
   * @return lineageSearchPath
   **/
  @Schema(description = "")
  
    @Valid
    public LineageSearchPath getLineageSearchPath() {
    return lineageSearchPath;
  }

  public void setLineageSearchPath(LineageSearchPath lineageSearchPath) {
    this.lineageSearchPath = lineageSearchPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineageSearchResult lineageSearchResult = (LineageSearchResult) o;
    return Objects.equals(this.freshness, lineageSearchResult.freshness) &&
        Objects.equals(this.entities, lineageSearchResult.entities) &&
        Objects.equals(this.metadata, lineageSearchResult.metadata) &&
        Objects.equals(this.from, lineageSearchResult.from) &&
        Objects.equals(this.pageSize, lineageSearchResult.pageSize) &&
        Objects.equals(this.numEntities, lineageSearchResult.numEntities) &&
        Objects.equals(this.lineageSearchPath, lineageSearchResult.lineageSearchPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freshness, entities, metadata, from, pageSize, numEntities, lineageSearchPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineageSearchResult {\n");
    
    sb.append("    freshness: ").append(toIndentedString(freshness)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    numEntities: ").append(toIndentedString(numEntities)).append("\n");
    sb.append("    lineageSearchPath: ").append(toIndentedString(lineageSearchPath)).append("\n");
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