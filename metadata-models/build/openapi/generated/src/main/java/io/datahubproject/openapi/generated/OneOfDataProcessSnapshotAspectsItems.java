package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfDataProcessSnapshotAspectsItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = DataProcessKey.class, name = "DataProcessKey"),
  @JsonSubTypes.Type(value = Ownership.class, name = "Ownership"),
  @JsonSubTypes.Type(value = DataProcessInfo.class, name = "DataProcessInfo"),
  @JsonSubTypes.Type(value = Status.class, name = "Status")
})
public interface OneOfDataProcessSnapshotAspectsItems {
}