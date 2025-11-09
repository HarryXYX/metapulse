package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfForeignKeySpecForeignKey
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = DatasetFieldForeignKey.class, name = "DatasetFieldForeignKey"),
  @JsonSubTypes.Type(value = UrnForeignKey.class, name = "UrnForeignKey")
})
public interface OneOfForeignKeySpecForeignKey {
}