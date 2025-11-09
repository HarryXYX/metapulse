package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets VersioningScheme
 */
public enum VersioningScheme {
  LEXICOGRAPHIC_STRING("LEXICOGRAPHIC_STRING"),
    ALPHANUMERIC_GENERATED_BY_DATAHUB("ALPHANUMERIC_GENERATED_BY_DATAHUB");

  private String value;

  VersioningScheme(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static VersioningScheme fromValue(String text) {
    for (VersioningScheme b : VersioningScheme.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
