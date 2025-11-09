package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.SystemMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Kafka event for recording a historical version upgrade. Used for backwards incompatible changes to infrastructure that requires infrastructure level blocking changes.
 */
@Schema(description = "Kafka event for recording a historical version upgrade. Used for backwards incompatible changes to infrastructure that requires infrastructure level blocking changes.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubUpgradeHistoryEvent   {

  @JsonProperty("version") @Builder.Default
  private String version = null;

  @JsonProperty("systemMetadata") @Builder.Default
  private SystemMetadata systemMetadata = null;

  public DataHubUpgradeHistoryEvent version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the upgrade
   * @return version
   **/
  @Schema(required = true, description = "Version of the upgrade")
      @NotNull

    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public DataHubUpgradeHistoryEvent systemMetadata(SystemMetadata systemMetadata) {
    this.systemMetadata = systemMetadata;
    return this;
  }

  /**
   * Get systemMetadata
   * @return systemMetadata
   **/
  @Schema(description = "")
  
    @Valid
    public SystemMetadata getSystemMetadata() {
    return systemMetadata;
  }

  public void setSystemMetadata(SystemMetadata systemMetadata) {
    this.systemMetadata = systemMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubUpgradeHistoryEvent dataHubUpgradeHistoryEvent = (DataHubUpgradeHistoryEvent) o;
    return Objects.equals(this.version, dataHubUpgradeHistoryEvent.version) &&
        Objects.equals(this.systemMetadata, dataHubUpgradeHistoryEvent.systemMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, systemMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubUpgradeHistoryEvent {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    systemMetadata: ").append(toIndentedString(systemMetadata)).append("\n");
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