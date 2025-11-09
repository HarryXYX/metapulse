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
public enum PolicyMatchCondition {
  EQUALS("EQUALS"),
    STARTS_WITH("STARTS_WITH"),
    NOT_EQUALS("NOT_EQUALS");

  private String value;

  PolicyMatchCondition(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PolicyMatchCondition fromValue(String text) {
    for (PolicyMatchCondition b : PolicyMatchCondition.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
