package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataHubRoleInfoAspectResponseV2;
import io.datahubproject.openapi.generated.DataHubRoleKeyAspectResponseV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * DataHubRole object.
 */
@Schema(description = "DataHubRole object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubRoleEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("dataHubRoleKey") @Builder.Default
  private DataHubRoleKeyAspectResponseV2 dataHubRoleKey = null;

  @JsonProperty("dataHubRoleInfo") @Builder.Default
  private DataHubRoleInfoAspectResponseV2 dataHubRoleInfo = null;

  public DataHubRoleEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for dataHubRole
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for dataHubRole")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public DataHubRoleEntityResponseV2 dataHubRoleKey(DataHubRoleKeyAspectResponseV2 dataHubRoleKey) {
    this.dataHubRoleKey = dataHubRoleKey;
    return this;
  }

  /**
   * Get dataHubRoleKey
   * @return dataHubRoleKey
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubRoleKeyAspectResponseV2 getDataHubRoleKey() {
    return dataHubRoleKey;
  }

  public void setDataHubRoleKey(DataHubRoleKeyAspectResponseV2 dataHubRoleKey) {
    this.dataHubRoleKey = dataHubRoleKey;
  }

  public DataHubRoleEntityResponseV2 dataHubRoleInfo(DataHubRoleInfoAspectResponseV2 dataHubRoleInfo) {
    this.dataHubRoleInfo = dataHubRoleInfo;
    return this;
  }

  /**
   * Get dataHubRoleInfo
   * @return dataHubRoleInfo
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubRoleInfoAspectResponseV2 getDataHubRoleInfo() {
    return dataHubRoleInfo;
  }

  public void setDataHubRoleInfo(DataHubRoleInfoAspectResponseV2 dataHubRoleInfo) {
    this.dataHubRoleInfo = dataHubRoleInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubRoleEntityResponseV2 dataHubRoleEntityResponseV2 = (DataHubRoleEntityResponseV2) o;
    return Objects.equals(this.urn, dataHubRoleEntityResponseV2.urn) &&
        Objects.equals(this.dataHubRoleKey, dataHubRoleEntityResponseV2.dataHubRoleKey) &&
        Objects.equals(this.dataHubRoleInfo, dataHubRoleEntityResponseV2.dataHubRoleInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, dataHubRoleKey, dataHubRoleInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubRoleEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    dataHubRoleKey: ").append(toIndentedString(dataHubRoleKey)).append("\n");
    sb.append("    dataHubRoleInfo: ").append(toIndentedString(dataHubRoleInfo)).append("\n");
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