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
 * Slack Notification settings for an actor.
 */
@Schema(description = "Slack Notification settings for an actor.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackNotificationSettings   {

  @JsonProperty("userHandle") @Builder.Default
  private String userHandle = null;

  @JsonProperty("channels") @Builder.Default
  @Valid
  private List<String> channels = null;

  public SlackNotificationSettings userHandle(String userHandle) {
    this.userHandle = userHandle;
    return this;
  }

  /**
   * Optional user handle
   * @return userHandle
   **/
  @Schema(description = "Optional user handle")
  
    public String getUserHandle() {
    return userHandle;
  }

  public void setUserHandle(String userHandle) {
    this.userHandle = userHandle;
  }

  public SlackNotificationSettings channels(List<String> channels) {
    this.channels = channels;
    return this;
  }

  public SlackNotificationSettings addChannelsItem(String channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

  /**
   * Optional list of channels to send notifications to
   * @return channels
   **/
  @Schema(description = "Optional list of channels to send notifications to")
  
    public List<String> getChannels() {
    return channels;
  }

  public void setChannels(List<String> channels) {
    this.channels = channels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlackNotificationSettings slackNotificationSettings = (SlackNotificationSettings) o;
    return Objects.equals(this.userHandle, slackNotificationSettings.userHandle) &&
        Objects.equals(this.channels, slackNotificationSettings.channels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userHandle, channels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlackNotificationSettings {\n");
    
    sb.append("    userHandle: ").append(toIndentedString(userHandle)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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