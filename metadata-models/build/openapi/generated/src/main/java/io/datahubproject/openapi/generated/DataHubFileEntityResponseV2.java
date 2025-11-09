package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataHubFileInfoAspectResponseV2;
import io.datahubproject.openapi.generated.DataHubFileKeyAspectResponseV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * DataHubFile object.
 */
@Schema(description = "DataHubFile object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubFileEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("dataHubFileKey") @Builder.Default
  private DataHubFileKeyAspectResponseV2 dataHubFileKey = null;

  @JsonProperty("dataHubFileInfo") @Builder.Default
  private DataHubFileInfoAspectResponseV2 dataHubFileInfo = null;

  public DataHubFileEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for dataHubFile
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for dataHubFile")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public DataHubFileEntityResponseV2 dataHubFileKey(DataHubFileKeyAspectResponseV2 dataHubFileKey) {
    this.dataHubFileKey = dataHubFileKey;
    return this;
  }

  /**
   * Get dataHubFileKey
   * @return dataHubFileKey
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubFileKeyAspectResponseV2 getDataHubFileKey() {
    return dataHubFileKey;
  }

  public void setDataHubFileKey(DataHubFileKeyAspectResponseV2 dataHubFileKey) {
    this.dataHubFileKey = dataHubFileKey;
  }

  public DataHubFileEntityResponseV2 dataHubFileInfo(DataHubFileInfoAspectResponseV2 dataHubFileInfo) {
    this.dataHubFileInfo = dataHubFileInfo;
    return this;
  }

  /**
   * Get dataHubFileInfo
   * @return dataHubFileInfo
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubFileInfoAspectResponseV2 getDataHubFileInfo() {
    return dataHubFileInfo;
  }

  public void setDataHubFileInfo(DataHubFileInfoAspectResponseV2 dataHubFileInfo) {
    this.dataHubFileInfo = dataHubFileInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubFileEntityResponseV2 dataHubFileEntityResponseV2 = (DataHubFileEntityResponseV2) o;
    return Objects.equals(this.urn, dataHubFileEntityResponseV2.urn) &&
        Objects.equals(this.dataHubFileKey, dataHubFileEntityResponseV2.dataHubFileKey) &&
        Objects.equals(this.dataHubFileInfo, dataHubFileEntityResponseV2.dataHubFileInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, dataHubFileKey, dataHubFileInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubFileEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    dataHubFileKey: ").append(toIndentedString(dataHubFileKey)).append("\n");
    sb.append("    dataHubFileInfo: ").append(toIndentedString(dataHubFileInfo)).append("\n");
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