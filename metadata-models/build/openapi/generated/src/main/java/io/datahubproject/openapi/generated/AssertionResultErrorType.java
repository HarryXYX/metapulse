package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AssertionResultErrorType
 */
public enum AssertionResultErrorType {
  SOURCE_CONNECTION_ERROR("SOURCE_CONNECTION_ERROR"),
    SOURCE_QUERY_FAILED("SOURCE_QUERY_FAILED"),
    INSUFFICIENT_DATA("INSUFFICIENT_DATA"),
    INVALID_PARAMETERS("INVALID_PARAMETERS"),
    INVALID_SOURCE_TYPE("INVALID_SOURCE_TYPE"),
    UNSUPPORTED_PLATFORM("UNSUPPORTED_PLATFORM"),
    CUSTOM_SQL_ERROR("CUSTOM_SQL_ERROR"),
    FIELD_ASSERTION_ERROR("FIELD_ASSERTION_ERROR"),
    UNKNOWN_ERROR("UNKNOWN_ERROR");

  private String value;

  AssertionResultErrorType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AssertionResultErrorType fromValue(String text) {
    for (AssertionResultErrorType b : AssertionResultErrorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
