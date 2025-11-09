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
 * Enum that defines how the modules should be rendered. There should be two frontend implementation of large and small modules per type.
 */
public enum RecommendationRenderType {
  ENTITY_NAME_LIST("ENTITY_NAME_LIST"),
    PLATFORM_SEARCH_LIST("PLATFORM_SEARCH_LIST"),
    TAG_SEARCH_LIST("TAG_SEARCH_LIST"),
    GLOSSARY_TERM_SEARCH_LIST("GLOSSARY_TERM_SEARCH_LIST"),
    SEARCH_QUERY_LIST("SEARCH_QUERY_LIST"),
    DOMAIN_SEARCH_LIST("DOMAIN_SEARCH_LIST");

  private String value;

  RecommendationRenderType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RecommendationRenderType fromValue(String text) {
    for (RecommendationRenderType b : RecommendationRenderType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
