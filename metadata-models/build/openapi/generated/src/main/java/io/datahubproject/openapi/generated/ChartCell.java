package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Chart cell in a notebook, which will present content in chart format
 */
@Schema(description = "Chart cell in a notebook, which will present content in chart format")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartCell   {

  @JsonProperty("cellTitle") @Builder.Default
  private String cellTitle = null;

  @JsonProperty("cellId") @Builder.Default
  private String cellId = null;

  @JsonProperty("changeAuditStamps") @Builder.Default
  private ChangeAuditStamps changeAuditStamps = null;

  public ChartCell cellTitle(String cellTitle) {
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

  public ChartCell cellId(String cellId) {
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

  public ChartCell changeAuditStamps(ChangeAuditStamps changeAuditStamps) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartCell chartCell = (ChartCell) o;
    return Objects.equals(this.cellTitle, chartCell.cellTitle) &&
        Objects.equals(this.cellId, chartCell.cellId) &&
        Objects.equals(this.changeAuditStamps, chartCell.changeAuditStamps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellTitle, cellId, changeAuditStamps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartCell {\n");
    
    sb.append("    cellTitle: ").append(toIndentedString(cellTitle)).append("\n");
    sb.append("    cellId: ").append(toIndentedString(cellId)).append("\n");
    sb.append("    changeAuditStamps: ").append(toIndentedString(changeAuditStamps)).append("\n");
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