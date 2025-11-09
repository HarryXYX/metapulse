package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfDataPlatformSnapshotAspectsItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = DataPlatformKey.class, name = "DataPlatformKey"),
  @JsonSubTypes.Type(value = DataPlatformInfo.class, name = "DataPlatformInfo")
})
public interface OneOfDataPlatformSnapshotAspectsItems {
}