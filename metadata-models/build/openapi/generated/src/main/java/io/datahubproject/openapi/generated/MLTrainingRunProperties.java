package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.MLHyperParam;
import io.datahubproject.openapi.generated.MLMetric;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * The inputs and outputs of this training run
 */
@Schema(description = "The inputs and outputs of this training run")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLTrainingRunProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MLTrainingRunProperties") @Builder.Default
  private String __type = "MLTrainingRunProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MLTrainingRunProperties"},
  defaultValue = "MLTrainingRunProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("externalUrl") @Builder.Default
  private String externalUrl = null;

  @JsonProperty("id") @Builder.Default
  private String id = null;

  @JsonProperty("outputUrls") @Builder.Default
  @Valid
  private List<String> outputUrls = null;

  @JsonProperty("hyperParams") @Builder.Default
  @Valid
  private List<MLHyperParam> hyperParams = null;

  @JsonProperty("trainingMetrics") @Builder.Default
  @Valid
  private List<MLMetric> trainingMetrics = null;

  public MLTrainingRunProperties customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public MLTrainingRunProperties putCustomPropertiesItem(String key, String customPropertiesItem) {
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

  /**
   * Custom property bag.
   * @return customProperties
   **/
  @Schema(required = true, description = "Custom property bag.")
      @NotNull

    public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public MLTrainingRunProperties externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

  /**
   * URL where the reference exist
   * @return externalUrl
   **/
  @Schema(description = "URL where the reference exist")
  
    public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public MLTrainingRunProperties id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Run Id of the ML Training Run
   * @return id
   **/
  @Schema(description = "Run Id of the ML Training Run")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MLTrainingRunProperties outputUrls(List<String> outputUrls) {
    this.outputUrls = outputUrls;
    return this;
  }

  public MLTrainingRunProperties addOutputUrlsItem(String outputUrlsItem) {
    if (this.outputUrls == null) {
      this.outputUrls = new ArrayList<>();
    }
    this.outputUrls.add(outputUrlsItem);
    return this;
  }

  /**
   * List of URLs for the Outputs of the ML Training Run
   * @return outputUrls
   **/
  @Schema(description = "List of URLs for the Outputs of the ML Training Run")
  
    public List<String> getOutputUrls() {
    return outputUrls;
  }

  public void setOutputUrls(List<String> outputUrls) {
    this.outputUrls = outputUrls;
  }

  public MLTrainingRunProperties hyperParams(List<MLHyperParam> hyperParams) {
    this.hyperParams = hyperParams;
    return this;
  }

  public MLTrainingRunProperties addHyperParamsItem(MLHyperParam hyperParamsItem) {
    if (this.hyperParams == null) {
      this.hyperParams = new ArrayList<>();
    }
    this.hyperParams.add(hyperParamsItem);
    return this;
  }

  /**
   * Hyperparameters of the ML Training Run
   * @return hyperParams
   **/
  @Schema(description = "Hyperparameters of the ML Training Run")
      @Valid
    public List<MLHyperParam> getHyperParams() {
    return hyperParams;
  }

  public void setHyperParams(List<MLHyperParam> hyperParams) {
    this.hyperParams = hyperParams;
  }

  public MLTrainingRunProperties trainingMetrics(List<MLMetric> trainingMetrics) {
    this.trainingMetrics = trainingMetrics;
    return this;
  }

  public MLTrainingRunProperties addTrainingMetricsItem(MLMetric trainingMetricsItem) {
    if (this.trainingMetrics == null) {
      this.trainingMetrics = new ArrayList<>();
    }
    this.trainingMetrics.add(trainingMetricsItem);
    return this;
  }

  /**
   * Metrics of the ML Training Run
   * @return trainingMetrics
   **/
  @Schema(description = "Metrics of the ML Training Run")
      @Valid
    public List<MLMetric> getTrainingMetrics() {
    return trainingMetrics;
  }

  public void setTrainingMetrics(List<MLMetric> trainingMetrics) {
    this.trainingMetrics = trainingMetrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLTrainingRunProperties mlTrainingRunProperties = (MLTrainingRunProperties) o;
    return Objects.equals(this.customProperties, mlTrainingRunProperties.customProperties) &&
        Objects.equals(this.externalUrl, mlTrainingRunProperties.externalUrl) &&
        Objects.equals(this.id, mlTrainingRunProperties.id) &&
        Objects.equals(this.outputUrls, mlTrainingRunProperties.outputUrls) &&
        Objects.equals(this.hyperParams, mlTrainingRunProperties.hyperParams) &&
        Objects.equals(this.trainingMetrics, mlTrainingRunProperties.trainingMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, externalUrl, id, outputUrls, hyperParams, trainingMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLTrainingRunProperties {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    outputUrls: ").append(toIndentedString(outputUrls)).append("\n");
    sb.append("    hyperParams: ").append(toIndentedString(hyperParams)).append("\n");
    sb.append("    trainingMetrics: ").append(toIndentedString(trainingMetrics)).append("\n");
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