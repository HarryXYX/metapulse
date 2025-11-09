package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets DatasetAssertionScope
 */
public enum DatasetAssertionScope {
  DATASET_COLUMN("DATASET_COLUMN"),
    DATASET_ROWS("DATASET_ROWS"),
    DATASET_STORAGE_SIZE("DATASET_STORAGE_SIZE"),
    DATASET_SCHEMA("DATASET_SCHEMA"),
    UNKNOWN("UNKNOWN");

  private String value;

  DatasetAssertionScope(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DatasetAssertionScope fromValue(String text) {
    for (DatasetAssertionScope b : DatasetAssertionScope.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
