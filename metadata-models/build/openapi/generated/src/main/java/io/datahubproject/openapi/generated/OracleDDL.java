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
 * Schema holder for oracle data definition language that describes an oracle table.
 */
@Schema(description = "Schema holder for oracle data definition language that describes an oracle table.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OracleDDL  implements OneOfSchemaMetadataPlatformSchema {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "OracleDDL") @Builder.Default
  private String __type = "OracleDDL";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"OracleDDL"},
  defaultValue = "OracleDDL")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("tableSchema") @Builder.Default
  private String tableSchema = null;

  public OracleDDL tableSchema(String tableSchema) {
    this.tableSchema = tableSchema;
    return this;
  }

  /**
   * The native schema in the dataset's platform. This is a human readable (json blob) table schema.
   * @return tableSchema
   **/
  @Schema(required = true, description = "The native schema in the dataset's platform. This is a human readable (json blob) table schema.")
      @NotNull

    public String getTableSchema() {
    return tableSchema;
  }

  public void setTableSchema(String tableSchema) {
    this.tableSchema = tableSchema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OracleDDL oracleDDL = (OracleDDL) o;
    return Objects.equals(this.tableSchema, oracleDDL.tableSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableSchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OracleDDL {\n");
    
    sb.append("    tableSchema: ").append(toIndentedString(tableSchema)).append("\n");
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