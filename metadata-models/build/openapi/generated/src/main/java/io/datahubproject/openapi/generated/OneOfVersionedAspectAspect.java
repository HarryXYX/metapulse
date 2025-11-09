package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfVersionedAspectAspect
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = ChartKey.class, name = "ChartKey"),
  @JsonSubTypes.Type(value = ChartInfo.class, name = "ChartInfo"),
  @JsonSubTypes.Type(value = ChartQuery.class, name = "ChartQuery"),
  @JsonSubTypes.Type(value = CorpGroupKey.class, name = "CorpGroupKey"),
  @JsonSubTypes.Type(value = CorpGroupInfo.class, name = "CorpGroupInfo"),
  @JsonSubTypes.Type(value = CorpUserKey.class, name = "CorpUserKey"),
  @JsonSubTypes.Type(value = CorpUserEditableInfo.class, name = "CorpUserEditableInfo"),
  @JsonSubTypes.Type(value = CorpUserInfo.class, name = "CorpUserInfo"),
  @JsonSubTypes.Type(value = CorpUserStatus.class, name = "CorpUserStatus"),
  @JsonSubTypes.Type(value = GroupMembership.class, name = "GroupMembership"),
  @JsonSubTypes.Type(value = DashboardKey.class, name = "DashboardKey"),
  @JsonSubTypes.Type(value = DashboardInfo.class, name = "DashboardInfo"),
  @JsonSubTypes.Type(value = DataFlowKey.class, name = "DataFlowKey"),
  @JsonSubTypes.Type(value = DataFlowInfo.class, name = "DataFlowInfo"),
  @JsonSubTypes.Type(value = DataJobKey.class, name = "DataJobKey"),
  @JsonSubTypes.Type(value = DataJobInfo.class, name = "DataJobInfo"),
  @JsonSubTypes.Type(value = DataJobInputOutput.class, name = "DataJobInputOutput"),
  @JsonSubTypes.Type(value = DatasetDeprecation.class, name = "DatasetDeprecation"),
  @JsonSubTypes.Type(value = DatasetProperties.class, name = "DatasetProperties"),
  @JsonSubTypes.Type(value = UpstreamLineage.class, name = "UpstreamLineage"),
  @JsonSubTypes.Type(value = SchemaMetadata.class, name = "SchemaMetadata"),
  @JsonSubTypes.Type(value = EditableSchemaMetadata.class, name = "EditableSchemaMetadata"),
  @JsonSubTypes.Type(value = InstitutionalMemory.class, name = "InstitutionalMemory"),
  @JsonSubTypes.Type(value = GlossaryNodeInfo.class, name = "GlossaryNodeInfo"),
  @JsonSubTypes.Type(value = GlossaryNodeKey.class, name = "GlossaryNodeKey"),
  @JsonSubTypes.Type(value = GlossaryTermInfo.class, name = "GlossaryTermInfo"),
  @JsonSubTypes.Type(value = GlossaryTermKey.class, name = "GlossaryTermKey"),
  @JsonSubTypes.Type(value = MLFeatureKey.class, name = "MLFeatureKey"),
  @JsonSubTypes.Type(value = MLFeatureProperties.class, name = "MLFeatureProperties"),
  @JsonSubTypes.Type(value = MLModelKey.class, name = "MLModelKey"),
  @JsonSubTypes.Type(value = CaveatsAndRecommendations.class, name = "CaveatsAndRecommendations"),
  @JsonSubTypes.Type(value = EthicalConsiderations.class, name = "EthicalConsiderations"),
  @JsonSubTypes.Type(value = EvaluationData.class, name = "EvaluationData"),
  @JsonSubTypes.Type(value = IntendedUse.class, name = "IntendedUse"),
  @JsonSubTypes.Type(value = Metrics.class, name = "Metrics"),
  @JsonSubTypes.Type(value = MLModelFactorPrompts.class, name = "MLModelFactorPrompts"),
  @JsonSubTypes.Type(value = MLModelProperties.class, name = "MLModelProperties"),
  @JsonSubTypes.Type(value = QuantitativeAnalyses.class, name = "QuantitativeAnalyses"),
  @JsonSubTypes.Type(value = TrainingData.class, name = "TrainingData"),
  @JsonSubTypes.Type(value = SourceCode.class, name = "SourceCode"),
  @JsonSubTypes.Type(value = TagKey.class, name = "TagKey"),
  @JsonSubTypes.Type(value = TagProperties.class, name = "TagProperties"),
  @JsonSubTypes.Type(value = Ownership.class, name = "Ownership"),
  @JsonSubTypes.Type(value = Status.class, name = "Status"),
  @JsonSubTypes.Type(value = GlobalTags.class, name = "GlobalTags"),
  @JsonSubTypes.Type(value = BrowsePaths.class, name = "BrowsePaths"),
  @JsonSubTypes.Type(value = DataPlatformInstance.class, name = "DataPlatformInstance")
})
public interface OneOfVersionedAspectAspect {
}