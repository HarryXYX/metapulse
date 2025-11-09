package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AutoCompleteEntity;
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
 * The model for the auto complete result
 */
@Schema(description = "The model for the auto complete result")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoCompleteResult   {

  @JsonProperty("query") @Builder.Default
  private String query = null;

  @JsonProperty("suggestions") @Builder.Default
  @Valid
  private List<String> suggestions = new ArrayList<>();

  @JsonProperty("entities") @Builder.Default
  @Valid
  private List<AutoCompleteEntity> entities = new ArrayList<>();

  public AutoCompleteResult query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The original chars typed by user
   * @return query
   **/
  @Schema(required = true, description = "The original chars typed by user")
      @NotNull

    public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public AutoCompleteResult suggestions(List<String> suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  public AutoCompleteResult addSuggestionsItem(String suggestionsItem) {
    this.suggestions.add(suggestionsItem);
    return this;
  }

  /**
   * A list of typeahead suggestions -- Just the text
   * @return suggestions
   **/
  @Schema(required = true, description = "A list of typeahead suggestions -- Just the text")
      @NotNull

    public List<String> getSuggestions() {
    return suggestions;
  }

  public void setSuggestions(List<String> suggestions) {
    this.suggestions = suggestions;
  }

  public AutoCompleteResult entities(List<AutoCompleteEntity> entities) {
    this.entities = entities;
    return this;
  }

  public AutoCompleteResult addEntitiesItem(AutoCompleteEntity entitiesItem) {
    this.entities.add(entitiesItem);
    return this;
  }

  /**
   * Specific entities to recommend
   * @return entities
   **/
  @Schema(required = true, description = "Specific entities to recommend")
      @NotNull
    @Valid
    public List<AutoCompleteEntity> getEntities() {
    return entities;
  }

  public void setEntities(List<AutoCompleteEntity> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoCompleteResult autoCompleteResult = (AutoCompleteResult) o;
    return Objects.equals(this.query, autoCompleteResult.query) &&
        Objects.equals(this.suggestions, autoCompleteResult.suggestions) &&
        Objects.equals(this.entities, autoCompleteResult.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, suggestions, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoCompleteResult {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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