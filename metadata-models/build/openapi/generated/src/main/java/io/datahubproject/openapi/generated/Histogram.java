package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
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
 * Histogram
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Histogram   {

  @JsonProperty("boundaries") @Builder.Default
  @Valid
  private List<String> boundaries = new ArrayList<>();

  @JsonProperty("heights") @Builder.Default
  @Valid
  private List<BigDecimal> heights = new ArrayList<>();

  public Histogram boundaries(List<String> boundaries) {
    this.boundaries = boundaries;
    return this;
  }

  public Histogram addBoundariesItem(String boundariesItem) {
    this.boundaries.add(boundariesItem);
    return this;
  }

  /**
   * Get boundaries
   * @return boundaries
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<String> getBoundaries() {
    return boundaries;
  }

  public void setBoundaries(List<String> boundaries) {
    this.boundaries = boundaries;
  }

  public Histogram heights(List<BigDecimal> heights) {
    this.heights = heights;
    return this;
  }

  public Histogram addHeightsItem(BigDecimal heightsItem) {
    this.heights.add(heightsItem);
    return this;
  }

  /**
   * Get heights
   * @return heights
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<BigDecimal> getHeights() {
    return heights;
  }

  public void setHeights(List<BigDecimal> heights) {
    this.heights = heights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Histogram histogram = (Histogram) o;
    return Objects.equals(this.boundaries, histogram.boundaries) &&
        Objects.equals(this.heights, histogram.heights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundaries, heights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Histogram {\n");
    
    sb.append("    boundaries: ").append(toIndentedString(boundaries)).append("\n");
    sb.append("    heights: ").append(toIndentedString(heights)).append("\n");
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