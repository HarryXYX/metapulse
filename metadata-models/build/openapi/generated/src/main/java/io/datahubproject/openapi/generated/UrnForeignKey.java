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
 * If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.
 */
@Schema(description = "If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UrnForeignKey  implements OneOfForeignKeySpecForeignKey {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "UrnForeignKey") @Builder.Default
  private String __type = "UrnForeignKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"UrnForeignKey"},
  defaultValue = "UrnForeignKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("currentFieldPath") @Builder.Default
  private String currentFieldPath = null;

  public UrnForeignKey currentFieldPath(String currentFieldPath) {
    this.currentFieldPath = currentFieldPath;
    return this;
  }

  /**
   * Field in hosting(current) SchemaMetadata.
   * @return currentFieldPath
   **/
  @Schema(required = true, description = "Field in hosting(current) SchemaMetadata.")
      @NotNull

    public String getCurrentFieldPath() {
    return currentFieldPath;
  }

  public void setCurrentFieldPath(String currentFieldPath) {
    this.currentFieldPath = currentFieldPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrnForeignKey urnForeignKey = (UrnForeignKey) o;
    return Objects.equals(this.currentFieldPath, urnForeignKey.currentFieldPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentFieldPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrnForeignKey {\n");
    
    sb.append("    currentFieldPath: ").append(toIndentedString(currentFieldPath)).append("\n");
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