package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.VersionSetKeyAspectResponseV2;
import io.datahubproject.openapi.generated.VersionSetPropertiesAspectResponseV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * VersionSet object.
 */
@Schema(description = "VersionSet object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VersionSetEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("versionSetKey") @Builder.Default
  private VersionSetKeyAspectResponseV2 versionSetKey = null;

  @JsonProperty("versionSetProperties") @Builder.Default
  private VersionSetPropertiesAspectResponseV2 versionSetProperties = null;

  public VersionSetEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for versionSet
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for versionSet")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public VersionSetEntityResponseV2 versionSetKey(VersionSetKeyAspectResponseV2 versionSetKey) {
    this.versionSetKey = versionSetKey;
    return this;
  }

  /**
   * Get versionSetKey
   * @return versionSetKey
   **/
  @Schema(description = "")
  
    @Valid
    public VersionSetKeyAspectResponseV2 getVersionSetKey() {
    return versionSetKey;
  }

  public void setVersionSetKey(VersionSetKeyAspectResponseV2 versionSetKey) {
    this.versionSetKey = versionSetKey;
  }

  public VersionSetEntityResponseV2 versionSetProperties(VersionSetPropertiesAspectResponseV2 versionSetProperties) {
    this.versionSetProperties = versionSetProperties;
    return this;
  }

  /**
   * Get versionSetProperties
   * @return versionSetProperties
   **/
  @Schema(description = "")
  
    @Valid
    public VersionSetPropertiesAspectResponseV2 getVersionSetProperties() {
    return versionSetProperties;
  }

  public void setVersionSetProperties(VersionSetPropertiesAspectResponseV2 versionSetProperties) {
    this.versionSetProperties = versionSetProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionSetEntityResponseV2 versionSetEntityResponseV2 = (VersionSetEntityResponseV2) o;
    return Objects.equals(this.urn, versionSetEntityResponseV2.urn) &&
        Objects.equals(this.versionSetKey, versionSetEntityResponseV2.versionSetKey) &&
        Objects.equals(this.versionSetProperties, versionSetEntityResponseV2.versionSetProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, versionSetKey, versionSetProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionSetEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    versionSetKey: ").append(toIndentedString(versionSetKey)).append("\n");
    sb.append("    versionSetProperties: ").append(toIndentedString(versionSetProperties)).append("\n");
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