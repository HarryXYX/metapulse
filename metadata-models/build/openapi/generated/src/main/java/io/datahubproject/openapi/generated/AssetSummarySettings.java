package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssetSummarySettingsTemplate;
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
 * Information related to the asset summary for this asset
 */
@Schema(description = "Information related to the asset summary for this asset")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssetSummarySettings   {

  @JsonProperty("templates") @Builder.Default
  @Valid
  private List<AssetSummarySettingsTemplate> templates = new ArrayList<>();

  public AssetSummarySettings templates(List<AssetSummarySettingsTemplate> templates) {
    this.templates = templates;
    return this;
  }

  public AssetSummarySettings addTemplatesItem(AssetSummarySettingsTemplate templatesItem) {
    this.templates.add(templatesItem);
    return this;
  }

  /**
   * The list of templates applied to this asset in order. Right now we only expect one.
   * @return templates
   **/
  @Schema(required = true, description = "The list of templates applied to this asset in order. Right now we only expect one.")
      @NotNull
    @Valid
    public List<AssetSummarySettingsTemplate> getTemplates() {
    return templates;
  }

  public void setTemplates(List<AssetSummarySettingsTemplate> templates) {
    this.templates = templates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetSummarySettings assetSummarySettings = (AssetSummarySettings) o;
    return Objects.equals(this.templates, assetSummarySettings.templates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetSummarySettings {\n");
    
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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