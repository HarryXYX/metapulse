package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.RoleGroup;
import io.datahubproject.openapi.generated.RoleUser;
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
 * Provisioned users and groups of a role
 */
@Schema(description = "Provisioned users and groups of a role")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Actors  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "Actors") @Builder.Default
  private String __type = "Actors";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"Actors"},
  defaultValue = "Actors")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("users") @Builder.Default
  @Valid
  private List<RoleUser> users = null;

  @JsonProperty("groups") @Builder.Default
  @Valid
  private List<RoleGroup> groups = null;

  public Actors users(List<RoleUser> users) {
    this.users = users;
    return this;
  }

  public Actors addUsersItem(RoleUser usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * List of provisioned users of a role
   * @return users
   **/
  @Schema(description = "List of provisioned users of a role")
      @Valid
    public List<RoleUser> getUsers() {
    return users;
  }

  public void setUsers(List<RoleUser> users) {
    this.users = users;
  }

  public Actors groups(List<RoleGroup> groups) {
    this.groups = groups;
    return this;
  }

  public Actors addGroupsItem(RoleGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * List of provisioned groups of a role
   * @return groups
   **/
  @Schema(description = "List of provisioned groups of a role")
      @Valid
    public List<RoleGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<RoleGroup> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Actors actors = (Actors) o;
    return Objects.equals(this.users, actors.users) &&
        Objects.equals(this.groups, actors.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Actors {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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