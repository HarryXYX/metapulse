package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * ApplicationsSettings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationsSettings   {

  @JsonProperty("enabled") @Builder.Default
  private Boolean enabled = null;

  @JsonProperty("config") @Builder.Default
  private String config = null;

  @JsonProperty("configVersion") @Builder.Default
  private String configVersion = null;

  public ApplicationsSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ApplicationsSettings config(String config) {
    this.config = config;
    return this;
  }

  /**
   * The configuration for the feature, in JSON format.
   * @return config
   **/
  @Schema(description = "The configuration for the feature, in JSON format.")
  
    public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }

  public ApplicationsSettings configVersion(String configVersion) {
    this.configVersion = configVersion;
    return this;
  }

  /**
   * The version of the configuration schema that has been used to serialize        the config. If not provided, the version is assumed to be the latest version.
   * @return configVersion
   **/
  @Schema(description = "The version of the configuration schema that has been used to serialize        the config. If not provided, the version is assumed to be the latest version.")
  
    public String getConfigVersion() {
    return configVersion;
  }

  public void setConfigVersion(String configVersion) {
    this.configVersion = configVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationsSettings applicationsSettings = (ApplicationsSettings) o;
    return Objects.equals(this.enabled, applicationsSettings.enabled) &&
        Objects.equals(this.config, applicationsSettings.config) &&
        Objects.equals(this.configVersion, applicationsSettings.configVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, config, configVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationsSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    configVersion: ").append(toIndentedString(configVersion)).append("\n");
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