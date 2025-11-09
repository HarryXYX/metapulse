package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets SummaryElementType
 */
public enum SummaryElementType {
  CREATED("CREATED"),
    TAGS("TAGS"),
    GLOSSARY_TERMS("GLOSSARY_TERMS"),
    OWNERS("OWNERS"),
    DOMAIN("DOMAIN"),
    STRUCTURED_PROPERTY("STRUCTURED_PROPERTY");

  private String value;

  SummaryElementType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SummaryElementType fromValue(String text) {
    for (SummaryElementType b : SummaryElementType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
