package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets IntendedUserType
 */
public enum IntendedUserType {
  ENTERPRISE("ENTERPRISE"),
    HOBBY("HOBBY"),
    ENTERTAINMENT("ENTERTAINMENT");

  private String value;

  IntendedUserType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static IntendedUserType fromValue(String text) {
    for (IntendedUserType b : IntendedUserType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
