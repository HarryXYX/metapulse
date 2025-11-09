package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfMLModelSnapshotAspectsItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = MLModelKey.class, name = "MLModelKey"),
  @JsonSubTypes.Type(value = Ownership.class, name = "Ownership"),
  @JsonSubTypes.Type(value = MLModelProperties.class, name = "MLModelProperties"),
  @JsonSubTypes.Type(value = IntendedUse.class, name = "IntendedUse"),
  @JsonSubTypes.Type(value = MLModelFactorPrompts.class, name = "MLModelFactorPrompts"),
  @JsonSubTypes.Type(value = Metrics.class, name = "Metrics"),
  @JsonSubTypes.Type(value = EvaluationData.class, name = "EvaluationData"),
  @JsonSubTypes.Type(value = TrainingData.class, name = "TrainingData"),
  @JsonSubTypes.Type(value = QuantitativeAnalyses.class, name = "QuantitativeAnalyses"),
  @JsonSubTypes.Type(value = EthicalConsiderations.class, name = "EthicalConsiderations"),
  @JsonSubTypes.Type(value = CaveatsAndRecommendations.class, name = "CaveatsAndRecommendations"),
  @JsonSubTypes.Type(value = InstitutionalMemory.class, name = "InstitutionalMemory"),
  @JsonSubTypes.Type(value = SourceCode.class, name = "SourceCode"),
  @JsonSubTypes.Type(value = Status.class, name = "Status"),
  @JsonSubTypes.Type(value = Cost.class, name = "Cost"),
  @JsonSubTypes.Type(value = Deprecation.class, name = "Deprecation"),
  @JsonSubTypes.Type(value = BrowsePaths.class, name = "BrowsePaths"),
  @JsonSubTypes.Type(value = GlobalTags.class, name = "GlobalTags"),
  @JsonSubTypes.Type(value = DataPlatformInstance.class, name = "DataPlatformInstance"),
  @JsonSubTypes.Type(value = BrowsePathsV2.class, name = "BrowsePathsV2")
})
public interface OneOfMLModelSnapshotAspectsItems {
}