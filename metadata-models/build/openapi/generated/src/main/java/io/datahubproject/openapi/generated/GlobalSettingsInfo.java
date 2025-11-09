package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ApplicationsSettings;
import io.datahubproject.openapi.generated.DocPropagationFeatureSettings;
import io.datahubproject.openapi.generated.GlobalHomePageSettings;
import io.datahubproject.openapi.generated.GlobalViewsSettings;
import io.datahubproject.openapi.generated.OAuthSettings;
import io.datahubproject.openapi.generated.SsoSettings;
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
 * DataHub Global platform settings. Careful - these should not be modified by the outside world!
 */
@Schema(description = "DataHub Global platform settings. Careful - these should not be modified by the outside world!")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GlobalSettingsInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "GlobalSettingsInfo") @Builder.Default
  private String __type = "GlobalSettingsInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"GlobalSettingsInfo"},
  defaultValue = "GlobalSettingsInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("sso") @Builder.Default
  private SsoSettings sso = null;

  @JsonProperty("oauth") @Builder.Default
  private OAuthSettings oauth = null;

  @JsonProperty("views") @Builder.Default
  private GlobalViewsSettings views = null;

  @JsonProperty("docPropagation") @Builder.Default
  private DocPropagationFeatureSettings docPropagation = null;

  @JsonProperty("homePage") @Builder.Default
  private GlobalHomePageSettings homePage = null;

  @JsonProperty("applications") @Builder.Default
  private ApplicationsSettings applications = null;

  public GlobalSettingsInfo sso(SsoSettings sso) {
    this.sso = sso;
    return this;
  }

  /**
   * Get sso
   * @return sso
   **/
  @Schema(description = "")
  
    @Valid
    public SsoSettings getSso() {
    return sso;
  }

  public void setSso(SsoSettings sso) {
    this.sso = sso;
  }

  public GlobalSettingsInfo oauth(OAuthSettings oauth) {
    this.oauth = oauth;
    return this;
  }

  /**
   * Get oauth
   * @return oauth
   **/
  @Schema(description = "")
  
    @Valid
    public OAuthSettings getOauth() {
    return oauth;
  }

  public void setOauth(OAuthSettings oauth) {
    this.oauth = oauth;
  }

  public GlobalSettingsInfo views(GlobalViewsSettings views) {
    this.views = views;
    return this;
  }

  /**
   * Get views
   * @return views
   **/
  @Schema(description = "")
  
    @Valid
    public GlobalViewsSettings getViews() {
    return views;
  }

  public void setViews(GlobalViewsSettings views) {
    this.views = views;
  }

  public GlobalSettingsInfo docPropagation(DocPropagationFeatureSettings docPropagation) {
    this.docPropagation = docPropagation;
    return this;
  }

  /**
   * Get docPropagation
   * @return docPropagation
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DocPropagationFeatureSettings getDocPropagation() {
    return docPropagation;
  }

  public void setDocPropagation(DocPropagationFeatureSettings docPropagation) {
    this.docPropagation = docPropagation;
  }

  public GlobalSettingsInfo homePage(GlobalHomePageSettings homePage) {
    this.homePage = homePage;
    return this;
  }

  /**
   * Get homePage
   * @return homePage
   **/
  @Schema(description = "")
  
    @Valid
    public GlobalHomePageSettings getHomePage() {
    return homePage;
  }

  public void setHomePage(GlobalHomePageSettings homePage) {
    this.homePage = homePage;
  }

  public GlobalSettingsInfo applications(ApplicationsSettings applications) {
    this.applications = applications;
    return this;
  }

  /**
   * Get applications
   * @return applications
   **/
  @Schema(description = "")
  
    @Valid
    public ApplicationsSettings getApplications() {
    return applications;
  }

  public void setApplications(ApplicationsSettings applications) {
    this.applications = applications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalSettingsInfo globalSettingsInfo = (GlobalSettingsInfo) o;
    return Objects.equals(this.sso, globalSettingsInfo.sso) &&
        Objects.equals(this.oauth, globalSettingsInfo.oauth) &&
        Objects.equals(this.views, globalSettingsInfo.views) &&
        Objects.equals(this.docPropagation, globalSettingsInfo.docPropagation) &&
        Objects.equals(this.homePage, globalSettingsInfo.homePage) &&
        Objects.equals(this.applications, globalSettingsInfo.applications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sso, oauth, views, docPropagation, homePage, applications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalSettingsInfo {\n");
    
    sb.append("    sso: ").append(toIndentedString(sso)).append("\n");
    sb.append("    oauth: ").append(toIndentedString(oauth)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
    sb.append("    docPropagation: ").append(toIndentedString(docPropagation)).append("\n");
    sb.append("    homePage: ").append(toIndentedString(homePage)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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