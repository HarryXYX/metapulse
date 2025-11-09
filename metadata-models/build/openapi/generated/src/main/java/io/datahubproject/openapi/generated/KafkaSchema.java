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
 * Schema holder for kafka schema.
 */
@Schema(description = "Schema holder for kafka schema.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KafkaSchema  implements OneOfSchemaMetadataPlatformSchema {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "KafkaSchema") @Builder.Default
  private String __type = "KafkaSchema";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"KafkaSchema"},
  defaultValue = "KafkaSchema")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("documentSchema") @Builder.Default
  private String documentSchema = null;

  @JsonProperty("documentSchemaType") @Builder.Default
  private String documentSchemaType = null;

  @JsonProperty("keySchema") @Builder.Default
  private String keySchema = null;

  @JsonProperty("keySchemaType") @Builder.Default
  private String keySchemaType = null;

  public KafkaSchema documentSchema(String documentSchema) {
    this.documentSchema = documentSchema;
    return this;
  }

  /**
   * The native kafka document schema. This is a human readable avro document schema.
   * @return documentSchema
   **/
  @Schema(required = true, description = "The native kafka document schema. This is a human readable avro document schema.")
      @NotNull

    public String getDocumentSchema() {
    return documentSchema;
  }

  public void setDocumentSchema(String documentSchema) {
    this.documentSchema = documentSchema;
  }

  public KafkaSchema documentSchemaType(String documentSchemaType) {
    this.documentSchemaType = documentSchemaType;
    return this;
  }

  /**
   * The native kafka document schema type. This can be AVRO/PROTOBUF/JSON.
   * @return documentSchemaType
   **/
  @Schema(description = "The native kafka document schema type. This can be AVRO/PROTOBUF/JSON.")
  
    public String getDocumentSchemaType() {
    return documentSchemaType;
  }

  public void setDocumentSchemaType(String documentSchemaType) {
    this.documentSchemaType = documentSchemaType;
  }

  public KafkaSchema keySchema(String keySchema) {
    this.keySchema = keySchema;
    return this;
  }

  /**
   * The native kafka key schema as retrieved from Schema Registry
   * @return keySchema
   **/
  @Schema(description = "The native kafka key schema as retrieved from Schema Registry")
  
    public String getKeySchema() {
    return keySchema;
  }

  public void setKeySchema(String keySchema) {
    this.keySchema = keySchema;
  }

  public KafkaSchema keySchemaType(String keySchemaType) {
    this.keySchemaType = keySchemaType;
    return this;
  }

  /**
   * The native kafka key schema type. This can be AVRO/PROTOBUF/JSON.
   * @return keySchemaType
   **/
  @Schema(description = "The native kafka key schema type. This can be AVRO/PROTOBUF/JSON.")
  
    public String getKeySchemaType() {
    return keySchemaType;
  }

  public void setKeySchemaType(String keySchemaType) {
    this.keySchemaType = keySchemaType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KafkaSchema kafkaSchema = (KafkaSchema) o;
    return Objects.equals(this.documentSchema, kafkaSchema.documentSchema) &&
        Objects.equals(this.documentSchemaType, kafkaSchema.documentSchemaType) &&
        Objects.equals(this.keySchema, kafkaSchema.keySchema) &&
        Objects.equals(this.keySchemaType, kafkaSchema.keySchemaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentSchema, documentSchemaType, keySchema, keySchemaType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KafkaSchema {\n");
    
    sb.append("    documentSchema: ").append(toIndentedString(documentSchema)).append("\n");
    sb.append("    documentSchemaType: ").append(toIndentedString(documentSchemaType)).append("\n");
    sb.append("    keySchema: ").append(toIndentedString(keySchema)).append("\n");
    sb.append("    keySchemaType: ").append(toIndentedString(keySchemaType)).append("\n");
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