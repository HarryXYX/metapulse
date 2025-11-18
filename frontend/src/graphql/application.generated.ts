/* eslint-disable */
import * as Types from "../types.generated";

import {
  EntityPrivilegesFragment,
  AutoRenderAspectFieldsFragment,
  StructuredPropertiesFieldsFragment,
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
  EntityApplicationFragment,
  DeprecationFieldsFragment,
  EmbedFieldsFragment,
  DataPlatformInstanceFieldsFragment,
  EntityHealthFragment,
  BrowsePathV2FieldsFragment,
  ParentContainersFieldsFragment,
  InputFieldsFieldsFragment,
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
  BusinessAttributeFragment,
  DocumentationFieldsFragment,
  StructuredPropertyFieldsFragment,
} from "./fragments.generated";
import { gql } from "@apollo/client";
import {
  EntityPrivilegesFragmentDoc,
  AutoRenderAspectFieldsFragmentDoc,
  StructuredPropertiesFieldsFragmentDoc,
  FormsFieldsFragmentDoc,
  OwnershipFieldsFragmentDoc,
  NotesFragmentDoc,
  EntityDomainFragmentDoc,
  InstitutionalMemoryFieldsFragmentDoc,
  GlobalTagsFieldsFragmentDoc,
  GlossaryTermsFragmentDoc,
  EntityDisplayNameFieldsFragmentDoc,
  PlatformFieldsFragmentDoc,
  EntityDataProductFragmentDoc,
  NonRecursiveDataFlowFieldsFragmentDoc,
  EntityApplicationFragmentDoc,
  DeprecationFieldsFragmentDoc,
  EmbedFieldsFragmentDoc,
  DataPlatformInstanceFieldsFragmentDoc,
  EntityHealthFragmentDoc,
  BrowsePathV2FieldsFragmentDoc,
  ParentContainersFieldsFragmentDoc,
  InputFieldsFieldsFragmentDoc,
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
  BusinessAttributeFragmentDoc,
  DocumentationFieldsFragmentDoc,
  StructuredPropertyFieldsFragmentDoc,
} from "./fragments.generated";
import * as Apollo from "@apollo/client";
export type GetApplicationQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetApplicationQuery = { __typename?: "Query" } & {
  application?: Types.Maybe<
    { __typename?: "Application" } & Pick<Types.Application, "urn" | "type"> & {
        privileges?: Types.Maybe<
          { __typename?: "EntityPrivileges" } & EntityPrivilegesFragment
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
        forms?: Types.Maybe<{ __typename?: "Forms" } & FormsFieldsFragment>;
      } & ApplicationFieldsFragment &
      Notes_Application_Fragment
  >;
};

export type GetApplicationsListQueryVariables = Types.Exact<{
  input: Types.SearchAcrossEntitiesInput;
}>;

export type GetApplicationsListQuery = { __typename?: "Query" } & {
  searchAcrossEntities?: Types.Maybe<
    { __typename?: "SearchResults" } & {
      searchResults: Array<
        { __typename?: "SearchResult" } & {
          entity:
            | { __typename?: "AccessTokenMetadata" }
            | ({ __typename?: "Application" } & Pick<
                Types.Application,
                "urn" | "type"
              > & {
                  properties?: Types.Maybe<
                    { __typename?: "ApplicationProperties" } & Pick<
                      Types.ApplicationProperties,
                      "name" | "description" | "numAssets"
                    >
                  >;
                  domain?: Types.Maybe<
                    { __typename?: "DomainAssociation" } & EntityDomainFragment
                  >;
                })
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
            | { __typename?: "ERModelRelationship" }
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
            | { __typename?: "VersionedDataset" };
        }
      >;
    }
  >;
};

export type ApplicationFieldsFragment = { __typename?: "Application" } & {
  properties?: Types.Maybe<
    { __typename?: "ApplicationProperties" } & {
      customProperties?: Types.Maybe<
        Array<
          { __typename?: "CustomPropertiesEntry" } & Pick<
            Types.CustomPropertiesEntry,
            "key" | "value"
          >
        >
      >;
    }
  >;
  institutionalMemory?: Types.Maybe<
    { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
  >;
} & ApplicationSearchFieldsFragment;

export type ApplicationSearchFieldsFragment = {
  __typename?: "Application";
} & Pick<Types.Application, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "ApplicationProperties" } & Pick<
        Types.ApplicationProperties,
        "name" | "description" | "externalUrl"
      >
    >;
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    tags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
    >;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    children?: Types.Maybe<
      { __typename?: "EntityRelationshipsResult" } & Pick<
        Types.EntityRelationshipsResult,
        "total"
      >
    >;
  };

