/* eslint-disable */
import * as Types from "../types.generated";

import {
  NonRecursiveMlFeatureTableFragment,
  StructuredPropertiesFieldsFragment,
  EntityPrivilegesFragment,
  AutoRenderAspectFieldsFragment,
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
} from "./fragments.generated";
import { gql } from "@apollo/client";
import {
  NonRecursiveMlFeatureTableFragmentDoc,
  StructuredPropertiesFieldsFragmentDoc,
  EntityPrivilegesFragmentDoc,
  AutoRenderAspectFieldsFragmentDoc,
  FormsFieldsFragmentDoc,
  OwnershipFieldsFragmentDoc,
  NotesFragmentDoc,
  EntityDomainFragmentDoc,
  InstitutionalMemoryFieldsFragmentDoc,
  GlobalTagsFieldsFragmentDoc,
  GlossaryTermsFragmentDoc,
} from "./fragments.generated";
import * as Apollo from "@apollo/client";
export type GetMlFeatureTableQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetMlFeatureTableQuery = { __typename?: "Query" } & {
  mlFeatureTable?: Types.Maybe<
    { __typename?: "MLFeatureTable" } & Pick<
      Types.MlFeatureTable,
      "urn" | "type"
    > & {
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
      } & NonRecursiveMlFeatureTableFragment &
      Notes_MlFeatureTable_Fragment
  >;
};

export const GetMlFeatureTableDocument = gql`
  query getMLFeatureTable($urn: String!) {
    mlFeatureTable(urn: $urn) {
      urn
      type
      ...nonRecursiveMLFeatureTable
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
  ${NonRecursiveMlFeatureTableFragmentDoc}
  ${EntityPrivilegesFragmentDoc}
  ${AutoRenderAspectFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${FormsFieldsFragmentDoc}
  ${NotesFragmentDoc}
`;

/**
 * __useGetMlFeatureTableQuery__
 *
 * To run a query within a React component, call `useGetMlFeatureTableQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetMlFeatureTableQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetMlFeatureTableQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetMlFeatureTableQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetMlFeatureTableQuery,
    GetMlFeatureTableQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetMlFeatureTableQuery,
    GetMlFeatureTableQueryVariables
  >(GetMlFeatureTableDocument, baseOptions);
}
export function useGetMlFeatureTableLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetMlFeatureTableQuery,
    GetMlFeatureTableQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetMlFeatureTableQuery,
    GetMlFeatureTableQueryVariables
  >(GetMlFeatureTableDocument, baseOptions);
}
export type GetMlFeatureTableQueryHookResult = ReturnType<
  typeof useGetMlFeatureTableQuery
>;
export type GetMlFeatureTableLazyQueryHookResult = ReturnType<
  typeof useGetMlFeatureTableLazyQuery
>;
export type GetMlFeatureTableQueryResult = Apollo.QueryResult<
  GetMlFeatureTableQuery,
  GetMlFeatureTableQueryVariables
>;
