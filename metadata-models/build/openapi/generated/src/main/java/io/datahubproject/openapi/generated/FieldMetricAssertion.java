package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssertionStdOperator;
import io.datahubproject.openapi.generated.AssertionStdParameters;
import io.datahubproject.openapi.generated.FieldMetricType;
import io.datahubproject.openapi.generated.SchemaFieldSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Attributes defining a field metric assertion, which asserts an expectation against a common metric derived from the set of field / column values, for example: max, min, median, null count, null percentage, unique count, unique percentage, and more.
 */
@Schema(description = "Attributes defining a field metric assertion, which asserts an expectation against a common metric derived from the set of field / column values, for example: max, min, median, null count, null percentage, unique count, unique percentage, and more.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FieldMetricAssertion   {

  @JsonProperty("field") @Builder.Default
  private SchemaFieldSpec field = null;

  @JsonProperty("metric") @Builder.Default
  private FieldMetricType metric = null;

  @JsonProperty("operator") @Builder.Default
  private AssertionStdOperator operator = null;

  @JsonProperty("parameters") @Builder.Default
  private AssertionStdParameters parameters = null;

  public FieldMetricAssertion field(SchemaFieldSpec field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SchemaFieldSpec getField() {
    return field;
  }

  public void setField(SchemaFieldSpec field) {
    this.field = field;
  }

  public FieldMetricAssertion metric(FieldMetricType metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Get metric
   * @return metric
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public FieldMetricType getMetric() {
    return metric;
  }

  public void setMetric(FieldMetricType metric) {
    this.metric = metric;
  }

  public FieldMetricAssertion operator(AssertionStdOperator operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   * @return operator
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AssertionStdOperator getOperator() {
    return operator;
  }

  public void setOperator(AssertionStdOperator operator) {
    this.operator = operator;
  }

  public FieldMetricAssertion parameters(AssertionStdParameters parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Get parameters
   * @return parameters
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionStdParameters getParameters() {
    return parameters;
  }

  public void setParameters(AssertionStdParameters parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldMetricAssertion fieldMetricAssertion = (FieldMetricAssertion) o;
    return Objects.equals(this.field, fieldMetricAssertion.field) &&
        Objects.equals(this.metric, fieldMetricAssertion.metric) &&
        Objects.equals(this.operator, fieldMetricAssertion.operator) &&
        Objects.equals(this.parameters, fieldMetricAssertion.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, metric, operator, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldMetricAssertion {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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