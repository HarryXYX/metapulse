package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Quantile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Quantile   {

  @JsonProperty("quantile") @Builder.Default
  private String quantile = null;

  @JsonProperty("value") @Builder.Default
  private String value = null;

  public Quantile quantile(String quantile) {
    this.quantile = quantile;
    return this;
  }

  /**
   * Get quantile
   * @return quantile
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getQuantile() {
    return quantile;
  }

  public void setQuantile(String quantile) {
    this.quantile = quantile;
  }

  public Quantile value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Quantile quantile = (Quantile) o;
    return Objects.equals(this.quantile, quantile.quantile) &&
        Objects.equals(this.value, quantile.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantile, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quantile {\n");
    
    sb.append("    quantile: ").append(toIndentedString(quantile)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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