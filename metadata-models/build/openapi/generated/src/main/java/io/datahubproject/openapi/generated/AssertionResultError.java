package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssertionResultErrorType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 *  An error encountered when evaluating an AssertionResult
 */
@Schema(description = " An error encountered when evaluating an AssertionResult")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssertionResultError   {

  @JsonProperty("type") @Builder.Default
  private AssertionResultErrorType type = null;

  @JsonProperty("properties") @Builder.Default
  @Valid
  private Map<String, String> properties = null;

  public AssertionResultError type(AssertionResultErrorType type) {
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
    public AssertionResultErrorType getType() {
    return type;
  }

  public void setType(AssertionResultErrorType type) {
    this.type = type;
  }

  public AssertionResultError properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public AssertionResultError putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   *  Additional metadata depending on the type of error
   * @return properties
   **/
  @Schema(description = " Additional metadata depending on the type of error")
  
    public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssertionResultError assertionResultError = (AssertionResultError) o;
    return Objects.equals(this.type, assertionResultError.type) &&
        Objects.equals(this.properties, assertionResultError.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssertionResultError {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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