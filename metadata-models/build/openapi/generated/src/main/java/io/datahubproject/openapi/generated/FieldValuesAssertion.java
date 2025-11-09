package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssertionStdOperator;
import io.datahubproject.openapi.generated.AssertionStdParameters;
import io.datahubproject.openapi.generated.FieldTransform;
import io.datahubproject.openapi.generated.FieldValuesFailThreshold;
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
 * Attributes defining a field values assertion, which asserts that the values for a field / column of a dataset / table matches a set of expectations.  In other words, this type of assertion acts as a semantic constraint applied to fields for a specific column.  TODO: We should display the \&quot;failed row count\&quot; to the user if the column fails the verification rules. TODO: Determine whether we need an \&quot;operator\&quot; that can be applied to the field.
 */
@Schema(description = "Attributes defining a field values assertion, which asserts that the values for a field / column of a dataset / table matches a set of expectations.  In other words, this type of assertion acts as a semantic constraint applied to fields for a specific column.  TODO: We should display the \"failed row count\" to the user if the column fails the verification rules. TODO: Determine whether we need an \"operator\" that can be applied to the field.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FieldValuesAssertion   {

  @JsonProperty("field") @Builder.Default
  private SchemaFieldSpec field = null;

  @JsonProperty("transform") @Builder.Default
  private FieldTransform transform = null;

  @JsonProperty("operator") @Builder.Default
  private AssertionStdOperator operator = null;

  @JsonProperty("parameters") @Builder.Default
  private AssertionStdParameters parameters = null;

  @JsonProperty("failThreshold") @Builder.Default
  private FieldValuesFailThreshold failThreshold = null;

  @JsonProperty("excludeNulls") @Builder.Default
  private Boolean excludeNulls = true;

  public FieldValuesAssertion field(SchemaFieldSpec field) {
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

  public FieldValuesAssertion transform(FieldTransform transform) {
    this.transform = transform;
    return this;
  }

  /**
   * Get transform
   * @return transform
   **/
  @Schema(description = "")
  
    @Valid
    public FieldTransform getTransform() {
    return transform;
  }

  public void setTransform(FieldTransform transform) {
    this.transform = transform;
  }

  public FieldValuesAssertion operator(AssertionStdOperator operator) {
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

  public FieldValuesAssertion parameters(AssertionStdParameters parameters) {
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

  public FieldValuesAssertion failThreshold(FieldValuesFailThreshold failThreshold) {
    this.failThreshold = failThreshold;
    return this;
  }

  /**
   * Get failThreshold
   * @return failThreshold
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public FieldValuesFailThreshold getFailThreshold() {
    return failThreshold;
  }

  public void setFailThreshold(FieldValuesFailThreshold failThreshold) {
    this.failThreshold = failThreshold;
  }

  public FieldValuesAssertion excludeNulls(Boolean excludeNulls) {
    this.excludeNulls = excludeNulls;
    return this;
  }

  /**
   * Whether to ignore or allow nulls when running the values assertion. (i.e. consider only non-null values) using operators OTHER than the IS_NULL operator.  Defaults to true, allowing null values.
   * @return excludeNulls
   **/
  @Schema(required = true, description = "Whether to ignore or allow nulls when running the values assertion. (i.e. consider only non-null values) using operators OTHER than the IS_NULL operator.  Defaults to true, allowing null values.")
      @NotNull

    public Boolean isExcludeNulls() {
    return excludeNulls;
  }

  public void setExcludeNulls(Boolean excludeNulls) {
    this.excludeNulls = excludeNulls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldValuesAssertion fieldValuesAssertion = (FieldValuesAssertion) o;
    return Objects.equals(this.field, fieldValuesAssertion.field) &&
        Objects.equals(this.transform, fieldValuesAssertion.transform) &&
        Objects.equals(this.operator, fieldValuesAssertion.operator) &&
        Objects.equals(this.parameters, fieldValuesAssertion.parameters) &&
        Objects.equals(this.failThreshold, fieldValuesAssertion.failThreshold) &&
        Objects.equals(this.excludeNulls, fieldValuesAssertion.excludeNulls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, transform, operator, parameters, failThreshold, excludeNulls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldValuesAssertion {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    failThreshold: ").append(toIndentedString(failThreshold)).append("\n");
    sb.append("    excludeNulls: ").append(toIndentedString(excludeNulls)).append("\n");
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