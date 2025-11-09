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
 * Group information that can be edited from UI
 */
@Schema(description = "Group information that can be edited from UI")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorpGroupEditableInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "CorpGroupEditableInfo") @Builder.Default
  private String __type = "CorpGroupEditableInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"CorpGroupEditableInfo"},
  defaultValue = "CorpGroupEditableInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("pictureLink") @Builder.Default
  private String pictureLink = "https://raw.githubusercontent.com/datahub-project/datahub/master/datahub-web-react/src/images/default_avatar.png";

  @JsonProperty("slack") @Builder.Default
  private String slack = null;

  @JsonProperty("email") @Builder.Default
  private String email = null;

  public CorpGroupEditableInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the group
   * @return description
   **/
  @Schema(description = "A description of the group")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CorpGroupEditableInfo pictureLink(String pictureLink) {
    this.pictureLink = pictureLink;
    return this;
  }

  /**
   * A URL which points to a picture which user wants to set as the photo for the group
   * @return pictureLink
   **/
  @Schema(required = true, description = "A URL which points to a picture which user wants to set as the photo for the group")
      @NotNull

    public String getPictureLink() {
    return pictureLink;
  }

  public void setPictureLink(String pictureLink) {
    this.pictureLink = pictureLink;
  }

  public CorpGroupEditableInfo slack(String slack) {
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

  public CorpGroupEditableInfo email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address to contact the group
   * @return email
   **/
  @Schema(description = "Email address to contact the group")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorpGroupEditableInfo corpGroupEditableInfo = (CorpGroupEditableInfo) o;
    return Objects.equals(this.description, corpGroupEditableInfo.description) &&
        Objects.equals(this.pictureLink, corpGroupEditableInfo.pictureLink) &&
        Objects.equals(this.slack, corpGroupEditableInfo.slack) &&
        Objects.equals(this.email, corpGroupEditableInfo.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, pictureLink, slack, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpGroupEditableInfo {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    pictureLink: ").append(toIndentedString(pictureLink)).append("\n");
    sb.append("    slack: ").append(toIndentedString(slack)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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