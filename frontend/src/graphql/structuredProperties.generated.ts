/* eslint-disable */
import * as Types from "../types.generated";

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
export type GetStructuredPropertyQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetStructuredPropertyQuery = { __typename?: "Query" } & {
  entity?: Types.Maybe<
    | ({ __typename?: "AccessTokenMetadata" } & Pick<
        Types.AccessTokenMetadata,
        "urn" | "type"
      >)
    | ({ __typename?: "Application" } & Pick<Types.Application, "urn" | "type">)
    | ({ __typename?: "Assertion" } & Pick<Types.Assertion, "urn" | "type">)
    | ({ __typename?: "BusinessAttribute" } & Pick<
        Types.BusinessAttribute,
        "urn" | "type"
      >)
    | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type">)
    | ({ __typename?: "Container" } & Pick<Types.Container, "urn" | "type">)
    | ({ __typename?: "CorpGroup" } & Pick<Types.CorpGroup, "urn" | "type">)
    | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type">)
    | ({ __typename?: "Dashboard" } & Pick<Types.Dashboard, "urn" | "type">)
    | ({ __typename?: "DataContract" } & Pick<
        Types.DataContract,
        "urn" | "type"
      >)
    | ({ __typename?: "DataFlow" } & Pick<Types.DataFlow, "urn" | "type">)
    | ({ __typename?: "DataHubConnection" } & Pick<
        Types.DataHubConnection,
        "urn" | "type"
      >)
    | ({ __typename?: "DataHubFile" } & Pick<Types.DataHubFile, "urn" | "type">)
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
    | ({ __typename?: "DataHubRole" } & Pick<Types.DataHubRole, "urn" | "type">)
    | ({ __typename?: "DataHubView" } & Pick<Types.DataHubView, "urn" | "type">)
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
    | ({ __typename?: "DataProduct" } & Pick<Types.DataProduct, "urn" | "type">)
    | ({ __typename?: "DataTypeEntity" } & Pick<
        Types.DataTypeEntity,
        "urn" | "type"
      >)
    | ({ __typename?: "Dataset" } & Pick<Types.Dataset, "urn" | "type">)
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
    | ({ __typename?: "MLFeature" } & Pick<Types.MlFeature, "urn" | "type">)
    | ({ __typename?: "MLFeatureTable" } & Pick<
        Types.MlFeatureTable,
        "urn" | "type"
      >)
    | ({ __typename?: "MLModel" } & Pick<Types.MlModel, "urn" | "type">)
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
    | ({ __typename?: "QueryEntity" } & Pick<Types.QueryEntity, "urn" | "type">)
    | ({ __typename?: "Restricted" } & Pick<Types.Restricted, "urn" | "type">)
    | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type">)
    | ({ __typename?: "SchemaFieldEntity" } & Pick<
        Types.SchemaFieldEntity,
        "urn" | "type"
      >)
    | ({ __typename?: "StructuredPropertyEntity" } & Pick<
        Types.StructuredPropertyEntity,
        "urn" | "type"
      > & {
          definition: { __typename?: "StructuredPropertyDefinition" } & Pick<
            Types.StructuredPropertyDefinition,
            "qualifiedName" | "displayName" | "description" | "cardinality"
          > & {
              entityTypes: Array<
                { __typename?: "EntityTypeEntity" } & Pick<
                  Types.EntityTypeEntity,
                  "urn" | "type"
                > & {
                    info: { __typename?: "EntityTypeInfo" } & Pick<
                      Types.EntityTypeInfo,
                      "type"
                    >;
                  }
              >;
              valueType: { __typename?: "DataTypeEntity" } & Pick<
                Types.DataTypeEntity,
                "urn" | "type"
              > & {
                  info: { __typename?: "DataTypeInfo" } & Pick<
                    Types.DataTypeInfo,
                    "type" | "qualifiedName" | "displayName" | "description"
                  >;
                };
              allowedValues?: Types.Maybe<
                Array<
                  { __typename?: "AllowedValue" } & Pick<
                    Types.AllowedValue,
                    "description"
                  > & {
                      value:
                        | ({ __typename?: "NumberValue" } & Pick<
                            Types.NumberValue,
                            "numberValue"
                          >)
                        | ({ __typename?: "StringValue" } & Pick<
                            Types.StringValue,
                            "stringValue"
                          >);
                    }
                >
              >;
              typeQualifier?: Types.Maybe<
                { __typename?: "TypeQualifier" } & {
                  allowedTypes?: Types.Maybe<
                    Array<
                      { __typename?: "EntityTypeEntity" } & Pick<
                        Types.EntityTypeEntity,
                        "urn" | "type"
                      > & {
                          info: { __typename?: "EntityTypeInfo" } & Pick<
                            Types.EntityTypeInfo,
                            "type"
                          >;
                        }
                    >
                  >;
                }
              >;
            };
        })
    | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn" | "type">)
    | ({ __typename?: "Test" } & Pick<Types.Test, "urn" | "type">)
    | ({ __typename?: "VersionSet" } & Pick<Types.VersionSet, "urn" | "type">)
    | ({ __typename?: "VersionedDataset" } & Pick<
        Types.VersionedDataset,
        "urn" | "type"
      >)
  >;
};

