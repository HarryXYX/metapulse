package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AggregationMetadata;
import io.datahubproject.openapi.generated.SearchSuggestion;
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
 * The model for the search result
 */
@Schema(description = "The model for the search result")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchResultMetadata   {

  @JsonProperty("aggregations") @Builder.Default
  @Valid
  private List<AggregationMetadata> aggregations = new ArrayList<>();

  @JsonProperty("suggestions") @Builder.Default
  @Valid
  private List<SearchSuggestion> suggestions = new ArrayList<>();

  public SearchResultMetadata aggregations(List<AggregationMetadata> aggregations) {
    this.aggregations = aggregations;
    return this;
  }

  public SearchResultMetadata addAggregationsItem(AggregationMetadata aggregationsItem) {
    this.aggregations.add(aggregationsItem);
    return this;
  }

  /**
   * A list of search result metadata such as aggregations
   * @return aggregations
   **/
  @Schema(required = true, description = "A list of search result metadata such as aggregations")
      @NotNull
    @Valid
    public List<AggregationMetadata> getAggregations() {
    return aggregations;
  }

  public void setAggregations(List<AggregationMetadata> aggregations) {
    this.aggregations = aggregations;
  }

  public SearchResultMetadata suggestions(List<SearchSuggestion> suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  public SearchResultMetadata addSuggestionsItem(SearchSuggestion suggestionsItem) {
    this.suggestions.add(suggestionsItem);
    return this;
  }

  /**
   * A list of search query suggestions based on the given query
   * @return suggestions
   **/
  @Schema(required = true, description = "A list of search query suggestions based on the given query")
      @NotNull
    @Valid
    public List<SearchSuggestion> getSuggestions() {
    return suggestions;
  }

  public void setSuggestions(List<SearchSuggestion> suggestions) {
    this.suggestions = suggestions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultMetadata searchResultMetadata = (SearchResultMetadata) o;
    return Objects.equals(this.aggregations, searchResultMetadata.aggregations) &&
        Objects.equals(this.suggestions, searchResultMetadata.suggestions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregations, suggestions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultMetadata {\n");
    
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
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