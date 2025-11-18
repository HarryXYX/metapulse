/* eslint-disable */
import * as Types from "../types.generated";

import { PageTemplateFragment } from "./template.generated";
import { gql } from "@apollo/client";
import { PageTemplateFragmentDoc } from "./template.generated";
import * as Apollo from "@apollo/client";
export type AppConfigQueryVariables = Types.Exact<{ [key: string]: never }>;

export type AppConfigQuery = { __typename?: "Query" } & {
  appConfig?: Types.Maybe<
    { __typename?: "AppConfig" } & Pick<Types.AppConfig, "appVersion"> & {
        policiesConfig: { __typename?: "PoliciesConfig" } & Pick<
          Types.PoliciesConfig,
          "enabled"
        > & {
            platformPrivileges: Array<
              { __typename?: "Privilege" } & Pick<
                Types.Privilege,
                "type" | "displayName" | "description"
              >
            >;
            resourcePrivileges: Array<
              { __typename?: "ResourcePrivileges" } & Pick<
                Types.ResourcePrivileges,
                "resourceType" | "resourceTypeDisplayName" | "entityType"
              > & {
                  privileges: Array<
                    { __typename?: "Privilege" } & Pick<
                      Types.Privilege,
                      "type" | "displayName" | "description"
                    >
                  >;
                }
            >;
          };
        analyticsConfig: { __typename?: "AnalyticsConfig" } & Pick<
          Types.AnalyticsConfig,
          "enabled"
        >;
        authConfig: { __typename?: "AuthConfig" } & Pick<
          Types.AuthConfig,
          "tokenAuthEnabled"
        >;
        identityManagementConfig: {
          __typename?: "IdentityManagementConfig";
        } & Pick<Types.IdentityManagementConfig, "enabled">;
        lineageConfig: { __typename?: "LineageConfig" } & Pick<
          Types.LineageConfig,
          "supportsImpactAnalysis"
        >;
        managedIngestionConfig: {
          __typename?: "ManagedIngestionConfig";
        } & Pick<Types.ManagedIngestionConfig, "enabled">;
        visualConfig: { __typename?: "VisualConfig" } & Pick<
          Types.VisualConfig,
          "logoUrl" | "faviconUrl" | "showFullTitleInLineage"
        > & {
            queriesTab?: Types.Maybe<
              { __typename?: "QueriesTabConfig" } & Pick<
                Types.QueriesTabConfig,
                "queriesTabResultSize"
              >
            >;
            entityProfiles?: Types.Maybe<
              { __typename?: "EntityProfilesConfig" } & {
                domain?: Types.Maybe<
                  { __typename?: "EntityProfileConfig" } & Pick<
                    Types.EntityProfileConfig,
                    "defaultTab"
                  >
                >;
              }
            >;
            searchResult?: Types.Maybe<
              { __typename?: "SearchResultsVisualConfig" } & Pick<
                Types.SearchResultsVisualConfig,
                "enableNameHighlight"
              >
            >;
            theme?: Types.Maybe<
              { __typename?: "ThemeConfig" } & Pick<
                Types.ThemeConfig,
                "themeId"
              >
            >;
            application?: Types.Maybe<
              { __typename?: "ApplicationConfig" } & Pick<
                Types.ApplicationConfig,
                "showSidebarSectionWhenEmpty" | "showApplicationInNavigation"
              >
            >;
          };
        telemetryConfig: { __typename?: "TelemetryConfig" } & Pick<
          Types.TelemetryConfig,
          "enableThirdPartyLogging"
        >;
        testsConfig: { __typename?: "TestsConfig" } & Pick<
          Types.TestsConfig,
          "enabled"
        >;
        viewsConfig: { __typename?: "ViewsConfig" } & Pick<
          Types.ViewsConfig,
          "enabled"
        >;
        searchBarConfig: { __typename?: "SearchBarConfig" } & Pick<
          Types.SearchBarConfig,
          "apiVariant"
        >;
        searchCardConfig: { __typename?: "SearchCardConfig" } & Pick<
          Types.SearchCardConfig,
          "showDescription"
        >;
        searchFlagsConfig: { __typename?: "SearchFlagsConfig" } & Pick<
          Types.SearchFlagsConfig,
          "defaultSkipHighlighting"
        >;
        homePageConfig: { __typename?: "HomePageConfig" } & Pick<
          Types.HomePageConfig,
          "firstInPersonalSidebar"
        >;
        featureFlags: { __typename?: "FeatureFlagsConfig" } & Pick<
          Types.FeatureFlagsConfig,
          | "readOnlyModeEnabled"
          | "showSearchFiltersV2"
          | "showBrowseV2"
          | "showAcrylInfo"
          | "erModelRelationshipFeatureEnabled"
          | "showAccessManagement"
          | "nestedDomainsEnabled"
          | "platformBrowseV2"
          | "businessAttributeEntityEnabled"
          | "dataContractsEnabled"
          | "editableDatasetNameEnabled"
          | "themeV2Enabled"
          | "themeV2Default"
          | "themeV2Toggleable"
          | "lineageGraphV2"
          | "showSeparateSiblings"
          | "showManageStructuredProperties"
          | "schemaFieldCLLEnabled"
          | "hideDbtSourceInLineage"
          | "schemaFieldLineageIgnoreStatus"
          | "showNavBarRedesign"
          | "showAutoCompleteResults"
          | "entityVersioningEnabled"
          | "showHasSiblingsFilter"
          | "showSearchBarAutocompleteRedesign"
          | "showManageTags"
          | "showIntroducePage"
          | "showIngestionPageRedesign"
          | "showLineageExpandMore"
          | "showStatsTabRedesign"
          | "showHomePageRedesign"
          | "showDefaultExternalLinks"
          | "showProductUpdates"
          | "lineageGraphV3"
          | "logicalModelsEnabled"
          | "showHomepageUserRole"
          | "assetSummaryPageV1"
          | "documentationFileUploadV1"
        >;
        chromeExtensionConfig: { __typename?: "ChromeExtensionConfig" } & Pick<
          Types.ChromeExtensionConfig,
          "enabled" | "lineageEnabled"
        >;
      }
  >;
};

