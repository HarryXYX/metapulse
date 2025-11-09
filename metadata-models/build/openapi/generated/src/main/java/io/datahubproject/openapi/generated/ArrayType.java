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
 * Array field type.
 */
@Schema(description = "Array field type.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArrayType  implements OneOfSchemaFieldDataTypeType {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "ArrayType") @Builder.Default
  private String __type = "ArrayType";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"ArrayType"},
  defaultValue = "ArrayType")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("nestedType") @Builder.Default
  @Valid
  private List<String> nestedType = null;

  public ArrayType nestedType(List<String> nestedType) {
    this.nestedType = nestedType;
    return this;
  }

  public ArrayType addNestedTypeItem(String nestedTypeItem) {
    if (this.nestedType == null) {
      this.nestedType = new ArrayList<>();
    }
    this.nestedType.add(nestedTypeItem);
    return this;
  }

  /**
   * List of types this array holds.
   * @return nestedType
   **/
  @Schema(description = "List of types this array holds.")
  
    public List<String> getNestedType() {
    return nestedType;
  }

  public void setNestedType(List<String> nestedType) {
    this.nestedType = nestedType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayType arrayType = (ArrayType) o;
    return Objects.equals(this.nestedType, arrayType.nestedType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nestedType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayType {\n");
    
    sb.append("    nestedType: ").append(toIndentedString(nestedType)).append("\n");
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