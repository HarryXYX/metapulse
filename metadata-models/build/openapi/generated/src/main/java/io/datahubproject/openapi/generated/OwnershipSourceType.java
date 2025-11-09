package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OwnershipSourceType
 */
public enum OwnershipSourceType {
  AUDIT("AUDIT"),
    DATABASE("DATABASE"),
    FILE_SYSTEM("FILE_SYSTEM"),
    ISSUE_TRACKING_SYSTEM("ISSUE_TRACKING_SYSTEM"),
    MANUAL("MANUAL"),
    SERVICE("SERVICE"),
    SOURCE_CONTROL("SOURCE_CONTROL"),
    OTHER("OTHER");

  private String value;

  OwnershipSourceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OwnershipSourceType fromValue(String text) {
    for (OwnershipSourceType b : OwnershipSourceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
