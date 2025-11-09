package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.SortOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Sort order along with the field to sort it on, to be applied to the results.
 */
@Schema(description = "Sort order along with the field to sort it on, to be applied to the results.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SortCriterion   {

  @JsonProperty("field") @Builder.Default
  private String field = null;

  @JsonProperty("order") @Builder.Default
  private SortOrder order = null;

  public SortCriterion field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The name of the field that sorting has to be applied to
   * @return field
   **/
  @Schema(required = true, description = "The name of the field that sorting has to be applied to")
      @NotNull

    public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public SortCriterion order(SortOrder order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SortOrder getOrder() {
    return order;
  }

  public void setOrder(SortOrder order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortCriterion sortCriterion = (SortCriterion) o;
    return Objects.equals(this.field, sortCriterion.field) &&
        Objects.equals(this.order, sortCriterion.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortCriterion {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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