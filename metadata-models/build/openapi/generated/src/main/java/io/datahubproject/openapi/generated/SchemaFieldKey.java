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
 * Key for a SchemaField
 */
@Schema(description = "Key for a SchemaField")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SchemaFieldKey  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "SchemaFieldKey") @Builder.Default
  private String __type = "SchemaFieldKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"SchemaFieldKey"},
  defaultValue = "SchemaFieldKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("parent") @Builder.Default
  private String parent = null;

  @JsonProperty("fieldPath") @Builder.Default
  private String fieldPath = null;

  public SchemaFieldKey parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Parent associated with the schema field
   * @return parent
   **/
  @Schema(required = true, description = "Parent associated with the schema field")
      @NotNull

    public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public SchemaFieldKey fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  /**
   * fieldPath identifying the schema field
   * @return fieldPath
   **/
  @Schema(required = true, description = "fieldPath identifying the schema field")
      @NotNull

    public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaFieldKey schemaFieldKey = (SchemaFieldKey) o;
    return Objects.equals(this.parent, schemaFieldKey.parent) &&
        Objects.equals(this.fieldPath, schemaFieldKey.fieldPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, fieldPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaFieldKey {\n");
    
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
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