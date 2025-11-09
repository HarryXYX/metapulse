package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfBaseFieldMappingTransformation
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = TransformationType.class, name = "TransformationType"),
  @JsonSubTypes.Type(value = UDFTransformer.class, name = "UDFTransformer")
})
public interface OneOfBaseFieldMappingTransformation {
}