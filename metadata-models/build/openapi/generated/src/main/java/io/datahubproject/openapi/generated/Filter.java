package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ConjunctiveCriterion;
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
 * The filter for finding a record or a collection of records
 */
@Schema(description = "The filter for finding a record or a collection of records")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Filter   {

  @JsonProperty("or") @Builder.Default
  @Valid
  private List<ConjunctiveCriterion> or = null;

  @JsonProperty("criteria") @Builder.Default
  @Valid
  private List<Criterion> criteria = null;

  public Filter or(List<ConjunctiveCriterion> or) {
    this.or = or;
    return this;
  }

  public Filter addOrItem(ConjunctiveCriterion orItem) {
    if (this.or == null) {
      this.or = new ArrayList<>();
    }
    this.or.add(orItem);
    return this;
  }

  /**
   * A list of disjunctive criterion for the filter. (or operation to combine filters)
   * @return or
   **/
  @Schema(description = "A list of disjunctive criterion for the filter. (or operation to combine filters)")
      @Valid
    public List<ConjunctiveCriterion> getOr() {
    return or;
  }

  public void setOr(List<ConjunctiveCriterion> or) {
    this.or = or;
  }

  public Filter criteria(List<Criterion> criteria) {
    this.criteria = criteria;
    return this;
  }

  public Filter addCriteriaItem(Criterion criteriaItem) {
    if (this.criteria == null) {
      this.criteria = new ArrayList<>();
    }
    this.criteria.add(criteriaItem);
    return this;
  }

  /**
   * Deprecated! A list of conjunctive criterion for the filter. If \"or\" field is provided, then this field is ignored.
   * @return criteria
   **/
  @Schema(description = "Deprecated! A list of conjunctive criterion for the filter. If \"or\" field is provided, then this field is ignored.")
      @Valid
    public List<Criterion> getCriteria() {
    return criteria;
  }

  public void setCriteria(List<Criterion> criteria) {
    this.criteria = criteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filter filter = (Filter) o;
    return Objects.equals(this.or, filter.or) &&
        Objects.equals(this.criteria, filter.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(or, criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    
    sb.append("    or: ").append(toIndentedString(or)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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