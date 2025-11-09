package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AggregationType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Provides the aggregation specification on a member/field.
 */
@Schema(description = "Provides the aggregation specification on a member/field.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AggregationSpec   {

  @JsonProperty("fieldPath") @Builder.Default
  private String fieldPath = null;

  @JsonProperty("aggregationType") @Builder.Default
  private AggregationType aggregationType = null;

  public AggregationSpec fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  /**
   * Name of the member/field.
   * @return fieldPath
   **/
  @Schema(required = true, description = "Name of the member/field.")
      @NotNull

    public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public AggregationSpec aggregationType(AggregationType aggregationType) {
    this.aggregationType = aggregationType;
    return this;
  }

  /**
   * Get aggregationType
   * @return aggregationType
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AggregationType getAggregationType() {
    return aggregationType;
  }

  public void setAggregationType(AggregationType aggregationType) {
    this.aggregationType = aggregationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationSpec aggregationSpec = (AggregationSpec) o;
    return Objects.equals(this.fieldPath, aggregationSpec.fieldPath) &&
        Objects.equals(this.aggregationType, aggregationSpec.aggregationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldPath, aggregationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationSpec {\n");
    
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    aggregationType: ").append(toIndentedString(aggregationType)).append("\n");
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