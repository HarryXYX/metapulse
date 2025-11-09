package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssertionStdOperator;
import io.datahubproject.openapi.generated.AssertionStdParameters;
import io.datahubproject.openapi.generated.AssertionValueChangeType;
import io.datahubproject.openapi.generated.IncrementingSegmentSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Attributes defining an INCREMENTING_SEGMENT_ROW_COUNT_CHANGE volume assertion.
 */
@Schema(description = "Attributes defining an INCREMENTING_SEGMENT_ROW_COUNT_CHANGE volume assertion.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncrementingSegmentRowCountChange   {

  @JsonProperty("segment") @Builder.Default
  private IncrementingSegmentSpec segment = null;

  @JsonProperty("type") @Builder.Default
  private AssertionValueChangeType type = null;

  @JsonProperty("operator") @Builder.Default
  private AssertionStdOperator operator = null;

  @JsonProperty("parameters") @Builder.Default
  private AssertionStdParameters parameters = null;

  public IncrementingSegmentRowCountChange segment(IncrementingSegmentSpec segment) {
    this.segment = segment;
    return this;
  }

  /**
   * Get segment
   * @return segment
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public IncrementingSegmentSpec getSegment() {
    return segment;
  }

  public void setSegment(IncrementingSegmentSpec segment) {
    this.segment = segment;
  }

  public IncrementingSegmentRowCountChange type(AssertionValueChangeType type) {
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

  public IncrementingSegmentRowCountChange operator(AssertionStdOperator operator) {
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

  public IncrementingSegmentRowCountChange parameters(AssertionStdParameters parameters) {
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
    IncrementingSegmentRowCountChange incrementingSegmentRowCountChange = (IncrementingSegmentRowCountChange) o;
    return Objects.equals(this.segment, incrementingSegmentRowCountChange.segment) &&
        Objects.equals(this.type, incrementingSegmentRowCountChange.type) &&
        Objects.equals(this.operator, incrementingSegmentRowCountChange.operator) &&
        Objects.equals(this.parameters, incrementingSegmentRowCountChange.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segment, type, operator, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncrementingSegmentRowCountChange {\n");
    
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
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