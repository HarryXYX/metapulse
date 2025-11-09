package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.EmailNotificationSettings;
import io.datahubproject.openapi.generated.NotificationSinkType;
import io.datahubproject.openapi.generated.SlackNotificationSettings;
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
 * Notification settings for an actor or subscription.
 */
@Schema(description = "Notification settings for an actor or subscription.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationSettings   {

  @JsonProperty("sinkTypes") @Builder.Default
  @Valid
  private List<NotificationSinkType> sinkTypes = new ArrayList<>();

  @JsonProperty("slackSettings") @Builder.Default
  private SlackNotificationSettings slackSettings = null;

  @JsonProperty("emailSettings") @Builder.Default
  private EmailNotificationSettings emailSettings = null;

  public NotificationSettings sinkTypes(List<NotificationSinkType> sinkTypes) {
    this.sinkTypes = sinkTypes;
    return this;
  }

  public NotificationSettings addSinkTypesItem(NotificationSinkType sinkTypesItem) {
    this.sinkTypes.add(sinkTypesItem);
    return this;
  }

  /**
   * Sink types that notifications are sent to.
   * @return sinkTypes
   **/
  @Schema(required = true, description = "Sink types that notifications are sent to.")
      @NotNull
    @Valid
    public List<NotificationSinkType> getSinkTypes() {
    return sinkTypes;
  }

  public void setSinkTypes(List<NotificationSinkType> sinkTypes) {
    this.sinkTypes = sinkTypes;
  }

  public NotificationSettings slackSettings(SlackNotificationSettings slackSettings) {
    this.slackSettings = slackSettings;
    return this;
  }

  /**
   * Get slackSettings
   * @return slackSettings
   **/
  @Schema(description = "")
  
    @Valid
    public SlackNotificationSettings getSlackSettings() {
    return slackSettings;
  }

  public void setSlackSettings(SlackNotificationSettings slackSettings) {
    this.slackSettings = slackSettings;
  }

  public NotificationSettings emailSettings(EmailNotificationSettings emailSettings) {
    this.emailSettings = emailSettings;
    return this;
  }

  /**
   * Get emailSettings
   * @return emailSettings
   **/
  @Schema(description = "")
  
    @Valid
    public EmailNotificationSettings getEmailSettings() {
    return emailSettings;
  }

  public void setEmailSettings(EmailNotificationSettings emailSettings) {
    this.emailSettings = emailSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSettings notificationSettings = (NotificationSettings) o;
    return Objects.equals(this.sinkTypes, notificationSettings.sinkTypes) &&
        Objects.equals(this.slackSettings, notificationSettings.slackSettings) &&
        Objects.equals(this.emailSettings, notificationSettings.emailSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sinkTypes, slackSettings, emailSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSettings {\n");
    
    sb.append("    sinkTypes: ").append(toIndentedString(sinkTypes)).append("\n");
    sb.append("    slackSettings: ").append(toIndentedString(slackSettings)).append("\n");
    sb.append("    emailSettings: ").append(toIndentedString(emailSettings)).append("\n");
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