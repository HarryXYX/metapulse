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
 * Settings for a user around the appearance of their DataHub UI
 */
@Schema(description = "Settings for a user around the appearance of their DataHub UI")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorpUserAppearanceSettings   {

  @JsonProperty("showSimplifiedHomepage") @Builder.Default
  private Boolean showSimplifiedHomepage = null;

  @JsonProperty("showThemeV2") @Builder.Default
  private Boolean showThemeV2 = null;

  public CorpUserAppearanceSettings showSimplifiedHomepage(Boolean showSimplifiedHomepage) {
    this.showSimplifiedHomepage = showSimplifiedHomepage;
    return this;
  }

  /**
   * Flag whether the user should see a homepage with only datasets, charts and dashboards. Intended for users who have less operational use cases for the datahub tool.
   * @return showSimplifiedHomepage
   **/
  @Schema(description = "Flag whether the user should see a homepage with only datasets, charts and dashboards. Intended for users who have less operational use cases for the datahub tool.")
  
    public Boolean isShowSimplifiedHomepage() {
    return showSimplifiedHomepage;
  }

  public void setShowSimplifiedHomepage(Boolean showSimplifiedHomepage) {
    this.showSimplifiedHomepage = showSimplifiedHomepage;
  }

  public CorpUserAppearanceSettings showThemeV2(Boolean showThemeV2) {
    this.showThemeV2 = showThemeV2;
    return this;
  }

  /**
   * Flag controlling whether the V2 UI for DataHub is shown.
   * @return showThemeV2
   **/
  @Schema(description = "Flag controlling whether the V2 UI for DataHub is shown.")
  
    public Boolean isShowThemeV2() {
    return showThemeV2;
  }

  public void setShowThemeV2(Boolean showThemeV2) {
    this.showThemeV2 = showThemeV2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorpUserAppearanceSettings corpUserAppearanceSettings = (CorpUserAppearanceSettings) o;
    return Objects.equals(this.showSimplifiedHomepage, corpUserAppearanceSettings.showSimplifiedHomepage) &&
        Objects.equals(this.showThemeV2, corpUserAppearanceSettings.showThemeV2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showSimplifiedHomepage, showThemeV2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpUserAppearanceSettings {\n");
    
    sb.append("    showSimplifiedHomepage: ").append(toIndentedString(showSimplifiedHomepage)).append("\n");
    sb.append("    showThemeV2: ").append(toIndentedString(showThemeV2)).append("\n");
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