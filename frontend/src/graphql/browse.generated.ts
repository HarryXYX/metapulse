/* eslint-disable */
import * as Types from "../types.generated";

import {
  PlatformFieldsFragment,
  OwnershipFieldsFragment,
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
  NonRecursiveDataFlowFieldsFragment,
  InstitutionalMemoryFieldsFragment,
  EntityApplicationFragment,
  DeprecationFieldsFragment,
  EmbedFieldsFragment,
  DataPlatformInstanceFieldsFragment,
  EntityHealthFragment,
  StructuredPropertiesFieldsFragment,
  BrowsePathV2FieldsFragment,
  ParentContainersFieldsFragment,
  InputFieldsFieldsFragment,
  EntityPrivilegesFragment,
  AutoRenderAspectFieldsFragment,
  FormsFieldsFragment,
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
  EntityContainerFragment,
  NonConflictingPlatformFieldsFragment,
  DisplayPropertiesFieldsFragment,
  ParentDomainsFieldsFragment,
  DomainEntitiesFieldsFragment,
  EntityDisplayNameFields_AccessTokenMetadata_Fragment,
  EntityDisplayNameFields_Application_Fragment,
  EntityDisplayNameFields_Assertion_Fragment,
  EntityDisplayNameFields_BusinessAttribute_Fragment,
  EntityDisplayNameFields_Chart_Fragment,
  EntityDisplayNameFields_Container_Fragment,
  EntityDisplayNameFields_CorpGroup_Fragment,
  EntityDisplayNameFields_CorpUser_Fragment,
  EntityDisplayNameFields_Dashboard_Fragment,
  EntityDisplayNameFields_DataContract_Fragment,
  EntityDisplayNameFields_DataFlow_Fragment,
  EntityDisplayNameFields_DataHubConnection_Fragment,
  EntityDisplayNameFields_DataHubFile_Fragment,
  EntityDisplayNameFields_DataHubPageModule_Fragment,
  EntityDisplayNameFields_DataHubPageTemplate_Fragment,
  EntityDisplayNameFields_DataHubPolicy_Fragment,
  EntityDisplayNameFields_DataHubRole_Fragment,
  EntityDisplayNameFields_DataHubView_Fragment,
  EntityDisplayNameFields_DataJob_Fragment,
  EntityDisplayNameFields_DataPlatform_Fragment,
  EntityDisplayNameFields_DataPlatformInstance_Fragment,
  EntityDisplayNameFields_DataProcessInstance_Fragment,
  EntityDisplayNameFields_DataProduct_Fragment,
  EntityDisplayNameFields_DataTypeEntity_Fragment,
  EntityDisplayNameFields_Dataset_Fragment,
  EntityDisplayNameFields_Domain_Fragment,
  EntityDisplayNameFields_ErModelRelationship_Fragment,
  EntityDisplayNameFields_EntityTypeEntity_Fragment,
  EntityDisplayNameFields_ExecutionRequest_Fragment,
  EntityDisplayNameFields_Form_Fragment,
  EntityDisplayNameFields_GlossaryNode_Fragment,
  EntityDisplayNameFields_GlossaryTerm_Fragment,
  EntityDisplayNameFields_Incident_Fragment,
  EntityDisplayNameFields_MlFeature_Fragment,
  EntityDisplayNameFields_MlFeatureTable_Fragment,
  EntityDisplayNameFields_MlModel_Fragment,
  EntityDisplayNameFields_MlModelGroup_Fragment,
  EntityDisplayNameFields_MlPrimaryKey_Fragment,
  EntityDisplayNameFields_Notebook_Fragment,
  EntityDisplayNameFields_OwnershipTypeEntity_Fragment,
  EntityDisplayNameFields_Post_Fragment,
  EntityDisplayNameFields_QueryEntity_Fragment,
  EntityDisplayNameFields_Restricted_Fragment,
  EntityDisplayNameFields_Role_Fragment,
  EntityDisplayNameFields_SchemaFieldEntity_Fragment,
  EntityDisplayNameFields_StructuredPropertyEntity_Fragment,
  EntityDisplayNameFields_Tag_Fragment,
  EntityDisplayNameFields_Test_Fragment,
  EntityDisplayNameFields_VersionSet_Fragment,
  EntityDisplayNameFields_VersionedDataset_Fragment,
  NonRecursiveMlFeatureTableFragment,
  NonRecursiveMlFeatureFragment,
  NonRecursiveMlPrimaryKeyFragment,
  ErmodelrelationPropertiesFieldsFragment,
  ErmodelrelationEditablePropertiesFieldsFragment,
  SchemaMetadataFieldsFragment,
  ParentNodesFieldsFragment,
  CustomPropertiesFieldsFragment,
  GlossaryNodeFragment,
  BusinessAttributeFragment,
  DocumentationFieldsFragment,
  StructuredPropertyFieldsFragment,
} from "./fragments.generated";
import { gql } from "@apollo/client";
import {
  PlatformFieldsFragmentDoc,
  OwnershipFieldsFragmentDoc,
  GlobalTagsFieldsFragmentDoc,
  GlossaryTermsFragmentDoc,
  EntityDomainFragmentDoc,
  EntityDataProductFragmentDoc,
  NonRecursiveDataFlowFieldsFragmentDoc,
  InstitutionalMemoryFieldsFragmentDoc,
  EntityApplicationFragmentDoc,
  DeprecationFieldsFragmentDoc,
  EmbedFieldsFragmentDoc,
  DataPlatformInstanceFieldsFragmentDoc,
  EntityHealthFragmentDoc,
  StructuredPropertiesFieldsFragmentDoc,
  BrowsePathV2FieldsFragmentDoc,
  ParentContainersFieldsFragmentDoc,
  InputFieldsFieldsFragmentDoc,
  EntityPrivilegesFragmentDoc,
  AutoRenderAspectFieldsFragmentDoc,
  FormsFieldsFragmentDoc,
  NotesFragmentDoc,
  EntityContainerFragmentDoc,
  NonConflictingPlatformFieldsFragmentDoc,
  DisplayPropertiesFieldsFragmentDoc,
  ParentDomainsFieldsFragmentDoc,
  DomainEntitiesFieldsFragmentDoc,
  EntityDisplayNameFieldsFragmentDoc,
  NonRecursiveMlFeatureTableFragmentDoc,
  NonRecursiveMlFeatureFragmentDoc,
  NonRecursiveMlPrimaryKeyFragmentDoc,
  ErmodelrelationPropertiesFieldsFragmentDoc,
  ErmodelrelationEditablePropertiesFieldsFragmentDoc,
  SchemaMetadataFieldsFragmentDoc,
  ParentNodesFieldsFragmentDoc,
  CustomPropertiesFieldsFragmentDoc,
  GlossaryNodeFragmentDoc,
  BusinessAttributeFragmentDoc,
  DocumentationFieldsFragmentDoc,
  StructuredPropertyFieldsFragmentDoc,
} from "./fragments.generated";
import * as Apollo from "@apollo/client";
export type GetBrowsePathsQueryVariables = Types.Exact<{
  input: Types.BrowsePathsInput;
}>;

