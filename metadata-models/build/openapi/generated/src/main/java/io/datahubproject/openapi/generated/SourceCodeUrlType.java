package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets SourceCodeUrlType
 */
public enum SourceCodeUrlType {
  ML_MODEL_SOURCE_CODE("ML_MODEL_SOURCE_CODE"),
    TRAINING_PIPELINE_SOURCE_CODE("TRAINING_PIPELINE_SOURCE_CODE"),
    EVALUATION_PIPELINE_SOURCE_CODE("EVALUATION_PIPELINE_SOURCE_CODE");

  private String value;

  SourceCodeUrlType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SourceCodeUrlType fromValue(String text) {
    for (SourceCodeUrlType b : SourceCodeUrlType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
