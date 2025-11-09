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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Linkedin corp user information that can be edited from UI
 */
@Schema(description = "Linkedin corp user information that can be edited from UI")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorpUserEditableInfo  implements OneOfCorpUserSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "CorpUserEditableInfo") @Builder.Default
  private String __type = "CorpUserEditableInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"CorpUserEditableInfo"},
  defaultValue = "CorpUserEditableInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("aboutMe") @Builder.Default
  private String aboutMe = null;

  @JsonProperty("teams") @Builder.Default
  @Valid
  private List<String> teams = new ArrayList<>();

  @JsonProperty("skills") @Builder.Default
  @Valid
  private List<String> skills = new ArrayList<>();

  @JsonProperty("pictureLink") @Builder.Default
  private String pictureLink = "assets/platforms/default_avatar.png";

  @JsonProperty("displayName") @Builder.Default
  private String displayName = null;

  @JsonProperty("title") @Builder.Default
  private String title = null;

  @JsonProperty("platforms") @Builder.Default
  @Valid
  private List<String> platforms = null;

  @JsonProperty("persona") @Builder.Default
  private String persona = null;

  @JsonProperty("slack") @Builder.Default
  private String slack = null;

  @JsonProperty("phone") @Builder.Default
  private String phone = null;

  @JsonProperty("email") @Builder.Default
  private String email = null;

  @JsonProperty("informationSources") @Builder.Default
  @Valid
  private List<String> informationSources = null;

  public CorpUserEditableInfo aboutMe(String aboutMe) {
    this.aboutMe = aboutMe;
    return this;
  }

  /**
   * About me section of the user
   * @return aboutMe
   **/
  @Schema(description = "About me section of the user")
  
    public String getAboutMe() {
    return aboutMe;
  }

  public void setAboutMe(String aboutMe) {
    this.aboutMe = aboutMe;
  }

  public CorpUserEditableInfo teams(List<String> teams) {
    this.teams = teams;
    return this;
  }

  public CorpUserEditableInfo addTeamsItem(String teamsItem) {
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Teams that the user belongs to e.g. Metadata
   * @return teams
   **/
  @Schema(required = true, description = "Teams that the user belongs to e.g. Metadata")
      @NotNull

    public List<String> getTeams() {
    return teams;
  }

  public void setTeams(List<String> teams) {
    this.teams = teams;
  }

  public CorpUserEditableInfo skills(List<String> skills) {
    this.skills = skills;
    return this;
  }

  public CorpUserEditableInfo addSkillsItem(String skillsItem) {
    this.skills.add(skillsItem);
    return this;
  }

  /**
   * Skills that the user possesses e.g. Machine Learning
   * @return skills
   **/
  @Schema(required = true, description = "Skills that the user possesses e.g. Machine Learning")
      @NotNull

    public List<String> getSkills() {
    return skills;
  }

  public void setSkills(List<String> skills) {
    this.skills = skills;
  }

  public CorpUserEditableInfo pictureLink(String pictureLink) {
    this.pictureLink = pictureLink;
    return this;
  }

  /**
   * A URL which points to a picture which user wants to set as a profile photo
   * @return pictureLink
   **/
  @Schema(required = true, description = "A URL which points to a picture which user wants to set as a profile photo")
      @NotNull

    public String getPictureLink() {
    return pictureLink;
  }

  public void setPictureLink(String pictureLink) {
    this.pictureLink = pictureLink;
  }

  public CorpUserEditableInfo displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * DataHub-native display name
   * @return displayName
   **/
  @Schema(description = "DataHub-native display name")
  
    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CorpUserEditableInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * DataHub-native Title, e.g. 'Software Engineer'
   * @return title
   **/
  @Schema(description = "DataHub-native Title, e.g. 'Software Engineer'")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CorpUserEditableInfo platforms(List<String> platforms) {
    this.platforms = platforms;
    return this;
  }

  public CorpUserEditableInfo addPlatformsItem(String platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

  /**
   * The platforms that the user commonly works with
   * @return platforms
   **/
  @Schema(description = "The platforms that the user commonly works with")
  
    public List<String> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(List<String> platforms) {
    this.platforms = platforms;
  }

  public CorpUserEditableInfo persona(String persona) {
    this.persona = persona;
    return this;
  }

  /**
   * The user's persona type, based on their role
   * @return persona
   **/
  @Schema(description = "The user's persona type, based on their role")
  
    public String getPersona() {
    return persona;
  }

  public void setPersona(String persona) {
    this.persona = persona;
  }

  public CorpUserEditableInfo slack(String slack) {
    this.slack = slack;
    return this;
  }

  /**
   * Slack handle for the user
   * @return slack
   **/
  @Schema(description = "Slack handle for the user")
  
    public String getSlack() {
    return slack;
  }

  public void setSlack(String slack) {
    this.slack = slack;
  }

  public CorpUserEditableInfo phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number to contact the user
   * @return phone
   **/
  @Schema(description = "Phone number to contact the user")
  
    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CorpUserEditableInfo email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address to contact the user
   * @return email
   **/
  @Schema(description = "Email address to contact the user")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CorpUserEditableInfo informationSources(List<String> informationSources) {
    this.informationSources = informationSources;
    return this;
  }

  public CorpUserEditableInfo addInformationSourcesItem(String informationSourcesItem) {
    if (this.informationSources == null) {
      this.informationSources = new ArrayList<>();
    }
    this.informationSources.add(informationSourcesItem);
    return this;
  }

  /**
   * Information sources that have been used to populate this CorpUserEditableInfo. These include platform resources, such as Slack members or Looker users. They can also refer to other semantic urns in the future.
   * @return informationSources
   **/
  @Schema(description = "Information sources that have been used to populate this CorpUserEditableInfo. These include platform resources, such as Slack members or Looker users. They can also refer to other semantic urns in the future.")
  
    public List<String> getInformationSources() {
    return informationSources;
  }

  public void setInformationSources(List<String> informationSources) {
    this.informationSources = informationSources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorpUserEditableInfo corpUserEditableInfo = (CorpUserEditableInfo) o;
    return Objects.equals(this.aboutMe, corpUserEditableInfo.aboutMe) &&
        Objects.equals(this.teams, corpUserEditableInfo.teams) &&
        Objects.equals(this.skills, corpUserEditableInfo.skills) &&
        Objects.equals(this.pictureLink, corpUserEditableInfo.pictureLink) &&
        Objects.equals(this.displayName, corpUserEditableInfo.displayName) &&
        Objects.equals(this.title, corpUserEditableInfo.title) &&
        Objects.equals(this.platforms, corpUserEditableInfo.platforms) &&
        Objects.equals(this.persona, corpUserEditableInfo.persona) &&
        Objects.equals(this.slack, corpUserEditableInfo.slack) &&
        Objects.equals(this.phone, corpUserEditableInfo.phone) &&
        Objects.equals(this.email, corpUserEditableInfo.email) &&
        Objects.equals(this.informationSources, corpUserEditableInfo.informationSources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aboutMe, teams, skills, pictureLink, displayName, title, platforms, persona, slack, phone, email, informationSources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpUserEditableInfo {\n");
    
    sb.append("    aboutMe: ").append(toIndentedString(aboutMe)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    pictureLink: ").append(toIndentedString(pictureLink)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
    sb.append("    slack: ").append(toIndentedString(slack)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    informationSources: ").append(toIndentedString(informationSources)).append("\n");
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