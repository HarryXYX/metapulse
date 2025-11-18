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
export type GetDataPlatformQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetDataPlatformQuery = { __typename?: "Query" } & {
  dataPlatform?: Types.Maybe<
    { __typename?: "DataPlatform" } & Pick<Types.DataPlatform, "urn" | "type"> &
      PlatformFieldsFragment
  >;
};

export type GetDataPlatformsQueryVariables = Types.Exact<{
  urns: Array<Types.Scalars["String"]> | Types.Scalars["String"];
}>;

export type GetDataPlatformsQuery = { __typename?: "Query" } & {
  entities?: Types.Maybe<
    Array<
      Types.Maybe<
        | { __typename?: "AccessTokenMetadata" }
        | { __typename?: "Application" }
        | { __typename?: "Assertion" }
        | { __typename?: "BusinessAttribute" }
        | { __typename?: "Chart" }
        | { __typename?: "Container" }
        | { __typename?: "CorpGroup" }
        | { __typename?: "CorpUser" }
        | { __typename?: "Dashboard" }
        | { __typename?: "DataContract" }
        | { __typename?: "DataFlow" }
        | { __typename?: "DataHubConnection" }
        | { __typename?: "DataHubFile" }
        | { __typename?: "DataHubPageModule" }
        | { __typename?: "DataHubPageTemplate" }
        | { __typename?: "DataHubPolicy" }
        | { __typename?: "DataHubRole" }
        | { __typename?: "DataHubView" }
        | { __typename?: "DataJob" }
        | ({ __typename?: "DataPlatform" } & PlatformFieldsFragment)
        | { __typename?: "DataPlatformInstance" }
        | { __typename?: "DataProcessInstance" }
        | { __typename?: "DataProduct" }
        | { __typename?: "DataTypeEntity" }
        | { __typename?: "Dataset" }
        | { __typename?: "Domain" }
        | { __typename?: "ERModelRelationship" }
        | { __typename?: "EntityTypeEntity" }
        | { __typename?: "ExecutionRequest" }
        | { __typename?: "Form" }
        | { __typename?: "GlossaryNode" }
        | { __typename?: "GlossaryTerm" }
        | { __typename?: "Incident" }
        | { __typename?: "MLFeature" }
        | { __typename?: "MLFeatureTable" }
        | { __typename?: "MLModel" }
        | { __typename?: "MLModelGroup" }
        | { __typename?: "MLPrimaryKey" }
        | { __typename?: "Notebook" }
        | { __typename?: "OwnershipTypeEntity" }
        | { __typename?: "Post" }
        | { __typename?: "QueryEntity" }
        | { __typename?: "Restricted" }
        | { __typename?: "Role" }
        | { __typename?: "SchemaFieldEntity" }
        | { __typename?: "StructuredPropertyEntity" }
        | { __typename?: "Tag" }
        | { __typename?: "Test" }
        | { __typename?: "VersionSet" }
        | { __typename?: "VersionedDataset" }
      >
    >
  >;
};

export const GetDataPlatformDocument = gql`
  query getDataPlatform($urn: String!) {
    dataPlatform(urn: $urn) {
      urn
      type
      ...platformFields
    }
  }
  ${PlatformFieldsFragmentDoc}
`;

/**
 * __useGetDataPlatformQuery__
 *
 * To run a query within a React component, call `useGetDataPlatformQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDataPlatformQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDataPlatformQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetDataPlatformQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDataPlatformQuery,
    GetDataPlatformQueryVariables
  >,
) {
  return Apollo.useQuery<GetDataPlatformQuery, GetDataPlatformQueryVariables>(
    GetDataPlatformDocument,
    baseOptions,
  );
}
export function useGetDataPlatformLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDataPlatformQuery,
    GetDataPlatformQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetDataPlatformQuery,
    GetDataPlatformQueryVariables
  >(GetDataPlatformDocument, baseOptions);
}
export type GetDataPlatformQueryHookResult = ReturnType<
  typeof useGetDataPlatformQuery
>;
export type GetDataPlatformLazyQueryHookResult = ReturnType<
  typeof useGetDataPlatformLazyQuery
>;
export type GetDataPlatformQueryResult = Apollo.QueryResult<
  GetDataPlatformQuery,
  GetDataPlatformQueryVariables
>;
export const GetDataPlatformsDocument = gql`
  query getDataPlatforms($urns: [String!]!) {
    entities(urns: $urns) {
      ... on DataPlatform {
        ...platformFields
      }
    }
  }
  ${PlatformFieldsFragmentDoc}
`;

/**
 * __useGetDataPlatformsQuery__
 *
 * To run a query within a React component, call `useGetDataPlatformsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDataPlatformsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDataPlatformsQuery({
 *   variables: {
 *      urns: // value for 'urns'
 *   },
 * });
 */
export function useGetDataPlatformsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDataPlatformsQuery,
    GetDataPlatformsQueryVariables
  >,
) {
  return Apollo.useQuery<GetDataPlatformsQuery, GetDataPlatformsQueryVariables>(
    GetDataPlatformsDocument,
    baseOptions,
  );
}
export function useGetDataPlatformsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDataPlatformsQuery,
    GetDataPlatformsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetDataPlatformsQuery,
    GetDataPlatformsQueryVariables
  >(GetDataPlatformsDocument, baseOptions);
}
export type GetDataPlatformsQueryHookResult = ReturnType<
  typeof useGetDataPlatformsQuery
>;
export type GetDataPlatformsLazyQueryHookResult = ReturnType<
  typeof useGetDataPlatformsLazyQuery
>;
export type GetDataPlatformsQueryResult = Apollo.QueryResult<
  GetDataPlatformsQuery,
  GetDataPlatformsQueryVariables
>;
