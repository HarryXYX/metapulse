package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssertionAction;
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
 * The Actions about an Assertion
 */
@Schema(description = "The Actions about an Assertion")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssertionActions  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "AssertionActions") @Builder.Default
  private String __type = "AssertionActions";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"AssertionActions"},
  defaultValue = "AssertionActions")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("onSuccess") @Builder.Default
  @Valid
  private List<AssertionAction> onSuccess = new ArrayList<>();

  @JsonProperty("onFailure") @Builder.Default
  @Valid
  private List<AssertionAction> onFailure = new ArrayList<>();

  public AssertionActions onSuccess(List<AssertionAction> onSuccess) {
    this.onSuccess = onSuccess;
    return this;
  }

  public AssertionActions addOnSuccessItem(AssertionAction onSuccessItem) {
    this.onSuccess.add(onSuccessItem);
    return this;
  }

  /**
   * Actions to be executed on successful assertion run.
   * @return onSuccess
   **/
  @Schema(required = true, description = "Actions to be executed on successful assertion run.")
      @NotNull
    @Valid
    public List<AssertionAction> getOnSuccess() {
    return onSuccess;
  }

  public void setOnSuccess(List<AssertionAction> onSuccess) {
    this.onSuccess = onSuccess;
  }

  public AssertionActions onFailure(List<AssertionAction> onFailure) {
    this.onFailure = onFailure;
    return this;
  }

  public AssertionActions addOnFailureItem(AssertionAction onFailureItem) {
    this.onFailure.add(onFailureItem);
    return this;
  }

  /**
   * Actions to be executed on failed assertion run.
   * @return onFailure
   **/
  @Schema(required = true, description = "Actions to be executed on failed assertion run.")
      @NotNull
    @Valid
    public List<AssertionAction> getOnFailure() {
    return onFailure;
  }

  public void setOnFailure(List<AssertionAction> onFailure) {
    this.onFailure = onFailure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssertionActions assertionActions = (AssertionActions) o;
    return Objects.equals(this.onSuccess, assertionActions.onSuccess) &&
        Objects.equals(this.onFailure, assertionActions.onFailure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onSuccess, onFailure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssertionActions {\n");
    
    sb.append("    onSuccess: ").append(toIndentedString(onSuccess)).append("\n");
    sb.append("    onFailure: ").append(toIndentedString(onFailure)).append("\n");
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