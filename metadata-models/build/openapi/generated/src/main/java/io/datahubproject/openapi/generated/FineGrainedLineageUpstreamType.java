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
 * The type of upstream entity in a fine-grained lineage
 */
public enum FineGrainedLineageUpstreamType {
  FIELD_SET("FIELD_SET"),
    DATASET("DATASET"),
    NONE("NONE");

  private String value;

  FineGrainedLineageUpstreamType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FineGrainedLineageUpstreamType fromValue(String text) {
    for (FineGrainedLineageUpstreamType b : FineGrainedLineageUpstreamType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
