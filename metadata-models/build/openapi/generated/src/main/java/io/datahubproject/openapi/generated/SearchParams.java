package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.Criterion;
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
 * Context to define the search recommendations
 */
@Schema(description = "Context to define the search recommendations")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchParams   {

  @JsonProperty("types") @Builder.Default
  @Valid
  private List<String> types = new ArrayList<>();

  @JsonProperty("query") @Builder.Default
  private String query = null;

  @JsonProperty("filters") @Builder.Default
  @Valid
  private List<Criterion> filters = new ArrayList<>();

  public SearchParams types(List<String> types) {
    this.types = types;
    return this;
  }

  public SearchParams addTypesItem(String typesItem) {
    this.types.add(typesItem);
    return this;
  }

  /**
   * Entity types to be searched. If this is not provided, all entities will be searched.
   * @return types
   **/
  @Schema(required = true, description = "Entity types to be searched. If this is not provided, all entities will be searched.")
      @NotNull

    public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }

  public SearchParams query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Search query
   * @return query
   **/
  @Schema(required = true, description = "Search query")
      @NotNull

    public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public SearchParams filters(List<Criterion> filters) {
    this.filters = filters;
    return this;
  }

  public SearchParams addFiltersItem(Criterion filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Filters
   * @return filters
   **/
  @Schema(required = true, description = "Filters")
      @NotNull
    @Valid
    public List<Criterion> getFilters() {
    return filters;
  }

  public void setFilters(List<Criterion> filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchParams searchParams = (SearchParams) o;
    return Objects.equals(this.types, searchParams.types) &&
        Objects.equals(this.query, searchParams.query) &&
        Objects.equals(this.filters, searchParams.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(types, query, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchParams {\n");
    
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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