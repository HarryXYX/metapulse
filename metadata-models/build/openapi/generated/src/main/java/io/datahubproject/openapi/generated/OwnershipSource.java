package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.OwnershipSourceType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Source/provider of the ownership information
 */
@Schema(description = "Source/provider of the ownership information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OwnershipSource   {

  @JsonProperty("type") @Builder.Default
  private OwnershipSourceType type = null;

  @JsonProperty("url") @Builder.Default
  private String url = null;

  public OwnershipSource type(OwnershipSourceType type) {
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
    public OwnershipSourceType getType() {
    return type;
  }

  public void setType(OwnershipSourceType type) {
    this.type = type;
  }

  public OwnershipSource url(String url) {
    this.url = url;
    return this;
  }

  /**
   * A reference URL for the source
   * @return url
   **/
  @Schema(description = "A reference URL for the source")
  
    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnershipSource ownershipSource = (OwnershipSource) o;
    return Objects.equals(this.type, ownershipSource.type) &&
        Objects.equals(this.url, ownershipSource.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnershipSource {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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