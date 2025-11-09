package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.GenericAspect;
import io.datahubproject.openapi.generated.SystemMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Enveloped record for an aspect.
 */
@Schema(description = "Enveloped record for an aspect.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnvelopedTimeseriesAspect   {

  @JsonProperty("aspect") @Builder.Default
  private GenericAspect aspect = null;

  @JsonProperty("systemMetadata") @Builder.Default
  private SystemMetadata systemMetadata = null;

  public EnvelopedTimeseriesAspect aspect(GenericAspect aspect) {
    this.aspect = aspect;
    return this;
  }

  /**
   * Get aspect
   * @return aspect
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public GenericAspect getAspect() {
    return aspect;
  }

  public void setAspect(GenericAspect aspect) {
    this.aspect = aspect;
  }

  public EnvelopedTimeseriesAspect systemMetadata(SystemMetadata systemMetadata) {
    this.systemMetadata = systemMetadata;
    return this;
  }

  /**
   * Get systemMetadata
   * @return systemMetadata
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SystemMetadata getSystemMetadata() {
    return systemMetadata;
  }

  public void setSystemMetadata(SystemMetadata systemMetadata) {
    this.systemMetadata = systemMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopedTimeseriesAspect envelopedTimeseriesAspect = (EnvelopedTimeseriesAspect) o;
    return Objects.equals(this.aspect, envelopedTimeseriesAspect.aspect) &&
        Objects.equals(this.systemMetadata, envelopedTimeseriesAspect.systemMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspect, systemMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopedTimeseriesAspect {\n");
    
    sb.append("    aspect: ").append(toIndentedString(aspect)).append("\n");
    sb.append("    systemMetadata: ").append(toIndentedString(systemMetadata)).append("\n");
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