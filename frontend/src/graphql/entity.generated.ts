/* eslint-disable */
import * as Types from "../types.generated";

import {
  SearchResultFields_AccessTokenMetadata_Fragment,
  SearchResultFields_Application_Fragment,
  SearchResultFields_Assertion_Fragment,
  SearchResultFields_BusinessAttribute_Fragment,
  SearchResultFields_Chart_Fragment,
  SearchResultFields_Container_Fragment,
  SearchResultFields_CorpGroup_Fragment,
  SearchResultFields_CorpUser_Fragment,
  SearchResultFields_Dashboard_Fragment,
  SearchResultFields_DataContract_Fragment,
  SearchResultFields_DataFlow_Fragment,
  SearchResultFields_DataHubConnection_Fragment,
  SearchResultFields_DataHubFile_Fragment,
  SearchResultFields_DataHubPageModule_Fragment,
  SearchResultFields_DataHubPageTemplate_Fragment,
  SearchResultFields_DataHubPolicy_Fragment,
  SearchResultFields_DataHubRole_Fragment,
  SearchResultFields_DataHubView_Fragment,
  SearchResultFields_DataJob_Fragment,
  SearchResultFields_DataPlatform_Fragment,
  SearchResultFields_DataPlatformInstance_Fragment,
  SearchResultFields_DataProcessInstance_Fragment,
  SearchResultFields_DataProduct_Fragment,
  SearchResultFields_DataTypeEntity_Fragment,
  SearchResultFields_Dataset_Fragment,
  SearchResultFields_Domain_Fragment,
  SearchResultFields_ErModelRelationship_Fragment,
  SearchResultFields_EntityTypeEntity_Fragment,
  SearchResultFields_ExecutionRequest_Fragment,
  SearchResultFields_Form_Fragment,
  SearchResultFields_GlossaryNode_Fragment,
  SearchResultFields_GlossaryTerm_Fragment,
  SearchResultFields_Incident_Fragment,
  SearchResultFields_MlFeature_Fragment,
  SearchResultFields_MlFeatureTable_Fragment,
  SearchResultFields_MlModel_Fragment,
  SearchResultFields_MlModelGroup_Fragment,
  SearchResultFields_MlPrimaryKey_Fragment,
  SearchResultFields_Notebook_Fragment,
  SearchResultFields_OwnershipTypeEntity_Fragment,
  SearchResultFields_Post_Fragment,
  SearchResultFields_QueryEntity_Fragment,
  SearchResultFields_Restricted_Fragment,
  SearchResultFields_Role_Fragment,
  SearchResultFields_SchemaFieldEntity_Fragment,
  SearchResultFields_StructuredPropertyEntity_Fragment,
  SearchResultFields_Tag_Fragment,
  SearchResultFields_Test_Fragment,
  SearchResultFields_VersionSet_Fragment,
  SearchResultFields_VersionedDataset_Fragment,
  SearchResultFieldsNoLineage_AccessTokenMetadata_Fragment,
  SearchResultFieldsNoLineage_Application_Fragment,
  SearchResultFieldsNoLineage_Assertion_Fragment,
  SearchResultFieldsNoLineage_BusinessAttribute_Fragment,
  SearchResultFieldsNoLineage_Chart_Fragment,
  SearchResultFieldsNoLineage_Container_Fragment,
  SearchResultFieldsNoLineage_CorpGroup_Fragment,
  SearchResultFieldsNoLineage_CorpUser_Fragment,
  SearchResultFieldsNoLineage_Dashboard_Fragment,
  SearchResultFieldsNoLineage_DataContract_Fragment,
  SearchResultFieldsNoLineage_DataFlow_Fragment,
  SearchResultFieldsNoLineage_DataHubConnection_Fragment,
  SearchResultFieldsNoLineage_DataHubFile_Fragment,
  SearchResultFieldsNoLineage_DataHubPageModule_Fragment,
  SearchResultFieldsNoLineage_DataHubPageTemplate_Fragment,
  SearchResultFieldsNoLineage_DataHubPolicy_Fragment,
  SearchResultFieldsNoLineage_DataHubRole_Fragment,
  SearchResultFieldsNoLineage_DataHubView_Fragment,
  SearchResultFieldsNoLineage_DataJob_Fragment,
  SearchResultFieldsNoLineage_DataPlatform_Fragment,
  SearchResultFieldsNoLineage_DataPlatformInstance_Fragment,
  SearchResultFieldsNoLineage_DataProcessInstance_Fragment,
  SearchResultFieldsNoLineage_DataProduct_Fragment,
  SearchResultFieldsNoLineage_DataTypeEntity_Fragment,
  SearchResultFieldsNoLineage_Dataset_Fragment,
  SearchResultFieldsNoLineage_Domain_Fragment,
  SearchResultFieldsNoLineage_ErModelRelationship_Fragment,
  SearchResultFieldsNoLineage_EntityTypeEntity_Fragment,
  SearchResultFieldsNoLineage_ExecutionRequest_Fragment,
  SearchResultFieldsNoLineage_Form_Fragment,
  SearchResultFieldsNoLineage_GlossaryNode_Fragment,
  SearchResultFieldsNoLineage_GlossaryTerm_Fragment,
  SearchResultFieldsNoLineage_Incident_Fragment,
  SearchResultFieldsNoLineage_MlFeature_Fragment,
  SearchResultFieldsNoLineage_MlFeatureTable_Fragment,
  SearchResultFieldsNoLineage_MlModel_Fragment,
  SearchResultFieldsNoLineage_MlModelGroup_Fragment,
  SearchResultFieldsNoLineage_MlPrimaryKey_Fragment,
  SearchResultFieldsNoLineage_Notebook_Fragment,
  SearchResultFieldsNoLineage_OwnershipTypeEntity_Fragment,
  SearchResultFieldsNoLineage_Post_Fragment,
  SearchResultFieldsNoLineage_QueryEntity_Fragment,
  SearchResultFieldsNoLineage_Restricted_Fragment,
  SearchResultFieldsNoLineage_Role_Fragment,
  SearchResultFieldsNoLineage_SchemaFieldEntity_Fragment,
  SearchResultFieldsNoLineage_StructuredPropertyEntity_Fragment,
  SearchResultFieldsNoLineage_Tag_Fragment,
  SearchResultFieldsNoLineage_Test_Fragment,
  SearchResultFieldsNoLineage_VersionSet_Fragment,
  SearchResultFieldsNoLineage_VersionedDataset_Fragment,
} from "./search.generated";
import { gql } from "@apollo/client";
import {
  SearchResultFieldsFragmentDoc,
  SearchResultFieldsNoLineageFragmentDoc,
} from "./search.generated";
import * as Apollo from "@apollo/client";
export type GetEntitiesQueryVariables = Types.Exact<{
  urns: Array<Types.Scalars["String"]> | Types.Scalars["String"];
  checkForExistence?: Types.Maybe<Types.Scalars["Boolean"]>;
}>;

