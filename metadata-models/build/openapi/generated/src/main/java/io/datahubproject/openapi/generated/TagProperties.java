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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Properties associated with a Tag
 */
@Schema(description = "Properties associated with a Tag")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TagProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfTagSnapshotAspectsItems, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "TagProperties") @Builder.Default
  private String __type = "TagProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"TagProperties"},
  defaultValue = "TagProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("colorHex") @Builder.Default
  private String colorHex = null;

  public TagProperties name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the tag
   * @return name
   **/
  @Schema(required = true, description = "Display name of the tag")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TagProperties description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Documentation of the tag
   * @return description
   **/
  @Schema(description = "Documentation of the tag")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TagProperties colorHex(String colorHex) {
    this.colorHex = colorHex;
    return this;
  }

  /**
   * The color associated with the Tag in Hex. For example #FFFFFF.
   * @return colorHex
   **/
  @Schema(description = "The color associated with the Tag in Hex. For example #FFFFFF.")
  
    public String getColorHex() {
    return colorHex;
  }

  public void setColorHex(String colorHex) {
    this.colorHex = colorHex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagProperties tagProperties = (TagProperties) o;
    return Objects.equals(this.name, tagProperties.name) &&
        Objects.equals(this.description, tagProperties.description) &&
        Objects.equals(this.colorHex, tagProperties.colorHex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, colorHex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    colorHex: ").append(toIndentedString(colorHex)).append("\n");
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