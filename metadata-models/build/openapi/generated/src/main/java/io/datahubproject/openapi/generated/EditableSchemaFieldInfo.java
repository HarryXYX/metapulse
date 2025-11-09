package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.GlobalTags;
import io.datahubproject.openapi.generated.GlossaryTerms;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * SchemaField to describe metadata related to dataset schema.
 */
@Schema(description = "SchemaField to describe metadata related to dataset schema.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditableSchemaFieldInfo   {

  @JsonProperty("fieldPath") @Builder.Default
  private String fieldPath = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTags globalTags = null;

  @JsonProperty("glossaryTerms") @Builder.Default
  private GlossaryTerms glossaryTerms = null;

  public EditableSchemaFieldInfo fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  /**
   * FieldPath uniquely identifying the SchemaField this metadata is associated with
   * @return fieldPath
   **/
  @Schema(required = true, description = "FieldPath uniquely identifying the SchemaField this metadata is associated with")
      @NotNull

    public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public EditableSchemaFieldInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description
   * @return description
   **/
  @Schema(description = "Description")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EditableSchemaFieldInfo globalTags(GlobalTags globalTags) {
    this.globalTags = globalTags;
    return this;
  }

  /**
   * Get globalTags
   * @return globalTags
   **/
  @Schema(description = "")
  
    @Valid
    public GlobalTags getGlobalTags() {
    return globalTags;
  }

  public void setGlobalTags(GlobalTags globalTags) {
    this.globalTags = globalTags;
  }

  public EditableSchemaFieldInfo glossaryTerms(GlossaryTerms glossaryTerms) {
    this.glossaryTerms = glossaryTerms;
    return this;
  }

  /**
   * Get glossaryTerms
   * @return glossaryTerms
   **/
  @Schema(description = "")
  
    @Valid
    public GlossaryTerms getGlossaryTerms() {
    return glossaryTerms;
  }

  public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
    this.glossaryTerms = glossaryTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditableSchemaFieldInfo editableSchemaFieldInfo = (EditableSchemaFieldInfo) o;
    return Objects.equals(this.fieldPath, editableSchemaFieldInfo.fieldPath) &&
        Objects.equals(this.description, editableSchemaFieldInfo.description) &&
        Objects.equals(this.globalTags, editableSchemaFieldInfo.globalTags) &&
        Objects.equals(this.glossaryTerms, editableSchemaFieldInfo.glossaryTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldPath, description, globalTags, glossaryTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditableSchemaFieldInfo {\n");
    
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    globalTags: ").append(toIndentedString(globalTags)).append("\n");
    sb.append("    glossaryTerms: ").append(toIndentedString(glossaryTerms)).append("\n");
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