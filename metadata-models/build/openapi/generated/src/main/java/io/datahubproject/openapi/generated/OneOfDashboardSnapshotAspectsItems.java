package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfDashboardSnapshotAspectsItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = DashboardKey.class, name = "DashboardKey"),
  @JsonSubTypes.Type(value = DashboardInfo.class, name = "DashboardInfo"),
  @JsonSubTypes.Type(value = EditableDashboardProperties.class, name = "EditableDashboardProperties"),
  @JsonSubTypes.Type(value = Ownership.class, name = "Ownership"),
  @JsonSubTypes.Type(value = Status.class, name = "Status"),
  @JsonSubTypes.Type(value = GlobalTags.class, name = "GlobalTags"),
  @JsonSubTypes.Type(value = BrowsePaths.class, name = "BrowsePaths"),
  @JsonSubTypes.Type(value = GlossaryTerms.class, name = "GlossaryTerms"),
  @JsonSubTypes.Type(value = InstitutionalMemory.class, name = "InstitutionalMemory"),
  @JsonSubTypes.Type(value = DataPlatformInstance.class, name = "DataPlatformInstance"),
  @JsonSubTypes.Type(value = BrowsePathsV2.class, name = "BrowsePathsV2")
})
public interface OneOfDashboardSnapshotAspectsItems {
}