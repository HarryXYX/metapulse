/* eslint-disable */
import * as Types from "../types.generated";

import {
  DataPlatformInstanceFieldsFragment,
  GlobalTagsFieldsFragment,
} from "./fragments.generated";
import { gql } from "@apollo/client";
import {
  DataPlatformInstanceFieldsFragmentDoc,
  GlobalTagsFieldsFragmentDoc,
} from "./fragments.generated";
import * as Apollo from "@apollo/client";
export type AssertionInfoFragment = { __typename?: "AssertionInfo" } & Pick<
  Types.AssertionInfo,
  "type" | "description" | "externalUrl"
> & {
    lastUpdated?: Types.Maybe<
      { __typename?: "AuditStamp" } & Pick<Types.AuditStamp, "time" | "actor">
    >;
    datasetAssertion?: Types.Maybe<
      { __typename?: "DatasetAssertionInfo" } & Pick<
        Types.DatasetAssertionInfo,
        | "datasetUrn"
        | "scope"
        | "aggregation"
        | "operator"
        | "nativeType"
        | "logic"
      > & {
          parameters?: Types.Maybe<
            { __typename?: "AssertionStdParameters" } & {
              value?: Types.Maybe<
                { __typename?: "AssertionStdParameter" } & Pick<
                  Types.AssertionStdParameter,
                  "value" | "type"
                >
              >;
              minValue?: Types.Maybe<
                { __typename?: "AssertionStdParameter" } & Pick<
                  Types.AssertionStdParameter,
                  "value" | "type"
                >
              >;
              maxValue?: Types.Maybe<
                { __typename?: "AssertionStdParameter" } & Pick<
                  Types.AssertionStdParameter,
                  "value" | "type"
                >
              >;
            }
          >;
          fields?: Types.Maybe<
            Array<
              { __typename?: "SchemaFieldRef" } & Pick<
                Types.SchemaFieldRef,
                "urn" | "path"
              >
            >
          >;
          nativeParameters?: Types.Maybe<
            Array<
              { __typename?: "StringMapEntry" } & Pick<
                Types.StringMapEntry,
                "key" | "value"
              >
            >
          >;
        }
    >;
    freshnessAssertion?: Types.Maybe<
      { __typename?: "FreshnessAssertionInfo" } & Pick<
        Types.FreshnessAssertionInfo,
        "type" | "entityUrn"
      > & {
          schedule: { __typename?: "FreshnessAssertionSchedule" } & Pick<
            Types.FreshnessAssertionSchedule,
            "type"
          > & {
              cron?: Types.Maybe<
                { __typename?: "FreshnessCronSchedule" } & Pick<
                  Types.FreshnessCronSchedule,
                  "cron" | "timezone"
                >
              >;
              fixedInterval?: Types.Maybe<
                { __typename?: "FixedIntervalSchedule" } & Pick<
                  Types.FixedIntervalSchedule,
                  "unit" | "multiple"
                >
              >;
            };
          filter?: Types.Maybe<
            { __typename?: "DatasetFilter" } & Pick<
              Types.DatasetFilter,
              "type" | "sql"
            >
          >;
        }
    >;
    sqlAssertion?: Types.Maybe<
      { __typename?: "SqlAssertionInfo" } & Pick<
        Types.SqlAssertionInfo,
        "type" | "entityUrn" | "statement" | "changeType" | "operator"
      > & {
          parameters: {
            __typename?: "AssertionStdParameters";
          } & AssertionStdParametersDetailsFragment;
        }
    >;
    fieldAssertion?: Types.Maybe<
      { __typename?: "FieldAssertionInfo" } & Pick<
        Types.FieldAssertionInfo,
        "type" | "entityUrn"
      > & {
          filter?: Types.Maybe<
            { __typename?: "DatasetFilter" } & Pick<
              Types.DatasetFilter,
              "type" | "sql"
            >
          >;
          fieldValuesAssertion?: Types.Maybe<
            { __typename?: "FieldValuesAssertion" } & Pick<
              Types.FieldValuesAssertion,
              "operator" | "excludeNulls"
            > & {
                field: { __typename?: "SchemaFieldSpec" } & Pick<
                  Types.SchemaFieldSpec,
                  "path" | "type" | "nativeType"
                >;
                transform?: Types.Maybe<
                  { __typename?: "FieldTransform" } & Pick<
                    Types.FieldTransform,
                    "type"
                  >
                >;
                parameters?: Types.Maybe<
                  {
                    __typename?: "AssertionStdParameters";
                  } & AssertionStdParametersDetailsFragment
                >;
                failThreshold: {
                  __typename?: "FieldValuesFailThreshold";
                } & Pick<Types.FieldValuesFailThreshold, "type" | "value">;
              }
          >;
          fieldMetricAssertion?: Types.Maybe<
            { __typename?: "FieldMetricAssertion" } & Pick<
              Types.FieldMetricAssertion,
              "metric" | "operator"
            > & {
                field: { __typename?: "SchemaFieldSpec" } & Pick<
                  Types.SchemaFieldSpec,
                  "path" | "type" | "nativeType"
                >;
                parameters?: Types.Maybe<
                  {
                    __typename?: "AssertionStdParameters";
                  } & AssertionStdParametersDetailsFragment
                >;
              }
          >;
        }
    >;
    volumeAssertion?: Types.Maybe<
      { __typename?: "VolumeAssertionInfo" } & Pick<
        Types.VolumeAssertionInfo,
        "type" | "entityUrn"
      > & {
          filter?: Types.Maybe<
            { __typename?: "DatasetFilter" } & Pick<
              Types.DatasetFilter,
              "type" | "sql"
            >
          >;
          rowCountTotal?: Types.Maybe<
            { __typename?: "RowCountTotal" } & Pick<
              Types.RowCountTotal,
              "operator"
            > & {
                parameters: {
                  __typename?: "AssertionStdParameters";
                } & AssertionStdParametersDetailsFragment;
              }
          >;
          rowCountChange?: Types.Maybe<
            { __typename?: "RowCountChange" } & Pick<
              Types.RowCountChange,
              "type" | "operator"
            > & {
                parameters: {
                  __typename?: "AssertionStdParameters";
                } & AssertionStdParametersDetailsFragment;
              }
          >;
          incrementingSegmentRowCountTotal?: Types.Maybe<
            { __typename?: "IncrementingSegmentRowCountTotal" } & Pick<
              Types.IncrementingSegmentRowCountTotal,
              "operator"
            > & {
                parameters: {
                  __typename?: "AssertionStdParameters";
                } & AssertionStdParametersDetailsFragment;
                segment: {
                  __typename?: "IncrementingSegmentSpec";
                } & IncrementingSegmentSpecDetailsFragment;
              }
          >;
          incrementingSegmentRowCountChange?: Types.Maybe<
            { __typename?: "IncrementingSegmentRowCountChange" } & Pick<
              Types.IncrementingSegmentRowCountChange,
              "type" | "operator"
            > & {
                parameters: {
                  __typename?: "AssertionStdParameters";
                } & AssertionStdParametersDetailsFragment;
                segment: {
                  __typename?: "IncrementingSegmentSpec";
                } & IncrementingSegmentSpecDetailsFragment;
              }
          >;
        }
    >;
    schemaAssertion?: Types.Maybe<
      { __typename?: "SchemaAssertionInfo" } & Pick<
        Types.SchemaAssertionInfo,
        "entityUrn" | "compatibility"
      > & {
          fields: Array<
            { __typename?: "SchemaAssertionField" } & Pick<
              Types.SchemaAssertionField,
              "path" | "type" | "nativeType"
            >
          >;
          schema?: Types.Maybe<
            { __typename?: "SchemaMetadata" } & {
              fields: Array<
                { __typename?: "SchemaField" } & Pick<
                  Types.SchemaField,
                  "fieldPath" | "type" | "nativeDataType"
                >
              >;
            }
          >;
        }
    >;
    customAssertion?: Types.Maybe<
      { __typename?: "CustomAssertionInfo" } & Pick<
        Types.CustomAssertionInfo,
        "type" | "entityUrn" | "logic"
      > & {
          field?: Types.Maybe<
            { __typename?: "SchemaFieldRef" } & Pick<
              Types.SchemaFieldRef,
              "urn" | "path"
            >
          >;
        }
    >;
    source?: Types.Maybe<
      { __typename?: "AssertionSource" } & Pick<
        Types.AssertionSource,
        "type"
      > & {
          created?: Types.Maybe<
            { __typename?: "AuditStamp" } & Pick<
              Types.AuditStamp,
              "time" | "actor"
            >
          >;
        }
    >;
  };

