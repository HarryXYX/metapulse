package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets FreshnessFieldKind
 */
public enum FreshnessFieldKind {
  LAST_MODIFIED("LAST_MODIFIED"),
    HIGH_WATERMARK("HIGH_WATERMARK");

  private String value;

  FreshnessFieldKind(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FreshnessFieldKind fromValue(String text) {
    for (FreshnessFieldKind b : FreshnessFieldKind.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
