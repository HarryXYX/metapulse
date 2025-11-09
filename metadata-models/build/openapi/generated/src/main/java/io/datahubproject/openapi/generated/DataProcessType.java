package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets DataProcessType
 */
public enum DataProcessType {
  BATCH_SCHEDULED("BATCH_SCHEDULED"),
    BATCH_AD_HOC("BATCH_AD_HOC"),
    STREAMING("STREAMING");

  private String value;

  DataProcessType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DataProcessType fromValue(String text) {
    for (DataProcessType b : DataProcessType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
