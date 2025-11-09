package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.SchemaField;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Information about a field a chart or dashboard references
 */
@Schema(description = "Information about a field a chart or dashboard references")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InputField   {

  @JsonProperty("schemaFieldUrn") @Builder.Default
  private String schemaFieldUrn = null;

  @JsonProperty("schemaField") @Builder.Default
  private SchemaField schemaField = null;

  public InputField schemaFieldUrn(String schemaFieldUrn) {
    this.schemaFieldUrn = schemaFieldUrn;
    return this;
  }

  /**
   * Urn of the schema being referenced for lineage purposes
   * @return schemaFieldUrn
   **/
  @Schema(required = true, description = "Urn of the schema being referenced for lineage purposes")
      @NotNull

    public String getSchemaFieldUrn() {
    return schemaFieldUrn;
  }

  public void setSchemaFieldUrn(String schemaFieldUrn) {
    this.schemaFieldUrn = schemaFieldUrn;
  }

  public InputField schemaField(SchemaField schemaField) {
    this.schemaField = schemaField;
    return this;
  }

  /**
   * Get schemaField
   * @return schemaField
   **/
  @Schema(description = "")
  
    @Valid
    public SchemaField getSchemaField() {
    return schemaField;
  }

  public void setSchemaField(SchemaField schemaField) {
    this.schemaField = schemaField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputField inputField = (InputField) o;
    return Objects.equals(this.schemaFieldUrn, inputField.schemaFieldUrn) &&
        Objects.equals(this.schemaField, inputField.schemaField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaFieldUrn, schemaField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputField {\n");
    
    sb.append("    schemaFieldUrn: ").append(toIndentedString(schemaFieldUrn)).append("\n");
    sb.append("    schemaField: ").append(toIndentedString(schemaField)).append("\n");
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