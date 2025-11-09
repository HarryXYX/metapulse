package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfGlossaryNodeSnapshotAspectsItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = GlossaryNodeKey.class, name = "GlossaryNodeKey"),
  @JsonSubTypes.Type(value = GlossaryNodeInfo.class, name = "GlossaryNodeInfo"),
  @JsonSubTypes.Type(value = Ownership.class, name = "Ownership"),
  @JsonSubTypes.Type(value = Status.class, name = "Status")
})
public interface OneOfGlossaryNodeSnapshotAspectsItems {
}