export type SearchStructuredPropertiesQueryVariables = Types.Exact<{
  query: Types.Scalars["String"];
  start: Types.Scalars["Int"];
  count: Types.Scalars["Int"];
}>;

export type SearchStructuredPropertiesQuery = { __typename?: "Query" } & {
  searchAcrossEntities?: Types.Maybe<
    { __typename?: "SearchResults" } & Pick<
      Types.SearchResults,
      "start" | "count" | "total"
    > & {
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
              | ({ __typename?: "StructuredPropertyEntity" } & Pick<
                  Types.StructuredPropertyEntity,
                  "urn" | "type"
                > & {
                    definition: {
                      __typename?: "StructuredPropertyDefinition";
                    } & Pick<
                      Types.StructuredPropertyDefinition,
                      | "qualifiedName"
                      | "displayName"
                      | "description"
                      | "cardinality"
                    > & {
                        entityTypes: Array<
                          { __typename?: "EntityTypeEntity" } & Pick<
                            Types.EntityTypeEntity,
                            "urn" | "type"
                          > & {
                              info: { __typename?: "EntityTypeInfo" } & Pick<
                                Types.EntityTypeInfo,
                                "type"
                              >;
                            }
                        >;
                        valueType: { __typename?: "DataTypeEntity" } & Pick<
                          Types.DataTypeEntity,
                          "urn" | "type"
                        > & {
                            info: { __typename?: "DataTypeInfo" } & Pick<
                              Types.DataTypeInfo,
                              | "type"
                              | "qualifiedName"
                              | "displayName"
                              | "description"
                            >;
                          };
                        allowedValues?: Types.Maybe<
                          Array<
                            { __typename?: "AllowedValue" } & Pick<
                              Types.AllowedValue,
                              "description"
                            > & {
                                value:
                                  | ({ __typename?: "NumberValue" } & Pick<
                                      Types.NumberValue,
                                      "numberValue"
                                    >)
                                  | ({ __typename?: "StringValue" } & Pick<
                                      Types.StringValue,
                                      "stringValue"
                                    >);
                              }
                          >
                        >;
                        typeQualifier?: Types.Maybe<
                          { __typename?: "TypeQualifier" } & {
                            allowedTypes?: Types.Maybe<
                              Array<
                                { __typename?: "EntityTypeEntity" } & Pick<
                                  Types.EntityTypeEntity,
                                  "urn" | "type"
                                > & {
                                    info: {
                                      __typename?: "EntityTypeInfo";
                                    } & Pick<Types.EntityTypeInfo, "type">;
                                  }
                              >
                            >;
                          }
                        >;
                      };
                  })
              | { __typename?: "Tag" }
              | { __typename?: "Test" }
              | { __typename?: "VersionSet" }
              | { __typename?: "VersionedDataset" };
          }
        >;
      }
  >;
};

export type UpsertStructuredPropertiesMutationVariables = Types.Exact<{
  input: Types.UpsertStructuredPropertiesInput;
}>;

export type UpsertStructuredPropertiesMutation = { __typename?: "Mutation" } & {
  upsertStructuredProperties: { __typename?: "StructuredProperties" } & {
    properties?: Types.Maybe<
      Array<
        {
          __typename?: "StructuredPropertiesEntry";
        } & StructuredPropertiesFieldsFragment
      >
    >;
  };
};

export type RemoveStructuredPropertiesMutationVariables = Types.Exact<{
  input: Types.RemoveStructuredPropertiesInput;
}>;

export type RemoveStructuredPropertiesMutation = { __typename?: "Mutation" } & {
  removeStructuredProperties: { __typename?: "StructuredProperties" } & {
    properties?: Types.Maybe<
      Array<
        {
          __typename?: "StructuredPropertiesEntry";
        } & StructuredPropertiesFieldsFragment
      >
    >;
  };
};

