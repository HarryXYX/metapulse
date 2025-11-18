/* eslint-disable */
import * as Types from "../types.generated";

import { gql } from "@apollo/client";
import * as Apollo from "@apollo/client";
export type ListPostsQueryVariables = Types.Exact<{
  input: Types.ListPostsInput;
}>;

export type ListPostsQuery = { __typename?: "Query" } & {
  listPosts?: Types.Maybe<
    { __typename?: "ListPostsResult" } & Pick<
      Types.ListPostsResult,
      "start" | "count" | "total"
    > & {
        posts: Array<
          { __typename?: "Post" } & Pick<
            Types.Post,
            "urn" | "type" | "postType"
          > & {
              lastModified: { __typename?: "AuditStamp" } & Pick<
                Types.AuditStamp,
                "time"
              >;
              content: { __typename?: "PostContent" } & Pick<
                Types.PostContent,
                "contentType" | "title" | "description" | "link"
              > & {
                  media?: Types.Maybe<
                    { __typename?: "Media" } & Pick<
                      Types.Media,
                      "type" | "location"
                    >
                  >;
                };
            }
        >;
      }
  >;
};

export type DeletePostMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type DeletePostMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "deletePost"
>;

export const ListPostsDocument = gql`
  query listPosts($input: ListPostsInput!) {
    listPosts(input: $input) {
      start
      count
      total
      posts {
        urn
        type
        postType
        lastModified {
          time
        }
        content {
          contentType
          title
          description
          link
          media {
            type
            location
          }
        }
      }
    }
  }
`;

/**
 * __useListPostsQuery__
 *
 * To run a query within a React component, call `useListPostsQuery` and pass it any options that fit your needs.
 * When your component renders, `useListPostsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useListPostsQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useListPostsQuery(
  baseOptions: Apollo.QueryHookOptions<ListPostsQuery, ListPostsQueryVariables>,
) {
  return Apollo.useQuery<ListPostsQuery, ListPostsQueryVariables>(
    ListPostsDocument,
    baseOptions,
  );
}
export function useListPostsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    ListPostsQuery,
    ListPostsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<ListPostsQuery, ListPostsQueryVariables>(
    ListPostsDocument,
    baseOptions,
  );
}
export type ListPostsQueryHookResult = ReturnType<typeof useListPostsQuery>;
export type ListPostsLazyQueryHookResult = ReturnType<
  typeof useListPostsLazyQuery
>;
export type ListPostsQueryResult = Apollo.QueryResult<
  ListPostsQuery,
  ListPostsQueryVariables
>;
export const DeletePostDocument = gql`
  mutation deletePost($urn: String!) {
    deletePost(urn: $urn)
  }
`;
export type DeletePostMutationFn = Apollo.MutationFunction<
  DeletePostMutation,
  DeletePostMutationVariables
>;

/**
 * __useDeletePostMutation__
 *
 * To run a mutation, you first call `useDeletePostMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useDeletePostMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [deletePostMutation, { data, loading, error }] = useDeletePostMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useDeletePostMutation(
  baseOptions?: Apollo.MutationHookOptions<
    DeletePostMutation,
    DeletePostMutationVariables
  >,
) {
  return Apollo.useMutation<DeletePostMutation, DeletePostMutationVariables>(
    DeletePostDocument,
    baseOptions,
  );
}
export type DeletePostMutationHookResult = ReturnType<
  typeof useDeletePostMutation
>;
export type DeletePostMutationResult =
  Apollo.MutationResult<DeletePostMutation>;
export type DeletePostMutationOptions = Apollo.BaseMutationOptions<
  DeletePostMutation,
  DeletePostMutationVariables
>;
