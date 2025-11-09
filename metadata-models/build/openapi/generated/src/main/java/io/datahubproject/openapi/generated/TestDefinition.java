package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.TestDefinitionType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * TestDefinition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestDefinition   {

  @JsonProperty("type") @Builder.Default
  private TestDefinitionType type = null;

  @JsonProperty("json") @Builder.Default
  private String json = null;

  public TestDefinition type(TestDefinitionType type) {
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
    public TestDefinitionType getType() {
    return type;
  }

  public void setType(TestDefinitionType type) {
    this.type = type;
  }

  public TestDefinition json(String json) {
    this.json = json;
    return this;
  }

  /**
   * JSON format configuration for the test
   * @return json
   **/
  @Schema(description = "JSON format configuration for the test")
  
    public String getJson() {
    return json;
  }

  public void setJson(String json) {
    this.json = json;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestDefinition testDefinition = (TestDefinition) o;
    return Objects.equals(this.type, testDefinition.type) &&
        Objects.equals(this.json, testDefinition.json);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, json);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestDefinition {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
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