package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.BusinessAttributeInfoAspectRequestV2;
import io.datahubproject.openapi.generated.BusinessAttributeKeyAspectRequestV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectRequestV2;
import io.datahubproject.openapi.generated.OwnershipAspectRequestV2;
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
 * BusinessAttribute object.
 */
@Schema(description = "BusinessAttribute object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessAttributeEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("businessAttributeKey") @Builder.Default
  private BusinessAttributeKeyAspectRequestV2 businessAttributeKey = null;

  @JsonProperty("businessAttributeInfo") @Builder.Default
  private BusinessAttributeInfoAspectRequestV2 businessAttributeInfo = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectRequestV2 status = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectRequestV2 ownership = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectRequestV2 institutionalMemory = null;

  public BusinessAttributeEntityRequestV2 urn(String urn) {
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

  public BusinessAttributeEntityRequestV2 businessAttributeKey(BusinessAttributeKeyAspectRequestV2 businessAttributeKey) {
    this.businessAttributeKey = businessAttributeKey;
    return this;
  }

  /**
   * Get businessAttributeKey
   * @return businessAttributeKey
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessAttributeKeyAspectRequestV2 getBusinessAttributeKey() {
    return businessAttributeKey;
  }

  public void setBusinessAttributeKey(BusinessAttributeKeyAspectRequestV2 businessAttributeKey) {
    this.businessAttributeKey = businessAttributeKey;
  }

  public BusinessAttributeEntityRequestV2 businessAttributeInfo(BusinessAttributeInfoAspectRequestV2 businessAttributeInfo) {
    this.businessAttributeInfo = businessAttributeInfo;
    return this;
  }

  /**
   * Get businessAttributeInfo
   * @return businessAttributeInfo
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessAttributeInfoAspectRequestV2 getBusinessAttributeInfo() {
    return businessAttributeInfo;
  }

  public void setBusinessAttributeInfo(BusinessAttributeInfoAspectRequestV2 businessAttributeInfo) {
    this.businessAttributeInfo = businessAttributeInfo;
  }

  public BusinessAttributeEntityRequestV2 status(StatusAspectRequestV2 status) {
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

  public BusinessAttributeEntityRequestV2 ownership(OwnershipAspectRequestV2 ownership) {
    this.ownership = ownership;
    return this;
  }

  /**
   * Get ownership
   * @return ownership
   **/
  @Schema(description = "")
  
    @Valid
    public OwnershipAspectRequestV2 getOwnership() {
    return ownership;
  }

  public void setOwnership(OwnershipAspectRequestV2 ownership) {
    this.ownership = ownership;
  }

  public BusinessAttributeEntityRequestV2 institutionalMemory(InstitutionalMemoryAspectRequestV2 institutionalMemory) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessAttributeEntityRequestV2 businessAttributeEntityRequestV2 = (BusinessAttributeEntityRequestV2) o;
    return Objects.equals(this.urn, businessAttributeEntityRequestV2.urn) &&
        Objects.equals(this.businessAttributeKey, businessAttributeEntityRequestV2.businessAttributeKey) &&
        Objects.equals(this.businessAttributeInfo, businessAttributeEntityRequestV2.businessAttributeInfo) &&
        Objects.equals(this.status, businessAttributeEntityRequestV2.status) &&
        Objects.equals(this.ownership, businessAttributeEntityRequestV2.ownership) &&
        Objects.equals(this.institutionalMemory, businessAttributeEntityRequestV2.institutionalMemory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, businessAttributeKey, businessAttributeInfo, status, ownership, institutionalMemory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessAttributeEntityRequestV2 {\n");
    
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