export type AssertionDetailsFragment = { __typename?: "Assertion" } & Pick<
  Types.Assertion,
  "urn" | "type"
> & {
    platform: { __typename?: "DataPlatform" } & Pick<
      Types.DataPlatform,
      "urn" | "name"
    > & {
        properties?: Types.Maybe<
          { __typename?: "DataPlatformProperties" } & Pick<
            Types.DataPlatformProperties,
            "displayName" | "logoUrl"
          >
        >;
        info?: Types.Maybe<
          { __typename?: "DataPlatformInfo" } & Pick<
            Types.DataPlatformInfo,
            "displayName" | "logoUrl"
          >
        >;
      };
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    info?: Types.Maybe<
      { __typename?: "AssertionInfo" } & AssertionInfoFragment
    >;
    actions?: Types.Maybe<
      { __typename?: "AssertionActions" } & {
        onSuccess: Array<
          { __typename?: "AssertionAction" } & Pick<
            Types.AssertionAction,
            "type"
          >
        >;
        onFailure: Array<
          { __typename?: "AssertionAction" } & Pick<
            Types.AssertionAction,
            "type"
          >
        >;
      }
    >;
    tags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
  };

export type IncrementingSegmentSpecDetailsFragment = {
  __typename?: "IncrementingSegmentSpec";
} & {
  field: { __typename?: "SchemaFieldSpec" } & Pick<
    Types.SchemaFieldSpec,
    "path" | "type" | "nativeType"
  >;
  transformer?: Types.Maybe<
    { __typename?: "IncrementingSegmentFieldTransformer" } & Pick<
      Types.IncrementingSegmentFieldTransformer,
      "type" | "nativeType"
    >
  >;
};

