package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.Filter;
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
 * Information about how a form is assigned to entities dynamically. Provide a filter to match a set of entities instead of explicitly applying a form to specific entities.
 */
@Schema(description = "Information about how a form is assigned to entities dynamically. Provide a filter to match a set of entities instead of explicitly applying a form to specific entities.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DynamicFormAssignment  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DynamicFormAssignment") @Builder.Default
  private String __type = "DynamicFormAssignment";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DynamicFormAssignment"},
  defaultValue = "DynamicFormAssignment")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("filter") @Builder.Default
  private Filter filter = null;

  public DynamicFormAssignment filter(Filter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Filter getFilter() {
    return filter;
  }

  public void setFilter(Filter filter) {
    this.filter = filter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicFormAssignment dynamicFormAssignment = (DynamicFormAssignment) o;
    return Objects.equals(this.filter, dynamicFormAssignment.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicFormAssignment {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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