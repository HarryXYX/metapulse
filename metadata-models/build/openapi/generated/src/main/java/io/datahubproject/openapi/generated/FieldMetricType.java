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
 * A standard metric that can be derived from the set of values for a specific field / column of a dataset / table.
 */
public enum FieldMetricType {
  UNIQUE_COUNT("UNIQUE_COUNT"),
    UNIQUE_PERCENTAGE("UNIQUE_PERCENTAGE"),
    NULL_COUNT("NULL_COUNT"),
    NULL_PERCENTAGE("NULL_PERCENTAGE"),
    MIN("MIN"),
    MAX("MAX"),
    MEAN("MEAN"),
    MEDIAN("MEDIAN"),
    STDDEV("STDDEV"),
    NEGATIVE_COUNT("NEGATIVE_COUNT"),
    NEGATIVE_PERCENTAGE("NEGATIVE_PERCENTAGE"),
    ZERO_COUNT("ZERO_COUNT"),
    ZERO_PERCENTAGE("ZERO_PERCENTAGE"),
    MIN_LENGTH("MIN_LENGTH"),
    MAX_LENGTH("MAX_LENGTH"),
    EMPTY_COUNT("EMPTY_COUNT"),
    EMPTY_PERCENTAGE("EMPTY_PERCENTAGE");

  private String value;

  FieldMetricType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FieldMetricType fromValue(String text) {
    for (FieldMetricType b : FieldMetricType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
