/* eslint-disable */
import * as Types from "../types.generated";

import {
  EntityDisplayNameFields_AccessTokenMetadata_Fragment,
  EntityDisplayNameFields_Application_Fragment,
  EntityDisplayNameFields_Assertion_Fragment,
  EntityDisplayNameFields_BusinessAttribute_Fragment,
  EntityDisplayNameFields_Chart_Fragment,
  EntityDisplayNameFields_Container_Fragment,
  EntityDisplayNameFields_CorpGroup_Fragment,
  EntityDisplayNameFields_CorpUser_Fragment,
  EntityDisplayNameFields_Dashboard_Fragment,
  EntityDisplayNameFields_DataContract_Fragment,
  EntityDisplayNameFields_DataFlow_Fragment,
  EntityDisplayNameFields_DataHubConnection_Fragment,
  EntityDisplayNameFields_DataHubFile_Fragment,
  EntityDisplayNameFields_DataHubPageModule_Fragment,
  EntityDisplayNameFields_DataHubPageTemplate_Fragment,
  EntityDisplayNameFields_DataHubPolicy_Fragment,
  EntityDisplayNameFields_DataHubRole_Fragment,
  EntityDisplayNameFields_DataHubView_Fragment,
  EntityDisplayNameFields_DataJob_Fragment,
  EntityDisplayNameFields_DataPlatform_Fragment,
  EntityDisplayNameFields_DataPlatformInstance_Fragment,
  EntityDisplayNameFields_DataProcessInstance_Fragment,
  EntityDisplayNameFields_DataProduct_Fragment,
  EntityDisplayNameFields_DataTypeEntity_Fragment,
  EntityDisplayNameFields_Dataset_Fragment,
  EntityDisplayNameFields_Domain_Fragment,
  EntityDisplayNameFields_ErModelRelationship_Fragment,
  EntityDisplayNameFields_EntityTypeEntity_Fragment,
  EntityDisplayNameFields_ExecutionRequest_Fragment,
  EntityDisplayNameFields_Form_Fragment,
  EntityDisplayNameFields_GlossaryNode_Fragment,
  EntityDisplayNameFields_GlossaryTerm_Fragment,
  EntityDisplayNameFields_Incident_Fragment,
  EntityDisplayNameFields_MlFeature_Fragment,
  EntityDisplayNameFields_MlFeatureTable_Fragment,
  EntityDisplayNameFields_MlModel_Fragment,
  EntityDisplayNameFields_MlModelGroup_Fragment,
  EntityDisplayNameFields_MlPrimaryKey_Fragment,
  EntityDisplayNameFields_Notebook_Fragment,
  EntityDisplayNameFields_OwnershipTypeEntity_Fragment,
  EntityDisplayNameFields_Post_Fragment,
  EntityDisplayNameFields_QueryEntity_Fragment,
  EntityDisplayNameFields_Restricted_Fragment,
  EntityDisplayNameFields_Role_Fragment,
  EntityDisplayNameFields_SchemaFieldEntity_Fragment,
  EntityDisplayNameFields_StructuredPropertyEntity_Fragment,
  EntityDisplayNameFields_Tag_Fragment,
  EntityDisplayNameFields_Test_Fragment,
  EntityDisplayNameFields_VersionSet_Fragment,
  EntityDisplayNameFields_VersionedDataset_Fragment,
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
  NonConflictingPlatformFieldsFragment,
  DisplayPropertiesFieldsFragment,
  ParentDomainsFieldsFragment,
  DomainEntitiesFieldsFragment,
  NonRecursiveMlFeatureTableFragment,
  NonRecursiveMlFeatureFragment,
  NonRecursiveMlPrimaryKeyFragment,
  ErmodelrelationPropertiesFieldsFragment,
  ErmodelrelationEditablePropertiesFieldsFragment,
  SchemaMetadataFieldsFragment,
} from "./fragments.generated";
import { gql } from "@apollo/client";
import {
  EntityDisplayNameFieldsFragmentDoc,
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
  NonConflictingPlatformFieldsFragmentDoc,
  DisplayPropertiesFieldsFragmentDoc,
  ParentDomainsFieldsFragmentDoc,
  DomainEntitiesFieldsFragmentDoc,
  NonRecursiveMlFeatureTableFragmentDoc,
  NonRecursiveMlFeatureFragmentDoc,
  NonRecursiveMlPrimaryKeyFragmentDoc,
  ErmodelrelationPropertiesFieldsFragmentDoc,
  ErmodelrelationEditablePropertiesFieldsFragmentDoc,
  SchemaMetadataFieldsFragmentDoc,
} from "./fragments.generated";
import * as Apollo from "@apollo/client";
export type VersionPropertiesFragment = {
  __typename?: "VersionProperties";
} & Pick<Types.VersionProperties, "isLatest" | "comment"> & {
    versionSet: { __typename?: "VersionSet" } & Pick<
      Types.VersionSet,
      "urn" | "type"
    >;
    version: { __typename?: "VersionTag" } & Pick<
      Types.VersionTag,
      "versionTag"
    >;
    aliases: Array<
      { __typename?: "VersionTag" } & Pick<Types.VersionTag, "versionTag">
    >;
    created?: Types.Maybe<
      { __typename?: "ResolvedAuditStamp" } & Pick<
        Types.ResolvedAuditStamp,
        "time"
      > & {
          actor?: Types.Maybe<
            { __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn"> & {
                editableProperties?: Types.Maybe<
                  { __typename?: "CorpUserEditableProperties" } & Pick<
                    Types.CorpUserEditableProperties,
                    "displayName" | "pictureLink"
                  >
                >;
              } & EntityDisplayNameFields_CorpUser_Fragment
          >;
        }
    >;
    createdInSource?: Types.Maybe<
      { __typename?: "ResolvedAuditStamp" } & Pick<
        Types.ResolvedAuditStamp,
        "time"
      > & {
          actor?: Types.Maybe<
            { __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn"> & {
                editableProperties?: Types.Maybe<
                  { __typename?: "CorpUserEditableProperties" } & Pick<
                    Types.CorpUserEditableProperties,
                    "displayName" | "pictureLink"
                  >
                >;
              } & EntityDisplayNameFields_CorpUser_Fragment
          >;
        }
    >;
  };

