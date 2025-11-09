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
 * Enum to define the length of a bucket when doing aggregations
 */
public enum WindowDuration {
  YEAR("YEAR"),
    MONTH("MONTH"),
    WEEK("WEEK"),
    DAY("DAY"),
    HOUR("HOUR");

  private String value;

  WindowDuration(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static WindowDuration fromValue(String text) {
    for (WindowDuration b : WindowDuration.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
