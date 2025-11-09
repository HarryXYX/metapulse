package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Sub Types. Use this aspect to specialize a generic Entity e.g. Making a Dataset also be a View or also be a LookerExplore
 */
@Schema(description = "Sub Types. Use this aspect to specialize a generic Entity e.g. Making a Dataset also be a View or also be a LookerExplore")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubTypes  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "SubTypes") @Builder.Default
  private String __type = "SubTypes";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"SubTypes"},
  defaultValue = "SubTypes")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("typeNames") @Builder.Default
  @Valid
  private List<String> typeNames = new ArrayList<>();

  public SubTypes typeNames(List<String> typeNames) {
    this.typeNames = typeNames;
    return this;
  }

  public SubTypes addTypeNamesItem(String typeNamesItem) {
    this.typeNames.add(typeNamesItem);
    return this;
  }

  /**
   * The names of the specific types.
   * @return typeNames
   **/
  @Schema(required = true, description = "The names of the specific types.")
      @NotNull

    public List<String> getTypeNames() {
    return typeNames;
  }

  public void setTypeNames(List<String> typeNames) {
    this.typeNames = typeNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubTypes subTypes = (SubTypes) o;
    return Objects.equals(this.typeNames, subTypes.typeNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubTypes {\n");
    
    sb.append("    typeNames: ").append(toIndentedString(typeNames)).append("\n");
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