package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets IncrementingSegmentFieldTransformerType
 */
public enum IncrementingSegmentFieldTransformerType {
  TIMESTAMP_MS_TO_MINUTE("TIMESTAMP_MS_TO_MINUTE"),
    TIMESTAMP_MS_TO_HOUR("TIMESTAMP_MS_TO_HOUR"),
    TIMESTAMP_MS_TO_DATE("TIMESTAMP_MS_TO_DATE"),
    TIMESTAMP_MS_TO_MONTH("TIMESTAMP_MS_TO_MONTH"),
    TIMESTAMP_MS_TO_YEAR("TIMESTAMP_MS_TO_YEAR"),
    FLOOR("FLOOR"),
    CEILING("CEILING"),
    NATIVE("NATIVE");

  private String value;

  IncrementingSegmentFieldTransformerType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static IncrementingSegmentFieldTransformerType fromValue(String text) {
    for (IncrementingSegmentFieldTransformerType b : IncrementingSegmentFieldTransformerType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