export type AssertionStdParametersDetailsFragment = {
  __typename?: "AssertionStdParameters";
} & {
  value?: Types.Maybe<
    { __typename?: "AssertionStdParameter" } & Pick<
      Types.AssertionStdParameter,
      "value" | "type"
    >
  >;
  minValue?: Types.Maybe<
    { __typename?: "AssertionStdParameter" } & Pick<
      Types.AssertionStdParameter,
      "value" | "type"
    >
  >;
  maxValue?: Types.Maybe<
    { __typename?: "AssertionStdParameter" } & Pick<
      Types.AssertionStdParameter,
      "value" | "type"
    >
  >;
};

export type AssertionDetailsWithRunEventsFragment = {
  __typename?: "Assertion";
} & {
  runEvents?: Types.Maybe<
    { __typename?: "AssertionRunEventsResult" } & Pick<
      Types.AssertionRunEventsResult,
      "total" | "failed" | "succeeded"
    > & {
        runEvents: Array<
          {
            __typename?: "AssertionRunEvent";
          } & AssertionRunEventDetailsFragment
        >;
      }
  >;
} & AssertionDetailsFragment;

export type AssertionResultDetailsFragment = {
  __typename?: "AssertionResult";
} & Pick<
  Types.AssertionResult,
  | "type"
  | "actualAggValue"
  | "rowCount"
  | "missingCount"
  | "unexpectedCount"
  | "externalUrl"
> & {
    nativeResults?: Types.Maybe<
      Array<
        { __typename?: "StringMapEntry" } & Pick<
          Types.StringMapEntry,
          "key" | "value"
        >
      >
    >;
    error?: Types.Maybe<
      { __typename?: "AssertionResultError" } & Pick<
        Types.AssertionResultError,
        "type"
      > & {
          properties?: Types.Maybe<
            Array<
              { __typename?: "StringMapEntry" } & Pick<
                Types.StringMapEntry,
                "key" | "value"
              >
            >
          >;
        }
    >;
  };

