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
 * Descriptor for a change action
 */
public enum ChangeType {
  UPSERT("UPSERT"),
    CREATE("CREATE"),
    UPDATE("UPDATE"),
    DELETE("DELETE"),
    PATCH("PATCH"),
    RESTATE("RESTATE"),
    CREATE_ENTITY("CREATE_ENTITY");

  private String value;

  ChangeType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ChangeType fromValue(String text) {
    for (ChangeType b : ChangeType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
