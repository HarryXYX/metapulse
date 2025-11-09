package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets FreshnessAssertionType
 */
public enum FreshnessAssertionType {
  DATASET_CHANGE("DATASET_CHANGE"),
    DATA_JOB_RUN("DATA_JOB_RUN");

  private String value;

  FreshnessAssertionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FreshnessAssertionType fromValue(String text) {
    for (FreshnessAssertionType b : FreshnessAssertionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
