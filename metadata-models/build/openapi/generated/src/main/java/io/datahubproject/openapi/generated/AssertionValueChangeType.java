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
 * An enum to represent a type of change in an assertion value, metric, or measurement.
 */
public enum AssertionValueChangeType {
  ABSOLUTE("ABSOLUTE"),
    PERCENTAGE("PERCENTAGE");

  private String value;

  AssertionValueChangeType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AssertionValueChangeType fromValue(String text) {
    for (AssertionValueChangeType b : AssertionValueChangeType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
