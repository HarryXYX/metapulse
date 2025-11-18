/* eslint-disable */
import * as Types from "../types.generated";

import {
  DashboardFieldsFragment,
  StructuredPropertiesFieldsFragment,
  EntityPrivilegesFragment,
  AutoRenderAspectFieldsFragment,
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
  EntityDomainFragment,
  InstitutionalMemoryFieldsFragment,
  GlobalTagsFieldsFragment,
  GlossaryTermsFragment,
} from "./fragments.generated";
import { FullRelationshipResultsFragment } from "./relationships.generated";
import { gql } from "@apollo/client";
import {
  DashboardFieldsFragmentDoc,
  StructuredPropertiesFieldsFragmentDoc,
  EntityPrivilegesFragmentDoc,
  AutoRenderAspectFieldsFragmentDoc,
  FormsFieldsFragmentDoc,
  OwnershipFieldsFragmentDoc,
  NotesFragmentDoc,
  EntityDomainFragmentDoc,
  InstitutionalMemoryFieldsFragmentDoc,
  GlobalTagsFieldsFragmentDoc,
  GlossaryTermsFragmentDoc,
} from "./fragments.generated";
import { FullRelationshipResultsFragmentDoc } from "./relationships.generated";
import * as Apollo from "@apollo/client";
export type GetDashboardQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetDashboardQuery = { __typename?: "Query" } & {
  dashboard?: Types.Maybe<
    { __typename?: "Dashboard" } & Pick<Types.Dashboard, "urn" | "type"> & {
        privileges?: Types.Maybe<
          { __typename?: "EntityPrivileges" } & EntityPrivilegesFragment
        >;
        charts?: Types.Maybe<
          {
            __typename?: "EntityRelationshipsResult";
          } & FullRelationshipResultsFragment
        >;
        datasets?: Types.Maybe<
          {
            __typename?: "EntityRelationshipsResult";
          } & FullRelationshipResultsFragment
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
        activeIncidents?: Types.Maybe<
          { __typename?: "EntityIncidentsResult" } & Pick<
            Types.EntityIncidentsResult,
            "total"
          >
        >;
        forms?: Types.Maybe<{ __typename?: "Forms" } & FormsFieldsFragment>;
      } & DashboardFieldsFragment &
      Notes_Dashboard_Fragment
  >;
};

export type UpdateDashboardMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  input: Types.DashboardUpdateInput;
}>;

export type UpdateDashboardMutation = { __typename?: "Mutation" } & {
  updateDashboard?: Types.Maybe<
    { __typename?: "Dashboard" } & Pick<Types.Dashboard, "urn">
  >;
};

export const GetDashboardDocument = gql`
  query getDashboard($urn: String!) {
    dashboard(urn: $urn) {
      urn
      type
      ...dashboardFields
      privileges {
        ...entityPrivileges
      }
      charts: relationships(
        input: {
          types: ["Contains"]
          direction: OUTGOING
          start: 0
          count: 100
        }
      ) {
        ...fullRelationshipResults
      }
      datasets: relationships(
        input: {
          types: ["Consumes"]
          direction: OUTGOING
          start: 0
          count: 100
        }
      ) {
        ...fullRelationshipResults
      }
      autoRenderAspects: aspects(input: { autoRenderOnly: true }) {
        ...autoRenderAspectFields
      }
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
      activeIncidents: incidents(start: 0, count: 1, state: ACTIVE) {
        total
      }
      forms {
        ...formsFields
      }
      ...notes
    }
  }
  ${DashboardFieldsFragmentDoc}
  ${EntityPrivilegesFragmentDoc}
  ${FullRelationshipResultsFragmentDoc}
  ${AutoRenderAspectFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${FormsFieldsFragmentDoc}
  ${NotesFragmentDoc}
`;

/**
 * __useGetDashboardQuery__
 *
 * To run a query within a React component, call `useGetDashboardQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDashboardQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDashboardQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetDashboardQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDashboardQuery,
    GetDashboardQueryVariables
  >,
) {
  return Apollo.useQuery<GetDashboardQuery, GetDashboardQueryVariables>(
    GetDashboardDocument,
    baseOptions,
  );
}
export function useGetDashboardLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDashboardQuery,
    GetDashboardQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetDashboardQuery, GetDashboardQueryVariables>(
    GetDashboardDocument,
    baseOptions,
  );
}
export type GetDashboardQueryHookResult = ReturnType<
  typeof useGetDashboardQuery
>;
export type GetDashboardLazyQueryHookResult = ReturnType<
  typeof useGetDashboardLazyQuery
>;
export type GetDashboardQueryResult = Apollo.QueryResult<
  GetDashboardQuery,
  GetDashboardQueryVariables
>;
export const UpdateDashboardDocument = gql`
  mutation updateDashboard($urn: String!, $input: DashboardUpdateInput!) {
    updateDashboard(urn: $urn, input: $input) {
      urn
    }
  }
`;
export type UpdateDashboardMutationFn = Apollo.MutationFunction<
  UpdateDashboardMutation,
  UpdateDashboardMutationVariables
>;

/**
 * __useUpdateDashboardMutation__
 *
 * To run a mutation, you first call `useUpdateDashboardMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateDashboardMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateDashboardMutation, { data, loading, error }] = useUpdateDashboardMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateDashboardMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateDashboardMutation,
    UpdateDashboardMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateDashboardMutation,
    UpdateDashboardMutationVariables
  >(UpdateDashboardDocument, baseOptions);
}
export type UpdateDashboardMutationHookResult = ReturnType<
  typeof useUpdateDashboardMutation
>;
export type UpdateDashboardMutationResult =
  Apollo.MutationResult<UpdateDashboardMutation>;
export type UpdateDashboardMutationOptions = Apollo.BaseMutationOptions<
  UpdateDashboardMutation,
  UpdateDashboardMutationVariables
>;
