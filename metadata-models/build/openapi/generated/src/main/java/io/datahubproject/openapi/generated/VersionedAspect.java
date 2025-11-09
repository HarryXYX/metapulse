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
 * VersionedAspect
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VersionedAspect   {

  @JsonProperty("aspect") @Builder.Default
  private OneOfVersionedAspectAspect aspect = null;

  @JsonProperty("version") @Builder.Default
  private Long version = null;

  public VersionedAspect aspect(OneOfVersionedAspectAspect aspect) {
    this.aspect = aspect;
    return this;
  }

  /**
   * Get aspect
   * @return aspect
   **/
  @Schema(required = true, description = "")
      @NotNull

    public OneOfVersionedAspectAspect getAspect() {
    return aspect;
  }

  public void setAspect(OneOfVersionedAspectAspect aspect) {
    this.aspect = aspect;
  }

  public VersionedAspect version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return version
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedAspect versionedAspect = (VersionedAspect) o;
    return Objects.equals(this.aspect, versionedAspect.aspect) &&
        Objects.equals(this.version, versionedAspect.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspect, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedAspect {\n");
    
    sb.append("    aspect: ").append(toIndentedString(aspect)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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