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
 * Job statuses
 */
public enum JobStatus {
  STARTING("STARTING"),
    IN_PROGRESS("IN_PROGRESS"),
    STOPPING("STOPPING"),
    STOPPED("STOPPED"),
    COMPLETED("COMPLETED"),
    FAILED("FAILED"),
    UNKNOWN("UNKNOWN"),
    SKIPPED("SKIPPED");

  private String value;

  JobStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static JobStatus fromValue(String text) {
    for (JobStatus b : JobStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
