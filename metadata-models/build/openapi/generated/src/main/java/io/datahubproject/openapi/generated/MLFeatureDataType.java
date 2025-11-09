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
 * MLFeature Data Type
 */
public enum MLFeatureDataType {
  USELESS("USELESS"),
    NOMINAL("NOMINAL"),
    ORDINAL("ORDINAL"),
    BINARY("BINARY"),
    COUNT("COUNT"),
    TIME("TIME"),
    INTERVAL("INTERVAL"),
    IMAGE("IMAGE"),
    VIDEO("VIDEO"),
    AUDIO("AUDIO"),
    TEXT("TEXT"),
    MAP("MAP"),
    SEQUENCE("SEQUENCE"),
    SET("SET"),
    CONTINUOUS("CONTINUOUS"),
    BYTE("BYTE"),
    UNKNOWN("UNKNOWN");

  private String value;

  MLFeatureDataType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MLFeatureDataType fromValue(String text) {
    for (MLFeatureDataType b : MLFeatureDataType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
