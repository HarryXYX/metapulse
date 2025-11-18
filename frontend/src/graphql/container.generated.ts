/* eslint-disable */
import * as Types from "../types.generated";

import {
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
  NonRecursiveMlFeatureTableFragment,
  NonRecursiveMlFeatureFragment,
  NonRecursiveMlPrimaryKeyFragment,
  ErmodelrelationPropertiesFieldsFragment,
  ErmodelrelationEditablePropertiesFieldsFragment,
  SchemaMetadataFieldsFragment,
  ParentNodesFieldsFragment,
  CustomPropertiesFieldsFragment,
  GlossaryNodeFragment,
  BusinessAttributeFragment,
  DocumentationFieldsFragment,
  StructuredPropertyFieldsFragment,
} from "./fragments.generated";
import { FacetFieldsFragment } from "./search.generated";
import { gql } from "@apollo/client";
import {
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
  EntityDisplayNameFieldsFragmentDoc,
  NonRecursiveMlFeatureTableFragmentDoc,
  NonRecursiveMlFeatureFragmentDoc,
  NonRecursiveMlPrimaryKeyFragmentDoc,
  ErmodelrelationPropertiesFieldsFragmentDoc,
  ErmodelrelationEditablePropertiesFieldsFragmentDoc,
  SchemaMetadataFieldsFragmentDoc,
  ParentNodesFieldsFragmentDoc,
  CustomPropertiesFieldsFragmentDoc,
  GlossaryNodeFragmentDoc,
  BusinessAttributeFragmentDoc,
  DocumentationFieldsFragmentDoc,
  StructuredPropertyFieldsFragmentDoc,
} from "./fragments.generated";
import { FacetFieldsFragmentDoc } from "./search.generated";
import * as Apollo from "@apollo/client";
export type GetContainerQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetContainerQuery = { __typename?: "Query" } & {
  container?: Types.Maybe<
    { __typename?: "Container" } & Pick<
      Types.Container,
      "urn" | "type" | "exists" | "lastIngested"
    > & {
        platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
        properties?: Types.Maybe<
          { __typename?: "ContainerProperties" } & Pick<
            Types.ContainerProperties,
            "name" | "qualifiedName" | "description" | "externalUrl"
          > & {
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
        privileges?: Types.Maybe<
          { __typename?: "EntityPrivileges" } & EntityPrivilegesFragment
        >;
        editableProperties?: Types.Maybe<
          { __typename?: "ContainerEditableProperties" } & Pick<
            Types.ContainerEditableProperties,
            "description"
          >
        >;
        ownership?: Types.Maybe<
          { __typename?: "Ownership" } & OwnershipFieldsFragment
        >;
        tags?: Types.Maybe<
          { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
        >;
        institutionalMemory?: Types.Maybe<
          {
            __typename?: "InstitutionalMemory";
          } & InstitutionalMemoryFieldsFragment
        >;
        glossaryTerms?: Types.Maybe<
          { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
        >;
        subTypes?: Types.Maybe<
          { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
        >;
        entities?: Types.Maybe<
          { __typename?: "SearchResults" } & Pick<Types.SearchResults, "total">
        >;
        container?: Types.Maybe<
          { __typename?: "Container" } & EntityContainerFragment
        >;
        parentContainers?: Types.Maybe<
          {
            __typename?: "ParentContainersResult";
          } & ParentContainersFieldsFragment
        >;
        domain?: Types.Maybe<
          { __typename?: "DomainAssociation" } & EntityDomainFragment
        >;
        deprecation?: Types.Maybe<
          { __typename?: "Deprecation" } & DeprecationFieldsFragment
        >;
        dataPlatformInstance?: Types.Maybe<
          {
            __typename?: "DataPlatformInstance";
          } & DataPlatformInstanceFieldsFragment
        >;
        status?: Types.Maybe<
          { __typename?: "Status" } & Pick<Types.Status, "removed">
        >;
        access?: Types.Maybe<
          { __typename?: "Access" } & {
            roles?: Types.Maybe<
              Array<
                { __typename?: "RoleAssociation" } & {
                  role: { __typename?: "Role" } & Pick<Types.Role, "urn">;
                }
              >
            >;
          }
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
        browsePathV2?: Types.Maybe<
          { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
        >;
      } & EntityDataProduct_Container_Fragment &
      Notes_Container_Fragment
  >;
};

export type GetContainerEntitySummaryQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetContainerEntitySummaryQuery = { __typename?: "Query" } & {
  aggregateAcrossEntities?: Types.Maybe<
    { __typename?: "AggregateResults" } & {
      facets?: Types.Maybe<
        Array<{ __typename?: "FacetMetadata" } & FacetFieldsFragment>
      >;
    }
  >;
};

export const GetContainerDocument = gql`
  query getContainer($urn: String!) {
    container(urn: $urn) {
      urn
      type
      exists
      lastIngested
      platform {
        ...platformFields
      }
      properties {
        name
        qualifiedName
        description
        externalUrl
        customProperties {
          key
          value
        }
      }
      privileges {
        ...entityPrivileges
      }
      editableProperties {
        description
      }
      ownership {
        ...ownershipFields
      }
      tags {
        ...globalTagsFields
      }
      institutionalMemory {
        ...institutionalMemoryFields
      }
      glossaryTerms {
        ...glossaryTerms
      }
      subTypes {
        typeNames
      }
      entities(input: { start: 0, count: 1 }) {
        total
      }
      container {
        ...entityContainer
      }
      parentContainers {
        ...parentContainersFields
      }
      domain {
        ...entityDomain
      }
      ...entityDataProduct
      deprecation {
        ...deprecationFields
      }
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
      status {
        removed
      }
      access {
        roles {
          role {
            urn
          }
        }
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
      browsePathV2 {
        ...browsePathV2Fields
      }
      ...notes
    }
  }
  ${PlatformFieldsFragmentDoc}
  ${EntityPrivilegesFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityContainerFragmentDoc}
  ${ParentContainersFieldsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityDataProductFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${AutoRenderAspectFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${FormsFieldsFragmentDoc}
  ${BrowsePathV2FieldsFragmentDoc}
  ${NotesFragmentDoc}
`;

/**
 * __useGetContainerQuery__
 *
 * To run a query within a React component, call `useGetContainerQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetContainerQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetContainerQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetContainerQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetContainerQuery,
    GetContainerQueryVariables
  >,
) {
  return Apollo.useQuery<GetContainerQuery, GetContainerQueryVariables>(
    GetContainerDocument,
    baseOptions,
  );
}
export function useGetContainerLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetContainerQuery,
    GetContainerQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetContainerQuery, GetContainerQueryVariables>(
    GetContainerDocument,
    baseOptions,
  );
}
export type GetContainerQueryHookResult = ReturnType<
  typeof useGetContainerQuery
>;
export type GetContainerLazyQueryHookResult = ReturnType<
  typeof useGetContainerLazyQuery
>;
export type GetContainerQueryResult = Apollo.QueryResult<
  GetContainerQuery,
  GetContainerQueryVariables
>;
export const GetContainerEntitySummaryDocument = gql`
  query getContainerEntitySummary($urn: String!) {
    aggregateAcrossEntities(
      input: {
        types: []
        query: "*"
        facets: ["_entityType␞typeNames", "_entityType"]
        orFilters: [
          { and: [{ field: "container", values: [$urn], value: $urn }] }
        ]
      }
    ) {
      facets {
        ...facetFields
      }
    }
  }
  ${FacetFieldsFragmentDoc}
`;

/**
 * __useGetContainerEntitySummaryQuery__
 *
 * To run a query within a React component, call `useGetContainerEntitySummaryQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetContainerEntitySummaryQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetContainerEntitySummaryQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetContainerEntitySummaryQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetContainerEntitySummaryQuery,
    GetContainerEntitySummaryQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetContainerEntitySummaryQuery,
    GetContainerEntitySummaryQueryVariables
  >(GetContainerEntitySummaryDocument, baseOptions);
}
export function useGetContainerEntitySummaryLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetContainerEntitySummaryQuery,
    GetContainerEntitySummaryQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetContainerEntitySummaryQuery,
    GetContainerEntitySummaryQueryVariables
  >(GetContainerEntitySummaryDocument, baseOptions);
}
export type GetContainerEntitySummaryQueryHookResult = ReturnType<
  typeof useGetContainerEntitySummaryQuery
>;
export type GetContainerEntitySummaryLazyQueryHookResult = ReturnType<
  typeof useGetContainerEntitySummaryLazyQuery
>;
export type GetContainerEntitySummaryQueryResult = Apollo.QueryResult<
  GetContainerEntitySummaryQuery,
  GetContainerEntitySummaryQueryVariables
>;
