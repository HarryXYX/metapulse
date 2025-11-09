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
 * Defines a grouping bucket type.
 */
public enum GroupingBucketType {
  DATE_GROUPING_BUCKET("DATE_GROUPING_BUCKET"),
    STRING_GROUPING_BUCKET("STRING_GROUPING_BUCKET");

  private String value;

  GroupingBucketType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GroupingBucketType fromValue(String text) {
    for (GroupingBucketType b : GroupingBucketType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