export type VersionsSearchResultsFragment = {
  __typename?: "SearchResults";
} & Pick<Types.SearchResults, "count" | "total"> & {
    searchResults: Array<
      { __typename?: "SearchResult" } & {
        entity:
          | ({ __typename?: "AccessTokenMetadata" } & Pick<
              Types.AccessTokenMetadata,
              "urn" | "type"
            >)
          | ({ __typename?: "Application" } & Pick<
              Types.Application,
              "urn" | "type"
            >)
          | ({ __typename?: "Assertion" } & Pick<
              Types.Assertion,
              "urn" | "type"
            >)
          | ({ __typename?: "BusinessAttribute" } & Pick<
              Types.BusinessAttribute,
              "urn" | "type"
            >)
          | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type">)
          | ({ __typename?: "Container" } & Pick<
              Types.Container,
              "urn" | "type"
            >)
          | ({ __typename?: "CorpGroup" } & Pick<
              Types.CorpGroup,
              "urn" | "type"
            >)
          | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type">)
          | ({ __typename?: "Dashboard" } & Pick<
              Types.Dashboard,
              "urn" | "type"
            >)
          | ({ __typename?: "DataContract" } & Pick<
              Types.DataContract,
              "urn" | "type"
            >)
          | ({ __typename?: "DataFlow" } & Pick<Types.DataFlow, "urn" | "type">)
          | ({ __typename?: "DataHubConnection" } & Pick<
              Types.DataHubConnection,
              "urn" | "type"
            >)
          | ({ __typename?: "DataHubFile" } & Pick<
              Types.DataHubFile,
              "urn" | "type"
            >)
          | ({ __typename?: "DataHubPageModule" } & Pick<
              Types.DataHubPageModule,
              "urn" | "type"
            >)
          | ({ __typename?: "DataHubPageTemplate" } & Pick<
              Types.DataHubPageTemplate,
              "urn" | "type"
            >)
          | ({ __typename?: "DataHubPolicy" } & Pick<
              Types.DataHubPolicy,
              "urn" | "type"
            >)
          | ({ __typename?: "DataHubRole" } & Pick<
              Types.DataHubRole,
              "urn" | "type"
            >)
          | ({ __typename?: "DataHubView" } & Pick<
              Types.DataHubView,
              "urn" | "type"
            >)
          | ({ __typename?: "DataJob" } & Pick<Types.DataJob, "urn" | "type">)
          | ({ __typename?: "DataPlatform" } & Pick<
              Types.DataPlatform,
              "urn" | "type"
            >)
          | ({ __typename?: "DataPlatformInstance" } & Pick<
              Types.DataPlatformInstance,
              "urn" | "type"
            >)
          | ({ __typename?: "DataProcessInstance" } & Pick<
              Types.DataProcessInstance,
              "urn" | "type"
            >)
          | ({ __typename?: "DataProduct" } & Pick<
              Types.DataProduct,
              "urn" | "type"
            >)
          | ({ __typename?: "DataTypeEntity" } & Pick<
              Types.DataTypeEntity,
              "urn" | "type"
            >)
          | ({ __typename?: "Dataset" } & Pick<
              Types.Dataset,
              "urn" | "type"
            > & {
                versionProperties?: Types.Maybe<
                  {
                    __typename?: "VersionProperties";
                  } & VersionPropertiesFragment
                >;
              })
          | ({ __typename?: "Domain" } & Pick<Types.Domain, "urn" | "type">)
          | ({ __typename?: "ERModelRelationship" } & Pick<
              Types.ErModelRelationship,
              "urn" | "type"
            >)
          | ({ __typename?: "EntityTypeEntity" } & Pick<
              Types.EntityTypeEntity,
              "urn" | "type"
            >)
          | ({ __typename?: "ExecutionRequest" } & Pick<
              Types.ExecutionRequest,
              "urn" | "type"
            >)
          | ({ __typename?: "Form" } & Pick<Types.Form, "urn" | "type">)
          | ({ __typename?: "GlossaryNode" } & Pick<
              Types.GlossaryNode,
              "urn" | "type"
            >)
          | ({ __typename?: "GlossaryTerm" } & Pick<
              Types.GlossaryTerm,
              "urn" | "type"
            >)
          | ({ __typename?: "Incident" } & Pick<Types.Incident, "urn" | "type">)
          | ({ __typename?: "MLFeature" } & Pick<
              Types.MlFeature,
              "urn" | "type"
            >)
          | ({ __typename?: "MLFeatureTable" } & Pick<
              Types.MlFeatureTable,
              "urn" | "type"
            >)
          | ({ __typename?: "MLModel" } & Pick<
              Types.MlModel,
              "urn" | "type"
            > & {
                versionProperties?: Types.Maybe<
                  {
                    __typename?: "VersionProperties";
                  } & VersionPropertiesFragment
                >;
              })
          | ({ __typename?: "MLModelGroup" } & Pick<
              Types.MlModelGroup,
              "urn" | "type"
            >)
          | ({ __typename?: "MLPrimaryKey" } & Pick<
              Types.MlPrimaryKey,
              "urn" | "type"
            >)
          | ({ __typename?: "Notebook" } & Pick<Types.Notebook, "urn" | "type">)
          | ({ __typename?: "OwnershipTypeEntity" } & Pick<
              Types.OwnershipTypeEntity,
              "urn" | "type"
            >)
          | ({ __typename?: "Post" } & Pick<Types.Post, "urn" | "type">)
          | ({ __typename?: "QueryEntity" } & Pick<
              Types.QueryEntity,
              "urn" | "type"
            >)
          | ({ __typename?: "Restricted" } & Pick<
              Types.Restricted,
              "urn" | "type"
            >)
          | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type">)
          | ({ __typename?: "SchemaFieldEntity" } & Pick<
              Types.SchemaFieldEntity,
              "urn" | "type"
            >)
          | ({ __typename?: "StructuredPropertyEntity" } & Pick<
              Types.StructuredPropertyEntity,
              "urn" | "type"
            >)
          | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn" | "type">)
          | ({ __typename?: "Test" } & Pick<Types.Test, "urn" | "type">)
          | ({ __typename?: "VersionSet" } & Pick<
              Types.VersionSet,
              "urn" | "type"
            >)
          | ({ __typename?: "VersionedDataset" } & Pick<
              Types.VersionedDataset,
              "urn" | "type"
            >);
      }
    >;
  };

