package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ContentParams;
import io.datahubproject.openapi.generated.EntityProfileParams;
import io.datahubproject.openapi.generated.SearchParams;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Parameters required to render a recommendation of a given type
 */
@Schema(description = "Parameters required to render a recommendation of a given type")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecommendationParams   {

  @JsonProperty("searchParams") @Builder.Default
  private SearchParams searchParams = null;

  @JsonProperty("entityProfileParams") @Builder.Default
  private EntityProfileParams entityProfileParams = null;

  @JsonProperty("contentParams") @Builder.Default
  private ContentParams contentParams = null;

  public RecommendationParams searchParams(SearchParams searchParams) {
    this.searchParams = searchParams;
    return this;
  }

  /**
   * Get searchParams
   * @return searchParams
   **/
  @Schema(description = "")
  
    @Valid
    public SearchParams getSearchParams() {
    return searchParams;
  }

  public void setSearchParams(SearchParams searchParams) {
    this.searchParams = searchParams;
  }

  public RecommendationParams entityProfileParams(EntityProfileParams entityProfileParams) {
    this.entityProfileParams = entityProfileParams;
    return this;
  }

  /**
   * Get entityProfileParams
   * @return entityProfileParams
   **/
  @Schema(description = "")
  
    @Valid
    public EntityProfileParams getEntityProfileParams() {
    return entityProfileParams;
  }

  public void setEntityProfileParams(EntityProfileParams entityProfileParams) {
    this.entityProfileParams = entityProfileParams;
  }

  public RecommendationParams contentParams(ContentParams contentParams) {
    this.contentParams = contentParams;
    return this;
  }

  /**
   * Get contentParams
   * @return contentParams
   **/
  @Schema(description = "")
  
    @Valid
    public ContentParams getContentParams() {
    return contentParams;
  }

  public void setContentParams(ContentParams contentParams) {
    this.contentParams = contentParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationParams recommendationParams = (RecommendationParams) o;
    return Objects.equals(this.searchParams, recommendationParams.searchParams) &&
        Objects.equals(this.entityProfileParams, recommendationParams.entityProfileParams) &&
        Objects.equals(this.contentParams, recommendationParams.contentParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchParams, entityProfileParams, contentParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationParams {\n");
    
    sb.append("    searchParams: ").append(toIndentedString(searchParams)).append("\n");
    sb.append("    entityProfileParams: ").append(toIndentedString(entityProfileParams)).append("\n");
    sb.append("    contentParams: ").append(toIndentedString(contentParams)).append("\n");
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