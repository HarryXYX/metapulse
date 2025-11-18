/* eslint-disable */
import * as Types from "../types.generated";

import {
  NonRecursiveDatasetFieldsFragment,
  InstitutionalMemoryFieldsFragment,
  GlobalTagsFieldsFragment,
  GlossaryTermsFragment,
  EntityDomainFragment,
  EntityDataProduct_AccessTokenMetadata_Fragment,
  EntityDataProduct_Application_Fragment,
  EntityDataProduct_Assertion_Fragment,
  EntityDataProduct_BusinessAttribute_Fragment,
  EntityDataProduct_Chart_Fragment,
  EntityDataProduct_Container_Fragment,
  EntityDataProduct_CorpGroup_Fragment,
  EntityDataProduct_CorpUser_Fragment,
  EntityDataProduct_Dashboard_Fragment,
  EntityDataProduct_DataContract_Fragment,
  EntityDataProduct_DataFlow_Fragment,
  EntityDataProduct_DataHubConnection_Fragment,
  EntityDataProduct_DataHubFile_Fragment,
  EntityDataProduct_DataHubPageModule_Fragment,
  EntityDataProduct_DataHubPageTemplate_Fragment,
  EntityDataProduct_DataHubPolicy_Fragment,
  EntityDataProduct_DataHubRole_Fragment,
  EntityDataProduct_DataHubView_Fragment,
  EntityDataProduct_DataJob_Fragment,
  EntityDataProduct_DataPlatform_Fragment,
  EntityDataProduct_DataPlatformInstance_Fragment,
  EntityDataProduct_DataProcessInstance_Fragment,
  EntityDataProduct_DataProduct_Fragment,
  EntityDataProduct_DataTypeEntity_Fragment,
  EntityDataProduct_Dataset_Fragment,
  EntityDataProduct_Domain_Fragment,
  EntityDataProduct_ErModelRelationship_Fragment,
  EntityDataProduct_EntityTypeEntity_Fragment,
  EntityDataProduct_ExecutionRequest_Fragment,
  EntityDataProduct_Form_Fragment,
  EntityDataProduct_GlossaryNode_Fragment,
  EntityDataProduct_GlossaryTerm_Fragment,
  EntityDataProduct_Incident_Fragment,
  EntityDataProduct_MlFeature_Fragment,
  EntityDataProduct_MlFeatureTable_Fragment,
  EntityDataProduct_MlModel_Fragment,
  EntityDataProduct_MlModelGroup_Fragment,
  EntityDataProduct_MlPrimaryKey_Fragment,
  EntityDataProduct_Notebook_Fragment,
  EntityDataProduct_OwnershipTypeEntity_Fragment,
  EntityDataProduct_Post_Fragment,
  EntityDataProduct_QueryEntity_Fragment,
  EntityDataProduct_Restricted_Fragment,
  EntityDataProduct_Role_Fragment,
  EntityDataProduct_SchemaFieldEntity_Fragment,
  EntityDataProduct_StructuredPropertyEntity_Fragment,
  EntityDataProduct_Tag_Fragment,
  EntityDataProduct_Test_Fragment,
  EntityDataProduct_VersionSet_Fragment,
  EntityDataProduct_VersionedDataset_Fragment,
  ParentContainersFieldsFragment,
  DatasetProfileFieldsFragment,
  EntityHealthFragment,
  AutoRenderAspectFieldsFragment,
  EntityPrivilegesFragment,
  StructuredPropertiesFieldsFragment,
  FormsFieldsFragment,
  OwnershipFieldsFragment,
  Notes_AccessTokenMetadata_Fragment,
  Notes_Application_Fragment,
  Notes_Assertion_Fragment,
  Notes_BusinessAttribute_Fragment,
  Notes_Chart_Fragment,
  Notes_Container_Fragment,
  Notes_CorpGroup_Fragment,
  Notes_CorpUser_Fragment,
  Notes_Dashboard_Fragment,
  Notes_DataContract_Fragment,
  Notes_DataFlow_Fragment,
  Notes_DataHubConnection_Fragment,
  Notes_DataHubFile_Fragment,
  Notes_DataHubPageModule_Fragment,
  Notes_DataHubPageTemplate_Fragment,
  Notes_DataHubPolicy_Fragment,
  Notes_DataHubRole_Fragment,
  Notes_DataHubView_Fragment,
  Notes_DataJob_Fragment,
  Notes_DataPlatform_Fragment,
  Notes_DataPlatformInstance_Fragment,
  Notes_DataProcessInstance_Fragment,
  Notes_DataProduct_Fragment,
  Notes_DataTypeEntity_Fragment,
  Notes_Dataset_Fragment,
  Notes_Domain_Fragment,
  Notes_ErModelRelationship_Fragment,
  Notes_EntityTypeEntity_Fragment,
  Notes_ExecutionRequest_Fragment,
  Notes_Form_Fragment,
  Notes_GlossaryNode_Fragment,
  Notes_GlossaryTerm_Fragment,
  Notes_Incident_Fragment,
  Notes_MlFeature_Fragment,
  Notes_MlFeatureTable_Fragment,
  Notes_MlModel_Fragment,
  Notes_MlModelGroup_Fragment,
  Notes_MlPrimaryKey_Fragment,
  Notes_Notebook_Fragment,
  Notes_OwnershipTypeEntity_Fragment,
  Notes_Post_Fragment,
  Notes_QueryEntity_Fragment,
  Notes_Restricted_Fragment,
  Notes_Role_Fragment,
  Notes_SchemaFieldEntity_Fragment,
  Notes_StructuredPropertyEntity_Fragment,
  Notes_Tag_Fragment,
  Notes_Test_Fragment,
  Notes_VersionSet_Fragment,
  Notes_VersionedDataset_Fragment,
  SchemaMetadataFieldsFragment,
} from "./fragments.generated";
import { TestFieldsFragment } from "./test.generated";
import {
  EntityProfileVersionProperties_Dataset_Fragment,
  EntityProfileVersionProperties_MlModel_Fragment,
} from "./versioning.generated";
import {
  AssertionDetailsWithRunEventsFragment,
  AssertionRunEventDetailsFragment,
} from "./assertion.generated";
import { RunResultsFragment } from "./dataProcess.generated";
import { gql } from "@apollo/client";
import {
  NonRecursiveDatasetFieldsFragmentDoc,
  InstitutionalMemoryFieldsFragmentDoc,
  GlobalTagsFieldsFragmentDoc,
  GlossaryTermsFragmentDoc,
  EntityDomainFragmentDoc,
  EntityDataProductFragmentDoc,
  ParentContainersFieldsFragmentDoc,
  DatasetProfileFieldsFragmentDoc,
  EntityHealthFragmentDoc,
  AutoRenderAspectFieldsFragmentDoc,
  EntityPrivilegesFragmentDoc,
  StructuredPropertiesFieldsFragmentDoc,
  FormsFieldsFragmentDoc,
  OwnershipFieldsFragmentDoc,
  NotesFragmentDoc,
  SchemaMetadataFieldsFragmentDoc,
} from "./fragments.generated";
import { TestFieldsFragmentDoc } from "./test.generated";
import { EntityProfileVersionPropertiesFragmentDoc } from "./versioning.generated";
import {
  AssertionDetailsWithRunEventsFragmentDoc,
  AssertionRunEventDetailsFragmentDoc,
} from "./assertion.generated";
import { RunResultsFragmentDoc } from "./dataProcess.generated";
import * as Apollo from "@apollo/client";
export type GetDataProfilesQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  limit?: Types.Maybe<Types.Scalars["Int"]>;
  startTime?: Types.Maybe<Types.Scalars["Long"]>;
  endTime?: Types.Maybe<Types.Scalars["Long"]>;
  filters?: Types.Maybe<Types.FilterInput>;
}>;

export type GetDataProfilesQuery = { __typename?: "Query" } & {
  dataset?: Types.Maybe<
    { __typename?: "Dataset" } & Pick<Types.Dataset, "urn" | "type"> & {
        datasetProfiles?: Types.Maybe<
          Array<
            { __typename?: "DatasetProfile" } & Pick<
              Types.DatasetProfile,
              "rowCount" | "columnCount" | "sizeInBytes" | "timestampMillis"
            > & {
                partitionSpec?: Types.Maybe<
                  { __typename?: "PartitionSpec" } & Pick<
                    Types.PartitionSpec,
                    "type" | "partition"
                  > & {
                      timePartition?: Types.Maybe<
                        { __typename?: "TimeWindow" } & Pick<
                          Types.TimeWindow,
                          "startTimeMillis" | "durationMillis"
                        >
                      >;
                    }
                >;
                fieldProfiles?: Types.Maybe<
                  Array<
                    { __typename?: "DatasetFieldProfile" } & Pick<
                      Types.DatasetFieldProfile,
                      | "fieldPath"
                      | "uniqueCount"
                      | "uniqueProportion"
                      | "nullCount"
                      | "nullProportion"
                      | "min"
                      | "max"
                      | "mean"
                      | "median"
                      | "stdev"
                      | "sampleValues"
                    > & {
                        quantiles?: Types.Maybe<
                          Array<
                            { __typename?: "Quantile" } & Pick<
                              Types.Quantile,
                              "quantile" | "value"
                            >
                          >
                        >;
                        distinctValueFrequencies?: Types.Maybe<
                          Array<
                            { __typename?: "ValueFrequency" } & Pick<
                              Types.ValueFrequency,
                              "value" | "frequency"
                            >
                          >
                        >;
                      }
                  >
                >;
              }
          >
        >;
      }
  >;
};

