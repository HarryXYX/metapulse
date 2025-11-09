package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.PostInfoAspectResponseV2;
import io.datahubproject.openapi.generated.PostKeyAspectResponseV2;
import io.datahubproject.openapi.generated.SubTypesAspectResponseV2;
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
public class PostEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("postKey") @Builder.Default
  private PostKeyAspectResponseV2 postKey = null;

  @JsonProperty("postInfo") @Builder.Default
  private PostInfoAspectResponseV2 postInfo = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectResponseV2 subTypes = null;

  public PostEntityResponseV2 urn(String urn) {
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

  public PostEntityResponseV2 postKey(PostKeyAspectResponseV2 postKey) {
    this.postKey = postKey;
    return this;
  }

  /**
   * Get postKey
   * @return postKey
   **/
  @Schema(description = "")
  
    @Valid
    public PostKeyAspectResponseV2 getPostKey() {
    return postKey;
  }

  public void setPostKey(PostKeyAspectResponseV2 postKey) {
    this.postKey = postKey;
  }

  public PostEntityResponseV2 postInfo(PostInfoAspectResponseV2 postInfo) {
    this.postInfo = postInfo;
    return this;
  }

  /**
   * Get postInfo
   * @return postInfo
   **/
  @Schema(description = "")
  
    @Valid
    public PostInfoAspectResponseV2 getPostInfo() {
    return postInfo;
  }

  public void setPostInfo(PostInfoAspectResponseV2 postInfo) {
    this.postInfo = postInfo;
  }

  public PostEntityResponseV2 subTypes(SubTypesAspectResponseV2 subTypes) {
    this.subTypes = subTypes;
    return this;
  }

  /**
   * Get subTypes
   * @return subTypes
   **/
  @Schema(description = "")
  
    @Valid
    public SubTypesAspectResponseV2 getSubTypes() {
    return subTypes;
  }

  public void setSubTypes(SubTypesAspectResponseV2 subTypes) {
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
    PostEntityResponseV2 postEntityResponseV2 = (PostEntityResponseV2) o;
    return Objects.equals(this.urn, postEntityResponseV2.urn) &&
        Objects.equals(this.postKey, postEntityResponseV2.postKey) &&
        Objects.equals(this.postInfo, postEntityResponseV2.postInfo) &&
        Objects.equals(this.subTypes, postEntityResponseV2.subTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, postKey, postInfo, subTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostEntityResponseV2 {\n");
    
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