export type AssertionRunEventDetailsFragment = {
  __typename?: "AssertionRunEvent";
} & Pick<
  Types.AssertionRunEvent,
  "timestampMillis" | "lastObservedMillis" | "assertionUrn" | "status" | "runId"
> & {
    runtimeContext?: Types.Maybe<
      Array<
        { __typename?: "StringMapEntry" } & Pick<
          Types.StringMapEntry,
          "key" | "value"
        >
      >
    >;
    result?: Types.Maybe<
      { __typename?: "AssertionResult" } & AssertionResultDetailsFragment
    >;
  };

export type GetAssertionRunsQueryVariables = Types.Exact<{
  assertionUrn: Types.Scalars["String"];
  startTime?: Types.Maybe<Types.Scalars["Long"]>;
  endTime?: Types.Maybe<Types.Scalars["Long"]>;
  limit?: Types.Maybe<Types.Scalars["Int"]>;
}>;

export type GetAssertionRunsQuery = { __typename?: "Query" } & {
  assertion?: Types.Maybe<
    { __typename?: "Assertion" } & Pick<Types.Assertion, "urn"> & {
        runEvents?: Types.Maybe<
          { __typename?: "AssertionRunEventsResult" } & Pick<
            Types.AssertionRunEventsResult,
            "total" | "failed" | "succeeded"
          > & {
              runEvents: Array<
                {
                  __typename?: "AssertionRunEvent";
                } & AssertionRunEventDetailsFragment
              >;
            }
        >;
      } & AssertionDetailsFragment
  >;
};

export type DeleteAssertionMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type DeleteAssertionMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "deleteAssertion"
>;

export type GetAssertionWithRunEventsQueryVariables = Types.Exact<{
  assertionUrn: Types.Scalars["String"];
}>;

export type GetAssertionWithRunEventsQuery = { __typename?: "Query" } & {
  assertion?: Types.Maybe<
    { __typename?: "Assertion" } & Pick<Types.Assertion, "urn"> &
      AssertionDetailsWithRunEventsFragment
  >;
};

