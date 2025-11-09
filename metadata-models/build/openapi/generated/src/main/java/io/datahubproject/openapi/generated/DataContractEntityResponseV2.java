package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataContractKeyAspectResponseV2;
import io.datahubproject.openapi.generated.DataContractPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.DataContractStatusAspectResponseV2;
import io.datahubproject.openapi.generated.StatusAspectResponseV2;
import io.datahubproject.openapi.generated.StructuredPropertiesAspectResponseV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * DataContract object.
 */
@Schema(description = "DataContract object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataContractEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("dataContractKey") @Builder.Default
  private DataContractKeyAspectResponseV2 dataContractKey = null;

  @JsonProperty("dataContractProperties") @Builder.Default
  private DataContractPropertiesAspectResponseV2 dataContractProperties = null;

  @JsonProperty("dataContractStatus") @Builder.Default
  private DataContractStatusAspectResponseV2 dataContractStatus = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectResponseV2 structuredProperties = null;

  public DataContractEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for dataContract
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for dataContract")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public DataContractEntityResponseV2 dataContractKey(DataContractKeyAspectResponseV2 dataContractKey) {
    this.dataContractKey = dataContractKey;
    return this;
  }

  /**
   * Get dataContractKey
   * @return dataContractKey
   **/
  @Schema(description = "")
  
    @Valid
    public DataContractKeyAspectResponseV2 getDataContractKey() {
    return dataContractKey;
  }

  public void setDataContractKey(DataContractKeyAspectResponseV2 dataContractKey) {
    this.dataContractKey = dataContractKey;
  }

  public DataContractEntityResponseV2 dataContractProperties(DataContractPropertiesAspectResponseV2 dataContractProperties) {
    this.dataContractProperties = dataContractProperties;
    return this;
  }

  /**
   * Get dataContractProperties
   * @return dataContractProperties
   **/
  @Schema(description = "")
  
    @Valid
    public DataContractPropertiesAspectResponseV2 getDataContractProperties() {
    return dataContractProperties;
  }

  public void setDataContractProperties(DataContractPropertiesAspectResponseV2 dataContractProperties) {
    this.dataContractProperties = dataContractProperties;
  }

  public DataContractEntityResponseV2 dataContractStatus(DataContractStatusAspectResponseV2 dataContractStatus) {
    this.dataContractStatus = dataContractStatus;
    return this;
  }

  /**
   * Get dataContractStatus
   * @return dataContractStatus
   **/
  @Schema(description = "")
  
    @Valid
    public DataContractStatusAspectResponseV2 getDataContractStatus() {
    return dataContractStatus;
  }

  public void setDataContractStatus(DataContractStatusAspectResponseV2 dataContractStatus) {
    this.dataContractStatus = dataContractStatus;
  }

  public DataContractEntityResponseV2 status(StatusAspectResponseV2 status) {
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

  public DataContractEntityResponseV2 structuredProperties(StructuredPropertiesAspectResponseV2 structuredProperties) {
    this.structuredProperties = structuredProperties;
    return this;
  }

  /**
   * Get structuredProperties
   * @return structuredProperties
   **/
  @Schema(description = "")
  
    @Valid
    public StructuredPropertiesAspectResponseV2 getStructuredProperties() {
    return structuredProperties;
  }

  public void setStructuredProperties(StructuredPropertiesAspectResponseV2 structuredProperties) {
    this.structuredProperties = structuredProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataContractEntityResponseV2 dataContractEntityResponseV2 = (DataContractEntityResponseV2) o;
    return Objects.equals(this.urn, dataContractEntityResponseV2.urn) &&
        Objects.equals(this.dataContractKey, dataContractEntityResponseV2.dataContractKey) &&
        Objects.equals(this.dataContractProperties, dataContractEntityResponseV2.dataContractProperties) &&
        Objects.equals(this.dataContractStatus, dataContractEntityResponseV2.dataContractStatus) &&
        Objects.equals(this.status, dataContractEntityResponseV2.status) &&
        Objects.equals(this.structuredProperties, dataContractEntityResponseV2.structuredProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, dataContractKey, dataContractProperties, dataContractStatus, status, structuredProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataContractEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    dataContractKey: ").append(toIndentedString(dataContractKey)).append("\n");
    sb.append("    dataContractProperties: ").append(toIndentedString(dataContractProperties)).append("\n");
    sb.append("    dataContractStatus: ").append(toIndentedString(dataContractStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    structuredProperties: ").append(toIndentedString(structuredProperties)).append("\n");
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