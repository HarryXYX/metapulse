/* eslint-disable */
import * as Types from "../types.generated";

import {
  AssertionDetailsWithRunEventsFragment,
  AssertionRunEventDetailsFragment,
} from "./assertion.generated";
import {
  StructuredPropertiesFieldsFragment,
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
  BusinessAttributeFragment,
  DocumentationFieldsFragment,
  StructuredPropertyFieldsFragment,
} from "./fragments.generated";
import { gql } from "@apollo/client";
import {
  AssertionDetailsWithRunEventsFragmentDoc,
  AssertionRunEventDetailsFragmentDoc,
} from "./assertion.generated";
import {
  StructuredPropertiesFieldsFragmentDoc,
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
  BusinessAttributeFragmentDoc,
  DocumentationFieldsFragmentDoc,
  StructuredPropertyFieldsFragmentDoc,
} from "./fragments.generated";
import * as Apollo from "@apollo/client";
export type ContractAssertionParametersFragment = {
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

export type DataContractDetailsFragment = {
  __typename?: "DataContract";
} & Pick<Types.DataContract, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "DataContractProperties" } & {
        freshness?: Types.Maybe<
          Array<
            { __typename?: "FreshnessContract" } & {
              assertion: {
                __typename?: "Assertion";
              } & AssertionDetailsWithRunEventsFragment;
            }
          >
        >;
        schema?: Types.Maybe<
          Array<
            { __typename?: "SchemaContract" } & {
              assertion: {
                __typename?: "Assertion";
              } & AssertionDetailsWithRunEventsFragment;
            }
          >
        >;
        dataQuality?: Types.Maybe<
          Array<
            { __typename?: "DataQualityContract" } & {
              assertion: {
                __typename?: "Assertion";
              } & AssertionDetailsWithRunEventsFragment;
            }
          >
        >;
      }
    >;
    status?: Types.Maybe<
      { __typename?: "DataContractStatus" } & Pick<
        Types.DataContractStatus,
        "state"
      >
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
  };

export type GetDatasetContractQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetDatasetContractQuery = { __typename?: "Query" } & {
  dataset?: Types.Maybe<
    { __typename?: "Dataset" } & {
      contract?: Types.Maybe<
        { __typename?: "DataContract" } & DataContractDetailsFragment
      >;
    }
  >;
};

export type UpsertDataContractMutationVariables = Types.Exact<{
  input: Types.UpsertDataContractInput;
}>;

export type UpsertDataContractMutation = { __typename?: "Mutation" } & {
  upsertDataContract: {
    __typename?: "DataContract";
  } & DataContractDetailsFragment;
};

export const ContractAssertionParametersFragmentDoc = gql`
  fragment contractAssertionParameters on AssertionStdParameters {
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
export const DataContractDetailsFragmentDoc = gql`
  fragment dataContractDetails on DataContract {
    urn
    type
    properties {
      freshness {
        assertion {
          ...assertionDetailsWithRunEvents
        }
      }
      schema {
        assertion {
          ...assertionDetailsWithRunEvents
        }
      }
      dataQuality {
        assertion {
          ...assertionDetailsWithRunEvents
        }
      }
    }
    status {
      state
    }
    structuredProperties {
      properties {
        ...structuredPropertiesFields
      }
    }
  }
  ${AssertionDetailsWithRunEventsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
`;
export const GetDatasetContractDocument = gql`
  query getDatasetContract($urn: String!) {
    dataset(urn: $urn) {
      contract {
        ...dataContractDetails
      }
    }
  }
  ${DataContractDetailsFragmentDoc}
`;

/**
 * __useGetDatasetContractQuery__
 *
 * To run a query within a React component, call `useGetDatasetContractQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDatasetContractQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDatasetContractQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetDatasetContractQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDatasetContractQuery,
    GetDatasetContractQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetDatasetContractQuery,
    GetDatasetContractQueryVariables
  >(GetDatasetContractDocument, baseOptions);
}
export function useGetDatasetContractLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDatasetContractQuery,
    GetDatasetContractQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetDatasetContractQuery,
    GetDatasetContractQueryVariables
  >(GetDatasetContractDocument, baseOptions);
}
export type GetDatasetContractQueryHookResult = ReturnType<
  typeof useGetDatasetContractQuery
>;
export type GetDatasetContractLazyQueryHookResult = ReturnType<
  typeof useGetDatasetContractLazyQuery
>;
export type GetDatasetContractQueryResult = Apollo.QueryResult<
  GetDatasetContractQuery,
  GetDatasetContractQueryVariables
>;
export const UpsertDataContractDocument = gql`
  mutation upsertDataContract($input: UpsertDataContractInput!) {
    upsertDataContract(input: $input) {
      ...dataContractDetails
    }
  }
  ${DataContractDetailsFragmentDoc}
`;
export type UpsertDataContractMutationFn = Apollo.MutationFunction<
  UpsertDataContractMutation,
  UpsertDataContractMutationVariables
>;

/**
 * __useUpsertDataContractMutation__
 *
 * To run a mutation, you first call `useUpsertDataContractMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpsertDataContractMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [upsertDataContractMutation, { data, loading, error }] = useUpsertDataContractMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpsertDataContractMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpsertDataContractMutation,
    UpsertDataContractMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpsertDataContractMutation,
    UpsertDataContractMutationVariables
  >(UpsertDataContractDocument, baseOptions);
}
export type UpsertDataContractMutationHookResult = ReturnType<
  typeof useUpsertDataContractMutation
>;
export type UpsertDataContractMutationResult =
  Apollo.MutationResult<UpsertDataContractMutation>;
export type UpsertDataContractMutationOptions = Apollo.BaseMutationOptions<
  UpsertDataContractMutation,
  UpsertDataContractMutationVariables
>;
