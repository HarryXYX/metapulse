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
 * Enum to define the operation type when an entity changes.
 */
public enum OperationType {
  INSERT("INSERT"),
    UPDATE("UPDATE"),
    DELETE("DELETE"),
    CREATE("CREATE"),
    ALTER("ALTER"),
    DROP("DROP"),
    CUSTOM("CUSTOM"),
    UNKNOWN("UNKNOWN");

  private String value;

  OperationType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OperationType fromValue(String text) {
    for (OperationType b : OperationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
