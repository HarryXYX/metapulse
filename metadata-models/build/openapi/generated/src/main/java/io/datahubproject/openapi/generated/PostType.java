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
 * Enum defining types of Posts.
 */
public enum PostType {
  HOME_PAGE_ANNOUNCEMENT("HOME_PAGE_ANNOUNCEMENT"),
    ENTITY_ANNOUNCEMENT("ENTITY_ANNOUNCEMENT");

  private String value;

  PostType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PostType fromValue(String text) {
    for (PostType b : PostType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
