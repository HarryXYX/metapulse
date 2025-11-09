package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Information about a Slack user.
 */
@Schema(description = "Information about a Slack user.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackUserInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "SlackUserInfo") @Builder.Default
  private String __type = "SlackUserInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"SlackUserInfo"},
  defaultValue = "SlackUserInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("slackInstance") @Builder.Default
  private String slackInstance = null;

  @JsonProperty("id") @Builder.Default
  private String id = null;

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("realName") @Builder.Default
  private String realName = null;

  @JsonProperty("displayName") @Builder.Default
  private String displayName = null;

  @JsonProperty("email") @Builder.Default
  private String email = null;

  @JsonProperty("teamId") @Builder.Default
  private String teamId = null;

  @JsonProperty("isDeleted") @Builder.Default
  private Boolean isDeleted = null;

  @JsonProperty("isAdmin") @Builder.Default
  private Boolean isAdmin = null;

  @JsonProperty("isOwner") @Builder.Default
  private Boolean isOwner = null;

  @JsonProperty("isPrimaryOwner") @Builder.Default
  private Boolean isPrimaryOwner = null;

  @JsonProperty("isBot") @Builder.Default
  private Boolean isBot = null;

  @JsonProperty("timezone") @Builder.Default
  private String timezone = null;

  @JsonProperty("timezoneOffset") @Builder.Default
  private Integer timezoneOffset = null;

  @JsonProperty("title") @Builder.Default
  private String title = null;

  @JsonProperty("phone") @Builder.Default
  private String phone = null;

  @JsonProperty("profilePictureUrl") @Builder.Default
  private String profilePictureUrl = null;

  @JsonProperty("statusText") @Builder.Default
  private String statusText = null;

  @JsonProperty("statusEmoji") @Builder.Default
  private String statusEmoji = null;

  @JsonProperty("lastUpdatedSeconds") @Builder.Default
  private Long lastUpdatedSeconds = null;

  public SlackUserInfo slackInstance(String slackInstance) {
    this.slackInstance = slackInstance;
    return this;
  }

  /**
   * The dataplatform instance that this Slack member belongs to.
   * @return slackInstance
   **/
  @Schema(required = true, description = "The dataplatform instance that this Slack member belongs to.")
      @NotNull

    public String getSlackInstance() {
    return slackInstance;
  }

  public void setSlackInstance(String slackInstance) {
    this.slackInstance = slackInstance;
  }

  public SlackUserInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the Slack member.
   * @return id
   **/
  @Schema(required = true, description = "The unique identifier for the Slack member.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SlackUserInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The username of the Slack member.
   * @return name
   **/
  @Schema(required = true, description = "The username of the Slack member.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SlackUserInfo realName(String realName) {
    this.realName = realName;
    return this;
  }

  /**
   * The real name of the Slack member.
   * @return realName
   **/
  @Schema(required = true, description = "The real name of the Slack member.")
      @NotNull

    public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  public SlackUserInfo displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the Slack member.
   * @return displayName
   **/
  @Schema(required = true, description = "The display name of the Slack member.")
      @NotNull

    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public SlackUserInfo email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email associated with the Slack member.
   * @return email
   **/
  @Schema(description = "The email associated with the Slack member.")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SlackUserInfo teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * The ID associated with the Slack team.
   * @return teamId
   **/
  @Schema(required = true, description = "The ID associated with the Slack team.")
      @NotNull

    public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public SlackUserInfo isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Whether the member is deleted or not.
   * @return isDeleted
   **/
  @Schema(required = true, description = "Whether the member is deleted or not.")
      @NotNull

    public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public SlackUserInfo isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

  /**
   * Whether the member is an admin.
   * @return isAdmin
   **/
  @Schema(required = true, description = "Whether the member is an admin.")
      @NotNull

    public Boolean isIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public SlackUserInfo isOwner(Boolean isOwner) {
    this.isOwner = isOwner;
    return this;
  }

  /**
   * Whether the member is an owner.
   * @return isOwner
   **/
  @Schema(required = true, description = "Whether the member is an owner.")
      @NotNull

    public Boolean isIsOwner() {
    return isOwner;
  }

  public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }

  public SlackUserInfo isPrimaryOwner(Boolean isPrimaryOwner) {
    this.isPrimaryOwner = isPrimaryOwner;
    return this;
  }

  /**
   * Whether the member is a primary owner.
   * @return isPrimaryOwner
   **/
  @Schema(required = true, description = "Whether the member is a primary owner.")
      @NotNull

    public Boolean isIsPrimaryOwner() {
    return isPrimaryOwner;
  }

  public void setIsPrimaryOwner(Boolean isPrimaryOwner) {
    this.isPrimaryOwner = isPrimaryOwner;
  }

  public SlackUserInfo isBot(Boolean isBot) {
    this.isBot = isBot;
    return this;
  }

  /**
   * Whether the member is a bot.
   * @return isBot
   **/
  @Schema(required = true, description = "Whether the member is a bot.")
      @NotNull

    public Boolean isIsBot() {
    return isBot;
  }

  public void setIsBot(Boolean isBot) {
    this.isBot = isBot;
  }

  public SlackUserInfo timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The timezone of the Slack member.
   * @return timezone
   **/
  @Schema(description = "The timezone of the Slack member.")
  
    public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public SlackUserInfo timezoneOffset(Integer timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
    return this;
  }

  /**
   * The timezone offset of the Slack member.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return timezoneOffset
   **/
  @Schema(description = "The timezone offset of the Slack member.")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getTimezoneOffset() {
    return timezoneOffset;
  }

  public void setTimezoneOffset(Integer timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
  }

  public SlackUserInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the Slack member.
   * @return title
   **/
  @Schema(description = "The title of the Slack member.")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SlackUserInfo phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * The phone number of the Slack member.
   * @return phone
   **/
  @Schema(description = "The phone number of the Slack member.")
  
    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public SlackUserInfo profilePictureUrl(String profilePictureUrl) {
    this.profilePictureUrl = profilePictureUrl;
    return this;
  }

  /**
   * The URL of the member's profile picture.
   * @return profilePictureUrl
   **/
  @Schema(description = "The URL of the member's profile picture.")
  
    public String getProfilePictureUrl() {
    return profilePictureUrl;
  }

  public void setProfilePictureUrl(String profilePictureUrl) {
    this.profilePictureUrl = profilePictureUrl;
  }

  public SlackUserInfo statusText(String statusText) {
    this.statusText = statusText;
    return this;
  }

  /**
   * The status text of the Slack member.
   * @return statusText
   **/
  @Schema(description = "The status text of the Slack member.")
  
    public String getStatusText() {
    return statusText;
  }

  public void setStatusText(String statusText) {
    this.statusText = statusText;
  }

  public SlackUserInfo statusEmoji(String statusEmoji) {
    this.statusEmoji = statusEmoji;
    return this;
  }

  /**
   * The status emoji of the Slack member.
   * @return statusEmoji
   **/
  @Schema(description = "The status emoji of the Slack member.")
  
    public String getStatusEmoji() {
    return statusEmoji;
  }

  public void setStatusEmoji(String statusEmoji) {
    this.statusEmoji = statusEmoji;
  }

  public SlackUserInfo lastUpdatedSeconds(Long lastUpdatedSeconds) {
    this.lastUpdatedSeconds = lastUpdatedSeconds;
    return this;
  }

  /**
   * The timestamp of when the member was last updated. (in seconds)
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return lastUpdatedSeconds
   **/
  @Schema(description = "The timestamp of when the member was last updated. (in seconds)")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getLastUpdatedSeconds() {
    return lastUpdatedSeconds;
  }

  public void setLastUpdatedSeconds(Long lastUpdatedSeconds) {
    this.lastUpdatedSeconds = lastUpdatedSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlackUserInfo slackUserInfo = (SlackUserInfo) o;
    return Objects.equals(this.slackInstance, slackUserInfo.slackInstance) &&
        Objects.equals(this.id, slackUserInfo.id) &&
        Objects.equals(this.name, slackUserInfo.name) &&
        Objects.equals(this.realName, slackUserInfo.realName) &&
        Objects.equals(this.displayName, slackUserInfo.displayName) &&
        Objects.equals(this.email, slackUserInfo.email) &&
        Objects.equals(this.teamId, slackUserInfo.teamId) &&
        Objects.equals(this.isDeleted, slackUserInfo.isDeleted) &&
        Objects.equals(this.isAdmin, slackUserInfo.isAdmin) &&
        Objects.equals(this.isOwner, slackUserInfo.isOwner) &&
        Objects.equals(this.isPrimaryOwner, slackUserInfo.isPrimaryOwner) &&
        Objects.equals(this.isBot, slackUserInfo.isBot) &&
        Objects.equals(this.timezone, slackUserInfo.timezone) &&
        Objects.equals(this.timezoneOffset, slackUserInfo.timezoneOffset) &&
        Objects.equals(this.title, slackUserInfo.title) &&
        Objects.equals(this.phone, slackUserInfo.phone) &&
        Objects.equals(this.profilePictureUrl, slackUserInfo.profilePictureUrl) &&
        Objects.equals(this.statusText, slackUserInfo.statusText) &&
        Objects.equals(this.statusEmoji, slackUserInfo.statusEmoji) &&
        Objects.equals(this.lastUpdatedSeconds, slackUserInfo.lastUpdatedSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slackInstance, id, name, realName, displayName, email, teamId, isDeleted, isAdmin, isOwner, isPrimaryOwner, isBot, timezone, timezoneOffset, title, phone, profilePictureUrl, statusText, statusEmoji, lastUpdatedSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlackUserInfo {\n");
    
    sb.append("    slackInstance: ").append(toIndentedString(slackInstance)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    realName: ").append(toIndentedString(realName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
    sb.append("    isPrimaryOwner: ").append(toIndentedString(isPrimaryOwner)).append("\n");
    sb.append("    isBot: ").append(toIndentedString(isBot)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    profilePictureUrl: ").append(toIndentedString(profilePictureUrl)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
    sb.append("    statusEmoji: ").append(toIndentedString(statusEmoji)).append("\n");
    sb.append("    lastUpdatedSeconds: ").append(toIndentedString(lastUpdatedSeconds)).append("\n");
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