export type GetDatasetQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetDatasetQuery = { __typename?: "Query" } & {
  dataset?: Types.Maybe<
    { __typename?: "Dataset" } & {
      siblings?: Types.Maybe<
        { __typename?: "SiblingProperties" } & Pick<
          Types.SiblingProperties,
          "isPrimary"
        > & {
            siblings?: Types.Maybe<
              Array<
                Types.Maybe<
                  | ({ __typename?: "AccessTokenMetadata" } & Pick<
                      Types.AccessTokenMetadata,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Application" } & Pick<
                      Types.Application,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Assertion" } & Pick<
                      Types.Assertion,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "BusinessAttribute" } & Pick<
                      Types.BusinessAttribute,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Chart" } & Pick<
                      Types.Chart,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Container" } & Pick<
                      Types.Container,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "CorpGroup" } & Pick<
                      Types.CorpGroup,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "CorpUser" } & Pick<
                      Types.CorpUser,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Dashboard" } & Pick<
                      Types.Dashboard,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataContract" } & Pick<
                      Types.DataContract,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataFlow" } & Pick<
                      Types.DataFlow,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubConnection" } & Pick<
                      Types.DataHubConnection,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubFile" } & Pick<
                      Types.DataHubFile,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPageModule" } & Pick<
                      Types.DataHubPageModule,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPageTemplate" } & Pick<
                      Types.DataHubPageTemplate,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPolicy" } & Pick<
                      Types.DataHubPolicy,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubRole" } & Pick<
                      Types.DataHubRole,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubView" } & Pick<
                      Types.DataHubView,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataJob" } & Pick<
                      Types.DataJob,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataPlatform" } & Pick<
                      Types.DataPlatform,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataPlatformInstance" } & Pick<
                      Types.DataPlatformInstance,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataProcessInstance" } & Pick<
                      Types.DataProcessInstance,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataProduct" } & Pick<
                      Types.DataProduct,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataTypeEntity" } & Pick<
                      Types.DataTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Dataset" } & Pick<
                      Types.Dataset,
                      "urn" | "type"
                    > &
                      NonSiblingDatasetFieldsFragment)
                  | ({ __typename?: "Domain" } & Pick<
                      Types.Domain,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "ERModelRelationship" } & Pick<
                      Types.ErModelRelationship,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "EntityTypeEntity" } & Pick<
                      Types.EntityTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "ExecutionRequest" } & Pick<
                      Types.ExecutionRequest,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Form" } & Pick<Types.Form, "urn" | "type">)
                  | ({ __typename?: "GlossaryNode" } & Pick<
                      Types.GlossaryNode,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "GlossaryTerm" } & Pick<
                      Types.GlossaryTerm,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Incident" } & Pick<
                      Types.Incident,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLFeature" } & Pick<
                      Types.MlFeature,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLFeatureTable" } & Pick<
                      Types.MlFeatureTable,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLModel" } & Pick<
                      Types.MlModel,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLModelGroup" } & Pick<
                      Types.MlModelGroup,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLPrimaryKey" } & Pick<
                      Types.MlPrimaryKey,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Notebook" } & Pick<
                      Types.Notebook,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "OwnershipTypeEntity" } & Pick<
                      Types.OwnershipTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Post" } & Pick<Types.Post, "urn" | "type">)
                  | ({ __typename?: "QueryEntity" } & Pick<
                      Types.QueryEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Restricted" } & Pick<
                      Types.Restricted,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type">)
                  | ({ __typename?: "SchemaFieldEntity" } & Pick<
                      Types.SchemaFieldEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "StructuredPropertyEntity" } & Pick<
                      Types.StructuredPropertyEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn" | "type">)
                  | ({ __typename?: "Test" } & Pick<Types.Test, "urn" | "type">)
                  | ({ __typename?: "VersionSet" } & Pick<
                      Types.VersionSet,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "VersionedDataset" } & Pick<
                      Types.VersionedDataset,
                      "urn" | "type"
                    >)
                >
              >
            >;
          }
      >;
      siblingsSearch?: Types.Maybe<
        { __typename?: "ScrollResults" } & Pick<
          Types.ScrollResults,
          "count" | "total"
        > & {
            searchResults: Array<
              { __typename?: "SearchResult" } & {
                entity:
                  | ({ __typename?: "AccessTokenMetadata" } & Pick<
                      Types.AccessTokenMetadata,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Application" } & Pick<
                      Types.Application,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Assertion" } & Pick<
                      Types.Assertion,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "BusinessAttribute" } & Pick<
                      Types.BusinessAttribute,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Chart" } & Pick<
                      Types.Chart,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Container" } & Pick<
                      Types.Container,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "CorpGroup" } & Pick<
                      Types.CorpGroup,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "CorpUser" } & Pick<
                      Types.CorpUser,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Dashboard" } & Pick<
                      Types.Dashboard,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataContract" } & Pick<
                      Types.DataContract,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataFlow" } & Pick<
                      Types.DataFlow,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubConnection" } & Pick<
                      Types.DataHubConnection,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubFile" } & Pick<
                      Types.DataHubFile,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPageModule" } & Pick<
                      Types.DataHubPageModule,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPageTemplate" } & Pick<
                      Types.DataHubPageTemplate,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPolicy" } & Pick<
                      Types.DataHubPolicy,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubRole" } & Pick<
                      Types.DataHubRole,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubView" } & Pick<
                      Types.DataHubView,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataJob" } & Pick<
                      Types.DataJob,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataPlatform" } & Pick<
                      Types.DataPlatform,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataPlatformInstance" } & Pick<
                      Types.DataPlatformInstance,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataProcessInstance" } & Pick<
                      Types.DataProcessInstance,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataProduct" } & Pick<
                      Types.DataProduct,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataTypeEntity" } & Pick<
                      Types.DataTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Dataset" } & Pick<
                      Types.Dataset,
                      "urn" | "type"
                    > &
                      NonSiblingDatasetFieldsFragment)
                  | ({ __typename?: "Domain" } & Pick<
                      Types.Domain,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "ERModelRelationship" } & Pick<
                      Types.ErModelRelationship,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "EntityTypeEntity" } & Pick<
                      Types.EntityTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "ExecutionRequest" } & Pick<
                      Types.ExecutionRequest,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Form" } & Pick<Types.Form, "urn" | "type">)
                  | ({ __typename?: "GlossaryNode" } & Pick<
                      Types.GlossaryNode,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "GlossaryTerm" } & Pick<
                      Types.GlossaryTerm,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Incident" } & Pick<
                      Types.Incident,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLFeature" } & Pick<
                      Types.MlFeature,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLFeatureTable" } & Pick<
                      Types.MlFeatureTable,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLModel" } & Pick<
                      Types.MlModel,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLModelGroup" } & Pick<
                      Types.MlModelGroup,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLPrimaryKey" } & Pick<
                      Types.MlPrimaryKey,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Notebook" } & Pick<
                      Types.Notebook,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "OwnershipTypeEntity" } & Pick<
                      Types.OwnershipTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Post" } & Pick<Types.Post, "urn" | "type">)
                  | ({ __typename?: "QueryEntity" } & Pick<
                      Types.QueryEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Restricted" } & Pick<
                      Types.Restricted,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type">)
                  | ({ __typename?: "SchemaFieldEntity" } & Pick<
                      Types.SchemaFieldEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "StructuredPropertyEntity" } & Pick<
                      Types.StructuredPropertyEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn" | "type">)
                  | ({ __typename?: "Test" } & Pick<Types.Test, "urn" | "type">)
                  | ({ __typename?: "VersionSet" } & Pick<
                      Types.VersionSet,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "VersionedDataset" } & Pick<
                      Types.VersionedDataset,
                      "urn" | "type"
                    >);
              }
            >;
          }
      >;
    } & NonSiblingDatasetFieldsFragment
  >;
};

export type NonSiblingDatasetFieldsFragment = { __typename?: "Dataset" } & Pick<
  Types.Dataset,
  "exists"
> & {
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & Pick<
        Types.Deprecation,
        "actor" | "deprecated" | "note" | "decommissionTime"
      >
    >;
    globalTags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
    >;
    usageStats?: Types.Maybe<
      { __typename?: "UsageQueryResult" } & {
        buckets?: Types.Maybe<
          Array<
            Types.Maybe<
              { __typename?: "UsageAggregation" } & Pick<
                Types.UsageAggregation,
                "bucket"
              > & {
                  metrics?: Types.Maybe<
                    { __typename?: "UsageAggregationMetrics" } & Pick<
                      Types.UsageAggregationMetrics,
                      "totalSqlQueries"
                    >
                  >;
                }
            >
          >
        >;
        aggregations?: Types.Maybe<
          { __typename?: "UsageQueryResultAggregations" } & Pick<
            Types.UsageQueryResultAggregations,
            "uniqueUserCount" | "totalSqlQueries"
          > & {
              fields?: Types.Maybe<
                Array<
                  Types.Maybe<
                    { __typename?: "FieldUsageCounts" } & Pick<
                      Types.FieldUsageCounts,
                      "fieldName" | "count"
                    >
                  >
                >
              >;
            }
        >;
      }
    >;
    datasetProfiles?: Types.Maybe<
      Array<
        { __typename?: "DatasetProfile" } & Pick<
          Types.DatasetProfile,
          "rowCount" | "columnCount" | "sizeInBytes" | "timestampMillis"
        > & {
            fieldProfiles?: Types.Maybe<
              Array<
                { __typename?: "DatasetFieldProfile" } & Pick<
                  Types.DatasetFieldProfile,
                  | "fieldPath"
                  | "uniqueCount"
                  | "uniqueProportion"
                  | "nullCount"
                  | "nullProportion"
                  | "min"
                  | "max"
                  | "mean"
                  | "median"
                  | "stdev"
                  | "sampleValues"
                >
              >
            >;
          }
      >
    >;
    latestFullTableProfile?: Types.Maybe<
      Array<{ __typename?: "DatasetProfile" } & DatasetProfileFieldsFragment>
    >;
    latestPartitionProfile?: Types.Maybe<
      Array<{ __typename?: "DatasetProfile" } & DatasetProfileFieldsFragment>
    >;
    health?: Types.Maybe<
      Array<{ __typename?: "Health" } & EntityHealthFragment>
    >;
    assertions?: Types.Maybe<
      { __typename?: "EntityAssertionsResult" } & Pick<
        Types.EntityAssertionsResult,
        "total"
      >
    >;
    access?: Types.Maybe<
      { __typename?: "Access" } & {
        roles?: Types.Maybe<
          Array<
            { __typename?: "RoleAssociation" } & {
              role: { __typename?: "Role" } & Pick<Types.Role, "urn">;
            }
          >
        >;
      }
    >;
    operations?: Types.Maybe<
      Array<
        { __typename?: "Operation" } & Pick<
          Types.Operation,
          "timestampMillis" | "lastUpdatedTimestamp"
        >
      >
    >;
    autoRenderAspects?: Types.Maybe<
      Array<{ __typename?: "RawAspect" } & AutoRenderAspectFieldsFragment>
    >;
    status?: Types.Maybe<
      { __typename?: "Status" } & Pick<Types.Status, "removed">
    >;
    runs?: Types.Maybe<
      { __typename?: "DataProcessInstanceResult" } & Pick<
        Types.DataProcessInstanceResult,
        "count" | "start" | "total"
      >
    >;
    testResults?: Types.Maybe<
      { __typename?: "TestResults" } & {
        passing: Array<
          { __typename?: "TestResult" } & Pick<Types.TestResult, "type"> & {
              test?: Types.Maybe<{ __typename?: "Test" } & TestFieldsFragment>;
            }
        >;
        failing: Array<
          { __typename?: "TestResult" } & Pick<Types.TestResult, "type"> & {
              test?: Types.Maybe<{ __typename?: "Test" } & TestFieldsFragment>;
            }
        >;
      }
    >;
    statsSummary?: Types.Maybe<
      { __typename?: "DatasetStatsSummary" } & Pick<
        Types.DatasetStatsSummary,
        "queryCountLast30Days" | "uniqueUserCountLast30Days"
      > & {
          topUsersLast30Days?: Types.Maybe<
            Array<
              { __typename?: "CorpUser" } & Pick<
                Types.CorpUser,
                "urn" | "type" | "username"
              > & {
                  properties?: Types.Maybe<
                    { __typename?: "CorpUserProperties" } & Pick<
                      Types.CorpUserProperties,
                      "displayName" | "firstName" | "lastName" | "fullName"
                    >
                  >;
                  editableProperties?: Types.Maybe<
                    { __typename?: "CorpUserEditableProperties" } & Pick<
                      Types.CorpUserEditableProperties,
                      "displayName" | "pictureLink"
                    >
                  >;
                }
            >
          >;
        }
    >;
    siblings?: Types.Maybe<
      { __typename?: "SiblingProperties" } & Pick<
        Types.SiblingProperties,
        "isPrimary"
      >
    >;
    activeIncidents?: Types.Maybe<
      { __typename?: "EntityIncidentsResult" } & Pick<
        Types.EntityIncidentsResult,
        "total"
      >
    >;
    privileges?: Types.Maybe<
      { __typename?: "EntityPrivileges" } & EntityPrivilegesFragment
    >;
    forms?: Types.Maybe<{ __typename?: "Forms" } & FormsFieldsFragment>;
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
  } & NonRecursiveDatasetFieldsFragment &
  EntityDataProduct_Dataset_Fragment &
  ViewPropertiesFragment &
  Notes_Dataset_Fragment &
  EntityProfileVersionProperties_Dataset_Fragment;

