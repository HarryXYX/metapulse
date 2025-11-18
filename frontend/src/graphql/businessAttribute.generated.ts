/* eslint-disable */
import * as Types from "../types.generated";

import {
  OwnershipFieldsFragment,
  InstitutionalMemoryFieldsFragment,
  AutoRenderAspectFieldsFragment,
} from "./fragments.generated";
import { gql } from "@apollo/client";
import {
  OwnershipFieldsFragmentDoc,
  InstitutionalMemoryFieldsFragmentDoc,
  AutoRenderAspectFieldsFragmentDoc,
} from "./fragments.generated";
import * as Apollo from "@apollo/client";
export type GetBusinessAttributeQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetBusinessAttributeQuery = { __typename?: "Query" } & {
  businessAttribute?: Types.Maybe<
    { __typename?: "BusinessAttribute" } & BusinessAttributeFieldsFragment
  >;
};

export type ListBusinessAttributesQueryVariables = Types.Exact<{
  start: Types.Scalars["Int"];
  count: Types.Scalars["Int"];
  query?: Types.Maybe<Types.Scalars["String"]>;
}>;

export type ListBusinessAttributesQuery = { __typename?: "Query" } & {
  listBusinessAttributes?: Types.Maybe<
    { __typename?: "ListBusinessAttributesResult" } & Pick<
      Types.ListBusinessAttributesResult,
      "start" | "count" | "total"
    > & {
        businessAttributes: Array<
          { __typename?: "BusinessAttribute" } & BusinessAttributeFieldsFragment
        >;
      }
  >;
};

export type BusinessAttributeFieldsFragment = {
  __typename?: "BusinessAttribute";
} & Pick<Types.BusinessAttribute, "urn" | "type"> & {
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    properties?: Types.Maybe<
      { __typename?: "BusinessAttributeInfo" } & Pick<
        Types.BusinessAttributeInfo,
        "name" | "description"
      > & { businessAttributeDataType: Types.BusinessAttributeInfo["type"] } & {
          customProperties?: Types.Maybe<
            Array<
              { __typename?: "CustomPropertiesEntry" } & Pick<
                Types.CustomPropertiesEntry,
                "key" | "value" | "associatedUrn"
              >
            >
          >;
          lastModified: { __typename?: "AuditStamp" } & Pick<
            Types.AuditStamp,
            "time"
          >;
          created: { __typename?: "AuditStamp" } & Pick<
            Types.AuditStamp,
            "time"
          >;
          tags?: Types.Maybe<
            { __typename?: "GlobalTags" } & {
              tags?: Types.Maybe<
                Array<
                  { __typename?: "TagAssociation" } & Pick<
                    Types.TagAssociation,
                    "associatedUrn"
                  > & {
                      tag: { __typename?: "Tag" } & Pick<
                        Types.Tag,
                        "urn" | "name"
                      > & {
                          properties?: Types.Maybe<
                            { __typename?: "TagProperties" } & Pick<
                              Types.TagProperties,
                              "name"
                            >
                          >;
                        };
                    }
                >
              >;
            }
          >;
          glossaryTerms?: Types.Maybe<
            { __typename?: "GlossaryTerms" } & {
              terms?: Types.Maybe<
                Array<
                  { __typename?: "GlossaryTermAssociation" } & Pick<
                    Types.GlossaryTermAssociation,
                    "associatedUrn"
                  > & {
                      term: { __typename?: "GlossaryTerm" } & Pick<
                        Types.GlossaryTerm,
                        "urn" | "type"
                      > & {
                          properties?: Types.Maybe<
                            { __typename?: "GlossaryTermProperties" } & Pick<
                              Types.GlossaryTermProperties,
                              "name"
                            >
                          >;
                        };
                    }
                >
              >;
            }
          >;
        }
    >;
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
  };

export type CreateBusinessAttributeMutationVariables = Types.Exact<{
  input: Types.CreateBusinessAttributeInput;
}>;

export type CreateBusinessAttributeMutation = { __typename?: "Mutation" } & {
  createBusinessAttribute?: Types.Maybe<
    { __typename?: "BusinessAttribute" } & BusinessAttributeFieldsFragment
  >;
};

export type DeleteBusinessAttributeMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type DeleteBusinessAttributeMutation = {
  __typename?: "Mutation";
} & Pick<Types.Mutation, "deleteBusinessAttribute">;

export type UpdateBusinessAttributeMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  input: Types.UpdateBusinessAttributeInput;
}>;

