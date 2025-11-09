package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.MLModelFactors;
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
 * Prompts which affect the performance of the MLModel
 */
@Schema(description = "Prompts which affect the performance of the MLModel")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLModelFactorPrompts  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfMLModelSnapshotAspectsItems, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MLModelFactorPrompts") @Builder.Default
  private String __type = "MLModelFactorPrompts";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MLModelFactorPrompts"},
  defaultValue = "MLModelFactorPrompts")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("relevantFactors") @Builder.Default
  @Valid
  private List<MLModelFactors> relevantFactors = null;

  @JsonProperty("evaluationFactors") @Builder.Default
  @Valid
  private List<MLModelFactors> evaluationFactors = null;

  public MLModelFactorPrompts relevantFactors(List<MLModelFactors> relevantFactors) {
    this.relevantFactors = relevantFactors;
    return this;
  }

  public MLModelFactorPrompts addRelevantFactorsItem(MLModelFactors relevantFactorsItem) {
    if (this.relevantFactors == null) {
      this.relevantFactors = new ArrayList<>();
    }
    this.relevantFactors.add(relevantFactorsItem);
    return this;
  }

  /**
   * What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?
   * @return relevantFactors
   **/
  @Schema(description = "What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?")
      @Valid
    public List<MLModelFactors> getRelevantFactors() {
    return relevantFactors;
  }

  public void setRelevantFactors(List<MLModelFactors> relevantFactors) {
    this.relevantFactors = relevantFactors;
  }

  public MLModelFactorPrompts evaluationFactors(List<MLModelFactors> evaluationFactors) {
    this.evaluationFactors = evaluationFactors;
    return this;
  }

  public MLModelFactorPrompts addEvaluationFactorsItem(MLModelFactors evaluationFactorsItem) {
    if (this.evaluationFactors == null) {
      this.evaluationFactors = new ArrayList<>();
    }
    this.evaluationFactors.add(evaluationFactorsItem);
    return this;
  }

  /**
   * Which factors are being reported, and why were these chosen?
   * @return evaluationFactors
   **/
  @Schema(description = "Which factors are being reported, and why were these chosen?")
      @Valid
    public List<MLModelFactors> getEvaluationFactors() {
    return evaluationFactors;
  }

  public void setEvaluationFactors(List<MLModelFactors> evaluationFactors) {
    this.evaluationFactors = evaluationFactors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLModelFactorPrompts mlModelFactorPrompts = (MLModelFactorPrompts) o;
    return Objects.equals(this.relevantFactors, mlModelFactorPrompts.relevantFactors) &&
        Objects.equals(this.evaluationFactors, mlModelFactorPrompts.evaluationFactors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relevantFactors, evaluationFactors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLModelFactorPrompts {\n");
    
    sb.append("    relevantFactors: ").append(toIndentedString(relevantFactors)).append("\n");
    sb.append("    evaluationFactors: ").append(toIndentedString(evaluationFactors)).append("\n");
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