/* eslint-disable */
import * as Types from "../types.generated";

import {
  CustomPropertiesFieldsFragment,
  OwnershipFieldsFragment,
  InstitutionalMemoryFieldsFragment,
  ParentNodesFieldsFragment,
  DisplayPropertiesFieldsFragment,
  EntityPrivilegesFragment,
  AutoRenderAspectFieldsFragment,
  StructuredPropertiesFieldsFragment,
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
  EntityDomainFragment,
  GlobalTagsFieldsFragment,
  GlossaryTermsFragment,
  GlossaryNodeFragment,
} from "./fragments.generated";
import { AssetSettingsFieldsFragment } from "./settings.generated";
import { gql } from "@apollo/client";
import {
  CustomPropertiesFieldsFragmentDoc,
  OwnershipFieldsFragmentDoc,
  InstitutionalMemoryFieldsFragmentDoc,
  ParentNodesFieldsFragmentDoc,
  DisplayPropertiesFieldsFragmentDoc,
  EntityPrivilegesFragmentDoc,
  AutoRenderAspectFieldsFragmentDoc,
  StructuredPropertiesFieldsFragmentDoc,
  FormsFieldsFragmentDoc,
  NotesFragmentDoc,
  EntityDomainFragmentDoc,
  GlobalTagsFieldsFragmentDoc,
  GlossaryTermsFragmentDoc,
  GlossaryNodeFragmentDoc,
} from "./fragments.generated";
import { AssetSettingsFieldsFragmentDoc } from "./settings.generated";
import * as Apollo from "@apollo/client";
export type ChildGlossaryTermFragment = { __typename?: "GlossaryTerm" } & Pick<
  Types.GlossaryTerm,
  "urn" | "type" | "name" | "hierarchicalName"
> & {
    properties?: Types.Maybe<
      { __typename?: "GlossaryTermProperties" } & Pick<
        Types.GlossaryTermProperties,
        "name" | "description"
      >
    >;
  };

export type GlossaryNodeFieldsFragment = { __typename?: "GlossaryNode" } & Pick<
  Types.GlossaryNode,
  "urn" | "type" | "exists"
