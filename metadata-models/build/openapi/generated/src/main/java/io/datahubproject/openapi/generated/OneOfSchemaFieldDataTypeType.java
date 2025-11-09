package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfSchemaFieldDataTypeType
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = BooleanType.class, name = "BooleanType"),
  @JsonSubTypes.Type(value = FixedType.class, name = "FixedType"),
  @JsonSubTypes.Type(value = StringType.class, name = "StringType"),
  @JsonSubTypes.Type(value = BytesType.class, name = "BytesType"),
  @JsonSubTypes.Type(value = NumberType.class, name = "NumberType"),
  @JsonSubTypes.Type(value = DateType.class, name = "DateType"),
  @JsonSubTypes.Type(value = TimeType.class, name = "TimeType"),
  @JsonSubTypes.Type(value = EnumType.class, name = "EnumType"),
  @JsonSubTypes.Type(value = NullType.class, name = "NullType"),
  @JsonSubTypes.Type(value = MapType.class, name = "MapType"),
  @JsonSubTypes.Type(value = ArrayType.class, name = "ArrayType"),
  @JsonSubTypes.Type(value = UnionType.class, name = "UnionType"),
  @JsonSubTypes.Type(value = RecordType.class, name = "RecordType")
})
public interface OneOfSchemaFieldDataTypeType {
}