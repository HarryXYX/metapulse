package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Details about a View.  e.g. Gets activated when subTypes is view
 */
@Schema(description = "Details about a View.  e.g. Gets activated when subTypes is view")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ViewProperties  implements OneOfDatasetSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "ViewProperties") @Builder.Default
  private String __type = "ViewProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"ViewProperties"},
  defaultValue = "ViewProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("materialized") @Builder.Default
  private Boolean materialized = null;

  @JsonProperty("viewLogic") @Builder.Default
  private String viewLogic = null;

  @JsonProperty("formattedViewLogic") @Builder.Default
  private String formattedViewLogic = null;

  @JsonProperty("viewLanguage") @Builder.Default
  private String viewLanguage = null;

  public ViewProperties materialized(Boolean materialized) {
    this.materialized = materialized;
    return this;
  }

  /**
   * Whether the view is materialized
   * @return materialized
   **/
  @Schema(required = true, description = "Whether the view is materialized")
      @NotNull

    public Boolean isMaterialized() {
    return materialized;
  }

  public void setMaterialized(Boolean materialized) {
    this.materialized = materialized;
  }

  public ViewProperties viewLogic(String viewLogic) {
    this.viewLogic = viewLogic;
    return this;
  }

  /**
   * The view logic
   * @return viewLogic
   **/
  @Schema(required = true, description = "The view logic")
      @NotNull

    public String getViewLogic() {
    return viewLogic;
  }

  public void setViewLogic(String viewLogic) {
    this.viewLogic = viewLogic;
  }

  public ViewProperties formattedViewLogic(String formattedViewLogic) {
    this.formattedViewLogic = formattedViewLogic;
    return this;
  }

  /**
   * The formatted view logic. This is particularly used for SQL sources, where the SQL logic is formatted for better readability, and with dbt, where this contains the compiled SQL logic.
   * @return formattedViewLogic
   **/
  @Schema(description = "The formatted view logic. This is particularly used for SQL sources, where the SQL logic is formatted for better readability, and with dbt, where this contains the compiled SQL logic.")
  
    public String getFormattedViewLogic() {
    return formattedViewLogic;
  }

  public void setFormattedViewLogic(String formattedViewLogic) {
    this.formattedViewLogic = formattedViewLogic;
  }

  public ViewProperties viewLanguage(String viewLanguage) {
    this.viewLanguage = viewLanguage;
    return this;
  }

  /**
   * The view logic language / dialect
   * @return viewLanguage
   **/
  @Schema(required = true, description = "The view logic language / dialect")
      @NotNull

    public String getViewLanguage() {
    return viewLanguage;
  }

  public void setViewLanguage(String viewLanguage) {
    this.viewLanguage = viewLanguage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewProperties viewProperties = (ViewProperties) o;
    return Objects.equals(this.materialized, viewProperties.materialized) &&
        Objects.equals(this.viewLogic, viewProperties.viewLogic) &&
        Objects.equals(this.formattedViewLogic, viewProperties.formattedViewLogic) &&
        Objects.equals(this.viewLanguage, viewProperties.viewLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialized, viewLogic, formattedViewLogic, viewLanguage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewProperties {\n");
    
    sb.append("    materialized: ").append(toIndentedString(materialized)).append("\n");
    sb.append("    viewLogic: ").append(toIndentedString(viewLogic)).append("\n");
    sb.append("    formattedViewLogic: ").append(toIndentedString(formattedViewLogic)).append("\n");
    sb.append("    viewLanguage: ").append(toIndentedString(viewLanguage)).append("\n");
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