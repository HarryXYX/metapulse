package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets SearchFieldType
 */
public enum SearchFieldType {
  KEYWORD("KEYWORD"),
    TEXT("TEXT"),
    TEXT_PARTIAL("TEXT_PARTIAL"),
    BROWSE_PATH("BROWSE_PATH"),
    URN("URN"),
    URN_PARTIAL("URN_PARTIAL"),
    BOOLEAN("BOOLEAN"),
    COUNT("COUNT"),
    DATETIME("DATETIME"),
    OBJECT("OBJECT"),
    BROWSE_PATH_V2("BROWSE_PATH_V2"),
    WORD_GRAM("WORD_GRAM");

  private String value;

  SearchFieldType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SearchFieldType fromValue(String text) {
    for (SearchFieldType b : SearchFieldType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
