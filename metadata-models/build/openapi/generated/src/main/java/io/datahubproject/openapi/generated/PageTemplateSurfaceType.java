package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets PageTemplateSurfaceType
 */
public enum PageTemplateSurfaceType {
  HOME_PAGE("HOME_PAGE"),
    ASSET_SUMMARY("ASSET_SUMMARY");

  private String value;

  PageTemplateSurfaceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PageTemplateSurfaceType fromValue(String text) {
    for (PageTemplateSurfaceType b : PageTemplateSurfaceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
