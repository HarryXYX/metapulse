package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.StructuredExecutionReport;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * The result of an execution request
 */
@Schema(description = "The result of an execution request")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubExecutionRequestResult  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubExecutionRequestResult") @Builder.Default
  private String __type = "DataHubExecutionRequestResult";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubExecutionRequestResult"},
  defaultValue = "DataHubExecutionRequestResult")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("status") @Builder.Default
  private String status = null;

  @JsonProperty("report") @Builder.Default
  private String report = null;

  @JsonProperty("structuredReport") @Builder.Default
  private StructuredExecutionReport structuredReport = null;

  @JsonProperty("startTimeMs") @Builder.Default
  private Long startTimeMs = null;

  @JsonProperty("durationMs") @Builder.Default
  private Long durationMs = null;

  public DataHubExecutionRequestResult status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the execution request
   * @return status
   **/
  @Schema(required = true, description = "The status of the execution request")
      @NotNull

    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DataHubExecutionRequestResult report(String report) {
    this.report = report;
    return this;
  }

  /**
   * The pretty-printed execution report.
   * @return report
   **/
  @Schema(description = "The pretty-printed execution report.")
  
    public String getReport() {
    return report;
  }

  public void setReport(String report) {
    this.report = report;
  }

  public DataHubExecutionRequestResult structuredReport(StructuredExecutionReport structuredReport) {
    this.structuredReport = structuredReport;
    return this;
  }

  /**
   * Get structuredReport
   * @return structuredReport
   **/
  @Schema(description = "")
  
    @Valid
    public StructuredExecutionReport getStructuredReport() {
    return structuredReport;
  }

  public void setStructuredReport(StructuredExecutionReport structuredReport) {
    this.structuredReport = structuredReport;
  }

  public DataHubExecutionRequestResult startTimeMs(Long startTimeMs) {
    this.startTimeMs = startTimeMs;
    return this;
  }

  /**
   * Time at which the request was created
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return startTimeMs
   **/
  @Schema(description = "Time at which the request was created")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getStartTimeMs() {
    return startTimeMs;
  }

  public void setStartTimeMs(Long startTimeMs) {
    this.startTimeMs = startTimeMs;
  }

  public DataHubExecutionRequestResult durationMs(Long durationMs) {
    this.durationMs = durationMs;
    return this;
  }

  /**
   * Duration in milliseconds
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return durationMs
   **/
  @Schema(description = "Duration in milliseconds")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getDurationMs() {
    return durationMs;
  }

  public void setDurationMs(Long durationMs) {
    this.durationMs = durationMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubExecutionRequestResult dataHubExecutionRequestResult = (DataHubExecutionRequestResult) o;
    return Objects.equals(this.status, dataHubExecutionRequestResult.status) &&
        Objects.equals(this.report, dataHubExecutionRequestResult.report) &&
        Objects.equals(this.structuredReport, dataHubExecutionRequestResult.structuredReport) &&
        Objects.equals(this.startTimeMs, dataHubExecutionRequestResult.startTimeMs) &&
        Objects.equals(this.durationMs, dataHubExecutionRequestResult.durationMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, report, structuredReport, startTimeMs, durationMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubExecutionRequestResult {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    structuredReport: ").append(toIndentedString(structuredReport)).append("\n");
    sb.append("    startTimeMs: ").append(toIndentedString(startTimeMs)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
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