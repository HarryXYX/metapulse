package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.SearchFieldType;
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
 * Configuration for how any given field should be indexed and matched in the DataHub search index.
 */
@Schema(description = "Configuration for how any given field should be indexed and matched in the DataHub search index.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubSearchConfig   {

  @JsonProperty("fieldName") @Builder.Default
  private String fieldName = null;

  @JsonProperty("fieldType") @Builder.Default
  private SearchFieldType fieldType = null;

  @JsonProperty("queryByDefault") @Builder.Default
  private Boolean queryByDefault = false;

  @JsonProperty("enableAutocomplete") @Builder.Default
  private Boolean enableAutocomplete = false;

  @JsonProperty("addToFilters") @Builder.Default
  private Boolean addToFilters = false;

  @JsonProperty("addHasValuesToFilters") @Builder.Default
  private Boolean addHasValuesToFilters = true;

  @JsonProperty("filterNameOverride") @Builder.Default
  private String filterNameOverride = null;

  @JsonProperty("hasValuesFilterNameOverride") @Builder.Default
  private String hasValuesFilterNameOverride = null;

  @JsonProperty("boostScore") @Builder.Default
  private BigDecimal boostScore = new BigDecimal(1);

  @JsonProperty("hasValuesFieldName") @Builder.Default
  private String hasValuesFieldName = null;

  @JsonProperty("numValuesFieldName") @Builder.Default
  private String numValuesFieldName = null;

  @JsonProperty("weightsPerFieldValue") @Builder.Default
  @Valid
  private Map<String, BigDecimal> weightsPerFieldValue = null;

  @JsonProperty("fieldNameAliases") @Builder.Default
  @Valid
  private List<String> fieldNameAliases = null;

  public DataHubSearchConfig fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Name of the field in the search index. Defaults to the field name otherwise
   * @return fieldName
   **/
  @Schema(description = "Name of the field in the search index. Defaults to the field name otherwise")
  
    public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public DataHubSearchConfig fieldType(SearchFieldType fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * Get fieldType
   * @return fieldType
   **/
  @Schema(description = "")
  
    @Valid
    public SearchFieldType getFieldType() {
    return fieldType;
  }

  public void setFieldType(SearchFieldType fieldType) {
    this.fieldType = fieldType;
  }

  public DataHubSearchConfig queryByDefault(Boolean queryByDefault) {
    this.queryByDefault = queryByDefault;
    return this;
  }

  /**
   * Whether we should match the field for the default search query
   * @return queryByDefault
   **/
  @Schema(required = true, description = "Whether we should match the field for the default search query")
      @NotNull

    public Boolean isQueryByDefault() {
    return queryByDefault;
  }

  public void setQueryByDefault(Boolean queryByDefault) {
    this.queryByDefault = queryByDefault;
  }

  public DataHubSearchConfig enableAutocomplete(Boolean enableAutocomplete) {
    this.enableAutocomplete = enableAutocomplete;
    return this;
  }

  /**
   * Whether we should use the field for default autocomplete
   * @return enableAutocomplete
   **/
  @Schema(required = true, description = "Whether we should use the field for default autocomplete")
      @NotNull

    public Boolean isEnableAutocomplete() {
    return enableAutocomplete;
  }

  public void setEnableAutocomplete(Boolean enableAutocomplete) {
    this.enableAutocomplete = enableAutocomplete;
  }

  public DataHubSearchConfig addToFilters(Boolean addToFilters) {
    this.addToFilters = addToFilters;
    return this;
  }

  /**
   * Whether or not to add field to filters.
   * @return addToFilters
   **/
  @Schema(required = true, description = "Whether or not to add field to filters.")
      @NotNull

    public Boolean isAddToFilters() {
    return addToFilters;
  }

  public void setAddToFilters(Boolean addToFilters) {
    this.addToFilters = addToFilters;
  }

  public DataHubSearchConfig addHasValuesToFilters(Boolean addHasValuesToFilters) {
    this.addHasValuesToFilters = addHasValuesToFilters;
    return this;
  }

  /**
   * Whether or not to add the \"has values\" to filters. check if this is conditional on addToFilters being true
   * @return addHasValuesToFilters
   **/
  @Schema(required = true, description = "Whether or not to add the \"has values\" to filters. check if this is conditional on addToFilters being true")
      @NotNull

    public Boolean isAddHasValuesToFilters() {
    return addHasValuesToFilters;
  }

  public void setAddHasValuesToFilters(Boolean addHasValuesToFilters) {
    this.addHasValuesToFilters = addHasValuesToFilters;
  }

  public DataHubSearchConfig filterNameOverride(String filterNameOverride) {
    this.filterNameOverride = filterNameOverride;
    return this;
  }

  /**
   * Display name of the filter
   * @return filterNameOverride
   **/
  @Schema(description = "Display name of the filter")
  
    public String getFilterNameOverride() {
    return filterNameOverride;
  }

  public void setFilterNameOverride(String filterNameOverride) {
    this.filterNameOverride = filterNameOverride;
  }

  public DataHubSearchConfig hasValuesFilterNameOverride(String hasValuesFilterNameOverride) {
    this.hasValuesFilterNameOverride = hasValuesFilterNameOverride;
    return this;
  }

  /**
   * Display name of the has values filter
   * @return hasValuesFilterNameOverride
   **/
  @Schema(description = "Display name of the has values filter")
  
    public String getHasValuesFilterNameOverride() {
    return hasValuesFilterNameOverride;
  }

  public void setHasValuesFilterNameOverride(String hasValuesFilterNameOverride) {
    this.hasValuesFilterNameOverride = hasValuesFilterNameOverride;
  }

  public DataHubSearchConfig boostScore(BigDecimal boostScore) {
    this.boostScore = boostScore;
    return this;
  }

  /**
   * Boost multiplier to the match score. Matches on fields with higher boost score ranks higher
   * @return boostScore
   **/
  @Schema(required = true, description = "Boost multiplier to the match score. Matches on fields with higher boost score ranks higher")
      @NotNull

    @Valid
    public BigDecimal getBoostScore() {
    return boostScore;
  }

  public void setBoostScore(BigDecimal boostScore) {
    this.boostScore = boostScore;
  }

  public DataHubSearchConfig hasValuesFieldName(String hasValuesFieldName) {
    this.hasValuesFieldName = hasValuesFieldName;
    return this;
  }

  /**
   * If set, add a index field of the given name that checks whether the field exists
   * @return hasValuesFieldName
   **/
  @Schema(description = "If set, add a index field of the given name that checks whether the field exists")
  
    public String getHasValuesFieldName() {
    return hasValuesFieldName;
  }

  public void setHasValuesFieldName(String hasValuesFieldName) {
    this.hasValuesFieldName = hasValuesFieldName;
  }

  public DataHubSearchConfig numValuesFieldName(String numValuesFieldName) {
    this.numValuesFieldName = numValuesFieldName;
    return this;
  }

  /**
   * If set, add a index field of the given name that checks the number of elements
   * @return numValuesFieldName
   **/
  @Schema(description = "If set, add a index field of the given name that checks the number of elements")
  
    public String getNumValuesFieldName() {
    return numValuesFieldName;
  }

  public void setNumValuesFieldName(String numValuesFieldName) {
    this.numValuesFieldName = numValuesFieldName;
  }

  public DataHubSearchConfig weightsPerFieldValue(Map<String, BigDecimal> weightsPerFieldValue) {
    this.weightsPerFieldValue = weightsPerFieldValue;
    return this;
  }

  public DataHubSearchConfig putWeightsPerFieldValueItem(String key, BigDecimal weightsPerFieldValueItem) {
    if (this.weightsPerFieldValue == null) {
      this.weightsPerFieldValue = new HashMap<>();
    }
    this.weightsPerFieldValue.put(key, weightsPerFieldValueItem);
    return this;
  }

  /**
   * (Optional) Weights to apply to score for a given value
   * @return weightsPerFieldValue
   **/
  @Schema(description = "(Optional) Weights to apply to score for a given value")
      @Valid
    public Map<String, BigDecimal> getWeightsPerFieldValue() {
    return weightsPerFieldValue;
  }

  public void setWeightsPerFieldValue(Map<String, BigDecimal> weightsPerFieldValue) {
    this.weightsPerFieldValue = weightsPerFieldValue;
  }

  public DataHubSearchConfig fieldNameAliases(List<String> fieldNameAliases) {
    this.fieldNameAliases = fieldNameAliases;
    return this;
  }

  public DataHubSearchConfig addFieldNameAliasesItem(String fieldNameAliasesItem) {
    if (this.fieldNameAliases == null) {
      this.fieldNameAliases = new ArrayList<>();
    }
    this.fieldNameAliases.add(fieldNameAliasesItem);
    return this;
  }

  /**
   * (Optional) Aliases for this given field that can be used for sorting etc.
   * @return fieldNameAliases
   **/
  @Schema(description = "(Optional) Aliases for this given field that can be used for sorting etc.")
  
    public List<String> getFieldNameAliases() {
    return fieldNameAliases;
  }

  public void setFieldNameAliases(List<String> fieldNameAliases) {
    this.fieldNameAliases = fieldNameAliases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubSearchConfig dataHubSearchConfig = (DataHubSearchConfig) o;
    return Objects.equals(this.fieldName, dataHubSearchConfig.fieldName) &&
        Objects.equals(this.fieldType, dataHubSearchConfig.fieldType) &&
        Objects.equals(this.queryByDefault, dataHubSearchConfig.queryByDefault) &&
        Objects.equals(this.enableAutocomplete, dataHubSearchConfig.enableAutocomplete) &&
        Objects.equals(this.addToFilters, dataHubSearchConfig.addToFilters) &&
        Objects.equals(this.addHasValuesToFilters, dataHubSearchConfig.addHasValuesToFilters) &&
        Objects.equals(this.filterNameOverride, dataHubSearchConfig.filterNameOverride) &&
        Objects.equals(this.hasValuesFilterNameOverride, dataHubSearchConfig.hasValuesFilterNameOverride) &&
        Objects.equals(this.boostScore, dataHubSearchConfig.boostScore) &&
        Objects.equals(this.hasValuesFieldName, dataHubSearchConfig.hasValuesFieldName) &&
        Objects.equals(this.numValuesFieldName, dataHubSearchConfig.numValuesFieldName) &&
        Objects.equals(this.weightsPerFieldValue, dataHubSearchConfig.weightsPerFieldValue) &&
        Objects.equals(this.fieldNameAliases, dataHubSearchConfig.fieldNameAliases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, fieldType, queryByDefault, enableAutocomplete, addToFilters, addHasValuesToFilters, filterNameOverride, hasValuesFilterNameOverride, boostScore, hasValuesFieldName, numValuesFieldName, weightsPerFieldValue, fieldNameAliases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubSearchConfig {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    queryByDefault: ").append(toIndentedString(queryByDefault)).append("\n");
    sb.append("    enableAutocomplete: ").append(toIndentedString(enableAutocomplete)).append("\n");
    sb.append("    addToFilters: ").append(toIndentedString(addToFilters)).append("\n");
    sb.append("    addHasValuesToFilters: ").append(toIndentedString(addHasValuesToFilters)).append("\n");
    sb.append("    filterNameOverride: ").append(toIndentedString(filterNameOverride)).append("\n");
    sb.append("    hasValuesFilterNameOverride: ").append(toIndentedString(hasValuesFilterNameOverride)).append("\n");
    sb.append("    boostScore: ").append(toIndentedString(boostScore)).append("\n");
    sb.append("    hasValuesFieldName: ").append(toIndentedString(hasValuesFieldName)).append("\n");
    sb.append("    numValuesFieldName: ").append(toIndentedString(numValuesFieldName)).append("\n");
    sb.append("    weightsPerFieldValue: ").append(toIndentedString(weightsPerFieldValue)).append("\n");
    sb.append("    fieldNameAliases: ").append(toIndentedString(fieldNameAliases)).append("\n");
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