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
 * Global settings related to the home page for an instance
 */
@Schema(description = "Global settings related to the home page for an instance")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GlobalHomePageSettings   {

  @JsonProperty("defaultTemplate") @Builder.Default
  private String defaultTemplate = null;

  public GlobalHomePageSettings defaultTemplate(String defaultTemplate) {
    this.defaultTemplate = defaultTemplate;
    return this;
  }

  /**
   * The urn that will be rendered in the UI by default for all users
   * @return defaultTemplate
   **/
  @Schema(required = true, description = "The urn that will be rendered in the UI by default for all users")
      @NotNull

    public String getDefaultTemplate() {
    return defaultTemplate;
  }

  public void setDefaultTemplate(String defaultTemplate) {
    this.defaultTemplate = defaultTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalHomePageSettings globalHomePageSettings = (GlobalHomePageSettings) o;
    return Objects.equals(this.defaultTemplate, globalHomePageSettings.defaultTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalHomePageSettings {\n");
    
    sb.append("    defaultTemplate: ").append(toIndentedString(defaultTemplate)).append("\n");
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