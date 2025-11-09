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
 * The type of downstream field(s) in a fine-grained lineage
 */
public enum FineGrainedLineageDownstreamType {
  FIELD("FIELD"),
    FIELD_SET("FIELD_SET");

  private String value;

  FineGrainedLineageDownstreamType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FineGrainedLineageDownstreamType fromValue(String text) {
    for (FineGrainedLineageDownstreamType b : FineGrainedLineageDownstreamType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
