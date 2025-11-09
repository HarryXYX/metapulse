package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.BaseData;
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
 * All referenced datasets would ideally point to any set of documents that provide visibility into the source and composition of the dataset.
 */
@Schema(description = "All referenced datasets would ideally point to any set of documents that provide visibility into the source and composition of the dataset.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLModelEvaluationData  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MLModelEvaluationData") @Builder.Default
  private String __type = "MLModelEvaluationData";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MLModelEvaluationData"},
  defaultValue = "MLModelEvaluationData")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("evaluationData") @Builder.Default
  @Valid
  private List<BaseData> evaluationData = new ArrayList<>();

  public MLModelEvaluationData evaluationData(List<BaseData> evaluationData) {
    this.evaluationData = evaluationData;
    return this;
  }

  public MLModelEvaluationData addEvaluationDataItem(BaseData evaluationDataItem) {
    this.evaluationData.add(evaluationDataItem);
    return this;
  }

  /**
   * Details on the dataset(s) used for the quantitative analyses in the MLModel
   * @return evaluationData
   **/
  @Schema(required = true, description = "Details on the dataset(s) used for the quantitative analyses in the MLModel")
      @NotNull
    @Valid
    public List<BaseData> getEvaluationData() {
    return evaluationData;
  }

  public void setEvaluationData(List<BaseData> evaluationData) {
    this.evaluationData = evaluationData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLModelEvaluationData mlModelEvaluationData = (MLModelEvaluationData) o;
    return Objects.equals(this.evaluationData, mlModelEvaluationData.evaluationData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLModelEvaluationData {\n");
    
    sb.append("    evaluationData: ").append(toIndentedString(evaluationData)).append("\n");
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