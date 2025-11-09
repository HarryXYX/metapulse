package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets RunResultType
 */
public enum RunResultType {
  SUCCESS("SUCCESS"),
    FAILURE("FAILURE"),
    SKIPPED("SKIPPED"),
    UP_FOR_RETRY("UP_FOR_RETRY");

  private String value;

  RunResultType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RunResultType fromValue(String text) {
    for (RunResultType b : RunResultType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
