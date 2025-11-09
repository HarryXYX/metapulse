package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfMLModelGroupSnapshotAspectsItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = MLModelGroupKey.class, name = "MLModelGroupKey"),
  @JsonSubTypes.Type(value = MLModelGroupProperties.class, name = "MLModelGroupProperties"),
  @JsonSubTypes.Type(value = Ownership.class, name = "Ownership"),
  @JsonSubTypes.Type(value = Status.class, name = "Status"),
  @JsonSubTypes.Type(value = Deprecation.class, name = "Deprecation"),
  @JsonSubTypes.Type(value = BrowsePaths.class, name = "BrowsePaths"),
  @JsonSubTypes.Type(value = GlobalTags.class, name = "GlobalTags"),
  @JsonSubTypes.Type(value = DataPlatformInstance.class, name = "DataPlatformInstance"),
  @JsonSubTypes.Type(value = BrowsePathsV2.class, name = "BrowsePathsV2")
})
public interface OneOfMLModelGroupSnapshotAspectsItems {
}