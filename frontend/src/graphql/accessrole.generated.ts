/* eslint-disable */
import * as Types from "../types.generated";

import { gql } from "@apollo/client";
import * as Apollo from "@apollo/client";
export type GetExternalRoleQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetExternalRoleQuery = { __typename?: "Query" } & {
  role?: Types.Maybe<
    { __typename?: "Role" } & {
      properties?: Types.Maybe<
        { __typename?: "RoleProperties" } & Pick<
          Types.RoleProperties,
          "name" | "description"
        >
      >;
    }
  >;
};

export const GetExternalRoleDocument = gql`
  query getExternalRole($urn: String!) {
    role(urn: $urn) {
      properties {
        name
        description
      }
    }
  }
`;

/**
 * __useGetExternalRoleQuery__
 *
 * To run a query within a React component, call `useGetExternalRoleQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetExternalRoleQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetExternalRoleQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetExternalRoleQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetExternalRoleQuery,
    GetExternalRoleQueryVariables
  >,
) {
  return Apollo.useQuery<GetExternalRoleQuery, GetExternalRoleQueryVariables>(
    GetExternalRoleDocument,
    baseOptions,
  );
}
export function useGetExternalRoleLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetExternalRoleQuery,
    GetExternalRoleQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetExternalRoleQuery,
    GetExternalRoleQueryVariables
  >(GetExternalRoleDocument, baseOptions);
}
export type GetExternalRoleQueryHookResult = ReturnType<
  typeof useGetExternalRoleQuery
>;
export type GetExternalRoleLazyQueryHookResult = ReturnType<
  typeof useGetExternalRoleLazyQuery
>;
export type GetExternalRoleQueryResult = Apollo.QueryResult<
  GetExternalRoleQuery,
  GetExternalRoleQueryVariables
>;
