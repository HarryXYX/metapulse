package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Information used to filter DataHub actors.
 */
@Schema(description = "Information used to filter DataHub actors.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubActorFilter   {

  @JsonProperty("users") @Builder.Default
  @Valid
  private List<String> users = null;

  @JsonProperty("groups") @Builder.Default
  @Valid
  private List<String> groups = null;

  @JsonProperty("resourceOwners") @Builder.Default
  private Boolean resourceOwners = false;

  @JsonProperty("resourceOwnersTypes") @Builder.Default
  @Valid
  private List<String> resourceOwnersTypes = null;

  @JsonProperty("allUsers") @Builder.Default
  private Boolean allUsers = false;

  @JsonProperty("allGroups") @Builder.Default
  private Boolean allGroups = false;

  @JsonProperty("roles") @Builder.Default
  @Valid
  private List<String> roles = null;

  public DataHubActorFilter users(List<String> users) {
    this.users = users;
    return this;
  }

  public DataHubActorFilter addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * A specific set of users to apply the policy to (disjunctive)
   * @return users
   **/
  @Schema(description = "A specific set of users to apply the policy to (disjunctive)")
  
    public List<String> getUsers() {
    return users;
  }

  public void setUsers(List<String> users) {
    this.users = users;
  }

  public DataHubActorFilter groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public DataHubActorFilter addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * A specific set of groups to apply the policy to (disjunctive)
   * @return groups
   **/
  @Schema(description = "A specific set of groups to apply the policy to (disjunctive)")
  
    public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public DataHubActorFilter resourceOwners(Boolean resourceOwners) {
    this.resourceOwners = resourceOwners;
    return this;
  }

  /**
   * Whether the filter should return true for owners of a particular resource. Only applies to policies of type 'Metadata', which have a resource associated with them.
   * @return resourceOwners
   **/
  @Schema(required = true, description = "Whether the filter should return true for owners of a particular resource. Only applies to policies of type 'Metadata', which have a resource associated with them.")
      @NotNull

    public Boolean isResourceOwners() {
    return resourceOwners;
  }

  public void setResourceOwners(Boolean resourceOwners) {
    this.resourceOwners = resourceOwners;
  }

  public DataHubActorFilter resourceOwnersTypes(List<String> resourceOwnersTypes) {
    this.resourceOwnersTypes = resourceOwnersTypes;
    return this;
  }

  public DataHubActorFilter addResourceOwnersTypesItem(String resourceOwnersTypesItem) {
    if (this.resourceOwnersTypes == null) {
      this.resourceOwnersTypes = new ArrayList<>();
    }
    this.resourceOwnersTypes.add(resourceOwnersTypesItem);
    return this;
  }

  /**
   * Define type of ownership for the policy
   * @return resourceOwnersTypes
   **/
  @Schema(description = "Define type of ownership for the policy")
  
    public List<String> getResourceOwnersTypes() {
    return resourceOwnersTypes;
  }

  public void setResourceOwnersTypes(List<String> resourceOwnersTypes) {
    this.resourceOwnersTypes = resourceOwnersTypes;
  }

  public DataHubActorFilter allUsers(Boolean allUsers) {
    this.allUsers = allUsers;
    return this;
  }

  /**
   * Whether the filter should apply to all users.
   * @return allUsers
   **/
  @Schema(required = true, description = "Whether the filter should apply to all users.")
      @NotNull

    public Boolean isAllUsers() {
    return allUsers;
  }

  public void setAllUsers(Boolean allUsers) {
    this.allUsers = allUsers;
  }

  public DataHubActorFilter allGroups(Boolean allGroups) {
    this.allGroups = allGroups;
    return this;
  }

  /**
   * Whether the filter should apply to all groups.
   * @return allGroups
   **/
  @Schema(required = true, description = "Whether the filter should apply to all groups.")
      @NotNull

    public Boolean isAllGroups() {
    return allGroups;
  }

  public void setAllGroups(Boolean allGroups) {
    this.allGroups = allGroups;
  }

  public DataHubActorFilter roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public DataHubActorFilter addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * A specific set of roles to apply the policy to (disjunctive).
   * @return roles
   **/
  @Schema(description = "A specific set of roles to apply the policy to (disjunctive).")
  
    public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubActorFilter dataHubActorFilter = (DataHubActorFilter) o;
    return Objects.equals(this.users, dataHubActorFilter.users) &&
        Objects.equals(this.groups, dataHubActorFilter.groups) &&
        Objects.equals(this.resourceOwners, dataHubActorFilter.resourceOwners) &&
        Objects.equals(this.resourceOwnersTypes, dataHubActorFilter.resourceOwnersTypes) &&
        Objects.equals(this.allUsers, dataHubActorFilter.allUsers) &&
        Objects.equals(this.allGroups, dataHubActorFilter.allGroups) &&
        Objects.equals(this.roles, dataHubActorFilter.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, groups, resourceOwners, resourceOwnersTypes, allUsers, allGroups, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubActorFilter {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    resourceOwners: ").append(toIndentedString(resourceOwners)).append("\n");
    sb.append("    resourceOwnersTypes: ").append(toIndentedString(resourceOwnersTypes)).append("\n");
    sb.append("    allUsers: ").append(toIndentedString(allUsers)).append("\n");
    sb.append("    allGroups: ").append(toIndentedString(allGroups)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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