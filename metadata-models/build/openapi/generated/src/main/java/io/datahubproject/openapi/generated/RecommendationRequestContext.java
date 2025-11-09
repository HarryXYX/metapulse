package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.EntityRequestContext;
import io.datahubproject.openapi.generated.ScenarioType;
import io.datahubproject.openapi.generated.SearchRequestContext;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Context that defines the page requesting recommendations i.e. for search pages, the query/filters. for entity pages, the entity urn and tab
 */
@Schema(description = "Context that defines the page requesting recommendations i.e. for search pages, the query/filters. for entity pages, the entity urn and tab")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecommendationRequestContext   {

  @JsonProperty("scenario") @Builder.Default
  private ScenarioType scenario = null;

  @JsonProperty("searchRequestContext") @Builder.Default
  private SearchRequestContext searchRequestContext = null;

  @JsonProperty("entityRequestContext") @Builder.Default
  private EntityRequestContext entityRequestContext = null;

  public RecommendationRequestContext scenario(ScenarioType scenario) {
    this.scenario = scenario;
    return this;
  }

  /**
   * Get scenario
   * @return scenario
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ScenarioType getScenario() {
    return scenario;
  }

  public void setScenario(ScenarioType scenario) {
    this.scenario = scenario;
  }

  public RecommendationRequestContext searchRequestContext(SearchRequestContext searchRequestContext) {
    this.searchRequestContext = searchRequestContext;
    return this;
  }

  /**
   * Get searchRequestContext
   * @return searchRequestContext
   **/
  @Schema(description = "")
  
    @Valid
    public SearchRequestContext getSearchRequestContext() {
    return searchRequestContext;
  }

  public void setSearchRequestContext(SearchRequestContext searchRequestContext) {
    this.searchRequestContext = searchRequestContext;
  }

  public RecommendationRequestContext entityRequestContext(EntityRequestContext entityRequestContext) {
    this.entityRequestContext = entityRequestContext;
    return this;
  }

  /**
   * Get entityRequestContext
   * @return entityRequestContext
   **/
  @Schema(description = "")
  
    @Valid
    public EntityRequestContext getEntityRequestContext() {
    return entityRequestContext;
  }

  public void setEntityRequestContext(EntityRequestContext entityRequestContext) {
    this.entityRequestContext = entityRequestContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationRequestContext recommendationRequestContext = (RecommendationRequestContext) o;
    return Objects.equals(this.scenario, recommendationRequestContext.scenario) &&
        Objects.equals(this.searchRequestContext, recommendationRequestContext.searchRequestContext) &&
        Objects.equals(this.entityRequestContext, recommendationRequestContext.entityRequestContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenario, searchRequestContext, entityRequestContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationRequestContext {\n");
    
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
    sb.append("    searchRequestContext: ").append(toIndentedString(searchRequestContext)).append("\n");
    sb.append("    entityRequestContext: ").append(toIndentedString(entityRequestContext)).append("\n");
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