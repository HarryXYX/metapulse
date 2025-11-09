package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.PostInfoAspectRequestV2;
import io.datahubproject.openapi.generated.PostKeyAspectRequestV2;
import io.datahubproject.openapi.generated.SubTypesAspectRequestV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Post object.
 */
@Schema(description = "Post object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("postKey") @Builder.Default
  private PostKeyAspectRequestV2 postKey = null;

  @JsonProperty("postInfo") @Builder.Default
  private PostInfoAspectRequestV2 postInfo = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectRequestV2 subTypes = null;

  public PostEntityRequestV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for post
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for post")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public PostEntityRequestV2 postKey(PostKeyAspectRequestV2 postKey) {
    this.postKey = postKey;
    return this;
  }

  /**
   * Get postKey
   * @return postKey
   **/
  @Schema(description = "")
  
    @Valid
    public PostKeyAspectRequestV2 getPostKey() {
    return postKey;
  }

  public void setPostKey(PostKeyAspectRequestV2 postKey) {
    this.postKey = postKey;
  }

  public PostEntityRequestV2 postInfo(PostInfoAspectRequestV2 postInfo) {
    this.postInfo = postInfo;
    return this;
  }

  /**
   * Get postInfo
   * @return postInfo
   **/
  @Schema(description = "")
  
    @Valid
    public PostInfoAspectRequestV2 getPostInfo() {
    return postInfo;
  }

  public void setPostInfo(PostInfoAspectRequestV2 postInfo) {
    this.postInfo = postInfo;
  }

  public PostEntityRequestV2 subTypes(SubTypesAspectRequestV2 subTypes) {
    this.subTypes = subTypes;
    return this;
  }

  /**
   * Get subTypes
   * @return subTypes
   **/
  @Schema(description = "")
  
    @Valid
    public SubTypesAspectRequestV2 getSubTypes() {
    return subTypes;
  }

  public void setSubTypes(SubTypesAspectRequestV2 subTypes) {
    this.subTypes = subTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostEntityRequestV2 postEntityRequestV2 = (PostEntityRequestV2) o;
    return Objects.equals(this.urn, postEntityRequestV2.urn) &&
        Objects.equals(this.postKey, postEntityRequestV2.postKey) &&
        Objects.equals(this.postInfo, postEntityRequestV2.postInfo) &&
        Objects.equals(this.subTypes, postEntityRequestV2.subTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, postKey, postInfo, subTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostEntityRequestV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    postKey: ").append(toIndentedString(postKey)).append("\n");
    sb.append("    postInfo: ").append(toIndentedString(postInfo)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
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