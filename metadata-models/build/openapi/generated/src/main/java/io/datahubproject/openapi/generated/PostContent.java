package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.Media;
import io.datahubproject.openapi.generated.PostContentType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Content stored inside a Post.
 */
@Schema(description = "Content stored inside a Post.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostContent   {

  @JsonProperty("title") @Builder.Default
  private String title = null;

  @JsonProperty("type") @Builder.Default
  private PostContentType type = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("link") @Builder.Default
  private String link = null;

  @JsonProperty("media") @Builder.Default
  private Media media = null;

  public PostContent title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the post.
   * @return title
   **/
  @Schema(required = true, description = "Title of the post.")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PostContent type(PostContentType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PostContentType getType() {
    return type;
  }

  public void setType(PostContentType type) {
    this.type = type;
  }

  public PostContent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional description of the post.
   * @return description
   **/
  @Schema(description = "Optional description of the post.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PostContent link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Optional link that the post is associated with.
   * @return link
   **/
  @Schema(description = "Optional link that the post is associated with.")
  
    public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public PostContent media(Media media) {
    this.media = media;
    return this;
  }

  /**
   * Get media
   * @return media
   **/
  @Schema(description = "")
  
    @Valid
    public Media getMedia() {
    return media;
  }

  public void setMedia(Media media) {
    this.media = media;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostContent postContent = (PostContent) o;
    return Objects.equals(this.title, postContent.title) &&
        Objects.equals(this.type, postContent.type) &&
        Objects.equals(this.description, postContent.description) &&
        Objects.equals(this.link, postContent.link) &&
        Objects.equals(this.media, postContent.media);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, type, description, link, media);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostContent {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
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