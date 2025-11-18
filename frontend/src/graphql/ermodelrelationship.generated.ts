/* eslint-disable */
import * as Types from "../types.generated";

import {
  ErmodelrelationPropertiesFieldsFragment,
  GlobalTagsFieldsFragment,
  GlossaryTermsFragment,
  OwnershipFieldsFragment,
  InstitutionalMemoryFieldsFragment,
  ErmodelrelationEditablePropertiesFieldsFragment,
} from "./fragments.generated";
import { gql } from "@apollo/client";
import {
  ErmodelrelationPropertiesFieldsFragmentDoc,
  GlobalTagsFieldsFragmentDoc,
  GlossaryTermsFragmentDoc,
  OwnershipFieldsFragmentDoc,
  InstitutionalMemoryFieldsFragmentDoc,
  ErmodelrelationEditablePropertiesFieldsFragmentDoc,
} from "./fragments.generated";
import * as Apollo from "@apollo/client";
export type GetErModelRelationshipQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetErModelRelationshipQuery = { __typename?: "Query" } & {
  erModelRelationship?: Types.Maybe<
    { __typename?: "ERModelRelationship" } & Pick<
      Types.ErModelRelationship,
      "urn" | "type" | "id"
    > & {
        properties?: Types.Maybe<
          {
            __typename?: "ERModelRelationshipProperties";
          } & ErmodelrelationPropertiesFieldsFragment
        >;
        editableProperties?: Types.Maybe<
          {
            __typename?: "ERModelRelationshipEditableProperties";
          } & ErmodelrelationEditablePropertiesFieldsFragment
        >;
        institutionalMemory?: Types.Maybe<
          {
            __typename?: "InstitutionalMemory";
          } & InstitutionalMemoryFieldsFragment
        >;
        ownership?: Types.Maybe<
          { __typename?: "Ownership" } & OwnershipFieldsFragment
        >;
        status?: Types.Maybe<
          { __typename?: "Status" } & Pick<Types.Status, "removed">
        >;
        tags?: Types.Maybe<
          { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
        >;
        glossaryTerms?: Types.Maybe<
          { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
        >;
        outgoing?: Types.Maybe<
          { __typename?: "EntityRelationshipsResult" } & Pick<
            Types.EntityRelationshipsResult,
            "start" | "count" | "total"
          > & {
              relationships: Array<
                { __typename?: "EntityRelationship" } & Pick<
                  Types.EntityRelationship,
                  "type" | "direction"
                > & {
                    entity?: Types.Maybe<
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
                      | { __typename?: "DataPlatform" }
                      | { __typename?: "DataPlatformInstance" }
                      | { __typename?: "DataProcessInstance" }
                      | { __typename?: "DataProduct" }
                      | { __typename?: "DataTypeEntity" }
                      | { __typename?: "Dataset" }
                      | { __typename?: "Domain" }
                      | ({ __typename?: "ERModelRelationship" } & Pick<
                          Types.ErModelRelationship,
                          "urn"
                        >)
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
                    >;
                  }
              >;
            }
        >;
      }
  >;
};

export type UpdateErModelRelationshipMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  input: Types.ErModelRelationshipUpdateInput;
}>;

export type UpdateErModelRelationshipMutation = {
  __typename?: "Mutation";
} & Pick<Types.Mutation, "updateERModelRelationship">;

export type CreateErModelRelationshipMutationVariables = Types.Exact<{
  input: Types.ErModelRelationshipUpdateInput;
}>;

export type CreateErModelRelationshipMutation = { __typename?: "Mutation" } & {
  createERModelRelationship?: Types.Maybe<
    { __typename?: "ERModelRelationship" } & Pick<
      Types.ErModelRelationship,
      "urn" | "type" | "id"
    >
  >;
};

export const GetErModelRelationshipDocument = gql`
  query getERModelRelationship($urn: String!) {
    erModelRelationship(urn: $urn) {
      urn
      type
      id
      properties {
        ...ermodelrelationPropertiesFields
      }
      editableProperties {
        ...ermodelrelationEditablePropertiesFields
      }
      institutionalMemory {
        ...institutionalMemoryFields
      }
      ownership {
        ...ownershipFields
      }
      status {
        removed
      }
      tags {
        ...globalTagsFields
      }
      glossaryTerms {
        ...glossaryTerms
      }
      outgoing: relationships(
        input: {
          types: ["ermodelrelationA", "ermodelrelationB"]
          direction: OUTGOING
          start: 0
          count: 100
        }
      ) {
        start
        count
        total
        relationships {
          type
          direction
          entity {
            ... on ERModelRelationship {
              urn
            }
          }
        }
      }
    }
  }
  ${ErmodelrelationPropertiesFieldsFragmentDoc}
  ${ErmodelrelationEditablePropertiesFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
`;

/**
 * __useGetErModelRelationshipQuery__
 *
 * To run a query within a React component, call `useGetErModelRelationshipQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetErModelRelationshipQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetErModelRelationshipQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetErModelRelationshipQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetErModelRelationshipQuery,
    GetErModelRelationshipQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetErModelRelationshipQuery,
    GetErModelRelationshipQueryVariables
  >(GetErModelRelationshipDocument, baseOptions);
}
export function useGetErModelRelationshipLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetErModelRelationshipQuery,
    GetErModelRelationshipQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetErModelRelationshipQuery,
    GetErModelRelationshipQueryVariables
  >(GetErModelRelationshipDocument, baseOptions);
}
export type GetErModelRelationshipQueryHookResult = ReturnType<
  typeof useGetErModelRelationshipQuery
>;
export type GetErModelRelationshipLazyQueryHookResult = ReturnType<
  typeof useGetErModelRelationshipLazyQuery
>;
export type GetErModelRelationshipQueryResult = Apollo.QueryResult<
  GetErModelRelationshipQuery,
  GetErModelRelationshipQueryVariables
>;
export const UpdateErModelRelationshipDocument = gql`
  mutation updateERModelRelationship(
    $urn: String!
    $input: ERModelRelationshipUpdateInput!
  ) {
    updateERModelRelationship(urn: $urn, input: $input)
  }
`;
export type UpdateErModelRelationshipMutationFn = Apollo.MutationFunction<
  UpdateErModelRelationshipMutation,
  UpdateErModelRelationshipMutationVariables
>;

/**
 * __useUpdateErModelRelationshipMutation__
 *
 * To run a mutation, you first call `useUpdateErModelRelationshipMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateErModelRelationshipMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateErModelRelationshipMutation, { data, loading, error }] = useUpdateErModelRelationshipMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateErModelRelationshipMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateErModelRelationshipMutation,
    UpdateErModelRelationshipMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateErModelRelationshipMutation,
    UpdateErModelRelationshipMutationVariables
  >(UpdateErModelRelationshipDocument, baseOptions);
}
export type UpdateErModelRelationshipMutationHookResult = ReturnType<
  typeof useUpdateErModelRelationshipMutation
>;
export type UpdateErModelRelationshipMutationResult =
  Apollo.MutationResult<UpdateErModelRelationshipMutation>;
export type UpdateErModelRelationshipMutationOptions =
  Apollo.BaseMutationOptions<
    UpdateErModelRelationshipMutation,
    UpdateErModelRelationshipMutationVariables
  >;
export const CreateErModelRelationshipDocument = gql`
  mutation createERModelRelationship($input: ERModelRelationshipUpdateInput!) {
    createERModelRelationship(input: $input) {
      urn
      type
      id
    }
  }
`;
export type CreateErModelRelationshipMutationFn = Apollo.MutationFunction<
  CreateErModelRelationshipMutation,
  CreateErModelRelationshipMutationVariables
>;

/**
 * __useCreateErModelRelationshipMutation__
 *
 * To run a mutation, you first call `useCreateErModelRelationshipMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useCreateErModelRelationshipMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [createErModelRelationshipMutation, { data, loading, error }] = useCreateErModelRelationshipMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useCreateErModelRelationshipMutation(
  baseOptions?: Apollo.MutationHookOptions<
    CreateErModelRelationshipMutation,
    CreateErModelRelationshipMutationVariables
  >,
) {
  return Apollo.useMutation<
    CreateErModelRelationshipMutation,
    CreateErModelRelationshipMutationVariables
  >(CreateErModelRelationshipDocument, baseOptions);
}
export type CreateErModelRelationshipMutationHookResult = ReturnType<
  typeof useCreateErModelRelationshipMutation
>;
export type CreateErModelRelationshipMutationResult =
  Apollo.MutationResult<CreateErModelRelationshipMutation>;
export type CreateErModelRelationshipMutationOptions =
  Apollo.BaseMutationOptions<
    CreateErModelRelationshipMutation,
    CreateErModelRelationshipMutationVariables
  >;