export type GetEntityCountsQueryVariables = Types.Exact<{
  input?: Types.Maybe<Types.EntityCountInput>;
}>;

export type GetEntityCountsQuery = { __typename?: "Query" } & {
  getEntityCounts?: Types.Maybe<
    { __typename?: "EntityCountResults" } & {
      counts?: Types.Maybe<
        Array<
          { __typename?: "EntityCountResult" } & Pick<
            Types.EntityCountResult,
            "entityType" | "count"
          >
        >
      >;
    }
  >;
};

export type GetGlobalViewsSettingsQueryVariables = Types.Exact<{
  [key: string]: never;
}>;

export type GetGlobalViewsSettingsQuery = { __typename?: "Query" } & {
  globalViewsSettings?: Types.Maybe<
    { __typename?: "GlobalViewsSettings" } & Pick<
      Types.GlobalViewsSettings,
      "defaultView"
    >
  >;
};

export type GetDocPropagationSettingsQueryVariables = Types.Exact<{
  [key: string]: never;
}>;

export type GetDocPropagationSettingsQuery = { __typename?: "Query" } & {
  docPropagationSettings?: Types.Maybe<
    { __typename?: "DocPropagationSettings" } & Pick<
      Types.DocPropagationSettings,
      "docColumnPropagation"
    >
  >;
};

export type GetHomePageSettingsQueryVariables = Types.Exact<{
  [key: string]: never;
}>;

export type GetHomePageSettingsQuery = { __typename?: "Query" } & {
  globalHomePageSettings?: Types.Maybe<
    { __typename?: "GlobalHomePageSettings" } & {
      defaultTemplate?: Types.Maybe<
        { __typename?: "DataHubPageTemplate" } & PageTemplateFragment
      >;
    }
  >;
};

export type GetPresignedUploadUrlQueryVariables = Types.Exact<{
  input: Types.GetPresignedUploadUrlInput;
}>;