export type UpdateBusinessAttributeMutation = { __typename?: "Mutation" } & {
  updateBusinessAttribute?: Types.Maybe<
    { __typename?: "BusinessAttribute" } & BusinessAttributeFieldsFragment
  >;
};

export const BusinessAttributeFieldsFragmentDoc = gql`
  fragment businessAttributeFields on BusinessAttribute {
    urn
    type
    ownership {
      ...ownershipFields
    }
    properties {
      name
      description
      businessAttributeDataType: type
      customProperties {
        key
        value
        associatedUrn
      }
      lastModified {
        time
      }
      created {
        time
      }
      tags {
        tags {
          tag {
            urn
            name
            properties {
              name
            }
          }
          associatedUrn
        }
      }
      glossaryTerms {
        terms {
          term {
            urn
            type
            properties {
              name
            }
          }
          associatedUrn
        }
      }
    }
    institutionalMemory {
      ...institutionalMemoryFields
    }
  }
  ${OwnershipFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
`;
export const GetBusinessAttributeDocument = gql`
  query getBusinessAttribute($urn: String!) {
    businessAttribute(urn: $urn) {
      ...businessAttributeFields
    }
  }
  ${BusinessAttributeFieldsFragmentDoc}
`;

/**
 * __useGetBusinessAttributeQuery__
 *
 * To run a query within a React component, call `useGetBusinessAttributeQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetBusinessAttributeQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetBusinessAttributeQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetBusinessAttributeQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetBusinessAttributeQuery,
    GetBusinessAttributeQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetBusinessAttributeQuery,
    GetBusinessAttributeQueryVariables
  >(GetBusinessAttributeDocument, baseOptions);
}
export function useGetBusinessAttributeLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetBusinessAttributeQuery,
    GetBusinessAttributeQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetBusinessAttributeQuery,
    GetBusinessAttributeQueryVariables
  >(GetBusinessAttributeDocument, baseOptions);
}
export type GetBusinessAttributeQueryHookResult = ReturnType<
  typeof useGetBusinessAttributeQuery
>;
export type GetBusinessAttributeLazyQueryHookResult = ReturnType<
  typeof useGetBusinessAttributeLazyQuery
>;
export type GetBusinessAttributeQueryResult = Apollo.QueryResult<
  GetBusinessAttributeQuery,
  GetBusinessAttributeQueryVariables
>;
export const ListBusinessAttributesDocument = gql`
  query listBusinessAttributes($start: Int!, $count: Int!, $query: String) {
    listBusinessAttributes(
      input: { start: $start, count: $count, query: $query }
    ) {
      start
      count
      total
      businessAttributes {
        ...businessAttributeFields
      }
    }
  }
  ${BusinessAttributeFieldsFragmentDoc}
`;

/**
 * __useListBusinessAttributesQuery__
 *
 * To run a query within a React component, call `useListBusinessAttributesQuery` and pass it any options that fit your needs.
 * When your component renders, `useListBusinessAttributesQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useListBusinessAttributesQuery({
 *   variables: {
 *      start: // value for 'start'
 *      count: // value for 'count'
 *      query: // value for 'query'
 *   },
 * });
 */
export function useListBusinessAttributesQuery(
  baseOptions: Apollo.QueryHookOptions<
    ListBusinessAttributesQuery,
    ListBusinessAttributesQueryVariables
  >,
) {
  return Apollo.useQuery<
    ListBusinessAttributesQuery,
    ListBusinessAttributesQueryVariables
  >(ListBusinessAttributesDocument, baseOptions);
}
export function useListBusinessAttributesLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    ListBusinessAttributesQuery,
    ListBusinessAttributesQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    ListBusinessAttributesQuery,
    ListBusinessAttributesQueryVariables
  >(ListBusinessAttributesDocument, baseOptions);
}
export type ListBusinessAttributesQueryHookResult = ReturnType<
  typeof useListBusinessAttributesQuery
>;
export type ListBusinessAttributesLazyQueryHookResult = ReturnType<
  typeof useListBusinessAttributesLazyQuery
>;
export type ListBusinessAttributesQueryResult = Apollo.QueryResult<
  ListBusinessAttributesQuery,
  ListBusinessAttributesQueryVariables
