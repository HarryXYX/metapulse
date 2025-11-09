package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.SchemaAssertionCompatibility;
import io.datahubproject.openapi.generated.SchemaMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Attributes that are applicable to schema assertions
 */
@Schema(description = "Attributes that are applicable to schema assertions")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SchemaAssertionInfo   {

  @JsonProperty("entity") @Builder.Default
  private String entity = null;

  @JsonProperty("schema") @Builder.Default
  private SchemaMetadata schema = null;

  @JsonProperty("compatibility") @Builder.Default
  private SchemaAssertionCompatibility compatibility = null;

  public SchemaAssertionInfo entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * The entity targeted by the assertion
   * @return entity
   **/
  @Schema(required = true, description = "The entity targeted by the assertion")
      @NotNull

    public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public SchemaAssertionInfo schema(SchemaMetadata schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   * @return schema
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SchemaMetadata getSchema() {
    return schema;
  }

  public void setSchema(SchemaMetadata schema) {
    this.schema = schema;
  }

  public SchemaAssertionInfo compatibility(SchemaAssertionCompatibility compatibility) {
    this.compatibility = compatibility;
    return this;
  }

  /**
   * Get compatibility
   * @return compatibility
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SchemaAssertionCompatibility getCompatibility() {
    return compatibility;
  }

  public void setCompatibility(SchemaAssertionCompatibility compatibility) {
    this.compatibility = compatibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaAssertionInfo schemaAssertionInfo = (SchemaAssertionInfo) o;
    return Objects.equals(this.entity, schemaAssertionInfo.entity) &&
        Objects.equals(this.schema, schemaAssertionInfo.schema) &&
        Objects.equals(this.compatibility, schemaAssertionInfo.compatibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, schema, compatibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaAssertionInfo {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    compatibility: ").append(toIndentedString(compatibility)).append("\n");
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