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
/**
 * Information about a Slack conversation.
 */
@Schema(description = "Information about a Slack conversation.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackConversation   {

  @JsonProperty("id") @Builder.Default
  private String id = null;

  @JsonProperty("displayName") @Builder.Default
  private String displayName = null;

  @JsonProperty("isChannel") @Builder.Default
  private Boolean isChannel = null;

  @JsonProperty("isGroup") @Builder.Default
  private Boolean isGroup = null;

  @JsonProperty("isPrivate") @Builder.Default
  private Boolean isPrivate = null;

  @JsonProperty("isArchived") @Builder.Default
  private Boolean isArchived = null;

  @JsonProperty("isShared") @Builder.Default
  private Boolean isShared = null;

  @JsonProperty("isExtShared") @Builder.Default
  private Boolean isExtShared = null;

  @JsonProperty("isGeneral") @Builder.Default
  private Boolean isGeneral = null;

  @JsonProperty("contextTeamID") @Builder.Default
  private String contextTeamID = null;

  @JsonProperty("purpose") @Builder.Default
  private String purpose = null;

  @JsonProperty("topic") @Builder.Default
  private String topic = null;

  public SlackConversation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the Slack conversation.
   * @return id
   **/
  @Schema(required = true, description = "The unique ID of the Slack conversation.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SlackConversation displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the Slack conversation.
   * @return displayName
   **/
  @Schema(required = true, description = "The display name of the Slack conversation.")
      @NotNull

    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public SlackConversation isChannel(Boolean isChannel) {
    this.isChannel = isChannel;
    return this;
  }

  /**
   * If this is a channel.
   * @return isChannel
   **/
  @Schema(required = true, description = "If this is a channel.")
      @NotNull

    public Boolean isIsChannel() {
    return isChannel;
  }

  public void setIsChannel(Boolean isChannel) {
    this.isChannel = isChannel;
  }

  public SlackConversation isGroup(Boolean isGroup) {
    this.isGroup = isGroup;
    return this;
  }

  /**
   * If this is a channel.
   * @return isGroup
   **/
  @Schema(required = true, description = "If this is a channel.")
      @NotNull

    public Boolean isIsGroup() {
    return isGroup;
  }

  public void setIsGroup(Boolean isGroup) {
    this.isGroup = isGroup;
  }

  public SlackConversation isPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
    return this;
  }

  /**
   * If this is a private conversation.
   * @return isPrivate
   **/
  @Schema(required = true, description = "If this is a private conversation.")
      @NotNull

    public Boolean isIsPrivate() {
    return isPrivate;
  }

  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }

  public SlackConversation isArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

  /**
   * If this conversation is archived.
   * @return isArchived
   **/
  @Schema(required = true, description = "If this conversation is archived.")
      @NotNull

    public Boolean isIsArchived() {
    return isArchived;
  }

  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }

  public SlackConversation isShared(Boolean isShared) {
    this.isShared = isShared;
    return this;
  }

  /**
   * If this is a shared channel.
   * @return isShared
   **/
  @Schema(required = true, description = "If this is a shared channel.")
      @NotNull

    public Boolean isIsShared() {
    return isShared;
  }

  public void setIsShared(Boolean isShared) {
    this.isShared = isShared;
  }

  public SlackConversation isExtShared(Boolean isExtShared) {
    this.isExtShared = isExtShared;
    return this;
  }

  /**
   * If this is an externally shared channel.
   * @return isExtShared
   **/
  @Schema(required = true, description = "If this is an externally shared channel.")
      @NotNull

    public Boolean isIsExtShared() {
    return isExtShared;
  }

  public void setIsExtShared(Boolean isExtShared) {
    this.isExtShared = isExtShared;
  }

  public SlackConversation isGeneral(Boolean isGeneral) {
    this.isGeneral = isGeneral;
    return this;
  }

  /**
   * If this is a general channel.
   * @return isGeneral
   **/
  @Schema(required = true, description = "If this is a general channel.")
      @NotNull

    public Boolean isIsGeneral() {
    return isGeneral;
  }

  public void setIsGeneral(Boolean isGeneral) {
    this.isGeneral = isGeneral;
  }

  public SlackConversation contextTeamID(String contextTeamID) {
    this.contextTeamID = contextTeamID;
    return this;
  }

  /**
   * The team this conversation lives within.
   * @return contextTeamID
   **/
  @Schema(description = "The team this conversation lives within.")
  
    public String getContextTeamID() {
    return contextTeamID;
  }

  public void setContextTeamID(String contextTeamID) {
    this.contextTeamID = contextTeamID;
  }

  public SlackConversation purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * The purpose of this Slack channel, if set.
   * @return purpose
   **/
  @Schema(description = "The purpose of this Slack channel, if set.")
  
    public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public SlackConversation topic(String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * The topic of this Slack channel, if set.
   * @return topic
   **/
  @Schema(description = "The topic of this Slack channel, if set.")
  
    public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlackConversation slackConversation = (SlackConversation) o;
    return Objects.equals(this.id, slackConversation.id) &&
        Objects.equals(this.displayName, slackConversation.displayName) &&
        Objects.equals(this.isChannel, slackConversation.isChannel) &&
        Objects.equals(this.isGroup, slackConversation.isGroup) &&
        Objects.equals(this.isPrivate, slackConversation.isPrivate) &&
        Objects.equals(this.isArchived, slackConversation.isArchived) &&
        Objects.equals(this.isShared, slackConversation.isShared) &&
        Objects.equals(this.isExtShared, slackConversation.isExtShared) &&
        Objects.equals(this.isGeneral, slackConversation.isGeneral) &&
        Objects.equals(this.contextTeamID, slackConversation.contextTeamID) &&
        Objects.equals(this.purpose, slackConversation.purpose) &&
        Objects.equals(this.topic, slackConversation.topic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, isChannel, isGroup, isPrivate, isArchived, isShared, isExtShared, isGeneral, contextTeamID, purpose, topic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlackConversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    isChannel: ").append(toIndentedString(isChannel)).append("\n");
    sb.append("    isGroup: ").append(toIndentedString(isGroup)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
    sb.append("    isExtShared: ").append(toIndentedString(isExtShared)).append("\n");
    sb.append("    isGeneral: ").append(toIndentedString(isGeneral)).append("\n");
    sb.append("    contextTeamID: ").append(toIndentedString(contextTeamID)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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