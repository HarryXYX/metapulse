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
 * Information regarding rendering an embed for an asset.
 */
@Schema(description = "Information regarding rendering an embed for an asset.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Embed  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "Embed") @Builder.Default
  private String __type = "Embed";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"Embed"},
  defaultValue = "Embed")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("renderUrl") @Builder.Default
  private String renderUrl = null;

  public Embed renderUrl(String renderUrl) {
    this.renderUrl = renderUrl;
    return this;
  }

  /**
   * An embed URL to be rendered inside of an iframe.
   * @return renderUrl
   **/
  @Schema(description = "An embed URL to be rendered inside of an iframe.")
  
    public String getRenderUrl() {
    return renderUrl;
  }

  public void setRenderUrl(String renderUrl) {
    this.renderUrl = renderUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Embed embed = (Embed) o;
    return Objects.equals(this.renderUrl, embed.renderUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(renderUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Embed {\n");
    
    sb.append("    renderUrl: ").append(toIndentedString(renderUrl)).append("\n");
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