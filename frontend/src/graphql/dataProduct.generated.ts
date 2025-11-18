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
import { AssetSettingsFieldsFragment } from "./settings.generated";
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
import { AssetSettingsFieldsFragmentDoc } from "./settings.generated";
import * as Apollo from "@apollo/client";
export type GetDataProductQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetDataProductQuery = { __typename?: "Query" } & {
  dataProduct?: Types.Maybe<
    { __typename?: "DataProduct" } & Pick<Types.DataProduct, "urn" | "type"> & {
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
        settings?: Types.Maybe<
          { __typename?: "AssetSettings" } & AssetSettingsFieldsFragment
        >;
      } & DataProductFieldsFragment &
      Notes_DataProduct_Fragment
  >;
};

export type GetDataProductsListQueryVariables = Types.Exact<{
  input: Types.SearchAcrossEntitiesInput;
}>;

export type GetDataProductsListQuery = { __typename?: "Query" } & {
  searchAcrossEntities?: Types.Maybe<
    { __typename?: "SearchResults" } & {
      searchResults: Array<
        { __typename?: "SearchResult" } & {
          entity:
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
            | ({ __typename?: "DataProduct" } & Pick<
                Types.DataProduct,
                "urn" | "type"
              > & {
                  properties?: Types.Maybe<
                    { __typename?: "DataProductProperties" } & Pick<
                      Types.DataProductProperties,
                      "name" | "description" | "numAssets"
                    >
                  >;
                  domain?: Types.Maybe<
                    { __typename?: "DomainAssociation" } & EntityDomainFragment
                  >;
                })
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

export type DataProductFieldsFragment = { __typename?: "DataProduct" } & {
  properties?: Types.Maybe<
    { __typename?: "DataProductProperties" } & {
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
} & DataProductSearchFieldsFragment;

export type DataProductSearchFieldsFragment = {
  __typename?: "DataProduct";
} & Pick<Types.DataProduct, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "DataProductProperties" } & Pick<
        Types.DataProductProperties,
        "name" | "description" | "externalUrl"
      > & {
          createdOn?: Types.Maybe<
            { __typename?: "ResolvedAuditStamp" } & Pick<
              Types.ResolvedAuditStamp,
              "time"
            >
          >;
        }
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
    entities?: Types.Maybe<
      { __typename?: "SearchResults" } & Pick<Types.SearchResults, "total">
    >;
  };

export type CreateDataProductMutationVariables = Types.Exact<{
  input: Types.CreateDataProductInput;
}>;

export type CreateDataProductMutation = { __typename?: "Mutation" } & {
  createDataProduct?: Types.Maybe<
    { __typename?: "DataProduct" } & DataProductSearchFieldsFragment
  >;
};

export type UpdateDataProductMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  input: Types.UpdateDataProductInput;
}>;

export type UpdateDataProductMutation = { __typename?: "Mutation" } & {
  updateDataProduct?: Types.Maybe<
    { __typename?: "DataProduct" } & DataProductSearchFieldsFragment
  >;
};

export type DeleteDataProductMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type DeleteDataProductMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "deleteDataProduct"
>;

export type BatchSetDataProductMutationVariables = Types.Exact<{
  input: Types.BatchSetDataProductInput;
}>;

export type BatchSetDataProductMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "batchSetDataProduct"
>;

export const DataProductSearchFieldsFragmentDoc = gql`
  fragment dataProductSearchFields on DataProduct {
    urn
    type
    properties {
      name
      description
      externalUrl
      createdOn {
        time
      }
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
    entities(input: { start: 0, count: 0, query: "*" }) {
      total
    }
  }
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDomainFragmentDoc}
`;
export const DataProductFieldsFragmentDoc = gql`
  fragment dataProductFields on DataProduct {
    ...dataProductSearchFields
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
  ${DataProductSearchFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
`;
export const GetDataProductDocument = gql`
  query getDataProduct($urn: String!) {
    dataProduct(urn: $urn) {
      urn
      type
      ...dataProductFields
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
      settings {
        ...AssetSettingsFields
      }
    }
  }
  ${DataProductFieldsFragmentDoc}
  ${EntityPrivilegesFragmentDoc}
  ${AutoRenderAspectFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${FormsFieldsFragmentDoc}
  ${NotesFragmentDoc}
  ${AssetSettingsFieldsFragmentDoc}
`;

/**
 * __useGetDataProductQuery__
 *
 * To run a query within a React component, call `useGetDataProductQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDataProductQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDataProductQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetDataProductQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDataProductQuery,
    GetDataProductQueryVariables
  >,
) {
  return Apollo.useQuery<GetDataProductQuery, GetDataProductQueryVariables>(
    GetDataProductDocument,
    baseOptions,
  );
}
export function useGetDataProductLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDataProductQuery,
    GetDataProductQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetDataProductQuery, GetDataProductQueryVariables>(
    GetDataProductDocument,
    baseOptions,
  );
}
export type GetDataProductQueryHookResult = ReturnType<
  typeof useGetDataProductQuery
>;
export type GetDataProductLazyQueryHookResult = ReturnType<
  typeof useGetDataProductLazyQuery
>;
export type GetDataProductQueryResult = Apollo.QueryResult<
  GetDataProductQuery,
  GetDataProductQueryVariables
>;
export const GetDataProductsListDocument = gql`
  query getDataProductsList($input: SearchAcrossEntitiesInput!) {
    searchAcrossEntities(input: $input) {
      searchResults {
        entity {
          ... on DataProduct {
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
 * __useGetDataProductsListQuery__
 *
 * To run a query within a React component, call `useGetDataProductsListQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDataProductsListQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDataProductsListQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useGetDataProductsListQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDataProductsListQuery,
    GetDataProductsListQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetDataProductsListQuery,
    GetDataProductsListQueryVariables
  >(GetDataProductsListDocument, baseOptions);
}
export function useGetDataProductsListLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDataProductsListQuery,
    GetDataProductsListQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetDataProductsListQuery,
    GetDataProductsListQueryVariables
  >(GetDataProductsListDocument, baseOptions);
}
export type GetDataProductsListQueryHookResult = ReturnType<
  typeof useGetDataProductsListQuery
>;
export type GetDataProductsListLazyQueryHookResult = ReturnType<
  typeof useGetDataProductsListLazyQuery
>;
export type GetDataProductsListQueryResult = Apollo.QueryResult<
  GetDataProductsListQuery,
  GetDataProductsListQueryVariables
>;
export const CreateDataProductDocument = gql`
  mutation createDataProduct($input: CreateDataProductInput!) {
    createDataProduct(input: $input) {
      ...dataProductSearchFields
    }
  }
  ${DataProductSearchFieldsFragmentDoc}
`;
export type CreateDataProductMutationFn = Apollo.MutationFunction<
  CreateDataProductMutation,
  CreateDataProductMutationVariables
>;

/**
 * __useCreateDataProductMutation__
 *
 * To run a mutation, you first call `useCreateDataProductMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useCreateDataProductMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [createDataProductMutation, { data, loading, error }] = useCreateDataProductMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useCreateDataProductMutation(
  baseOptions?: Apollo.MutationHookOptions<
    CreateDataProductMutation,
    CreateDataProductMutationVariables
  >,
) {
  return Apollo.useMutation<
    CreateDataProductMutation,
    CreateDataProductMutationVariables
  >(CreateDataProductDocument, baseOptions);
}
export type CreateDataProductMutationHookResult = ReturnType<
  typeof useCreateDataProductMutation
>;
export type CreateDataProductMutationResult =
  Apollo.MutationResult<CreateDataProductMutation>;
export type CreateDataProductMutationOptions = Apollo.BaseMutationOptions<
  CreateDataProductMutation,
  CreateDataProductMutationVariables
>;
export const UpdateDataProductDocument = gql`
  mutation updateDataProduct($urn: String!, $input: UpdateDataProductInput!) {
    updateDataProduct(urn: $urn, input: $input) {
      ...dataProductSearchFields
    }
  }
  ${DataProductSearchFieldsFragmentDoc}
`;
export type UpdateDataProductMutationFn = Apollo.MutationFunction<
  UpdateDataProductMutation,
  UpdateDataProductMutationVariables
>;

/**
 * __useUpdateDataProductMutation__
 *
 * To run a mutation, you first call `useUpdateDataProductMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateDataProductMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateDataProductMutation, { data, loading, error }] = useUpdateDataProductMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateDataProductMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateDataProductMutation,
    UpdateDataProductMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateDataProductMutation,
    UpdateDataProductMutationVariables
  >(UpdateDataProductDocument, baseOptions);
}
export type UpdateDataProductMutationHookResult = ReturnType<
  typeof useUpdateDataProductMutation
>;
export type UpdateDataProductMutationResult =
  Apollo.MutationResult<UpdateDataProductMutation>;
export type UpdateDataProductMutationOptions = Apollo.BaseMutationOptions<
  UpdateDataProductMutation,
  UpdateDataProductMutationVariables
>;
export const DeleteDataProductDocument = gql`
  mutation deleteDataProduct($urn: String!) {
    deleteDataProduct(urn: $urn)
  }
`;
export type DeleteDataProductMutationFn = Apollo.MutationFunction<
  DeleteDataProductMutation,
  DeleteDataProductMutationVariables
>;

/**
 * __useDeleteDataProductMutation__
 *
 * To run a mutation, you first call `useDeleteDataProductMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useDeleteDataProductMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [deleteDataProductMutation, { data, loading, error }] = useDeleteDataProductMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useDeleteDataProductMutation(
  baseOptions?: Apollo.MutationHookOptions<
    DeleteDataProductMutation,
    DeleteDataProductMutationVariables
  >,
) {
  return Apollo.useMutation<
    DeleteDataProductMutation,
    DeleteDataProductMutationVariables
  >(DeleteDataProductDocument, baseOptions);
}
export type DeleteDataProductMutationHookResult = ReturnType<
  typeof useDeleteDataProductMutation
>;
export type DeleteDataProductMutationResult =
  Apollo.MutationResult<DeleteDataProductMutation>;
export type DeleteDataProductMutationOptions = Apollo.BaseMutationOptions<
  DeleteDataProductMutation,
  DeleteDataProductMutationVariables
>;
export const BatchSetDataProductDocument = gql`
  mutation batchSetDataProduct($input: BatchSetDataProductInput!) {
    batchSetDataProduct(input: $input)
  }
`;
export type BatchSetDataProductMutationFn = Apollo.MutationFunction<
  BatchSetDataProductMutation,
  BatchSetDataProductMutationVariables
>;

/**
 * __useBatchSetDataProductMutation__
 *
 * To run a mutation, you first call `useBatchSetDataProductMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useBatchSetDataProductMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [batchSetDataProductMutation, { data, loading, error }] = useBatchSetDataProductMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useBatchSetDataProductMutation(
  baseOptions?: Apollo.MutationHookOptions<
    BatchSetDataProductMutation,
    BatchSetDataProductMutationVariables
  >,
) {
  return Apollo.useMutation<
    BatchSetDataProductMutation,
    BatchSetDataProductMutationVariables
  >(BatchSetDataProductDocument, baseOptions);
}
export type BatchSetDataProductMutationHookResult = ReturnType<
  typeof useBatchSetDataProductMutation
>;
export type BatchSetDataProductMutationResult =
  Apollo.MutationResult<BatchSetDataProductMutation>;
export type BatchSetDataProductMutationOptions = Apollo.BaseMutationOptions<
  BatchSetDataProductMutation,
  BatchSetDataProductMutationVariables
>;
