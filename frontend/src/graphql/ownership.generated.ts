/* eslint-disable */
import * as Types from "../types.generated";

import { gql } from "@apollo/client";
import * as Apollo from "@apollo/client";
export type ListOwnershipTypesQueryVariables = Types.Exact<{
  input: Types.ListOwnershipTypesInput;
}>;

export type ListOwnershipTypesQuery = { __typename?: "Query" } & {
  listOwnershipTypes: { __typename?: "ListOwnershipTypesResult" } & Pick<
    Types.ListOwnershipTypesResult,
    "start" | "count" | "total"
  > & {
      ownershipTypes: Array<
        { __typename?: "OwnershipTypeEntity" } & OwnershipTypeFieldsFragment
      >;
    };
};

export type CreateOwnershipTypeMutationVariables = Types.Exact<{
  input: Types.CreateOwnershipTypeInput;
}>;

export type CreateOwnershipTypeMutation = { __typename?: "Mutation" } & {
  createOwnershipType?: Types.Maybe<
    { __typename?: "OwnershipTypeEntity" } & OwnershipTypeFieldsFragment
  >;
};

export type UpdateOwnershipTypeMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  input: Types.UpdateOwnershipTypeInput;
}>;

export type UpdateOwnershipTypeMutation = { __typename?: "Mutation" } & {
  updateOwnershipType?: Types.Maybe<
    { __typename?: "OwnershipTypeEntity" } & OwnershipTypeFieldsFragment
  >;
};

export type DeleteOwnershipTypeMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  deleteReferences?: Types.Maybe<Types.Scalars["Boolean"]>;
}>;

export type DeleteOwnershipTypeMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "deleteOwnershipType"
>;

export type OwnershipTypeFieldsFragment = {
  __typename?: "OwnershipTypeEntity";
} & Pick<Types.OwnershipTypeEntity, "urn" | "type"> & {
    info?: Types.Maybe<
      { __typename?: "OwnershipTypeInfo" } & Pick<
        Types.OwnershipTypeInfo,
        "name" | "description"
      > & {
          created?: Types.Maybe<
            { __typename?: "AuditStamp" } & Pick<
              Types.AuditStamp,
              "time" | "actor"
            >
          >;
          lastModified?: Types.Maybe<
            { __typename?: "AuditStamp" } & Pick<
              Types.AuditStamp,
              "time" | "actor"
            >
          >;
        }
    >;
    status?: Types.Maybe<
      { __typename?: "Status" } & Pick<Types.Status, "removed">
    >;
  };

export const OwnershipTypeFieldsFragmentDoc = gql`
  fragment ownershipTypeFields on OwnershipTypeEntity {
    urn
    type
    info {
      name
      description
      created {
        time
        actor
      }
      lastModified {
        time
        actor
      }
    }
    status {
      removed
    }
  }
`;
export const ListOwnershipTypesDocument = gql`
  query listOwnershipTypes($input: ListOwnershipTypesInput!) {
    listOwnershipTypes(input: $input) {
      start
      count
      total
      ownershipTypes {
        ...ownershipTypeFields
      }
    }
  }
  ${OwnershipTypeFieldsFragmentDoc}
`;

