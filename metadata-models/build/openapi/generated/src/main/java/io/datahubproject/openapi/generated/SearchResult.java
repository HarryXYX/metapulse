package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.SearchEntity;
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
 * The model for the result of a search query
 */
@Schema(description = "The model for the result of a search query")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchResult   {

  @JsonProperty("entities") @Builder.Default
  @Valid
  private List<SearchEntity> entities = new ArrayList<>();

  @JsonProperty("metadata") @Builder.Default
  private SearchResultMetadata metadata = null;

  @JsonProperty("from") @Builder.Default
  private Integer from = null;

  @JsonProperty("pageSize") @Builder.Default
  private Integer pageSize = null;

  @JsonProperty("numEntities") @Builder.Default
  private Integer numEntities = null;

  public SearchResult entities(List<SearchEntity> entities) {
    this.entities = entities;
    return this;
  }

  public SearchResult addEntitiesItem(SearchEntity entitiesItem) {
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
    public List<SearchEntity> getEntities() {
    return entities;
  }

  public void setEntities(List<SearchEntity> entities) {
    this.entities = entities;
  }

  public SearchResult metadata(SearchResultMetadata metadata) {
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

  public SearchResult from(Integer from) {
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

  public SearchResult pageSize(Integer pageSize) {
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

  public SearchResult numEntities(Integer numEntities) {
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
    SearchResult searchResult = (SearchResult) o;
    return Objects.equals(this.entities, searchResult.entities) &&
        Objects.equals(this.metadata, searchResult.metadata) &&
        Objects.equals(this.from, searchResult.from) &&
        Objects.equals(this.pageSize, searchResult.pageSize) &&
        Objects.equals(this.numEntities, searchResult.numEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, metadata, from, pageSize, numEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResult {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
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