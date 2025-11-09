package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets FreshnessAssertionScheduleType
 */
public enum FreshnessAssertionScheduleType {
  CRON("CRON"),
    FIXED_INTERVAL("FIXED_INTERVAL"),
    SINCE_THE_LAST_CHECK("SINCE_THE_LAST_CHECK");

  private String value;

  FreshnessAssertionScheduleType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FreshnessAssertionScheduleType fromValue(String text) {
    for (FreshnessAssertionScheduleType b : FreshnessAssertionScheduleType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
