/* eslint-disable */
import * as Types from "../types.generated";

import {
  DataJobFieldsFragment,
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
} from "./fragments.generated";
import { RunResultsFragment } from "./dataProcess.generated";
import { gql } from "@apollo/client";
import {
  DataJobFieldsFragmentDoc,
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
} from "./fragments.generated";
import { RunResultsFragmentDoc } from "./dataProcess.generated";
import * as Apollo from "@apollo/client";
export type GetDataJobQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetDataJobQuery = { __typename?: "Query" } & {
  dataJob?: Types.Maybe<
    { __typename?: "DataJob" } & Pick<Types.DataJob, "urn" | "type"> & {
        privileges?: Types.Maybe<
          { __typename?: "EntityPrivileges" } & EntityPrivilegesFragment
        >;
        runs?: Types.Maybe<
          { __typename?: "DataProcessInstanceResult" } & Pick<
            Types.DataProcessInstanceResult,
            "count" | "start" | "total"
          >
        >;
        autoRenderAspects?: Types.Maybe<
          Array<{ __typename?: "RawAspect" } & AutoRenderAspectFieldsFragment>
        >;
        structuredProperties?: Types.Maybe<
          { __typename?: "StructuredProperties" } & {
            properties?: Types.Maybe<
              Array<
                {
                  __typename?: "StructuredPropertiesEntry";
                } & StructuredPropertiesFieldsFragment
              >
            >;
          }
        >;
        forms?: Types.Maybe<{ __typename?: "Forms" } & FormsFieldsFragment>;
        browsePathV2?: Types.Maybe<
          { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
        >;
        platform?: Types.Maybe<
          { __typename?: "DataPlatform" } & PlatformFieldsFragment
        >;
      } & DataJobFieldsFragment &
      Notes_DataJob_Fragment
  >;
};

export type UpdateDataJobMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  input: Types.DataJobUpdateInput;
}>;

export type UpdateDataJobMutation = { __typename?: "Mutation" } & {
  updateDataJob?: Types.Maybe<
    { __typename?: "DataJob" } & Pick<Types.DataJob, "urn">
  >;
};

export type GetDataJobRunsQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  start: Types.Scalars["Int"];
  count: Types.Scalars["Int"];
}>;

export type GetDataJobRunsQuery = { __typename?: "Query" } & {
  dataJob?: Types.Maybe<
    { __typename?: "DataJob" } & {
      runs?: Types.Maybe<
        { __typename?: "DataProcessInstanceResult" } & RunResultsFragment
      >;
    }
  >;
};

export const GetDataJobDocument = gql`
  query getDataJob($urn: String!) {
    dataJob(urn: $urn) {
      urn
      type
      ...dataJobFields
      privileges {
        ...entityPrivileges
      }
      runs(start: 0, count: 20) {
        count
        start
        total
      }
      autoRenderAspects: aspects(input: { autoRenderOnly: true }) {
        ...autoRenderAspectFields
      }
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
      forms {
        ...formsFields
      }
      browsePathV2 {
        ...browsePathV2Fields
      }
      ...notes
      platform {
        ...platformFields
      }
    }
  }
  ${DataJobFieldsFragmentDoc}
  ${EntityPrivilegesFragmentDoc}
  ${AutoRenderAspectFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${FormsFieldsFragmentDoc}
  ${BrowsePathV2FieldsFragmentDoc}
  ${NotesFragmentDoc}
  ${PlatformFieldsFragmentDoc}
`;

/**
 * __useGetDataJobQuery__
 *
 * To run a query within a React component, call `useGetDataJobQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDataJobQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDataJobQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetDataJobQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDataJobQuery,
    GetDataJobQueryVariables
  >,
) {
  return Apollo.useQuery<GetDataJobQuery, GetDataJobQueryVariables>(
    GetDataJobDocument,
    baseOptions,
  );
}
export function useGetDataJobLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDataJobQuery,
    GetDataJobQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetDataJobQuery, GetDataJobQueryVariables>(
    GetDataJobDocument,
    baseOptions,
  );
}
export type GetDataJobQueryHookResult = ReturnType<typeof useGetDataJobQuery>;
export type GetDataJobLazyQueryHookResult = ReturnType<
  typeof useGetDataJobLazyQuery
>;
export type GetDataJobQueryResult = Apollo.QueryResult<
  GetDataJobQuery,
  GetDataJobQueryVariables
>;
export const UpdateDataJobDocument = gql`
  mutation updateDataJob($urn: String!, $input: DataJobUpdateInput!) {
    updateDataJob(urn: $urn, input: $input) {
      urn
    }
  }
`;
export type UpdateDataJobMutationFn = Apollo.MutationFunction<
  UpdateDataJobMutation,
  UpdateDataJobMutationVariables
>;

/**
 * __useUpdateDataJobMutation__
 *
 * To run a mutation, you first call `useUpdateDataJobMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateDataJobMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateDataJobMutation, { data, loading, error }] = useUpdateDataJobMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateDataJobMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateDataJobMutation,
    UpdateDataJobMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateDataJobMutation,
    UpdateDataJobMutationVariables
  >(UpdateDataJobDocument, baseOptions);
}
export type UpdateDataJobMutationHookResult = ReturnType<
  typeof useUpdateDataJobMutation
>;
export type UpdateDataJobMutationResult =
  Apollo.MutationResult<UpdateDataJobMutation>;
export type UpdateDataJobMutationOptions = Apollo.BaseMutationOptions<
  UpdateDataJobMutation,
  UpdateDataJobMutationVariables
>;
export const GetDataJobRunsDocument = gql`
  query getDataJobRuns($urn: String!, $start: Int!, $count: Int!) {
    dataJob(urn: $urn) {
      runs(start: $start, count: $count) {
        ...runResults
      }
    }
  }
  ${RunResultsFragmentDoc}
`;

/**
 * __useGetDataJobRunsQuery__
 *
 * To run a query within a React component, call `useGetDataJobRunsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDataJobRunsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDataJobRunsQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      start: // value for 'start'
 *      count: // value for 'count'
 *   },
 * });
 */
export function useGetDataJobRunsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDataJobRunsQuery,
    GetDataJobRunsQueryVariables
  >,
) {
  return Apollo.useQuery<GetDataJobRunsQuery, GetDataJobRunsQueryVariables>(
    GetDataJobRunsDocument,
    baseOptions,
  );
}
export function useGetDataJobRunsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDataJobRunsQuery,
    GetDataJobRunsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetDataJobRunsQuery, GetDataJobRunsQueryVariables>(
    GetDataJobRunsDocument,
    baseOptions,
  );
}
export type GetDataJobRunsQueryHookResult = ReturnType<
  typeof useGetDataJobRunsQuery
>;
export type GetDataJobRunsLazyQueryHookResult = ReturnType<
  typeof useGetDataJobRunsLazyQuery
>;
export type GetDataJobRunsQueryResult = Apollo.QueryResult<
  GetDataJobRunsQuery,
  GetDataJobRunsQueryVariables
>;
