package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.PostContent;
import io.datahubproject.openapi.generated.PostType;
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
 * Information about a DataHub Post.
 */
@Schema(description = "Information about a DataHub Post.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "PostInfo") @Builder.Default
  private String __type = "PostInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"PostInfo"},
  defaultValue = "PostInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("type") @Builder.Default
  private PostType type = null;

  @JsonProperty("content") @Builder.Default
  private PostContent content = null;

  @JsonProperty("created") @Builder.Default
  private Long created = null;

  @JsonProperty("lastModified") @Builder.Default
  private Long lastModified = null;

  @JsonProperty("auditStamp") @Builder.Default
  private AuditStamp auditStamp = null;

  @JsonProperty("target") @Builder.Default
  private String target = null;

  public PostInfo type(PostType type) {
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
    public PostType getType() {
    return type;
  }

  public void setType(PostType type) {
    this.type = type;
  }

  public PostInfo content(PostContent content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PostContent getContent() {
    return content;
  }

  public void setContent(PostContent content) {
    this.content = content;
  }

  public PostInfo created(Long created) {
    this.created = created;
    return this;
  }

  /**
   * The time at which the post was initially created
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return created
   **/
  @Schema(required = true, description = "The time at which the post was initially created")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public PostInfo lastModified(Long lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * The time at which the post was last modified
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return lastModified
   **/
  @Schema(required = true, description = "The time at which the post was last modified")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getLastModified() {
    return lastModified;
  }

  public void setLastModified(Long lastModified) {
    this.lastModified = lastModified;
  }

  public PostInfo auditStamp(AuditStamp auditStamp) {
    this.auditStamp = auditStamp;
    return this;
  }

  /**
   * Get auditStamp
   * @return auditStamp
   **/
  @Schema(description = "")
  
    @Valid
    public AuditStamp getAuditStamp() {
    return auditStamp;
  }

  public void setAuditStamp(AuditStamp auditStamp) {
    this.auditStamp = auditStamp;
  }

  public PostInfo target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Optional Entity URN that the post is associated with.
   * @return target
   **/
  @Schema(description = "Optional Entity URN that the post is associated with.")
  
    public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostInfo postInfo = (PostInfo) o;
    return Objects.equals(this.type, postInfo.type) &&
        Objects.equals(this.content, postInfo.content) &&
        Objects.equals(this.created, postInfo.created) &&
        Objects.equals(this.lastModified, postInfo.lastModified) &&
        Objects.equals(this.auditStamp, postInfo.auditStamp) &&
        Objects.equals(this.target, postInfo.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, content, created, lastModified, auditStamp, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostInfo {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    auditStamp: ").append(toIndentedString(auditStamp)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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