export type GetRecentQueriesQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetRecentQueriesQuery = { __typename?: "Query" } & {
  dataset?: Types.Maybe<
    { __typename?: "Dataset" } & {
      usageStats?: Types.Maybe<
        { __typename?: "UsageQueryResult" } & {
          buckets?: Types.Maybe<
            Array<
              Types.Maybe<
                { __typename?: "UsageAggregation" } & Pick<
                  Types.UsageAggregation,
                  "bucket"
                > & {
                    metrics?: Types.Maybe<
                      { __typename?: "UsageAggregationMetrics" } & Pick<
                        Types.UsageAggregationMetrics,
                        "topSqlQueries"
                      >
                    >;
                  }
              >
            >
          >;
        }
      >;
    }
  >;
};

export type GetLastMonthUsageAggregationsQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetLastMonthUsageAggregationsQuery = { __typename?: "Query" } & {
  dataset?: Types.Maybe<
    { __typename?: "Dataset" } & {
      usageStats?: Types.Maybe<
        { __typename?: "UsageQueryResult" } & {
          aggregations?: Types.Maybe<
            { __typename?: "UsageQueryResultAggregations" } & Pick<
              Types.UsageQueryResultAggregations,
              "uniqueUserCount" | "totalSqlQueries"
            > & {
                users?: Types.Maybe<
                  Array<
                    Types.Maybe<
                      { __typename?: "UserUsageCounts" } & Pick<
                        Types.UserUsageCounts,
                        "count" | "userEmail"
                      > & {
                          user?: Types.Maybe<
                            { __typename?: "CorpUser" } & Pick<
                              Types.CorpUser,
                              "urn" | "type" | "username"
                            > & {
                                properties?: Types.Maybe<
                                  { __typename?: "CorpUserProperties" } & Pick<
                                    Types.CorpUserProperties,
                                    | "displayName"
                                    | "firstName"
                                    | "lastName"
                                    | "fullName"
                                  >
                                >;
                                editableProperties?: Types.Maybe<
                                  {
                                    __typename?: "CorpUserEditableProperties";
                                  } & Pick<
                                    Types.CorpUserEditableProperties,
                                    "displayName" | "pictureLink"
                                  >
                                >;
                              }
                          >;
                        }
                    >
                  >
                >;
                fields?: Types.Maybe<
                  Array<
                    Types.Maybe<
                      { __typename?: "FieldUsageCounts" } & Pick<
                        Types.FieldUsageCounts,
                        "fieldName" | "count"
                      >
                    >
                  >
                >;
              }
          >;
        }
      >;
    }
  >;
};

export type GetTimeRangeUsageAggregationsQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  timeRange: Types.TimeRange;
  startTime?: Types.Maybe<Types.Scalars["Long"]>;
  timeZone?: Types.Maybe<Types.Scalars["String"]>;
}>;

export type GetTimeRangeUsageAggregationsQuery = { __typename?: "Query" } & {
  dataset?: Types.Maybe<
    { __typename?: "Dataset" } & {
      usageStats?: Types.Maybe<
        { __typename?: "UsageQueryResult" } & {
          aggregations?: Types.Maybe<
            { __typename?: "UsageQueryResultAggregations" } & Pick<
              Types.UsageQueryResultAggregations,
              "uniqueUserCount" | "totalSqlQueries"
            > & {
                users?: Types.Maybe<
                  Array<
                    Types.Maybe<
                      { __typename?: "UserUsageCounts" } & Pick<
                        Types.UserUsageCounts,
                        "count" | "userEmail"
                      > & {
                          user?: Types.Maybe<
                            { __typename?: "CorpUser" } & Pick<
                              Types.CorpUser,
                              "urn" | "type" | "username"
                            > & {
                                properties?: Types.Maybe<
                                  { __typename?: "CorpUserProperties" } & Pick<
                                    Types.CorpUserProperties,
                                    | "displayName"
                                    | "firstName"
                                    | "lastName"
                                    | "fullName"
                                  >
                                >;
                                editableProperties?: Types.Maybe<
                                  {
                                    __typename?: "CorpUserEditableProperties";
                                  } & Pick<
                                    Types.CorpUserEditableProperties,
                                    "displayName" | "pictureLink"
                                  >
                                >;
                              }
                          >;
                        }
                    >
                  >
                >;
                fields?: Types.Maybe<
                  Array<
                    Types.Maybe<
                      { __typename?: "FieldUsageCounts" } & Pick<
                        Types.FieldUsageCounts,
                        "fieldName" | "count"
                      >
                    >
                  >
                >;
              }
          >;
          buckets?: Types.Maybe<
            Array<
              Types.Maybe<
                { __typename?: "UsageAggregation" } & Pick<
                  Types.UsageAggregation,
                  "bucket"
                > & {
                    metrics?: Types.Maybe<
                      { __typename?: "UsageAggregationMetrics" } & Pick<
                        Types.UsageAggregationMetrics,
                        "totalSqlQueries"
                      >
                    >;
                  }
              >
            >
          >;
        }
      >;
    }
  >;
};

export type UpdateDatasetMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  input: Types.DatasetUpdateInput;
}>;

export type UpdateDatasetMutation = { __typename?: "Mutation" } & {
  updateDataset?: Types.Maybe<
    { __typename?: "Dataset" } & Pick<Types.Dataset, "urn">
  >;
};

export type ViewPropertiesFragment = { __typename?: "Dataset" } & {
  viewProperties?: Types.Maybe<
    { __typename?: "ViewProperties" } & Pick<
      Types.ViewProperties,
      "materialized" | "logic" | "formattedLogic" | "language"
    >
  >;
};

export type AssertionsQueryFragment = { __typename?: "Dataset" } & {
  assertions?: Types.Maybe<
    { __typename?: "EntityAssertionsResult" } & Pick<
      Types.EntityAssertionsResult,
      "start" | "count" | "total"
    > & {
        assertions: Array<
          { __typename?: "Assertion" } & {
            runEvents?: Types.Maybe<
              { __typename?: "AssertionRunEventsResult" } & Pick<
                Types.AssertionRunEventsResult,
                "total" | "failed" | "succeeded"
              > & {
                  runEvents: Array<
                    {
                      __typename?: "AssertionRunEvent";
                    } & AssertionRunEventDetailsFragment
                  >;
                }
            >;
          } & AssertionDetailsWithRunEventsFragment
        >;
      }
  >;
};

