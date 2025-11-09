package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FabricType;
import io.datahubproject.openapi.generated.TimeStamp;
import io.swagger.v3.oas.annotations.media.Schema;
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
 * Information about a Data processing flow
 */
@Schema(description = "Information about a Data processing flow")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataFlowInfo  implements OneOfDataFlowSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataFlowInfo") @Builder.Default
  private String __type = "DataFlowInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataFlowInfo"},
  defaultValue = "DataFlowInfo")
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

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("project") @Builder.Default
  private String project = null;

  @JsonProperty("created") @Builder.Default
  private TimeStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private TimeStamp lastModified = null;

  @JsonProperty("env") @Builder.Default
  private FabricType env = null;

  public DataFlowInfo customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public DataFlowInfo putCustomPropertiesItem(String key, String customPropertiesItem) {
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

  public DataFlowInfo externalUrl(String externalUrl) {
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

  public DataFlowInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Flow name
   * @return name
   **/
  @Schema(required = true, description = "Flow name")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataFlowInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Flow description
   * @return description
   **/
  @Schema(description = "Flow description")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DataFlowInfo project(String project) {
    this.project = project;
    return this;
  }

  /**
   * Optional project/namespace associated with the flow
   * @return project
   **/
  @Schema(description = "Optional project/namespace associated with the flow")
  
    public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public DataFlowInfo created(TimeStamp created) {
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

  public DataFlowInfo lastModified(TimeStamp lastModified) {
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

  public DataFlowInfo env(FabricType env) {
    this.env = env;
    return this;
  }

  /**
   * Get env
   * @return env
   **/
  @Schema(description = "")
  
    @Valid
    public FabricType getEnv() {
    return env;
  }

  public void setEnv(FabricType env) {
    this.env = env;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataFlowInfo dataFlowInfo = (DataFlowInfo) o;
    return Objects.equals(this.customProperties, dataFlowInfo.customProperties) &&
        Objects.equals(this.externalUrl, dataFlowInfo.externalUrl) &&
        Objects.equals(this.name, dataFlowInfo.name) &&
        Objects.equals(this.description, dataFlowInfo.description) &&
        Objects.equals(this.project, dataFlowInfo.project) &&
        Objects.equals(this.created, dataFlowInfo.created) &&
        Objects.equals(this.lastModified, dataFlowInfo.lastModified) &&
        Objects.equals(this.env, dataFlowInfo.env);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, externalUrl, name, description, project, created, lastModified, env);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFlowInfo {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
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