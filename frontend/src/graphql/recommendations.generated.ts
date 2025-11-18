/* eslint-disable */
import * as Types from "../types.generated";

import {
  EntityPreview_AccessTokenMetadata_Fragment,
  EntityPreview_Application_Fragment,
  EntityPreview_Assertion_Fragment,
  EntityPreview_BusinessAttribute_Fragment,
  EntityPreview_Chart_Fragment,
  EntityPreview_Container_Fragment,
  EntityPreview_CorpGroup_Fragment,
  EntityPreview_CorpUser_Fragment,
  EntityPreview_Dashboard_Fragment,
  EntityPreview_DataContract_Fragment,
  EntityPreview_DataFlow_Fragment,
  EntityPreview_DataHubConnection_Fragment,
  EntityPreview_DataHubFile_Fragment,
  EntityPreview_DataHubPageModule_Fragment,
  EntityPreview_DataHubPageTemplate_Fragment,
  EntityPreview_DataHubPolicy_Fragment,
  EntityPreview_DataHubRole_Fragment,
  EntityPreview_DataHubView_Fragment,
  EntityPreview_DataJob_Fragment,
  EntityPreview_DataPlatform_Fragment,
  EntityPreview_DataPlatformInstance_Fragment,
  EntityPreview_DataProcessInstance_Fragment,
  EntityPreview_DataProduct_Fragment,
  EntityPreview_DataTypeEntity_Fragment,
  EntityPreview_Dataset_Fragment,
  EntityPreview_Domain_Fragment,
  EntityPreview_ErModelRelationship_Fragment,
  EntityPreview_EntityTypeEntity_Fragment,
  EntityPreview_ExecutionRequest_Fragment,
  EntityPreview_Form_Fragment,
  EntityPreview_GlossaryNode_Fragment,
  EntityPreview_GlossaryTerm_Fragment,
  EntityPreview_Incident_Fragment,
  EntityPreview_MlFeature_Fragment,
  EntityPreview_MlFeatureTable_Fragment,
  EntityPreview_MlModel_Fragment,
  EntityPreview_MlModelGroup_Fragment,
  EntityPreview_MlPrimaryKey_Fragment,
  EntityPreview_Notebook_Fragment,
  EntityPreview_OwnershipTypeEntity_Fragment,
  EntityPreview_Post_Fragment,
  EntityPreview_QueryEntity_Fragment,
  EntityPreview_Restricted_Fragment,
  EntityPreview_Role_Fragment,
  EntityPreview_SchemaFieldEntity_Fragment,
  EntityPreview_StructuredPropertyEntity_Fragment,
  EntityPreview_Tag_Fragment,
  EntityPreview_Test_Fragment,
  EntityPreview_VersionSet_Fragment,
  EntityPreview_VersionedDataset_Fragment,
} from "./preview.generated";
import { gql } from "@apollo/client";
import { EntityPreviewFragmentDoc } from "./preview.generated";
import * as Apollo from "@apollo/client";
export type ListRecommendationsQueryVariables = Types.Exact<{
  input: Types.ListRecommendationsInput;
}>;

