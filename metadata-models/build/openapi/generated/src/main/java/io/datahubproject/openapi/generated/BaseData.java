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
 * BaseData record
 */
@Schema(description = "BaseData record")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseData   {

  @JsonProperty("dataset") @Builder.Default
  private String dataset = null;

  @JsonProperty("motivation") @Builder.Default
  private String motivation = null;

  @JsonProperty("preProcessing") @Builder.Default
  @Valid
  private List<String> preProcessing = null;

  public BaseData dataset(String dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * What dataset were used in the MLModel?
   * @return dataset
   **/
  @Schema(required = true, description = "What dataset were used in the MLModel?")
      @NotNull

    public String getDataset() {
    return dataset;
  }

  public void setDataset(String dataset) {
    this.dataset = dataset;
  }

  public BaseData motivation(String motivation) {
    this.motivation = motivation;
    return this;
  }

  /**
   * Why was this dataset chosen?
   * @return motivation
   **/
  @Schema(description = "Why was this dataset chosen?")
  
    public String getMotivation() {
    return motivation;
  }

  public void setMotivation(String motivation) {
    this.motivation = motivation;
  }

  public BaseData preProcessing(List<String> preProcessing) {
    this.preProcessing = preProcessing;
    return this;
  }

  public BaseData addPreProcessingItem(String preProcessingItem) {
    if (this.preProcessing == null) {
      this.preProcessing = new ArrayList<>();
    }
    this.preProcessing.add(preProcessingItem);
    return this;
  }

  /**
   * How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?
   * @return preProcessing
   **/
  @Schema(description = "How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?")
  
    public List<String> getPreProcessing() {
    return preProcessing;
  }

  public void setPreProcessing(List<String> preProcessing) {
    this.preProcessing = preProcessing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseData baseData = (BaseData) o;
    return Objects.equals(this.dataset, baseData.dataset) &&
        Objects.equals(this.motivation, baseData.motivation) &&
        Objects.equals(this.preProcessing, baseData.preProcessing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataset, motivation, preProcessing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseData {\n");
    
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    motivation: ").append(toIndentedString(motivation)).append("\n");
    sb.append("    preProcessing: ").append(toIndentedString(preProcessing)).append("\n");
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