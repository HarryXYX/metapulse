/* eslint-disable */
import * as Types from "../types.generated";

import { gql } from "@apollo/client";
import * as Apollo from "@apollo/client";
export type GetTimelineQueryVariables = Types.Exact<{
  input: Types.GetTimelineInput;
}>;

export type GetTimelineQuery = { __typename?: "Query" } & {
  getTimeline?: Types.Maybe<
    { __typename?: "GetTimelineResult" } & {
      changeTransactions: Array<
        { __typename?: "ChangeTransaction" } & Pick<
          Types.ChangeTransaction,
          | "timestampMillis"
          | "lastSemanticVersion"
          | "versionStamp"
          | "changeType"
        > & {
            changes?: Types.Maybe<
              Array<
                { __typename?: "ChangeEvent" } & Pick<
                  Types.ChangeEvent,
                  "urn" | "category" | "operation" | "modifier" | "description"
                > & {
                    parameters?: Types.Maybe<
                      Array<
                        { __typename?: "TimelineParameterEntry" } & Pick<
                          Types.TimelineParameterEntry,
                          "key" | "value"
                        >
                      >
                    >;
                    auditStamp?: Types.Maybe<
                      { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "actor" | "time"
                      >
                    >;
                  }
              >
            >;
          }
      >;
    }
  >;
};

export const GetTimelineDocument = gql`
  query getTimeline($input: GetTimelineInput!) {
    getTimeline(input: $input) {
      changeTransactions {
        timestampMillis
        lastSemanticVersion
        versionStamp
        changeType
        changes {
          urn
          category
          operation
          modifier
          parameters {
            key
            value
          }
          auditStamp {
            actor
            time
          }
          description
        }
      }
    }
  }
`;

/**
 * __useGetTimelineQuery__
 *
 * To run a query within a React component, call `useGetTimelineQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetTimelineQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetTimelineQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useGetTimelineQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetTimelineQuery,
    GetTimelineQueryVariables
  >,
) {
  return Apollo.useQuery<GetTimelineQuery, GetTimelineQueryVariables>(
    GetTimelineDocument,
    baseOptions,
  );
}
export function useGetTimelineLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetTimelineQuery,
    GetTimelineQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetTimelineQuery, GetTimelineQueryVariables>(
    GetTimelineDocument,
    baseOptions,
  );
}
export type GetTimelineQueryHookResult = ReturnType<typeof useGetTimelineQuery>;
export type GetTimelineLazyQueryHookResult = ReturnType<
  typeof useGetTimelineLazyQuery
>;
export type GetTimelineQueryResult = Apollo.QueryResult<
  GetTimelineQuery,
  GetTimelineQueryVariables
>;
