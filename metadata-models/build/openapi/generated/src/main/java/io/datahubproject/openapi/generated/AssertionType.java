package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AssertionType
 */
public enum AssertionType {
  DATASET("DATASET"),
    FRESHNESS("FRESHNESS"),
    VOLUME("VOLUME"),
    SQL("SQL"),
    FIELD("FIELD"),
    DATA_SCHEMA("DATA_SCHEMA"),
    CUSTOM("CUSTOM");

  private String value;

  AssertionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AssertionType fromValue(String text) {
    for (AssertionType b : AssertionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
