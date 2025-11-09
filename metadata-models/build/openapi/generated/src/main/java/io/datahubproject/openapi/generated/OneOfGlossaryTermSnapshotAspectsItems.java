package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfGlossaryTermSnapshotAspectsItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = GlossaryTermKey.class, name = "GlossaryTermKey"),
  @JsonSubTypes.Type(value = GlossaryTermInfo.class, name = "GlossaryTermInfo"),
  @JsonSubTypes.Type(value = Ownership.class, name = "Ownership"),
  @JsonSubTypes.Type(value = Status.class, name = "Status"),
  @JsonSubTypes.Type(value = BrowsePaths.class, name = "BrowsePaths"),
  @JsonSubTypes.Type(value = GlossaryRelatedTerms.class, name = "GlossaryRelatedTerms")
})
public interface OneOfGlossaryTermSnapshotAspectsItems {
}