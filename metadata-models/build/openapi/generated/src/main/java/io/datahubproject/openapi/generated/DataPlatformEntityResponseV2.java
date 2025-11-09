package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataPlatformInfoAspectResponseV2;
import io.datahubproject.openapi.generated.DataPlatformKeyAspectResponseV2;
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
public class DataPlatformEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("dataPlatformKey") @Builder.Default
  private DataPlatformKeyAspectResponseV2 dataPlatformKey = null;

  @JsonProperty("dataPlatformInfo") @Builder.Default
  private DataPlatformInfoAspectResponseV2 dataPlatformInfo = null;

  public DataPlatformEntityResponseV2 urn(String urn) {
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

  public DataPlatformEntityResponseV2 dataPlatformKey(DataPlatformKeyAspectResponseV2 dataPlatformKey) {
    this.dataPlatformKey = dataPlatformKey;
    return this;
  }

  /**
   * Get dataPlatformKey
   * @return dataPlatformKey
   **/
  @Schema(description = "")
  
    @Valid
    public DataPlatformKeyAspectResponseV2 getDataPlatformKey() {
    return dataPlatformKey;
  }

  public void setDataPlatformKey(DataPlatformKeyAspectResponseV2 dataPlatformKey) {
    this.dataPlatformKey = dataPlatformKey;
  }

  public DataPlatformEntityResponseV2 dataPlatformInfo(DataPlatformInfoAspectResponseV2 dataPlatformInfo) {
    this.dataPlatformInfo = dataPlatformInfo;
    return this;
  }

  /**
   * Get dataPlatformInfo
   * @return dataPlatformInfo
   **/
  @Schema(description = "")
  
    @Valid
    public DataPlatformInfoAspectResponseV2 getDataPlatformInfo() {
    return dataPlatformInfo;
  }

  public void setDataPlatformInfo(DataPlatformInfoAspectResponseV2 dataPlatformInfo) {
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
    DataPlatformEntityResponseV2 dataPlatformEntityResponseV2 = (DataPlatformEntityResponseV2) o;
    return Objects.equals(this.urn, dataPlatformEntityResponseV2.urn) &&
        Objects.equals(this.dataPlatformKey, dataPlatformEntityResponseV2.dataPlatformKey) &&
        Objects.equals(this.dataPlatformInfo, dataPlatformEntityResponseV2.dataPlatformInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, dataPlatformKey, dataPlatformInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataPlatformEntityResponseV2 {\n");
    
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