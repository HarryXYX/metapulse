package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.TestResultType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Information about a Test Result
 */
@Schema(description = "Information about a Test Result")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestResult   {

  @JsonProperty("test") @Builder.Default
  private String test = null;

  @JsonProperty("type") @Builder.Default
  private TestResultType type = null;

  @JsonProperty("testDefinitionMd5") @Builder.Default
  private String testDefinitionMd5 = null;

  @JsonProperty("lastComputed") @Builder.Default
  private AuditStamp lastComputed = null;

  public TestResult test(String test) {
    this.test = test;
    return this;
  }

  /**
   * The urn of the test
   * @return test
   **/
  @Schema(required = true, description = "The urn of the test")
      @NotNull

    public String getTest() {
    return test;
  }

  public void setTest(String test) {
    this.test = test;
  }

  public TestResult type(TestResultType type) {
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
    public TestResultType getType() {
    return type;
  }

  public void setType(TestResultType type) {
    this.type = type;
  }

  public TestResult testDefinitionMd5(String testDefinitionMd5) {
    this.testDefinitionMd5 = testDefinitionMd5;
    return this;
  }

  /**
   * The md5 of the test definition that was used to compute this result. See TestInfo.testDefinition.md5 for more information.
   * @return testDefinitionMd5
   **/
  @Schema(description = "The md5 of the test definition that was used to compute this result. See TestInfo.testDefinition.md5 for more information.")
  
    public String getTestDefinitionMd5() {
    return testDefinitionMd5;
  }

  public void setTestDefinitionMd5(String testDefinitionMd5) {
    this.testDefinitionMd5 = testDefinitionMd5;
  }

  public TestResult lastComputed(AuditStamp lastComputed) {
    this.lastComputed = lastComputed;
    return this;
  }

  /**
   * Get lastComputed
   * @return lastComputed
   **/
  @Schema(description = "")
  
    @Valid
    public AuditStamp getLastComputed() {
    return lastComputed;
  }

  public void setLastComputed(AuditStamp lastComputed) {
    this.lastComputed = lastComputed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResult testResult = (TestResult) o;
    return Objects.equals(this.test, testResult.test) &&
        Objects.equals(this.type, testResult.type) &&
        Objects.equals(this.testDefinitionMd5, testResult.testDefinitionMd5) &&
        Objects.equals(this.lastComputed, testResult.lastComputed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(test, type, testDefinitionMd5, lastComputed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResult {\n");
    
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    testDefinitionMd5: ").append(toIndentedString(testDefinitionMd5)).append("\n");
    sb.append("    lastComputed: ").append(toIndentedString(lastComputed)).append("\n");
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