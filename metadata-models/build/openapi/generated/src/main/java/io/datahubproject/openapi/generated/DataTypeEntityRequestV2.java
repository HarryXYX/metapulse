package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataTypeInfoAspectRequestV2;
import io.datahubproject.openapi.generated.DataTypeKeyAspectRequestV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectRequestV2;
import io.datahubproject.openapi.generated.StatusAspectRequestV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * A type of data element stored within DataHub.
 */
@Schema(description = "A type of data element stored within DataHub.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataTypeEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("dataTypeKey") @Builder.Default
  private DataTypeKeyAspectRequestV2 dataTypeKey = null;

  @JsonProperty("dataTypeInfo") @Builder.Default
  private DataTypeInfoAspectRequestV2 dataTypeInfo = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectRequestV2 institutionalMemory = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectRequestV2 status = null;

  public DataTypeEntityRequestV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for dataType
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for dataType")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public DataTypeEntityRequestV2 dataTypeKey(DataTypeKeyAspectRequestV2 dataTypeKey) {
    this.dataTypeKey = dataTypeKey;
    return this;
  }

  /**
   * Get dataTypeKey
   * @return dataTypeKey
   **/
  @Schema(description = "")
  
    @Valid
    public DataTypeKeyAspectRequestV2 getDataTypeKey() {
    return dataTypeKey;
  }

  public void setDataTypeKey(DataTypeKeyAspectRequestV2 dataTypeKey) {
    this.dataTypeKey = dataTypeKey;
  }

  public DataTypeEntityRequestV2 dataTypeInfo(DataTypeInfoAspectRequestV2 dataTypeInfo) {
    this.dataTypeInfo = dataTypeInfo;
    return this;
  }

  /**
   * Get dataTypeInfo
   * @return dataTypeInfo
   **/
  @Schema(description = "")
  
    @Valid
    public DataTypeInfoAspectRequestV2 getDataTypeInfo() {
    return dataTypeInfo;
  }

  public void setDataTypeInfo(DataTypeInfoAspectRequestV2 dataTypeInfo) {
    this.dataTypeInfo = dataTypeInfo;
  }

  public DataTypeEntityRequestV2 institutionalMemory(InstitutionalMemoryAspectRequestV2 institutionalMemory) {
    this.institutionalMemory = institutionalMemory;
    return this;
  }

  /**
   * Get institutionalMemory
   * @return institutionalMemory
   **/
  @Schema(description = "")
  
    @Valid
    public InstitutionalMemoryAspectRequestV2 getInstitutionalMemory() {
    return institutionalMemory;
  }

  public void setInstitutionalMemory(InstitutionalMemoryAspectRequestV2 institutionalMemory) {
    this.institutionalMemory = institutionalMemory;
  }

  public DataTypeEntityRequestV2 status(StatusAspectRequestV2 status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    @Valid
    public StatusAspectRequestV2 getStatus() {
    return status;
  }

  public void setStatus(StatusAspectRequestV2 status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataTypeEntityRequestV2 dataTypeEntityRequestV2 = (DataTypeEntityRequestV2) o;
    return Objects.equals(this.urn, dataTypeEntityRequestV2.urn) &&
        Objects.equals(this.dataTypeKey, dataTypeEntityRequestV2.dataTypeKey) &&
        Objects.equals(this.dataTypeInfo, dataTypeEntityRequestV2.dataTypeInfo) &&
        Objects.equals(this.institutionalMemory, dataTypeEntityRequestV2.institutionalMemory) &&
        Objects.equals(this.status, dataTypeEntityRequestV2.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, dataTypeKey, dataTypeInfo, institutionalMemory, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataTypeEntityRequestV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    dataTypeKey: ").append(toIndentedString(dataTypeKey)).append("\n");
    sb.append("    dataTypeInfo: ").append(toIndentedString(dataTypeInfo)).append("\n");
    sb.append("    institutionalMemory: ").append(toIndentedString(institutionalMemory)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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