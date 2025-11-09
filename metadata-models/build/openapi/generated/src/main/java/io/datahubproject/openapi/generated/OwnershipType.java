package io.datahubproject.openapi.generated;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Asset owner types
 */
public enum OwnershipType {
  CUSTOM("CUSTOM"),
    TECHNICAL_OWNER("TECHNICAL_OWNER"),
    BUSINESS_OWNER("BUSINESS_OWNER"),
    DATA_STEWARD("DATA_STEWARD"),
    NONE("NONE"),
    DEVELOPER("DEVELOPER"),
    DATAOWNER("DATAOWNER"),
    DELEGATE("DELEGATE"),
    PRODUCER("PRODUCER"),
    CONSUMER("CONSUMER"),
    STAKEHOLDER("STAKEHOLDER");

  private String value;

  OwnershipType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OwnershipType fromValue(String text) {
    for (OwnershipType b : OwnershipType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
