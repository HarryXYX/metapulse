/* eslint-disable */
import * as Types from "../types.generated";

import {
  NonRecursiveMlModelFragment,
  NonRecursiveMlFeatureFragment,
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
  NonRecursiveMlPrimaryKeyFragment,
} from "./fragments.generated";
import { DataProcessInstanceFieldsFragment } from "./dataProcessInstance.generated";
import {
  EntityProfileVersionProperties_Dataset_Fragment,
  EntityProfileVersionProperties_MlModel_Fragment,
} from "./versioning.generated";
import { gql } from "@apollo/client";
import {
  NonRecursiveMlModelFragmentDoc,
  NonRecursiveMlFeatureFragmentDoc,
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
  NonRecursiveMlPrimaryKeyFragmentDoc,
} from "./fragments.generated";
import { DataProcessInstanceFieldsFragmentDoc } from "./dataProcessInstance.generated";
import { EntityProfileVersionPropertiesFragmentDoc } from "./versioning.generated";
import * as Apollo from "@apollo/client";
export type GetMlModelQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetMlModelQuery = { __typename?: "Query" } & {
  mlModel?: Types.Maybe<
    { __typename?: "MLModel" } & Pick<Types.MlModel, "urn" | "type"> & {
        features?: Types.Maybe<
          { __typename?: "EntityRelationshipsResult" } & Pick<
            Types.EntityRelationshipsResult,
            "start" | "count" | "total"
          > & {
              relationships: Array<
                { __typename?: "EntityRelationship" } & Pick<
                  Types.EntityRelationship,
                  "type" | "direction"
                > & {
                    entity?: Types.Maybe<
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
                      | ({
                          __typename?: "MLFeature";
                        } & NonRecursiveMlFeatureFragment)
                      | { __typename?: "MLFeatureTable" }
                      | { __typename?: "MLModel" }
                      | { __typename?: "MLModelGroup" }
                      | ({
                          __typename?: "MLPrimaryKey";
                        } & NonRecursiveMlPrimaryKeyFragment)
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
                      | { __typename?: "VersionedDataset" }
                    >;
                  }
              >;
            }
        >;
        trainedBy?: Types.Maybe<
          { __typename?: "EntityRelationshipsResult" } & Pick<
            Types.EntityRelationshipsResult,
            "start" | "count" | "total"
          > & {
              relationships: Array<
                { __typename?: "EntityRelationship" } & Pick<
                  Types.EntityRelationship,
                  "type" | "direction"
                > & {
                    entity?: Types.Maybe<
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
                      | ({ __typename?: "DataProcessInstance" } & Pick<
                          Types.DataProcessInstance,
                          "urn" | "name" | "type"
                        > &
                          DataProcessInstanceFieldsFragment)
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
                      | { __typename?: "VersionedDataset" }
                    >;
                  }
              >;
            }
        >;
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
      } & NonRecursiveMlModelFragment &
      Notes_MlModel_Fragment &
      EntityProfileVersionProperties_MlModel_Fragment
  >;
};

export const GetMlModelDocument = gql`
  query getMLModel($urn: String!) {
    mlModel(urn: $urn) {
      urn
      type
      ...nonRecursiveMLModel
      features: relationships(
        input: {
          types: ["Consumes"]
          direction: OUTGOING
          start: 0
          count: 100
        }
      ) {
        start
        count
        total
        relationships {
          type
          direction
          entity {
            ... on MLFeature {
              ...nonRecursiveMLFeature
            }
            ... on MLPrimaryKey {
              ...nonRecursiveMLPrimaryKey
            }
          }
        }
      }
      trainedBy: relationships(
        input: {
          types: ["TrainedBy"]
          direction: OUTGOING
          start: 0
          count: 100
        }
      ) {
        start
        count
        total
        relationships {
          type
          direction
          entity {
            ... on DataProcessInstance {
              urn
              name
              type
              ...dataProcessInstanceFields
            }
          }
        }
      }
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
      ...entityProfileVersionProperties
    }
  }
  ${NonRecursiveMlModelFragmentDoc}
  ${NonRecursiveMlFeatureFragmentDoc}
  ${NonRecursiveMlPrimaryKeyFragmentDoc}
  ${DataProcessInstanceFieldsFragmentDoc}
  ${EntityPrivilegesFragmentDoc}
  ${AutoRenderAspectFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${FormsFieldsFragmentDoc}
  ${NotesFragmentDoc}
  ${EntityProfileVersionPropertiesFragmentDoc}
`;

/**
 * __useGetMlModelQuery__
 *
 * To run a query within a React component, call `useGetMlModelQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetMlModelQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetMlModelQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetMlModelQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetMlModelQuery,
    GetMlModelQueryVariables
  >,
) {
  return Apollo.useQuery<GetMlModelQuery, GetMlModelQueryVariables>(
    GetMlModelDocument,
    baseOptions,
  );
}
export function useGetMlModelLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetMlModelQuery,
    GetMlModelQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetMlModelQuery, GetMlModelQueryVariables>(
    GetMlModelDocument,
    baseOptions,
  );
}
export type GetMlModelQueryHookResult = ReturnType<typeof useGetMlModelQuery>;
export type GetMlModelLazyQueryHookResult = ReturnType<
  typeof useGetMlModelLazyQuery
>;
export type GetMlModelQueryResult = Apollo.QueryResult<
  GetMlModelQuery,
  GetMlModelQueryVariables
>;
