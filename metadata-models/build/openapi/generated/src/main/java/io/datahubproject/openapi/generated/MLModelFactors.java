package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
/**
 * Factors affecting the performance of the MLModel.
 */
@Schema(description = "Factors affecting the performance of the MLModel.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLModelFactors   {

  @JsonProperty("groups") @Builder.Default
  @Valid
  private List<String> groups = null;

  @JsonProperty("instrumentation") @Builder.Default
  @Valid
  private List<String> instrumentation = null;

  @JsonProperty("environment") @Builder.Default
  @Valid
  private List<String> environment = null;

  public MLModelFactors groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public MLModelFactors addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances. For human-centric machine learning MLModels, groups are people who share one or multiple characteristics.
   * @return groups
   **/
  @Schema(description = "Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances. For human-centric machine learning MLModels, groups are people who share one or multiple characteristics.")
  
    public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public MLModelFactors instrumentation(List<String> instrumentation) {
    this.instrumentation = instrumentation;
    return this;
  }

  public MLModelFactors addInstrumentationItem(String instrumentationItem) {
    if (this.instrumentation == null) {
      this.instrumentation = new ArrayList<>();
    }
    this.instrumentation.add(instrumentationItem);
    return this;
  }

  /**
   * The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel. For example, a face detection model may perform differently depending on the camera's hardware and software, including lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.
   * @return instrumentation
   **/
  @Schema(description = "The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel. For example, a face detection model may perform differently depending on the camera's hardware and software, including lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.")
  
    public List<String> getInstrumentation() {
    return instrumentation;
  }

  public void setInstrumentation(List<String> instrumentation) {
    this.instrumentation = instrumentation;
  }

  public MLModelFactors environment(List<String> environment) {
    this.environment = environment;
    return this;
  }

  public MLModelFactors addEnvironmentItem(String environmentItem) {
    if (this.environment == null) {
      this.environment = new ArrayList<>();
    }
    this.environment.add(environmentItem);
    return this;
  }

  /**
   * A further factor affecting MLModel performance is the environment in which it is deployed.
   * @return environment
   **/
  @Schema(description = "A further factor affecting MLModel performance is the environment in which it is deployed.")
  
    public List<String> getEnvironment() {
    return environment;
  }

  public void setEnvironment(List<String> environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLModelFactors mlModelFactors = (MLModelFactors) o;
    return Objects.equals(this.groups, mlModelFactors.groups) &&
        Objects.equals(this.instrumentation, mlModelFactors.instrumentation) &&
        Objects.equals(this.environment, mlModelFactors.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, instrumentation, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLModelFactors {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    instrumentation: ").append(toIndentedString(instrumentation)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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