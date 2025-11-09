package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.BrowseResultEntity;
import io.datahubproject.openapi.generated.BrowseResultGroup;
import io.datahubproject.openapi.generated.BrowseResultMetadata;
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
 * The model for the result of a browse query
 */
@Schema(description = "The model for the result of a browse query")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrowseResult   {

  @JsonProperty("entities") @Builder.Default
  @Valid
  private List<BrowseResultEntity> entities = new ArrayList<>();

  @JsonProperty("groups") @Builder.Default
  @Valid
  private List<BrowseResultGroup> groups = new ArrayList<>();

  @JsonProperty("metadata") @Builder.Default
  private BrowseResultMetadata metadata = null;

  @JsonProperty("from") @Builder.Default
  private Integer from = null;

  @JsonProperty("pageSize") @Builder.Default
  private Integer pageSize = null;

  @JsonProperty("numEntities") @Builder.Default
  private Integer numEntities = null;

  @JsonProperty("numGroups") @Builder.Default
  private Integer numGroups = null;

  @JsonProperty("numElements") @Builder.Default
  private Integer numElements = null;

  public BrowseResult entities(List<BrowseResultEntity> entities) {
    this.entities = entities;
    return this;
  }

  public BrowseResult addEntitiesItem(BrowseResultEntity entitiesItem) {
    this.entities.add(entitiesItem);
    return this;
  }

  /**
   * A list of entities under the queried path
   * @return entities
   **/
  @Schema(required = true, description = "A list of entities under the queried path")
      @NotNull
    @Valid
    public List<BrowseResultEntity> getEntities() {
    return entities;
  }

  public void setEntities(List<BrowseResultEntity> entities) {
    this.entities = entities;
  }

  public BrowseResult groups(List<BrowseResultGroup> groups) {
    this.groups = groups;
    return this;
  }

  public BrowseResult addGroupsItem(BrowseResultGroup groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * A list of groups and total number of entities inside those groups under the queried path
   * @return groups
   **/
  @Schema(required = true, description = "A list of groups and total number of entities inside those groups under the queried path")
      @NotNull
    @Valid
    public List<BrowseResultGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<BrowseResultGroup> groups) {
    this.groups = groups;
  }

  public BrowseResult metadata(BrowseResultMetadata metadata) {
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
    public BrowseResultMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(BrowseResultMetadata metadata) {
    this.metadata = metadata;
  }

  public BrowseResult from(Integer from) {
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

  public BrowseResult pageSize(Integer pageSize) {
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

  public BrowseResult numEntities(Integer numEntities) {
    this.numEntities = numEntities;
    return this;
  }

  /**
   * The total number of entities directly under queried path
   * minimum: -2147483648
   * maximum: 2147483647
   * @return numEntities
   **/
  @Schema(required = true, description = "The total number of entities directly under queried path")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getNumEntities() {
    return numEntities;
  }

  public void setNumEntities(Integer numEntities) {
    this.numEntities = numEntities;
  }

  public BrowseResult numGroups(Integer numGroups) {
    this.numGroups = numGroups;
    return this;
  }

  /**
   * The total number of groups directly under queried path
   * minimum: -2147483648
   * maximum: 2147483647
   * @return numGroups
   **/
  @Schema(required = true, description = "The total number of groups directly under queried path")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getNumGroups() {
    return numGroups;
  }

  public void setNumGroups(Integer numGroups) {
    this.numGroups = numGroups;
  }

  public BrowseResult numElements(Integer numElements) {
    this.numElements = numElements;
    return this;
  }

  /**
   * The total number of elements (entities + groups) directly under queried path
   * minimum: -2147483648
   * maximum: 2147483647
   * @return numElements
   **/
  @Schema(required = true, description = "The total number of elements (entities + groups) directly under queried path")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getNumElements() {
    return numElements;
  }

  public void setNumElements(Integer numElements) {
    this.numElements = numElements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowseResult browseResult = (BrowseResult) o;
    return Objects.equals(this.entities, browseResult.entities) &&
        Objects.equals(this.groups, browseResult.groups) &&
        Objects.equals(this.metadata, browseResult.metadata) &&
        Objects.equals(this.from, browseResult.from) &&
        Objects.equals(this.pageSize, browseResult.pageSize) &&
        Objects.equals(this.numEntities, browseResult.numEntities) &&
        Objects.equals(this.numGroups, browseResult.numGroups) &&
        Objects.equals(this.numElements, browseResult.numElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, groups, metadata, from, pageSize, numEntities, numGroups, numElements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowseResult {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    numEntities: ").append(toIndentedString(numEntities)).append("\n");
    sb.append("    numGroups: ").append(toIndentedString(numGroups)).append("\n");
    sb.append("    numElements: ").append(toIndentedString(numElements)).append("\n");
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