export type GetPresignedUploadUrlQuery = { __typename?: "Query" } & {
  getPresignedUploadUrl: {
    __typename?: "GetPresignedUploadUrlResponse";
  } & Pick<Types.GetPresignedUploadUrlResponse, "url" | "fileId">;
};

export type CreateDataHubFileMutationVariables = Types.Exact<{
  input: Types.CreateDataHubFileInput;
}>;

export type CreateDataHubFileMutation = { __typename?: "Mutation" } & {
  createDataHubFile: { __typename?: "CreateDataHubFileResponse" } & {
    file: { __typename?: "DataHubFile" } & Pick<Types.DataHubFile, "urn">;
  };
};

export type UpdateGlobalViewsSettingsMutationVariables = Types.Exact<{
  input: Types.UpdateGlobalViewsSettingsInput;
}>;

export type UpdateGlobalViewsSettingsMutation = {
  __typename?: "Mutation";
} & Pick<Types.Mutation, "updateGlobalViewsSettings">;

export type UpdateDocPropagationSettingsMutationVariables = Types.Exact<{
  input: Types.UpdateDocPropagationSettingsInput;
}>;

export type UpdateDocPropagationSettingsMutation = {
  __typename?: "Mutation";
} & Pick<Types.Mutation, "updateDocPropagationSettings">;

export type UpdateApplicationsSettingsMutationVariables = Types.Exact<{
  input: Types.UpdateApplicationsSettingsInput;
}>;

export type UpdateApplicationsSettingsMutation = {
  __typename?: "Mutation";
} & Pick<Types.Mutation, "updateApplicationsSettings">;

export type GetLatestProductUpdateQueryVariables = Types.Exact<{
  [key: string]: never;
}>;

export type GetLatestProductUpdateQuery = { __typename?: "Query" } & {
  latestProductUpdate?: Types.Maybe<
    { __typename?: "ProductUpdate" } & Pick<
      Types.ProductUpdate,
      | "enabled"
      | "id"
      | "title"
      | "description"
      | "image"
      | "ctaText"
      | "ctaLink"
    >
  >;
};

export const AppConfigDocument = gql`
  query appConfig {
    appConfig {
      appVersion
      policiesConfig {
        enabled
        platformPrivileges {
          type
          displayName
          description
        }
        resourcePrivileges {
          resourceType
          resourceTypeDisplayName
          entityType
          privileges {
            type
            displayName
            description
          }
        }
      }
      analyticsConfig {
        enabled
      }
      authConfig {
        tokenAuthEnabled
      }
      identityManagementConfig {
        enabled
      }
      lineageConfig {
        supportsImpactAnalysis
      }
      managedIngestionConfig {
        enabled
      }
      visualConfig {
        logoUrl
        faviconUrl
        showFullTitleInLineage
        queriesTab {
          queriesTabResultSize
        }
        entityProfiles {
          domain {
            defaultTab
          }
        }
        searchResult {
          enableNameHighlight
        }
        theme {
          themeId
        }
        application {
          showSidebarSectionWhenEmpty
          showApplicationInNavigation
        }
      }
      telemetryConfig {
        enableThirdPartyLogging
      }
      testsConfig {
        enabled
      }
      viewsConfig {
        enabled
      }
      searchBarConfig {
        apiVariant
      }
      searchCardConfig {
        showDescription
      }
      searchFlagsConfig {
        defaultSkipHighlighting
      }
      homePageConfig {
        firstInPersonalSidebar
      }
      featureFlags {
        readOnlyModeEnabled
        showSearchFiltersV2
        showBrowseV2
        showAcrylInfo
        erModelRelationshipFeatureEnabled
        showAccessManagement
        nestedDomainsEnabled
        platformBrowseV2
        businessAttributeEntityEnabled
        dataContractsEnabled
        editableDatasetNameEnabled
        themeV2Enabled
        themeV2Default
        themeV2Toggleable
        lineageGraphV2
        showSeparateSiblings
        showManageStructuredProperties
        schemaFieldCLLEnabled
        hideDbtSourceInLineage
        schemaFieldLineageIgnoreStatus
        showNavBarRedesign
        showAutoCompleteResults
        entityVersioningEnabled
        showHasSiblingsFilter
        showSearchBarAutocompleteRedesign
        showManageTags
        showIntroducePage
        showIngestionPageRedesign
        showLineageExpandMore
        showStatsTabRedesign
        showHomePageRedesign
        showDefaultExternalLinks
        showProductUpdates
        lineageGraphV3
        logicalModelsEnabled
        showHomepageUserRole
        assetSummaryPageV1
        documentationFileUploadV1
      }
      chromeExtensionConfig {
        enabled
        lineageEnabled
      }
    }
  }
`;

