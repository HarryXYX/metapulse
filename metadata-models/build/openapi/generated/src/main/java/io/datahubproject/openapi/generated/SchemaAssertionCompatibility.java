package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets SchemaAssertionCompatibility
 */
public enum SchemaAssertionCompatibility {
  EXACT_MATCH("EXACT_MATCH"),
    SUPERSET("SUPERSET"),
    SUBSET("SUBSET");

  private String value;

  SchemaAssertionCompatibility(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SchemaAssertionCompatibility fromValue(String text) {
    for (SchemaAssertionCompatibility b : SchemaAssertionCompatibility.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