export type ListRecommendationsQuery = { __typename?: "Query" } & {
  listRecommendations?: Types.Maybe<
    { __typename?: "ListRecommendationsResult" } & {
      modules: Array<
        { __typename?: "RecommendationModule" } & Pick<
          Types.RecommendationModule,
          "title" | "moduleId" | "renderType"
        > & {
            content: Array<
              { __typename?: "RecommendationContent" } & Pick<
                Types.RecommendationContent,
                "value"
              > & {
                  entity?: Types.Maybe<
                    | ({
                        __typename?: "AccessTokenMetadata";
                      } & EntityPreview_AccessTokenMetadata_Fragment)
                    | ({
                        __typename?: "Application";
                      } & EntityPreview_Application_Fragment)
                    | ({
                        __typename?: "Assertion";
                      } & EntityPreview_Assertion_Fragment)
                    | ({
                        __typename?: "BusinessAttribute";
                      } & EntityPreview_BusinessAttribute_Fragment)
                    | ({ __typename?: "Chart" } & EntityPreview_Chart_Fragment)
                    | ({
                        __typename?: "Container";
                      } & EntityPreview_Container_Fragment)
                    | ({
                        __typename?: "CorpGroup";
                      } & EntityPreview_CorpGroup_Fragment)
                    | ({
                        __typename?: "CorpUser";
                      } & EntityPreview_CorpUser_Fragment)
                    | ({
                        __typename?: "Dashboard";
                      } & EntityPreview_Dashboard_Fragment)
                    | ({
                        __typename?: "DataContract";
                      } & EntityPreview_DataContract_Fragment)
                    | ({
                        __typename?: "DataFlow";
                      } & EntityPreview_DataFlow_Fragment)
                    | ({
                        __typename?: "DataHubConnection";
                      } & EntityPreview_DataHubConnection_Fragment)
                    | ({
                        __typename?: "DataHubFile";
                      } & EntityPreview_DataHubFile_Fragment)
                    | ({
                        __typename?: "DataHubPageModule";
                      } & EntityPreview_DataHubPageModule_Fragment)
                    | ({
                        __typename?: "DataHubPageTemplate";
                      } & EntityPreview_DataHubPageTemplate_Fragment)
                    | ({
                        __typename?: "DataHubPolicy";
                      } & EntityPreview_DataHubPolicy_Fragment)
                    | ({
                        __typename?: "DataHubRole";
                      } & EntityPreview_DataHubRole_Fragment)
                    | ({
                        __typename?: "DataHubView";
                      } & EntityPreview_DataHubView_Fragment)
                    | ({
                        __typename?: "DataJob";
                      } & EntityPreview_DataJob_Fragment)
                    | ({
                        __typename?: "DataPlatform";
                      } & EntityPreview_DataPlatform_Fragment)
                    | ({
                        __typename?: "DataPlatformInstance";
                      } & EntityPreview_DataPlatformInstance_Fragment)
                    | ({
                        __typename?: "DataProcessInstance";
                      } & EntityPreview_DataProcessInstance_Fragment)
                    | ({
                        __typename?: "DataProduct";
                      } & EntityPreview_DataProduct_Fragment)
                    | ({
                        __typename?: "DataTypeEntity";
                      } & EntityPreview_DataTypeEntity_Fragment)
                    | ({
                        __typename?: "Dataset";
                      } & EntityPreview_Dataset_Fragment)
                    | ({
                        __typename?: "Domain";
                      } & EntityPreview_Domain_Fragment)
                    | ({
                        __typename?: "ERModelRelationship";
                      } & EntityPreview_ErModelRelationship_Fragment)
                    | ({
                        __typename?: "EntityTypeEntity";
                      } & EntityPreview_EntityTypeEntity_Fragment)
                    | ({
                        __typename?: "ExecutionRequest";
                      } & EntityPreview_ExecutionRequest_Fragment)
                    | ({ __typename?: "Form" } & EntityPreview_Form_Fragment)
                    | ({
                        __typename?: "GlossaryNode";
                      } & EntityPreview_GlossaryNode_Fragment)
                    | ({
                        __typename?: "GlossaryTerm";
                      } & EntityPreview_GlossaryTerm_Fragment)
                    | ({
                        __typename?: "Incident";
                      } & EntityPreview_Incident_Fragment)
                    | ({
                        __typename?: "MLFeature";
                      } & EntityPreview_MlFeature_Fragment)
                    | ({
                        __typename?: "MLFeatureTable";
                      } & EntityPreview_MlFeatureTable_Fragment)
                    | ({
                        __typename?: "MLModel";
                      } & EntityPreview_MlModel_Fragment)
                    | ({
                        __typename?: "MLModelGroup";
                      } & EntityPreview_MlModelGroup_Fragment)
                    | ({
                        __typename?: "MLPrimaryKey";
                      } & EntityPreview_MlPrimaryKey_Fragment)
                    | ({
                        __typename?: "Notebook";
                      } & EntityPreview_Notebook_Fragment)
                    | ({
                        __typename?: "OwnershipTypeEntity";
                      } & EntityPreview_OwnershipTypeEntity_Fragment)
                    | ({ __typename?: "Post" } & EntityPreview_Post_Fragment)
                    | ({
                        __typename?: "QueryEntity";
                      } & EntityPreview_QueryEntity_Fragment)
                    | ({
                        __typename?: "Restricted";
                      } & EntityPreview_Restricted_Fragment)
                    | ({ __typename?: "Role" } & EntityPreview_Role_Fragment)
                    | ({
                        __typename?: "SchemaFieldEntity";
                      } & EntityPreview_SchemaFieldEntity_Fragment)
                    | ({
                        __typename?: "StructuredPropertyEntity";
                      } & EntityPreview_StructuredPropertyEntity_Fragment)
                    | ({ __typename?: "Tag" } & EntityPreview_Tag_Fragment)
                    | ({ __typename?: "Test" } & EntityPreview_Test_Fragment)
                    | ({
                        __typename?: "VersionSet";
                      } & EntityPreview_VersionSet_Fragment)
                    | ({
                        __typename?: "VersionedDataset";
                      } & EntityPreview_VersionedDataset_Fragment)
                  >;
                  params?: Types.Maybe<
                    { __typename?: "RecommendationParams" } & {
                      searchParams?: Types.Maybe<
                        { __typename?: "SearchParams" } & Pick<
                          Types.SearchParams,
                          "types" | "query"
                        > & {
                            filters?: Types.Maybe<
                              Array<
                                { __typename?: "FacetFilter" } & Pick<
                                  Types.FacetFilter,
                                  "field" | "values"
                                >
                              >
                            >;
                          }
                      >;
                      entityProfileParams?: Types.Maybe<
                        { __typename?: "EntityProfileParams" } & Pick<
                          Types.EntityProfileParams,
                          "urn"
                        >
                      >;
                      contentParams?: Types.Maybe<
                        { __typename?: "ContentParams" } & Pick<
                          Types.ContentParams,
                          "count"
                        >
                      >;
                    }
                  >;
                }
            >;
          }
      >;
    }
  >;
};

