package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.MatchedField;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
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
 * The model for each entity returned by the lineage search query
 */
@Schema(description = "The model for each entity returned by the lineage search query")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LineageSearchEntity   {

  @JsonProperty("entity") @Builder.Default
  private String entity = null;

  @JsonProperty("matchedFields") @Builder.Default
  @Valid
  private List<MatchedField> matchedFields = new ArrayList<>();

  @JsonProperty("features") @Builder.Default
  @Valid
  private Map<String, BigDecimal> features = null;

  @JsonProperty("score") @Builder.Default
  private BigDecimal score = null;

  @JsonProperty("restrictedAspects") @Builder.Default
  @Valid
  private List<String> restrictedAspects = null;

  @JsonProperty("extraFields") @Builder.Default
  @Valid
  private Map<String, String> extraFields = null;

  @JsonProperty("paths") @Builder.Default
  @Valid
  private List<List<String>> paths = new ArrayList<>();

  @JsonProperty("path") @Builder.Default
  @Valid
  private List<String> path = new ArrayList<>();

  @JsonProperty("degree") @Builder.Default
  private Integer degree = 1;

  @JsonProperty("degrees") @Builder.Default
  @Valid
  private List<Integer> degrees = new ArrayList<>();

  @JsonProperty("explored") @Builder.Default
  private Boolean explored = null;

  @JsonProperty("truncatedChildren") @Builder.Default
  private Boolean truncatedChildren = null;

  @JsonProperty("ignoredAsHop") @Builder.Default
  private Boolean ignoredAsHop = null;

  public LineageSearchEntity entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Urn of the entity being returned
   * @return entity
   **/
  @Schema(required = true, description = "Urn of the entity being returned")
      @NotNull

    public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public LineageSearchEntity matchedFields(List<MatchedField> matchedFields) {
    this.matchedFields = matchedFields;
    return this;
  }

  public LineageSearchEntity addMatchedFieldsItem(MatchedField matchedFieldsItem) {
    this.matchedFields.add(matchedFieldsItem);
    return this;
  }

  /**
   * Matched field name and values
   * @return matchedFields
   **/
  @Schema(required = true, description = "Matched field name and values")
      @NotNull
    @Valid
    public List<MatchedField> getMatchedFields() {
    return matchedFields;
  }

  public void setMatchedFields(List<MatchedField> matchedFields) {
    this.matchedFields = matchedFields;
  }

  public LineageSearchEntity features(Map<String, BigDecimal> features) {
    this.features = features;
    return this;
  }

  public LineageSearchEntity putFeaturesItem(String key, BigDecimal featuresItem) {
    if (this.features == null) {
      this.features = new HashMap<>();
    }
    this.features.put(key, featuresItem);
    return this;
  }

  /**
   * Get features
   * @return features
   **/
  @Schema(description = "")
      @Valid
    public Map<String, BigDecimal> getFeatures() {
    return features;
  }

  public void setFeatures(Map<String, BigDecimal> features) {
    this.features = features;
  }

  public LineageSearchEntity score(BigDecimal score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getScore() {
    return score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }

  public LineageSearchEntity restrictedAspects(List<String> restrictedAspects) {
    this.restrictedAspects = restrictedAspects;
    return this;
  }

  public LineageSearchEntity addRestrictedAspectsItem(String restrictedAspectsItem) {
    if (this.restrictedAspects == null) {
      this.restrictedAspects = new ArrayList<>();
    }
    this.restrictedAspects.add(restrictedAspectsItem);
    return this;
  }

  /**
   * A list of the the restricted aspects on the entity. If the key aspect is present, assume ALL aspects should be restricted including the entity's Urn.
   * @return restrictedAspects
   **/
  @Schema(description = "A list of the the restricted aspects on the entity. If the key aspect is present, assume ALL aspects should be restricted including the entity's Urn.")
  
    public List<String> getRestrictedAspects() {
    return restrictedAspects;
  }

  public void setRestrictedAspects(List<String> restrictedAspects) {
    this.restrictedAspects = restrictedAspects;
  }

  public LineageSearchEntity extraFields(Map<String, String> extraFields) {
    this.extraFields = extraFields;
    return this;
  }

  public LineageSearchEntity putExtraFieldsItem(String key, String extraFieldsItem) {
    if (this.extraFields == null) {
      this.extraFields = new HashMap<>();
    }
    this.extraFields.put(key, extraFieldsItem);
    return this;
  }

  /**
   * Extra fields from the search document based on what is requested in the search request
   * @return extraFields
   **/
  @Schema(description = "Extra fields from the search document based on what is requested in the search request")
  
    public Map<String, String> getExtraFields() {
    return extraFields;
  }

  public void setExtraFields(Map<String, String> extraFields) {
    this.extraFields = extraFields;
  }

  public LineageSearchEntity paths(List<List<String>> paths) {
    this.paths = paths;
    return this;
  }

  public LineageSearchEntity addPathsItem(List<String> pathsItem) {
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

  public LineageSearchEntity path(List<String> path) {
    this.path = path;
    return this;
  }

  public LineageSearchEntity addPathItem(String pathItem) {
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

  public LineageSearchEntity degree(Integer degree) {
    this.degree = degree;
    return this;
  }

  /**
   * Degree of relationship (number of hops to get to entity)
   * minimum: -2147483648
   * maximum: 2147483647
   * @return degree
   **/
  @Schema(required = true, description = "Degree of relationship (number of hops to get to entity)")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getDegree() {
    return degree;
  }

  public void setDegree(Integer degree) {
    this.degree = degree;
  }

  public LineageSearchEntity degrees(List<Integer> degrees) {
    this.degrees = degrees;
    return this;
  }

  public LineageSearchEntity addDegreesItem(Integer degreesItem) {
    this.degrees.add(degreesItem);
    return this;
  }

  /**
   * The degrees of separation (number of hops) between the source and this entity 
   * @return degrees
   **/
  @Schema(required = true, description = "The degrees of separation (number of hops) between the source and this entity ")
      @NotNull

    public List<Integer> getDegrees() {
    return degrees;
  }

  public void setDegrees(List<Integer> degrees) {
    this.degrees = degrees;
  }

  public LineageSearchEntity explored(Boolean explored) {
    this.explored = explored;
    return this;
  }

  /**
   * Marks an entity as having been explored for as a part of the graph walk
   * @return explored
   **/
  @Schema(description = "Marks an entity as having been explored for as a part of the graph walk")
  
    public Boolean isExplored() {
    return explored;
  }

  public void setExplored(Boolean explored) {
    this.explored = explored;
  }

  public LineageSearchEntity truncatedChildren(Boolean truncatedChildren) {
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

  public LineageSearchEntity ignoredAsHop(Boolean ignoredAsHop) {
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
    LineageSearchEntity lineageSearchEntity = (LineageSearchEntity) o;
    return Objects.equals(this.entity, lineageSearchEntity.entity) &&
        Objects.equals(this.matchedFields, lineageSearchEntity.matchedFields) &&
        Objects.equals(this.features, lineageSearchEntity.features) &&
        Objects.equals(this.score, lineageSearchEntity.score) &&
        Objects.equals(this.restrictedAspects, lineageSearchEntity.restrictedAspects) &&
        Objects.equals(this.extraFields, lineageSearchEntity.extraFields) &&
        Objects.equals(this.paths, lineageSearchEntity.paths) &&
        Objects.equals(this.path, lineageSearchEntity.path) &&
        Objects.equals(this.degree, lineageSearchEntity.degree) &&
        Objects.equals(this.degrees, lineageSearchEntity.degrees) &&
        Objects.equals(this.explored, lineageSearchEntity.explored) &&
        Objects.equals(this.truncatedChildren, lineageSearchEntity.truncatedChildren) &&
        Objects.equals(this.ignoredAsHop, lineageSearchEntity.ignoredAsHop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, matchedFields, features, score, restrictedAspects, extraFields, paths, path, degree, degrees, explored, truncatedChildren, ignoredAsHop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineageSearchEntity {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    matchedFields: ").append(toIndentedString(matchedFields)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    restrictedAspects: ").append(toIndentedString(restrictedAspects)).append("\n");
    sb.append("    extraFields: ").append(toIndentedString(extraFields)).append("\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
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