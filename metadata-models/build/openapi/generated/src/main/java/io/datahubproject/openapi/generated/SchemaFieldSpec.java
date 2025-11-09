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
/**
 * Lightweight spec used for referencing a particular schema field.
 */
@Schema(description = "Lightweight spec used for referencing a particular schema field.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SchemaFieldSpec   {

  @JsonProperty("path") @Builder.Default
  private String path = null;

  @JsonProperty("type") @Builder.Default
  private String type = null;

  @JsonProperty("nativeType") @Builder.Default
  private String nativeType = null;

  public SchemaFieldSpec path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The field path
   * @return path
   **/
  @Schema(required = true, description = "The field path")
      @NotNull

    public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public SchemaFieldSpec type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The DataHub standard schema field type.
   * @return type
   **/
  @Schema(required = true, description = "The DataHub standard schema field type.")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SchemaFieldSpec nativeType(String nativeType) {
    this.nativeType = nativeType;
    return this;
  }

  /**
   * The native field type
   * @return nativeType
   **/
  @Schema(required = true, description = "The native field type")
      @NotNull

    public String getNativeType() {
    return nativeType;
  }

  public void setNativeType(String nativeType) {
    this.nativeType = nativeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaFieldSpec schemaFieldSpec = (SchemaFieldSpec) o;
    return Objects.equals(this.path, schemaFieldSpec.path) &&
        Objects.equals(this.type, schemaFieldSpec.type) &&
        Objects.equals(this.nativeType, schemaFieldSpec.nativeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, type, nativeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaFieldSpec {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    nativeType: ").append(toIndentedString(nativeType)).append("\n");
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