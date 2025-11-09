package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfCorpGroupSnapshotAspectsItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = CorpGroupKey.class, name = "CorpGroupKey"),
  @JsonSubTypes.Type(value = CorpGroupInfo.class, name = "CorpGroupInfo"),
  @JsonSubTypes.Type(value = GlobalTags.class, name = "GlobalTags"),
  @JsonSubTypes.Type(value = Status.class, name = "Status")
})
public interface OneOfCorpGroupSnapshotAspectsItems {
}