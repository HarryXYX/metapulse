package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FieldFormPromptAssociation;
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
 * Information about the field-level prompt associations on a top-level prompt association.
 */
@Schema(description = "Information about the field-level prompt associations on a top-level prompt association.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormPromptFieldAssociations   {

  @JsonProperty("completedFieldPrompts") @Builder.Default
  @Valid
  private List<FieldFormPromptAssociation> completedFieldPrompts = null;

  @JsonProperty("incompleteFieldPrompts") @Builder.Default
  @Valid
  private List<FieldFormPromptAssociation> incompleteFieldPrompts = null;

  public FormPromptFieldAssociations completedFieldPrompts(List<FieldFormPromptAssociation> completedFieldPrompts) {
    this.completedFieldPrompts = completedFieldPrompts;
    return this;
  }

  public FormPromptFieldAssociations addCompletedFieldPromptsItem(FieldFormPromptAssociation completedFieldPromptsItem) {
    if (this.completedFieldPrompts == null) {
      this.completedFieldPrompts = new ArrayList<>();
    }
    this.completedFieldPrompts.add(completedFieldPromptsItem);
    return this;
  }

  /**
   * A list of field-level prompt associations that are not yet complete for this form.
   * @return completedFieldPrompts
   **/
  @Schema(description = "A list of field-level prompt associations that are not yet complete for this form.")
      @Valid
    public List<FieldFormPromptAssociation> getCompletedFieldPrompts() {
    return completedFieldPrompts;
  }

  public void setCompletedFieldPrompts(List<FieldFormPromptAssociation> completedFieldPrompts) {
    this.completedFieldPrompts = completedFieldPrompts;
  }

  public FormPromptFieldAssociations incompleteFieldPrompts(List<FieldFormPromptAssociation> incompleteFieldPrompts) {
    this.incompleteFieldPrompts = incompleteFieldPrompts;
    return this;
  }

  public FormPromptFieldAssociations addIncompleteFieldPromptsItem(FieldFormPromptAssociation incompleteFieldPromptsItem) {
    if (this.incompleteFieldPrompts == null) {
      this.incompleteFieldPrompts = new ArrayList<>();
    }
    this.incompleteFieldPrompts.add(incompleteFieldPromptsItem);
    return this;
  }

  /**
   * A list of field-level prompt associations that are complete for this form.
   * @return incompleteFieldPrompts
   **/
  @Schema(description = "A list of field-level prompt associations that are complete for this form.")
      @Valid
    public List<FieldFormPromptAssociation> getIncompleteFieldPrompts() {
    return incompleteFieldPrompts;
  }

  public void setIncompleteFieldPrompts(List<FieldFormPromptAssociation> incompleteFieldPrompts) {
    this.incompleteFieldPrompts = incompleteFieldPrompts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormPromptFieldAssociations formPromptFieldAssociations = (FormPromptFieldAssociations) o;
    return Objects.equals(this.completedFieldPrompts, formPromptFieldAssociations.completedFieldPrompts) &&
        Objects.equals(this.incompleteFieldPrompts, formPromptFieldAssociations.incompleteFieldPrompts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedFieldPrompts, incompleteFieldPrompts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormPromptFieldAssociations {\n");
    
    sb.append("    completedFieldPrompts: ").append(toIndentedString(completedFieldPrompts)).append("\n");
    sb.append("    incompleteFieldPrompts: ").append(toIndentedString(incompleteFieldPrompts)).append("\n");
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