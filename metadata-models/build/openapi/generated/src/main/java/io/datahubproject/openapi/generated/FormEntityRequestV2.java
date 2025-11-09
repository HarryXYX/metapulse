package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DynamicFormAssignmentAspectRequestV2;
import io.datahubproject.openapi.generated.FormInfoAspectRequestV2;
import io.datahubproject.openapi.generated.FormKeyAspectRequestV2;
import io.datahubproject.openapi.generated.OwnershipAspectRequestV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Form object.
 */
@Schema(description = "Form object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("formKey") @Builder.Default
  private FormKeyAspectRequestV2 formKey = null;

  @JsonProperty("formInfo") @Builder.Default
  private FormInfoAspectRequestV2 formInfo = null;

  @JsonProperty("dynamicFormAssignment") @Builder.Default
  private DynamicFormAssignmentAspectRequestV2 dynamicFormAssignment = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectRequestV2 ownership = null;

  public FormEntityRequestV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for form
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for form")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public FormEntityRequestV2 formKey(FormKeyAspectRequestV2 formKey) {
    this.formKey = formKey;
    return this;
  }

  /**
   * Get formKey
   * @return formKey
   **/
  @Schema(description = "")
  
    @Valid
    public FormKeyAspectRequestV2 getFormKey() {
    return formKey;
  }

  public void setFormKey(FormKeyAspectRequestV2 formKey) {
    this.formKey = formKey;
  }

  public FormEntityRequestV2 formInfo(FormInfoAspectRequestV2 formInfo) {
    this.formInfo = formInfo;
    return this;
  }

  /**
   * Get formInfo
   * @return formInfo
   **/
  @Schema(description = "")
  
    @Valid
    public FormInfoAspectRequestV2 getFormInfo() {
    return formInfo;
  }

  public void setFormInfo(FormInfoAspectRequestV2 formInfo) {
    this.formInfo = formInfo;
  }

  public FormEntityRequestV2 dynamicFormAssignment(DynamicFormAssignmentAspectRequestV2 dynamicFormAssignment) {
    this.dynamicFormAssignment = dynamicFormAssignment;
    return this;
  }

  /**
   * Get dynamicFormAssignment
   * @return dynamicFormAssignment
   **/
  @Schema(description = "")
  
    @Valid
    public DynamicFormAssignmentAspectRequestV2 getDynamicFormAssignment() {
    return dynamicFormAssignment;
  }

  public void setDynamicFormAssignment(DynamicFormAssignmentAspectRequestV2 dynamicFormAssignment) {
    this.dynamicFormAssignment = dynamicFormAssignment;
  }

  public FormEntityRequestV2 ownership(OwnershipAspectRequestV2 ownership) {
    this.ownership = ownership;
    return this;
  }

  /**
   * Get ownership
   * @return ownership
   **/
  @Schema(description = "")
  
    @Valid
    public OwnershipAspectRequestV2 getOwnership() {
    return ownership;
  }

  public void setOwnership(OwnershipAspectRequestV2 ownership) {
    this.ownership = ownership;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormEntityRequestV2 formEntityRequestV2 = (FormEntityRequestV2) o;
    return Objects.equals(this.urn, formEntityRequestV2.urn) &&
        Objects.equals(this.formKey, formEntityRequestV2.formKey) &&
        Objects.equals(this.formInfo, formEntityRequestV2.formInfo) &&
        Objects.equals(this.dynamicFormAssignment, formEntityRequestV2.dynamicFormAssignment) &&
        Objects.equals(this.ownership, formEntityRequestV2.ownership);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, formKey, formInfo, dynamicFormAssignment, ownership);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormEntityRequestV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    formKey: ").append(toIndentedString(formKey)).append("\n");
    sb.append("    formInfo: ").append(toIndentedString(formInfo)).append("\n");
    sb.append("    dynamicFormAssignment: ").append(toIndentedString(dynamicFormAssignment)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
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