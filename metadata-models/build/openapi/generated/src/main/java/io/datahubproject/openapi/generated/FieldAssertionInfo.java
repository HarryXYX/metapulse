package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DatasetFilter;
import io.datahubproject.openapi.generated.FieldAssertionType;
import io.datahubproject.openapi.generated.FieldMetricAssertion;
import io.datahubproject.openapi.generated.FieldValuesAssertion;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Attributes defining a Field Assertion.
 */
@Schema(description = "Attributes defining a Field Assertion.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FieldAssertionInfo   {

  @JsonProperty("type") @Builder.Default
  private FieldAssertionType type = null;

  @JsonProperty("entity") @Builder.Default
  private String entity = null;

  @JsonProperty("fieldValuesAssertion") @Builder.Default
  private FieldValuesAssertion fieldValuesAssertion = null;

  @JsonProperty("fieldMetricAssertion") @Builder.Default
  private FieldMetricAssertion fieldMetricAssertion = null;

  @JsonProperty("filter") @Builder.Default
  private DatasetFilter filter = null;

  public FieldAssertionInfo type(FieldAssertionType type) {
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
    public FieldAssertionType getType() {
    return type;
  }

  public void setType(FieldAssertionType type) {
    this.type = type;
  }

  public FieldAssertionInfo entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * The entity targeted by this Field check.
   * @return entity
   **/
  @Schema(required = true, description = "The entity targeted by this Field check.")
      @NotNull

    public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public FieldAssertionInfo fieldValuesAssertion(FieldValuesAssertion fieldValuesAssertion) {
    this.fieldValuesAssertion = fieldValuesAssertion;
    return this;
  }

  /**
   * Get fieldValuesAssertion
   * @return fieldValuesAssertion
   **/
  @Schema(description = "")
  
    @Valid
    public FieldValuesAssertion getFieldValuesAssertion() {
    return fieldValuesAssertion;
  }

  public void setFieldValuesAssertion(FieldValuesAssertion fieldValuesAssertion) {
    this.fieldValuesAssertion = fieldValuesAssertion;
  }

  public FieldAssertionInfo fieldMetricAssertion(FieldMetricAssertion fieldMetricAssertion) {
    this.fieldMetricAssertion = fieldMetricAssertion;
    return this;
  }

  /**
   * Get fieldMetricAssertion
   * @return fieldMetricAssertion
   **/
  @Schema(description = "")
  
    @Valid
    public FieldMetricAssertion getFieldMetricAssertion() {
    return fieldMetricAssertion;
  }

  public void setFieldMetricAssertion(FieldMetricAssertion fieldMetricAssertion) {
    this.fieldMetricAssertion = fieldMetricAssertion;
  }

  public FieldAssertionInfo filter(DatasetFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   **/
  @Schema(description = "")
  
    @Valid
    public DatasetFilter getFilter() {
    return filter;
  }

  public void setFilter(DatasetFilter filter) {
    this.filter = filter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldAssertionInfo fieldAssertionInfo = (FieldAssertionInfo) o;
    return Objects.equals(this.type, fieldAssertionInfo.type) &&
        Objects.equals(this.entity, fieldAssertionInfo.entity) &&
        Objects.equals(this.fieldValuesAssertion, fieldAssertionInfo.fieldValuesAssertion) &&
        Objects.equals(this.fieldMetricAssertion, fieldAssertionInfo.fieldMetricAssertion) &&
        Objects.equals(this.filter, fieldAssertionInfo.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, entity, fieldValuesAssertion, fieldMetricAssertion, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldAssertionInfo {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    fieldValuesAssertion: ").append(toIndentedString(fieldValuesAssertion)).append("\n");
    sb.append("    fieldMetricAssertion: ").append(toIndentedString(fieldMetricAssertion)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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