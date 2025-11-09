package io.datahubproject.openapi.generated;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Type of Notebook Cell
 */
public enum NotebookCellType {
  TEXT_CELL("TEXT_CELL"),
    QUERY_CELL("QUERY_CELL"),
    CHART_CELL("CHART_CELL");

  private String value;

  NotebookCellType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NotebookCellType fromValue(String text) {
    for (NotebookCellType b : NotebookCellType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
