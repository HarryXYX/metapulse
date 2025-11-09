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
/**
 * Object containing the template and any additional info for asset summary settings
 */
@Schema(description = "Object containing the template and any additional info for asset summary settings")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssetSummarySettingsTemplate   {

  @JsonProperty("template") @Builder.Default
  private String template = null;

  public AssetSummarySettingsTemplate template(String template) {
    this.template = template;
    return this;
  }

  /**
   * The urn of the template
   * @return template
   **/
  @Schema(required = true, description = "The urn of the template")
      @NotNull

    public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetSummarySettingsTemplate assetSummarySettingsTemplate = (AssetSummarySettingsTemplate) o;
    return Objects.equals(this.template, assetSummarySettingsTemplate.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetSummarySettingsTemplate {\n");
    
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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