export type EntityProfileVersionProperties_Dataset_Fragment = {
  __typename?: "Dataset";
} & {
  versionProperties?: Types.Maybe<
    { __typename?: "VersionProperties" } & {
      versionSet: { __typename?: "VersionSet" } & Pick<
        Types.VersionSet,
        "urn" | "type"
      > & {
          versionsSearch?: Types.Maybe<
            { __typename?: "SearchResults" } & VersionsSearchResultsFragment
          >;
        };
    } & VersionPropertiesFragment
  >;
};

export type EntityProfileVersionProperties_MlModel_Fragment = {
  __typename?: "MLModel";
} & {
  versionProperties?: Types.Maybe<
    { __typename?: "VersionProperties" } & {
      versionSet: { __typename?: "VersionSet" } & Pick<
        Types.VersionSet,
        "urn" | "type"
      > & {
          versionsSearch?: Types.Maybe<
            { __typename?: "SearchResults" } & VersionsSearchResultsFragment
          >;
        };
    } & VersionPropertiesFragment
  >;
};

export type EntityProfileVersionPropertiesFragment =
  | EntityProfileVersionProperties_Dataset_Fragment
  | EntityProfileVersionProperties_MlModel_Fragment;

export type SearchAcrossVersionsQueryVariables = Types.Exact<{
  versionSetUrn: Types.Scalars["String"];
  input: Types.SearchAcrossEntitiesInput;
}>;