export type CreateStructuredPropertyMutationVariables = Types.Exact<{
  input: Types.CreateStructuredPropertyInput;
}>;

export type CreateStructuredPropertyMutation = { __typename?: "Mutation" } & {
  createStructuredProperty: {
    __typename?: "StructuredPropertyEntity";
  } & StructuredPropertyFieldsFragment;
};

export type UpdateStructuredPropertyMutationVariables = Types.Exact<{
  input: Types.UpdateStructuredPropertyInput;
}>;

export type UpdateStructuredPropertyMutation = { __typename?: "Mutation" } & {
  updateStructuredProperty: {
    __typename?: "StructuredPropertyEntity";
  } & StructuredPropertyFieldsFragment;
};

export type DeleteStructuredPropertyMutationVariables = Types.Exact<{
  input: Types.DeleteStructuredPropertyInput;
}>;

export type DeleteStructuredPropertyMutation = {
  __typename?: "Mutation";
} & Pick<Types.Mutation, "deleteStructuredProperty">;

export const GetStructuredPropertyDocument = gql`
  query getStructuredProperty($urn: String!) {
    entity(urn: $urn) {
      urn
      type
      ... on StructuredPropertyEntity {
        urn
        type
        definition {
          qualifiedName
          displayName
          description
          cardinality
          entityTypes {
            urn
            type
            info {
              type
            }
          }
          valueType {
            urn
            type
            info {
              type
              qualifiedName
              displayName
              description
            }
          }
          allowedValues {
            value {
              ... on StringValue {
                stringValue
              }
              ... on NumberValue {
                numberValue
              }
            }
            description
          }
          typeQualifier {
            allowedTypes {
              urn
              type
              info {
                type
              }
            }
          }
        }
      }
    }
  }
`;

/**
 * __useGetStructuredPropertyQuery__
 *
 * To run a query within a React component, call `useGetStructuredPropertyQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetStructuredPropertyQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetStructuredPropertyQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetStructuredPropertyQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetStructuredPropertyQuery,
    GetStructuredPropertyQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetStructuredPropertyQuery,
    GetStructuredPropertyQueryVariables
  >(GetStructuredPropertyDocument, baseOptions);
}
export function useGetStructuredPropertyLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetStructuredPropertyQuery,
    GetStructuredPropertyQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetStructuredPropertyQuery,
    GetStructuredPropertyQueryVariables
  >(GetStructuredPropertyDocument, baseOptions);
}
export type GetStructuredPropertyQueryHookResult = ReturnType<
  typeof useGetStructuredPropertyQuery
>;
export type GetStructuredPropertyLazyQueryHookResult = ReturnType<
  typeof useGetStructuredPropertyLazyQuery
>;
export type GetStructuredPropertyQueryResult = Apollo.QueryResult<
  GetStructuredPropertyQuery,
  GetStructuredPropertyQueryVariables
>;
export const SearchStructuredPropertiesDocument = gql`
  query searchStructuredProperties(
    $query: String!
    $start: Int!
    $count: Int!
  ) {
    searchAcrossEntities(
      input: {
        query: $query
        types: [STRUCTURED_PROPERTY]
        start: $start
        count: $count
      }
    ) {
      start
      count
      total
      searchResults {
        entity {
          ... on StructuredPropertyEntity {
            urn
            type
            definition {
              qualifiedName
              displayName
              description
              cardinality
              entityTypes {
                urn
                type
                info {
                  type
                }
              }
              valueType {
                urn
                type
                info {
                  type
                  qualifiedName
                  displayName
                  description
                }
              }
              allowedValues {
                value {
                  ... on StringValue {
                    stringValue
                  }
                  ... on NumberValue {
                    numberValue
                  }
                }
                description
              }
              typeQualifier {
                allowedTypes {
                  urn
                  type
                  info {
                    type
                  }
                }
              }
            }
          }
        }
      }
    }
  }
`;

/**
 * __useSearchStructuredPropertiesQuery__
 *
 * To run a query within a React component, call `useSearchStructuredPropertiesQuery` and pass it any options that fit your needs.
 * When your component renders, `useSearchStructuredPropertiesQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useSearchStructuredPropertiesQuery({
 *   variables: {
 *      query: // value for 'query'
 *      start: // value for 'start'
 *      count: // value for 'count'
 *   },
 * });
 */