export type GetEntitiesQuery = { __typename?: "Query" } & {
  entities?: Types.Maybe<
    Array<
      Types.Maybe<
        | ({ __typename?: "AccessTokenMetadata" } & Pick<
            Types.AccessTokenMetadata,
            "urn" | "type"
          > &
            SearchResultFields_AccessTokenMetadata_Fragment)
        | ({ __typename?: "Application" } & Pick<
            Types.Application,
            "urn" | "type"
          > &
            SearchResultFields_Application_Fragment)
        | ({ __typename?: "Assertion" } & Pick<
            Types.Assertion,
            "urn" | "type"
          > &
            SearchResultFields_Assertion_Fragment)
        | ({ __typename?: "BusinessAttribute" } & Pick<
            Types.BusinessAttribute,
            "urn" | "type"
          > &
            SearchResultFields_BusinessAttribute_Fragment)
        | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type"> &
            SearchResultFields_Chart_Fragment)
        | ({ __typename?: "Container" } & Pick<
            Types.Container,
            "urn" | "type"
          > &
            SearchResultFields_Container_Fragment)
        | ({ __typename?: "CorpGroup" } & Pick<
            Types.CorpGroup,
            "urn" | "type"
          > &
            SearchResultFields_CorpGroup_Fragment)
        | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type"> &
            SearchResultFields_CorpUser_Fragment)
        | ({ __typename?: "Dashboard" } & Pick<
            Types.Dashboard,
            "urn" | "type"
          > &
            SearchResultFields_Dashboard_Fragment)
        | ({ __typename?: "DataContract" } & Pick<
            Types.DataContract,
            "urn" | "type"
          > &
            SearchResultFields_DataContract_Fragment)
        | ({ __typename?: "DataFlow" } & Pick<Types.DataFlow, "urn" | "type"> &
            SearchResultFields_DataFlow_Fragment)
        | ({ __typename?: "DataHubConnection" } & Pick<
            Types.DataHubConnection,
            "urn" | "type"
          > &
            SearchResultFields_DataHubConnection_Fragment)
        | ({ __typename?: "DataHubFile" } & Pick<
            Types.DataHubFile,
            "urn" | "type"
          > &
            SearchResultFields_DataHubFile_Fragment)
        | ({ __typename?: "DataHubPageModule" } & Pick<
            Types.DataHubPageModule,
            "urn" | "type"
          > &
            SearchResultFields_DataHubPageModule_Fragment)
        | ({ __typename?: "DataHubPageTemplate" } & Pick<
            Types.DataHubPageTemplate,
            "urn" | "type"
          > &
            SearchResultFields_DataHubPageTemplate_Fragment)
        | ({ __typename?: "DataHubPolicy" } & Pick<
            Types.DataHubPolicy,
            "urn" | "type"
          > &
            SearchResultFields_DataHubPolicy_Fragment)
        | ({ __typename?: "DataHubRole" } & Pick<
            Types.DataHubRole,
            "urn" | "type"
          > &
            SearchResultFields_DataHubRole_Fragment)
        | ({ __typename?: "DataHubView" } & Pick<
            Types.DataHubView,
            "urn" | "type"
          > &
            SearchResultFields_DataHubView_Fragment)
        | ({ __typename?: "DataJob" } & Pick<Types.DataJob, "urn" | "type"> &
            SearchResultFields_DataJob_Fragment)
        | ({ __typename?: "DataPlatform" } & Pick<
            Types.DataPlatform,
            "urn" | "type"
          > &
            SearchResultFields_DataPlatform_Fragment)
        | ({ __typename?: "DataPlatformInstance" } & Pick<
            Types.DataPlatformInstance,
            "urn" | "type"
          > &
            SearchResultFields_DataPlatformInstance_Fragment)
        | ({ __typename?: "DataProcessInstance" } & Pick<
            Types.DataProcessInstance,
            "urn" | "type"
          > &
            SearchResultFields_DataProcessInstance_Fragment)
        | ({ __typename?: "DataProduct" } & Pick<
            Types.DataProduct,
            "urn" | "type"
          > &
            SearchResultFields_DataProduct_Fragment)
        | ({ __typename?: "DataTypeEntity" } & Pick<
            Types.DataTypeEntity,
            "urn" | "type"
          > &
            SearchResultFields_DataTypeEntity_Fragment)
        | ({ __typename?: "Dataset" } & Pick<Types.Dataset, "urn" | "type"> &
            SearchResultFields_Dataset_Fragment)
        | ({ __typename?: "Domain" } & Pick<Types.Domain, "urn" | "type"> &
            SearchResultFields_Domain_Fragment)
        | ({ __typename?: "ERModelRelationship" } & Pick<
            Types.ErModelRelationship,
            "urn" | "type"
          > &
            SearchResultFields_ErModelRelationship_Fragment)
        | ({ __typename?: "EntityTypeEntity" } & Pick<
            Types.EntityTypeEntity,
            "urn" | "type"
          > &
            SearchResultFields_EntityTypeEntity_Fragment)
        | ({ __typename?: "ExecutionRequest" } & Pick<
            Types.ExecutionRequest,
            "urn" | "type"
          > &
            SearchResultFields_ExecutionRequest_Fragment)
        | ({ __typename?: "Form" } & Pick<Types.Form, "urn" | "type"> &
            SearchResultFields_Form_Fragment)
        | ({ __typename?: "GlossaryNode" } & Pick<
            Types.GlossaryNode,
            "urn" | "type"
          > &
            SearchResultFields_GlossaryNode_Fragment)
        | ({ __typename?: "GlossaryTerm" } & Pick<
            Types.GlossaryTerm,
            "urn" | "type"
          > &
            SearchResultFields_GlossaryTerm_Fragment)
        | ({ __typename?: "Incident" } & Pick<Types.Incident, "urn" | "type"> &
            SearchResultFields_Incident_Fragment)
        | ({ __typename?: "MLFeature" } & Pick<
            Types.MlFeature,
            "urn" | "type"
          > &
            SearchResultFields_MlFeature_Fragment)
        | ({ __typename?: "MLFeatureTable" } & Pick<
            Types.MlFeatureTable,
            "urn" | "type"
          > &
            SearchResultFields_MlFeatureTable_Fragment)
        | ({ __typename?: "MLModel" } & Pick<Types.MlModel, "urn" | "type"> &
            SearchResultFields_MlModel_Fragment)
        | ({ __typename?: "MLModelGroup" } & Pick<
            Types.MlModelGroup,
            "urn" | "type"
          > &
            SearchResultFields_MlModelGroup_Fragment)
        | ({ __typename?: "MLPrimaryKey" } & Pick<
            Types.MlPrimaryKey,
            "urn" | "type"
          > &
            SearchResultFields_MlPrimaryKey_Fragment)
        | ({ __typename?: "Notebook" } & Pick<Types.Notebook, "urn" | "type"> &
            SearchResultFields_Notebook_Fragment)
        | ({ __typename?: "OwnershipTypeEntity" } & Pick<
            Types.OwnershipTypeEntity,
            "urn" | "type"
          > &
            SearchResultFields_OwnershipTypeEntity_Fragment)
        | ({ __typename?: "Post" } & Pick<Types.Post, "urn" | "type"> &
            SearchResultFields_Post_Fragment)
        | ({ __typename?: "QueryEntity" } & Pick<
            Types.QueryEntity,
            "urn" | "type"
          > &
            SearchResultFields_QueryEntity_Fragment)
        | ({ __typename?: "Restricted" } & Pick<
            Types.Restricted,
            "urn" | "type"
          > &
            SearchResultFields_Restricted_Fragment)
        | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type"> &
            SearchResultFields_Role_Fragment)
        | ({ __typename?: "SchemaFieldEntity" } & Pick<
            Types.SchemaFieldEntity,
            "urn" | "type"
          > &
            SearchResultFields_SchemaFieldEntity_Fragment)
        | ({ __typename?: "StructuredPropertyEntity" } & Pick<
            Types.StructuredPropertyEntity,
            "urn" | "type"
          > &
            SearchResultFields_StructuredPropertyEntity_Fragment)
        | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn" | "type"> &
            SearchResultFields_Tag_Fragment)
        | ({ __typename?: "Test" } & Pick<Types.Test, "urn" | "type"> &
            SearchResultFields_Test_Fragment)
        | ({ __typename?: "VersionSet" } & Pick<
            Types.VersionSet,
            "urn" | "type"
          > &
            SearchResultFields_VersionSet_Fragment)
        | ({ __typename?: "VersionedDataset" } & Pick<
            Types.VersionedDataset,
            "urn" | "type"
          > &
            SearchResultFields_VersionedDataset_Fragment)
      >
    >
  >;
};