> & {
    properties?: Types.Maybe<
      { __typename?: "GlossaryNodeProperties" } & Pick<
        Types.GlossaryNodeProperties,
        "name" | "description"
      > & {
          customProperties?: Types.Maybe<
            Array<
              {
                __typename?: "CustomPropertiesEntry";
              } & CustomPropertiesFieldsFragment
            >
          >;
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
    parentNodes?: Types.Maybe<
      { __typename?: "ParentNodesResult" } & ParentNodesFieldsFragment
    >;
    privileges?: Types.Maybe<
      { __typename?: "EntityPrivileges" } & EntityPrivilegesFragment
    >;
    autoRenderAspects?: Types.Maybe<
      Array<{ __typename?: "RawAspect" } & AutoRenderAspectFieldsFragment>
    >;
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
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
    childrenCount?: Types.Maybe<
      { __typename?: "GlossaryNodeChildrenCount" } & Pick<
        Types.GlossaryNodeChildrenCount,
        "termsCount" | "nodesCount"
      >
    >;
    displayProperties?: Types.Maybe<
      { __typename?: "DisplayProperties" } & DisplayPropertiesFieldsFragment
    >;
    settings?: Types.Maybe<
      { __typename?: "AssetSettings" } & AssetSettingsFieldsFragment
    >;
  } & Notes_GlossaryNode_Fragment;

export type GetGlossaryNodeQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetGlossaryNodeQuery = { __typename?: "Query" } & {
  glossaryNode?: Types.Maybe<
    { __typename?: "GlossaryNode" } & GlossaryNodeFieldsFragment
  >;
};

export type GetGlossaryNodeWithChildrenQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetGlossaryNodeWithChildrenQuery = { __typename?: "Query" } & {
  glossaryNode?: Types.Maybe<
    { __typename?: "GlossaryNode" } & {
      children?: Types.Maybe<
        { __typename?: "EntityRelationshipsResult" } & Pick<
          Types.EntityRelationshipsResult,
          "total"
        > & {
            relationships: Array<
              { __typename?: "EntityRelationship" } & Pick<
                Types.EntityRelationship,
                "direction"
              > & {
                  entity?: Types.Maybe<
                    | ({ __typename?: "AccessTokenMetadata" } & Pick<
                        Types.AccessTokenMetadata,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "Application" } & Pick<
                        Types.Application,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "Assertion" } & Pick<
                        Types.Assertion,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "BusinessAttribute" } & Pick<
                        Types.BusinessAttribute,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "Chart" } & Pick<
                        Types.Chart,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "Container" } & Pick<
                        Types.Container,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "CorpGroup" } & Pick<
                        Types.CorpGroup,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "CorpUser" } & Pick<
                        Types.CorpUser,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "Dashboard" } & Pick<
                        Types.Dashboard,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "DataContract" } & Pick<
                        Types.DataContract,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "DataFlow" } & Pick<
                        Types.DataFlow,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "DataHubConnection" } & Pick<
                        Types.DataHubConnection,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "DataHubFile" } & Pick<
                        Types.DataHubFile,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "DataHubPageModule" } & Pick<
                        Types.DataHubPageModule,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "DataHubPageTemplate" } & Pick<
                        Types.DataHubPageTemplate,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "DataHubPolicy" } & Pick<
                        Types.DataHubPolicy,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "DataHubRole" } & Pick<
                        Types.DataHubRole,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "DataHubView" } & Pick<
                        Types.DataHubView,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "DataJob" } & Pick<
                        Types.DataJob,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "DataPlatform" } & Pick<
                        Types.DataPlatform,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "DataPlatformInstance" } & Pick<
                        Types.DataPlatformInstance,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "DataProcessInstance" } & Pick<
                        Types.DataProcessInstance,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "DataProduct" } & Pick<
                        Types.DataProduct,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "DataTypeEntity" } & Pick<
                        Types.DataTypeEntity,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "Dataset" } & Pick<
                        Types.Dataset,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "Domain" } & Pick<
                        Types.Domain,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "ERModelRelationship" } & Pick<
                        Types.ErModelRelationship,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "EntityTypeEntity" } & Pick<
                        Types.EntityTypeEntity,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "ExecutionRequest" } & Pick<
                        Types.ExecutionRequest,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "Form" } & Pick<
                        Types.Form,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "GlossaryNode" } & Pick<
                        Types.GlossaryNode,
                        "type" | "urn"
                      > &
                        GlossaryNodeFragment)
                    | ({ __typename?: "GlossaryTerm" } & Pick<
                        Types.GlossaryTerm,
                        "type" | "urn"
                      > &
                        ChildGlossaryTermFragment)
                    | ({ __typename?: "Incident" } & Pick<
                        Types.Incident,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "MLFeature" } & Pick<
                        Types.MlFeature,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "MLFeatureTable" } & Pick<
                        Types.MlFeatureTable,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "MLModel" } & Pick<
                        Types.MlModel,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "MLModelGroup" } & Pick<
                        Types.MlModelGroup,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "MLPrimaryKey" } & Pick<
                        Types.MlPrimaryKey,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "Notebook" } & Pick<
                        Types.Notebook,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "OwnershipTypeEntity" } & Pick<
                        Types.OwnershipTypeEntity,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "Post" } & Pick<
                        Types.Post,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "QueryEntity" } & Pick<
                        Types.QueryEntity,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "Restricted" } & Pick<
                        Types.Restricted,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "Role" } & Pick<
                        Types.Role,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "SchemaFieldEntity" } & Pick<
                        Types.SchemaFieldEntity,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "StructuredPropertyEntity" } & Pick<
                        Types.StructuredPropertyEntity,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "Tag" } & Pick<Types.Tag, "type" | "urn">)
                    | ({ __typename?: "Test" } & Pick<
                        Types.Test,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "VersionSet" } & Pick<
                        Types.VersionSet,
                        "type" | "urn"
                      >)
                    | ({ __typename?: "VersionedDataset" } & Pick<
                        Types.VersionedDataset,
                        "type" | "urn"
                      >)
                  >;
                }
            >;
          }
      >;
    } & GlossaryNodeFieldsFragment
  >;
};

