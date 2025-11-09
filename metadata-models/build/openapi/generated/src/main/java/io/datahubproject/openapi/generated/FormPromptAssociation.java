package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.FormPromptFieldAssociations;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Information about the status of a particular prompt. Note that this is where we can add additional information about individual responses: actor, timestamp, and the response itself.
 */
@Schema(description = "Information about the status of a particular prompt. Note that this is where we can add additional information about individual responses: actor, timestamp, and the response itself.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormPromptAssociation   {

  @JsonProperty("id") @Builder.Default
  private String id = null;

  @JsonProperty("lastModified") @Builder.Default
  private AuditStamp lastModified = null;

  @JsonProperty("fieldAssociations") @Builder.Default
  private FormPromptFieldAssociations fieldAssociations = null;

  public FormPromptAssociation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id for the prompt. This must be GLOBALLY UNIQUE.
   * @return id
   **/
  @Schema(required = true, description = "The id for the prompt. This must be GLOBALLY UNIQUE.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FormPromptAssociation lastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AuditStamp getLastModified() {
    return lastModified;
  }

  public void setLastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
  }

  public FormPromptAssociation fieldAssociations(FormPromptFieldAssociations fieldAssociations) {
    this.fieldAssociations = fieldAssociations;
    return this;
  }

  /**
   * Get fieldAssociations
   * @return fieldAssociations
   **/
  @Schema(description = "")
  
    @Valid
    public FormPromptFieldAssociations getFieldAssociations() {
    return fieldAssociations;
  }

  public void setFieldAssociations(FormPromptFieldAssociations fieldAssociations) {
    this.fieldAssociations = fieldAssociations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormPromptAssociation formPromptAssociation = (FormPromptAssociation) o;
    return Objects.equals(this.id, formPromptAssociation.id) &&
        Objects.equals(this.lastModified, formPromptAssociation.lastModified) &&
        Objects.equals(this.fieldAssociations, formPromptAssociation.fieldAssociations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastModified, fieldAssociations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormPromptAssociation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    fieldAssociations: ").append(toIndentedString(fieldAssociations)).append("\n");
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