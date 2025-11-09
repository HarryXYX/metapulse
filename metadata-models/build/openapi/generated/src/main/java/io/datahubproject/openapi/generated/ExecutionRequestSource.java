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
 * ExecutionRequestSource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExecutionRequestSource   {

  @JsonProperty("type") @Builder.Default
  private String type = null;

  @JsonProperty("ingestionSource") @Builder.Default
  private String ingestionSource = null;

  public ExecutionRequestSource type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the execution request source, e.g. INGESTION_SOURCE
   * @return type
   **/
  @Schema(required = true, description = "The type of the execution request source, e.g. INGESTION_SOURCE")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ExecutionRequestSource ingestionSource(String ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

  /**
   * The urn of the ingestion source associated with the ingestion request. Present if type is INGESTION_SOURCE
   * @return ingestionSource
   **/
  @Schema(description = "The urn of the ingestion source associated with the ingestion request. Present if type is INGESTION_SOURCE")
  
    public String getIngestionSource() {
    return ingestionSource;
  }

  public void setIngestionSource(String ingestionSource) {
    this.ingestionSource = ingestionSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutionRequestSource executionRequestSource = (ExecutionRequestSource) o;
    return Objects.equals(this.type, executionRequestSource.type) &&
        Objects.equals(this.ingestionSource, executionRequestSource.ingestionSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, ingestionSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionRequestSource {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ingestionSource: ").append(toIndentedString(ingestionSource)).append("\n");
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