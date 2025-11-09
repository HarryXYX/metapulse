package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FieldFormPromptAssociation;
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
public class FieldFormPromptAssociationAspectResponseV2   {

  @JsonProperty("value") @Builder.Default
  private FieldFormPromptAssociation value = null;

  @JsonProperty("systemMetadata") @Builder.Default
  private SystemMetadata systemMetadata = null;

  public FieldFormPromptAssociationAspectResponseV2 value(FieldFormPromptAssociation value) {
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
    public FieldFormPromptAssociation getValue() {
    return value;
  }

  public void setValue(FieldFormPromptAssociation value) {
    this.value = value;
  }

  public FieldFormPromptAssociationAspectResponseV2 systemMetadata(SystemMetadata systemMetadata) {
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
    FieldFormPromptAssociationAspectResponseV2 fieldFormPromptAssociationAspectResponseV2 = (FieldFormPromptAssociationAspectResponseV2) o;
    return Objects.equals(this.value, fieldFormPromptAssociationAspectResponseV2.value) &&
        Objects.equals(this.systemMetadata, fieldFormPromptAssociationAspectResponseV2.systemMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, systemMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldFormPromptAssociationAspectResponseV2 {\n");
    
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