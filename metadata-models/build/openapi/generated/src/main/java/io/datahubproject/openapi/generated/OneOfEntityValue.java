package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfEntityValue
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = ChartSnapshot.class, name = "ChartSnapshot"),
  @JsonSubTypes.Type(value = CorpGroupSnapshot.class, name = "CorpGroupSnapshot"),
  @JsonSubTypes.Type(value = CorpUserSnapshot.class, name = "CorpUserSnapshot"),
  @JsonSubTypes.Type(value = DashboardSnapshot.class, name = "DashboardSnapshot"),
  @JsonSubTypes.Type(value = DataFlowSnapshot.class, name = "DataFlowSnapshot"),
  @JsonSubTypes.Type(value = DataJobSnapshot.class, name = "DataJobSnapshot"),
  @JsonSubTypes.Type(value = DatasetSnapshot.class, name = "DatasetSnapshot"),
  @JsonSubTypes.Type(value = DataProcessSnapshot.class, name = "DataProcessSnapshot"),
  @JsonSubTypes.Type(value = DataPlatformSnapshot.class, name = "DataPlatformSnapshot"),
  @JsonSubTypes.Type(value = MLModelSnapshot.class, name = "MLModelSnapshot"),
  @JsonSubTypes.Type(value = MLPrimaryKeySnapshot.class, name = "MLPrimaryKeySnapshot"),
  @JsonSubTypes.Type(value = MLFeatureSnapshot.class, name = "MLFeatureSnapshot"),
  @JsonSubTypes.Type(value = MLFeatureTableSnapshot.class, name = "MLFeatureTableSnapshot"),
  @JsonSubTypes.Type(value = MLModelDeploymentSnapshot.class, name = "MLModelDeploymentSnapshot"),
  @JsonSubTypes.Type(value = MLModelGroupSnapshot.class, name = "MLModelGroupSnapshot"),
  @JsonSubTypes.Type(value = TagSnapshot.class, name = "TagSnapshot"),
  @JsonSubTypes.Type(value = GlossaryTermSnapshot.class, name = "GlossaryTermSnapshot"),
  @JsonSubTypes.Type(value = GlossaryNodeSnapshot.class, name = "GlossaryNodeSnapshot"),
  @JsonSubTypes.Type(value = DataHubPolicySnapshot.class, name = "DataHubPolicySnapshot"),
  @JsonSubTypes.Type(value = SchemaFieldSnapshot.class, name = "SchemaFieldSnapshot"),
  @JsonSubTypes.Type(value = DataHubRetentionSnapshot.class, name = "DataHubRetentionSnapshot")
})
public interface OneOfEntityValue {
}