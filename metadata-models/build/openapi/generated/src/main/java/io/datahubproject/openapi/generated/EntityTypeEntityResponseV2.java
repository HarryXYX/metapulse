package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.EntityTypeInfoAspectResponseV2;
import io.datahubproject.openapi.generated.EntityTypeKeyAspectResponseV2;
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
 * A type of entity in the DataHub Metadata Model.
 */
@Schema(description = "A type of entity in the DataHub Metadata Model.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityTypeEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("entityTypeKey") @Builder.Default
  private EntityTypeKeyAspectResponseV2 entityTypeKey = null;

  @JsonProperty("entityTypeInfo") @Builder.Default
  private EntityTypeInfoAspectResponseV2 entityTypeInfo = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectResponseV2 institutionalMemory = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  public EntityTypeEntityResponseV2 urn(String urn) {
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

  public EntityTypeEntityResponseV2 entityTypeKey(EntityTypeKeyAspectResponseV2 entityTypeKey) {
    this.entityTypeKey = entityTypeKey;
    return this;
  }

  /**
   * Get entityTypeKey
   * @return entityTypeKey
   **/
  @Schema(description = "")
  
    @Valid
    public EntityTypeKeyAspectResponseV2 getEntityTypeKey() {
    return entityTypeKey;
  }

  public void setEntityTypeKey(EntityTypeKeyAspectResponseV2 entityTypeKey) {
    this.entityTypeKey = entityTypeKey;
  }

  public EntityTypeEntityResponseV2 entityTypeInfo(EntityTypeInfoAspectResponseV2 entityTypeInfo) {
    this.entityTypeInfo = entityTypeInfo;
    return this;
  }

  /**
   * Get entityTypeInfo
   * @return entityTypeInfo
   **/
  @Schema(description = "")
  
    @Valid
    public EntityTypeInfoAspectResponseV2 getEntityTypeInfo() {
    return entityTypeInfo;
  }

  public void setEntityTypeInfo(EntityTypeInfoAspectResponseV2 entityTypeInfo) {
    this.entityTypeInfo = entityTypeInfo;
  }

  public EntityTypeEntityResponseV2 institutionalMemory(InstitutionalMemoryAspectResponseV2 institutionalMemory) {
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

  public EntityTypeEntityResponseV2 status(StatusAspectResponseV2 status) {
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
    EntityTypeEntityResponseV2 entityTypeEntityResponseV2 = (EntityTypeEntityResponseV2) o;
    return Objects.equals(this.urn, entityTypeEntityResponseV2.urn) &&
        Objects.equals(this.entityTypeKey, entityTypeEntityResponseV2.entityTypeKey) &&
        Objects.equals(this.entityTypeInfo, entityTypeEntityResponseV2.entityTypeInfo) &&
        Objects.equals(this.institutionalMemory, entityTypeEntityResponseV2.institutionalMemory) &&
        Objects.equals(this.status, entityTypeEntityResponseV2.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, entityTypeKey, entityTypeInfo, institutionalMemory, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityTypeEntityResponseV2 {\n");
    
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