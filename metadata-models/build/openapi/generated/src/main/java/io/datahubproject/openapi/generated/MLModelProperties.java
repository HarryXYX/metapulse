package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.MLHyperParam;
import io.datahubproject.openapi.generated.MLMetric;
import io.datahubproject.openapi.generated.TimeStamp;
import io.datahubproject.openapi.generated.VersionTag;
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
 * Properties associated with a ML Model
 */
@Schema(description = "Properties associated with a ML Model")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLModelProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfMLModelSnapshotAspectsItems, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MLModelProperties") @Builder.Default
  private String __type = "MLModelProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MLModelProperties"},
  defaultValue = "MLModelProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("externalUrl") @Builder.Default
  private String externalUrl = null;

  @JsonProperty("trainingJobs") @Builder.Default
  @Valid
  private List<String> trainingJobs = null;

  @JsonProperty("downstreamJobs") @Builder.Default
  @Valid
  private List<String> downstreamJobs = null;

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("date") @Builder.Default
  private Long date = null;

  @JsonProperty("created") @Builder.Default
  private TimeStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private TimeStamp lastModified = null;

  @JsonProperty("version") @Builder.Default
  private VersionTag version = null;

  @JsonProperty("type") @Builder.Default
  private String type = null;

  @JsonProperty("hyperParameters") @Builder.Default
  @Valid
  private Map<String, String> hyperParameters = null;

  @JsonProperty("hyperParams") @Builder.Default
  @Valid
  private List<MLHyperParam> hyperParams = null;

  @JsonProperty("trainingMetrics") @Builder.Default
  @Valid
  private List<MLMetric> trainingMetrics = null;

  @JsonProperty("onlineMetrics") @Builder.Default
  @Valid
  private List<MLMetric> onlineMetrics = null;

  @JsonProperty("mlFeatures") @Builder.Default
  @Valid
  private List<String> mlFeatures = null;

  @JsonProperty("tags") @Builder.Default
  @Valid
  private List<String> tags = new ArrayList<>();

  @JsonProperty("deployments") @Builder.Default
  @Valid
  private List<String> deployments = null;

  @JsonProperty("groups") @Builder.Default
  @Valid
  private List<String> groups = null;

  public MLModelProperties customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public MLModelProperties putCustomPropertiesItem(String key, String customPropertiesItem) {
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

  public MLModelProperties externalUrl(String externalUrl) {
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

  public MLModelProperties trainingJobs(List<String> trainingJobs) {
    this.trainingJobs = trainingJobs;
    return this;
  }

  public MLModelProperties addTrainingJobsItem(String trainingJobsItem) {
    if (this.trainingJobs == null) {
      this.trainingJobs = new ArrayList<>();
    }
    this.trainingJobs.add(trainingJobsItem);
    return this;
  }

  /**
   * List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.
   * @return trainingJobs
   **/
  @Schema(description = "List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.")
  
    public List<String> getTrainingJobs() {
    return trainingJobs;
  }

  public void setTrainingJobs(List<String> trainingJobs) {
    this.trainingJobs = trainingJobs;
  }

  public MLModelProperties downstreamJobs(List<String> downstreamJobs) {
    this.downstreamJobs = downstreamJobs;
    return this;
  }

  public MLModelProperties addDownstreamJobsItem(String downstreamJobsItem) {
    if (this.downstreamJobs == null) {
      this.downstreamJobs = new ArrayList<>();
    }
    this.downstreamJobs.add(downstreamJobsItem);
    return this;
  }

  /**
   * List of jobs or process instances (if any) that use the model or group.
   * @return downstreamJobs
   **/
  @Schema(description = "List of jobs or process instances (if any) that use the model or group.")
  
    public List<String> getDownstreamJobs() {
    return downstreamJobs;
  }

  public void setDownstreamJobs(List<String> downstreamJobs) {
    this.downstreamJobs = downstreamJobs;
  }

  public MLModelProperties name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the MLModel
   * @return name
   **/
  @Schema(description = "Display name of the MLModel")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MLModelProperties description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Documentation of the MLModel
   * @return description
   **/
  @Schema(description = "Documentation of the MLModel")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MLModelProperties date(Long date) {
    this.date = date;
    return this;
  }

  /**
   * Date when the MLModel was developed
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return date
   **/
  @Schema(description = "Date when the MLModel was developed")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public MLModelProperties created(TimeStamp created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @Schema(description = "")
  
    @Valid
    public TimeStamp getCreated() {
    return created;
  }

  public void setCreated(TimeStamp created) {
    this.created = created;
  }

  public MLModelProperties lastModified(TimeStamp lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   **/
  @Schema(description = "")
  
    @Valid
    public TimeStamp getLastModified() {
    return lastModified;
  }

  public void setLastModified(TimeStamp lastModified) {
    this.lastModified = lastModified;
  }

  public MLModelProperties version(VersionTag version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @Schema(description = "")
  
    @Valid
    public VersionTag getVersion() {
    return version;
  }

  public void setVersion(VersionTag version) {
    this.version = version;
  }

  public MLModelProperties type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of Algorithm or MLModel such as whether it is a Naive Bayes classifier, Convolutional Neural Network, etc
   * @return type
   **/
  @Schema(description = "Type of Algorithm or MLModel such as whether it is a Naive Bayes classifier, Convolutional Neural Network, etc")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MLModelProperties hyperParameters(Map<String, String> hyperParameters) {
    this.hyperParameters = hyperParameters;
    return this;
  }

  public MLModelProperties putHyperParametersItem(String key, String hyperParametersItem) {
    if (this.hyperParameters == null) {
      this.hyperParameters = new HashMap<>();
    }
    this.hyperParameters.put(key, hyperParametersItem);
    return this;
  }

  /**
   * Hyper Parameters of the MLModel  NOTE: these are deprecated in favor of hyperParams
   * @return hyperParameters
   **/
  @Schema(description = "Hyper Parameters of the MLModel  NOTE: these are deprecated in favor of hyperParams")
  
    public Map<String, String> getHyperParameters() {
    return hyperParameters;
  }

  public void setHyperParameters(Map<String, String> hyperParameters) {
    this.hyperParameters = hyperParameters;
  }

  public MLModelProperties hyperParams(List<MLHyperParam> hyperParams) {
    this.hyperParams = hyperParams;
    return this;
  }

  public MLModelProperties addHyperParamsItem(MLHyperParam hyperParamsItem) {
    if (this.hyperParams == null) {
      this.hyperParams = new ArrayList<>();
    }
    this.hyperParams.add(hyperParamsItem);
    return this;
  }

  /**
   * Hyperparameters of the MLModel
   * @return hyperParams
   **/
  @Schema(description = "Hyperparameters of the MLModel")
      @Valid
    public List<MLHyperParam> getHyperParams() {
    return hyperParams;
  }

  public void setHyperParams(List<MLHyperParam> hyperParams) {
    this.hyperParams = hyperParams;
  }

  public MLModelProperties trainingMetrics(List<MLMetric> trainingMetrics) {
    this.trainingMetrics = trainingMetrics;
    return this;
  }

  public MLModelProperties addTrainingMetricsItem(MLMetric trainingMetricsItem) {
    if (this.trainingMetrics == null) {
      this.trainingMetrics = new ArrayList<>();
    }
    this.trainingMetrics.add(trainingMetricsItem);
    return this;
  }

  /**
   * Metrics of the MLModel used in training
   * @return trainingMetrics
   **/
  @Schema(description = "Metrics of the MLModel used in training")
      @Valid
    public List<MLMetric> getTrainingMetrics() {
    return trainingMetrics;
  }

  public void setTrainingMetrics(List<MLMetric> trainingMetrics) {
    this.trainingMetrics = trainingMetrics;
  }

  public MLModelProperties onlineMetrics(List<MLMetric> onlineMetrics) {
    this.onlineMetrics = onlineMetrics;
    return this;
  }

  public MLModelProperties addOnlineMetricsItem(MLMetric onlineMetricsItem) {
    if (this.onlineMetrics == null) {
      this.onlineMetrics = new ArrayList<>();
    }
    this.onlineMetrics.add(onlineMetricsItem);
    return this;
  }

  /**
   * Metrics of the MLModel used in production
   * @return onlineMetrics
   **/
  @Schema(description = "Metrics of the MLModel used in production")
      @Valid
    public List<MLMetric> getOnlineMetrics() {
    return onlineMetrics;
  }

  public void setOnlineMetrics(List<MLMetric> onlineMetrics) {
    this.onlineMetrics = onlineMetrics;
  }

  public MLModelProperties mlFeatures(List<String> mlFeatures) {
    this.mlFeatures = mlFeatures;
    return this;
  }

  public MLModelProperties addMlFeaturesItem(String mlFeaturesItem) {
    if (this.mlFeatures == null) {
      this.mlFeatures = new ArrayList<>();
    }
    this.mlFeatures.add(mlFeaturesItem);
    return this;
  }

  /**
   * List of features used for MLModel training
   * @return mlFeatures
   **/
  @Schema(description = "List of features used for MLModel training")
  
    public List<String> getMlFeatures() {
    return mlFeatures;
  }

  public void setMlFeatures(List<String> mlFeatures) {
    this.mlFeatures = mlFeatures;
  }

  public MLModelProperties tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MLModelProperties addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags for the MLModel
   * @return tags
   **/
  @Schema(required = true, description = "Tags for the MLModel")
      @NotNull

    public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public MLModelProperties deployments(List<String> deployments) {
    this.deployments = deployments;
    return this;
  }

  public MLModelProperties addDeploymentsItem(String deploymentsItem) {
    if (this.deployments == null) {
      this.deployments = new ArrayList<>();
    }
    this.deployments.add(deploymentsItem);
    return this;
  }

  /**
   * Deployments for the MLModel
   * @return deployments
   **/
  @Schema(description = "Deployments for the MLModel")
  
    public List<String> getDeployments() {
    return deployments;
  }

  public void setDeployments(List<String> deployments) {
    this.deployments = deployments;
  }

  public MLModelProperties groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public MLModelProperties addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Groups the model belongs to
   * @return groups
   **/
  @Schema(description = "Groups the model belongs to")
  
    public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLModelProperties mlModelProperties = (MLModelProperties) o;
    return Objects.equals(this.customProperties, mlModelProperties.customProperties) &&
        Objects.equals(this.externalUrl, mlModelProperties.externalUrl) &&
        Objects.equals(this.trainingJobs, mlModelProperties.trainingJobs) &&
        Objects.equals(this.downstreamJobs, mlModelProperties.downstreamJobs) &&
        Objects.equals(this.name, mlModelProperties.name) &&
        Objects.equals(this.description, mlModelProperties.description) &&
        Objects.equals(this.date, mlModelProperties.date) &&
        Objects.equals(this.created, mlModelProperties.created) &&
        Objects.equals(this.lastModified, mlModelProperties.lastModified) &&
        Objects.equals(this.version, mlModelProperties.version) &&
        Objects.equals(this.type, mlModelProperties.type) &&
        Objects.equals(this.hyperParameters, mlModelProperties.hyperParameters) &&
        Objects.equals(this.hyperParams, mlModelProperties.hyperParams) &&
        Objects.equals(this.trainingMetrics, mlModelProperties.trainingMetrics) &&
        Objects.equals(this.onlineMetrics, mlModelProperties.onlineMetrics) &&
        Objects.equals(this.mlFeatures, mlModelProperties.mlFeatures) &&
        Objects.equals(this.tags, mlModelProperties.tags) &&
        Objects.equals(this.deployments, mlModelProperties.deployments) &&
        Objects.equals(this.groups, mlModelProperties.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, externalUrl, trainingJobs, downstreamJobs, name, description, date, created, lastModified, version, type, hyperParameters, hyperParams, trainingMetrics, onlineMetrics, mlFeatures, tags, deployments, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLModelProperties {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    trainingJobs: ").append(toIndentedString(trainingJobs)).append("\n");
    sb.append("    downstreamJobs: ").append(toIndentedString(downstreamJobs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hyperParameters: ").append(toIndentedString(hyperParameters)).append("\n");
    sb.append("    hyperParams: ").append(toIndentedString(hyperParams)).append("\n");
    sb.append("    trainingMetrics: ").append(toIndentedString(trainingMetrics)).append("\n");
    sb.append("    onlineMetrics: ").append(toIndentedString(onlineMetrics)).append("\n");
    sb.append("    mlFeatures: ").append(toIndentedString(mlFeatures)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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