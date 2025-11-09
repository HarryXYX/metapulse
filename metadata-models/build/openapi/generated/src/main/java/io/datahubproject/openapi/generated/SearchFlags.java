package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.GroupingSpec;
import io.datahubproject.openapi.generated.SliceOptions;
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
 * Set of flags to control search behavior
 */
@Schema(description = "Set of flags to control search behavior")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchFlags   {

  @JsonProperty("skipCache") @Builder.Default
  private Boolean skipCache = false;

  @JsonProperty("maxAggValues") @Builder.Default
  private Integer maxAggValues = 20;

  @JsonProperty("fulltext") @Builder.Default
  private Boolean fulltext = null;

  @JsonProperty("skipHighlighting") @Builder.Default
  private Boolean skipHighlighting = false;

  @JsonProperty("skipAggregates") @Builder.Default
  private Boolean skipAggregates = false;

  @JsonProperty("getSuggestions") @Builder.Default
  private Boolean getSuggestions = false;

  @JsonProperty("groupingSpec") @Builder.Default
  private GroupingSpec groupingSpec = null;

  @JsonProperty("includeSoftDeleted") @Builder.Default
  private Boolean includeSoftDeleted = false;

  @JsonProperty("includeRestricted") @Builder.Default
  private Boolean includeRestricted = false;

  @JsonProperty("customHighlightingFields") @Builder.Default
  @Valid
  private List<String> customHighlightingFields = null;

  @JsonProperty("rewriteQuery") @Builder.Default
  private Boolean rewriteQuery = true;

  @JsonProperty("includeDefaultFacets") @Builder.Default
  private Boolean includeDefaultFacets = true;

  @JsonProperty("filterNonLatestVersions") @Builder.Default
  private Boolean filterNonLatestVersions = true;

  @JsonProperty("fieldConfiguration") @Builder.Default
  private String fieldConfiguration = null;

  @JsonProperty("sliceOptions") @Builder.Default
  private SliceOptions sliceOptions = null;

  public SearchFlags skipCache(Boolean skipCache) {
    this.skipCache = skipCache;
    return this;
  }

  /**
   * Whether to skip cache
   * @return skipCache
   **/
  @Schema(required = true, description = "Whether to skip cache")
      @NotNull

    public Boolean isSkipCache() {
    return skipCache;
  }

  public void setSkipCache(Boolean skipCache) {
    this.skipCache = skipCache;
  }

  public SearchFlags maxAggValues(Integer maxAggValues) {
    this.maxAggValues = maxAggValues;
    return this;
  }

  /**
   * The maximum number of values in a facet aggregation
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maxAggValues
   **/
  @Schema(required = true, description = "The maximum number of values in a facet aggregation")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getMaxAggValues() {
    return maxAggValues;
  }

  public void setMaxAggValues(Integer maxAggValues) {
    this.maxAggValues = maxAggValues;
  }

  public SearchFlags fulltext(Boolean fulltext) {
    this.fulltext = fulltext;
    return this;
  }

  /**
   * Structured or unstructured fulltext query
   * @return fulltext
   **/
  @Schema(description = "Structured or unstructured fulltext query")
  
    public Boolean isFulltext() {
    return fulltext;
  }

  public void setFulltext(Boolean fulltext) {
    this.fulltext = fulltext;
  }

  public SearchFlags skipHighlighting(Boolean skipHighlighting) {
    this.skipHighlighting = skipHighlighting;
    return this;
  }

  /**
   * Whether to skip highlighting
   * @return skipHighlighting
   **/
  @Schema(required = true, description = "Whether to skip highlighting")
      @NotNull

    public Boolean isSkipHighlighting() {
    return skipHighlighting;
  }

  public void setSkipHighlighting(Boolean skipHighlighting) {
    this.skipHighlighting = skipHighlighting;
  }

  public SearchFlags skipAggregates(Boolean skipAggregates) {
    this.skipAggregates = skipAggregates;
    return this;
  }

  /**
   * Whether to skip aggregates/facets
   * @return skipAggregates
   **/
  @Schema(required = true, description = "Whether to skip aggregates/facets")
      @NotNull

    public Boolean isSkipAggregates() {
    return skipAggregates;
  }

  public void setSkipAggregates(Boolean skipAggregates) {
    this.skipAggregates = skipAggregates;
  }

  public SearchFlags getSuggestions(Boolean getSuggestions) {
    this.getSuggestions = getSuggestions;
    return this;
  }

  /**
   * Whether to request for search suggestions on the _entityName virtualized field
   * @return getSuggestions
   **/
  @Schema(required = true, description = "Whether to request for search suggestions on the _entityName virtualized field")
      @NotNull

    public Boolean isGetSuggestions() {
    return getSuggestions;
  }

  public void setGetSuggestions(Boolean getSuggestions) {
    this.getSuggestions = getSuggestions;
  }

  public SearchFlags groupingSpec(GroupingSpec groupingSpec) {
    this.groupingSpec = groupingSpec;
    return this;
  }

  /**
   * Get groupingSpec
   * @return groupingSpec
   **/
  @Schema(description = "")
  
    @Valid
    public GroupingSpec getGroupingSpec() {
    return groupingSpec;
  }

  public void setGroupingSpec(GroupingSpec groupingSpec) {
    this.groupingSpec = groupingSpec;
  }

  public SearchFlags includeSoftDeleted(Boolean includeSoftDeleted) {
    this.includeSoftDeleted = includeSoftDeleted;
    return this;
  }

  /**
   * include soft deleted entities in results
   * @return includeSoftDeleted
   **/
  @Schema(required = true, description = "include soft deleted entities in results")
      @NotNull

    public Boolean isIncludeSoftDeleted() {
    return includeSoftDeleted;
  }

  public void setIncludeSoftDeleted(Boolean includeSoftDeleted) {
    this.includeSoftDeleted = includeSoftDeleted;
  }

  public SearchFlags includeRestricted(Boolean includeRestricted) {
    this.includeRestricted = includeRestricted;
    return this;
  }

  /**
   * include restricted entities in results (default is to filter)
   * @return includeRestricted
   **/
  @Schema(required = true, description = "include restricted entities in results (default is to filter)")
      @NotNull

    public Boolean isIncludeRestricted() {
    return includeRestricted;
  }

  public void setIncludeRestricted(Boolean includeRestricted) {
    this.includeRestricted = includeRestricted;
  }

  public SearchFlags customHighlightingFields(List<String> customHighlightingFields) {
    this.customHighlightingFields = customHighlightingFields;
    return this;
  }

  public SearchFlags addCustomHighlightingFieldsItem(String customHighlightingFieldsItem) {
    if (this.customHighlightingFields == null) {
      this.customHighlightingFields = new ArrayList<>();
    }
    this.customHighlightingFields.add(customHighlightingFieldsItem);
    return this;
  }

  /**
   * Include mentioned fields inside elastic highlighting query
   * @return customHighlightingFields
   **/
  @Schema(description = "Include mentioned fields inside elastic highlighting query")
  
    public List<String> getCustomHighlightingFields() {
    return customHighlightingFields;
  }

  public void setCustomHighlightingFields(List<String> customHighlightingFields) {
    this.customHighlightingFields = customHighlightingFields;
  }

  public SearchFlags rewriteQuery(Boolean rewriteQuery) {
    this.rewriteQuery = rewriteQuery;
    return this;
  }

  /**
   * invoke query rewrite chain for filters based on configured rewriters
   * @return rewriteQuery
   **/
  @Schema(required = true, description = "invoke query rewrite chain for filters based on configured rewriters")
      @NotNull

    public Boolean isRewriteQuery() {
    return rewriteQuery;
  }

  public void setRewriteQuery(Boolean rewriteQuery) {
    this.rewriteQuery = rewriteQuery;
  }

  public SearchFlags includeDefaultFacets(Boolean includeDefaultFacets) {
    this.includeDefaultFacets = includeDefaultFacets;
    return this;
  }

  /**
   * Include default facets when getting facets to aggregate on in search requests. By default we include these, but custom aggregation requests don't need them.
   * @return includeDefaultFacets
   **/
  @Schema(required = true, description = "Include default facets when getting facets to aggregate on in search requests. By default we include these, but custom aggregation requests don't need them.")
      @NotNull

    public Boolean isIncludeDefaultFacets() {
    return includeDefaultFacets;
  }

  public void setIncludeDefaultFacets(Boolean includeDefaultFacets) {
    this.includeDefaultFacets = includeDefaultFacets;
  }

  public SearchFlags filterNonLatestVersions(Boolean filterNonLatestVersions) {
    this.filterNonLatestVersions = filterNonLatestVersions;
    return this;
  }

  /**
   * Include only latest versions in version sets, default true
   * @return filterNonLatestVersions
   **/
  @Schema(required = true, description = "Include only latest versions in version sets, default true")
      @NotNull

    public Boolean isFilterNonLatestVersions() {
    return filterNonLatestVersions;
  }

  public void setFilterNonLatestVersions(Boolean filterNonLatestVersions) {
    this.filterNonLatestVersions = filterNonLatestVersions;
  }

  public SearchFlags fieldConfiguration(String fieldConfiguration) {
    this.fieldConfiguration = fieldConfiguration;
    return this;
  }

  /**
   * Which fieldConfiguration should be applied. The possible values are defined in the configuration file `search_config.yaml`
   * @return fieldConfiguration
   **/
  @Schema(description = "Which fieldConfiguration should be applied. The possible values are defined in the configuration file `search_config.yaml`")
  
    public String getFieldConfiguration() {
    return fieldConfiguration;
  }

  public void setFieldConfiguration(String fieldConfiguration) {
    this.fieldConfiguration = fieldConfiguration;
  }

  public SearchFlags sliceOptions(SliceOptions sliceOptions) {
    this.sliceOptions = sliceOptions;
    return this;
  }

  /**
   * Get sliceOptions
   * @return sliceOptions
   **/
  @Schema(description = "")
  
    @Valid
    public SliceOptions getSliceOptions() {
    return sliceOptions;
  }

  public void setSliceOptions(SliceOptions sliceOptions) {
    this.sliceOptions = sliceOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchFlags searchFlags = (SearchFlags) o;
    return Objects.equals(this.skipCache, searchFlags.skipCache) &&
        Objects.equals(this.maxAggValues, searchFlags.maxAggValues) &&
        Objects.equals(this.fulltext, searchFlags.fulltext) &&
        Objects.equals(this.skipHighlighting, searchFlags.skipHighlighting) &&
        Objects.equals(this.skipAggregates, searchFlags.skipAggregates) &&
        Objects.equals(this.getSuggestions, searchFlags.getSuggestions) &&
        Objects.equals(this.groupingSpec, searchFlags.groupingSpec) &&
        Objects.equals(this.includeSoftDeleted, searchFlags.includeSoftDeleted) &&
        Objects.equals(this.includeRestricted, searchFlags.includeRestricted) &&
        Objects.equals(this.customHighlightingFields, searchFlags.customHighlightingFields) &&
        Objects.equals(this.rewriteQuery, searchFlags.rewriteQuery) &&
        Objects.equals(this.includeDefaultFacets, searchFlags.includeDefaultFacets) &&
        Objects.equals(this.filterNonLatestVersions, searchFlags.filterNonLatestVersions) &&
        Objects.equals(this.fieldConfiguration, searchFlags.fieldConfiguration) &&
        Objects.equals(this.sliceOptions, searchFlags.sliceOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skipCache, maxAggValues, fulltext, skipHighlighting, skipAggregates, getSuggestions, groupingSpec, includeSoftDeleted, includeRestricted, customHighlightingFields, rewriteQuery, includeDefaultFacets, filterNonLatestVersions, fieldConfiguration, sliceOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchFlags {\n");
    
    sb.append("    skipCache: ").append(toIndentedString(skipCache)).append("\n");
    sb.append("    maxAggValues: ").append(toIndentedString(maxAggValues)).append("\n");
    sb.append("    fulltext: ").append(toIndentedString(fulltext)).append("\n");
    sb.append("    skipHighlighting: ").append(toIndentedString(skipHighlighting)).append("\n");
    sb.append("    skipAggregates: ").append(toIndentedString(skipAggregates)).append("\n");
    sb.append("    getSuggestions: ").append(toIndentedString(getSuggestions)).append("\n");
    sb.append("    groupingSpec: ").append(toIndentedString(groupingSpec)).append("\n");
    sb.append("    includeSoftDeleted: ").append(toIndentedString(includeSoftDeleted)).append("\n");
    sb.append("    includeRestricted: ").append(toIndentedString(includeRestricted)).append("\n");
    sb.append("    customHighlightingFields: ").append(toIndentedString(customHighlightingFields)).append("\n");
    sb.append("    rewriteQuery: ").append(toIndentedString(rewriteQuery)).append("\n");
    sb.append("    includeDefaultFacets: ").append(toIndentedString(includeDefaultFacets)).append("\n");
    sb.append("    filterNonLatestVersions: ").append(toIndentedString(filterNonLatestVersions)).append("\n");
    sb.append("    fieldConfiguration: ").append(toIndentedString(fieldConfiguration)).append("\n");
    sb.append("    sliceOptions: ").append(toIndentedString(sliceOptions)).append("\n");
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