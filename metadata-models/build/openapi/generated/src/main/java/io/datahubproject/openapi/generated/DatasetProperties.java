package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.TimeStamp;
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
 * Properties associated with a Dataset
 */
@Schema(description = "Properties associated with a Dataset")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatasetProperties  implements OneOfDatasetSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DatasetProperties") @Builder.Default
  private String __type = "DatasetProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DatasetProperties"},
  defaultValue = "DatasetProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("externalUrl") @Builder.Default
  private String externalUrl = null;

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("qualifiedName") @Builder.Default
  private String qualifiedName = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("uri") @Builder.Default
  private String uri = null;

  @JsonProperty("created") @Builder.Default
  private TimeStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private TimeStamp lastModified = null;

  @JsonProperty("tags") @Builder.Default
  @Valid
  private List<String> tags = new ArrayList<>();

  public DatasetProperties customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public DatasetProperties putCustomPropertiesItem(String key, String customPropertiesItem) {
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

  public DatasetProperties externalUrl(String externalUrl) {
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

  public DatasetProperties name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the Dataset
   * @return name
   **/
  @Schema(description = "Display name of the Dataset")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DatasetProperties qualifiedName(String qualifiedName) {
    this.qualifiedName = qualifiedName;
    return this;
  }

  /**
   * Fully-qualified name of the Dataset
   * @return qualifiedName
   **/
  @Schema(description = "Fully-qualified name of the Dataset")
  
    public String getQualifiedName() {
    return qualifiedName;
  }

  public void setQualifiedName(String qualifiedName) {
    this.qualifiedName = qualifiedName;
  }

  public DatasetProperties description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Documentation of the dataset
   * @return description
   **/
  @Schema(description = "Documentation of the dataset")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DatasetProperties uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * The abstracted URI such as hdfs:///data/tracking/PageViewEvent, file:///dir/file_name. Uri should not include any environment specific properties. Some datasets might not have a standardized uri, which makes this field optional (i.e. kafka topic).
   * @return uri
   **/
  @Schema(description = "The abstracted URI such as hdfs:///data/tracking/PageViewEvent, file:///dir/file_name. Uri should not include any environment specific properties. Some datasets might not have a standardized uri, which makes this field optional (i.e. kafka topic).")
  
    public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public DatasetProperties created(TimeStamp created) {
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

  public DatasetProperties lastModified(TimeStamp lastModified) {
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

  public DatasetProperties tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DatasetProperties addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * [Legacy] Unstructured tags for the dataset. Structured tags can be applied via the `GlobalTags` aspect. This is now deprecated.
   * @return tags
   **/
  @Schema(required = true, description = "[Legacy] Unstructured tags for the dataset. Structured tags can be applied via the `GlobalTags` aspect. This is now deprecated.")
      @NotNull

    public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetProperties datasetProperties = (DatasetProperties) o;
    return Objects.equals(this.customProperties, datasetProperties.customProperties) &&
        Objects.equals(this.externalUrl, datasetProperties.externalUrl) &&
        Objects.equals(this.name, datasetProperties.name) &&
        Objects.equals(this.qualifiedName, datasetProperties.qualifiedName) &&
        Objects.equals(this.description, datasetProperties.description) &&
        Objects.equals(this.uri, datasetProperties.uri) &&
        Objects.equals(this.created, datasetProperties.created) &&
        Objects.equals(this.lastModified, datasetProperties.lastModified) &&
        Objects.equals(this.tags, datasetProperties.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, externalUrl, name, qualifiedName, description, uri, created, lastModified, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetProperties {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    qualifiedName: ").append(toIndentedString(qualifiedName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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