export type GetDatasetAssertionsQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetDatasetAssertionsQuery = { __typename?: "Query" } & {
  dataset?: Types.Maybe<
    { __typename?: "Dataset" } & {
      siblings?: Types.Maybe<
        { __typename?: "SiblingProperties" } & Pick<
          Types.SiblingProperties,
          "isPrimary"
        > & {
            siblings?: Types.Maybe<
              Array<
                Types.Maybe<
                  | ({ __typename?: "AccessTokenMetadata" } & Pick<
                      Types.AccessTokenMetadata,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Application" } & Pick<
                      Types.Application,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Assertion" } & Pick<
                      Types.Assertion,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "BusinessAttribute" } & Pick<
                      Types.BusinessAttribute,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Chart" } & Pick<
                      Types.Chart,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Container" } & Pick<
                      Types.Container,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "CorpGroup" } & Pick<
                      Types.CorpGroup,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "CorpUser" } & Pick<
                      Types.CorpUser,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Dashboard" } & Pick<
                      Types.Dashboard,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataContract" } & Pick<
                      Types.DataContract,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataFlow" } & Pick<
                      Types.DataFlow,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubConnection" } & Pick<
                      Types.DataHubConnection,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubFile" } & Pick<
                      Types.DataHubFile,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPageModule" } & Pick<
                      Types.DataHubPageModule,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPageTemplate" } & Pick<
                      Types.DataHubPageTemplate,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPolicy" } & Pick<
                      Types.DataHubPolicy,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubRole" } & Pick<
                      Types.DataHubRole,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubView" } & Pick<
                      Types.DataHubView,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataJob" } & Pick<
                      Types.DataJob,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataPlatform" } & Pick<
                      Types.DataPlatform,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataPlatformInstance" } & Pick<
                      Types.DataPlatformInstance,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataProcessInstance" } & Pick<
                      Types.DataProcessInstance,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataProduct" } & Pick<
                      Types.DataProduct,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataTypeEntity" } & Pick<
                      Types.DataTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Dataset" } & Pick<
                      Types.Dataset,
                      "urn" | "type"
                    > &
                      AssertionsQueryFragment)
                  | ({ __typename?: "Domain" } & Pick<
                      Types.Domain,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "ERModelRelationship" } & Pick<
                      Types.ErModelRelationship,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "EntityTypeEntity" } & Pick<
                      Types.EntityTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "ExecutionRequest" } & Pick<
                      Types.ExecutionRequest,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Form" } & Pick<Types.Form, "urn" | "type">)
                  | ({ __typename?: "GlossaryNode" } & Pick<
                      Types.GlossaryNode,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "GlossaryTerm" } & Pick<
                      Types.GlossaryTerm,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Incident" } & Pick<
                      Types.Incident,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLFeature" } & Pick<
                      Types.MlFeature,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLFeatureTable" } & Pick<
                      Types.MlFeatureTable,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLModel" } & Pick<
                      Types.MlModel,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLModelGroup" } & Pick<
                      Types.MlModelGroup,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLPrimaryKey" } & Pick<
                      Types.MlPrimaryKey,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Notebook" } & Pick<
                      Types.Notebook,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "OwnershipTypeEntity" } & Pick<
                      Types.OwnershipTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Post" } & Pick<Types.Post, "urn" | "type">)
                  | ({ __typename?: "QueryEntity" } & Pick<
                      Types.QueryEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Restricted" } & Pick<
                      Types.Restricted,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type">)
                  | ({ __typename?: "SchemaFieldEntity" } & Pick<
                      Types.SchemaFieldEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "StructuredPropertyEntity" } & Pick<
                      Types.StructuredPropertyEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn" | "type">)
                  | ({ __typename?: "Test" } & Pick<Types.Test, "urn" | "type">)
                  | ({ __typename?: "VersionSet" } & Pick<
                      Types.VersionSet,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "VersionedDataset" } & Pick<
                      Types.VersionedDataset,
                      "urn" | "type"
                    >)
                >
              >
            >;
          }
      >;
      siblingsSearch?: Types.Maybe<
        { __typename?: "ScrollResults" } & Pick<
          Types.ScrollResults,
          "count" | "total"
        > & {
            searchResults: Array<
              { __typename?: "SearchResult" } & {
                entity:
                  | ({ __typename?: "AccessTokenMetadata" } & Pick<
                      Types.AccessTokenMetadata,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Application" } & Pick<
                      Types.Application,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Assertion" } & Pick<
                      Types.Assertion,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "BusinessAttribute" } & Pick<
                      Types.BusinessAttribute,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Chart" } & Pick<
                      Types.Chart,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Container" } & Pick<
                      Types.Container,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "CorpGroup" } & Pick<
                      Types.CorpGroup,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "CorpUser" } & Pick<
                      Types.CorpUser,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Dashboard" } & Pick<
                      Types.Dashboard,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataContract" } & Pick<
                      Types.DataContract,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataFlow" } & Pick<
                      Types.DataFlow,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubConnection" } & Pick<
                      Types.DataHubConnection,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubFile" } & Pick<
                      Types.DataHubFile,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPageModule" } & Pick<
                      Types.DataHubPageModule,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPageTemplate" } & Pick<
                      Types.DataHubPageTemplate,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPolicy" } & Pick<
                      Types.DataHubPolicy,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubRole" } & Pick<
                      Types.DataHubRole,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubView" } & Pick<
                      Types.DataHubView,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataJob" } & Pick<
                      Types.DataJob,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataPlatform" } & Pick<
                      Types.DataPlatform,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataPlatformInstance" } & Pick<
                      Types.DataPlatformInstance,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataProcessInstance" } & Pick<
                      Types.DataProcessInstance,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataProduct" } & Pick<
                      Types.DataProduct,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataTypeEntity" } & Pick<
                      Types.DataTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Dataset" } & Pick<
                      Types.Dataset,
                      "urn" | "type"
                    > &
                      AssertionsQueryFragment)
                  | ({ __typename?: "Domain" } & Pick<
                      Types.Domain,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "ERModelRelationship" } & Pick<
                      Types.ErModelRelationship,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "EntityTypeEntity" } & Pick<
                      Types.EntityTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "ExecutionRequest" } & Pick<
                      Types.ExecutionRequest,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Form" } & Pick<Types.Form, "urn" | "type">)
                  | ({ __typename?: "GlossaryNode" } & Pick<
                      Types.GlossaryNode,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "GlossaryTerm" } & Pick<
                      Types.GlossaryTerm,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Incident" } & Pick<
                      Types.Incident,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLFeature" } & Pick<
                      Types.MlFeature,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLFeatureTable" } & Pick<
                      Types.MlFeatureTable,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLModel" } & Pick<
                      Types.MlModel,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLModelGroup" } & Pick<
                      Types.MlModelGroup,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLPrimaryKey" } & Pick<
                      Types.MlPrimaryKey,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Notebook" } & Pick<
                      Types.Notebook,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "OwnershipTypeEntity" } & Pick<
                      Types.OwnershipTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Post" } & Pick<Types.Post, "urn" | "type">)
                  | ({ __typename?: "QueryEntity" } & Pick<
                      Types.QueryEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Restricted" } & Pick<
                      Types.Restricted,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type">)
                  | ({ __typename?: "SchemaFieldEntity" } & Pick<
                      Types.SchemaFieldEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "StructuredPropertyEntity" } & Pick<
                      Types.StructuredPropertyEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn" | "type">)
                  | ({ __typename?: "Test" } & Pick<Types.Test, "urn" | "type">)
                  | ({ __typename?: "VersionSet" } & Pick<
                      Types.VersionSet,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "VersionedDataset" } & Pick<
                      Types.VersionedDataset,
                      "urn" | "type"
                    >);
              }
            >;
          }
      >;
    } & AssertionsQueryFragment
  >;
};

export type GetDatasetRunsQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  start: Types.Scalars["Int"];
  count: Types.Scalars["Int"];
  direction: Types.RelationshipDirection;
}>;

export type GetDatasetRunsQuery = { __typename?: "Query" } & {
  dataset?: Types.Maybe<
    { __typename?: "Dataset" } & {
      runs?: Types.Maybe<
        { __typename?: "DataProcessInstanceResult" } & RunResultsFragment
      >;
    }
  >;
};

export type DatasetSchemaFragment = { __typename?: "Dataset" } & {
  schemaMetadata?: Types.Maybe<
    { __typename?: "SchemaMetadata" } & SchemaMetadataFieldsFragment
  >;
  editableSchemaMetadata?: Types.Maybe<
    { __typename?: "EditableSchemaMetadata" } & {
      editableSchemaFieldInfo: Array<
        { __typename?: "EditableSchemaFieldInfo" } & Pick<
          Types.EditableSchemaFieldInfo,
          "fieldPath" | "description"
        > & {
            globalTags?: Types.Maybe<
              { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
            >;
            glossaryTerms?: Types.Maybe<
              { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
            >;
          }
      >;
    }
  >;
};

export type GetDatasetSchemaQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetDatasetSchemaQuery = { __typename?: "Query" } & {
  dataset?: Types.Maybe<
    { __typename?: "Dataset" } & {
      siblings?: Types.Maybe<
        { __typename?: "SiblingProperties" } & Pick<
          Types.SiblingProperties,
          "isPrimary"
        > & {
            siblings?: Types.Maybe<
              Array<
                Types.Maybe<
                  | ({ __typename?: "AccessTokenMetadata" } & Pick<
                      Types.AccessTokenMetadata,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Application" } & Pick<
                      Types.Application,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Assertion" } & Pick<
                      Types.Assertion,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "BusinessAttribute" } & Pick<
                      Types.BusinessAttribute,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Chart" } & Pick<
                      Types.Chart,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Container" } & Pick<
                      Types.Container,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "CorpGroup" } & Pick<
                      Types.CorpGroup,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "CorpUser" } & Pick<
                      Types.CorpUser,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Dashboard" } & Pick<
                      Types.Dashboard,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataContract" } & Pick<
                      Types.DataContract,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataFlow" } & Pick<
                      Types.DataFlow,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubConnection" } & Pick<
                      Types.DataHubConnection,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubFile" } & Pick<
                      Types.DataHubFile,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPageModule" } & Pick<
                      Types.DataHubPageModule,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPageTemplate" } & Pick<
                      Types.DataHubPageTemplate,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPolicy" } & Pick<
                      Types.DataHubPolicy,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubRole" } & Pick<
                      Types.DataHubRole,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubView" } & Pick<
                      Types.DataHubView,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataJob" } & Pick<
                      Types.DataJob,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataPlatform" } & Pick<
                      Types.DataPlatform,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataPlatformInstance" } & Pick<
                      Types.DataPlatformInstance,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataProcessInstance" } & Pick<
                      Types.DataProcessInstance,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataProduct" } & Pick<
                      Types.DataProduct,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataTypeEntity" } & Pick<
                      Types.DataTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Dataset" } & Pick<
                      Types.Dataset,
                      "urn" | "type"
                    > &
                      DatasetSchemaFragment)
                  | ({ __typename?: "Domain" } & Pick<
                      Types.Domain,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "ERModelRelationship" } & Pick<
                      Types.ErModelRelationship,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "EntityTypeEntity" } & Pick<
                      Types.EntityTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "ExecutionRequest" } & Pick<
                      Types.ExecutionRequest,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Form" } & Pick<Types.Form, "urn" | "type">)
                  | ({ __typename?: "GlossaryNode" } & Pick<
                      Types.GlossaryNode,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "GlossaryTerm" } & Pick<
                      Types.GlossaryTerm,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Incident" } & Pick<
                      Types.Incident,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLFeature" } & Pick<
                      Types.MlFeature,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLFeatureTable" } & Pick<
                      Types.MlFeatureTable,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLModel" } & Pick<
                      Types.MlModel,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLModelGroup" } & Pick<
                      Types.MlModelGroup,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLPrimaryKey" } & Pick<
                      Types.MlPrimaryKey,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Notebook" } & Pick<
                      Types.Notebook,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "OwnershipTypeEntity" } & Pick<
                      Types.OwnershipTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Post" } & Pick<Types.Post, "urn" | "type">)
                  | ({ __typename?: "QueryEntity" } & Pick<
                      Types.QueryEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Restricted" } & Pick<
                      Types.Restricted,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type">)
                  | ({ __typename?: "SchemaFieldEntity" } & Pick<
                      Types.SchemaFieldEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "StructuredPropertyEntity" } & Pick<
                      Types.StructuredPropertyEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn" | "type">)
                  | ({ __typename?: "Test" } & Pick<Types.Test, "urn" | "type">)
                  | ({ __typename?: "VersionSet" } & Pick<
                      Types.VersionSet,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "VersionedDataset" } & Pick<
                      Types.VersionedDataset,
                      "urn" | "type"
                    >)
                >
              >
            >;
          }
      >;
      siblingsSearch?: Types.Maybe<
        { __typename?: "ScrollResults" } & Pick<
          Types.ScrollResults,
          "count" | "total"
        > & {
            searchResults: Array<
              { __typename?: "SearchResult" } & {
                entity:
                  | ({ __typename?: "AccessTokenMetadata" } & Pick<
                      Types.AccessTokenMetadata,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Application" } & Pick<
                      Types.Application,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Assertion" } & Pick<
                      Types.Assertion,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "BusinessAttribute" } & Pick<
                      Types.BusinessAttribute,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Chart" } & Pick<
                      Types.Chart,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Container" } & Pick<
                      Types.Container,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "CorpGroup" } & Pick<
                      Types.CorpGroup,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "CorpUser" } & Pick<
                      Types.CorpUser,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Dashboard" } & Pick<
                      Types.Dashboard,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataContract" } & Pick<
                      Types.DataContract,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataFlow" } & Pick<
                      Types.DataFlow,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubConnection" } & Pick<
                      Types.DataHubConnection,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubFile" } & Pick<
                      Types.DataHubFile,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPageModule" } & Pick<
                      Types.DataHubPageModule,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPageTemplate" } & Pick<
                      Types.DataHubPageTemplate,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPolicy" } & Pick<
                      Types.DataHubPolicy,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubRole" } & Pick<
                      Types.DataHubRole,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubView" } & Pick<
                      Types.DataHubView,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataJob" } & Pick<
                      Types.DataJob,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataPlatform" } & Pick<
                      Types.DataPlatform,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataPlatformInstance" } & Pick<
                      Types.DataPlatformInstance,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataProcessInstance" } & Pick<
                      Types.DataProcessInstance,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataProduct" } & Pick<
                      Types.DataProduct,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataTypeEntity" } & Pick<
                      Types.DataTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Dataset" } & Pick<
                      Types.Dataset,
                      "urn" | "type"
                    > &
                      DatasetSchemaFragment)
                  | ({ __typename?: "Domain" } & Pick<
                      Types.Domain,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "ERModelRelationship" } & Pick<
                      Types.ErModelRelationship,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "EntityTypeEntity" } & Pick<
                      Types.EntityTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "ExecutionRequest" } & Pick<
                      Types.ExecutionRequest,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Form" } & Pick<Types.Form, "urn" | "type">)
                  | ({ __typename?: "GlossaryNode" } & Pick<
                      Types.GlossaryNode,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "GlossaryTerm" } & Pick<
                      Types.GlossaryTerm,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Incident" } & Pick<
                      Types.Incident,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLFeature" } & Pick<
                      Types.MlFeature,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLFeatureTable" } & Pick<
                      Types.MlFeatureTable,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLModel" } & Pick<
                      Types.MlModel,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLModelGroup" } & Pick<
                      Types.MlModelGroup,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLPrimaryKey" } & Pick<
                      Types.MlPrimaryKey,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Notebook" } & Pick<
                      Types.Notebook,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "OwnershipTypeEntity" } & Pick<
                      Types.OwnershipTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Post" } & Pick<Types.Post, "urn" | "type">)
                  | ({ __typename?: "QueryEntity" } & Pick<
                      Types.QueryEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Restricted" } & Pick<
                      Types.Restricted,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type">)
                  | ({ __typename?: "SchemaFieldEntity" } & Pick<
                      Types.SchemaFieldEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "StructuredPropertyEntity" } & Pick<
                      Types.StructuredPropertyEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn" | "type">)
                  | ({ __typename?: "Test" } & Pick<Types.Test, "urn" | "type">)
                  | ({ __typename?: "VersionSet" } & Pick<
                      Types.VersionSet,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "VersionedDataset" } & Pick<
                      Types.VersionedDataset,
                      "urn" | "type"
                    >);
              }
            >;
          }
      >;
    } & DatasetSchemaFragment
  >;
};

