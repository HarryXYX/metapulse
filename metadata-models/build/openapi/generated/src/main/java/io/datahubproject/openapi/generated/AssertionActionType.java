package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AssertionActionType
 */
public enum AssertionActionType {
  RAISE_INCIDENT("RAISE_INCIDENT"),
    RESOLVE_INCIDENT("RESOLVE_INCIDENT");

  private String value;

  AssertionActionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AssertionActionType fromValue(String text) {
    for (AssertionActionType b : AssertionActionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
