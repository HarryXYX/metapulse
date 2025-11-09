package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ApplicationsSettings;
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
 * Aspect wrapper object.
 */
@Schema(description = "Aspect wrapper object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationsSettingsAspectResponseV2   {

  @JsonProperty("value") @Builder.Default
  private ApplicationsSettings value = null;

  @JsonProperty("systemMetadata") @Builder.Default
  private SystemMetadata systemMetadata = null;

  public ApplicationsSettingsAspectResponseV2 value(ApplicationsSettings value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ApplicationsSettings getValue() {
    return value;
  }

  public void setValue(ApplicationsSettings value) {
    this.value = value;
  }

  public ApplicationsSettingsAspectResponseV2 systemMetadata(SystemMetadata systemMetadata) {
    this.systemMetadata = systemMetadata;
    return this;
  }

  /**
   * Get systemMetadata
   * @return systemMetadata
   **/
  @Schema(description = "")
  
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
    ApplicationsSettingsAspectResponseV2 applicationsSettingsAspectResponseV2 = (ApplicationsSettingsAspectResponseV2) o;
    return Objects.equals(this.value, applicationsSettingsAspectResponseV2.value) &&
        Objects.equals(this.systemMetadata, applicationsSettingsAspectResponseV2.systemMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, systemMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationsSettingsAspectResponseV2 {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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