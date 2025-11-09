package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.SummaryElementType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Info for a given asset summary element
 */
@Schema(description = "Info for a given asset summary element")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SummaryElement   {

  @JsonProperty("elementType") @Builder.Default
  private SummaryElementType elementType = null;

  @JsonProperty("structuredPropertyUrn") @Builder.Default
  private String structuredPropertyUrn = null;

  public SummaryElement elementType(SummaryElementType elementType) {
    this.elementType = elementType;
    return this;
  }

  /**
   * Get elementType
   * @return elementType
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SummaryElementType getElementType() {
    return elementType;
  }

  public void setElementType(SummaryElementType elementType) {
    this.elementType = elementType;
  }

  public SummaryElement structuredPropertyUrn(String structuredPropertyUrn) {
    this.structuredPropertyUrn = structuredPropertyUrn;
    return this;
  }

  /**
   * The urn of the structured property shown. Required if propertyType is STRUCTURED_PROPERTY
   * @return structuredPropertyUrn
   **/
  @Schema(description = "The urn of the structured property shown. Required if propertyType is STRUCTURED_PROPERTY")
  
    public String getStructuredPropertyUrn() {
    return structuredPropertyUrn;
  }

  public void setStructuredPropertyUrn(String structuredPropertyUrn) {
    this.structuredPropertyUrn = structuredPropertyUrn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryElement summaryElement = (SummaryElement) o;
    return Objects.equals(this.elementType, summaryElement.elementType) &&
        Objects.equals(this.structuredPropertyUrn, summaryElement.structuredPropertyUrn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementType, structuredPropertyUrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryElement {\n");
    
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
    sb.append("    structuredPropertyUrn: ").append(toIndentedString(structuredPropertyUrn)).append("\n");
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