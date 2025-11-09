package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
/**
 * DataHubIngestionSourceConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubIngestionSourceConfig   {

  @JsonProperty("recipe") @Builder.Default
  private String recipe = null;

  @JsonProperty("version") @Builder.Default
  private String version = null;

  @JsonProperty("executorId") @Builder.Default
  private String executorId = null;

  @JsonProperty("debugMode") @Builder.Default
  private Boolean debugMode = null;

  @JsonProperty("extraArgs") @Builder.Default
  @Valid
  private Map<String, String> extraArgs = null;

  public DataHubIngestionSourceConfig recipe(String recipe) {
    this.recipe = recipe;
    return this;
  }

  /**
   * The JSON recipe to use for ingestion
   * @return recipe
   **/
  @Schema(required = true, description = "The JSON recipe to use for ingestion")
      @NotNull

    public String getRecipe() {
    return recipe;
  }

  public void setRecipe(String recipe) {
    this.recipe = recipe;
  }

  public DataHubIngestionSourceConfig version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The PyPI version of the datahub CLI to use when executing a recipe
   * @return version
   **/
  @Schema(description = "The PyPI version of the datahub CLI to use when executing a recipe")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public DataHubIngestionSourceConfig executorId(String executorId) {
    this.executorId = executorId;
    return this;
  }

  /**
   * The id of the executor to use to execute the ingestion run
   * @return executorId
   **/
  @Schema(description = "The id of the executor to use to execute the ingestion run")
  
    public String getExecutorId() {
    return executorId;
  }

  public void setExecutorId(String executorId) {
    this.executorId = executorId;
  }

  public DataHubIngestionSourceConfig debugMode(Boolean debugMode) {
    this.debugMode = debugMode;
    return this;
  }

  /**
   * Whether or not to run this ingestion source in debug mode
   * @return debugMode
   **/
  @Schema(description = "Whether or not to run this ingestion source in debug mode")
  
    public Boolean isDebugMode() {
    return debugMode;
  }

  public void setDebugMode(Boolean debugMode) {
    this.debugMode = debugMode;
  }

  public DataHubIngestionSourceConfig extraArgs(Map<String, String> extraArgs) {
    this.extraArgs = extraArgs;
    return this;
  }

  public DataHubIngestionSourceConfig putExtraArgsItem(String key, String extraArgsItem) {
    if (this.extraArgs == null) {
      this.extraArgs = new HashMap<>();
    }
    this.extraArgs.put(key, extraArgsItem);
    return this;
  }

  /**
   * Extra arguments for the ingestion run.
   * @return extraArgs
   **/
  @Schema(description = "Extra arguments for the ingestion run.")
  
    public Map<String, String> getExtraArgs() {
    return extraArgs;
  }

  public void setExtraArgs(Map<String, String> extraArgs) {
    this.extraArgs = extraArgs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubIngestionSourceConfig dataHubIngestionSourceConfig = (DataHubIngestionSourceConfig) o;
    return Objects.equals(this.recipe, dataHubIngestionSourceConfig.recipe) &&
        Objects.equals(this.version, dataHubIngestionSourceConfig.version) &&
        Objects.equals(this.executorId, dataHubIngestionSourceConfig.executorId) &&
        Objects.equals(this.debugMode, dataHubIngestionSourceConfig.debugMode) &&
        Objects.equals(this.extraArgs, dataHubIngestionSourceConfig.extraArgs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipe, version, executorId, debugMode, extraArgs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubIngestionSourceConfig {\n");
    
    sb.append("    recipe: ").append(toIndentedString(recipe)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    executorId: ").append(toIndentedString(executorId)).append("\n");
    sb.append("    debugMode: ").append(toIndentedString(debugMode)).append("\n");
    sb.append("    extraArgs: ").append(toIndentedString(extraArgs)).append("\n");
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