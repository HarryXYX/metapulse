package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.IconProperties;
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
 * Properties related to how the entity is displayed in the Datahub UI
 */
@Schema(description = "Properties related to how the entity is displayed in the Datahub UI")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisplayProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DisplayProperties") @Builder.Default
  private String __type = "DisplayProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DisplayProperties"},
  defaultValue = "DisplayProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("colorHex") @Builder.Default
  private String colorHex = null;

  @JsonProperty("icon") @Builder.Default
  private IconProperties icon = null;

  public DisplayProperties colorHex(String colorHex) {
    this.colorHex = colorHex;
    return this;
  }

  /**
   * The color associated with the entity in Hex. For example #FFFFFF.
   * @return colorHex
   **/
  @Schema(description = "The color associated with the entity in Hex. For example #FFFFFF.")
  
    public String getColorHex() {
    return colorHex;
  }

  public void setColorHex(String colorHex) {
    this.colorHex = colorHex;
  }

  public DisplayProperties icon(IconProperties icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
   **/
  @Schema(description = "")
  
    @Valid
    public IconProperties getIcon() {
    return icon;
  }

  public void setIcon(IconProperties icon) {
    this.icon = icon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayProperties displayProperties = (DisplayProperties) o;
    return Objects.equals(this.colorHex, displayProperties.colorHex) &&
        Objects.equals(this.icon, displayProperties.icon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorHex, icon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayProperties {\n");
    
    sb.append("    colorHex: ").append(toIndentedString(colorHex)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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