export const AssertionStdParametersDetailsFragmentDoc = gql`
  fragment assertionStdParametersDetails on AssertionStdParameters {
    value {
      value
      type
    }
    minValue {
      value
      type
    }
    maxValue {
      value
      type
    }
  }
`;
export const IncrementingSegmentSpecDetailsFragmentDoc = gql`
  fragment incrementingSegmentSpecDetails on IncrementingSegmentSpec {
    field {
      path
      type
      nativeType
    }
    transformer {
      type
      nativeType
    }
  }
`;
export const AssertionInfoFragmentDoc = gql`
  fragment assertionInfo on AssertionInfo {
    type
    description
    lastUpdated {
      time
      actor
    }
    datasetAssertion {
      datasetUrn
      scope
      aggregation
      operator
      parameters {
        value {
          value
          type
        }
        minValue {
          value
          type
        }
        maxValue {
          value
          type
        }
      }
      fields {
        urn
        path
      }
      nativeType
      nativeParameters {
        key
        value
      }
      logic
    }
    freshnessAssertion {
      type
      entityUrn
      schedule {
        type
        cron {
          cron
          timezone
        }
        fixedInterval {
          unit
          multiple
        }
      }
      filter {
        type
        sql
      }
    }
    sqlAssertion {
      type
      entityUrn
      statement
      changeType
      operator
      parameters {
        ...assertionStdParametersDetails
      }
    }
    fieldAssertion {
      type
      entityUrn
      filter {
        type
        sql
      }
      fieldValuesAssertion {
        field {
          path
          type
          nativeType
        }
        transform {
          type
        }
        operator
        parameters {
          ...assertionStdParametersDetails
        }
        failThreshold {
          type
          value
        }
        excludeNulls
      }
      fieldMetricAssertion {
        field {
          path
          type
          nativeType
        }
        metric
        operator
        parameters {
          ...assertionStdParametersDetails
        }
      }
    }
    volumeAssertion {
      type
      entityUrn
      filter {
        type
        sql
      }
      rowCountTotal {
        operator
        parameters {
          ...assertionStdParametersDetails
        }
      }
      rowCountChange {
        type
        operator
        parameters {
          ...assertionStdParametersDetails
        }
      }
      incrementingSegmentRowCountTotal {
        operator
        parameters {
          ...assertionStdParametersDetails
        }
        segment {
          ...incrementingSegmentSpecDetails
        }
      }
      incrementingSegmentRowCountChange {
        type
        operator
        parameters {
          ...assertionStdParametersDetails
        }
        segment {
          ...incrementingSegmentSpecDetails
        }
      }
    }
    schemaAssertion {
      entityUrn
      compatibility
      fields {
        path
        type
        nativeType
      }
      schema {
        fields {
          fieldPath
          type
          nativeDataType
        }
      }
    }
    customAssertion {
      type
      entityUrn
      field {
        urn
        path
      }
      logic
    }
    source {
      type
      created {
        time
        actor
      }
    }
    externalUrl
  }
  ${AssertionStdParametersDetailsFragmentDoc}
  ${IncrementingSegmentSpecDetailsFragmentDoc}
`;
export const AssertionDetailsFragmentDoc = gql`
  fragment assertionDetails on Assertion {
    urn
    type
    platform {
      urn
      name
      properties {
        displayName
        logoUrl
      }
      info {
        displayName
        logoUrl
      }
    }
    dataPlatformInstance {
      ...dataPlatformInstanceFields
    }
    info {
      ...assertionInfo
    }
    actions {
      onSuccess {
        type
      }
      onFailure {
        type
      }
    }
    tags {
      ...globalTagsFields
    }
  }
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${AssertionInfoFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
`;
export const AssertionResultDetailsFragmentDoc = gql`
  fragment assertionResultDetails on AssertionResult {
    type
    actualAggValue
    rowCount
    missingCount
    unexpectedCount
    externalUrl
    nativeResults {
      key
      value
    }
    error {
      type
      properties {
        key
        value
      }
    }
  }
`;
export const AssertionRunEventDetailsFragmentDoc = gql`
  fragment assertionRunEventDetails on AssertionRunEvent {
    timestampMillis
    lastObservedMillis
    assertionUrn
    status
    runId
    runtimeContext {
      key
      value
    }
    result {
      ...assertionResultDetails
    }
  }
  ${AssertionResultDetailsFragmentDoc}
`;
export const AssertionDetailsWithRunEventsFragmentDoc = gql`
  fragment assertionDetailsWithRunEvents on Assertion {
    ...assertionDetails
    runEvents(status: COMPLETE, limit: 1) {
      total
      failed
      succeeded
      runEvents {
        ...assertionRunEventDetails
      }
    }
  }
  ${AssertionDetailsFragmentDoc}
  ${AssertionRunEventDetailsFragmentDoc}
`;
export const GetAssertionRunsDocument = gql`
  query getAssertionRuns(
    $assertionUrn: String!
    $startTime: Long
    $endTime: Long
    $limit: Int
  ) {
    assertion(urn: $assertionUrn) {
      urn
      ...assertionDetails
      runEvents(
        status: COMPLETE
        startTimeMillis: $startTime
        endTimeMillis: $endTime
        limit: $limit
      ) {
        total
        failed
        succeeded
        runEvents {
          ...assertionRunEventDetails
        }
      }
    }
  }
  ${AssertionDetailsFragmentDoc}
  ${AssertionRunEventDetailsFragmentDoc}
`;

/**
 * __useGetAssertionRunsQuery__
 *
 * To run a query within a React component, call `useGetAssertionRunsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetAssertionRunsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetAssertionRunsQuery({
 *   variables: {
 *      assertionUrn: // value for 'assertionUrn'
 *      startTime: // value for 'startTime'
 *      endTime: // value for 'endTime'
 *      limit: // value for 'limit'
 *   },
 * });
 */
