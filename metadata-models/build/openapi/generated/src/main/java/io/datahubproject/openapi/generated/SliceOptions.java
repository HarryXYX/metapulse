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
 * SliceOptions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SliceOptions   {

  @JsonProperty("id") @Builder.Default
  private Integer id = null;

  @JsonProperty("max") @Builder.Default
  private Integer max = null;

  public SliceOptions id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * minimum: -2147483648
   * maximum: 2147483647
   * @return id
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SliceOptions max(Integer max) {
    this.max = max;
    return this;
  }

  /**
   * Get max
   * minimum: -2147483648
   * maximum: 2147483647
   * @return max
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SliceOptions sliceOptions = (SliceOptions) o;
    return Objects.equals(this.id, sliceOptions.id) &&
        Objects.equals(this.max, sliceOptions.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SliceOptions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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