export const GetEntitiesDocument = gql`
  query getEntities($urns: [String!]!, $checkForExistence: Boolean) {
    entities(urns: $urns, checkForExistence: $checkForExistence) {
      urn
      type
      ...searchResultFields
    }
  }
  ${SearchResultFieldsFragmentDoc}
`;

/**
 * __useGetEntitiesQuery__
 *
 * To run a query within a React component, call `useGetEntitiesQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetEntitiesQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetEntitiesQuery({
 *   variables: {
 *      urns: // value for 'urns'
 *      checkForExistence: // value for 'checkForExistence'
 *   },
 * });
 */
export function useGetEntitiesQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetEntitiesQuery,
    GetEntitiesQueryVariables
  >,
) {
  return Apollo.useQuery<GetEntitiesQuery, GetEntitiesQueryVariables>(
    GetEntitiesDocument,
    baseOptions,
  );
}
export function useGetEntitiesLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetEntitiesQuery,
    GetEntitiesQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetEntitiesQuery, GetEntitiesQueryVariables>(
    GetEntitiesDocument,
    baseOptions,
  );
}
export type GetEntitiesQueryHookResult = ReturnType<typeof useGetEntitiesQuery>;
export type GetEntitiesLazyQueryHookResult = ReturnType<
  typeof useGetEntitiesLazyQuery
>;
export type GetEntitiesQueryResult = Apollo.QueryResult<
  GetEntitiesQuery,
  GetEntitiesQueryVariables
>;
