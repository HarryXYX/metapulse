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
 * Information about a Slack channel. Namespace for the urn of this entity should be &#x27;slack-channel&#x27;. See GenericEntityKey.pdl for details.
 */
@Schema(description = "Information about a Slack channel. Namespace for the urn of this entity should be 'slack-channel'. See GenericEntityKey.pdl for details.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackChannel   {

  @JsonProperty("id") @Builder.Default
  private String id = null;

  @JsonProperty("displayName") @Builder.Default
  private String displayName = null;

  @JsonProperty("topic") @Builder.Default
  private String topic = null;

  public SlackChannel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the Slack entity. I.e., memberID, or channelID.
   * @return id
   **/
  @Schema(required = true, description = "The unique ID of the Slack entity. I.e., memberID, or channelID.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SlackChannel displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the Slack entity. I.e., if this is a member, it would be the member's name.
   * @return displayName
   **/
  @Schema(required = true, description = "The display name of the Slack entity. I.e., if this is a member, it would be the member's name.")
      @NotNull

    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public SlackChannel topic(String topic) {
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
    SlackChannel slackChannel = (SlackChannel) o;
    return Objects.equals(this.id, slackChannel.id) &&
        Objects.equals(this.displayName, slackChannel.displayName) &&
        Objects.equals(this.topic, slackChannel.topic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, topic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlackChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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