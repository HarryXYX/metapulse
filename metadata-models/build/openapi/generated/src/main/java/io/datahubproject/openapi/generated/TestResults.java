package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.TestResult;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Information about a Test Result
 */
@Schema(description = "Information about a Test Result")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestResults  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "TestResults") @Builder.Default
  private String __type = "TestResults";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"TestResults"},
  defaultValue = "TestResults")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("failing") @Builder.Default
  @Valid
  private List<TestResult> failing = new ArrayList<>();

  @JsonProperty("passing") @Builder.Default
  @Valid
  private List<TestResult> passing = new ArrayList<>();

  public TestResults failing(List<TestResult> failing) {
    this.failing = failing;
    return this;
  }

  public TestResults addFailingItem(TestResult failingItem) {
    this.failing.add(failingItem);
    return this;
  }

  /**
   * Results that are failing
   * @return failing
   **/
  @Schema(required = true, description = "Results that are failing")
      @NotNull
    @Valid
    public List<TestResult> getFailing() {
    return failing;
  }

  public void setFailing(List<TestResult> failing) {
    this.failing = failing;
  }

  public TestResults passing(List<TestResult> passing) {
    this.passing = passing;
    return this;
  }

  public TestResults addPassingItem(TestResult passingItem) {
    this.passing.add(passingItem);
    return this;
  }

  /**
   * Results that are passing
   * @return passing
   **/
  @Schema(required = true, description = "Results that are passing")
      @NotNull
    @Valid
    public List<TestResult> getPassing() {
    return passing;
  }

  public void setPassing(List<TestResult> passing) {
    this.passing = passing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResults testResults = (TestResults) o;
    return Objects.equals(this.failing, testResults.failing) &&
        Objects.equals(this.passing, testResults.passing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failing, passing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResults {\n");
    
    sb.append("    failing: ").append(toIndentedString(failing)).append("\n");
    sb.append("    passing: ").append(toIndentedString(passing)).append("\n");
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