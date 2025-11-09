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
 * The matching condition in a filter criterion
 */
public enum Condition {
  CONTAIN("CONTAIN"),
    END_WITH("END_WITH"),
    EQUAL("EQUAL"),
    IEQUAL("IEQUAL"),
    IS_NULL("IS_NULL"),
    EXISTS("EXISTS"),
    GREATER_THAN("GREATER_THAN"),
    GREATER_THAN_OR_EQUAL_TO("GREATER_THAN_OR_EQUAL_TO"),
    IN("IN"),
    LESS_THAN("LESS_THAN"),
    LESS_THAN_OR_EQUAL_TO("LESS_THAN_OR_EQUAL_TO"),
    START_WITH("START_WITH"),
    DESCENDANTS_INCL("DESCENDANTS_INCL"),
    ANCESTORS_INCL("ANCESTORS_INCL"),
    RELATED_INCL("RELATED_INCL");

  private String value;

  Condition(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Condition fromValue(String text) {
    for (Condition b : Condition.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
