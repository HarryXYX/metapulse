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
 * Key to retrieve schema metadata.
 */
@Schema(description = "Key to retrieve schema metadata.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SchemaMetadataKey   {

  @JsonProperty("schemaName") @Builder.Default
  private String schemaName = null;

  @JsonProperty("platform") @Builder.Default
  private String platform = null;

  @JsonProperty("version") @Builder.Default
  private Long version = null;

  public SchemaMetadataKey schemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  /**
   * Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking
   * @return schemaName
   **/
  @Schema(required = true, description = "Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking")
      @NotNull

    public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }

  public SchemaMetadataKey platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})
   * @return platform
   **/
  @Schema(required = true, description = "Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})")
      @NotNull

    public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public SchemaMetadataKey version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return version
   **/
  @Schema(required = true, description = "Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaMetadataKey schemaMetadataKey = (SchemaMetadataKey) o;
    return Objects.equals(this.schemaName, schemaMetadataKey.schemaName) &&
        Objects.equals(this.platform, schemaMetadataKey.platform) &&
        Objects.equals(this.version, schemaMetadataKey.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaName, platform, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaMetadataKey {\n");
    
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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