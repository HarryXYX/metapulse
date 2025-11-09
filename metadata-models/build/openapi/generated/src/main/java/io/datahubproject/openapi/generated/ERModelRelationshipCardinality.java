package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ERModelRelationshipCardinality
 */
public enum ERModelRelationshipCardinality {
  ONE_ONE("ONE_ONE"),
    ONE_N("ONE_N"),
    N_ONE("N_ONE"),
    N_N("N_N");

  private String value;

  ERModelRelationshipCardinality(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ERModelRelationshipCardinality fromValue(String text) {
    for (ERModelRelationshipCardinality b : ERModelRelationshipCardinality.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
