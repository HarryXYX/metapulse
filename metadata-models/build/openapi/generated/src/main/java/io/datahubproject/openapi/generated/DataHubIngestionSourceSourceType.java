package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets DataHubIngestionSourceSourceType
 */
public enum DataHubIngestionSourceSourceType {
  SYSTEM("SYSTEM");

  private String value;

  DataHubIngestionSourceSourceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DataHubIngestionSourceSourceType fromValue(String text) {
    for (DataHubIngestionSourceSourceType b : DataHubIngestionSourceSourceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
