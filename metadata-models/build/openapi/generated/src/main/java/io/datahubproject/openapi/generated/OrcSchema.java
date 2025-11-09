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
 * Schema text of an ORC schema.
 */
@Schema(description = "Schema text of an ORC schema.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrcSchema  implements OneOfSchemaMetadataPlatformSchema {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "OrcSchema") @Builder.Default
  private String __type = "OrcSchema";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"OrcSchema"},
  defaultValue = "OrcSchema")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("schema") @Builder.Default
  private String schema = null;

  public OrcSchema schema(String schema) {
    this.schema = schema;
    return this;
  }

  /**
   * The native schema for ORC file format.
   * @return schema
   **/
  @Schema(required = true, description = "The native schema for ORC file format.")
      @NotNull

    public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrcSchema orcSchema = (OrcSchema) o;
    return Objects.equals(this.schema, orcSchema.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrcSchema {\n");
    
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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