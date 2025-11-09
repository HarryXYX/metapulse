package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.Condition;
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
public class Criterion   {

  @JsonProperty("field") @Builder.Default
  private String field = null;

  @JsonProperty("value") @Builder.Default
  private String value = null;

  @JsonProperty("values") @Builder.Default
  @Valid
  private List<String> values = new ArrayList<>();

  @JsonProperty("condition") @Builder.Default
  private Condition condition = null;

  @JsonProperty("negated") @Builder.Default
  private Boolean negated = false;

  public Criterion field(String field) {
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

  public Criterion value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the intended field
   * @return value
   **/
  @Schema(required = true, description = "The value of the intended field")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Criterion values(List<String> values) {
    this.values = values;
    return this;
  }

  public Criterion addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Values. one of which the intended field should match Note, if values is set, the above \"value\" field will be ignored
   * @return values
   **/
  @Schema(required = true, description = "Values. one of which the intended field should match Note, if values is set, the above \"value\" field will be ignored")
      @NotNull

    public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public Criterion condition(Condition condition) {
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
    public Condition getCondition() {
    return condition;
  }

  public void setCondition(Condition condition) {
    this.condition = condition;
  }

  public Criterion negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

  /**
   * Whether the condition should be negated
   * @return negated
   **/
  @Schema(required = true, description = "Whether the condition should be negated")
      @NotNull

    public Boolean isNegated() {
    return negated;
  }

  public void setNegated(Boolean negated) {
    this.negated = negated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Criterion criterion = (Criterion) o;
    return Objects.equals(this.field, criterion.field) &&
        Objects.equals(this.value, criterion.value) &&
        Objects.equals(this.values, criterion.values) &&
        Objects.equals(this.condition, criterion.condition) &&
        Objects.equals(this.negated, criterion.negated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, value, values, condition, negated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Criterion {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
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