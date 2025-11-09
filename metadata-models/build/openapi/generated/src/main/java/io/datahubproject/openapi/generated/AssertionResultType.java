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
 *  The final result of evaluating an assertion, e.g. SUCCESS, FAILURE, or ERROR.
 */
public enum AssertionResultType {
  INIT("INIT"),
    SUCCESS("SUCCESS"),
    FAILURE("FAILURE"),
    ERROR("ERROR");

  private String value;

  AssertionResultType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AssertionResultType fromValue(String text) {
    for (AssertionResultType b : AssertionResultType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
