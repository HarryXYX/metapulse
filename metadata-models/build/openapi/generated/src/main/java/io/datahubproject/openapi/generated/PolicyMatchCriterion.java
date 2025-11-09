package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.PolicyMatchCondition;
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
 * A criterion for matching a field with given value
 */
@Schema(description = "A criterion for matching a field with given value")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PolicyMatchCriterion   {

  @JsonProperty("field") @Builder.Default
  private String field = null;

  @JsonProperty("values") @Builder.Default
  @Valid
  private List<String> values = new ArrayList<>();

  @JsonProperty("condition") @Builder.Default
  private PolicyMatchCondition condition = null;

  public PolicyMatchCriterion field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The name of the field that the criterion refers to
   * @return field
   **/
  @Schema(required = true, description = "The name of the field that the criterion refers to")
      @NotNull

    public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public PolicyMatchCriterion values(List<String> values) {
    this.values = values;
    return this;
  }

  public PolicyMatchCriterion addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Values. Matches criterion if any one of the values matches condition (OR-relationship)
   * @return values
   **/
  @Schema(required = true, description = "Values. Matches criterion if any one of the values matches condition (OR-relationship)")
      @NotNull

    public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public PolicyMatchCriterion condition(PolicyMatchCondition condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PolicyMatchCondition getCondition() {
    return condition;
  }

  public void setCondition(PolicyMatchCondition condition) {
    this.condition = condition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyMatchCriterion policyMatchCriterion = (PolicyMatchCriterion) o;
    return Objects.equals(this.field, policyMatchCriterion.field) &&
        Objects.equals(this.values, policyMatchCriterion.values) &&
        Objects.equals(this.condition, policyMatchCriterion.condition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, values, condition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyMatchCriterion {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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