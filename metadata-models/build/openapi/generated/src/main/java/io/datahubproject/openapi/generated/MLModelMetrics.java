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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * MLModelMetrics to be featured for the MLModel.
 */
@Schema(description = "MLModelMetrics to be featured for the MLModel.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLModelMetrics  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MLModelMetrics") @Builder.Default
  private String __type = "MLModelMetrics";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MLModelMetrics"},
  defaultValue = "MLModelMetrics")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("performanceMeasures") @Builder.Default
  @Valid
  private List<String> performanceMeasures = null;

  @JsonProperty("decisionThreshold") @Builder.Default
  @Valid
  private List<String> decisionThreshold = null;

  public MLModelMetrics performanceMeasures(List<String> performanceMeasures) {
    this.performanceMeasures = performanceMeasures;
    return this;
  }

  public MLModelMetrics addPerformanceMeasuresItem(String performanceMeasuresItem) {
    if (this.performanceMeasures == null) {
      this.performanceMeasures = new ArrayList<>();
    }
    this.performanceMeasures.add(performanceMeasuresItem);
    return this;
  }

  /**
   * Measures of MLModel performance
   * @return performanceMeasures
   **/
  @Schema(description = "Measures of MLModel performance")
  
    public List<String> getPerformanceMeasures() {
    return performanceMeasures;
  }

  public void setPerformanceMeasures(List<String> performanceMeasures) {
    this.performanceMeasures = performanceMeasures;
  }

  public MLModelMetrics decisionThreshold(List<String> decisionThreshold) {
    this.decisionThreshold = decisionThreshold;
    return this;
  }

  public MLModelMetrics addDecisionThresholdItem(String decisionThresholdItem) {
    if (this.decisionThreshold == null) {
      this.decisionThreshold = new ArrayList<>();
    }
    this.decisionThreshold.add(decisionThresholdItem);
    return this;
  }

  /**
   * Decision Thresholds used (if any)?
   * @return decisionThreshold
   **/
  @Schema(description = "Decision Thresholds used (if any)?")
  
    public List<String> getDecisionThreshold() {
    return decisionThreshold;
  }

  public void setDecisionThreshold(List<String> decisionThreshold) {
    this.decisionThreshold = decisionThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLModelMetrics mlModelMetrics = (MLModelMetrics) o;
    return Objects.equals(this.performanceMeasures, mlModelMetrics.performanceMeasures) &&
        Objects.equals(this.decisionThreshold, mlModelMetrics.decisionThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performanceMeasures, decisionThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLModelMetrics {\n");
    
    sb.append("    performanceMeasures: ").append(toIndentedString(performanceMeasures)).append("\n");
    sb.append("    decisionThreshold: ").append(toIndentedString(decisionThreshold)).append("\n");
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