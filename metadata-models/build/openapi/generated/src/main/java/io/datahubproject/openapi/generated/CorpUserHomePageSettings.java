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
 * Settings related to the home page for a user
 */
@Schema(description = "Settings related to the home page for a user")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorpUserHomePageSettings   {

  @JsonProperty("pageTemplate") @Builder.Default
  private String pageTemplate = null;

  @JsonProperty("dismissedAnnouncements") @Builder.Default
  @Valid
  private List<String> dismissedAnnouncements = null;

  public CorpUserHomePageSettings pageTemplate(String pageTemplate) {
    this.pageTemplate = pageTemplate;
    return this;
  }

  /**
   * The page template that will be rendered in the UI by default for this user
   * @return pageTemplate
   **/
  @Schema(description = "The page template that will be rendered in the UI by default for this user")
  
    public String getPageTemplate() {
    return pageTemplate;
  }

  public void setPageTemplate(String pageTemplate) {
    this.pageTemplate = pageTemplate;
  }

  public CorpUserHomePageSettings dismissedAnnouncements(List<String> dismissedAnnouncements) {
    this.dismissedAnnouncements = dismissedAnnouncements;
    return this;
  }

  public CorpUserHomePageSettings addDismissedAnnouncementsItem(String dismissedAnnouncementsItem) {
    if (this.dismissedAnnouncements == null) {
      this.dismissedAnnouncements = new ArrayList<>();
    }
    this.dismissedAnnouncements.add(dismissedAnnouncementsItem);
    return this;
  }

  /**
   * The list of announcement urns that have been dismissed by the user
   * @return dismissedAnnouncements
   **/
  @Schema(description = "The list of announcement urns that have been dismissed by the user")
  
    public List<String> getDismissedAnnouncements() {
    return dismissedAnnouncements;
  }

  public void setDismissedAnnouncements(List<String> dismissedAnnouncements) {
    this.dismissedAnnouncements = dismissedAnnouncements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorpUserHomePageSettings corpUserHomePageSettings = (CorpUserHomePageSettings) o;
    return Objects.equals(this.pageTemplate, corpUserHomePageSettings.pageTemplate) &&
        Objects.equals(this.dismissedAnnouncements, corpUserHomePageSettings.dismissedAnnouncements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageTemplate, dismissedAnnouncements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpUserHomePageSettings {\n");
    
    sb.append("    pageTemplate: ").append(toIndentedString(pageTemplate)).append("\n");
    sb.append("    dismissedAnnouncements: ").append(toIndentedString(dismissedAnnouncements)).append("\n");
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