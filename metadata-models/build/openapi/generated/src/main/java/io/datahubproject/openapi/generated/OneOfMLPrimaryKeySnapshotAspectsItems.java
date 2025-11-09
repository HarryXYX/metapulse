package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfMLPrimaryKeySnapshotAspectsItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = MLPrimaryKeyKey.class, name = "MLPrimaryKeyKey"),
  @JsonSubTypes.Type(value = MLPrimaryKeyProperties.class, name = "MLPrimaryKeyProperties"),
  @JsonSubTypes.Type(value = Ownership.class, name = "Ownership"),
  @JsonSubTypes.Type(value = InstitutionalMemory.class, name = "InstitutionalMemory"),
  @JsonSubTypes.Type(value = Status.class, name = "Status"),
  @JsonSubTypes.Type(value = Deprecation.class, name = "Deprecation"),
  @JsonSubTypes.Type(value = GlobalTags.class, name = "GlobalTags"),
  @JsonSubTypes.Type(value = DataPlatformInstance.class, name = "DataPlatformInstance")
})
public interface OneOfMLPrimaryKeySnapshotAspectsItems {
}