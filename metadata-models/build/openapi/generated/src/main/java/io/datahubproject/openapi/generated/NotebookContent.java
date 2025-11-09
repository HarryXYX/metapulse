package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.NotebookCell;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Content in a Notebook Note: This is IN BETA version
 */
@Schema(description = "Content in a Notebook Note: This is IN BETA version")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotebookContent  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "NotebookContent") @Builder.Default
  private String __type = "NotebookContent";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"NotebookContent"},
  defaultValue = "NotebookContent")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("cells") @Builder.Default
  @Valid
  private List<NotebookCell> cells = new ArrayList<>();

  public NotebookContent cells(List<NotebookCell> cells) {
    this.cells = cells;
    return this;
  }

  public NotebookContent addCellsItem(NotebookCell cellsItem) {
    this.cells.add(cellsItem);
    return this;
  }

  /**
   * The content of a Notebook which is composed by a list of NotebookCell
   * @return cells
   **/
  @Schema(required = true, description = "The content of a Notebook which is composed by a list of NotebookCell")
      @NotNull
    @Valid
    public List<NotebookCell> getCells() {
    return cells;
  }

  public void setCells(List<NotebookCell> cells) {
    this.cells = cells;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookContent notebookContent = (NotebookContent) o;
    return Objects.equals(this.cells, notebookContent.cells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cells);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookContent {\n");
    
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
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