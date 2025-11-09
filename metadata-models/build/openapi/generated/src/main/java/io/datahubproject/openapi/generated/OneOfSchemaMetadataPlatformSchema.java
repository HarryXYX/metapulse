package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfSchemaMetadataPlatformSchema
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = EspressoSchema.class, name = "EspressoSchema"),
  @JsonSubTypes.Type(value = OracleDDL.class, name = "OracleDDL"),
  @JsonSubTypes.Type(value = MySqlDDL.class, name = "MySqlDDL"),
  @JsonSubTypes.Type(value = PrestoDDL.class, name = "PrestoDDL"),
  @JsonSubTypes.Type(value = KafkaSchema.class, name = "KafkaSchema"),
  @JsonSubTypes.Type(value = BinaryJsonSchema.class, name = "BinaryJsonSchema"),
  @JsonSubTypes.Type(value = OrcSchema.class, name = "OrcSchema"),
  @JsonSubTypes.Type(value = Schemaless.class, name = "Schemaless"),
  @JsonSubTypes.Type(value = KeyValueSchema.class, name = "KeyValueSchema"),
  @JsonSubTypes.Type(value = OtherSchema.class, name = "OtherSchema")
})
public interface OneOfSchemaMetadataPlatformSchema {
}