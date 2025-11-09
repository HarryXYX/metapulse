package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ChartCell;
import io.datahubproject.openapi.generated.NotebookCellType;
import io.datahubproject.openapi.generated.QueryCell;
import io.datahubproject.openapi.generated.TextCell;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * A record of all supported cells for a Notebook. Only one type of cell will be non-null.
 */
@Schema(description = "A record of all supported cells for a Notebook. Only one type of cell will be non-null.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotebookCell   {

  @JsonProperty("textCell") @Builder.Default
  private TextCell textCell = null;

  @JsonProperty("queryCell") @Builder.Default
  private QueryCell queryCell = null;

  @JsonProperty("chartCell") @Builder.Default
  private ChartCell chartCell = null;

  @JsonProperty("type") @Builder.Default
  private NotebookCellType type = null;

  public NotebookCell textCell(TextCell textCell) {
    this.textCell = textCell;
    return this;
  }

  /**
   * Get textCell
   * @return textCell
   **/
  @Schema(description = "")
  
    @Valid
    public TextCell getTextCell() {
    return textCell;
  }

  public void setTextCell(TextCell textCell) {
    this.textCell = textCell;
  }

  public NotebookCell queryCell(QueryCell queryCell) {
    this.queryCell = queryCell;
    return this;
  }

  /**
   * Get queryCell
   * @return queryCell
   **/
  @Schema(description = "")
  
    @Valid
    public QueryCell getQueryCell() {
    return queryCell;
  }

  public void setQueryCell(QueryCell queryCell) {
    this.queryCell = queryCell;
  }

  public NotebookCell chartCell(ChartCell chartCell) {
    this.chartCell = chartCell;
    return this;
  }

  /**
   * Get chartCell
   * @return chartCell
   **/
  @Schema(description = "")
  
    @Valid
    public ChartCell getChartCell() {
    return chartCell;
  }

  public void setChartCell(ChartCell chartCell) {
    this.chartCell = chartCell;
  }

  public NotebookCell type(NotebookCellType type) {
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
    public NotebookCellType getType() {
    return type;
  }

  public void setType(NotebookCellType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookCell notebookCell = (NotebookCell) o;
    return Objects.equals(this.textCell, notebookCell.textCell) &&
        Objects.equals(this.queryCell, notebookCell.queryCell) &&
        Objects.equals(this.chartCell, notebookCell.chartCell) &&
        Objects.equals(this.type, notebookCell.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textCell, queryCell, chartCell, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookCell {\n");
    
    sb.append("    textCell: ").append(toIndentedString(textCell)).append("\n");
    sb.append("    queryCell: ").append(toIndentedString(queryCell)).append("\n");
    sb.append("    chartCell: ").append(toIndentedString(chartCell)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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