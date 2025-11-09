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
 * The various types of charts
 */
public enum ChartType {
  BAR("BAR"),
    PIE("PIE"),
    SCATTER("SCATTER"),
    TABLE("TABLE"),
    TEXT("TEXT"),
    LINE("LINE"),
    AREA("AREA"),
    HISTOGRAM("HISTOGRAM"),
    BOX_PLOT("BOX_PLOT"),
    WORD_CLOUD("WORD_CLOUD"),
    COHORT("COHORT");

  private String value;

  ChartType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ChartType fromValue(String text) {
    for (ChartType b : ChartType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
