package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
/**
 * Defines a generic table.
 */
@Schema(description = "Defines a generic table.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenericTable   {

  @JsonProperty("columnNames") @Builder.Default
  @Valid
  private List<String> columnNames = new ArrayList<>();

  @JsonProperty("columnTypes") @Builder.Default
  @Valid
  private List<String> columnTypes = new ArrayList<>();

  @JsonProperty("rows") @Builder.Default
  @Valid
  private List<List<String>> rows = null;

  public GenericTable columnNames(List<String> columnNames) {
    this.columnNames = columnNames;
    return this;
  }

  public GenericTable addColumnNamesItem(String columnNamesItem) {
    this.columnNames.add(columnNamesItem);
    return this;
  }

  /**
   * The names of the columns.
   * @return columnNames
   **/
  @Schema(required = true, description = "The names of the columns.")
      @NotNull

    public List<String> getColumnNames() {
    return columnNames;
  }

  public void setColumnNames(List<String> columnNames) {
    this.columnNames = columnNames;
  }

  public GenericTable columnTypes(List<String> columnTypes) {
    this.columnTypes = columnTypes;
    return this;
  }

  public GenericTable addColumnTypesItem(String columnTypesItem) {
    this.columnTypes.add(columnTypesItem);
    return this;
  }

  /**
   * The types of the columns.
   * @return columnTypes
   **/
  @Schema(required = true, description = "The types of the columns.")
      @NotNull

    public List<String> getColumnTypes() {
    return columnTypes;
  }

  public void setColumnTypes(List<String> columnTypes) {
    this.columnTypes = columnTypes;
  }

  public GenericTable rows(List<List<String>> rows) {
    this.rows = rows;
    return this;
  }

  public GenericTable addRowsItem(List<String> rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * The data rows.
   * @return rows
   **/
  @Schema(description = "The data rows.")
      @Valid
    public List<List<String>> getRows() {
    return rows;
  }

  public void setRows(List<List<String>> rows) {
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
    GenericTable genericTable = (GenericTable) o;
    return Objects.equals(this.columnNames, genericTable.columnNames) &&
        Objects.equals(this.columnTypes, genericTable.columnTypes) &&
        Objects.equals(this.rows, genericTable.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnNames, columnTypes, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericTable {\n");
    
    sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
    sb.append("    columnTypes: ").append(toIndentedString(columnTypes)).append("\n");
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