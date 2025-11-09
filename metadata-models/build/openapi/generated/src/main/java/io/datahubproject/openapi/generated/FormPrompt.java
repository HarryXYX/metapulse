package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FormPromptType;
import io.datahubproject.openapi.generated.StructuredPropertyParams;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * A prompt to present to the user to encourage filling out metadata
 */
@Schema(description = "A prompt to present to the user to encourage filling out metadata")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormPrompt   {

  @JsonProperty("id") @Builder.Default
  private String id = null;

  @JsonProperty("title") @Builder.Default
  private String title = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("type") @Builder.Default
  private FormPromptType type = null;

  @JsonProperty("structuredPropertyParams") @Builder.Default
  private StructuredPropertyParams structuredPropertyParams = null;

  @JsonProperty("required") @Builder.Default
  private Boolean required = false;

  public FormPrompt id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique id for this prompt. This must be GLOBALLY unique.
   * @return id
   **/
  @Schema(required = true, description = "The unique id for this prompt. This must be GLOBALLY unique.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FormPrompt title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of this prompt
   * @return title
   **/
  @Schema(required = true, description = "The title of this prompt")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public FormPrompt description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of this prompt
   * @return description
   **/
  @Schema(description = "The description of this prompt")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FormPrompt type(FormPromptType type) {
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
    public FormPromptType getType() {
    return type;
  }

  public void setType(FormPromptType type) {
    this.type = type;
  }

  public FormPrompt structuredPropertyParams(StructuredPropertyParams structuredPropertyParams) {
    this.structuredPropertyParams = structuredPropertyParams;
    return this;
  }

  /**
   * Get structuredPropertyParams
   * @return structuredPropertyParams
   **/
  @Schema(description = "")
  
    @Valid
    public StructuredPropertyParams getStructuredPropertyParams() {
    return structuredPropertyParams;
  }

  public void setStructuredPropertyParams(StructuredPropertyParams structuredPropertyParams) {
    this.structuredPropertyParams = structuredPropertyParams;
  }

  public FormPrompt required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Whether the prompt is required to be completed, in order for the form to be marked as complete.
   * @return required
   **/
  @Schema(required = true, description = "Whether the prompt is required to be completed, in order for the form to be marked as complete.")
      @NotNull

    public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormPrompt formPrompt = (FormPrompt) o;
    return Objects.equals(this.id, formPrompt.id) &&
        Objects.equals(this.title, formPrompt.title) &&
        Objects.equals(this.description, formPrompt.description) &&
        Objects.equals(this.type, formPrompt.type) &&
        Objects.equals(this.structuredPropertyParams, formPrompt.structuredPropertyParams) &&
        Objects.equals(this.required, formPrompt.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, type, structuredPropertyParams, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormPrompt {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    structuredPropertyParams: ").append(toIndentedString(structuredPropertyParams)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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