export type CreateApplicationMutationVariables = Types.Exact<{
  input: Types.CreateApplicationInput;
}>;

export type CreateApplicationMutation = { __typename?: "Mutation" } & {
  createApplication?: Types.Maybe<
    { __typename?: "Application" } & ApplicationSearchFieldsFragment
  >;
};

export type DeleteApplicationMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type DeleteApplicationMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "deleteApplication"
>;

export type BatchSetApplicationMutationVariables = Types.Exact<{
  input: Types.BatchSetApplicationInput;
}>;

export type BatchSetApplicationMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "batchSetApplication"
>;

export const ApplicationSearchFieldsFragmentDoc = gql`
  fragment applicationSearchFields on Application {
    urn
    type
    properties {
      name
      description
      externalUrl
    }
    ownership {
      ...ownershipFields
    }
    tags {
      ...globalTagsFields
    }
    glossaryTerms {
      ...glossaryTerms
    }
    domain {
      ...entityDomain
    }
    children: relationships(
      input: {
        types: ["AssociatedWith"]
        direction: INCOMING
        start: 0
        count: 0
      }
    ) {
      total
    }
  }
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDomainFragmentDoc}
`;
export const ApplicationFieldsFragmentDoc = gql`
  fragment applicationFields on Application {
    ...applicationSearchFields
    properties {
      customProperties {
        key
        value
      }
    }
    institutionalMemory {
      ...institutionalMemoryFields
    }
  }
  ${ApplicationSearchFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
`;
export const GetApplicationDocument = gql`
  query getApplication($urn: String!) {
    application(urn: $urn) {
      urn
      type
      ...applicationFields
      privileges {
        ...entityPrivileges
      }
      autoRenderAspects: aspects(input: { autoRenderOnly: true }) {
        ...autoRenderAspectFields
      }
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
      forms {
        ...formsFields
      }
      ...notes
    }
  }
  ${ApplicationFieldsFragmentDoc}
  ${EntityPrivilegesFragmentDoc}
  ${AutoRenderAspectFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${FormsFieldsFragmentDoc}
  ${NotesFragmentDoc}
`;

