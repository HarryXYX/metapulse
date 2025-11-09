package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * The model for the search result
 */
@Schema(description = "The model for the search result")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchSuggestion   {

  @JsonProperty("text") @Builder.Default
  private String text = null;

  @JsonProperty("score") @Builder.Default
  private BigDecimal score = null;

  @JsonProperty("frequency") @Builder.Default
  private Long frequency = null;

  public SearchSuggestion text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The suggestion text for this search query
   * @return text
   **/
  @Schema(required = true, description = "The suggestion text for this search query")
      @NotNull

    public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SearchSuggestion score(BigDecimal score) {
    this.score = score;
    return this;
  }

  /**
   * The score for how close this suggestion is to the original search query. The closer to 1 means it is closer to the original query and 0 is further away.
   * @return score
   **/
  @Schema(required = true, description = "The score for how close this suggestion is to the original search query. The closer to 1 means it is closer to the original query and 0 is further away.")
      @NotNull

    @Valid
    public BigDecimal getScore() {
    return score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }

  public SearchSuggestion frequency(Long frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * How many matches there are with the suggested text for the given field
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return frequency
   **/
  @Schema(required = true, description = "How many matches there are with the suggested text for the given field")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getFrequency() {
    return frequency;
  }

  public void setFrequency(Long frequency) {
    this.frequency = frequency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSuggestion searchSuggestion = (SearchSuggestion) o;
    return Objects.equals(this.text, searchSuggestion.text) &&
        Objects.equals(this.score, searchSuggestion.score) &&
        Objects.equals(this.frequency, searchSuggestion.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, score, frequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSuggestion {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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