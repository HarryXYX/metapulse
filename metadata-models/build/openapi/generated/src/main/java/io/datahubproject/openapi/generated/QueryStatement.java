package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.QueryLanguage;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * A query statement against one or more data assets.
 */
@Schema(description = "A query statement against one or more data assets.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryStatement   {

  @JsonProperty("value") @Builder.Default
  private String value = null;

  @JsonProperty("language") @Builder.Default
  private QueryLanguage language = null;

  public QueryStatement value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The query text
   * @return value
   **/
  @Schema(required = true, description = "The query text")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public QueryStatement language(QueryLanguage language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public QueryLanguage getLanguage() {
    return language;
  }

  public void setLanguage(QueryLanguage language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryStatement queryStatement = (QueryStatement) o;
    return Objects.equals(this.value, queryStatement.value) &&
        Objects.equals(this.language, queryStatement.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryStatement {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}