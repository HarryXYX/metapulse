package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.BusinessAttributeInfoAspectResponseV2;
import io.datahubproject.openapi.generated.BusinessAttributeKeyAspectResponseV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectResponseV2;
import io.datahubproject.openapi.generated.OwnershipAspectResponseV2;
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
 * BusinessAttribute object.
 */
@Schema(description = "BusinessAttribute object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessAttributeEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("businessAttributeKey") @Builder.Default
  private BusinessAttributeKeyAspectResponseV2 businessAttributeKey = null;

  @JsonProperty("businessAttributeInfo") @Builder.Default
  private BusinessAttributeInfoAspectResponseV2 businessAttributeInfo = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectResponseV2 ownership = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectResponseV2 institutionalMemory = null;

  public BusinessAttributeEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for businessAttribute
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for businessAttribute")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public BusinessAttributeEntityResponseV2 businessAttributeKey(BusinessAttributeKeyAspectResponseV2 businessAttributeKey) {
    this.businessAttributeKey = businessAttributeKey;
    return this;
  }

  /**
   * Get businessAttributeKey
   * @return businessAttributeKey
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessAttributeKeyAspectResponseV2 getBusinessAttributeKey() {
    return businessAttributeKey;
  }

  public void setBusinessAttributeKey(BusinessAttributeKeyAspectResponseV2 businessAttributeKey) {
    this.businessAttributeKey = businessAttributeKey;
  }

  public BusinessAttributeEntityResponseV2 businessAttributeInfo(BusinessAttributeInfoAspectResponseV2 businessAttributeInfo) {
    this.businessAttributeInfo = businessAttributeInfo;
    return this;
  }

  /**
   * Get businessAttributeInfo
   * @return businessAttributeInfo
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessAttributeInfoAspectResponseV2 getBusinessAttributeInfo() {
    return businessAttributeInfo;
  }

  public void setBusinessAttributeInfo(BusinessAttributeInfoAspectResponseV2 businessAttributeInfo) {
    this.businessAttributeInfo = businessAttributeInfo;
  }

  public BusinessAttributeEntityResponseV2 status(StatusAspectResponseV2 status) {
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

  public BusinessAttributeEntityResponseV2 ownership(OwnershipAspectResponseV2 ownership) {
    this.ownership = ownership;
    return this;
  }

  /**
   * Get ownership
   * @return ownership
   **/
  @Schema(description = "")
  
    @Valid
    public OwnershipAspectResponseV2 getOwnership() {
    return ownership;
  }

  public void setOwnership(OwnershipAspectResponseV2 ownership) {
    this.ownership = ownership;
  }

  public BusinessAttributeEntityResponseV2 institutionalMemory(InstitutionalMemoryAspectResponseV2 institutionalMemory) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessAttributeEntityResponseV2 businessAttributeEntityResponseV2 = (BusinessAttributeEntityResponseV2) o;
    return Objects.equals(this.urn, businessAttributeEntityResponseV2.urn) &&
        Objects.equals(this.businessAttributeKey, businessAttributeEntityResponseV2.businessAttributeKey) &&
        Objects.equals(this.businessAttributeInfo, businessAttributeEntityResponseV2.businessAttributeInfo) &&
        Objects.equals(this.status, businessAttributeEntityResponseV2.status) &&
        Objects.equals(this.ownership, businessAttributeEntityResponseV2.ownership) &&
        Objects.equals(this.institutionalMemory, businessAttributeEntityResponseV2.institutionalMemory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, businessAttributeKey, businessAttributeInfo, status, ownership, institutionalMemory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessAttributeEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    businessAttributeKey: ").append(toIndentedString(businessAttributeKey)).append("\n");
    sb.append("    businessAttributeInfo: ").append(toIndentedString(businessAttributeInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
    sb.append("    institutionalMemory: ").append(toIndentedString(institutionalMemory)).append("\n");
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