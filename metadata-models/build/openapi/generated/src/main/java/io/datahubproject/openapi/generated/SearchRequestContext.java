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
 * Context that defines a search page requesting recommendations
 */
@Schema(description = "Context that defines a search page requesting recommendations")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchRequestContext   {

  @JsonProperty("query") @Builder.Default
  private String query = null;

  @JsonProperty("filters") @Builder.Default
  @Valid
  private List<Criterion> filters = new ArrayList<>();

  public SearchRequestContext query(String query) {
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

  public SearchRequestContext filters(List<Criterion> filters) {
    this.filters = filters;
    return this;
  }

  public SearchRequestContext addFiltersItem(Criterion filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * filters applied to search results
   * @return filters
   **/
  @Schema(required = true, description = "filters applied to search results")
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
    SearchRequestContext searchRequestContext = (SearchRequestContext) o;
    return Objects.equals(this.query, searchRequestContext.query) &&
        Objects.equals(this.filters, searchRequestContext.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRequestContext {\n");
    
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