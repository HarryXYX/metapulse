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
export type GetQuickFiltersQueryVariables = Types.Exact<{
  input: Types.GetQuickFiltersInput;
}>;

export type GetQuickFiltersQuery = { __typename?: "Query" } & {
  getQuickFilters?: Types.Maybe<
    { __typename?: "GetQuickFiltersResult" } & {
      quickFilters: Array<
        Types.Maybe<
          { __typename?: "QuickFilter" } & Pick<
            Types.QuickFilter,
            "field" | "value"
          > & {
              entity?: Types.Maybe<
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
                | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type">)
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
                  > &
                    PlatformFieldsFragment)
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
                  >)
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
              >;
            }
        >
      >;
    }
  >;
};

export const GetQuickFiltersDocument = gql`
  query getQuickFilters($input: GetQuickFiltersInput!) {
    getQuickFilters(input: $input) {
      quickFilters {
        field
        value
        entity {
          urn
          type
          ... on DataPlatform {
            ...platformFields
          }
        }
      }
    }
  }
  ${PlatformFieldsFragmentDoc}
`;

/**
 * __useGetQuickFiltersQuery__
 *
 * To run a query within a React component, call `useGetQuickFiltersQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetQuickFiltersQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetQuickFiltersQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useGetQuickFiltersQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetQuickFiltersQuery,
    GetQuickFiltersQueryVariables
  >,
) {
  return Apollo.useQuery<GetQuickFiltersQuery, GetQuickFiltersQueryVariables>(
    GetQuickFiltersDocument,
    baseOptions,
  );
}
export function useGetQuickFiltersLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetQuickFiltersQuery,
    GetQuickFiltersQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetQuickFiltersQuery,
    GetQuickFiltersQueryVariables
  >(GetQuickFiltersDocument, baseOptions);
}
export type GetQuickFiltersQueryHookResult = ReturnType<
  typeof useGetQuickFiltersQuery
>;
export type GetQuickFiltersLazyQueryHookResult = ReturnType<
  typeof useGetQuickFiltersLazyQuery
>;
export type GetQuickFiltersQueryResult = Apollo.QueryResult<
  GetQuickFiltersQuery,
  GetQuickFiltersQueryVariables
>;
