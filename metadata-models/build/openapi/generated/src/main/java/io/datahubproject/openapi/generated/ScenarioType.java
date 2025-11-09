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
 * Type of the scenario requesting recommendation
 */
public enum ScenarioType {
  HOME("HOME"),
    SEARCH_RESULTS("SEARCH_RESULTS"),
    ENTITY_PROFILE("ENTITY_PROFILE"),
    SEARCH_BAR("SEARCH_BAR");

  private String value;

  ScenarioType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ScenarioType fromValue(String text) {
    for (ScenarioType b : ScenarioType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
