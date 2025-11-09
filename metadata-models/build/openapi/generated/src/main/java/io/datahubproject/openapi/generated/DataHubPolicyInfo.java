package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataHubActorFilter;
import io.datahubproject.openapi.generated.DataHubResourceFilter;
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
 * Information about a DataHub (UI) access policy.
 */
@Schema(description = "Information about a DataHub (UI) access policy.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubPolicyInfo  implements OneOfDataHubPolicySnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubPolicyInfo") @Builder.Default
  private String __type = "DataHubPolicyInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubPolicyInfo"},
  defaultValue = "DataHubPolicyInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("displayName") @Builder.Default
  private String displayName = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("type") @Builder.Default
  private String type = null;

  @JsonProperty("state") @Builder.Default
  private String state = null;

  @JsonProperty("resources") @Builder.Default
  private DataHubResourceFilter resources = null;

  @JsonProperty("privileges") @Builder.Default
  @Valid
  private List<String> privileges = new ArrayList<>();

  @JsonProperty("actors") @Builder.Default
  private DataHubActorFilter actors = null;

  @JsonProperty("editable") @Builder.Default
  private Boolean editable = true;

  @JsonProperty("lastUpdatedTimestamp") @Builder.Default
  private Long lastUpdatedTimestamp = null;

  public DataHubPolicyInfo displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Display name of the Policy
   * @return displayName
   **/
  @Schema(required = true, description = "Display name of the Policy")
      @NotNull

    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public DataHubPolicyInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the Policy
   * @return description
   **/
  @Schema(required = true, description = "Description of the Policy")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DataHubPolicyInfo type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of policy
   * @return type
   **/
  @Schema(required = true, description = "The type of policy")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DataHubPolicyInfo state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The state of policy, ACTIVE or INACTIVE
   * @return state
   **/
  @Schema(required = true, description = "The state of policy, ACTIVE or INACTIVE")
      @NotNull

    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public DataHubPolicyInfo resources(DataHubResourceFilter resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   * @return resources
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubResourceFilter getResources() {
    return resources;
  }

  public void setResources(DataHubResourceFilter resources) {
    this.resources = resources;
  }

  public DataHubPolicyInfo privileges(List<String> privileges) {
    this.privileges = privileges;
    return this;
  }

  public DataHubPolicyInfo addPrivilegesItem(String privilegesItem) {
    this.privileges.add(privilegesItem);
    return this;
  }

  /**
   * The privileges that the policy grants.
   * @return privileges
   **/
  @Schema(required = true, description = "The privileges that the policy grants.")
      @NotNull

    public List<String> getPrivileges() {
    return privileges;
  }

  public void setPrivileges(List<String> privileges) {
    this.privileges = privileges;
  }

  public DataHubPolicyInfo actors(DataHubActorFilter actors) {
    this.actors = actors;
    return this;
  }

  /**
   * Get actors
   * @return actors
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DataHubActorFilter getActors() {
    return actors;
  }

  public void setActors(DataHubActorFilter actors) {
    this.actors = actors;
  }

  public DataHubPolicyInfo editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

  /**
   * Whether the policy should be editable via the UI
   * @return editable
   **/
  @Schema(required = true, description = "Whether the policy should be editable via the UI")
      @NotNull

    public Boolean isEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public DataHubPolicyInfo lastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  /**
   * Timestamp when the policy was last updated
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return lastUpdatedTimestamp
   **/
  @Schema(description = "Timestamp when the policy was last updated")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public void setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubPolicyInfo dataHubPolicyInfo = (DataHubPolicyInfo) o;
    return Objects.equals(this.displayName, dataHubPolicyInfo.displayName) &&
        Objects.equals(this.description, dataHubPolicyInfo.description) &&
        Objects.equals(this.type, dataHubPolicyInfo.type) &&
        Objects.equals(this.state, dataHubPolicyInfo.state) &&
        Objects.equals(this.resources, dataHubPolicyInfo.resources) &&
        Objects.equals(this.privileges, dataHubPolicyInfo.privileges) &&
        Objects.equals(this.actors, dataHubPolicyInfo.actors) &&
        Objects.equals(this.editable, dataHubPolicyInfo.editable) &&
        Objects.equals(this.lastUpdatedTimestamp, dataHubPolicyInfo.lastUpdatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, description, type, state, resources, privileges, actors, editable, lastUpdatedTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubPolicyInfo {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
    sb.append("    actors: ").append(toIndentedString(actors)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    lastUpdatedTimestamp: ").append(toIndentedString(lastUpdatedTimestamp)).append("\n");
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