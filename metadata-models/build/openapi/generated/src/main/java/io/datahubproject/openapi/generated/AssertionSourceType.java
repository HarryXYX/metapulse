package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AssertionSourceType
 */
public enum AssertionSourceType {
  NATIVE("NATIVE"),
    EXTERNAL("EXTERNAL"),
    INFERRED("INFERRED");

  private String value;

  AssertionSourceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AssertionSourceType fromValue(String text) {
    for (AssertionSourceType b : AssertionSourceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
