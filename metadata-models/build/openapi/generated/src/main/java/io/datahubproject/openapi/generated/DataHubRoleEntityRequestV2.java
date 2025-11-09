package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataHubRoleInfoAspectRequestV2;
import io.datahubproject.openapi.generated.DataHubRoleKeyAspectRequestV2;
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
public class DataHubRoleEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("dataHubRoleKey") @Builder.Default
  private DataHubRoleKeyAspectRequestV2 dataHubRoleKey = null;

  @JsonProperty("dataHubRoleInfo") @Builder.Default
  private DataHubRoleInfoAspectRequestV2 dataHubRoleInfo = null;

  public DataHubRoleEntityRequestV2 urn(String urn) {
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

  public DataHubRoleEntityRequestV2 dataHubRoleKey(DataHubRoleKeyAspectRequestV2 dataHubRoleKey) {
    this.dataHubRoleKey = dataHubRoleKey;
    return this;
  }

  /**
   * Get dataHubRoleKey
   * @return dataHubRoleKey
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubRoleKeyAspectRequestV2 getDataHubRoleKey() {
    return dataHubRoleKey;
  }

  public void setDataHubRoleKey(DataHubRoleKeyAspectRequestV2 dataHubRoleKey) {
    this.dataHubRoleKey = dataHubRoleKey;
  }

  public DataHubRoleEntityRequestV2 dataHubRoleInfo(DataHubRoleInfoAspectRequestV2 dataHubRoleInfo) {
    this.dataHubRoleInfo = dataHubRoleInfo;
    return this;
  }

  /**
   * Get dataHubRoleInfo
   * @return dataHubRoleInfo
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubRoleInfoAspectRequestV2 getDataHubRoleInfo() {
    return dataHubRoleInfo;
  }

  public void setDataHubRoleInfo(DataHubRoleInfoAspectRequestV2 dataHubRoleInfo) {
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
    DataHubRoleEntityRequestV2 dataHubRoleEntityRequestV2 = (DataHubRoleEntityRequestV2) o;
    return Objects.equals(this.urn, dataHubRoleEntityRequestV2.urn) &&
        Objects.equals(this.dataHubRoleKey, dataHubRoleEntityRequestV2.dataHubRoleKey) &&
        Objects.equals(this.dataHubRoleInfo, dataHubRoleEntityRequestV2.dataHubRoleInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, dataHubRoleKey, dataHubRoleInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubRoleEntityRequestV2 {\n");
    
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