package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FieldValuesFailThresholdType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * FieldValuesFailThreshold
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FieldValuesFailThreshold   {

  @JsonProperty("type") @Builder.Default
  private FieldValuesFailThresholdType type = null;

  @JsonProperty("value") @Builder.Default
  private Long value = 0l;

  public FieldValuesFailThreshold type(FieldValuesFailThresholdType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public FieldValuesFailThresholdType getType() {
    return type;
  }

  public void setType(FieldValuesFailThresholdType type) {
    this.type = type;
  }

  public FieldValuesFailThreshold value(Long value) {
    this.value = value;
    return this;
  }

  /**
   * By default this is 0, meaning that ALL column values (i.e. rows) must meet the defined expectations.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return value
   **/
  @Schema(required = true, description = "By default this is 0, meaning that ALL column values (i.e. rows) must meet the defined expectations.")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
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
    FieldValuesFailThreshold fieldValuesFailThreshold = (FieldValuesFailThreshold) o;
    return Objects.equals(this.type, fieldValuesFailThreshold.type) &&
        Objects.equals(this.value, fieldValuesFailThreshold.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldValuesFailThreshold {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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