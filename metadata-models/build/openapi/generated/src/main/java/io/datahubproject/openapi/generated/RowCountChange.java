package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssertionStdOperator;
import io.datahubproject.openapi.generated.AssertionStdParameters;
import io.datahubproject.openapi.generated.AssertionValueChangeType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Attributes defining a ROW_COUNT_CHANGE volume assertion.
 */
@Schema(description = "Attributes defining a ROW_COUNT_CHANGE volume assertion.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RowCountChange   {

  @JsonProperty("type") @Builder.Default
  private AssertionValueChangeType type = null;

  @JsonProperty("operator") @Builder.Default
  private AssertionStdOperator operator = null;

  @JsonProperty("parameters") @Builder.Default
  private AssertionStdParameters parameters = null;

  public RowCountChange type(AssertionValueChangeType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AssertionValueChangeType getType() {
    return type;
  }

  public void setType(AssertionValueChangeType type) {
    this.type = type;
  }

  public RowCountChange operator(AssertionStdOperator operator) {
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

  public RowCountChange parameters(AssertionStdParameters parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Get parameters
   * @return parameters
   **/
  @Schema(required = true, description = "")
      @NotNull

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
    RowCountChange rowCountChange = (RowCountChange) o;
    return Objects.equals(this.type, rowCountChange.type) &&
        Objects.equals(this.operator, rowCountChange.operator) &&
        Objects.equals(this.parameters, rowCountChange.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, operator, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RowCountChange {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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