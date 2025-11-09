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
 * Ideally, the MLModel card would contain as much information about the training data as the evaluation data. However, there might be cases where it is not feasible to provide this level of detailed information about the training data. For example, the data may be proprietary, or require a non-disclosure agreement. In these cases, we advocate for basic details about the distributions over groups in the data, as well as any other details that could inform stakeholders on the kinds of biases the model may have encoded.
 */
@Schema(description = "Ideally, the MLModel card would contain as much information about the training data as the evaluation data. However, there might be cases where it is not feasible to provide this level of detailed information about the training data. For example, the data may be proprietary, or require a non-disclosure agreement. In these cases, we advocate for basic details about the distributions over groups in the data, as well as any other details that could inform stakeholders on the kinds of biases the model may have encoded.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrainingData  implements OneOfMLModelSnapshotAspectsItems, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "TrainingData") @Builder.Default
  private String __type = "TrainingData";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"TrainingData"},
  defaultValue = "TrainingData")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("trainingData") @Builder.Default
  @Valid
  private List<BaseData> trainingData = new ArrayList<>();

  public TrainingData trainingData(List<BaseData> trainingData) {
    this.trainingData = trainingData;
    return this;
  }

  public TrainingData addTrainingDataItem(BaseData trainingDataItem) {
    this.trainingData.add(trainingDataItem);
    return this;
  }

  /**
   * Details on the dataset(s) used for training the MLModel
   * @return trainingData
   **/
  @Schema(required = true, description = "Details on the dataset(s) used for training the MLModel")
      @NotNull
    @Valid
    public List<BaseData> getTrainingData() {
    return trainingData;
  }

  public void setTrainingData(List<BaseData> trainingData) {
    this.trainingData = trainingData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrainingData trainingData = (TrainingData) o;
    return Objects.equals(this.trainingData, trainingData.trainingData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trainingData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainingData {\n");
    
    sb.append("    trainingData: ").append(toIndentedString(trainingData)).append("\n");
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