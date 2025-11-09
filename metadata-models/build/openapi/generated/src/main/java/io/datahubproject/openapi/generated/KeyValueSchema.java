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
 * Schema text of a key-value store schema.
 */
@Schema(description = "Schema text of a key-value store schema.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeyValueSchema  implements OneOfSchemaMetadataPlatformSchema {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "KeyValueSchema") @Builder.Default
  private String __type = "KeyValueSchema";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"KeyValueSchema"},
  defaultValue = "KeyValueSchema")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("keySchema") @Builder.Default
  private String keySchema = null;

  @JsonProperty("valueSchema") @Builder.Default
  private String valueSchema = null;

  public KeyValueSchema keySchema(String keySchema) {
    this.keySchema = keySchema;
    return this;
  }

  /**
   * The raw schema for the key in the key-value store.
   * @return keySchema
   **/
  @Schema(required = true, description = "The raw schema for the key in the key-value store.")
      @NotNull

    public String getKeySchema() {
    return keySchema;
  }

  public void setKeySchema(String keySchema) {
    this.keySchema = keySchema;
  }

  public KeyValueSchema valueSchema(String valueSchema) {
    this.valueSchema = valueSchema;
    return this;
  }

  /**
   * The raw schema for the value in the key-value store.
   * @return valueSchema
   **/
  @Schema(required = true, description = "The raw schema for the value in the key-value store.")
      @NotNull

    public String getValueSchema() {
    return valueSchema;
  }

  public void setValueSchema(String valueSchema) {
    this.valueSchema = valueSchema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyValueSchema keyValueSchema = (KeyValueSchema) o;
    return Objects.equals(this.keySchema, keyValueSchema.keySchema) &&
        Objects.equals(this.valueSchema, keyValueSchema.valueSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keySchema, valueSchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyValueSchema {\n");
    
    sb.append("    keySchema: ").append(toIndentedString(keySchema)).append("\n");
    sb.append("    valueSchema: ").append(toIndentedString(valueSchema)).append("\n");
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