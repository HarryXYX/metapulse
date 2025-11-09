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
 * Platform types available at LinkedIn
 */
public enum PlatformType {
  FILE_SYSTEM("FILE_SYSTEM"),
    KEY_VALUE_STORE("KEY_VALUE_STORE"),
    MESSAGE_BROKER("MESSAGE_BROKER"),
    OBJECT_STORE("OBJECT_STORE"),
    OLAP_DATASTORE("OLAP_DATASTORE"),
    OTHERS("OTHERS"),
    QUERY_ENGINE("QUERY_ENGINE"),
    RELATIONAL_DB("RELATIONAL_DB"),
    SEARCH_ENGINE("SEARCH_ENGINE");

  private String value;

  PlatformType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PlatformType fromValue(String text) {
    for (PlatformType b : PlatformType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