>;
export const CreateBusinessAttributeDocument = gql`
  mutation createBusinessAttribute($input: CreateBusinessAttributeInput!) {
    createBusinessAttribute(input: $input) {
      ...businessAttributeFields
    }
  }
  ${BusinessAttributeFieldsFragmentDoc}
`;
export type CreateBusinessAttributeMutationFn = Apollo.MutationFunction<
  CreateBusinessAttributeMutation,
  CreateBusinessAttributeMutationVariables
>;

/**
 * __useCreateBusinessAttributeMutation__
 *
 * To run a mutation, you first call `useCreateBusinessAttributeMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useCreateBusinessAttributeMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [createBusinessAttributeMutation, { data, loading, error }] = useCreateBusinessAttributeMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useCreateBusinessAttributeMutation(
  baseOptions?: Apollo.MutationHookOptions<
    CreateBusinessAttributeMutation,
    CreateBusinessAttributeMutationVariables
  >,
) {
  return Apollo.useMutation<
    CreateBusinessAttributeMutation,
    CreateBusinessAttributeMutationVariables
  >(CreateBusinessAttributeDocument, baseOptions);
}
export type CreateBusinessAttributeMutationHookResult = ReturnType<
  typeof useCreateBusinessAttributeMutation
>;
export type CreateBusinessAttributeMutationResult =
  Apollo.MutationResult<CreateBusinessAttributeMutation>;
export type CreateBusinessAttributeMutationOptions = Apollo.BaseMutationOptions<
  CreateBusinessAttributeMutation,
  CreateBusinessAttributeMutationVariables
>;
export const DeleteBusinessAttributeDocument = gql`
  mutation deleteBusinessAttribute($urn: String!) {
    deleteBusinessAttribute(urn: $urn)
  }
`;
export type DeleteBusinessAttributeMutationFn = Apollo.MutationFunction<
  DeleteBusinessAttributeMutation,
  DeleteBusinessAttributeMutationVariables
>;

/**
 * __useDeleteBusinessAttributeMutation__
 *
 * To run a mutation, you first call `useDeleteBusinessAttributeMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useDeleteBusinessAttributeMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [deleteBusinessAttributeMutation, { data, loading, error }] = useDeleteBusinessAttributeMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useDeleteBusinessAttributeMutation(
  baseOptions?: Apollo.MutationHookOptions<
    DeleteBusinessAttributeMutation,
    DeleteBusinessAttributeMutationVariables
  >,
) {
  return Apollo.useMutation<
    DeleteBusinessAttributeMutation,
    DeleteBusinessAttributeMutationVariables
  >(DeleteBusinessAttributeDocument, baseOptions);
}
export type DeleteBusinessAttributeMutationHookResult = ReturnType<
  typeof useDeleteBusinessAttributeMutation
>;
export type DeleteBusinessAttributeMutationResult =
  Apollo.MutationResult<DeleteBusinessAttributeMutation>;
export type DeleteBusinessAttributeMutationOptions = Apollo.BaseMutationOptions<
  DeleteBusinessAttributeMutation,
  DeleteBusinessAttributeMutationVariables
>;
export const UpdateBusinessAttributeDocument = gql`
  mutation updateBusinessAttribute(
    $urn: String!
    $input: UpdateBusinessAttributeInput!
  ) {
    updateBusinessAttribute(urn: $urn, input: $input) {
      ...businessAttributeFields
    }
  }
  ${BusinessAttributeFieldsFragmentDoc}
`;
export type UpdateBusinessAttributeMutationFn = Apollo.MutationFunction<
  UpdateBusinessAttributeMutation,
  UpdateBusinessAttributeMutationVariables
>;

/**
 * __useUpdateBusinessAttributeMutation__
 *
 * To run a mutation, you first call `useUpdateBusinessAttributeMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateBusinessAttributeMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateBusinessAttributeMutation, { data, loading, error }] = useUpdateBusinessAttributeMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateBusinessAttributeMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateBusinessAttributeMutation,
    UpdateBusinessAttributeMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateBusinessAttributeMutation,
    UpdateBusinessAttributeMutationVariables
  >(UpdateBusinessAttributeDocument, baseOptions);
}
export type UpdateBusinessAttributeMutationHookResult = ReturnType<
  typeof useUpdateBusinessAttributeMutation
>;
export type UpdateBusinessAttributeMutationResult =
  Apollo.MutationResult<UpdateBusinessAttributeMutation>;
export type UpdateBusinessAttributeMutationOptions = Apollo.BaseMutationOptions<
  UpdateBusinessAttributeMutation,
  UpdateBusinessAttributeMutationVariables
>;
