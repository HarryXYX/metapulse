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
 * Text cell in a Notebook, which will present content in text format
 */
@Schema(description = "Text cell in a Notebook, which will present content in text format")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextCell   {

  @JsonProperty("cellTitle") @Builder.Default
  private String cellTitle = null;

  @JsonProperty("cellId") @Builder.Default
  private String cellId = null;

  @JsonProperty("changeAuditStamps") @Builder.Default
  private ChangeAuditStamps changeAuditStamps = null;

  @JsonProperty("text") @Builder.Default
  private String text = null;

  public TextCell cellTitle(String cellTitle) {
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

  public TextCell cellId(String cellId) {
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

  public TextCell changeAuditStamps(ChangeAuditStamps changeAuditStamps) {
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

  public TextCell text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The actual text in a TextCell in a Notebook
   * @return text
   **/
  @Schema(required = true, description = "The actual text in a TextCell in a Notebook")
      @NotNull

    public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextCell textCell = (TextCell) o;
    return Objects.equals(this.cellTitle, textCell.cellTitle) &&
        Objects.equals(this.cellId, textCell.cellId) &&
        Objects.equals(this.changeAuditStamps, textCell.changeAuditStamps) &&
        Objects.equals(this.text, textCell.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellTitle, cellId, changeAuditStamps, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextCell {\n");
    
    sb.append("    cellTitle: ").append(toIndentedString(cellTitle)).append("\n");
    sb.append("    cellId: ").append(toIndentedString(cellId)).append("\n");
    sb.append("    changeAuditStamps: ").append(toIndentedString(changeAuditStamps)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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