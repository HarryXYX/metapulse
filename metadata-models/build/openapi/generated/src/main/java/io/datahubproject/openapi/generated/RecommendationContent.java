package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.RecommendationParams;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Content to display within each recommendation module
 */
@Schema(description = "Content to display within each recommendation module")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecommendationContent   {

  @JsonProperty("value") @Builder.Default
  private String value = null;

  @JsonProperty("entity") @Builder.Default
  private String entity = null;

  @JsonProperty("params") @Builder.Default
  private RecommendationParams params = null;

  public RecommendationContent value(String value) {
    this.value = value;
    return this;
  }

  /**
   * String representation of content
   * @return value
   **/
  @Schema(required = true, description = "String representation of content")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public RecommendationContent entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Entity being recommended. Empty if the content being recommended is not an entity
   * @return entity
   **/
  @Schema(description = "Entity being recommended. Empty if the content being recommended is not an entity")
  
    public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public RecommendationContent params(RecommendationParams params) {
    this.params = params;
    return this;
  }

  /**
   * Get params
   * @return params
   **/
  @Schema(description = "")
  
    @Valid
    public RecommendationParams getParams() {
    return params;
  }

  public void setParams(RecommendationParams params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationContent recommendationContent = (RecommendationContent) o;
    return Objects.equals(this.value, recommendationContent.value) &&
        Objects.equals(this.entity, recommendationContent.entity) &&
        Objects.equals(this.params, recommendationContent.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, entity, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationContent {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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