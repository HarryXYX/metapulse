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
 * Settings related to the &#x27;Views&#x27; feature.
 */
@Schema(description = "Settings related to the 'Views' feature.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorpUserViewsSettings   {

  @JsonProperty("defaultView") @Builder.Default
  private String defaultView = null;

  public CorpUserViewsSettings defaultView(String defaultView) {
    this.defaultView = defaultView;
    return this;
  }

  /**
   * The default View which is selected for the user. If none is chosen, then this value will be left blank.
   * @return defaultView
   **/
  @Schema(description = "The default View which is selected for the user. If none is chosen, then this value will be left blank.")
  
    public String getDefaultView() {
    return defaultView;
  }

  public void setDefaultView(String defaultView) {
    this.defaultView = defaultView;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorpUserViewsSettings corpUserViewsSettings = (CorpUserViewsSettings) o;
    return Objects.equals(this.defaultView, corpUserViewsSettings.defaultView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultView);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpUserViewsSettings {\n");
    
    sb.append("    defaultView: ").append(toIndentedString(defaultView)).append("\n");
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