export function useSearchStructuredPropertiesQuery(
  baseOptions: Apollo.QueryHookOptions<
    SearchStructuredPropertiesQuery,
    SearchStructuredPropertiesQueryVariables
  >,
) {
  return Apollo.useQuery<
    SearchStructuredPropertiesQuery,
    SearchStructuredPropertiesQueryVariables
  >(SearchStructuredPropertiesDocument, baseOptions);
}
export function useSearchStructuredPropertiesLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    SearchStructuredPropertiesQuery,
    SearchStructuredPropertiesQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    SearchStructuredPropertiesQuery,
    SearchStructuredPropertiesQueryVariables
  >(SearchStructuredPropertiesDocument, baseOptions);
}
export type SearchStructuredPropertiesQueryHookResult = ReturnType<
  typeof useSearchStructuredPropertiesQuery
>;
export type SearchStructuredPropertiesLazyQueryHookResult = ReturnType<
  typeof useSearchStructuredPropertiesLazyQuery
>;
export type SearchStructuredPropertiesQueryResult = Apollo.QueryResult<
  SearchStructuredPropertiesQuery,
  SearchStructuredPropertiesQueryVariables
>;
export const UpsertStructuredPropertiesDocument = gql`
  mutation upsertStructuredProperties(
    $input: UpsertStructuredPropertiesInput!
  ) {
    upsertStructuredProperties(input: $input) {
      properties {
        ...structuredPropertiesFields
      }
    }
  }
  ${StructuredPropertiesFieldsFragmentDoc}
`;
export type UpsertStructuredPropertiesMutationFn = Apollo.MutationFunction<
  UpsertStructuredPropertiesMutation,
  UpsertStructuredPropertiesMutationVariables
>;

