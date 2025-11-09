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
 * DeleteEntityResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteEntityResponse   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("rows") @Builder.Default
  private Long rows = null;

  @JsonProperty("timeseriesRows") @Builder.Default
  private Long timeseriesRows = null;

  public DeleteEntityResponse urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Get urn
   * @return urn
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public DeleteEntityResponse rows(Long rows) {
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

  public DeleteEntityResponse timeseriesRows(Long timeseriesRows) {
    this.timeseriesRows = timeseriesRows;
    return this;
  }

  /**
   * Get timeseriesRows
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return timeseriesRows
   **/
  @Schema(description = "")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getTimeseriesRows() {
    return timeseriesRows;
  }

  public void setTimeseriesRows(Long timeseriesRows) {
    this.timeseriesRows = timeseriesRows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteEntityResponse deleteEntityResponse = (DeleteEntityResponse) o;
    return Objects.equals(this.urn, deleteEntityResponse.urn) &&
        Objects.equals(this.rows, deleteEntityResponse.rows) &&
        Objects.equals(this.timeseriesRows, deleteEntityResponse.timeseriesRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, rows, timeseriesRows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteEntityResponse {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    timeseriesRows: ").append(toIndentedString(timeseriesRows)).append("\n");
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