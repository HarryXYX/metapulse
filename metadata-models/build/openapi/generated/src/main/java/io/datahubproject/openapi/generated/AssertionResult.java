package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssertionResultError;
import io.datahubproject.openapi.generated.AssertionResultType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * The result of running an assertion
 */
@Schema(description = "The result of running an assertion")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssertionResult   {

  @JsonProperty("type") @Builder.Default
  private AssertionResultType type = null;

  @JsonProperty("rowCount") @Builder.Default
  private Long rowCount = null;

  @JsonProperty("missingCount") @Builder.Default
  private Long missingCount = null;

  @JsonProperty("unexpectedCount") @Builder.Default
  private Long unexpectedCount = null;

  @JsonProperty("actualAggValue") @Builder.Default
  private BigDecimal actualAggValue = null;

  @JsonProperty("nativeResults") @Builder.Default
  @Valid
  private Map<String, String> nativeResults = null;

  @JsonProperty("externalUrl") @Builder.Default
  private String externalUrl = null;

  @JsonProperty("error") @Builder.Default
  private AssertionResultError error = null;

  public AssertionResult type(AssertionResultType type) {
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
    public AssertionResultType getType() {
    return type;
  }

  public void setType(AssertionResultType type) {
    this.type = type;
  }

  public AssertionResult rowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  /**
   * Number of rows for evaluated batch
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return rowCount
   **/
  @Schema(description = "Number of rows for evaluated batch")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getRowCount() {
    return rowCount;
  }

  public void setRowCount(Long rowCount) {
    this.rowCount = rowCount;
  }

  public AssertionResult missingCount(Long missingCount) {
    this.missingCount = missingCount;
    return this;
  }

  /**
   * Number of rows with missing value for evaluated batch
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return missingCount
   **/
  @Schema(description = "Number of rows with missing value for evaluated batch")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getMissingCount() {
    return missingCount;
  }

  public void setMissingCount(Long missingCount) {
    this.missingCount = missingCount;
  }

  public AssertionResult unexpectedCount(Long unexpectedCount) {
    this.unexpectedCount = unexpectedCount;
    return this;
  }

  /**
   * Number of rows with unexpected value for evaluated batch
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return unexpectedCount
   **/
  @Schema(description = "Number of rows with unexpected value for evaluated batch")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getUnexpectedCount() {
    return unexpectedCount;
  }

  public void setUnexpectedCount(Long unexpectedCount) {
    this.unexpectedCount = unexpectedCount;
  }

  public AssertionResult actualAggValue(BigDecimal actualAggValue) {
    this.actualAggValue = actualAggValue;
    return this;
  }

  /**
   * Observed aggregate value for evaluated batch
   * @return actualAggValue
   **/
  @Schema(description = "Observed aggregate value for evaluated batch")
  
    @Valid
    public BigDecimal getActualAggValue() {
    return actualAggValue;
  }

  public void setActualAggValue(BigDecimal actualAggValue) {
    this.actualAggValue = actualAggValue;
  }

  public AssertionResult nativeResults(Map<String, String> nativeResults) {
    this.nativeResults = nativeResults;
    return this;
  }

  public AssertionResult putNativeResultsItem(String key, String nativeResultsItem) {
    if (this.nativeResults == null) {
      this.nativeResults = new HashMap<>();
    }
    this.nativeResults.put(key, nativeResultsItem);
    return this;
  }

  /**
   * Other results of evaluation
   * @return nativeResults
   **/
  @Schema(description = "Other results of evaluation")
  
    public Map<String, String> getNativeResults() {
    return nativeResults;
  }

  public void setNativeResults(Map<String, String> nativeResults) {
    this.nativeResults = nativeResults;
  }

  public AssertionResult externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

  /**
   * External URL where full results are available. Only present when assertion source is not native.
   * @return externalUrl
   **/
  @Schema(description = "External URL where full results are available. Only present when assertion source is not native.")
  
    public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public AssertionResult error(AssertionResultError error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionResultError getError() {
    return error;
  }

  public void setError(AssertionResultError error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssertionResult assertionResult = (AssertionResult) o;
    return Objects.equals(this.type, assertionResult.type) &&
        Objects.equals(this.rowCount, assertionResult.rowCount) &&
        Objects.equals(this.missingCount, assertionResult.missingCount) &&
        Objects.equals(this.unexpectedCount, assertionResult.unexpectedCount) &&
        Objects.equals(this.actualAggValue, assertionResult.actualAggValue) &&
        Objects.equals(this.nativeResults, assertionResult.nativeResults) &&
        Objects.equals(this.externalUrl, assertionResult.externalUrl) &&
        Objects.equals(this.error, assertionResult.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, rowCount, missingCount, unexpectedCount, actualAggValue, nativeResults, externalUrl, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssertionResult {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
    sb.append("    missingCount: ").append(toIndentedString(missingCount)).append("\n");
    sb.append("    unexpectedCount: ").append(toIndentedString(unexpectedCount)).append("\n");
    sb.append("    actualAggValue: ").append(toIndentedString(actualAggValue)).append("\n");
    sb.append("    nativeResults: ").append(toIndentedString(nativeResults)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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