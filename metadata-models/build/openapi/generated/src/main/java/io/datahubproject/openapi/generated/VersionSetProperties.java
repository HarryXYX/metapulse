package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.VersioningScheme;
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
 * VersionSetProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VersionSetProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "VersionSetProperties") @Builder.Default
  private String __type = "VersionSetProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"VersionSetProperties"},
  defaultValue = "VersionSetProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("latest") @Builder.Default
  private String latest = null;

  @JsonProperty("versioningScheme") @Builder.Default
  private VersioningScheme versioningScheme = null;

  public VersionSetProperties customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public VersionSetProperties putCustomPropertiesItem(String key, String customPropertiesItem) {
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

  public VersionSetProperties latest(String latest) {
    this.latest = latest;
    return this;
  }

  /**
   * The latest versioned entity linked to in this version set
   * @return latest
   **/
  @Schema(required = true, description = "The latest versioned entity linked to in this version set")
      @NotNull

    public String getLatest() {
    return latest;
  }

  public void setLatest(String latest) {
    this.latest = latest;
  }

  public VersionSetProperties versioningScheme(VersioningScheme versioningScheme) {
    this.versioningScheme = versioningScheme;
    return this;
  }

  /**
   * Get versioningScheme
   * @return versioningScheme
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public VersioningScheme getVersioningScheme() {
    return versioningScheme;
  }

  public void setVersioningScheme(VersioningScheme versioningScheme) {
    this.versioningScheme = versioningScheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionSetProperties versionSetProperties = (VersionSetProperties) o;
    return Objects.equals(this.customProperties, versionSetProperties.customProperties) &&
        Objects.equals(this.latest, versionSetProperties.latest) &&
        Objects.equals(this.versioningScheme, versionSetProperties.versioningScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, latest, versioningScheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionSetProperties {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    versioningScheme: ").append(toIndentedString(versioningScheme)).append("\n");
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