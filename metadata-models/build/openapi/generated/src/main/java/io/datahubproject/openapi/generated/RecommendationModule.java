package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.RecommendationContent;
import io.datahubproject.openapi.generated.RecommendationRenderType;
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
 * RecommendationModule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecommendationModule   {

  @JsonProperty("title") @Builder.Default
  private String title = null;

  @JsonProperty("moduleId") @Builder.Default
  private String moduleId = null;

  @JsonProperty("renderType") @Builder.Default
  private RecommendationRenderType renderType = null;

  @JsonProperty("content") @Builder.Default
  @Valid
  private List<RecommendationContent> content = new ArrayList<>();

  public RecommendationModule title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the module to display
   * @return title
   **/
  @Schema(required = true, description = "Title of the module to display")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RecommendationModule moduleId(String moduleId) {
    this.moduleId = moduleId;
    return this;
  }

  /**
   * Unique id of the module being recommended
   * @return moduleId
   **/
  @Schema(required = true, description = "Unique id of the module being recommended")
      @NotNull

    public String getModuleId() {
    return moduleId;
  }

  public void setModuleId(String moduleId) {
    this.moduleId = moduleId;
  }

  public RecommendationModule renderType(RecommendationRenderType renderType) {
    this.renderType = renderType;
    return this;
  }

  /**
   * Get renderType
   * @return renderType
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public RecommendationRenderType getRenderType() {
    return renderType;
  }

  public void setRenderType(RecommendationRenderType renderType) {
    this.renderType = renderType;
  }

  public RecommendationModule content(List<RecommendationContent> content) {
    this.content = content;
    return this;
  }

  public RecommendationModule addContentItem(RecommendationContent contentItem) {
    this.content.add(contentItem);
    return this;
  }

  /**
   * List of content to display inside the module
   * @return content
   **/
  @Schema(required = true, description = "List of content to display inside the module")
      @NotNull
    @Valid
    public List<RecommendationContent> getContent() {
    return content;
  }

  public void setContent(List<RecommendationContent> content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationModule recommendationModule = (RecommendationModule) o;
    return Objects.equals(this.title, recommendationModule.title) &&
        Objects.equals(this.moduleId, recommendationModule.moduleId) &&
        Objects.equals(this.renderType, recommendationModule.renderType) &&
        Objects.equals(this.content, recommendationModule.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, moduleId, renderType, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationModule {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    renderType: ").append(toIndentedString(renderType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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