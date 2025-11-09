package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FormAssociation;
import io.datahubproject.openapi.generated.FormVerificationAssociation;
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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Forms that are assigned to this entity to be filled out
 */
@Schema(description = "Forms that are assigned to this entity to be filled out")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Forms  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "Forms") @Builder.Default
  private String __type = "Forms";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"Forms"},
  defaultValue = "Forms")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("incompleteForms") @Builder.Default
  @Valid
  private List<FormAssociation> incompleteForms = new ArrayList<>();

  @JsonProperty("completedForms") @Builder.Default
  @Valid
  private List<FormAssociation> completedForms = new ArrayList<>();

  @JsonProperty("verifications") @Builder.Default
  @Valid
  private List<FormVerificationAssociation> verifications = new ArrayList<>();

  public Forms incompleteForms(List<FormAssociation> incompleteForms) {
    this.incompleteForms = incompleteForms;
    return this;
  }

  public Forms addIncompleteFormsItem(FormAssociation incompleteFormsItem) {
    this.incompleteForms.add(incompleteFormsItem);
    return this;
  }

  /**
   * All incomplete forms assigned to the entity.
   * @return incompleteForms
   **/
  @Schema(required = true, description = "All incomplete forms assigned to the entity.")
      @NotNull
    @Valid
    public List<FormAssociation> getIncompleteForms() {
    return incompleteForms;
  }

  public void setIncompleteForms(List<FormAssociation> incompleteForms) {
    this.incompleteForms = incompleteForms;
  }

  public Forms completedForms(List<FormAssociation> completedForms) {
    this.completedForms = completedForms;
    return this;
  }

  public Forms addCompletedFormsItem(FormAssociation completedFormsItem) {
    this.completedForms.add(completedFormsItem);
    return this;
  }

  /**
   * All complete forms assigned to the entity.
   * @return completedForms
   **/
  @Schema(required = true, description = "All complete forms assigned to the entity.")
      @NotNull
    @Valid
    public List<FormAssociation> getCompletedForms() {
    return completedForms;
  }

  public void setCompletedForms(List<FormAssociation> completedForms) {
    this.completedForms = completedForms;
  }

  public Forms verifications(List<FormVerificationAssociation> verifications) {
    this.verifications = verifications;
    return this;
  }

  public Forms addVerificationsItem(FormVerificationAssociation verificationsItem) {
    this.verifications.add(verificationsItem);
    return this;
  }

  /**
   * Verifications that have been applied to the entity via completed forms.
   * @return verifications
   **/
  @Schema(required = true, description = "Verifications that have been applied to the entity via completed forms.")
      @NotNull
    @Valid
    public List<FormVerificationAssociation> getVerifications() {
    return verifications;
  }

  public void setVerifications(List<FormVerificationAssociation> verifications) {
    this.verifications = verifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Forms forms = (Forms) o;
    return Objects.equals(this.incompleteForms, forms.incompleteForms) &&
        Objects.equals(this.completedForms, forms.completedForms) &&
        Objects.equals(this.verifications, forms.verifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incompleteForms, completedForms, verifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Forms {\n");
    
    sb.append("    incompleteForms: ").append(toIndentedString(incompleteForms)).append("\n");
    sb.append("    completedForms: ").append(toIndentedString(completedForms)).append("\n");
    sb.append("    verifications: ").append(toIndentedString(verifications)).append("\n");
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