export type SearchAcrossVersionsQuery = { __typename?: "Query" } & {
  versionSet?: Types.Maybe<
    { __typename?: "VersionSet" } & {
      versionsSearch?: Types.Maybe<
        { __typename?: "SearchResults" } & VersionsSearchResultsFragment
      >;
    }
  >;
};

export type LinkAssetVersionMutationVariables = Types.Exact<{
  input: Types.LinkVersionInput;
}>;

export type LinkAssetVersionMutation = { __typename?: "Mutation" } & {
  linkAssetVersion?: Types.Maybe<
    { __typename?: "VersionSet" } & {
      versionsSearch?: Types.Maybe<
        { __typename?: "SearchResults" } & VersionsSearchResultsFragment
      >;
    }
  >;
};

export type UnlinkAssetVersionMutationVariables = Types.Exact<{
  input: Types.UnlinkVersionInput;
}>;

export type UnlinkAssetVersionMutation = { __typename?: "Mutation" } & {
  unlinkAssetVersion?: Types.Maybe<
    { __typename?: "VersionSet" } & {
      versionsSearch?: Types.Maybe<
        { __typename?: "SearchResults" } & VersionsSearchResultsFragment
      >;
    }
  >;
};

export const VersionPropertiesFragmentDoc = gql`
  fragment versionProperties on VersionProperties {
    versionSet {
      urn
      type
    }
    isLatest
    version {
      versionTag
    }
    aliases {
      versionTag
    }
    comment
    created {
      time
      actor {
        urn
        ...entityDisplayNameFields
        editableProperties {
          displayName
          pictureLink
        }
      }
    }
    createdInSource {
      time
      actor {
        urn
        ...entityDisplayNameFields
        editableProperties {
          displayName
          pictureLink
        }
      }
    }
  }
  ${EntityDisplayNameFieldsFragmentDoc}
`;
export const VersionsSearchResultsFragmentDoc = gql`
  fragment versionsSearchResults on SearchResults {
    count
    total
    searchResults {
      entity {
        urn
        type
        ... on SupportsVersions {
          versionProperties {
            ...versionProperties
          }
        }
      }
    }
  }
  ${VersionPropertiesFragmentDoc}
`;
export const EntityProfileVersionPropertiesFragmentDoc = gql`
  fragment entityProfileVersionProperties on SupportsVersions {
    versionProperties {
      ...versionProperties
      versionSet {
        urn
        type
        versionsSearch(
          input: { query: "*", count: 5, searchFlags: { skipCache: true } }
        ) {
          ...versionsSearchResults
        }
      }
    }
  }
  ${VersionPropertiesFragmentDoc}
  ${VersionsSearchResultsFragmentDoc}
`;
export const SearchAcrossVersionsDocument = gql`
  query searchAcrossVersions(
    $versionSetUrn: String!
    $input: SearchAcrossEntitiesInput!
  ) {
    versionSet(urn: $versionSetUrn) {
      versionsSearch(input: $input) {
        ...versionsSearchResults
      }
    }
  }
  ${VersionsSearchResultsFragmentDoc}
`;

/**
 * __useSearchAcrossVersionsQuery__
 *
 * To run a query within a React component, call `useSearchAcrossVersionsQuery` and pass it any options that fit your needs.
 * When your component renders, `useSearchAcrossVersionsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useSearchAcrossVersionsQuery({
 *   variables: {
 *      versionSetUrn: // value for 'versionSetUrn'
 *      input: // value for 'input'
 *   },
 * });
 */
