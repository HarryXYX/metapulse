package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets VolumeAssertionType
 */
public enum VolumeAssertionType {
  ROW_COUNT_TOTAL("ROW_COUNT_TOTAL"),
    ROW_COUNT_CHANGE("ROW_COUNT_CHANGE"),
    INCREMENTING_SEGMENT_ROW_COUNT_TOTAL("INCREMENTING_SEGMENT_ROW_COUNT_TOTAL"),
    INCREMENTING_SEGMENT_ROW_COUNT_CHANGE("INCREMENTING_SEGMENT_ROW_COUNT_CHANGE");

  private String value;

  VolumeAssertionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static VolumeAssertionType fromValue(String text) {
    for (VolumeAssertionType b : VolumeAssertionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
