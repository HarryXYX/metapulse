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
 * A list of criterion and&#x27;d together.
 */
@Schema(description = "A list of criterion and'd together.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConjunctiveCriterion   {

  @JsonProperty("and") @Builder.Default
  @Valid
  private List<Criterion> and = new ArrayList<>();

  public ConjunctiveCriterion and(List<Criterion> and) {
    this.and = and;
    return this;
  }

  public ConjunctiveCriterion addAndItem(Criterion andItem) {
    this.and.add(andItem);
    return this;
  }

  /**
   * A list of and criteria the filter applies to the query
   * @return and
   **/
  @Schema(required = true, description = "A list of and criteria the filter applies to the query")
      @NotNull
    @Valid
    public List<Criterion> getAnd() {
    return and;
  }

  public void setAnd(List<Criterion> and) {
    this.and = and;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConjunctiveCriterion conjunctiveCriterion = (ConjunctiveCriterion) o;
    return Objects.equals(this.and, conjunctiveCriterion.and);
  }

  @Override
  public int hashCode() {
    return Objects.hash(and);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConjunctiveCriterion {\n");
    
    sb.append("    and: ").append(toIndentedString(and)).append("\n");
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