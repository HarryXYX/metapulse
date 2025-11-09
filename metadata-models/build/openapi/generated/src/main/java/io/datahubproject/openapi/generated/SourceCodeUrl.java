package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.SourceCodeUrlType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Source Code Url Entity
 */
@Schema(description = "Source Code Url Entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SourceCodeUrl   {

  @JsonProperty("type") @Builder.Default
  private SourceCodeUrlType type = null;

  @JsonProperty("sourceCodeUrl") @Builder.Default
  private String sourceCodeUrl = null;

  public SourceCodeUrl type(SourceCodeUrlType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SourceCodeUrlType getType() {
    return type;
  }

  public void setType(SourceCodeUrlType type) {
    this.type = type;
  }

  public SourceCodeUrl sourceCodeUrl(String sourceCodeUrl) {
    this.sourceCodeUrl = sourceCodeUrl;
    return this;
  }

  /**
   * Source Code Url
   * @return sourceCodeUrl
   **/
  @Schema(required = true, description = "Source Code Url")
      @NotNull

    public String getSourceCodeUrl() {
    return sourceCodeUrl;
  }

  public void setSourceCodeUrl(String sourceCodeUrl) {
    this.sourceCodeUrl = sourceCodeUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceCodeUrl sourceCodeUrl = (SourceCodeUrl) o;
    return Objects.equals(this.type, sourceCodeUrl.type) &&
        Objects.equals(this.sourceCodeUrl, sourceCodeUrl.sourceCodeUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, sourceCodeUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceCodeUrl {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sourceCodeUrl: ").append(toIndentedString(sourceCodeUrl)).append("\n");
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