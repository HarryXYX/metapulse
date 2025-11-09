package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataTypeInfoAspectResponseV2;
import io.datahubproject.openapi.generated.DataTypeKeyAspectResponseV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectResponseV2;
import io.datahubproject.openapi.generated.StatusAspectResponseV2;
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
public class DataTypeEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("dataTypeKey") @Builder.Default
  private DataTypeKeyAspectResponseV2 dataTypeKey = null;

  @JsonProperty("dataTypeInfo") @Builder.Default
  private DataTypeInfoAspectResponseV2 dataTypeInfo = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectResponseV2 institutionalMemory = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  public DataTypeEntityResponseV2 urn(String urn) {
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

  public DataTypeEntityResponseV2 dataTypeKey(DataTypeKeyAspectResponseV2 dataTypeKey) {
    this.dataTypeKey = dataTypeKey;
    return this;
  }

  /**
   * Get dataTypeKey
   * @return dataTypeKey
   **/
  @Schema(description = "")
  
    @Valid
    public DataTypeKeyAspectResponseV2 getDataTypeKey() {
    return dataTypeKey;
  }

  public void setDataTypeKey(DataTypeKeyAspectResponseV2 dataTypeKey) {
    this.dataTypeKey = dataTypeKey;
  }

  public DataTypeEntityResponseV2 dataTypeInfo(DataTypeInfoAspectResponseV2 dataTypeInfo) {
    this.dataTypeInfo = dataTypeInfo;
    return this;
  }

  /**
   * Get dataTypeInfo
   * @return dataTypeInfo
   **/
  @Schema(description = "")
  
    @Valid
    public DataTypeInfoAspectResponseV2 getDataTypeInfo() {
    return dataTypeInfo;
  }

  public void setDataTypeInfo(DataTypeInfoAspectResponseV2 dataTypeInfo) {
    this.dataTypeInfo = dataTypeInfo;
  }

  public DataTypeEntityResponseV2 institutionalMemory(InstitutionalMemoryAspectResponseV2 institutionalMemory) {
    this.institutionalMemory = institutionalMemory;
    return this;
  }

  /**
   * Get institutionalMemory
   * @return institutionalMemory
   **/
  @Schema(description = "")
  
    @Valid
    public InstitutionalMemoryAspectResponseV2 getInstitutionalMemory() {
    return institutionalMemory;
  }

  public void setInstitutionalMemory(InstitutionalMemoryAspectResponseV2 institutionalMemory) {
    this.institutionalMemory = institutionalMemory;
  }

  public DataTypeEntityResponseV2 status(StatusAspectResponseV2 status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    @Valid
    public StatusAspectResponseV2 getStatus() {
    return status;
  }

  public void setStatus(StatusAspectResponseV2 status) {
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
    DataTypeEntityResponseV2 dataTypeEntityResponseV2 = (DataTypeEntityResponseV2) o;
    return Objects.equals(this.urn, dataTypeEntityResponseV2.urn) &&
        Objects.equals(this.dataTypeKey, dataTypeEntityResponseV2.dataTypeKey) &&
        Objects.equals(this.dataTypeInfo, dataTypeEntityResponseV2.dataTypeInfo) &&
        Objects.equals(this.institutionalMemory, dataTypeEntityResponseV2.institutionalMemory) &&
        Objects.equals(this.status, dataTypeEntityResponseV2.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, dataTypeKey, dataTypeInfo, institutionalMemory, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataTypeEntityResponseV2 {\n");
    
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