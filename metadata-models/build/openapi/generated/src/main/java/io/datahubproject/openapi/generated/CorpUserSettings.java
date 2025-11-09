package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.CorpUserAppearanceSettings;
import io.datahubproject.openapi.generated.CorpUserHomePageSettings;
import io.datahubproject.openapi.generated.CorpUserViewsSettings;
import io.datahubproject.openapi.generated.NotificationSettings;
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
 * Settings that a user can customize through the datahub ui
 */
@Schema(description = "Settings that a user can customize through the datahub ui")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorpUserSettings  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "CorpUserSettings") @Builder.Default
  private String __type = "CorpUserSettings";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"CorpUserSettings"},
  defaultValue = "CorpUserSettings")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("appearance") @Builder.Default
  private CorpUserAppearanceSettings appearance = null;

  @JsonProperty("views") @Builder.Default
  private CorpUserViewsSettings views = null;

  @JsonProperty("notificationSettings") @Builder.Default
  private NotificationSettings notificationSettings = null;

  @JsonProperty("homePage") @Builder.Default
  private CorpUserHomePageSettings homePage = null;

  public CorpUserSettings appearance(CorpUserAppearanceSettings appearance) {
    this.appearance = appearance;
    return this;
  }

  /**
   * Get appearance
   * @return appearance
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public CorpUserAppearanceSettings getAppearance() {
    return appearance;
  }

  public void setAppearance(CorpUserAppearanceSettings appearance) {
    this.appearance = appearance;
  }

  public CorpUserSettings views(CorpUserViewsSettings views) {
    this.views = views;
    return this;
  }

  /**
   * Get views
   * @return views
   **/
  @Schema(description = "")
  
    @Valid
    public CorpUserViewsSettings getViews() {
    return views;
  }

  public void setViews(CorpUserViewsSettings views) {
    this.views = views;
  }

  public CorpUserSettings notificationSettings(NotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  /**
   * Get notificationSettings
   * @return notificationSettings
   **/
  @Schema(description = "")
  
    @Valid
    public NotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  public void setNotificationSettings(NotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
  }

  public CorpUserSettings homePage(CorpUserHomePageSettings homePage) {
    this.homePage = homePage;
    return this;
  }

  /**
   * Get homePage
   * @return homePage
   **/
  @Schema(description = "")
  
    @Valid
    public CorpUserHomePageSettings getHomePage() {
    return homePage;
  }

  public void setHomePage(CorpUserHomePageSettings homePage) {
    this.homePage = homePage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorpUserSettings corpUserSettings = (CorpUserSettings) o;
    return Objects.equals(this.appearance, corpUserSettings.appearance) &&
        Objects.equals(this.views, corpUserSettings.views) &&
        Objects.equals(this.notificationSettings, corpUserSettings.notificationSettings) &&
        Objects.equals(this.homePage, corpUserSettings.homePage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appearance, views, notificationSettings, homePage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpUserSettings {\n");
    
    sb.append("    appearance: ").append(toIndentedString(appearance)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
    sb.append("    notificationSettings: ").append(toIndentedString(notificationSettings)).append("\n");
    sb.append("    homePage: ").append(toIndentedString(homePage)).append("\n");
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