export const ChildGlossaryTermFragmentDoc = gql`
  fragment childGlossaryTerm on GlossaryTerm {
    urn
    type
    name
    hierarchicalName
    properties {
      name
      description
    }
  }
`;
export const GlossaryNodeFieldsFragmentDoc = gql`
  fragment glossaryNodeFields on GlossaryNode {
    urn
    type
    exists
    properties {
      name
      description
      customProperties {
        ...customPropertiesFields
      }
      createdOn {
        time
      }
    }
    ownership {
      ...ownershipFields
    }
    parentNodes {
      ...parentNodesFields
    }
    privileges {
      ...entityPrivileges
    }
    autoRenderAspects: aspects(input: { autoRenderOnly: true }) {
      ...autoRenderAspectFields
    }
    institutionalMemory {
      ...institutionalMemoryFields
    }
    structuredProperties {
      properties {
        ...structuredPropertiesFields
      }
    }
    forms {
      ...formsFields
    }
    childrenCount {
      termsCount
      nodesCount
    }
    displayProperties {
      ...displayPropertiesFields
    }
    ...notes
    settings {
      ...AssetSettingsFields
    }
  }
  ${CustomPropertiesFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${ParentNodesFieldsFragmentDoc}
  ${EntityPrivilegesFragmentDoc}
  ${AutoRenderAspectFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${FormsFieldsFragmentDoc}
  ${DisplayPropertiesFieldsFragmentDoc}
  ${NotesFragmentDoc}
  ${AssetSettingsFieldsFragmentDoc}
`;
export const GetGlossaryNodeDocument = gql`
  query getGlossaryNode($urn: String!) {
    glossaryNode(urn: $urn) {
      ...glossaryNodeFields
    }
  }
  ${GlossaryNodeFieldsFragmentDoc}
`;

/**
 * __useGetGlossaryNodeQuery__
 *
 * To run a query within a React component, call `useGetGlossaryNodeQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetGlossaryNodeQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetGlossaryNodeQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetGlossaryNodeQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetGlossaryNodeQuery,
    GetGlossaryNodeQueryVariables
  >,
) {
  return Apollo.useQuery<GetGlossaryNodeQuery, GetGlossaryNodeQueryVariables>(
    GetGlossaryNodeDocument,
    baseOptions,
  );
}
export function useGetGlossaryNodeLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetGlossaryNodeQuery,
    GetGlossaryNodeQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetGlossaryNodeQuery,
    GetGlossaryNodeQueryVariables
  >(GetGlossaryNodeDocument, baseOptions);
}
export type GetGlossaryNodeQueryHookResult = ReturnType<
  typeof useGetGlossaryNodeQuery
>;
export type GetGlossaryNodeLazyQueryHookResult = ReturnType<
  typeof useGetGlossaryNodeLazyQuery
>;
export type GetGlossaryNodeQueryResult = Apollo.QueryResult<
  GetGlossaryNodeQuery,
  GetGlossaryNodeQueryVariables
>;
export const GetGlossaryNodeWithChildrenDocument = gql`
  query getGlossaryNodeWithChildren($urn: String!) {
    glossaryNode(urn: $urn) {
      ...glossaryNodeFields
      children: relationships(
        input: {
          types: ["IsPartOf"]
          direction: INCOMING
          start: 0
          count: 1000
        }
      ) {
        total
        relationships {
          direction
          entity {
            type
            urn
            ... on GlossaryNode {
              ...glossaryNode
            }
            ... on GlossaryTerm {
              ...childGlossaryTerm
            }
          }
        }
      }
    }
  }
  ${GlossaryNodeFieldsFragmentDoc}
  ${GlossaryNodeFragmentDoc}
  ${ChildGlossaryTermFragmentDoc}
`;

/**
 * __useGetGlossaryNodeWithChildrenQuery__
 *
 * To run a query within a React component, call `useGetGlossaryNodeWithChildrenQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetGlossaryNodeWithChildrenQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetGlossaryNodeWithChildrenQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetGlossaryNodeWithChildrenQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetGlossaryNodeWithChildrenQuery,
    GetGlossaryNodeWithChildrenQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetGlossaryNodeWithChildrenQuery,
    GetGlossaryNodeWithChildrenQueryVariables
  >(GetGlossaryNodeWithChildrenDocument, baseOptions);
}
export function useGetGlossaryNodeWithChildrenLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetGlossaryNodeWithChildrenQuery,
    GetGlossaryNodeWithChildrenQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetGlossaryNodeWithChildrenQuery,
    GetGlossaryNodeWithChildrenQueryVariables
  >(GetGlossaryNodeWithChildrenDocument, baseOptions);
}
export type GetGlossaryNodeWithChildrenQueryHookResult = ReturnType<
  typeof useGetGlossaryNodeWithChildrenQuery
>;
export type GetGlossaryNodeWithChildrenLazyQueryHookResult = ReturnType<
  typeof useGetGlossaryNodeWithChildrenLazyQuery
>;
export type GetGlossaryNodeWithChildrenQueryResult = Apollo.QueryResult<
  GetGlossaryNodeWithChildrenQuery,
  GetGlossaryNodeWithChildrenQueryVariables
>;