/**
 * __useListOwnershipTypesQuery__
 *
 * To run a query within a React component, call `useListOwnershipTypesQuery` and pass it any options that fit your needs.
 * When your component renders, `useListOwnershipTypesQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useListOwnershipTypesQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useListOwnershipTypesQuery(
  baseOptions: Apollo.QueryHookOptions<
    ListOwnershipTypesQuery,
    ListOwnershipTypesQueryVariables
  >,
) {
  return Apollo.useQuery<
    ListOwnershipTypesQuery,
    ListOwnershipTypesQueryVariables
  >(ListOwnershipTypesDocument, baseOptions);
}
export function useListOwnershipTypesLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    ListOwnershipTypesQuery,
    ListOwnershipTypesQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    ListOwnershipTypesQuery,
    ListOwnershipTypesQueryVariables
  >(ListOwnershipTypesDocument, baseOptions);
}
export type ListOwnershipTypesQueryHookResult = ReturnType<
  typeof useListOwnershipTypesQuery
>;
export type ListOwnershipTypesLazyQueryHookResult = ReturnType<
  typeof useListOwnershipTypesLazyQuery
>;
export type ListOwnershipTypesQueryResult = Apollo.QueryResult<
  ListOwnershipTypesQuery,
  ListOwnershipTypesQueryVariables
>;
export const CreateOwnershipTypeDocument = gql`
  mutation createOwnershipType($input: CreateOwnershipTypeInput!) {
    createOwnershipType(input: $input) {
      ...ownershipTypeFields
    }
  }
  ${OwnershipTypeFieldsFragmentDoc}
`;
export type CreateOwnershipTypeMutationFn = Apollo.MutationFunction<
  CreateOwnershipTypeMutation,
  CreateOwnershipTypeMutationVariables
>;

/**
 * __useCreateOwnershipTypeMutation__
 *
 * To run a mutation, you first call `useCreateOwnershipTypeMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useCreateOwnershipTypeMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [createOwnershipTypeMutation, { data, loading, error }] = useCreateOwnershipTypeMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useCreateOwnershipTypeMutation(
  baseOptions?: Apollo.MutationHookOptions<
    CreateOwnershipTypeMutation,
    CreateOwnershipTypeMutationVariables
  >,
) {
  return Apollo.useMutation<
    CreateOwnershipTypeMutation,
    CreateOwnershipTypeMutationVariables
  >(CreateOwnershipTypeDocument, baseOptions);
}
export type CreateOwnershipTypeMutationHookResult = ReturnType<
  typeof useCreateOwnershipTypeMutation
>;
export type CreateOwnershipTypeMutationResult =
  Apollo.MutationResult<CreateOwnershipTypeMutation>;
export type CreateOwnershipTypeMutationOptions = Apollo.BaseMutationOptions<
  CreateOwnershipTypeMutation,
  CreateOwnershipTypeMutationVariables
>;
export const UpdateOwnershipTypeDocument = gql`
  mutation updateOwnershipType(
    $urn: String!
    $input: UpdateOwnershipTypeInput!
  ) {
    updateOwnershipType(urn: $urn, input: $input) {
      ...ownershipTypeFields
    }
  }
  ${OwnershipTypeFieldsFragmentDoc}
`;
export type UpdateOwnershipTypeMutationFn = Apollo.MutationFunction<
  UpdateOwnershipTypeMutation,
  UpdateOwnershipTypeMutationVariables
>;

/**
 * __useUpdateOwnershipTypeMutation__
 *
 * To run a mutation, you first call `useUpdateOwnershipTypeMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateOwnershipTypeMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateOwnershipTypeMutation, { data, loading, error }] = useUpdateOwnershipTypeMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateOwnershipTypeMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateOwnershipTypeMutation,
    UpdateOwnershipTypeMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateOwnershipTypeMutation,
    UpdateOwnershipTypeMutationVariables
  >(UpdateOwnershipTypeDocument, baseOptions);
}
export type UpdateOwnershipTypeMutationHookResult = ReturnType<
  typeof useUpdateOwnershipTypeMutation
>;
export type UpdateOwnershipTypeMutationResult =
  Apollo.MutationResult<UpdateOwnershipTypeMutation>;
export type UpdateOwnershipTypeMutationOptions = Apollo.BaseMutationOptions<
  UpdateOwnershipTypeMutation,
  UpdateOwnershipTypeMutationVariables
>;
export const DeleteOwnershipTypeDocument = gql`
  mutation deleteOwnershipType($urn: String!, $deleteReferences: Boolean) {
    deleteOwnershipType(urn: $urn, deleteReferences: $deleteReferences)
  }
`;
export type DeleteOwnershipTypeMutationFn = Apollo.MutationFunction<
  DeleteOwnershipTypeMutation,
  DeleteOwnershipTypeMutationVariables
>;

/**
 * __useDeleteOwnershipTypeMutation__
 *
 * To run a mutation, you first call `useDeleteOwnershipTypeMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useDeleteOwnershipTypeMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [deleteOwnershipTypeMutation, { data, loading, error }] = useDeleteOwnershipTypeMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *      deleteReferences: // value for 'deleteReferences'
 *   },
 * });
 */
export function useDeleteOwnershipTypeMutation(
  baseOptions?: Apollo.MutationHookOptions<
    DeleteOwnershipTypeMutation,
    DeleteOwnershipTypeMutationVariables
  >,
) {
  return Apollo.useMutation<
    DeleteOwnershipTypeMutation,
    DeleteOwnershipTypeMutationVariables
  >(DeleteOwnershipTypeDocument, baseOptions);
}
export type DeleteOwnershipTypeMutationHookResult = ReturnType<
  typeof useDeleteOwnershipTypeMutation
>;
export type DeleteOwnershipTypeMutationResult =
  Apollo.MutationResult<DeleteOwnershipTypeMutation>;
export type DeleteOwnershipTypeMutationOptions = Apollo.BaseMutationOptions<
  DeleteOwnershipTypeMutation,
  DeleteOwnershipTypeMutationVariables
>;