export function useSearchAcrossVersionsQuery(
  baseOptions: Apollo.QueryHookOptions<
    SearchAcrossVersionsQuery,
    SearchAcrossVersionsQueryVariables
  >,
) {
  return Apollo.useQuery<
    SearchAcrossVersionsQuery,
    SearchAcrossVersionsQueryVariables
  >(SearchAcrossVersionsDocument, baseOptions);
}
export function useSearchAcrossVersionsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    SearchAcrossVersionsQuery,
    SearchAcrossVersionsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    SearchAcrossVersionsQuery,
    SearchAcrossVersionsQueryVariables
  >(SearchAcrossVersionsDocument, baseOptions);
}
export type SearchAcrossVersionsQueryHookResult = ReturnType<
  typeof useSearchAcrossVersionsQuery
>;
export type SearchAcrossVersionsLazyQueryHookResult = ReturnType<
  typeof useSearchAcrossVersionsLazyQuery
>;
export type SearchAcrossVersionsQueryResult = Apollo.QueryResult<
  SearchAcrossVersionsQuery,
  SearchAcrossVersionsQueryVariables
>;
export const LinkAssetVersionDocument = gql`
  mutation linkAssetVersion($input: LinkVersionInput!) {
    linkAssetVersion(input: $input) {
      versionsSearch(
        input: { query: "*", count: 5, searchFlags: { skipCache: true } }
      ) {
        ...versionsSearchResults
      }
    }
  }
  ${VersionsSearchResultsFragmentDoc}
`;
export type LinkAssetVersionMutationFn = Apollo.MutationFunction<
  LinkAssetVersionMutation,
  LinkAssetVersionMutationVariables
>;

/**
 * __useLinkAssetVersionMutation__
 *
 * To run a mutation, you first call `useLinkAssetVersionMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useLinkAssetVersionMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [linkAssetVersionMutation, { data, loading, error }] = useLinkAssetVersionMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useLinkAssetVersionMutation(
  baseOptions?: Apollo.MutationHookOptions<
    LinkAssetVersionMutation,
    LinkAssetVersionMutationVariables
  >,
) {
  return Apollo.useMutation<
    LinkAssetVersionMutation,
    LinkAssetVersionMutationVariables
  >(LinkAssetVersionDocument, baseOptions);
}
export type LinkAssetVersionMutationHookResult = ReturnType<
  typeof useLinkAssetVersionMutation
>;
export type LinkAssetVersionMutationResult =
  Apollo.MutationResult<LinkAssetVersionMutation>;
export type LinkAssetVersionMutationOptions = Apollo.BaseMutationOptions<
  LinkAssetVersionMutation,
  LinkAssetVersionMutationVariables
>;
export const UnlinkAssetVersionDocument = gql`
  mutation unlinkAssetVersion($input: UnlinkVersionInput!) {
    unlinkAssetVersion(input: $input) {
      versionsSearch(
        input: { query: "*", count: 5, searchFlags: { skipCache: true } }
      ) {
        ...versionsSearchResults
      }
    }
  }
  ${VersionsSearchResultsFragmentDoc}
`;
export type UnlinkAssetVersionMutationFn = Apollo.MutationFunction<
  UnlinkAssetVersionMutation,
  UnlinkAssetVersionMutationVariables
>;

/**
 * __useUnlinkAssetVersionMutation__
 *
 * To run a mutation, you first call `useUnlinkAssetVersionMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUnlinkAssetVersionMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [unlinkAssetVersionMutation, { data, loading, error }] = useUnlinkAssetVersionMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUnlinkAssetVersionMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UnlinkAssetVersionMutation,
    UnlinkAssetVersionMutationVariables
  >,
) {
  return Apollo.useMutation<
    UnlinkAssetVersionMutation,
    UnlinkAssetVersionMutationVariables
  >(UnlinkAssetVersionDocument, baseOptions);
}
export type UnlinkAssetVersionMutationHookResult = ReturnType<
  typeof useUnlinkAssetVersionMutation
>;
export type UnlinkAssetVersionMutationResult =
  Apollo.MutationResult<UnlinkAssetVersionMutation>;
export type UnlinkAssetVersionMutationOptions = Apollo.BaseMutationOptions<
  UnlinkAssetVersionMutation,
  UnlinkAssetVersionMutationVariables
>;
