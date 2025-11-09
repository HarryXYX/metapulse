package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataPlatformInfoAspectRequestV2;
import io.datahubproject.openapi.generated.DataPlatformKeyAspectRequestV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * DataPlatform object.
 */
@Schema(description = "DataPlatform object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataPlatformEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("dataPlatformKey") @Builder.Default
  private DataPlatformKeyAspectRequestV2 dataPlatformKey = null;

  @JsonProperty("dataPlatformInfo") @Builder.Default
  private DataPlatformInfoAspectRequestV2 dataPlatformInfo = null;

  public DataPlatformEntityRequestV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for dataPlatform
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for dataPlatform")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public DataPlatformEntityRequestV2 dataPlatformKey(DataPlatformKeyAspectRequestV2 dataPlatformKey) {
    this.dataPlatformKey = dataPlatformKey;
    return this;
  }

  /**
   * Get dataPlatformKey
   * @return dataPlatformKey
   **/
  @Schema(description = "")
  
    @Valid
    public DataPlatformKeyAspectRequestV2 getDataPlatformKey() {
    return dataPlatformKey;
  }

  public void setDataPlatformKey(DataPlatformKeyAspectRequestV2 dataPlatformKey) {
    this.dataPlatformKey = dataPlatformKey;
  }

  public DataPlatformEntityRequestV2 dataPlatformInfo(DataPlatformInfoAspectRequestV2 dataPlatformInfo) {
    this.dataPlatformInfo = dataPlatformInfo;
    return this;
  }

  /**
   * Get dataPlatformInfo
   * @return dataPlatformInfo
   **/
  @Schema(description = "")
  
    @Valid
    public DataPlatformInfoAspectRequestV2 getDataPlatformInfo() {
    return dataPlatformInfo;
  }

  public void setDataPlatformInfo(DataPlatformInfoAspectRequestV2 dataPlatformInfo) {
    this.dataPlatformInfo = dataPlatformInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataPlatformEntityRequestV2 dataPlatformEntityRequestV2 = (DataPlatformEntityRequestV2) o;
    return Objects.equals(this.urn, dataPlatformEntityRequestV2.urn) &&
        Objects.equals(this.dataPlatformKey, dataPlatformEntityRequestV2.dataPlatformKey) &&
        Objects.equals(this.dataPlatformInfo, dataPlatformEntityRequestV2.dataPlatformInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, dataPlatformKey, dataPlatformInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataPlatformEntityRequestV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    dataPlatformKey: ").append(toIndentedString(dataPlatformKey)).append("\n");
    sb.append("    dataPlatformInfo: ").append(toIndentedString(dataPlatformInfo)).append("\n");
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