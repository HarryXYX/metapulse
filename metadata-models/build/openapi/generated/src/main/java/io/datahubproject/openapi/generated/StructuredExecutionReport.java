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
 * A flexible carrier for structured results of an execution request. The goal is to allow for free flow of structured responses from execution tasks to the orchestrator or observer. The full spectrum of different execution report types is not intended to be modeled by this object.
 */
@Schema(description = "A flexible carrier for structured results of an execution request. The goal is to allow for free flow of structured responses from execution tasks to the orchestrator or observer. The full spectrum of different execution report types is not intended to be modeled by this object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StructuredExecutionReport   {

  @JsonProperty("type") @Builder.Default
  private String type = null;

  @JsonProperty("serializedValue") @Builder.Default
  private String serializedValue = null;

  @JsonProperty("contentType") @Builder.Default
  private String contentType = null;

  public StructuredExecutionReport type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the structured report. (e.g. INGESTION_REPORT, TEST_CONNECTION_REPORT, etc.)
   * @return type
   **/
  @Schema(required = true, description = "The type of the structured report. (e.g. INGESTION_REPORT, TEST_CONNECTION_REPORT, etc.)")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public StructuredExecutionReport serializedValue(String serializedValue) {
    this.serializedValue = serializedValue;
    return this;
  }

  /**
   * The serialized value of the structured report
   * @return serializedValue
   **/
  @Schema(required = true, description = "The serialized value of the structured report")
      @NotNull

    public String getSerializedValue() {
    return serializedValue;
  }

  public void setSerializedValue(String serializedValue) {
    this.serializedValue = serializedValue;
  }

  public StructuredExecutionReport contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * The content-type of the serialized value (e.g. application/json, application/json;gzip etc.)
   * @return contentType
   **/
  @Schema(required = true, description = "The content-type of the serialized value (e.g. application/json, application/json;gzip etc.)")
      @NotNull

    public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredExecutionReport structuredExecutionReport = (StructuredExecutionReport) o;
    return Objects.equals(this.type, structuredExecutionReport.type) &&
        Objects.equals(this.serializedValue, structuredExecutionReport.serializedValue) &&
        Objects.equals(this.contentType, structuredExecutionReport.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, serializedValue, contentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredExecutionReport {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    serializedValue: ").append(toIndentedString(serializedValue)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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