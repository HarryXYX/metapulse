package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfDataHubRetentionSnapshotAspectsItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = DataHubRetentionKey.class, name = "DataHubRetentionKey"),
  @JsonSubTypes.Type(value = DataHubRetentionConfig.class, name = "DataHubRetentionConfig")
})
public interface OneOfDataHubRetentionSnapshotAspectsItems {
}