/**
 * __useAppConfigQuery__
 *
 * To run a query within a React component, call `useAppConfigQuery` and pass it any options that fit your needs.
 * When your component renders, `useAppConfigQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useAppConfigQuery({
 *   variables: {
 *   },
 * });
 */
export function useAppConfigQuery(
  baseOptions?: Apollo.QueryHookOptions<
    AppConfigQuery,
    AppConfigQueryVariables
  >,
) {
  return Apollo.useQuery<AppConfigQuery, AppConfigQueryVariables>(
    AppConfigDocument,
    baseOptions,
  );
}
export function useAppConfigLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    AppConfigQuery,
    AppConfigQueryVariables
  >,
) {
  return Apollo.useLazyQuery<AppConfigQuery, AppConfigQueryVariables>(
    AppConfigDocument,
    baseOptions,
  );
}
export type AppConfigQueryHookResult = ReturnType<typeof useAppConfigQuery>;
export type AppConfigLazyQueryHookResult = ReturnType<
  typeof useAppConfigLazyQuery
>;
export type AppConfigQueryResult = Apollo.QueryResult<
  AppConfigQuery,
  AppConfigQueryVariables
>;
export const GetEntityCountsDocument = gql`
  query getEntityCounts($input: EntityCountInput) {
    getEntityCounts(input: $input) {
      counts {
        entityType
        count
      }
    }
  }
`;

/**
 * __useGetEntityCountsQuery__
 *
 * To run a query within a React component, call `useGetEntityCountsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetEntityCountsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetEntityCountsQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useGetEntityCountsQuery(
  baseOptions?: Apollo.QueryHookOptions<
    GetEntityCountsQuery,
    GetEntityCountsQueryVariables
  >,
) {
  return Apollo.useQuery<GetEntityCountsQuery, GetEntityCountsQueryVariables>(
    GetEntityCountsDocument,
    baseOptions,
  );
}
export function useGetEntityCountsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetEntityCountsQuery,
    GetEntityCountsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetEntityCountsQuery,
    GetEntityCountsQueryVariables
  >(GetEntityCountsDocument, baseOptions);
}
export type GetEntityCountsQueryHookResult = ReturnType<
  typeof useGetEntityCountsQuery
>;
export type GetEntityCountsLazyQueryHookResult = ReturnType<
  typeof useGetEntityCountsLazyQuery
>;
export type GetEntityCountsQueryResult = Apollo.QueryResult<
  GetEntityCountsQuery,
  GetEntityCountsQueryVariables
>;
export const GetGlobalViewsSettingsDocument = gql`
  query getGlobalViewsSettings {
    globalViewsSettings {
      defaultView
    }
  }
`;

/**
 * __useGetGlobalViewsSettingsQuery__
 *
 * To run a query within a React component, call `useGetGlobalViewsSettingsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetGlobalViewsSettingsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetGlobalViewsSettingsQuery({
 *   variables: {
 *   },
 * });
 */
export function useGetGlobalViewsSettingsQuery(
  baseOptions?: Apollo.QueryHookOptions<
    GetGlobalViewsSettingsQuery,
    GetGlobalViewsSettingsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetGlobalViewsSettingsQuery,
    GetGlobalViewsSettingsQueryVariables
  >(GetGlobalViewsSettingsDocument, baseOptions);
}
export function useGetGlobalViewsSettingsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetGlobalViewsSettingsQuery,
    GetGlobalViewsSettingsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetGlobalViewsSettingsQuery,
    GetGlobalViewsSettingsQueryVariables
  >(GetGlobalViewsSettingsDocument, baseOptions);
}
export type GetGlobalViewsSettingsQueryHookResult = ReturnType<
  typeof useGetGlobalViewsSettingsQuery