export type GetExternalRolesQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetExternalRolesQuery = { __typename?: "Query" } & {
  dataset?: Types.Maybe<
    { __typename: "Dataset" } & {
      access?: Types.Maybe<{ __typename?: "Access" } & GetRolesFragment>;
    }
  >;
};

export type GetRolesFragment = { __typename?: "Access" } & {
  roles?: Types.Maybe<
    Array<
      { __typename?: "RoleAssociation" } & {
        role: { __typename?: "Role" } & Pick<
          Types.Role,
          "id" | "urn" | "isAssignedToMe"
        > & {
            properties?: Types.Maybe<
              { __typename?: "RoleProperties" } & Pick<
                Types.RoleProperties,
                "name" | "description" | "type" | "requestUrl"
              >
            >;
          };
      }
    >
  >;
};

export type GetOperationsQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  limit?: Types.Maybe<Types.Scalars["Int"]>;
  startTime?: Types.Maybe<Types.Scalars["Long"]>;
  endTime?: Types.Maybe<Types.Scalars["Long"]>;
  filters?: Types.Maybe<Types.FilterInput>;
}>;

export type GetOperationsQuery = { __typename?: "Query" } & {
  dataset?: Types.Maybe<
    { __typename?: "Dataset" } & {
      operations?: Types.Maybe<
        Array<
          { __typename?: "Operation" } & Pick<
            Types.Operation,
            | "timestampMillis"
            | "lastUpdatedTimestamp"
            | "operationType"
            | "actor"
            | "customOperationType"
          >
        >
      >;
    }
  >;
};

export type AssertionsQueryWithRunEventsFragment = {
  __typename?: "Dataset";
} & {
  assertions?: Types.Maybe<
    { __typename?: "EntityAssertionsResult" } & Pick<
      Types.EntityAssertionsResult,
      "start" | "count" | "total"
    > & {
        assertions: Array<
          { __typename?: "Assertion" } & AssertionDetailsWithRunEventsFragment
        >;
      }
  >;
};

export type GetOperationsStatsBucketsQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  input?: Types.Maybe<Types.OperationsStatsInput>;
}>;

export type GetOperationsStatsBucketsQuery = { __typename?: "Query" } & {
  dataset?: Types.Maybe<
    { __typename?: "Dataset" } & {
      operationsStats?: Types.Maybe<
        { __typename?: "OperationsQueryResult" } & {
          aggregations?: Types.Maybe<
            { __typename?: "OperationsAggregationsResult" } & Pick<
              Types.OperationsAggregationsResult,
              | "totalOperations"
              | "totalInserts"
              | "totalUpdates"
              | "totalDeletes"
              | "totalCreates"
              | "totalAlters"
              | "totalDrops"
              | "totalCustoms"
            > & {
                customOperationsMap?: Types.Maybe<
                  Array<
                    { __typename?: "IntMapEntry" } & Pick<
                      Types.IntMapEntry,
                      "key" | "value"
                    >
                  >
                >;
              }
          >;
          buckets?: Types.Maybe<
            Array<
              Types.Maybe<
                { __typename?: "OperationsAggregation" } & Pick<
                  Types.OperationsAggregation,
                  "bucket"
                > & {
                    aggregations?: Types.Maybe<
                      { __typename?: "OperationsAggregationsResult" } & Pick<
                        Types.OperationsAggregationsResult,
                        | "totalOperations"
                        | "totalInserts"
                        | "totalUpdates"
                        | "totalDeletes"
                        | "totalCreates"
                        | "totalAlters"
                        | "totalDrops"
                        | "totalCustoms"
                      > & {
                          customOperationsMap?: Types.Maybe<
                            Array<
                              { __typename?: "IntMapEntry" } & Pick<
                                Types.IntMapEntry,
                                "key" | "value"
                              >
                            >
                          >;
                        }
                    >;
                  }
              >
            >
          >;
        }
      >;
    }
  >;
};

export type GetDatasetTimeseriesCapabilityQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetDatasetTimeseriesCapabilityQuery = { __typename?: "Query" } & {
  dataset?: Types.Maybe<
    { __typename?: "Dataset" } & {
      timeseriesCapabilities?: Types.Maybe<
        { __typename?: "TimeseriesCapabilitiesResult" } & {
          assetStats?: Types.Maybe<
            { __typename?: "AssetStatsResult" } & Pick<
              Types.AssetStatsResult,
              | "oldestOperationTime"
              | "oldestDatasetUsageTime"
              | "oldestDatasetProfileTime"
            >
          >;
        }
      >;
    }
  >;
};

export type GetOperationsStatsQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  range: Types.TimeRange;
}>;

export type GetOperationsStatsQuery = { __typename?: "Query" } & {
  dataset?: Types.Maybe<
    { __typename?: "Dataset" } & {
      operationsStats?: Types.Maybe<
        { __typename?: "OperationsQueryResult" } & {
          aggregations?: Types.Maybe<
            { __typename?: "OperationsAggregationsResult" } & Pick<
              Types.OperationsAggregationsResult,
              | "totalOperations"
              | "totalInserts"
              | "totalUpdates"
              | "totalDeletes"
              | "totalCreates"
              | "totalAlters"
              | "totalDrops"
              | "totalCustoms"
            > & {
                customOperationsMap?: Types.Maybe<
                  Array<
                    { __typename?: "IntMapEntry" } & Pick<
                      Types.IntMapEntry,
                      "key" | "value"
                    >
                  >
                >;
              }
          >;
        }
      >;
    }
  >;
};

export type GetDatasetAssertionsWithRunEventsQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetDatasetAssertionsWithRunEventsQuery = {
  __typename?: "Query";
} & {
  dataset?: Types.Maybe<
    { __typename?: "Dataset" } & {
      siblings?: Types.Maybe<
        { __typename?: "SiblingProperties" } & Pick<
          Types.SiblingProperties,
          "isPrimary"
        >
      >;
      siblingsSearch?: Types.Maybe<
        { __typename?: "ScrollResults" } & Pick<
          Types.ScrollResults,
          "count" | "total"
        > & {
            searchResults: Array<
              { __typename?: "SearchResult" } & {
                entity:
                  | ({ __typename?: "AccessTokenMetadata" } & Pick<
                      Types.AccessTokenMetadata,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Application" } & Pick<
                      Types.Application,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Assertion" } & Pick<
                      Types.Assertion,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "BusinessAttribute" } & Pick<
                      Types.BusinessAttribute,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Chart" } & Pick<
                      Types.Chart,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Container" } & Pick<
                      Types.Container,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "CorpGroup" } & Pick<
                      Types.CorpGroup,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "CorpUser" } & Pick<
                      Types.CorpUser,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Dashboard" } & Pick<
                      Types.Dashboard,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataContract" } & Pick<
                      Types.DataContract,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataFlow" } & Pick<
                      Types.DataFlow,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubConnection" } & Pick<
                      Types.DataHubConnection,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubFile" } & Pick<
                      Types.DataHubFile,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPageModule" } & Pick<
                      Types.DataHubPageModule,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPageTemplate" } & Pick<
                      Types.DataHubPageTemplate,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubPolicy" } & Pick<
                      Types.DataHubPolicy,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubRole" } & Pick<
                      Types.DataHubRole,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataHubView" } & Pick<
                      Types.DataHubView,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataJob" } & Pick<
                      Types.DataJob,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataPlatform" } & Pick<
                      Types.DataPlatform,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataPlatformInstance" } & Pick<
                      Types.DataPlatformInstance,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataProcessInstance" } & Pick<
                      Types.DataProcessInstance,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataProduct" } & Pick<
                      Types.DataProduct,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataTypeEntity" } & Pick<
                      Types.DataTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Dataset" } & Pick<
                      Types.Dataset,
                      "urn" | "type"
                    > &
                      AssertionsQueryWithRunEventsFragment)
                  | ({ __typename?: "Domain" } & Pick<
                      Types.Domain,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "ERModelRelationship" } & Pick<
                      Types.ErModelRelationship,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "EntityTypeEntity" } & Pick<
                      Types.EntityTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "ExecutionRequest" } & Pick<
                      Types.ExecutionRequest,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Form" } & Pick<Types.Form, "urn" | "type">)
                  | ({ __typename?: "GlossaryNode" } & Pick<
                      Types.GlossaryNode,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "GlossaryTerm" } & Pick<
                      Types.GlossaryTerm,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Incident" } & Pick<
                      Types.Incident,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLFeature" } & Pick<
                      Types.MlFeature,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLFeatureTable" } & Pick<
                      Types.MlFeatureTable,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLModel" } & Pick<
                      Types.MlModel,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLModelGroup" } & Pick<
                      Types.MlModelGroup,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLPrimaryKey" } & Pick<
                      Types.MlPrimaryKey,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Notebook" } & Pick<
                      Types.Notebook,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "OwnershipTypeEntity" } & Pick<
                      Types.OwnershipTypeEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Post" } & Pick<Types.Post, "urn" | "type">)
                  | ({ __typename?: "QueryEntity" } & Pick<
                      Types.QueryEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Restricted" } & Pick<
                      Types.Restricted,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type">)
                  | ({ __typename?: "SchemaFieldEntity" } & Pick<
                      Types.SchemaFieldEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "StructuredPropertyEntity" } & Pick<
                      Types.StructuredPropertyEntity,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn" | "type">)
                  | ({ __typename?: "Test" } & Pick<Types.Test, "urn" | "type">)
                  | ({ __typename?: "VersionSet" } & Pick<
                      Types.VersionSet,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "VersionedDataset" } & Pick<
                      Types.VersionedDataset,
                      "urn" | "type"
                    >);
              }
            >;
          }
      >;
    } & AssertionsQueryWithRunEventsFragment
  >;
};

