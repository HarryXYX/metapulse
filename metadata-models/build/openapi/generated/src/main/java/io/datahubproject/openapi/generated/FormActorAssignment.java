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
 * FormActorAssignment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormActorAssignment   {

  @JsonProperty("owners") @Builder.Default
  private Boolean owners = true;

  @JsonProperty("groups") @Builder.Default
  @Valid
  private List<String> groups = null;

  @JsonProperty("users") @Builder.Default
  @Valid
  private List<String> users = null;

  public FormActorAssignment owners(Boolean owners) {
    this.owners = owners;
    return this;
  }

  /**
   * Whether the form should be assigned to the owners of assets that it is applied to. This is the default.
   * @return owners
   **/
  @Schema(required = true, description = "Whether the form should be assigned to the owners of assets that it is applied to. This is the default.")
      @NotNull

    public Boolean isOwners() {
    return owners;
  }

  public void setOwners(Boolean owners) {
    this.owners = owners;
  }

  public FormActorAssignment groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public FormActorAssignment addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Optional: Specific set of groups that are targeted by this form assignment.
   * @return groups
   **/
  @Schema(description = "Optional: Specific set of groups that are targeted by this form assignment.")
  
    public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public FormActorAssignment users(List<String> users) {
    this.users = users;
    return this;
  }

  public FormActorAssignment addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Optional: Specific set of users that are targeted by this form assignment.
   * @return users
   **/
  @Schema(description = "Optional: Specific set of users that are targeted by this form assignment.")
  
    public List<String> getUsers() {
    return users;
  }

  public void setUsers(List<String> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormActorAssignment formActorAssignment = (FormActorAssignment) o;
    return Objects.equals(this.owners, formActorAssignment.owners) &&
        Objects.equals(this.groups, formActorAssignment.groups) &&
        Objects.equals(this.users, formActorAssignment.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owners, groups, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormActorAssignment {\n");
    
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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