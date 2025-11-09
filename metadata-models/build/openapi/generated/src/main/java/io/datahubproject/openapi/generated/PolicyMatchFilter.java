package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.PolicyMatchCriterion;
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
 * The filter for specifying the resource or actor to apply privileges to
 */
@Schema(description = "The filter for specifying the resource or actor to apply privileges to")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PolicyMatchFilter   {

  @JsonProperty("criteria") @Builder.Default
  @Valid
  private List<PolicyMatchCriterion> criteria = new ArrayList<>();

  public PolicyMatchFilter criteria(List<PolicyMatchCriterion> criteria) {
    this.criteria = criteria;
    return this;
  }

  public PolicyMatchFilter addCriteriaItem(PolicyMatchCriterion criteriaItem) {
    this.criteria.add(criteriaItem);
    return this;
  }

  /**
   * A list of criteria to apply conjunctively (so all criteria must pass)
   * @return criteria
   **/
  @Schema(required = true, description = "A list of criteria to apply conjunctively (so all criteria must pass)")
      @NotNull
    @Valid
    public List<PolicyMatchCriterion> getCriteria() {
    return criteria;
  }

  public void setCriteria(List<PolicyMatchCriterion> criteria) {
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
    PolicyMatchFilter policyMatchFilter = (PolicyMatchFilter) o;
    return Objects.equals(this.criteria, policyMatchFilter.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyMatchFilter {\n");
    
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