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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Information collected when kicking off a DataHubUpgrade
 */
@Schema(description = "Information collected when kicking off a DataHubUpgrade")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubUpgradeRequest  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubUpgradeRequest") @Builder.Default
  private String __type = "DataHubUpgradeRequest";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubUpgradeRequest"},
  defaultValue = "DataHubUpgradeRequest")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("timestampMs") @Builder.Default
  private Long timestampMs = null;

  @JsonProperty("version") @Builder.Default
  private String version = null;

  public DataHubUpgradeRequest timestampMs(Long timestampMs) {
    this.timestampMs = timestampMs;
    return this;
  }

  /**
   * Timestamp when we started this DataHubUpgrade
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return timestampMs
   **/
  @Schema(required = true, description = "Timestamp when we started this DataHubUpgrade")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getTimestampMs() {
    return timestampMs;
  }

  public void setTimestampMs(Long timestampMs) {
    this.timestampMs = timestampMs;
  }

  public DataHubUpgradeRequest version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of this upgrade
   * @return version
   **/
  @Schema(required = true, description = "Version of this upgrade")
      @NotNull

    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
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
    DataHubUpgradeRequest dataHubUpgradeRequest = (DataHubUpgradeRequest) o;
    return Objects.equals(this.timestampMs, dataHubUpgradeRequest.timestampMs) &&
        Objects.equals(this.version, dataHubUpgradeRequest.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestampMs, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubUpgradeRequest {\n");
    
    sb.append("    timestampMs: ").append(toIndentedString(timestampMs)).append("\n");
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