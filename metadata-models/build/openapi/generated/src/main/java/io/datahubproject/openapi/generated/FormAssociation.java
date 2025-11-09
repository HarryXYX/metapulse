package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FormPromptAssociation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Properties of an applied form.
 */
@Schema(description = "Properties of an applied form.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormAssociation   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("incompletePrompts") @Builder.Default
  @Valid
  private List<FormPromptAssociation> incompletePrompts = new ArrayList<>();

  @JsonProperty("completedPrompts") @Builder.Default
  @Valid
  private List<FormPromptAssociation> completedPrompts = new ArrayList<>();

  public FormAssociation urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Urn of the applied form
   * @return urn
   **/
  @Schema(required = true, description = "Urn of the applied form")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public FormAssociation incompletePrompts(List<FormPromptAssociation> incompletePrompts) {
    this.incompletePrompts = incompletePrompts;
    return this;
  }

  public FormAssociation addIncompletePromptsItem(FormPromptAssociation incompletePromptsItem) {
    this.incompletePrompts.add(incompletePromptsItem);
    return this;
  }

  /**
   * A list of prompts that are not yet complete for this form.
   * @return incompletePrompts
   **/
  @Schema(required = true, description = "A list of prompts that are not yet complete for this form.")
      @NotNull
    @Valid
    public List<FormPromptAssociation> getIncompletePrompts() {
    return incompletePrompts;
  }

  public void setIncompletePrompts(List<FormPromptAssociation> incompletePrompts) {
    this.incompletePrompts = incompletePrompts;
  }

  public FormAssociation completedPrompts(List<FormPromptAssociation> completedPrompts) {
    this.completedPrompts = completedPrompts;
    return this;
  }

  public FormAssociation addCompletedPromptsItem(FormPromptAssociation completedPromptsItem) {
    this.completedPrompts.add(completedPromptsItem);
    return this;
  }

  /**
   * A list of prompts that have been completed for this form.
   * @return completedPrompts
   **/
  @Schema(required = true, description = "A list of prompts that have been completed for this form.")
      @NotNull
    @Valid
    public List<FormPromptAssociation> getCompletedPrompts() {
    return completedPrompts;
  }

  public void setCompletedPrompts(List<FormPromptAssociation> completedPrompts) {
    this.completedPrompts = completedPrompts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormAssociation formAssociation = (FormAssociation) o;
    return Objects.equals(this.urn, formAssociation.urn) &&
        Objects.equals(this.incompletePrompts, formAssociation.incompletePrompts) &&
        Objects.equals(this.completedPrompts, formAssociation.completedPrompts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, incompletePrompts, completedPrompts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormAssociation {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    incompletePrompts: ").append(toIndentedString(incompletePrompts)).append("\n");
    sb.append("    completedPrompts: ").append(toIndentedString(completedPrompts)).append("\n");
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