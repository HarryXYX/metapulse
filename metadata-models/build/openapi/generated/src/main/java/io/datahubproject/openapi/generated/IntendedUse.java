package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.IntendedUserType;
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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Intended Use for the ML Model
 */
@Schema(description = "Intended Use for the ML Model")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IntendedUse  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfMLModelSnapshotAspectsItems, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "IntendedUse") @Builder.Default
  private String __type = "IntendedUse";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"IntendedUse"},
  defaultValue = "IntendedUse")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("primaryUses") @Builder.Default
  @Valid
  private List<String> primaryUses = null;

  @JsonProperty("primaryUsers") @Builder.Default
  @Valid
  private List<IntendedUserType> primaryUsers = null;

  @JsonProperty("outOfScopeUses") @Builder.Default
  @Valid
  private List<String> outOfScopeUses = null;

  public IntendedUse primaryUses(List<String> primaryUses) {
    this.primaryUses = primaryUses;
    return this;
  }

  public IntendedUse addPrimaryUsesItem(String primaryUsesItem) {
    if (this.primaryUses == null) {
      this.primaryUses = new ArrayList<>();
    }
    this.primaryUses.add(primaryUsesItem);
    return this;
  }

  /**
   * Primary Use cases for the MLModel.
   * @return primaryUses
   **/
  @Schema(description = "Primary Use cases for the MLModel.")
  
    public List<String> getPrimaryUses() {
    return primaryUses;
  }

  public void setPrimaryUses(List<String> primaryUses) {
    this.primaryUses = primaryUses;
  }

  public IntendedUse primaryUsers(List<IntendedUserType> primaryUsers) {
    this.primaryUsers = primaryUsers;
    return this;
  }

  public IntendedUse addPrimaryUsersItem(IntendedUserType primaryUsersItem) {
    if (this.primaryUsers == null) {
      this.primaryUsers = new ArrayList<>();
    }
    this.primaryUsers.add(primaryUsersItem);
    return this;
  }

  /**
   * Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?
   * @return primaryUsers
   **/
  @Schema(description = "Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?")
      @Valid
    public List<IntendedUserType> getPrimaryUsers() {
    return primaryUsers;
  }

  public void setPrimaryUsers(List<IntendedUserType> primaryUsers) {
    this.primaryUsers = primaryUsers;
  }

  public IntendedUse outOfScopeUses(List<String> outOfScopeUses) {
    this.outOfScopeUses = outOfScopeUses;
    return this;
  }

  public IntendedUse addOutOfScopeUsesItem(String outOfScopeUsesItem) {
    if (this.outOfScopeUses == null) {
      this.outOfScopeUses = new ArrayList<>();
    }
    this.outOfScopeUses.add(outOfScopeUsesItem);
    return this;
  }

  /**
   * Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.
   * @return outOfScopeUses
   **/
  @Schema(description = "Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.")
  
    public List<String> getOutOfScopeUses() {
    return outOfScopeUses;
  }

  public void setOutOfScopeUses(List<String> outOfScopeUses) {
    this.outOfScopeUses = outOfScopeUses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntendedUse intendedUse = (IntendedUse) o;
    return Objects.equals(this.primaryUses, intendedUse.primaryUses) &&
        Objects.equals(this.primaryUsers, intendedUse.primaryUsers) &&
        Objects.equals(this.outOfScopeUses, intendedUse.outOfScopeUses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryUses, primaryUsers, outOfScopeUses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntendedUse {\n");
    
    sb.append("    primaryUses: ").append(toIndentedString(primaryUses)).append("\n");
    sb.append("    primaryUsers: ").append(toIndentedString(primaryUsers)).append("\n");
    sb.append("    outOfScopeUses: ").append(toIndentedString(outOfScopeUses)).append("\n");
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