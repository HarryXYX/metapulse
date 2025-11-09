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
 * Fabric group type
 */
public enum FabricType {
  DEV("DEV"),
    TEST("TEST"),
    QA("QA"),
    UAT("UAT"),
    EI("EI"),
    PRE("PRE"),
    STG("STG"),
    NON_PROD("NON_PROD"),
    PROD("PROD"),
    CORP("CORP"),
    RVW("RVW"),
    PRD("PRD"),
    TST("TST"),
    SIT("SIT"),
    SBX("SBX"),
    SANDBOX("SANDBOX");

  private String value;

  FabricType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FabricType fromValue(String text) {
    for (FabricType b : FabricType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
