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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Quantitative analyses should be disaggregated, that is, broken down by the chosen factors. Quantitative analyses should provide the results of evaluating the MLModel according to the chosen metrics, providing confidence interval values when possible.
 */
@Schema(description = "Quantitative analyses should be disaggregated, that is, broken down by the chosen factors. Quantitative analyses should provide the results of evaluating the MLModel according to the chosen metrics, providing confidence interval values when possible.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLModelQuantitativeAnalyses  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MLModelQuantitativeAnalyses") @Builder.Default
  private String __type = "MLModelQuantitativeAnalyses";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MLModelQuantitativeAnalyses"},
  defaultValue = "MLModelQuantitativeAnalyses")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("unitaryResults") @Builder.Default
  private String unitaryResults = null;

  @JsonProperty("intersectionalResults") @Builder.Default
  private String intersectionalResults = null;

  public MLModelQuantitativeAnalyses unitaryResults(String unitaryResults) {
    this.unitaryResults = unitaryResults;
    return this;
  }

  /**
   * Link to a dashboard with results showing how the MLModel performed with respect to each factor
   * @return unitaryResults
   **/
  @Schema(description = "Link to a dashboard with results showing how the MLModel performed with respect to each factor")
  
    public String getUnitaryResults() {
    return unitaryResults;
  }

  public void setUnitaryResults(String unitaryResults) {
    this.unitaryResults = unitaryResults;
  }

  public MLModelQuantitativeAnalyses intersectionalResults(String intersectionalResults) {
    this.intersectionalResults = intersectionalResults;
    return this;
  }

  /**
   * Link to a dashboard with results showing how the MLModel performed with respect to the intersection of evaluated factors?
   * @return intersectionalResults
   **/
  @Schema(description = "Link to a dashboard with results showing how the MLModel performed with respect to the intersection of evaluated factors?")
  
    public String getIntersectionalResults() {
    return intersectionalResults;
  }

  public void setIntersectionalResults(String intersectionalResults) {
    this.intersectionalResults = intersectionalResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLModelQuantitativeAnalyses mlModelQuantitativeAnalyses = (MLModelQuantitativeAnalyses) o;
    return Objects.equals(this.unitaryResults, mlModelQuantitativeAnalyses.unitaryResults) &&
        Objects.equals(this.intersectionalResults, mlModelQuantitativeAnalyses.intersectionalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitaryResults, intersectionalResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLModelQuantitativeAnalyses {\n");
    
    sb.append("    unitaryResults: ").append(toIndentedString(unitaryResults)).append("\n");
    sb.append("    intersectionalResults: ").append(toIndentedString(intersectionalResults)).append("\n");
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