package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
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
 * Information about a Corp Group ingested from a third party source
 */
@Schema(description = "Information about a Corp Group ingested from a third party source")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorpGroupInfo  implements OneOfCorpGroupSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "CorpGroupInfo") @Builder.Default
  private String __type = "CorpGroupInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"CorpGroupInfo"},
  defaultValue = "CorpGroupInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("displayName") @Builder.Default
  private String displayName = null;

  @JsonProperty("email") @Builder.Default
  private String email = null;

  @JsonProperty("admins") @Builder.Default
  @Valid
  private List<String> admins = new ArrayList<>();

  @JsonProperty("members") @Builder.Default
  @Valid
  private List<String> members = new ArrayList<>();

  @JsonProperty("groups") @Builder.Default
  @Valid
  private List<String> groups = new ArrayList<>();

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("slack") @Builder.Default
  private String slack = null;

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  public CorpGroupInfo displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The name of the group.
   * @return displayName
   **/
  @Schema(description = "The name of the group.")
  
    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CorpGroupInfo email(String email) {
    this.email = email;
    return this;
  }

  /**
   * email of this group
   * @return email
   **/
  @Schema(description = "email of this group")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CorpGroupInfo admins(List<String> admins) {
    this.admins = admins;
    return this;
  }

  public CorpGroupInfo addAdminsItem(String adminsItem) {
    this.admins.add(adminsItem);
    return this;
  }

  /**
   * owners of this group Deprecated! Replaced by Ownership aspect.
   * @return admins
   **/
  @Schema(required = true, description = "owners of this group Deprecated! Replaced by Ownership aspect.")
      @NotNull

    public List<String> getAdmins() {
    return admins;
  }

  public void setAdmins(List<String> admins) {
    this.admins = admins;
  }

  public CorpGroupInfo members(List<String> members) {
    this.members = members;
    return this;
  }

  public CorpGroupInfo addMembersItem(String membersItem) {
    this.members.add(membersItem);
    return this;
  }

  /**
   * List of ldap urn in this group. Deprecated! Replaced by GroupMembership aspect.
   * @return members
   **/
  @Schema(required = true, description = "List of ldap urn in this group. Deprecated! Replaced by GroupMembership aspect.")
      @NotNull

    public List<String> getMembers() {
    return members;
  }

  public void setMembers(List<String> members) {
    this.members = members;
  }

  public CorpGroupInfo groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public CorpGroupInfo addGroupsItem(String groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * List of groups in this group. Deprecated! This field is unused.
   * @return groups
   **/
  @Schema(required = true, description = "List of groups in this group. Deprecated! This field is unused.")
      @NotNull

    public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public CorpGroupInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the group.
   * @return description
   **/
  @Schema(description = "A description of the group.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CorpGroupInfo slack(String slack) {
    this.slack = slack;
    return this;
  }

  /**
   * Slack channel for the group
   * @return slack
   **/
  @Schema(description = "Slack channel for the group")
  
    public String getSlack() {
    return slack;
  }

  public void setSlack(String slack) {
    this.slack = slack;
  }

  public CorpGroupInfo created(AuditStamp created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @Schema(description = "")
  
    @Valid
    public AuditStamp getCreated() {
    return created;
  }

  public void setCreated(AuditStamp created) {
    this.created = created;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorpGroupInfo corpGroupInfo = (CorpGroupInfo) o;
    return Objects.equals(this.displayName, corpGroupInfo.displayName) &&
        Objects.equals(this.email, corpGroupInfo.email) &&
        Objects.equals(this.admins, corpGroupInfo.admins) &&
        Objects.equals(this.members, corpGroupInfo.members) &&
        Objects.equals(this.groups, corpGroupInfo.groups) &&
        Objects.equals(this.description, corpGroupInfo.description) &&
        Objects.equals(this.slack, corpGroupInfo.slack) &&
        Objects.equals(this.created, corpGroupInfo.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, email, admins, members, groups, description, slack, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpGroupInfo {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    admins: ").append(toIndentedString(admins)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    slack: ").append(toIndentedString(slack)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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