>;
export type GetGlobalViewsSettingsLazyQueryHookResult = ReturnType<
  typeof useGetGlobalViewsSettingsLazyQuery
>;
export type GetGlobalViewsSettingsQueryResult = Apollo.QueryResult<
  GetGlobalViewsSettingsQuery,
  GetGlobalViewsSettingsQueryVariables
>;
export const GetDocPropagationSettingsDocument = gql`
  query getDocPropagationSettings {
    docPropagationSettings {
      docColumnPropagation
    }
  }
`;

/**
 * __useGetDocPropagationSettingsQuery__
 *
 * To run a query within a React component, call `useGetDocPropagationSettingsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDocPropagationSettingsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDocPropagationSettingsQuery({
 *   variables: {
 *   },
 * });
 */
export function useGetDocPropagationSettingsQuery(
  baseOptions?: Apollo.QueryHookOptions<
    GetDocPropagationSettingsQuery,
    GetDocPropagationSettingsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetDocPropagationSettingsQuery,
    GetDocPropagationSettingsQueryVariables
  >(GetDocPropagationSettingsDocument, baseOptions);
}
export function useGetDocPropagationSettingsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDocPropagationSettingsQuery,
    GetDocPropagationSettingsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetDocPropagationSettingsQuery,
    GetDocPropagationSettingsQueryVariables
  >(GetDocPropagationSettingsDocument, baseOptions);
}
export type GetDocPropagationSettingsQueryHookResult = ReturnType<
  typeof useGetDocPropagationSettingsQuery
>;
export type GetDocPropagationSettingsLazyQueryHookResult = ReturnType<
  typeof useGetDocPropagationSettingsLazyQuery
>;
export type GetDocPropagationSettingsQueryResult = Apollo.QueryResult<
  GetDocPropagationSettingsQuery,
  GetDocPropagationSettingsQueryVariables
>;
export const GetHomePageSettingsDocument = gql`
  query getHomePageSettings {
    globalHomePageSettings {
      defaultTemplate {
        ...PageTemplate
      }
    }
  }
  ${PageTemplateFragmentDoc}
`;

/**
 * __useGetHomePageSettingsQuery__
 *
 * To run a query within a React component, call `useGetHomePageSettingsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetHomePageSettingsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetHomePageSettingsQuery({
 *   variables: {
 *   },
 * });
 */
export function useGetHomePageSettingsQuery(
  baseOptions?: Apollo.QueryHookOptions<
    GetHomePageSettingsQuery,
    GetHomePageSettingsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetHomePageSettingsQuery,
    GetHomePageSettingsQueryVariables
  >(GetHomePageSettingsDocument, baseOptions);
}
export function useGetHomePageSettingsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetHomePageSettingsQuery,
    GetHomePageSettingsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetHomePageSettingsQuery,
    GetHomePageSettingsQueryVariables
  >(GetHomePageSettingsDocument, baseOptions);
}
export type GetHomePageSettingsQueryHookResult = ReturnType<
  typeof useGetHomePageSettingsQuery
>;
export type GetHomePageSettingsLazyQueryHookResult = ReturnType<
  typeof useGetHomePageSettingsLazyQuery
>;
export type GetHomePageSettingsQueryResult = Apollo.QueryResult<
  GetHomePageSettingsQuery,
  GetHomePageSettingsQueryVariables
>;
export const GetPresignedUploadUrlDocument = gql`
  query getPresignedUploadUrl($input: GetPresignedUploadUrlInput!) {
    getPresignedUploadUrl(input: $input) {
      url
      fileId
    }
  }
`;

