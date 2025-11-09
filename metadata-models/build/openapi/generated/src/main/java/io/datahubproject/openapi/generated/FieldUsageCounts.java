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
 *  Records field-level usage counts for a given resource 
 */
@Schema(description = " Records field-level usage counts for a given resource ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FieldUsageCounts   {

  @JsonProperty("fieldName") @Builder.Default
  private String fieldName = null;

  @JsonProperty("count") @Builder.Default
  private Integer count = null;

  public FieldUsageCounts fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Get fieldName
   * @return fieldName
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public FieldUsageCounts count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * minimum: -2147483648
   * maximum: 2147483647
   * @return count
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldUsageCounts fieldUsageCounts = (FieldUsageCounts) o;
    return Objects.equals(this.fieldName, fieldUsageCounts.fieldName) &&
        Objects.equals(this.count, fieldUsageCounts.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldUsageCounts {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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