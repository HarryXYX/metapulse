package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets FieldValuesFailThresholdType
 */
public enum FieldValuesFailThresholdType {
  COUNT("COUNT"),
    PERCENTAGE("PERCENTAGE");

  private String value;

  FieldValuesFailThresholdType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FieldValuesFailThresholdType fromValue(String text) {
    for (FieldValuesFailThresholdType b : FieldValuesFailThresholdType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
