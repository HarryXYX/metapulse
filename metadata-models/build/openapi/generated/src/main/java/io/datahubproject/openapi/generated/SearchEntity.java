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
 * The model for each entity returned by the search query
 */
@Schema(description = "The model for each entity returned by the search query")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchEntity   {

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

  public SearchEntity entity(String entity) {
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

  public SearchEntity matchedFields(List<MatchedField> matchedFields) {
    this.matchedFields = matchedFields;
    return this;
  }

  public SearchEntity addMatchedFieldsItem(MatchedField matchedFieldsItem) {
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

  public SearchEntity features(Map<String, BigDecimal> features) {
    this.features = features;
    return this;
  }

  public SearchEntity putFeaturesItem(String key, BigDecimal featuresItem) {
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

  public SearchEntity score(BigDecimal score) {
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

  public SearchEntity restrictedAspects(List<String> restrictedAspects) {
    this.restrictedAspects = restrictedAspects;
    return this;
  }

  public SearchEntity addRestrictedAspectsItem(String restrictedAspectsItem) {
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

  public SearchEntity extraFields(Map<String, String> extraFields) {
    this.extraFields = extraFields;
    return this;
  }

  public SearchEntity putExtraFieldsItem(String key, String extraFieldsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchEntity searchEntity = (SearchEntity) o;
    return Objects.equals(this.entity, searchEntity.entity) &&
        Objects.equals(this.matchedFields, searchEntity.matchedFields) &&
        Objects.equals(this.features, searchEntity.features) &&
        Objects.equals(this.score, searchEntity.score) &&
        Objects.equals(this.restrictedAspects, searchEntity.restrictedAspects) &&
        Objects.equals(this.extraFields, searchEntity.extraFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, matchedFields, features, score, restrictedAspects, extraFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchEntity {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    matchedFields: ").append(toIndentedString(matchedFields)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    restrictedAspects: ").append(toIndentedString(restrictedAspects)).append("\n");
    sb.append("    extraFields: ").append(toIndentedString(extraFields)).append("\n");
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