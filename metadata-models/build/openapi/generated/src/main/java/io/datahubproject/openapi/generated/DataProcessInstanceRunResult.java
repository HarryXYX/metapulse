package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.RunResultType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * DataProcessInstanceRunResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataProcessInstanceRunResult   {

  @JsonProperty("type") @Builder.Default
  private RunResultType type = null;

  @JsonProperty("nativeResultType") @Builder.Default
  private String nativeResultType = null;

  public DataProcessInstanceRunResult type(RunResultType type) {
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
    public RunResultType getType() {
    return type;
  }

  public void setType(RunResultType type) {
    this.type = type;
  }

  public DataProcessInstanceRunResult nativeResultType(String nativeResultType) {
    this.nativeResultType = nativeResultType;
    return this;
  }

  /**
   * It identifies the system where the native result comes from like Airflow, Azkaban, etc..
   * @return nativeResultType
   **/
  @Schema(required = true, description = "It identifies the system where the native result comes from like Airflow, Azkaban, etc..")
      @NotNull

    public String getNativeResultType() {
    return nativeResultType;
  }

  public void setNativeResultType(String nativeResultType) {
    this.nativeResultType = nativeResultType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataProcessInstanceRunResult dataProcessInstanceRunResult = (DataProcessInstanceRunResult) o;
    return Objects.equals(this.type, dataProcessInstanceRunResult.type) &&
        Objects.equals(this.nativeResultType, dataProcessInstanceRunResult.nativeResultType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, nativeResultType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataProcessInstanceRunResult {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    nativeResultType: ").append(toIndentedString(nativeResultType)).append("\n");
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