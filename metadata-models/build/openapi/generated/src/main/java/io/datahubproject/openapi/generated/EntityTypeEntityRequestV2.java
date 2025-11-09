package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.EntityTypeInfoAspectRequestV2;
import io.datahubproject.openapi.generated.EntityTypeKeyAspectRequestV2;
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
 * A type of entity in the DataHub Metadata Model.
 */
@Schema(description = "A type of entity in the DataHub Metadata Model.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityTypeEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("entityTypeKey") @Builder.Default
  private EntityTypeKeyAspectRequestV2 entityTypeKey = null;

  @JsonProperty("entityTypeInfo") @Builder.Default
  private EntityTypeInfoAspectRequestV2 entityTypeInfo = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectRequestV2 institutionalMemory = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectRequestV2 status = null;

  public EntityTypeEntityRequestV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for entityType
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for entityType")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public EntityTypeEntityRequestV2 entityTypeKey(EntityTypeKeyAspectRequestV2 entityTypeKey) {
    this.entityTypeKey = entityTypeKey;
    return this;
  }

  /**
   * Get entityTypeKey
   * @return entityTypeKey
   **/
  @Schema(description = "")
  
    @Valid
    public EntityTypeKeyAspectRequestV2 getEntityTypeKey() {
    return entityTypeKey;
  }

  public void setEntityTypeKey(EntityTypeKeyAspectRequestV2 entityTypeKey) {
    this.entityTypeKey = entityTypeKey;
  }

  public EntityTypeEntityRequestV2 entityTypeInfo(EntityTypeInfoAspectRequestV2 entityTypeInfo) {
    this.entityTypeInfo = entityTypeInfo;
    return this;
  }

  /**
   * Get entityTypeInfo
   * @return entityTypeInfo
   **/
  @Schema(description = "")
  
    @Valid
    public EntityTypeInfoAspectRequestV2 getEntityTypeInfo() {
    return entityTypeInfo;
  }

  public void setEntityTypeInfo(EntityTypeInfoAspectRequestV2 entityTypeInfo) {
    this.entityTypeInfo = entityTypeInfo;
  }

  public EntityTypeEntityRequestV2 institutionalMemory(InstitutionalMemoryAspectRequestV2 institutionalMemory) {
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

  public EntityTypeEntityRequestV2 status(StatusAspectRequestV2 status) {
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
    EntityTypeEntityRequestV2 entityTypeEntityRequestV2 = (EntityTypeEntityRequestV2) o;
    return Objects.equals(this.urn, entityTypeEntityRequestV2.urn) &&
        Objects.equals(this.entityTypeKey, entityTypeEntityRequestV2.entityTypeKey) &&
        Objects.equals(this.entityTypeInfo, entityTypeEntityRequestV2.entityTypeInfo) &&
        Objects.equals(this.institutionalMemory, entityTypeEntityRequestV2.institutionalMemory) &&
        Objects.equals(this.status, entityTypeEntityRequestV2.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, entityTypeKey, entityTypeInfo, institutionalMemory, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityTypeEntityRequestV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    entityTypeKey: ").append(toIndentedString(entityTypeKey)).append("\n");
    sb.append("    entityTypeInfo: ").append(toIndentedString(entityTypeInfo)).append("\n");
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