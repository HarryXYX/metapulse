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
public class EvaluationData  implements OneOfMLModelSnapshotAspectsItems, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "EvaluationData") @Builder.Default
  private String __type = "EvaluationData";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"EvaluationData"},
  defaultValue = "EvaluationData")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("evaluationData") @Builder.Default
  @Valid
  private List<BaseData> evaluationData = new ArrayList<>();

  public EvaluationData evaluationData(List<BaseData> evaluationData) {
    this.evaluationData = evaluationData;
    return this;
  }

  public EvaluationData addEvaluationDataItem(BaseData evaluationDataItem) {
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
    EvaluationData evaluationData = (EvaluationData) o;
    return Objects.equals(this.evaluationData, evaluationData.evaluationData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationData {\n");
    
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