export const ViewPropertiesFragmentDoc = gql`
  fragment viewProperties on Dataset {
    viewProperties {
      materialized
      logic
      formattedLogic
      language
    }
  }
`;
export const NonSiblingDatasetFieldsFragmentDoc = gql`
  fragment nonSiblingDatasetFields on Dataset {
    ...nonRecursiveDatasetFields
    exists
    deprecation {
      actor
      deprecated
      note
      decommissionTime
    }
    globalTags {
      ...globalTagsFields
    }
    glossaryTerms {
      ...glossaryTerms
    }
    subTypes {
      typeNames
    }
    domain {
      ...entityDomain
    }
    ...entityDataProduct
    parentContainers {
      ...parentContainersFields
    }
    usageStats(range: MONTH) {
      buckets {
        bucket
        metrics {
          totalSqlQueries
        }
      }
      aggregations {
        uniqueUserCount
        totalSqlQueries
        fields {
          fieldName
          count
        }
      }
    }
    datasetProfiles(limit: 1) {
      rowCount
      columnCount
      sizeInBytes
      timestampMillis
      fieldProfiles {
        fieldPath
        uniqueCount
        uniqueProportion
        nullCount
        nullProportion
        min
        max
        mean
        median
        stdev
        sampleValues
      }
    }
    latestFullTableProfile: datasetProfiles(
      limit: 1
      filter: {
        and: [
          {
            field: "partitionSpec.partition"
            values: ["FULL_TABLE_SNAPSHOT", "SAMPLE"]
            condition: START_WITH
          }
        ]
      }
    ) {
      ...datasetProfileFields
    }
    latestPartitionProfile: datasetProfiles(
      limit: 1
      filter: {
        and: [
          {
            field: "partitionSpec.partition"
            values: ["SAMPLE", "FULL_TABLE_SNAPSHOT"]
            negated: true
            condition: START_WITH
          }
        ]
      }
    ) {
      ...datasetProfileFields
    }
    health {
      ...entityHealth
    }
    assertions(start: 0, count: 1) {
      total
    }
    access {
      roles {
        role {
          urn
        }
      }
    }
    operations(limit: 1) {
      timestampMillis
      lastUpdatedTimestamp
    }
    ...viewProperties
    autoRenderAspects: aspects(input: { autoRenderOnly: true }) {
      ...autoRenderAspectFields
    }
    status {
      removed
    }
    runs: runs(start: 0, count: 20, direction: OUTGOING) {
      count
      start
      total
    }
    testResults {
      passing {
        test {
          ...testFields
        }
        type
      }
      failing {
        test {
          ...testFields
        }
        type
      }
    }
    statsSummary {
      queryCountLast30Days
      uniqueUserCountLast30Days
      topUsersLast30Days {
        urn
        type
        username
        properties {
          displayName
          firstName
          lastName
          fullName
        }
        editableProperties {
          displayName
          pictureLink
        }
      }
    }
    siblings {
      isPrimary
    }
    activeIncidents: incidents(start: 0, count: 1, state: ACTIVE) {
      total
    }
    privileges {
      ...entityPrivileges
    }
    forms {
      ...formsFields
    }
    institutionalMemory {
      ...institutionalMemoryFields
    }
    ...notes
    ...entityProfileVersionProperties
  }
  ${NonRecursiveDatasetFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityDataProductFragmentDoc}
  ${ParentContainersFieldsFragmentDoc}
  ${DatasetProfileFieldsFragmentDoc}
  ${EntityHealthFragmentDoc}
  ${ViewPropertiesFragmentDoc}
  ${AutoRenderAspectFieldsFragmentDoc}
  ${TestFieldsFragmentDoc}
  ${EntityPrivilegesFragmentDoc}
  ${FormsFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
  ${NotesFragmentDoc}
  ${EntityProfileVersionPropertiesFragmentDoc}
`;
export const AssertionsQueryFragmentDoc = gql`
  fragment assertionsQuery on Dataset {
    assertions(start: 0, count: 1000, includeSoftDeleted: false) {
      start
      count
      total
      assertions {
        ...assertionDetailsWithRunEvents
        runEvents(status: COMPLETE, limit: 1) {
          total
          failed
          succeeded
          runEvents {
            ...assertionRunEventDetails
          }
        }
      }
    }
  }
  ${AssertionDetailsWithRunEventsFragmentDoc}
  ${AssertionRunEventDetailsFragmentDoc}
`;
export const DatasetSchemaFragmentDoc = gql`
  fragment datasetSchema on Dataset {
    schemaMetadata(version: 0) {
      ...schemaMetadataFields
    }
    editableSchemaMetadata {
      editableSchemaFieldInfo {
        fieldPath
        description
        globalTags {
          ...globalTagsFields
        }
        glossaryTerms {
          ...glossaryTerms
        }
      }
    }
  }
  ${SchemaMetadataFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
`;
export const GetRolesFragmentDoc = gql`
  fragment getRoles on Access {
    roles {
      role {
        id
        properties {
          name
          description
          type
          requestUrl
        }
        urn
        isAssignedToMe
      }
    }
  }
`;
export const AssertionsQueryWithRunEventsFragmentDoc = gql`
  fragment assertionsQueryWithRunEvents on Dataset {
    assertions(start: 0, count: 1000) {
      start
      count
      total
      assertions {
        ...assertionDetailsWithRunEvents
      }
    }
  }
  ${AssertionDetailsWithRunEventsFragmentDoc}
`;
export const GetDataProfilesDocument = gql`
  query getDataProfiles(
    $urn: String!
    $limit: Int
    $startTime: Long
    $endTime: Long
    $filters: FilterInput
  ) {
    dataset(urn: $urn) {
      urn
      type
      datasetProfiles(
        limit: $limit
        startTimeMillis: $startTime
        endTimeMillis: $endTime
        filter: $filters
      ) {
        rowCount
        columnCount
        sizeInBytes
        timestampMillis
        partitionSpec {
          type
          partition
          timePartition {
            startTimeMillis
            durationMillis
          }
        }
        fieldProfiles {
          fieldPath
          uniqueCount
          uniqueProportion
          nullCount
          nullProportion
          min
          max
          mean
          median
          stdev
          sampleValues
          quantiles {
            quantile
            value
          }
          distinctValueFrequencies {
            value
            frequency
          }
        }
      }
    }
  }
`;

/**
 * __useGetDataProfilesQuery__
 *
 * To run a query within a React component, call `useGetDataProfilesQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDataProfilesQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDataProfilesQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      limit: // value for 'limit'
 *      startTime: // value for 'startTime'
 *      endTime: // value for 'endTime'
 *      filters: // value for 'filters'
 *   },
 * });
 */
export function useGetDataProfilesQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDataProfilesQuery,
    GetDataProfilesQueryVariables
  >,
) {
  return Apollo.useQuery<GetDataProfilesQuery, GetDataProfilesQueryVariables>(
    GetDataProfilesDocument,
    baseOptions,
  );
}
export function useGetDataProfilesLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDataProfilesQuery,
    GetDataProfilesQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetDataProfilesQuery,
    GetDataProfilesQueryVariables
  >(GetDataProfilesDocument, baseOptions);
}
export type GetDataProfilesQueryHookResult = ReturnType<
  typeof useGetDataProfilesQuery
>;
export type GetDataProfilesLazyQueryHookResult = ReturnType<
  typeof useGetDataProfilesLazyQuery
>;
export type GetDataProfilesQueryResult = Apollo.QueryResult<
  GetDataProfilesQuery,
  GetDataProfilesQueryVariables
>;
export const GetDatasetDocument = gql`
  query getDataset($urn: String!) {
    dataset(urn: $urn) {
      ...nonSiblingDatasetFields
      siblings {
        isPrimary
        siblings {
          urn
          type
          ...nonSiblingDatasetFields
        }
      }
      siblingsSearch(input: { query: "*", count: 5 }) {
        count
        total
        searchResults {
          entity {
            urn
            type
            ...nonSiblingDatasetFields
          }
        }
      }
    }
  }
  ${NonSiblingDatasetFieldsFragmentDoc}
`;

