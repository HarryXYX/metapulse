package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * FilterValue
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilterValue   {

  @JsonProperty("value") @Builder.Default
  private String value = null;

  @JsonProperty("entity") @Builder.Default
  private String entity = null;

  @JsonProperty("facetCount") @Builder.Default
  private Long facetCount = null;

  @JsonProperty("filtered") @Builder.Default
  private Boolean filtered = null;

  public FilterValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public FilterValue entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Get entity
   * @return entity
   **/
  @Schema(description = "")
  
    public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public FilterValue facetCount(Long facetCount) {
    this.facetCount = facetCount;
    return this;
  }

  /**
   * Get facetCount
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return facetCount
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getFacetCount() {
    return facetCount;
  }

  public void setFacetCount(Long facetCount) {
    this.facetCount = facetCount;
  }

  public FilterValue filtered(Boolean filtered) {
    this.filtered = filtered;
    return this;
  }

  /**
   * Get filtered
   * @return filtered
   **/
  @Schema(description = "")
  
    public Boolean isFiltered() {
    return filtered;
  }

  public void setFiltered(Boolean filtered) {
    this.filtered = filtered;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterValue filterValue = (FilterValue) o;
    return Objects.equals(this.value, filterValue.value) &&
        Objects.equals(this.entity, filterValue.entity) &&
        Objects.equals(this.facetCount, filterValue.facetCount) &&
        Objects.equals(this.filtered, filterValue.filtered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, entity, facetCount, filtered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterValue {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    facetCount: ").append(toIndentedString(facetCount)).append("\n");
    sb.append("    filtered: ").append(toIndentedString(filtered)).append("\n");
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