package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets IncidentStage
 */
public enum IncidentStage {
  TRIAGE("TRIAGE"),
    INVESTIGATION("INVESTIGATION"),
    WORK_IN_PROGRESS("WORK_IN_PROGRESS"),
    FIXED("FIXED"),
    NO_ACTION_REQUIRED("NO_ACTION_REQUIRED");

  private String value;

  IncidentStage(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static IncidentStage fromValue(String text) {
    for (IncidentStage b : IncidentStage.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