/**
 * __useGetDatasetQuery__
 *
 * To run a query within a React component, call `useGetDatasetQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDatasetQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDatasetQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetDatasetQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDatasetQuery,
    GetDatasetQueryVariables
  >,
) {
  return Apollo.useQuery<GetDatasetQuery, GetDatasetQueryVariables>(
    GetDatasetDocument,
    baseOptions,
  );
}
export function useGetDatasetLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDatasetQuery,
    GetDatasetQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetDatasetQuery, GetDatasetQueryVariables>(
    GetDatasetDocument,
    baseOptions,
  );
}
export type GetDatasetQueryHookResult = ReturnType<typeof useGetDatasetQuery>;
export type GetDatasetLazyQueryHookResult = ReturnType<
  typeof useGetDatasetLazyQuery
>;
export type GetDatasetQueryResult = Apollo.QueryResult<
  GetDatasetQuery,
  GetDatasetQueryVariables
>;
export const GetRecentQueriesDocument = gql`
  query getRecentQueries($urn: String!) {
    dataset(urn: $urn) {
      usageStats(range: MONTH) {
        buckets {
          bucket
          metrics {
            topSqlQueries
          }
        }
      }
    }
  }
`;

/**
 * __useGetRecentQueriesQuery__
 *
 * To run a query within a React component, call `useGetRecentQueriesQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetRecentQueriesQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetRecentQueriesQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetRecentQueriesQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetRecentQueriesQuery,
    GetRecentQueriesQueryVariables
  >,
) {
  return Apollo.useQuery<GetRecentQueriesQuery, GetRecentQueriesQueryVariables>(
    GetRecentQueriesDocument,
    baseOptions,
  );
}
export function useGetRecentQueriesLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetRecentQueriesQuery,
    GetRecentQueriesQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetRecentQueriesQuery,
    GetRecentQueriesQueryVariables
  >(GetRecentQueriesDocument, baseOptions);
}
export type GetRecentQueriesQueryHookResult = ReturnType<
  typeof useGetRecentQueriesQuery
>;
export type GetRecentQueriesLazyQueryHookResult = ReturnType<
  typeof useGetRecentQueriesLazyQuery
>;
export type GetRecentQueriesQueryResult = Apollo.QueryResult<
  GetRecentQueriesQuery,
  GetRecentQueriesQueryVariables
>;
export const GetLastMonthUsageAggregationsDocument = gql`
  query getLastMonthUsageAggregations($urn: String!) {
    dataset(urn: $urn) {
      usageStats(range: MONTH) {
        aggregations {
          uniqueUserCount
          totalSqlQueries
          users {
            user {
              urn
              type
              username
              properties {
                displayName
                firstName
                lastName
                fullName
              }
              editableProperties {
                displayName
                pictureLink
              }
            }
            count
            userEmail
          }
          fields {
            fieldName
            count
          }
        }
      }
    }
  }
`;

/**
 * __useGetLastMonthUsageAggregationsQuery__
 *
 * To run a query within a React component, call `useGetLastMonthUsageAggregationsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetLastMonthUsageAggregationsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetLastMonthUsageAggregationsQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetLastMonthUsageAggregationsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetLastMonthUsageAggregationsQuery,
    GetLastMonthUsageAggregationsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetLastMonthUsageAggregationsQuery,
    GetLastMonthUsageAggregationsQueryVariables
  >(GetLastMonthUsageAggregationsDocument, baseOptions);
}
export function useGetLastMonthUsageAggregationsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetLastMonthUsageAggregationsQuery,
    GetLastMonthUsageAggregationsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetLastMonthUsageAggregationsQuery,
    GetLastMonthUsageAggregationsQueryVariables
  >(GetLastMonthUsageAggregationsDocument, baseOptions);
}
export type GetLastMonthUsageAggregationsQueryHookResult = ReturnType<
  typeof useGetLastMonthUsageAggregationsQuery
>;
export type GetLastMonthUsageAggregationsLazyQueryHookResult = ReturnType<
  typeof useGetLastMonthUsageAggregationsLazyQuery
>;
export type GetLastMonthUsageAggregationsQueryResult = Apollo.QueryResult<
  GetLastMonthUsageAggregationsQuery,
  GetLastMonthUsageAggregationsQueryVariables
>;
export const GetTimeRangeUsageAggregationsDocument = gql`
  query getTimeRangeUsageAggregations(
    $urn: String!
    $timeRange: TimeRange!
    $startTime: Long
    $timeZone: String
  ) {
    dataset(urn: $urn) {
      usageStats(
        range: $timeRange
        startTimeMillis: $startTime
        timeZone: $timeZone
      ) {
        aggregations {
          uniqueUserCount
          totalSqlQueries
          users {
            user {
              urn
              type
              username
              properties {
                displayName
                firstName
                lastName
                fullName
              }
              editableProperties {
                displayName
                pictureLink
              }
            }
            count
            userEmail
          }
          fields {
            fieldName
            count
          }
        }
        buckets {
          bucket
          metrics {
            totalSqlQueries
          }
        }
      }
    }
  }
`;

/**
 * __useGetTimeRangeUsageAggregationsQuery__
 *
 * To run a query within a React component, call `useGetTimeRangeUsageAggregationsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetTimeRangeUsageAggregationsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetTimeRangeUsageAggregationsQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      timeRange: // value for 'timeRange'
 *      startTime: // value for 'startTime'
 *      timeZone: // value for 'timeZone'
 *   },
 * });
 */
export function useGetTimeRangeUsageAggregationsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetTimeRangeUsageAggregationsQuery,
    GetTimeRangeUsageAggregationsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetTimeRangeUsageAggregationsQuery,
    GetTimeRangeUsageAggregationsQueryVariables
  >(GetTimeRangeUsageAggregationsDocument, baseOptions);
}
export function useGetTimeRangeUsageAggregationsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetTimeRangeUsageAggregationsQuery,
    GetTimeRangeUsageAggregationsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetTimeRangeUsageAggregationsQuery,
    GetTimeRangeUsageAggregationsQueryVariables
  >(GetTimeRangeUsageAggregationsDocument, baseOptions);
}
export type GetTimeRangeUsageAggregationsQueryHookResult = ReturnType<
  typeof useGetTimeRangeUsageAggregationsQuery
>;
export type GetTimeRangeUsageAggregationsLazyQueryHookResult = ReturnType<
  typeof useGetTimeRangeUsageAggregationsLazyQuery
>;
export type GetTimeRangeUsageAggregationsQueryResult = Apollo.QueryResult<
  GetTimeRangeUsageAggregationsQuery,
  GetTimeRangeUsageAggregationsQueryVariables
>;
export const UpdateDatasetDocument = gql`
  mutation updateDataset($urn: String!, $input: DatasetUpdateInput!) {
    updateDataset(urn: $urn, input: $input) {
      urn
    }
  }
`;
export type UpdateDatasetMutationFn = Apollo.MutationFunction<
  UpdateDatasetMutation,
  UpdateDatasetMutationVariables
>;

/**
 * __useUpdateDatasetMutation__
 *
 * To run a mutation, you first call `useUpdateDatasetMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateDatasetMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateDatasetMutation, { data, loading, error }] = useUpdateDatasetMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateDatasetMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateDatasetMutation,
    UpdateDatasetMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateDatasetMutation,
    UpdateDatasetMutationVariables
  >(UpdateDatasetDocument, baseOptions);
}
export type UpdateDatasetMutationHookResult = ReturnType<
  typeof useUpdateDatasetMutation
>;
export type UpdateDatasetMutationResult =
  Apollo.MutationResult<UpdateDatasetMutation>;
export type UpdateDatasetMutationOptions = Apollo.BaseMutationOptions<
  UpdateDatasetMutation,
  UpdateDatasetMutationVariables
>;
export const GetDatasetAssertionsDocument = gql`
  query getDatasetAssertions($urn: String!) {
    dataset(urn: $urn) {
      ...assertionsQuery
      siblings {
        isPrimary
        siblings {
          urn
          type
          ...assertionsQuery
        }
      }
      siblingsSearch(input: { query: "*", count: 5 }) {
        count
        total
        searchResults {
          entity {
            urn
            type
            ...assertionsQuery
          }
        }
      }
    }
  }
  ${AssertionsQueryFragmentDoc}
`;

/**
 * __useGetDatasetAssertionsQuery__
 *
 * To run a query within a React component, call `useGetDatasetAssertionsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDatasetAssertionsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDatasetAssertionsQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetDatasetAssertionsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDatasetAssertionsQuery,
    GetDatasetAssertionsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetDatasetAssertionsQuery,
    GetDatasetAssertionsQueryVariables
  >(GetDatasetAssertionsDocument, baseOptions);
}
export function useGetDatasetAssertionsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDatasetAssertionsQuery,
    GetDatasetAssertionsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetDatasetAssertionsQuery,
    GetDatasetAssertionsQueryVariables
  >(GetDatasetAssertionsDocument, baseOptions);
}
export type GetDatasetAssertionsQueryHookResult = ReturnType<
  typeof useGetDatasetAssertionsQuery
>;
export type GetDatasetAssertionsLazyQueryHookResult = ReturnType<
  typeof useGetDatasetAssertionsLazyQuery
>;
export type GetDatasetAssertionsQueryResult = Apollo.QueryResult<
  GetDatasetAssertionsQuery,
  GetDatasetAssertionsQueryVariables
>;
export const GetDatasetRunsDocument = gql`
  query getDatasetRuns(
    $urn: String!
    $start: Int!
    $count: Int!
    $direction: RelationshipDirection!
  ) {
    dataset(urn: $urn) {
      runs(start: $start, count: $count, direction: $direction) {
        ...runResults
      }
    }
  }
  ${RunResultsFragmentDoc}
`;

/**
 * __useGetDatasetRunsQuery__
 *
 * To run a query within a React component, call `useGetDatasetRunsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDatasetRunsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDatasetRunsQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      start: // value for 'start'
 *      count: // value for 'count'
 *      direction: // value for 'direction'
 *   },
 * });
 */
export function useGetDatasetRunsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDatasetRunsQuery,
    GetDatasetRunsQueryVariables
  >,
) {
  return Apollo.useQuery<GetDatasetRunsQuery, GetDatasetRunsQueryVariables>(
    GetDatasetRunsDocument,
    baseOptions,
  );
}
export function useGetDatasetRunsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDatasetRunsQuery,
    GetDatasetRunsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetDatasetRunsQuery, GetDatasetRunsQueryVariables>(
    GetDatasetRunsDocument,
    baseOptions,
  );
}
export type GetDatasetRunsQueryHookResult = ReturnType<
  typeof useGetDatasetRunsQuery
>;
export type GetDatasetRunsLazyQueryHookResult = ReturnType<
  typeof useGetDatasetRunsLazyQuery
>;
export type GetDatasetRunsQueryResult = Apollo.QueryResult<
  GetDatasetRunsQuery,
  GetDatasetRunsQueryVariables
>;
export const GetDatasetSchemaDocument = gql`
  query getDatasetSchema($urn: String!) {
    dataset(urn: $urn) {
      ...datasetSchema
      siblings {
        isPrimary
        siblings {
          urn
          type
          ... on Dataset {
            ...datasetSchema
          }
        }
      }
      siblingsSearch(input: { query: "*", count: 5 }) {
        count
        total
        searchResults {
          entity {
            urn
            type
            ...datasetSchema
          }
        }
      }
    }
  }
  ${DatasetSchemaFragmentDoc}
`;

