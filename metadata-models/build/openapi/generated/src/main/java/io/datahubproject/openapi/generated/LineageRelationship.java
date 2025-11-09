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
 * Metadata about a lineage relationship between two entities
 */
@Schema(description = "Metadata about a lineage relationship between two entities")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LineageRelationship   {

  @JsonProperty("type") @Builder.Default
  private String type = null;

  @JsonProperty("entity") @Builder.Default
  private String entity = null;

  @JsonProperty("paths") @Builder.Default
  @Valid
  private List<List<String>> paths = new ArrayList<>();

  @JsonProperty("path") @Builder.Default
  @Valid
  private List<String> path = new ArrayList<>();

  @JsonProperty("degree") @Builder.Default
  private Integer degree = 1;

  @JsonProperty("createdOn") @Builder.Default
  private Long createdOn = null;

  @JsonProperty("createdActor") @Builder.Default
  private String createdActor = null;

  @JsonProperty("updatedOn") @Builder.Default
  private Long updatedOn = null;

  @JsonProperty("updatedActor") @Builder.Default
  private String updatedActor = null;

  @JsonProperty("isManual") @Builder.Default
  private Boolean isManual = null;

  @JsonProperty("degrees") @Builder.Default
  @Valid
  private List<Integer> degrees = null;

  @JsonProperty("explored") @Builder.Default
  private Boolean explored = null;

  @JsonProperty("truncatedChildren") @Builder.Default
  private Boolean truncatedChildren = null;

  @JsonProperty("ignoredAsHop") @Builder.Default
  private Boolean ignoredAsHop = null;

  public LineageRelationship type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the relationship
   * @return type
   **/
  @Schema(required = true, description = "The type of the relationship")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public LineageRelationship entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Entity that is related via lineage
   * @return entity
   **/
  @Schema(required = true, description = "Entity that is related via lineage")
      @NotNull

    public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public LineageRelationship paths(List<List<String>> paths) {
    this.paths = paths;
    return this;
  }

  public LineageRelationship addPathsItem(List<String> pathsItem) {
    this.paths.add(pathsItem);
    return this;
  }

  /**
   * Optional list of entities between the source and destination node. There can be multiple paths from the source to the destination.
   * @return paths
   **/
  @Schema(required = true, description = "Optional list of entities between the source and destination node. There can be multiple paths from the source to the destination.")
      @NotNull
    @Valid
    public List<List<String>> getPaths() {
    return paths;
  }

  public void setPaths(List<List<String>> paths) {
    this.paths = paths;
  }

  public LineageRelationship path(List<String> path) {
    this.path = path;
    return this;
  }

  public LineageRelationship addPathItem(String pathItem) {
    this.path.add(pathItem);
    return this;
  }

  /**
   * Optional list of entities between the source and destination node
   * @return path
   **/
  @Schema(required = true, description = "Optional list of entities between the source and destination node")
      @NotNull

    public List<String> getPath() {
    return path;
  }

  public void setPath(List<String> path) {
    this.path = path;
  }

  public LineageRelationship degree(Integer degree) {
    this.degree = degree;
    return this;
  }

  /**
   * Degree of relationship (number of hops to get to entity) Deprecated by degrees. degree field is populated by min(degrees) for backward compatibility.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return degree
   **/
  @Schema(required = true, description = "Degree of relationship (number of hops to get to entity) Deprecated by degrees. degree field is populated by min(degrees) for backward compatibility.")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getDegree() {
    return degree;
  }

  public void setDegree(Integer degree) {
    this.degree = degree;
  }

  public LineageRelationship createdOn(Long createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Timestamp for when this lineage relationship was created. Could be null.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return createdOn
   **/
  @Schema(description = "Timestamp for when this lineage relationship was created. Could be null.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Long createdOn) {
    this.createdOn = createdOn;
  }

  public LineageRelationship createdActor(String createdActor) {
    this.createdActor = createdActor;
    return this;
  }

  /**
   * Urn of the actor that created this lineage relationship. Could be null.
   * @return createdActor
   **/
  @Schema(description = "Urn of the actor that created this lineage relationship. Could be null.")
  
    public String getCreatedActor() {
    return createdActor;
  }

  public void setCreatedActor(String createdActor) {
    this.createdActor = createdActor;
  }

  public LineageRelationship updatedOn(Long updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

  /**
   * Timestamp for when this lineage relationship was last updated. Could be null.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return updatedOn
   **/
  @Schema(description = "Timestamp for when this lineage relationship was last updated. Could be null.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(Long updatedOn) {
    this.updatedOn = updatedOn;
  }

  public LineageRelationship updatedActor(String updatedActor) {
    this.updatedActor = updatedActor;
    return this;
  }

  /**
   * Urn of the actor that last updated this lineage relationship. Could be null.
   * @return updatedActor
   **/
  @Schema(description = "Urn of the actor that last updated this lineage relationship. Could be null.")
  
    public String getUpdatedActor() {
    return updatedActor;
  }

  public void setUpdatedActor(String updatedActor) {
    this.updatedActor = updatedActor;
  }

  public LineageRelationship isManual(Boolean isManual) {
    this.isManual = isManual;
    return this;
  }

  /**
   * Whether this lineage edge is a manual edge.
   * @return isManual
   **/
  @Schema(description = "Whether this lineage edge is a manual edge.")
  
    public Boolean isIsManual() {
    return isManual;
  }

  public void setIsManual(Boolean isManual) {
    this.isManual = isManual;
  }

  public LineageRelationship degrees(List<Integer> degrees) {
    this.degrees = degrees;
    return this;
  }

  public LineageRelationship addDegreesItem(Integer degreesItem) {
    if (this.degrees == null) {
      this.degrees = new ArrayList<>();
    }
    this.degrees.add(degreesItem);
    return this;
  }

  /**
   * The different depths at which this entity is discovered in the lineage graph. Marked as optional to maintain backward compatibility, but is filled out by implementations.  Replaces the deprecated field \"degree\".
   * @return degrees
   **/
  @Schema(description = "The different depths at which this entity is discovered in the lineage graph. Marked as optional to maintain backward compatibility, but is filled out by implementations.  Replaces the deprecated field \"degree\".")
  
    public List<Integer> getDegrees() {
    return degrees;
  }

  public void setDegrees(List<Integer> degrees) {
    this.degrees = degrees;
  }

  public LineageRelationship explored(Boolean explored) {
    this.explored = explored;
    return this;
  }

  /**
   * Marks this relationship as explored during the graph walk
   * @return explored
   **/
  @Schema(description = "Marks this relationship as explored during the graph walk")
  
    public Boolean isExplored() {
    return explored;
  }

  public void setExplored(Boolean explored) {
    this.explored = explored;
  }

  public LineageRelationship truncatedChildren(Boolean truncatedChildren) {
    this.truncatedChildren = truncatedChildren;
    return this;
  }

  /**
   * Indicates this destination node has additional unexplored child relationships
   * @return truncatedChildren
   **/
  @Schema(description = "Indicates this destination node has additional unexplored child relationships")
  
    public Boolean isTruncatedChildren() {
    return truncatedChildren;
  }

  public void setTruncatedChildren(Boolean truncatedChildren) {
    this.truncatedChildren = truncatedChildren;
  }

  public LineageRelationship ignoredAsHop(Boolean ignoredAsHop) {
    this.ignoredAsHop = ignoredAsHop;
    return this;
  }

  /**
   * Whether this relationship was ignored as a hop while performing the graph walk
   * @return ignoredAsHop
   **/
  @Schema(description = "Whether this relationship was ignored as a hop while performing the graph walk")
  
    public Boolean isIgnoredAsHop() {
    return ignoredAsHop;
  }

  public void setIgnoredAsHop(Boolean ignoredAsHop) {
    this.ignoredAsHop = ignoredAsHop;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineageRelationship lineageRelationship = (LineageRelationship) o;
    return Objects.equals(this.type, lineageRelationship.type) &&
        Objects.equals(this.entity, lineageRelationship.entity) &&
        Objects.equals(this.paths, lineageRelationship.paths) &&
        Objects.equals(this.path, lineageRelationship.path) &&
        Objects.equals(this.degree, lineageRelationship.degree) &&
        Objects.equals(this.createdOn, lineageRelationship.createdOn) &&
        Objects.equals(this.createdActor, lineageRelationship.createdActor) &&
        Objects.equals(this.updatedOn, lineageRelationship.updatedOn) &&
        Objects.equals(this.updatedActor, lineageRelationship.updatedActor) &&
        Objects.equals(this.isManual, lineageRelationship.isManual) &&
        Objects.equals(this.degrees, lineageRelationship.degrees) &&
        Objects.equals(this.explored, lineageRelationship.explored) &&
        Objects.equals(this.truncatedChildren, lineageRelationship.truncatedChildren) &&
        Objects.equals(this.ignoredAsHop, lineageRelationship.ignoredAsHop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, entity, paths, path, degree, createdOn, createdActor, updatedOn, updatedActor, isManual, degrees, explored, truncatedChildren, ignoredAsHop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineageRelationship {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    createdActor: ").append(toIndentedString(createdActor)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    updatedActor: ").append(toIndentedString(updatedActor)).append("\n");
    sb.append("    isManual: ").append(toIndentedString(isManual)).append("\n");
    sb.append("    degrees: ").append(toIndentedString(degrees)).append("\n");
    sb.append("    explored: ").append(toIndentedString(explored)).append("\n");
    sb.append("    truncatedChildren: ").append(toIndentedString(truncatedChildren)).append("\n");
    sb.append("    ignoredAsHop: ").append(toIndentedString(ignoredAsHop)).append("\n");
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