export type GetBrowsePathsQuery = { __typename?: "Query" } & {
  browsePaths?: Types.Maybe<
    Array<{ __typename?: "BrowsePath" } & Pick<Types.BrowsePath, "path">>
  >;
};

export type GetBrowseResultsQueryVariables = Types.Exact<{
  input: Types.BrowseInput;
}>;

export type GetBrowseResultsQuery = { __typename?: "Query" } & {
  browse?: Types.Maybe<
    { __typename?: "BrowseResults" } & Pick<
      Types.BrowseResults,
      "start" | "count" | "total"
    > & {
        entities: Array<
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
              "urn" | "type" | "tool" | "chartId"
            > & {
                properties?: Types.Maybe<
                  { __typename?: "ChartProperties" } & Pick<
                    Types.ChartProperties,
                    "name" | "description" | "externalUrl" | "type" | "access"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time"
                      >;
                    }
                >;
                editableProperties?: Types.Maybe<
                  { __typename?: "ChartEditableProperties" } & Pick<
                    Types.ChartEditableProperties,
                    "description"
                  >
                >;
                ownership?: Types.Maybe<
                  { __typename?: "Ownership" } & OwnershipFieldsFragment
                >;
                globalTags?: Types.Maybe<
                  { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
                >;
                glossaryTerms?: Types.Maybe<
                  { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
                >;
                platform: {
                  __typename?: "DataPlatform";
                } & PlatformFieldsFragment;
                domain?: Types.Maybe<
                  { __typename?: "DomainAssociation" } & EntityDomainFragment
                >;
                subTypes?: Types.Maybe<
                  { __typename?: "SubTypes" } & Pick<
                    Types.SubTypes,
                    "typeNames"
                  >
                >;
              } & EntityDataProduct_Chart_Fragment)
          | ({ __typename?: "Container" } & Pick<
              Types.Container,
              "urn" | "type"
            >)
          | ({ __typename?: "CorpGroup" } & Pick<
              Types.CorpGroup,
              "urn" | "type"
            >)
          | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type">)
          | ({ __typename?: "Dashboard" } & Pick<
              Types.Dashboard,
              "urn" | "type" | "tool" | "dashboardId"
            > & {
                properties?: Types.Maybe<
                  { __typename?: "DashboardProperties" } & Pick<
                    Types.DashboardProperties,
                    "name" | "description" | "externalUrl" | "access"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time"
                      >;
                    }
                >;
                editableProperties?: Types.Maybe<
                  { __typename?: "DashboardEditableProperties" } & Pick<
                    Types.DashboardEditableProperties,
                    "description"
                  >
                >;
                ownership?: Types.Maybe<
                  { __typename?: "Ownership" } & OwnershipFieldsFragment
                >;
                globalTags?: Types.Maybe<
                  { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
                >;
                glossaryTerms?: Types.Maybe<
                  { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
                >;
                platform: {
                  __typename?: "DataPlatform";
                } & PlatformFieldsFragment;
                domain?: Types.Maybe<
                  { __typename?: "DomainAssociation" } & EntityDomainFragment
                >;
                subTypes?: Types.Maybe<
                  { __typename?: "SubTypes" } & Pick<
                    Types.SubTypes,
                    "typeNames"
                  >
                >;
              } & EntityDataProduct_Dashboard_Fragment)
          | ({ __typename?: "DataContract" } & Pick<
              Types.DataContract,
              "urn" | "type"
            >)
          | ({ __typename?: "DataFlow" } & Pick<
              Types.DataFlow,
              "urn" | "type" | "orchestrator" | "flowId" | "cluster"
            > & {
                properties?: Types.Maybe<
                  { __typename?: "DataFlowProperties" } & Pick<
                    Types.DataFlowProperties,
                    "name" | "description" | "project"
                  >
                >;
                editableProperties?: Types.Maybe<
                  { __typename?: "DataFlowEditableProperties" } & Pick<
                    Types.DataFlowEditableProperties,
                    "description"
                  >
                >;
                ownership?: Types.Maybe<
                  { __typename?: "Ownership" } & OwnershipFieldsFragment
                >;
                globalTags?: Types.Maybe<
                  { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
                >;
                glossaryTerms?: Types.Maybe<
                  { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
                >;
                platform: {
                  __typename?: "DataPlatform";
                } & PlatformFieldsFragment;
                domain?: Types.Maybe<
                  { __typename?: "DomainAssociation" } & EntityDomainFragment
                >;
              } & EntityDataProduct_DataFlow_Fragment)
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
              "urn" | "type" | "jobId"
            > & {
                dataFlow?: Types.Maybe<
                  {
                    __typename?: "DataFlow";
                  } & NonRecursiveDataFlowFieldsFragment
                >;
                ownership?: Types.Maybe<
                  { __typename?: "Ownership" } & OwnershipFieldsFragment
                >;
                properties?: Types.Maybe<
                  { __typename?: "DataJobProperties" } & Pick<
                    Types.DataJobProperties,
                    "name" | "description"
                  >
                >;
                globalTags?: Types.Maybe<
                  { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
                >;
                glossaryTerms?: Types.Maybe<
                  { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
                >;
                editableProperties?: Types.Maybe<
                  { __typename?: "DataJobEditableProperties" } & Pick<
                    Types.DataJobEditableProperties,
                    "description"
                  >
                >;
                domain?: Types.Maybe<
                  { __typename?: "DomainAssociation" } & EntityDomainFragment
                >;
                subTypes?: Types.Maybe<
                  { __typename?: "SubTypes" } & Pick<
                    Types.SubTypes,
                    "typeNames"
                  >
                >;
              } & EntityDataProduct_DataJob_Fragment)
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
              "name" | "origin" | "urn" | "type"
            > & {
                properties?: Types.Maybe<
                  { __typename?: "DatasetProperties" } & Pick<
                    Types.DatasetProperties,
                    "name" | "description"
                  >
                >;
                editableProperties?: Types.Maybe<
                  { __typename?: "DatasetEditableProperties" } & Pick<
                    Types.DatasetEditableProperties,
                    "name" | "description"
                  >
                >;
                platform: {
                  __typename?: "DataPlatform";
                } & PlatformFieldsFragment;
                ownership?: Types.Maybe<
                  { __typename?: "Ownership" } & OwnershipFieldsFragment
                >;
                globalTags?: Types.Maybe<
                  { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
                >;
                glossaryTerms?: Types.Maybe<
                  { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
                >;
                subTypes?: Types.Maybe<
                  { __typename?: "SubTypes" } & Pick<
                    Types.SubTypes,
                    "typeNames"
                  >
                >;
                domain?: Types.Maybe<
                  { __typename?: "DomainAssociation" } & EntityDomainFragment
                >;
              } & EntityDataProduct_Dataset_Fragment)
          | ({ __typename?: "Domain" } & Pick<Types.Domain, "urn" | "type">)
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
            > & {
                ownership?: Types.Maybe<
                  { __typename?: "Ownership" } & OwnershipFieldsFragment
                >;
                properties?: Types.Maybe<
                  { __typename?: "GlossaryTermProperties" } & Pick<
                    Types.GlossaryTermProperties,
                    | "name"
                    | "description"
                    | "definition"
                    | "termSource"
                    | "sourceRef"
                    | "sourceUrl"
                  > & {
                      customProperties?: Types.Maybe<
                        Array<
                          { __typename?: "CustomPropertiesEntry" } & Pick<
                            Types.CustomPropertiesEntry,
                            "key" | "value"
                          >
                        >
                      >;
                    }
                >;
              })
          | ({ __typename?: "Incident" } & Pick<Types.Incident, "urn" | "type">)
          | ({ __typename?: "MLFeature" } & Pick<
              Types.MlFeature,
              "urn" | "type"
            >)
          | ({ __typename?: "MLFeatureTable" } & Pick<
              Types.MlFeatureTable,
              "urn" | "type" | "name" | "description"
            > & {
                featureTableProperties?: Types.Maybe<
                  { __typename?: "MLFeatureTableProperties" } & Pick<
                    Types.MlFeatureTableProperties,
                    "description"
                  > & {
                      mlFeatures?: Types.Maybe<
                        Array<
                          Types.Maybe<
                            { __typename?: "MLFeature" } & Pick<
                              Types.MlFeature,
                              "urn"
                            >
                          >
                        >
                      >;
                      mlPrimaryKeys?: Types.Maybe<
                        Array<
                          Types.Maybe<
                            { __typename?: "MLPrimaryKey" } & Pick<
                              Types.MlPrimaryKey,
                              "urn"
                            >
                          >
                        >
                      >;
                    }
                >;
                ownership?: Types.Maybe<
                  { __typename?: "Ownership" } & OwnershipFieldsFragment
                >;
                platform: {
                  __typename?: "DataPlatform";
                } & PlatformFieldsFragment;
              })
          | ({ __typename?: "MLModel" } & Pick<
              Types.MlModel,
              "name" | "origin" | "description" | "urn" | "type"
            > & {
                ownership?: Types.Maybe<
                  { __typename?: "Ownership" } & OwnershipFieldsFragment
                >;
                globalTags?: Types.Maybe<
                  { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
                >;
                platform: {
                  __typename?: "DataPlatform";
                } & PlatformFieldsFragment;
              })
          | ({ __typename?: "MLModelGroup" } & Pick<
              Types.MlModelGroup,
              "name" | "origin" | "description" | "urn" | "type"
            > & {
                ownership?: Types.Maybe<
                  { __typename?: "Ownership" } & OwnershipFieldsFragment
                >;
                platform: {
                  __typename?: "DataPlatform";
                } & PlatformFieldsFragment;
              })
          | ({ __typename?: "MLPrimaryKey" } & Pick<
              Types.MlPrimaryKey,
              "urn" | "type"
            >)
          | ({ __typename?: "Notebook" } & Pick<Types.Notebook, "urn" | "type">)
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
        >;
        groups: Array<
          { __typename?: "BrowseResultGroup" } & Pick<
            Types.BrowseResultGroup,
            "name" | "count"
          >
        >;
        metadata: { __typename?: "BrowseResultMetadata" } & Pick<
          Types.BrowseResultMetadata,
          "path" | "totalNumEntities"
        >;
      }
  >;
};

export const GetBrowsePathsDocument = gql`
  query getBrowsePaths($input: BrowsePathsInput!) {
    browsePaths(input: $input) {
      path
    }
  }
`;

/**
 * __useGetBrowsePathsQuery__
 *
 * To run a query within a React component, call `useGetBrowsePathsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetBrowsePathsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetBrowsePathsQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useGetBrowsePathsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetBrowsePathsQuery,
    GetBrowsePathsQueryVariables
  >,
) {
  return Apollo.useQuery<GetBrowsePathsQuery, GetBrowsePathsQueryVariables>(
    GetBrowsePathsDocument,
    baseOptions,
  );
}
export function useGetBrowsePathsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetBrowsePathsQuery,
    GetBrowsePathsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetBrowsePathsQuery, GetBrowsePathsQueryVariables>(
    GetBrowsePathsDocument,
    baseOptions,
  );
}
export type GetBrowsePathsQueryHookResult = ReturnType<
  typeof useGetBrowsePathsQuery
>;
export type GetBrowsePathsLazyQueryHookResult = ReturnType<
  typeof useGetBrowsePathsLazyQuery
>;
export type GetBrowsePathsQueryResult = Apollo.QueryResult<
  GetBrowsePathsQuery,
  GetBrowsePathsQueryVariables
>;
export const GetBrowseResultsDocument = gql`
  query getBrowseResults($input: BrowseInput!) {
    browse(input: $input) {
      entities {
        urn
        type
        ... on Dataset {
          name
          origin
          properties {
            name
            description
          }
          editableProperties {
            name
            description
          }
          platform {
            ...platformFields
          }
          ownership {
            ...ownershipFields
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
        }
        ... on Dashboard {
          urn
          type
          tool
          dashboardId
          properties {
            name
            description
            externalUrl
            access
            lastModified {
              time
            }
          }
          editableProperties {
            description
          }
          ownership {
            ...ownershipFields
          }
          globalTags {
            ...globalTagsFields
          }
          glossaryTerms {
            ...glossaryTerms
          }
          platform {
            ...platformFields
          }
          domain {
            ...entityDomain
          }
          ...entityDataProduct
          subTypes {
            typeNames
          }
        }
        ... on GlossaryTerm {
          ownership {
            ...ownershipFields
          }
          properties {
            name
            description
            definition
            termSource
            sourceRef
            sourceUrl
            customProperties {
              key
              value
            }
          }
        }
        ... on Chart {
          urn
          type
          tool
          chartId
          properties {
            name
            description
            externalUrl
            type
            access
            lastModified {
              time
            }
          }
          editableProperties {
            description
          }
          ownership {
            ...ownershipFields
          }
          globalTags {
            ...globalTagsFields
          }
          glossaryTerms {
            ...glossaryTerms
          }
          platform {
            ...platformFields
          }
          domain {
            ...entityDomain
          }
          subTypes {
            typeNames
          }
          ...entityDataProduct
        }
        ... on DataFlow {
          urn
          type
          orchestrator
          flowId
          cluster
          properties {
            name
            description
            project
          }
          editableProperties {
            description
          }
          ownership {
            ...ownershipFields
          }
          globalTags {
            ...globalTagsFields
          }
          glossaryTerms {
            ...glossaryTerms
          }
          platform {
            ...platformFields
          }
          domain {
            ...entityDomain
          }
          ...entityDataProduct
        }
        ... on DataJob {
          urn
          type
          dataFlow {
            ...nonRecursiveDataFlowFields
          }
          jobId
          ownership {
            ...ownershipFields
          }
          properties {
            name
            description
          }
          globalTags {
            ...globalTagsFields
          }
          glossaryTerms {
            ...glossaryTerms
          }
          editableProperties {
            description
          }
          domain {
            ...entityDomain
          }
          subTypes {
            typeNames
          }
          ...entityDataProduct
        }
        ... on MLFeatureTable {
          urn
          type
          name
          description
          featureTableProperties {
            description
            mlFeatures {
              urn
            }
            mlPrimaryKeys {
              urn
            }
          }
          ownership {
            ...ownershipFields
          }
          platform {
            ...platformFields
          }
        }
        ... on MLModel {
          name
          origin
          description
          ownership {
            ...ownershipFields
          }
          globalTags {
            ...globalTagsFields
          }
          platform {
            ...platformFields
          }
        }
        ... on MLModelGroup {
          name
          origin
          description
          ownership {
            ...ownershipFields
          }
          platform {
            ...platformFields
          }
        }
      }
      groups {
        name
        count
      }
      start
      count
      total
      metadata {
        path
        totalNumEntities
      }
    }
  }
  ${PlatformFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityDataProductFragmentDoc}
  ${NonRecursiveDataFlowFieldsFragmentDoc}
`;

/**
 * __useGetBrowseResultsQuery__
 *
 * To run a query within a React component, call `useGetBrowseResultsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetBrowseResultsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetBrowseResultsQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useGetBrowseResultsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetBrowseResultsQuery,
    GetBrowseResultsQueryVariables
  >,
) {
  return Apollo.useQuery<GetBrowseResultsQuery, GetBrowseResultsQueryVariables>(
    GetBrowseResultsDocument,
    baseOptions,
  );
}
export function useGetBrowseResultsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetBrowseResultsQuery,
    GetBrowseResultsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetBrowseResultsQuery,
    GetBrowseResultsQueryVariables
  >(GetBrowseResultsDocument, baseOptions);
}
export type GetBrowseResultsQueryHookResult = ReturnType<
  typeof useGetBrowseResultsQuery
>;
export type GetBrowseResultsLazyQueryHookResult = ReturnType<
  typeof useGetBrowseResultsLazyQuery
>;
export type GetBrowseResultsQueryResult = Apollo.QueryResult<
  GetBrowseResultsQuery,
  GetBrowseResultsQueryVariables
>;