export function useGetAssertionRunsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetAssertionRunsQuery,
    GetAssertionRunsQueryVariables
  >,
) {
  return Apollo.useQuery<GetAssertionRunsQuery, GetAssertionRunsQueryVariables>(
    GetAssertionRunsDocument,
    baseOptions,
  );
}
export function useGetAssertionRunsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetAssertionRunsQuery,
    GetAssertionRunsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetAssertionRunsQuery,
    GetAssertionRunsQueryVariables
  >(GetAssertionRunsDocument, baseOptions);
}
export type GetAssertionRunsQueryHookResult = ReturnType<
  typeof useGetAssertionRunsQuery
>;
export type GetAssertionRunsLazyQueryHookResult = ReturnType<
  typeof useGetAssertionRunsLazyQuery
>;
export type GetAssertionRunsQueryResult = Apollo.QueryResult<
  GetAssertionRunsQuery,
  GetAssertionRunsQueryVariables
>;
export const DeleteAssertionDocument = gql`
  mutation deleteAssertion($urn: String!) {
    deleteAssertion(urn: $urn)
  }
`;
export type DeleteAssertionMutationFn = Apollo.MutationFunction<
  DeleteAssertionMutation,
  DeleteAssertionMutationVariables
>;

/**
 * __useDeleteAssertionMutation__
 *
 * To run a mutation, you first call `useDeleteAssertionMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useDeleteAssertionMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [deleteAssertionMutation, { data, loading, error }] = useDeleteAssertionMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useDeleteAssertionMutation(
  baseOptions?: Apollo.MutationHookOptions<
    DeleteAssertionMutation,
    DeleteAssertionMutationVariables
  >,
) {
  return Apollo.useMutation<
    DeleteAssertionMutation,
    DeleteAssertionMutationVariables
  >(DeleteAssertionDocument, baseOptions);
}
export type DeleteAssertionMutationHookResult = ReturnType<
  typeof useDeleteAssertionMutation
>;
export type DeleteAssertionMutationResult =
  Apollo.MutationResult<DeleteAssertionMutation>;
export type DeleteAssertionMutationOptions = Apollo.BaseMutationOptions<
  DeleteAssertionMutation,
  DeleteAssertionMutationVariables
>;
export const GetAssertionWithRunEventsDocument = gql`
  query getAssertionWithRunEvents($assertionUrn: String!) {
    assertion(urn: $assertionUrn) {
      urn
      ...assertionDetailsWithRunEvents
    }
  }
  ${AssertionDetailsWithRunEventsFragmentDoc}
`;

/**
 * __useGetAssertionWithRunEventsQuery__
 *
 * To run a query within a React component, call `useGetAssertionWithRunEventsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetAssertionWithRunEventsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetAssertionWithRunEventsQuery({
 *   variables: {
 *      assertionUrn: // value for 'assertionUrn'
 *   },
 * });
 */
export function useGetAssertionWithRunEventsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetAssertionWithRunEventsQuery,
    GetAssertionWithRunEventsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetAssertionWithRunEventsQuery,
    GetAssertionWithRunEventsQueryVariables
  >(GetAssertionWithRunEventsDocument, baseOptions);
}
export function useGetAssertionWithRunEventsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetAssertionWithRunEventsQuery,
    GetAssertionWithRunEventsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetAssertionWithRunEventsQuery,
    GetAssertionWithRunEventsQueryVariables
  >(GetAssertionWithRunEventsDocument, baseOptions);
}
export type GetAssertionWithRunEventsQueryHookResult = ReturnType<
  typeof useGetAssertionWithRunEventsQuery
>;
export type GetAssertionWithRunEventsLazyQueryHookResult = ReturnType<
  typeof useGetAssertionWithRunEventsLazyQuery
>;
export type GetAssertionWithRunEventsQueryResult = Apollo.QueryResult<
  GetAssertionWithRunEventsQuery,
  GetAssertionWithRunEventsQueryVariables
>;
