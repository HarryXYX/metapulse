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
 * Model endpoint statuses
 */
public enum DeploymentStatus {
  OUT_OF_SERVICE("OUT_OF_SERVICE"),
    CREATING("CREATING"),
    UPDATING("UPDATING"),
    ROLLING_BACK("ROLLING_BACK"),
    IN_SERVICE("IN_SERVICE"),
    DELETING("DELETING"),
    FAILED("FAILED"),
    UNKNOWN("UNKNOWN");

  private String value;

  DeploymentStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DeploymentStatus fromValue(String text) {
    for (DeploymentStatus b : DeploymentStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
