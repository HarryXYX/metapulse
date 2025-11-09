package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * IngestionRunSummary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IngestionRunSummary   {

  @JsonProperty("runId") @Builder.Default
  private String runId = null;

  @JsonProperty("timestamp") @Builder.Default
  private Long timestamp = null;

  @JsonProperty("rows") @Builder.Default
  private Long rows = null;

  public IngestionRunSummary runId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * Get runId
   * @return runId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getRunId() {
    return runId;
  }

  public void setRunId(String runId) {
    this.runId = runId;
  }

  public IngestionRunSummary timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return timestamp
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public IngestionRunSummary rows(Long rows) {
    this.rows = rows;
    return this;
  }

  /**
   * Get rows
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return rows
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getRows() {
    return rows;
  }

  public void setRows(Long rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngestionRunSummary ingestionRunSummary = (IngestionRunSummary) o;
    return Objects.equals(this.runId, ingestionRunSummary.runId) &&
        Objects.equals(this.timestamp, ingestionRunSummary.timestamp) &&
        Objects.equals(this.rows, ingestionRunSummary.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, timestamp, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngestionRunSummary {\n");
    
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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