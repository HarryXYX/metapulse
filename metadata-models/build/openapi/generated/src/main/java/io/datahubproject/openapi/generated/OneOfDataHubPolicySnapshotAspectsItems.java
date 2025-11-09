package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfDataHubPolicySnapshotAspectsItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = DataHubPolicyKey.class, name = "DataHubPolicyKey"),
  @JsonSubTypes.Type(value = DataHubPolicyInfo.class, name = "DataHubPolicyInfo")
})
public interface OneOfDataHubPolicySnapshotAspectsItems {
}