/**
 * __useGetDatasetSchemaQuery__
 *
 * To run a query within a React component, call `useGetDatasetSchemaQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDatasetSchemaQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDatasetSchemaQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetDatasetSchemaQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDatasetSchemaQuery,
    GetDatasetSchemaQueryVariables
  >,
) {
  return Apollo.useQuery<GetDatasetSchemaQuery, GetDatasetSchemaQueryVariables>(
    GetDatasetSchemaDocument,
    baseOptions,
  );
}
export function useGetDatasetSchemaLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDatasetSchemaQuery,
    GetDatasetSchemaQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetDatasetSchemaQuery,
    GetDatasetSchemaQueryVariables
  >(GetDatasetSchemaDocument, baseOptions);
}
export type GetDatasetSchemaQueryHookResult = ReturnType<
  typeof useGetDatasetSchemaQuery
>;
export type GetDatasetSchemaLazyQueryHookResult = ReturnType<
  typeof useGetDatasetSchemaLazyQuery
>;
export type GetDatasetSchemaQueryResult = Apollo.QueryResult<
  GetDatasetSchemaQuery,
  GetDatasetSchemaQueryVariables
>;
export const GetExternalRolesDocument = gql`
  query getExternalRoles($urn: String!) {
    dataset(urn: $urn) {
      access {
        ...getRoles
      }
      __typename
    }
  }
  ${GetRolesFragmentDoc}
`;

/**
 * __useGetExternalRolesQuery__
 *
 * To run a query within a React component, call `useGetExternalRolesQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetExternalRolesQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetExternalRolesQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetExternalRolesQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetExternalRolesQuery,
    GetExternalRolesQueryVariables
  >,
) {
  return Apollo.useQuery<GetExternalRolesQuery, GetExternalRolesQueryVariables>(
    GetExternalRolesDocument,
    baseOptions,
  );
}
export function useGetExternalRolesLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetExternalRolesQuery,
    GetExternalRolesQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetExternalRolesQuery,
    GetExternalRolesQueryVariables
  >(GetExternalRolesDocument, baseOptions);
}
export type GetExternalRolesQueryHookResult = ReturnType<
  typeof useGetExternalRolesQuery
>;
export type GetExternalRolesLazyQueryHookResult = ReturnType<
  typeof useGetExternalRolesLazyQuery
>;
export type GetExternalRolesQueryResult = Apollo.QueryResult<
  GetExternalRolesQuery,
  GetExternalRolesQueryVariables
>;
export const GetOperationsDocument = gql`
  query getOperations(
    $urn: String!
    $limit: Int
    $startTime: Long
    $endTime: Long
    $filters: FilterInput
  ) {
    dataset(urn: $urn) {
      operations(
        limit: $limit
        startTimeMillis: $startTime
        endTimeMillis: $endTime
        filter: $filters
      ) {
        timestampMillis
        lastUpdatedTimestamp
        operationType
        actor
        lastUpdatedTimestamp
        customOperationType
      }
    }
  }
`;

/**
 * __useGetOperationsQuery__
 *
 * To run a query within a React component, call `useGetOperationsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetOperationsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetOperationsQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      limit: // value for 'limit'
 *      startTime: // value for 'startTime'
 *      endTime: // value for 'endTime'
 *      filters: // value for 'filters'
 *   },
 * });
 */
export function useGetOperationsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetOperationsQuery,
    GetOperationsQueryVariables
  >,
) {
  return Apollo.useQuery<GetOperationsQuery, GetOperationsQueryVariables>(
    GetOperationsDocument,
    baseOptions,
  );
}
export function useGetOperationsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetOperationsQuery,
    GetOperationsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetOperationsQuery, GetOperationsQueryVariables>(
    GetOperationsDocument,
    baseOptions,
  );
}
export type GetOperationsQueryHookResult = ReturnType<
  typeof useGetOperationsQuery
>;
export type GetOperationsLazyQueryHookResult = ReturnType<
  typeof useGetOperationsLazyQuery
>;
export type GetOperationsQueryResult = Apollo.QueryResult<
  GetOperationsQuery,
  GetOperationsQueryVariables
>;
export const GetOperationsStatsBucketsDocument = gql`
  query getOperationsStatsBuckets($urn: String!, $input: OperationsStatsInput) {
    dataset(urn: $urn) {
      operationsStats(input: $input) {
        aggregations {
          totalOperations
          totalInserts
          totalUpdates
          totalDeletes
          totalCreates
          totalAlters
          totalDrops
          totalCustoms
          customOperationsMap {
            key
            value
          }
        }
        buckets {
          bucket
          aggregations {
            totalOperations
            totalInserts
            totalUpdates
            totalDeletes
            totalCreates
            totalAlters
            totalDrops
            totalCustoms
            customOperationsMap {
              key
              value
            }
          }
        }
      }
    }
  }
`;

/**
 * __useGetOperationsStatsBucketsQuery__
 *
 * To run a query within a React component, call `useGetOperationsStatsBucketsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetOperationsStatsBucketsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetOperationsStatsBucketsQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      input: // value for 'input'
 *   },
 * });
 */
export function useGetOperationsStatsBucketsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetOperationsStatsBucketsQuery,
    GetOperationsStatsBucketsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetOperationsStatsBucketsQuery,
    GetOperationsStatsBucketsQueryVariables
  >(GetOperationsStatsBucketsDocument, baseOptions);
}
export function useGetOperationsStatsBucketsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetOperationsStatsBucketsQuery,
    GetOperationsStatsBucketsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetOperationsStatsBucketsQuery,
    GetOperationsStatsBucketsQueryVariables
  >(GetOperationsStatsBucketsDocument, baseOptions);
}
export type GetOperationsStatsBucketsQueryHookResult = ReturnType<
  typeof useGetOperationsStatsBucketsQuery
>;
export type GetOperationsStatsBucketsLazyQueryHookResult = ReturnType<
  typeof useGetOperationsStatsBucketsLazyQuery
>;
export type GetOperationsStatsBucketsQueryResult = Apollo.QueryResult<
  GetOperationsStatsBucketsQuery,
  GetOperationsStatsBucketsQueryVariables
>;
export const GetDatasetTimeseriesCapabilityDocument = gql`
  query getDatasetTimeseriesCapability($urn: String!) {
    dataset(urn: $urn) {
      timeseriesCapabilities {
        assetStats {
          oldestOperationTime
          oldestDatasetUsageTime
          oldestDatasetProfileTime
        }
      }
    }
  }
`;

/**
 * __useGetDatasetTimeseriesCapabilityQuery__
 *
 * To run a query within a React component, call `useGetDatasetTimeseriesCapabilityQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDatasetTimeseriesCapabilityQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDatasetTimeseriesCapabilityQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetDatasetTimeseriesCapabilityQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDatasetTimeseriesCapabilityQuery,
    GetDatasetTimeseriesCapabilityQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetDatasetTimeseriesCapabilityQuery,
    GetDatasetTimeseriesCapabilityQueryVariables
  >(GetDatasetTimeseriesCapabilityDocument, baseOptions);
}
export function useGetDatasetTimeseriesCapabilityLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDatasetTimeseriesCapabilityQuery,
    GetDatasetTimeseriesCapabilityQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetDatasetTimeseriesCapabilityQuery,
    GetDatasetTimeseriesCapabilityQueryVariables
  >(GetDatasetTimeseriesCapabilityDocument, baseOptions);
}
export type GetDatasetTimeseriesCapabilityQueryHookResult = ReturnType<
  typeof useGetDatasetTimeseriesCapabilityQuery
>;
export type GetDatasetTimeseriesCapabilityLazyQueryHookResult = ReturnType<
  typeof useGetDatasetTimeseriesCapabilityLazyQuery
>;
export type GetDatasetTimeseriesCapabilityQueryResult = Apollo.QueryResult<
  GetDatasetTimeseriesCapabilityQuery,
  GetDatasetTimeseriesCapabilityQueryVariables
>;
export const GetOperationsStatsDocument = gql`
  query getOperationsStats($urn: String!, $range: TimeRange!) {
    dataset(urn: $urn) {
      operationsStats(input: { range: $range }) {
        aggregations {
          totalOperations
          totalInserts
          totalUpdates
          totalDeletes
          totalCreates
          totalAlters
          totalDrops
          totalCustoms
          customOperationsMap {
            key
            value
          }
        }
      }
    }
  }
`;

/**
 * __useGetOperationsStatsQuery__
 *
 * To run a query within a React component, call `useGetOperationsStatsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetOperationsStatsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetOperationsStatsQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      range: // value for 'range'
 *   },
 * });
 */
export function useGetOperationsStatsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetOperationsStatsQuery,
    GetOperationsStatsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetOperationsStatsQuery,
    GetOperationsStatsQueryVariables
  >(GetOperationsStatsDocument, baseOptions);
}
export function useGetOperationsStatsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetOperationsStatsQuery,
    GetOperationsStatsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetOperationsStatsQuery,
    GetOperationsStatsQueryVariables
  >(GetOperationsStatsDocument, baseOptions);
}
export type GetOperationsStatsQueryHookResult = ReturnType<
  typeof useGetOperationsStatsQuery
>;
export type GetOperationsStatsLazyQueryHookResult = ReturnType<
  typeof useGetOperationsStatsLazyQuery
>;
export type GetOperationsStatsQueryResult = Apollo.QueryResult<
  GetOperationsStatsQuery,
  GetOperationsStatsQueryVariables
>;
export const GetDatasetAssertionsWithRunEventsDocument = gql`
  query getDatasetAssertionsWithRunEvents($urn: String!) {
    dataset(urn: $urn) {
      ...assertionsQueryWithRunEvents
      siblings {
        isPrimary
      }
      siblingsSearch(input: { query: "*", count: 5 }) {
        count
        total
        searchResults {
          entity {
            urn
            type
            ...assertionsQueryWithRunEvents
          }
        }
      }
    }
  }
  ${AssertionsQueryWithRunEventsFragmentDoc}
`;

/**
 * __useGetDatasetAssertionsWithRunEventsQuery__
 *
 * To run a query within a React component, call `useGetDatasetAssertionsWithRunEventsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDatasetAssertionsWithRunEventsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDatasetAssertionsWithRunEventsQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetDatasetAssertionsWithRunEventsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDatasetAssertionsWithRunEventsQuery,
    GetDatasetAssertionsWithRunEventsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetDatasetAssertionsWithRunEventsQuery,
    GetDatasetAssertionsWithRunEventsQueryVariables
  >(GetDatasetAssertionsWithRunEventsDocument, baseOptions);
}
export function useGetDatasetAssertionsWithRunEventsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDatasetAssertionsWithRunEventsQuery,
    GetDatasetAssertionsWithRunEventsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetDatasetAssertionsWithRunEventsQuery,
    GetDatasetAssertionsWithRunEventsQueryVariables
  >(GetDatasetAssertionsWithRunEventsDocument, baseOptions);
}
export type GetDatasetAssertionsWithRunEventsQueryHookResult = ReturnType<
  typeof useGetDatasetAssertionsWithRunEventsQuery
>;
export type GetDatasetAssertionsWithRunEventsLazyQueryHookResult = ReturnType<
  typeof useGetDatasetAssertionsWithRunEventsLazyQuery
>;
export type GetDatasetAssertionsWithRunEventsQueryResult = Apollo.QueryResult<
  GetDatasetAssertionsWithRunEventsQuery,
  GetDatasetAssertionsWithRunEventsQueryVariables
>;
