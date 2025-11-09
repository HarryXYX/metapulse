package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.OwnershipTypeInfoAspectResponseV2;
import io.datahubproject.openapi.generated.OwnershipTypeKeyAspectResponseV2;
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
 * Ownership Type represents a user-created ownership category for a person or group who is responsible for an asset.
 */
@Schema(description = "Ownership Type represents a user-created ownership category for a person or group who is responsible for an asset.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OwnershipTypeEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("ownershipTypeKey") @Builder.Default
  private OwnershipTypeKeyAspectResponseV2 ownershipTypeKey = null;

  @JsonProperty("ownershipTypeInfo") @Builder.Default
  private OwnershipTypeInfoAspectResponseV2 ownershipTypeInfo = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  public OwnershipTypeEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for ownershipType
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for ownershipType")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public OwnershipTypeEntityResponseV2 ownershipTypeKey(OwnershipTypeKeyAspectResponseV2 ownershipTypeKey) {
    this.ownershipTypeKey = ownershipTypeKey;
    return this;
  }

  /**
   * Get ownershipTypeKey
   * @return ownershipTypeKey
   **/
  @Schema(description = "")
  
    @Valid
    public OwnershipTypeKeyAspectResponseV2 getOwnershipTypeKey() {
    return ownershipTypeKey;
  }

  public void setOwnershipTypeKey(OwnershipTypeKeyAspectResponseV2 ownershipTypeKey) {
    this.ownershipTypeKey = ownershipTypeKey;
  }

  public OwnershipTypeEntityResponseV2 ownershipTypeInfo(OwnershipTypeInfoAspectResponseV2 ownershipTypeInfo) {
    this.ownershipTypeInfo = ownershipTypeInfo;
    return this;
  }

  /**
   * Get ownershipTypeInfo
   * @return ownershipTypeInfo
   **/
  @Schema(description = "")
  
    @Valid
    public OwnershipTypeInfoAspectResponseV2 getOwnershipTypeInfo() {
    return ownershipTypeInfo;
  }

  public void setOwnershipTypeInfo(OwnershipTypeInfoAspectResponseV2 ownershipTypeInfo) {
    this.ownershipTypeInfo = ownershipTypeInfo;
  }

  public OwnershipTypeEntityResponseV2 status(StatusAspectResponseV2 status) {
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
    OwnershipTypeEntityResponseV2 ownershipTypeEntityResponseV2 = (OwnershipTypeEntityResponseV2) o;
    return Objects.equals(this.urn, ownershipTypeEntityResponseV2.urn) &&
        Objects.equals(this.ownershipTypeKey, ownershipTypeEntityResponseV2.ownershipTypeKey) &&
        Objects.equals(this.ownershipTypeInfo, ownershipTypeEntityResponseV2.ownershipTypeInfo) &&
        Objects.equals(this.status, ownershipTypeEntityResponseV2.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, ownershipTypeKey, ownershipTypeInfo, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnershipTypeEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    ownershipTypeKey: ").append(toIndentedString(ownershipTypeKey)).append("\n");
    sb.append("    ownershipTypeInfo: ").append(toIndentedString(ownershipTypeInfo)).append("\n");
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