/**
 * __useUpsertStructuredPropertiesMutation__
 *
 * To run a mutation, you first call `useUpsertStructuredPropertiesMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpsertStructuredPropertiesMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [upsertStructuredPropertiesMutation, { data, loading, error }] = useUpsertStructuredPropertiesMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpsertStructuredPropertiesMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpsertStructuredPropertiesMutation,
    UpsertStructuredPropertiesMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpsertStructuredPropertiesMutation,
    UpsertStructuredPropertiesMutationVariables
  >(UpsertStructuredPropertiesDocument, baseOptions);
}
export type UpsertStructuredPropertiesMutationHookResult = ReturnType<
  typeof useUpsertStructuredPropertiesMutation
>;
export type UpsertStructuredPropertiesMutationResult =
  Apollo.MutationResult<UpsertStructuredPropertiesMutation>;
export type UpsertStructuredPropertiesMutationOptions =
  Apollo.BaseMutationOptions<
    UpsertStructuredPropertiesMutation,
    UpsertStructuredPropertiesMutationVariables
  >;
export const RemoveStructuredPropertiesDocument = gql`
  mutation removeStructuredProperties(
    $input: RemoveStructuredPropertiesInput!
  ) {
    removeStructuredProperties(input: $input) {
      properties {
        ...structuredPropertiesFields
      }
    }
  }
  ${StructuredPropertiesFieldsFragmentDoc}
`;
export type RemoveStructuredPropertiesMutationFn = Apollo.MutationFunction<
  RemoveStructuredPropertiesMutation,
  RemoveStructuredPropertiesMutationVariables
>;

/**
 * __useRemoveStructuredPropertiesMutation__
 *
 * To run a mutation, you first call `useRemoveStructuredPropertiesMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useRemoveStructuredPropertiesMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [removeStructuredPropertiesMutation, { data, loading, error }] = useRemoveStructuredPropertiesMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useRemoveStructuredPropertiesMutation(
  baseOptions?: Apollo.MutationHookOptions<
    RemoveStructuredPropertiesMutation,
    RemoveStructuredPropertiesMutationVariables
  >,
) {
  return Apollo.useMutation<
    RemoveStructuredPropertiesMutation,
    RemoveStructuredPropertiesMutationVariables
  >(RemoveStructuredPropertiesDocument, baseOptions);
}
export type RemoveStructuredPropertiesMutationHookResult = ReturnType<
  typeof useRemoveStructuredPropertiesMutation
>;
export type RemoveStructuredPropertiesMutationResult =
  Apollo.MutationResult<RemoveStructuredPropertiesMutation>;
export type RemoveStructuredPropertiesMutationOptions =
  Apollo.BaseMutationOptions<
    RemoveStructuredPropertiesMutation,
    RemoveStructuredPropertiesMutationVariables
  >;
export const CreateStructuredPropertyDocument = gql`
  mutation createStructuredProperty($input: CreateStructuredPropertyInput!) {
    createStructuredProperty(input: $input) {
      ...structuredPropertyFields
    }
  }
  ${StructuredPropertyFieldsFragmentDoc}
`;
export type CreateStructuredPropertyMutationFn = Apollo.MutationFunction<
  CreateStructuredPropertyMutation,
  CreateStructuredPropertyMutationVariables
>;

/**
 * __useCreateStructuredPropertyMutation__
 *
 * To run a mutation, you first call `useCreateStructuredPropertyMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useCreateStructuredPropertyMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [createStructuredPropertyMutation, { data, loading, error }] = useCreateStructuredPropertyMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useCreateStructuredPropertyMutation(
  baseOptions?: Apollo.MutationHookOptions<
    CreateStructuredPropertyMutation,
    CreateStructuredPropertyMutationVariables
  >,
) {
  return Apollo.useMutation<
    CreateStructuredPropertyMutation,
    CreateStructuredPropertyMutationVariables
  >(CreateStructuredPropertyDocument, baseOptions);
}
export type CreateStructuredPropertyMutationHookResult = ReturnType<
  typeof useCreateStructuredPropertyMutation
>;
export type CreateStructuredPropertyMutationResult =
  Apollo.MutationResult<CreateStructuredPropertyMutation>;
export type CreateStructuredPropertyMutationOptions =
  Apollo.BaseMutationOptions<
    CreateStructuredPropertyMutation,
    CreateStructuredPropertyMutationVariables
  >;
export const UpdateStructuredPropertyDocument = gql`
  mutation updateStructuredProperty($input: UpdateStructuredPropertyInput!) {
    updateStructuredProperty(input: $input) {
      ...structuredPropertyFields
    }
  }
  ${StructuredPropertyFieldsFragmentDoc}
`;
export type UpdateStructuredPropertyMutationFn = Apollo.MutationFunction<
  UpdateStructuredPropertyMutation,
  UpdateStructuredPropertyMutationVariables
>;

/**
 * __useUpdateStructuredPropertyMutation__
 *
 * To run a mutation, you first call `useUpdateStructuredPropertyMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateStructuredPropertyMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateStructuredPropertyMutation, { data, loading, error }] = useUpdateStructuredPropertyMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateStructuredPropertyMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateStructuredPropertyMutation,
    UpdateStructuredPropertyMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateStructuredPropertyMutation,
    UpdateStructuredPropertyMutationVariables
  >(UpdateStructuredPropertyDocument, baseOptions);
}
export type UpdateStructuredPropertyMutationHookResult = ReturnType<
  typeof useUpdateStructuredPropertyMutation
>;
export type UpdateStructuredPropertyMutationResult =
  Apollo.MutationResult<UpdateStructuredPropertyMutation>;
export type UpdateStructuredPropertyMutationOptions =
  Apollo.BaseMutationOptions<
    UpdateStructuredPropertyMutation,
    UpdateStructuredPropertyMutationVariables
  >;
export const DeleteStructuredPropertyDocument = gql`
  mutation deleteStructuredProperty($input: DeleteStructuredPropertyInput!) {
    deleteStructuredProperty(input: $input)
  }
`;
export type DeleteStructuredPropertyMutationFn = Apollo.MutationFunction<
  DeleteStructuredPropertyMutation,
  DeleteStructuredPropertyMutationVariables
>;

/**
 * __useDeleteStructuredPropertyMutation__
 *
 * To run a mutation, you first call `useDeleteStructuredPropertyMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useDeleteStructuredPropertyMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [deleteStructuredPropertyMutation, { data, loading, error }] = useDeleteStructuredPropertyMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useDeleteStructuredPropertyMutation(
  baseOptions?: Apollo.MutationHookOptions<
    DeleteStructuredPropertyMutation,
    DeleteStructuredPropertyMutationVariables
  >,
) {
  return Apollo.useMutation<
    DeleteStructuredPropertyMutation,
    DeleteStructuredPropertyMutationVariables
  >(DeleteStructuredPropertyDocument, baseOptions);
}
export type DeleteStructuredPropertyMutationHookResult = ReturnType<
  typeof useDeleteStructuredPropertyMutation
>;
export type DeleteStructuredPropertyMutationResult =
  Apollo.MutationResult<DeleteStructuredPropertyMutation>;
export type DeleteStructuredPropertyMutationOptions =
  Apollo.BaseMutationOptions<
    DeleteStructuredPropertyMutation,
    DeleteStructuredPropertyMutationVariables
  >;