/**
 * __useGetPresignedUploadUrlQuery__
 *
 * To run a query within a React component, call `useGetPresignedUploadUrlQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetPresignedUploadUrlQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetPresignedUploadUrlQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useGetPresignedUploadUrlQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetPresignedUploadUrlQuery,
    GetPresignedUploadUrlQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetPresignedUploadUrlQuery,
    GetPresignedUploadUrlQueryVariables
  >(GetPresignedUploadUrlDocument, baseOptions);
}
export function useGetPresignedUploadUrlLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetPresignedUploadUrlQuery,
    GetPresignedUploadUrlQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetPresignedUploadUrlQuery,
    GetPresignedUploadUrlQueryVariables
  >(GetPresignedUploadUrlDocument, baseOptions);
}
export type GetPresignedUploadUrlQueryHookResult = ReturnType<
  typeof useGetPresignedUploadUrlQuery
>;
export type GetPresignedUploadUrlLazyQueryHookResult = ReturnType<
  typeof useGetPresignedUploadUrlLazyQuery
>;
export type GetPresignedUploadUrlQueryResult = Apollo.QueryResult<
  GetPresignedUploadUrlQuery,
  GetPresignedUploadUrlQueryVariables
>;
export const CreateDataHubFileDocument = gql`
  mutation createDataHubFile($input: CreateDataHubFileInput!) {
    createDataHubFile(input: $input) {
      file {
        urn
      }
    }
  }
`;
export type CreateDataHubFileMutationFn = Apollo.MutationFunction<
  CreateDataHubFileMutation,
  CreateDataHubFileMutationVariables
>;

/**
 * __useCreateDataHubFileMutation__
 *
 * To run a mutation, you first call `useCreateDataHubFileMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useCreateDataHubFileMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [createDataHubFileMutation, { data, loading, error }] = useCreateDataHubFileMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useCreateDataHubFileMutation(
  baseOptions?: Apollo.MutationHookOptions<
    CreateDataHubFileMutation,
    CreateDataHubFileMutationVariables
  >,
) {
  return Apollo.useMutation<
    CreateDataHubFileMutation,
    CreateDataHubFileMutationVariables
  >(CreateDataHubFileDocument, baseOptions);
}
export type CreateDataHubFileMutationHookResult = ReturnType<
  typeof useCreateDataHubFileMutation
>;
export type CreateDataHubFileMutationResult =
  Apollo.MutationResult<CreateDataHubFileMutation>;
export type CreateDataHubFileMutationOptions = Apollo.BaseMutationOptions<
  CreateDataHubFileMutation,
  CreateDataHubFileMutationVariables
>;
export const UpdateGlobalViewsSettingsDocument = gql`
  mutation updateGlobalViewsSettings($input: UpdateGlobalViewsSettingsInput!) {
    updateGlobalViewsSettings(input: $input)
  }
`;
export type UpdateGlobalViewsSettingsMutationFn = Apollo.MutationFunction<
  UpdateGlobalViewsSettingsMutation,
  UpdateGlobalViewsSettingsMutationVariables
>;

/**
 * __useUpdateGlobalViewsSettingsMutation__
 *
 * To run a mutation, you first call `useUpdateGlobalViewsSettingsMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateGlobalViewsSettingsMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateGlobalViewsSettingsMutation, { data, loading, error }] = useUpdateGlobalViewsSettingsMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateGlobalViewsSettingsMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateGlobalViewsSettingsMutation,
    UpdateGlobalViewsSettingsMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateGlobalViewsSettingsMutation,
    UpdateGlobalViewsSettingsMutationVariables
  >(UpdateGlobalViewsSettingsDocument, baseOptions);
}
export type UpdateGlobalViewsSettingsMutationHookResult = ReturnType<
  typeof useUpdateGlobalViewsSettingsMutation
>;
export type UpdateGlobalViewsSettingsMutationResult =
  Apollo.MutationResult<UpdateGlobalViewsSettingsMutation>;
export type UpdateGlobalViewsSettingsMutationOptions =
  Apollo.BaseMutationOptions<
    UpdateGlobalViewsSettingsMutation,
    UpdateGlobalViewsSettingsMutationVariables
  >;
export const UpdateDocPropagationSettingsDocument = gql`
  mutation updateDocPropagationSettings(
    $input: UpdateDocPropagationSettingsInput!
  ) {
    updateDocPropagationSettings(input: $input)
  }
`;
export type UpdateDocPropagationSettingsMutationFn = Apollo.MutationFunction<
  UpdateDocPropagationSettingsMutation,
  UpdateDocPropagationSettingsMutationVariables
>;

/**
 * __useUpdateDocPropagationSettingsMutation__
 *
 * To run a mutation, you first call `useUpdateDocPropagationSettingsMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateDocPropagationSettingsMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateDocPropagationSettingsMutation, { data, loading, error }] = useUpdateDocPropagationSettingsMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateDocPropagationSettingsMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateDocPropagationSettingsMutation,
    UpdateDocPropagationSettingsMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateDocPropagationSettingsMutation,
    UpdateDocPropagationSettingsMutationVariables
  >(UpdateDocPropagationSettingsDocument, baseOptions);
}
export type UpdateDocPropagationSettingsMutationHookResult = ReturnType<
  typeof useUpdateDocPropagationSettingsMutation
>;
export type UpdateDocPropagationSettingsMutationResult =
  Apollo.MutationResult<UpdateDocPropagationSettingsMutation>;
export type UpdateDocPropagationSettingsMutationOptions =
  Apollo.BaseMutationOptions<
    UpdateDocPropagationSettingsMutation,
    UpdateDocPropagationSettingsMutationVariables
  >;
export const UpdateApplicationsSettingsDocument = gql`
  mutation updateApplicationsSettings(
    $input: UpdateApplicationsSettingsInput!
  ) {
    updateApplicationsSettings(input: $input)
  }
`;
export type UpdateApplicationsSettingsMutationFn = Apollo.MutationFunction<
  UpdateApplicationsSettingsMutation,
  UpdateApplicationsSettingsMutationVariables
>;

/**
 * __useUpdateApplicationsSettingsMutation__
 *
 * To run a mutation, you first call `useUpdateApplicationsSettingsMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateApplicationsSettingsMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateApplicationsSettingsMutation, { data, loading, error }] = useUpdateApplicationsSettingsMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateApplicationsSettingsMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateApplicationsSettingsMutation,
    UpdateApplicationsSettingsMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateApplicationsSettingsMutation,
    UpdateApplicationsSettingsMutationVariables
  >(UpdateApplicationsSettingsDocument, baseOptions);
}
export type UpdateApplicationsSettingsMutationHookResult = ReturnType<
  typeof useUpdateApplicationsSettingsMutation
>;
export type UpdateApplicationsSettingsMutationResult =
  Apollo.MutationResult<UpdateApplicationsSettingsMutation>;
export type UpdateApplicationsSettingsMutationOptions =
  Apollo.BaseMutationOptions<
    UpdateApplicationsSettingsMutation,
    UpdateApplicationsSettingsMutationVariables
  >;
export const GetLatestProductUpdateDocument = gql`
  query getLatestProductUpdate {
    latestProductUpdate {
      enabled
      id
      title
      description
      image
      ctaText
      ctaLink
    }
  }
`;

/**
 * __useGetLatestProductUpdateQuery__
 *
 * To run a query within a React component, call `useGetLatestProductUpdateQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetLatestProductUpdateQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetLatestProductUpdateQuery({
 *   variables: {
 *   },
 * });
 */
export function useGetLatestProductUpdateQuery(
  baseOptions?: Apollo.QueryHookOptions<
    GetLatestProductUpdateQuery,
    GetLatestProductUpdateQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetLatestProductUpdateQuery,
    GetLatestProductUpdateQueryVariables
  >(GetLatestProductUpdateDocument, baseOptions);
}
export function useGetLatestProductUpdateLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetLatestProductUpdateQuery,
    GetLatestProductUpdateQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetLatestProductUpdateQuery,
    GetLatestProductUpdateQueryVariables
  >(GetLatestProductUpdateDocument, baseOptions);
}
export type GetLatestProductUpdateQueryHookResult = ReturnType<
  typeof useGetLatestProductUpdateQuery
>;
export type GetLatestProductUpdateLazyQueryHookResult = ReturnType<
  typeof useGetLatestProductUpdateLazyQuery
>;
export type GetLatestProductUpdateQueryResult = Apollo.QueryResult<
  GetLatestProductUpdateQuery,
  GetLatestProductUpdateQueryVariables
>;
