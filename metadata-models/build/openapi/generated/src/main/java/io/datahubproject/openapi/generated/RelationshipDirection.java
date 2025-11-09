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
 * The relationship direction in a relationship filter
 */
public enum RelationshipDirection {
  INCOMING("INCOMING"),
    OUTGOING("OUTGOING"),
    UNDIRECTED("UNDIRECTED");

  private String value;

  RelationshipDirection(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RelationshipDirection fromValue(String text) {
    for (RelationshipDirection b : RelationshipDirection.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
