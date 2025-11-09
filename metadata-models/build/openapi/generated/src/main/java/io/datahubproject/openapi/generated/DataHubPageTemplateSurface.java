package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.PageTemplateSurfaceType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Info about the surface area of the product that this template is deployed in
 */
@Schema(description = "Info about the surface area of the product that this template is deployed in")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubPageTemplateSurface   {

  @JsonProperty("surfaceType") @Builder.Default
  private PageTemplateSurfaceType surfaceType = null;

  public DataHubPageTemplateSurface surfaceType(PageTemplateSurfaceType surfaceType) {
    this.surfaceType = surfaceType;
    return this;
  }

  /**
   * Get surfaceType
   * @return surfaceType
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PageTemplateSurfaceType getSurfaceType() {
    return surfaceType;
  }

  public void setSurfaceType(PageTemplateSurfaceType surfaceType) {
    this.surfaceType = surfaceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubPageTemplateSurface dataHubPageTemplateSurface = (DataHubPageTemplateSurface) o;
    return Objects.equals(this.surfaceType, dataHubPageTemplateSurface.surfaceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surfaceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubPageTemplateSurface {\n");
    
    sb.append("    surfaceType: ").append(toIndentedString(surfaceType)).append("\n");
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