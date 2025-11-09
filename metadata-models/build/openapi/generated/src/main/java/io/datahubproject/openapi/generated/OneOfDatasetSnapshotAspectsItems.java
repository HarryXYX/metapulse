package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfDatasetSnapshotAspectsItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = DatasetKey.class, name = "DatasetKey"),
  @JsonSubTypes.Type(value = DatasetProperties.class, name = "DatasetProperties"),
  @JsonSubTypes.Type(value = EditableDatasetProperties.class, name = "EditableDatasetProperties"),
  @JsonSubTypes.Type(value = DatasetDeprecation.class, name = "DatasetDeprecation"),
  @JsonSubTypes.Type(value = DatasetUpstreamLineage.class, name = "DatasetUpstreamLineage"),
  @JsonSubTypes.Type(value = UpstreamLineage.class, name = "UpstreamLineage"),
  @JsonSubTypes.Type(value = InstitutionalMemory.class, name = "InstitutionalMemory"),
  @JsonSubTypes.Type(value = Ownership.class, name = "Ownership"),
  @JsonSubTypes.Type(value = Status.class, name = "Status"),
  @JsonSubTypes.Type(value = SchemaMetadata.class, name = "SchemaMetadata"),
  @JsonSubTypes.Type(value = EditableSchemaMetadata.class, name = "EditableSchemaMetadata"),
  @JsonSubTypes.Type(value = GlobalTags.class, name = "GlobalTags"),
  @JsonSubTypes.Type(value = GlossaryTerms.class, name = "GlossaryTerms"),
  @JsonSubTypes.Type(value = BrowsePaths.class, name = "BrowsePaths"),
  @JsonSubTypes.Type(value = DataPlatformInstance.class, name = "DataPlatformInstance"),
  @JsonSubTypes.Type(value = ViewProperties.class, name = "ViewProperties"),
  @JsonSubTypes.Type(value = BrowsePathsV2.class, name = "BrowsePathsV2")
})
public interface OneOfDatasetSnapshotAspectsItems {
}