package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssertionStdOperator;
import io.datahubproject.openapi.generated.AssertionStdParameters;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Attributes defining a ROW_COUNT_TOTAL volume assertion.
 */
@Schema(description = "Attributes defining a ROW_COUNT_TOTAL volume assertion.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RowCountTotal   {

  @JsonProperty("operator") @Builder.Default
  private AssertionStdOperator operator = null;

  @JsonProperty("parameters") @Builder.Default
  private AssertionStdParameters parameters = null;

  public RowCountTotal operator(AssertionStdOperator operator) {
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

  public RowCountTotal parameters(AssertionStdParameters parameters) {
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
    RowCountTotal rowCountTotal = (RowCountTotal) o;
    return Objects.equals(this.operator, rowCountTotal.operator) &&
        Objects.equals(this.parameters, rowCountTotal.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RowCountTotal {\n");
    
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