/**
 * __useGetApplicationQuery__
 *
 * To run a query within a React component, call `useGetApplicationQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetApplicationQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetApplicationQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetApplicationQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetApplicationQuery,
    GetApplicationQueryVariables
  >,
) {
  return Apollo.useQuery<GetApplicationQuery, GetApplicationQueryVariables>(
    GetApplicationDocument,
    baseOptions,
  );
}
export function useGetApplicationLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetApplicationQuery,
    GetApplicationQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetApplicationQuery, GetApplicationQueryVariables>(
    GetApplicationDocument,
    baseOptions,
  );
}
export type GetApplicationQueryHookResult = ReturnType<
  typeof useGetApplicationQuery
>;
export type GetApplicationLazyQueryHookResult = ReturnType<
  typeof useGetApplicationLazyQuery
>;
export type GetApplicationQueryResult = Apollo.QueryResult<
  GetApplicationQuery,
  GetApplicationQueryVariables
>;
export const GetApplicationsListDocument = gql`
  query getApplicationsList($input: SearchAcrossEntitiesInput!) {
    searchAcrossEntities(input: $input) {
      searchResults {
        entity {
          ... on Application {
            urn
            type
            properties {
              name
              description
              numAssets
            }
            domain {
              ...entityDomain
            }
          }
        }
      }
    }
  }
  ${EntityDomainFragmentDoc}
`;

/**
 * __useGetApplicationsListQuery__
 *
 * To run a query within a React component, call `useGetApplicationsListQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetApplicationsListQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetApplicationsListQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useGetApplicationsListQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetApplicationsListQuery,
    GetApplicationsListQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetApplicationsListQuery,
    GetApplicationsListQueryVariables
  >(GetApplicationsListDocument, baseOptions);
}
export function useGetApplicationsListLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetApplicationsListQuery,
    GetApplicationsListQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetApplicationsListQuery,
    GetApplicationsListQueryVariables
  >(GetApplicationsListDocument, baseOptions);
}
export type GetApplicationsListQueryHookResult = ReturnType<
  typeof useGetApplicationsListQuery
>;
export type GetApplicationsListLazyQueryHookResult = ReturnType<
  typeof useGetApplicationsListLazyQuery
>;
export type GetApplicationsListQueryResult = Apollo.QueryResult<
  GetApplicationsListQuery,
  GetApplicationsListQueryVariables
>;
export const CreateApplicationDocument = gql`
  mutation createApplication($input: CreateApplicationInput!) {
    createApplication(input: $input) {
      ...applicationSearchFields
    }
  }
  ${ApplicationSearchFieldsFragmentDoc}
`;
export type CreateApplicationMutationFn = Apollo.MutationFunction<
  CreateApplicationMutation,
  CreateApplicationMutationVariables
>;

/**
 * __useCreateApplicationMutation__
 *
 * To run a mutation, you first call `useCreateApplicationMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useCreateApplicationMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [createApplicationMutation, { data, loading, error }] = useCreateApplicationMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useCreateApplicationMutation(
  baseOptions?: Apollo.MutationHookOptions<
    CreateApplicationMutation,
    CreateApplicationMutationVariables
  >,
) {
  return Apollo.useMutation<
    CreateApplicationMutation,
    CreateApplicationMutationVariables
  >(CreateApplicationDocument, baseOptions);
}
export type CreateApplicationMutationHookResult = ReturnType<
  typeof useCreateApplicationMutation
>;
export type CreateApplicationMutationResult =
  Apollo.MutationResult<CreateApplicationMutation>;
export type CreateApplicationMutationOptions = Apollo.BaseMutationOptions<
  CreateApplicationMutation,
  CreateApplicationMutationVariables
>;
export const DeleteApplicationDocument = gql`
  mutation deleteApplication($urn: String!) {
    deleteApplication(urn: $urn)
  }
`;
export type DeleteApplicationMutationFn = Apollo.MutationFunction<
  DeleteApplicationMutation,
  DeleteApplicationMutationVariables
>;

/**
 * __useDeleteApplicationMutation__
 *
 * To run a mutation, you first call `useDeleteApplicationMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useDeleteApplicationMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [deleteApplicationMutation, { data, loading, error }] = useDeleteApplicationMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useDeleteApplicationMutation(
  baseOptions?: Apollo.MutationHookOptions<
    DeleteApplicationMutation,
    DeleteApplicationMutationVariables
  >,
) {
  return Apollo.useMutation<
    DeleteApplicationMutation,
    DeleteApplicationMutationVariables
  >(DeleteApplicationDocument, baseOptions);
}
export type DeleteApplicationMutationHookResult = ReturnType<
  typeof useDeleteApplicationMutation
>;
export type DeleteApplicationMutationResult =
  Apollo.MutationResult<DeleteApplicationMutation>;
export type DeleteApplicationMutationOptions = Apollo.BaseMutationOptions<
  DeleteApplicationMutation,
  DeleteApplicationMutationVariables
>;
export const BatchSetApplicationDocument = gql`
  mutation batchSetApplication($input: BatchSetApplicationInput!) {
    batchSetApplication(input: $input)
  }
`;
export type BatchSetApplicationMutationFn = Apollo.MutationFunction<
  BatchSetApplicationMutation,
  BatchSetApplicationMutationVariables
>;

/**
 * __useBatchSetApplicationMutation__
 *
 * To run a mutation, you first call `useBatchSetApplicationMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useBatchSetApplicationMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [batchSetApplicationMutation, { data, loading, error }] = useBatchSetApplicationMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useBatchSetApplicationMutation(
  baseOptions?: Apollo.MutationHookOptions<
    BatchSetApplicationMutation,
    BatchSetApplicationMutationVariables
  >,
) {
  return Apollo.useMutation<
    BatchSetApplicationMutation,
    BatchSetApplicationMutationVariables
  >(BatchSetApplicationDocument, baseOptions);
}
export type BatchSetApplicationMutationHookResult = ReturnType<
  typeof useBatchSetApplicationMutation
>;
export type BatchSetApplicationMutationResult =
  Apollo.MutationResult<BatchSetApplicationMutation>;
export type BatchSetApplicationMutationOptions = Apollo.BaseMutationOptions<
  BatchSetApplicationMutation,
  BatchSetApplicationMutationVariables
>;
