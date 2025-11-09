package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.IconLibrary;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Properties describing an icon associated with an entity
 */
@Schema(description = "Properties describing an icon associated with an entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IconProperties   {

  @JsonProperty("iconLibrary") @Builder.Default
  private IconLibrary iconLibrary = null;

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("style") @Builder.Default
  private String style = null;

  public IconProperties iconLibrary(IconLibrary iconLibrary) {
    this.iconLibrary = iconLibrary;
    return this;
  }

  /**
   * Get iconLibrary
   * @return iconLibrary
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public IconLibrary getIconLibrary() {
    return iconLibrary;
  }

  public void setIconLibrary(IconLibrary iconLibrary) {
    this.iconLibrary = iconLibrary;
  }

  public IconProperties name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the icon
   * @return name
   **/
  @Schema(required = true, description = "The name of the icon")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IconProperties style(String style) {
    this.style = style;
    return this;
  }

  /**
   * Any modifier for the icon, this will be library-specific, e.g. filled/outlined, etc
   * @return style
   **/
  @Schema(required = true, description = "Any modifier for the icon, this will be library-specific, e.g. filled/outlined, etc")
      @NotNull

    public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IconProperties iconProperties = (IconProperties) o;
    return Objects.equals(this.iconLibrary, iconProperties.iconLibrary) &&
        Objects.equals(this.name, iconProperties.name) &&
        Objects.equals(this.style, iconProperties.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iconLibrary, name, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IconProperties {\n");
    
    sb.append("    iconLibrary: ").append(toIndentedString(iconLibrary)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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