export const ListRecommendationsDocument = gql`
  query listRecommendations($input: ListRecommendationsInput!) {
    listRecommendations(input: $input) {
      modules {
        title
        moduleId
        renderType
        content {
          value
          entity {
            ...entityPreview
          }
          params {
            searchParams {
              types
              query
              filters {
                field
                values
              }
            }
            entityProfileParams {
              urn
            }
            contentParams {
              count
            }
          }
        }
      }
    }
  }
  ${EntityPreviewFragmentDoc}
`;

/**
 * __useListRecommendationsQuery__
 *
 * To run a query within a React component, call `useListRecommendationsQuery` and pass it any options that fit your needs.
 * When your component renders, `useListRecommendationsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useListRecommendationsQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useListRecommendationsQuery(
  baseOptions: Apollo.QueryHookOptions<
    ListRecommendationsQuery,
    ListRecommendationsQueryVariables
  >,
) {
  return Apollo.useQuery<
    ListRecommendationsQuery,
    ListRecommendationsQueryVariables
  >(ListRecommendationsDocument, baseOptions);
}
export function useListRecommendationsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    ListRecommendationsQuery,
    ListRecommendationsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    ListRecommendationsQuery,
    ListRecommendationsQueryVariables
  >(ListRecommendationsDocument, baseOptions);
}
export type ListRecommendationsQueryHookResult = ReturnType<
  typeof useListRecommendationsQuery
>;
export type ListRecommendationsLazyQueryHookResult = ReturnType<
  typeof useListRecommendationsLazyQuery
>;
export type ListRecommendationsQueryResult = Apollo.QueryResult<
  ListRecommendationsQuery,
  ListRecommendationsQueryVariables
>;
