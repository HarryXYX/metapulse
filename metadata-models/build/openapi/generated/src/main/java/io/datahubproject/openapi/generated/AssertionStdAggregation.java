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
 * The function that is applied to the aggregation input (schema, rows, column values) before evaluating an operator.
 */
public enum AssertionStdAggregation {
  ROW_COUNT("ROW_COUNT"),
    COLUMNS("COLUMNS"),
    COLUMN_COUNT("COLUMN_COUNT"),
    IDENTITY("IDENTITY"),
    MEAN("MEAN"),
    MEDIAN("MEDIAN"),
    UNIQUE_COUNT("UNIQUE_COUNT"),
    UNIQUE_PROPORTION("UNIQUE_PROPORTION"),
    UNIQUE_PROPOTION("UNIQUE_PROPOTION"),
    NULL_COUNT("NULL_COUNT"),
    NULL_PROPORTION("NULL_PROPORTION"),
    STDDEV("STDDEV"),
    MIN("MIN"),
    MAX("MAX"),
    SUM("SUM"),
    _NATIVE_("_NATIVE_");

  private String value;

  AssertionStdAggregation(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AssertionStdAggregation fromValue(String text) {
    for (AssertionStdAggregation b : AssertionStdAggregation.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
