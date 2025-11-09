package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.OwnershipTypeInfoAspectRequestV2;
import io.datahubproject.openapi.generated.OwnershipTypeKeyAspectRequestV2;
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
 * Ownership Type represents a user-created ownership category for a person or group who is responsible for an asset.
 */
@Schema(description = "Ownership Type represents a user-created ownership category for a person or group who is responsible for an asset.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OwnershipTypeEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("ownershipTypeKey") @Builder.Default
  private OwnershipTypeKeyAspectRequestV2 ownershipTypeKey = null;

  @JsonProperty("ownershipTypeInfo") @Builder.Default
  private OwnershipTypeInfoAspectRequestV2 ownershipTypeInfo = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectRequestV2 status = null;

  public OwnershipTypeEntityRequestV2 urn(String urn) {
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

  public OwnershipTypeEntityRequestV2 ownershipTypeKey(OwnershipTypeKeyAspectRequestV2 ownershipTypeKey) {
    this.ownershipTypeKey = ownershipTypeKey;
    return this;
  }

  /**
   * Get ownershipTypeKey
   * @return ownershipTypeKey
   **/
  @Schema(description = "")
  
    @Valid
    public OwnershipTypeKeyAspectRequestV2 getOwnershipTypeKey() {
    return ownershipTypeKey;
  }

  public void setOwnershipTypeKey(OwnershipTypeKeyAspectRequestV2 ownershipTypeKey) {
    this.ownershipTypeKey = ownershipTypeKey;
  }

  public OwnershipTypeEntityRequestV2 ownershipTypeInfo(OwnershipTypeInfoAspectRequestV2 ownershipTypeInfo) {
    this.ownershipTypeInfo = ownershipTypeInfo;
    return this;
  }

  /**
   * Get ownershipTypeInfo
   * @return ownershipTypeInfo
   **/
  @Schema(description = "")
  
    @Valid
    public OwnershipTypeInfoAspectRequestV2 getOwnershipTypeInfo() {
    return ownershipTypeInfo;
  }

  public void setOwnershipTypeInfo(OwnershipTypeInfoAspectRequestV2 ownershipTypeInfo) {
    this.ownershipTypeInfo = ownershipTypeInfo;
  }

  public OwnershipTypeEntityRequestV2 status(StatusAspectRequestV2 status) {
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
    OwnershipTypeEntityRequestV2 ownershipTypeEntityRequestV2 = (OwnershipTypeEntityRequestV2) o;
    return Objects.equals(this.urn, ownershipTypeEntityRequestV2.urn) &&
        Objects.equals(this.ownershipTypeKey, ownershipTypeEntityRequestV2.ownershipTypeKey) &&
        Objects.equals(this.ownershipTypeInfo, ownershipTypeEntityRequestV2.ownershipTypeInfo) &&
        Objects.equals(this.status, ownershipTypeEntityRequestV2.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, ownershipTypeKey, ownershipTypeInfo, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnershipTypeEntityRequestV2 {\n");
    
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