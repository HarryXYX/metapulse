package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.ChangeAuditStamps;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Query cell in a Notebook, which will present content in query format
 */
@Schema(description = "Query cell in a Notebook, which will present content in query format")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryCell   {

  @JsonProperty("cellTitle") @Builder.Default
  private String cellTitle = null;

  @JsonProperty("cellId") @Builder.Default
  private String cellId = null;

  @JsonProperty("changeAuditStamps") @Builder.Default
  private ChangeAuditStamps changeAuditStamps = null;

  @JsonProperty("rawQuery") @Builder.Default
  private String rawQuery = null;

  @JsonProperty("lastExecuted") @Builder.Default
  private AuditStamp lastExecuted = null;

  public QueryCell cellTitle(String cellTitle) {
    this.cellTitle = cellTitle;
    return this;
  }

  /**
   * Title of the cell
   * @return cellTitle
   **/
  @Schema(description = "Title of the cell")
  
    public String getCellTitle() {
    return cellTitle;
  }

  public void setCellTitle(String cellTitle) {
    this.cellTitle = cellTitle;
  }

  public QueryCell cellId(String cellId) {
    this.cellId = cellId;
    return this;
  }

  /**
   * Unique id for the cell. This id should be globally unique for a Notebook tool even when there are multiple deployments of it. As an example, Notebook URL could be used here for QueryBook such as 'querybook.com/notebook/773/?cellId=1234'
   * @return cellId
   **/
  @Schema(required = true, description = "Unique id for the cell. This id should be globally unique for a Notebook tool even when there are multiple deployments of it. As an example, Notebook URL could be used here for QueryBook such as 'querybook.com/notebook/773/?cellId=1234'")
      @NotNull

    public String getCellId() {
    return cellId;
  }

  public void setCellId(String cellId) {
    this.cellId = cellId;
  }

  public QueryCell changeAuditStamps(ChangeAuditStamps changeAuditStamps) {
    this.changeAuditStamps = changeAuditStamps;
    return this;
  }

  /**
   * Get changeAuditStamps
   * @return changeAuditStamps
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ChangeAuditStamps getChangeAuditStamps() {
    return changeAuditStamps;
  }

  public void setChangeAuditStamps(ChangeAuditStamps changeAuditStamps) {
    this.changeAuditStamps = changeAuditStamps;
  }

  public QueryCell rawQuery(String rawQuery) {
    this.rawQuery = rawQuery;
    return this;
  }

  /**
   * Raw query to explain some specific logic in a Notebook
   * @return rawQuery
   **/
  @Schema(required = true, description = "Raw query to explain some specific logic in a Notebook")
      @NotNull

    public String getRawQuery() {
    return rawQuery;
  }

  public void setRawQuery(String rawQuery) {
    this.rawQuery = rawQuery;
  }

  public QueryCell lastExecuted(AuditStamp lastExecuted) {
    this.lastExecuted = lastExecuted;
    return this;
  }

  /**
   * Get lastExecuted
   * @return lastExecuted
   **/
  @Schema(description = "")
  
    @Valid
    public AuditStamp getLastExecuted() {
    return lastExecuted;
  }

  public void setLastExecuted(AuditStamp lastExecuted) {
    this.lastExecuted = lastExecuted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryCell queryCell = (QueryCell) o;
    return Objects.equals(this.cellTitle, queryCell.cellTitle) &&
        Objects.equals(this.cellId, queryCell.cellId) &&
        Objects.equals(this.changeAuditStamps, queryCell.changeAuditStamps) &&
        Objects.equals(this.rawQuery, queryCell.rawQuery) &&
        Objects.equals(this.lastExecuted, queryCell.lastExecuted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellTitle, cellId, changeAuditStamps, rawQuery, lastExecuted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryCell {\n");
    
    sb.append("    cellTitle: ").append(toIndentedString(cellTitle)).append("\n");
    sb.append("    cellId: ").append(toIndentedString(cellId)).append("\n");
    sb.append("    changeAuditStamps: ").append(toIndentedString(changeAuditStamps)).append("\n");
    sb.append("    rawQuery: ").append(toIndentedString(rawQuery)).append("\n");
    sb.append("    lastExecuted: ").append(toIndentedString(lastExecuted)).append("\n");
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