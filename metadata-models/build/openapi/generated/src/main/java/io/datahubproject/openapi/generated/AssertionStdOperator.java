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
 * A boolean operator that is applied on the input to an assertion, after an aggregation function has been applied.
 */
public enum AssertionStdOperator {
  BETWEEN("BETWEEN"),
    LESS_THAN("LESS_THAN"),
    LESS_THAN_OR_EQUAL_TO("LESS_THAN_OR_EQUAL_TO"),
    GREATER_THAN("GREATER_THAN"),
    GREATER_THAN_OR_EQUAL_TO("GREATER_THAN_OR_EQUAL_TO"),
    EQUAL_TO("EQUAL_TO"),
    NOT_EQUAL_TO("NOT_EQUAL_TO"),
    NULL("NULL"),
    NOT_NULL("NOT_NULL"),
    CONTAIN("CONTAIN"),
    END_WITH("END_WITH"),
    START_WITH("START_WITH"),
    REGEX_MATCH("REGEX_MATCH"),
    IN("IN"),
    NOT_IN("NOT_IN"),
    IS_TRUE("IS_TRUE"),
    IS_FALSE("IS_FALSE"),
    _NATIVE_("_NATIVE_");

  private String value;

  AssertionStdOperator(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AssertionStdOperator fromValue(String text) {
    for (AssertionStdOperator b : AssertionStdOperator.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
