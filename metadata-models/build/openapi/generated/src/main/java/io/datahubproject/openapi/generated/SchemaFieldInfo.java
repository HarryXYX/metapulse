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
 * SchemaFieldInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SchemaFieldInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "SchemaFieldInfo") @Builder.Default
  private String __type = "SchemaFieldInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"SchemaFieldInfo"},
  defaultValue = "SchemaFieldInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("schemaFieldAliases") @Builder.Default
  @Valid
  private List<String> schemaFieldAliases = null;

  public SchemaFieldInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SchemaFieldInfo schemaFieldAliases(List<String> schemaFieldAliases) {
    this.schemaFieldAliases = schemaFieldAliases;
    return this;
  }

  public SchemaFieldInfo addSchemaFieldAliasesItem(String schemaFieldAliasesItem) {
    if (this.schemaFieldAliases == null) {
      this.schemaFieldAliases = new ArrayList<>();
    }
    this.schemaFieldAliases.add(schemaFieldAliasesItem);
    return this;
  }

  /**
   * Used to store field path variations for the schemaField urn.
   * @return schemaFieldAliases
   **/
  @Schema(description = "Used to store field path variations for the schemaField urn.")
  
    public List<String> getSchemaFieldAliases() {
    return schemaFieldAliases;
  }

  public void setSchemaFieldAliases(List<String> schemaFieldAliases) {
    this.schemaFieldAliases = schemaFieldAliases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaFieldInfo schemaFieldInfo = (SchemaFieldInfo) o;
    return Objects.equals(this.name, schemaFieldInfo.name) &&
        Objects.equals(this.schemaFieldAliases, schemaFieldInfo.schemaFieldAliases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, schemaFieldAliases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaFieldInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schemaFieldAliases: ").append(toIndentedString(schemaFieldAliases)).append("\n");
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