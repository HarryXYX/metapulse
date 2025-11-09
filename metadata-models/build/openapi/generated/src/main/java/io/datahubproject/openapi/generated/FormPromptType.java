package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets FormPromptType
 */
public enum FormPromptType {
  STRUCTURED_PROPERTY("STRUCTURED_PROPERTY"),
    FIELDS_STRUCTURED_PROPERTY("FIELDS_STRUCTURED_PROPERTY");

  private String value;

  FormPromptType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FormPromptType fromValue(String text) {
    for (FormPromptType b : FormPromptType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
