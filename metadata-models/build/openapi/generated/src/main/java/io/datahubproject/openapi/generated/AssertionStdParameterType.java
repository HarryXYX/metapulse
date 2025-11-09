package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AssertionStdParameterType
 */
public enum AssertionStdParameterType {
  STRING("STRING"),
    NUMBER("NUMBER"),
    LIST("LIST"),
    SET("SET"),
    UNKNOWN("UNKNOWN");

  private String value;

  AssertionStdParameterType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AssertionStdParameterType fromValue(String text) {
    for (AssertionStdParameterType b : AssertionStdParameterType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
