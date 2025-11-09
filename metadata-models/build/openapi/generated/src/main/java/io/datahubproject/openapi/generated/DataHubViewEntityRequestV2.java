package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataHubViewInfoAspectRequestV2;
import io.datahubproject.openapi.generated.DataHubViewKeyAspectRequestV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * DataHubView object.
 */
@Schema(description = "DataHubView object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubViewEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("dataHubViewKey") @Builder.Default
  private DataHubViewKeyAspectRequestV2 dataHubViewKey = null;

  @JsonProperty("dataHubViewInfo") @Builder.Default
  private DataHubViewInfoAspectRequestV2 dataHubViewInfo = null;

  public DataHubViewEntityRequestV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for dataHubView
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for dataHubView")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public DataHubViewEntityRequestV2 dataHubViewKey(DataHubViewKeyAspectRequestV2 dataHubViewKey) {
    this.dataHubViewKey = dataHubViewKey;
    return this;
  }

  /**
   * Get dataHubViewKey
   * @return dataHubViewKey
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubViewKeyAspectRequestV2 getDataHubViewKey() {
    return dataHubViewKey;
  }

  public void setDataHubViewKey(DataHubViewKeyAspectRequestV2 dataHubViewKey) {
    this.dataHubViewKey = dataHubViewKey;
  }

  public DataHubViewEntityRequestV2 dataHubViewInfo(DataHubViewInfoAspectRequestV2 dataHubViewInfo) {
    this.dataHubViewInfo = dataHubViewInfo;
    return this;
  }

  /**
   * Get dataHubViewInfo
   * @return dataHubViewInfo
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubViewInfoAspectRequestV2 getDataHubViewInfo() {
    return dataHubViewInfo;
  }

  public void setDataHubViewInfo(DataHubViewInfoAspectRequestV2 dataHubViewInfo) {
    this.dataHubViewInfo = dataHubViewInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubViewEntityRequestV2 dataHubViewEntityRequestV2 = (DataHubViewEntityRequestV2) o;
    return Objects.equals(this.urn, dataHubViewEntityRequestV2.urn) &&
        Objects.equals(this.dataHubViewKey, dataHubViewEntityRequestV2.dataHubViewKey) &&
        Objects.equals(this.dataHubViewInfo, dataHubViewEntityRequestV2.dataHubViewInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, dataHubViewKey, dataHubViewInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubViewEntityRequestV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    dataHubViewKey: ").append(toIndentedString(dataHubViewKey)).append("\n");
    sb.append("    dataHubViewInfo: ").append(toIndentedString(dataHubViewInfo)).append("\n");
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