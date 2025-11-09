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
 * A type of asset incident
 */
public enum IncidentType {
  FRESHNESS("FRESHNESS"),
    VOLUME("VOLUME"),
    FIELD("FIELD"),
    SQL("SQL"),
    DATA_SCHEMA("DATA_SCHEMA"),
    OPERATIONAL("OPERATIONAL"),
    CUSTOM("CUSTOM");

  private String value;

  IncidentType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static IncidentType fromValue(String text) {
    for (IncidentType b : IncidentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
