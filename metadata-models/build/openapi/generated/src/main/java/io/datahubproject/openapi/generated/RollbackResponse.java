package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AspectRowSummary;
import io.datahubproject.openapi.generated.UnsafeEntityInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * RollbackResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RollbackResponse   {

  @JsonProperty("aspectRowSummaries") @Builder.Default
  @Valid
  private List<AspectRowSummary> aspectRowSummaries = new ArrayList<>();

  @JsonProperty("entitiesAffected") @Builder.Default
  private Long entitiesAffected = null;

  @JsonProperty("aspectsAffected") @Builder.Default
  private Long aspectsAffected = null;

  @JsonProperty("entitiesDeleted") @Builder.Default
  private Long entitiesDeleted = null;

  @JsonProperty("aspectsReverted") @Builder.Default
  private Long aspectsReverted = null;

  @JsonProperty("unsafeEntitiesCount") @Builder.Default
  private Long unsafeEntitiesCount = null;

  @JsonProperty("unsafeEntities") @Builder.Default
  @Valid
  private List<UnsafeEntityInfo> unsafeEntities = new ArrayList<>();

  public RollbackResponse aspectRowSummaries(List<AspectRowSummary> aspectRowSummaries) {
    this.aspectRowSummaries = aspectRowSummaries;
    return this;
  }

  public RollbackResponse addAspectRowSummariesItem(AspectRowSummary aspectRowSummariesItem) {
    this.aspectRowSummaries.add(aspectRowSummariesItem);
    return this;
  }

  /**
   * Get aspectRowSummaries
   * @return aspectRowSummaries
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<AspectRowSummary> getAspectRowSummaries() {
    return aspectRowSummaries;
  }

  public void setAspectRowSummaries(List<AspectRowSummary> aspectRowSummaries) {
    this.aspectRowSummaries = aspectRowSummaries;
  }

  public RollbackResponse entitiesAffected(Long entitiesAffected) {
    this.entitiesAffected = entitiesAffected;
    return this;
  }

  /**
   * Get entitiesAffected
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return entitiesAffected
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getEntitiesAffected() {
    return entitiesAffected;
  }

  public void setEntitiesAffected(Long entitiesAffected) {
    this.entitiesAffected = entitiesAffected;
  }

  public RollbackResponse aspectsAffected(Long aspectsAffected) {
    this.aspectsAffected = aspectsAffected;
    return this;
  }

  /**
   * Get aspectsAffected
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return aspectsAffected
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getAspectsAffected() {
    return aspectsAffected;
  }

  public void setAspectsAffected(Long aspectsAffected) {
    this.aspectsAffected = aspectsAffected;
  }

  public RollbackResponse entitiesDeleted(Long entitiesDeleted) {
    this.entitiesDeleted = entitiesDeleted;
    return this;
  }

  /**
   * Get entitiesDeleted
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return entitiesDeleted
   **/
  @Schema(description = "")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getEntitiesDeleted() {
    return entitiesDeleted;
  }

  public void setEntitiesDeleted(Long entitiesDeleted) {
    this.entitiesDeleted = entitiesDeleted;
  }

  public RollbackResponse aspectsReverted(Long aspectsReverted) {
    this.aspectsReverted = aspectsReverted;
    return this;
  }

  /**
   * Get aspectsReverted
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return aspectsReverted
   **/
  @Schema(description = "")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getAspectsReverted() {
    return aspectsReverted;
  }

  public void setAspectsReverted(Long aspectsReverted) {
    this.aspectsReverted = aspectsReverted;
  }

  public RollbackResponse unsafeEntitiesCount(Long unsafeEntitiesCount) {
    this.unsafeEntitiesCount = unsafeEntitiesCount;
    return this;
  }

  /**
   * Get unsafeEntitiesCount
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return unsafeEntitiesCount
   **/
  @Schema(description = "")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getUnsafeEntitiesCount() {
    return unsafeEntitiesCount;
  }

  public void setUnsafeEntitiesCount(Long unsafeEntitiesCount) {
    this.unsafeEntitiesCount = unsafeEntitiesCount;
  }

  public RollbackResponse unsafeEntities(List<UnsafeEntityInfo> unsafeEntities) {
    this.unsafeEntities = unsafeEntities;
    return this;
  }

  public RollbackResponse addUnsafeEntitiesItem(UnsafeEntityInfo unsafeEntitiesItem) {
    this.unsafeEntities.add(unsafeEntitiesItem);
    return this;
  }

  /**
   * Get unsafeEntities
   * @return unsafeEntities
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<UnsafeEntityInfo> getUnsafeEntities() {
    return unsafeEntities;
  }

  public void setUnsafeEntities(List<UnsafeEntityInfo> unsafeEntities) {
    this.unsafeEntities = unsafeEntities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RollbackResponse rollbackResponse = (RollbackResponse) o;
    return Objects.equals(this.aspectRowSummaries, rollbackResponse.aspectRowSummaries) &&
        Objects.equals(this.entitiesAffected, rollbackResponse.entitiesAffected) &&
        Objects.equals(this.aspectsAffected, rollbackResponse.aspectsAffected) &&
        Objects.equals(this.entitiesDeleted, rollbackResponse.entitiesDeleted) &&
        Objects.equals(this.aspectsReverted, rollbackResponse.aspectsReverted) &&
        Objects.equals(this.unsafeEntitiesCount, rollbackResponse.unsafeEntitiesCount) &&
        Objects.equals(this.unsafeEntities, rollbackResponse.unsafeEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspectRowSummaries, entitiesAffected, aspectsAffected, entitiesDeleted, aspectsReverted, unsafeEntitiesCount, unsafeEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RollbackResponse {\n");
    
    sb.append("    aspectRowSummaries: ").append(toIndentedString(aspectRowSummaries)).append("\n");
    sb.append("    entitiesAffected: ").append(toIndentedString(entitiesAffected)).append("\n");
    sb.append("    aspectsAffected: ").append(toIndentedString(aspectsAffected)).append("\n");
    sb.append("    entitiesDeleted: ").append(toIndentedString(entitiesDeleted)).append("\n");
    sb.append("    aspectsReverted: ").append(toIndentedString(aspectsReverted)).append("\n");
    sb.append("    unsafeEntitiesCount: ").append(toIndentedString(unsafeEntitiesCount)).append("\n");
    sb.append("    unsafeEntities: ").append(toIndentedString(unsafeEntities)).append("\n");
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