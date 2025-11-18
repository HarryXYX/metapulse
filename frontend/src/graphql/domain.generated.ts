/* eslint-disable */
import * as Types from "../types.generated";

import {
  ParentDomainsFieldsFragment,
  DisplayPropertiesFieldsFragment,
  OwnershipFieldsFragment,
  InstitutionalMemoryFieldsFragment,
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
  DomainEntitiesFieldsFragment,
} from "./fragments.generated";
import { AssetSettingsFieldsFragment } from "./settings.generated";
import { FacetFieldsFragment } from "./search.generated";
import { gql } from "@apollo/client";
import {
  ParentDomainsFieldsFragmentDoc,
  DisplayPropertiesFieldsFragmentDoc,
  OwnershipFieldsFragmentDoc,
  InstitutionalMemoryFieldsFragmentDoc,
  EntityPrivilegesFragmentDoc,
  AutoRenderAspectFieldsFragmentDoc,
  StructuredPropertiesFieldsFragmentDoc,
  FormsFieldsFragmentDoc,
  NotesFragmentDoc,
  EntityDomainFragmentDoc,
  GlobalTagsFieldsFragmentDoc,
  GlossaryTermsFragmentDoc,
  DomainEntitiesFieldsFragmentDoc,
} from "./fragments.generated";
import { AssetSettingsFieldsFragmentDoc } from "./settings.generated";
import { FacetFieldsFragmentDoc } from "./search.generated";
import * as Apollo from "@apollo/client";
export type GetDomainQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetDomainQuery = { __typename?: "Query" } & {
  domain?: Types.Maybe<
    { __typename?: "Domain" } & Pick<Types.Domain, "urn" | "id" | "type"> & {
        properties?: Types.Maybe<
          { __typename?: "DomainProperties" } & Pick<
            Types.DomainProperties,
            "name" | "description"
          > & {
              createdOn?: Types.Maybe<
                { __typename?: "ResolvedAuditStamp" } & Pick<
                  Types.ResolvedAuditStamp,
                  "time"
                >
              >;
            }
        >;
        parentDomains?: Types.Maybe<
          { __typename?: "ParentDomainsResult" } & ParentDomainsFieldsFragment
        >;
        ownership?: Types.Maybe<
          { __typename?: "Ownership" } & OwnershipFieldsFragment
        >;
        privileges?: Types.Maybe<
          { __typename?: "EntityPrivileges" } & EntityPrivilegesFragment
        >;
        institutionalMemory?: Types.Maybe<
          {
            __typename?: "InstitutionalMemory";
          } & InstitutionalMemoryFieldsFragment
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
        displayProperties?: Types.Maybe<
          { __typename?: "DisplayProperties" } & DisplayPropertiesFieldsFragment
        >;
        settings?: Types.Maybe<
          { __typename?: "AssetSettings" } & AssetSettingsFieldsFragment
        >;
      } & DomainEntitiesFieldsFragment &
      Notes_Domain_Fragment
  >;
};

export type ListDomainFragment = { __typename?: "Domain" } & Pick<
  Types.Domain,
  "urn" | "id" | "type"
> & {
    properties?: Types.Maybe<
      { __typename?: "DomainProperties" } & Pick<
        Types.DomainProperties,
        "name" | "description"
      >
    >;
    parentDomains?: Types.Maybe<
      { __typename?: "ParentDomainsResult" } & ParentDomainsFieldsFragment
    >;
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    displayProperties?: Types.Maybe<
      { __typename?: "DisplayProperties" } & DisplayPropertiesFieldsFragment
    >;
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
  } & DomainEntitiesFieldsFragment;

export type ListDomainsQueryVariables = Types.Exact<{
  input: Types.ListDomainsInput;
}>;

export type ListDomainsQuery = { __typename?: "Query" } & {
  listDomains?: Types.Maybe<
    { __typename?: "ListDomainsResult" } & Pick<
      Types.ListDomainsResult,
      "start" | "count" | "total"
    > & { domains: Array<{ __typename?: "Domain" } & ListDomainFragment> }
  >;
};

export type ScrollAcrossDomainsQueryVariables = Types.Exact<{
  input: Types.ScrollAcrossEntitiesInput;
}>;

export type ScrollAcrossDomainsQuery = { __typename?: "Query" } & {
  scrollAcrossEntities?: Types.Maybe<
    { __typename?: "ScrollResults" } & Pick<
      Types.ScrollResults,
      "nextScrollId" | "count" | "total"
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
              | ({ __typename?: "Domain" } & ListDomainFragment)
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

export type GetDomainChildrenCountQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetDomainChildrenCountQuery = { __typename?: "Query" } & {
  domain?: Types.Maybe<
    { __typename?: "Domain" } & Pick<Types.Domain, "urn" | "type"> & {
        children?: Types.Maybe<
          { __typename?: "EntityRelationshipsResult" } & Pick<
            Types.EntityRelationshipsResult,
            "total"
          >
        >;
      }
  >;
};

export type CreateDomainMutationVariables = Types.Exact<{
  input: Types.CreateDomainInput;
}>;

export type CreateDomainMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "createDomain"
>;

export type MoveDomainMutationVariables = Types.Exact<{
  input: Types.MoveDomainInput;
}>;

export type MoveDomainMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "moveDomain"
>;

export type DeleteDomainMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type DeleteDomainMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "deleteDomain"
>;

export type GetDomainEntitySummaryQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetDomainEntitySummaryQuery = { __typename?: "Query" } & {
  aggregateAcrossEntities?: Types.Maybe<
    { __typename?: "AggregateResults" } & {
      facets?: Types.Maybe<
        Array<{ __typename?: "FacetMetadata" } & FacetFieldsFragment>
      >;
    }
  >;
};

export const ListDomainFragmentDoc = gql`
  fragment ListDomain on Domain {
    urn
    id
    type
    properties {
      name
      description
    }
    parentDomains {
      ...parentDomainsFields
    }
    ownership {
      ...ownershipFields
    }
    displayProperties {
      ...displayPropertiesFields
    }
    ...domainEntitiesFields
    institutionalMemory {
      ...institutionalMemoryFields
    }
  }
  ${ParentDomainsFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${DisplayPropertiesFieldsFragmentDoc}
  ${DomainEntitiesFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
`;
export const GetDomainDocument = gql`
  query getDomain($urn: String!) {
    domain(urn: $urn) {
      urn
      id
      type
      properties {
        name
        description
        createdOn {
          time
        }
      }
      parentDomains {
        ...parentDomainsFields
      }
      ownership {
        ...ownershipFields
      }
      privileges {
        ...entityPrivileges
      }
      institutionalMemory {
        ...institutionalMemoryFields
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
      displayProperties {
        ...displayPropertiesFields
      }
      ...domainEntitiesFields
      ...notes
      settings {
        ...AssetSettingsFields
      }
    }
  }
  ${ParentDomainsFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${EntityPrivilegesFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
  ${AutoRenderAspectFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${FormsFieldsFragmentDoc}
  ${DisplayPropertiesFieldsFragmentDoc}
  ${DomainEntitiesFieldsFragmentDoc}
  ${NotesFragmentDoc}
  ${AssetSettingsFieldsFragmentDoc}
`;

/**
 * __useGetDomainQuery__
 *
 * To run a query within a React component, call `useGetDomainQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDomainQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDomainQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetDomainQuery(
  baseOptions: Apollo.QueryHookOptions<GetDomainQuery, GetDomainQueryVariables>,
) {
  return Apollo.useQuery<GetDomainQuery, GetDomainQueryVariables>(
    GetDomainDocument,
    baseOptions,
  );
}
export function useGetDomainLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDomainQuery,
    GetDomainQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetDomainQuery, GetDomainQueryVariables>(
    GetDomainDocument,
    baseOptions,
  );
}
export type GetDomainQueryHookResult = ReturnType<typeof useGetDomainQuery>;
export type GetDomainLazyQueryHookResult = ReturnType<
  typeof useGetDomainLazyQuery
>;
export type GetDomainQueryResult = Apollo.QueryResult<
  GetDomainQuery,
  GetDomainQueryVariables
>;
export const ListDomainsDocument = gql`
  query listDomains($input: ListDomainsInput!) {
    listDomains(input: $input) {
      start
      count
      total
      domains {
        ...ListDomain
      }
    }
  }
  ${ListDomainFragmentDoc}
`;

/**
 * __useListDomainsQuery__
 *
 * To run a query within a React component, call `useListDomainsQuery` and pass it any options that fit your needs.
 * When your component renders, `useListDomainsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useListDomainsQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useListDomainsQuery(
  baseOptions: Apollo.QueryHookOptions<
    ListDomainsQuery,
    ListDomainsQueryVariables
  >,
) {
  return Apollo.useQuery<ListDomainsQuery, ListDomainsQueryVariables>(
    ListDomainsDocument,
    baseOptions,
  );
}
export function useListDomainsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    ListDomainsQuery,
    ListDomainsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<ListDomainsQuery, ListDomainsQueryVariables>(
    ListDomainsDocument,
    baseOptions,
  );
}
export type ListDomainsQueryHookResult = ReturnType<typeof useListDomainsQuery>;
export type ListDomainsLazyQueryHookResult = ReturnType<
  typeof useListDomainsLazyQuery
>;
export type ListDomainsQueryResult = Apollo.QueryResult<
  ListDomainsQuery,
  ListDomainsQueryVariables
>;
export const ScrollAcrossDomainsDocument = gql`
  query scrollAcrossDomains($input: ScrollAcrossEntitiesInput!) {
    scrollAcrossEntities(input: $input) {
      nextScrollId
      count
      total
      searchResults {
        entity {
          ... on Domain {
            ...ListDomain
          }
        }
      }
    }
  }
  ${ListDomainFragmentDoc}
`;

/**
 * __useScrollAcrossDomainsQuery__
 *
 * To run a query within a React component, call `useScrollAcrossDomainsQuery` and pass it any options that fit your needs.
 * When your component renders, `useScrollAcrossDomainsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useScrollAcrossDomainsQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useScrollAcrossDomainsQuery(
  baseOptions: Apollo.QueryHookOptions<
    ScrollAcrossDomainsQuery,
    ScrollAcrossDomainsQueryVariables
  >,
) {
  return Apollo.useQuery<
    ScrollAcrossDomainsQuery,
    ScrollAcrossDomainsQueryVariables
  >(ScrollAcrossDomainsDocument, baseOptions);
}
export function useScrollAcrossDomainsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    ScrollAcrossDomainsQuery,
    ScrollAcrossDomainsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    ScrollAcrossDomainsQuery,
    ScrollAcrossDomainsQueryVariables
  >(ScrollAcrossDomainsDocument, baseOptions);
}
export type ScrollAcrossDomainsQueryHookResult = ReturnType<
  typeof useScrollAcrossDomainsQuery
>;
export type ScrollAcrossDomainsLazyQueryHookResult = ReturnType<
  typeof useScrollAcrossDomainsLazyQuery
>;
export type ScrollAcrossDomainsQueryResult = Apollo.QueryResult<
  ScrollAcrossDomainsQuery,
  ScrollAcrossDomainsQueryVariables
>;
export const GetDomainChildrenCountDocument = gql`
  query getDomainChildrenCount($urn: String!) {
    domain(urn: $urn) {
      urn
      type
      children: relationships(
        input: { types: ["IsPartOf"], direction: INCOMING, start: 0, count: 0 }
      ) {
        total
      }
    }
  }
`;

/**
 * __useGetDomainChildrenCountQuery__
 *
 * To run a query within a React component, call `useGetDomainChildrenCountQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDomainChildrenCountQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDomainChildrenCountQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetDomainChildrenCountQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDomainChildrenCountQuery,
    GetDomainChildrenCountQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetDomainChildrenCountQuery,
    GetDomainChildrenCountQueryVariables
  >(GetDomainChildrenCountDocument, baseOptions);
}
export function useGetDomainChildrenCountLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDomainChildrenCountQuery,
    GetDomainChildrenCountQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetDomainChildrenCountQuery,
    GetDomainChildrenCountQueryVariables
  >(GetDomainChildrenCountDocument, baseOptions);
}
export type GetDomainChildrenCountQueryHookResult = ReturnType<
  typeof useGetDomainChildrenCountQuery
>;
export type GetDomainChildrenCountLazyQueryHookResult = ReturnType<
  typeof useGetDomainChildrenCountLazyQuery
>;
export type GetDomainChildrenCountQueryResult = Apollo.QueryResult<
  GetDomainChildrenCountQuery,
  GetDomainChildrenCountQueryVariables
>;
export const CreateDomainDocument = gql`
  mutation createDomain($input: CreateDomainInput!) {
    createDomain(input: $input)
  }
`;
export type CreateDomainMutationFn = Apollo.MutationFunction<
  CreateDomainMutation,
  CreateDomainMutationVariables
>;

/**
 * __useCreateDomainMutation__
 *
 * To run a mutation, you first call `useCreateDomainMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useCreateDomainMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [createDomainMutation, { data, loading, error }] = useCreateDomainMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useCreateDomainMutation(
  baseOptions?: Apollo.MutationHookOptions<
    CreateDomainMutation,
    CreateDomainMutationVariables
  >,
) {
  return Apollo.useMutation<
    CreateDomainMutation,
    CreateDomainMutationVariables
  >(CreateDomainDocument, baseOptions);
}
export type CreateDomainMutationHookResult = ReturnType<
  typeof useCreateDomainMutation
>;
export type CreateDomainMutationResult =
  Apollo.MutationResult<CreateDomainMutation>;
export type CreateDomainMutationOptions = Apollo.BaseMutationOptions<
  CreateDomainMutation,
  CreateDomainMutationVariables
>;
export const MoveDomainDocument = gql`
  mutation moveDomain($input: MoveDomainInput!) {
    moveDomain(input: $input)
  }
`;
export type MoveDomainMutationFn = Apollo.MutationFunction<
  MoveDomainMutation,
  MoveDomainMutationVariables
>;

/**
 * __useMoveDomainMutation__
 *
 * To run a mutation, you first call `useMoveDomainMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useMoveDomainMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [moveDomainMutation, { data, loading, error }] = useMoveDomainMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useMoveDomainMutation(
  baseOptions?: Apollo.MutationHookOptions<
    MoveDomainMutation,
    MoveDomainMutationVariables
  >,
) {
  return Apollo.useMutation<MoveDomainMutation, MoveDomainMutationVariables>(
    MoveDomainDocument,
    baseOptions,
  );
}
export type MoveDomainMutationHookResult = ReturnType<
  typeof useMoveDomainMutation
>;
export type MoveDomainMutationResult =
  Apollo.MutationResult<MoveDomainMutation>;
export type MoveDomainMutationOptions = Apollo.BaseMutationOptions<
  MoveDomainMutation,
  MoveDomainMutationVariables
>;
export const DeleteDomainDocument = gql`
  mutation deleteDomain($urn: String!) {
    deleteDomain(urn: $urn)
  }
`;
export type DeleteDomainMutationFn = Apollo.MutationFunction<
  DeleteDomainMutation,
  DeleteDomainMutationVariables
>;

/**
 * __useDeleteDomainMutation__
 *
 * To run a mutation, you first call `useDeleteDomainMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useDeleteDomainMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [deleteDomainMutation, { data, loading, error }] = useDeleteDomainMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useDeleteDomainMutation(
  baseOptions?: Apollo.MutationHookOptions<
    DeleteDomainMutation,
    DeleteDomainMutationVariables
  >,
) {
  return Apollo.useMutation<
    DeleteDomainMutation,
    DeleteDomainMutationVariables
  >(DeleteDomainDocument, baseOptions);
}
export type DeleteDomainMutationHookResult = ReturnType<
  typeof useDeleteDomainMutation
>;
export type DeleteDomainMutationResult =
  Apollo.MutationResult<DeleteDomainMutation>;
export type DeleteDomainMutationOptions = Apollo.BaseMutationOptions<
  DeleteDomainMutation,
  DeleteDomainMutationVariables
>;
export const GetDomainEntitySummaryDocument = gql`
  query getDomainEntitySummary($urn: String!) {
    aggregateAcrossEntities(
      input: {
        types: []
        query: "*"
        facets: ["_entityType␞typeNames", "_entityType"]
        orFilters: [
          {
            and: [
              {
                field: "_entityType"
                values: ["DATA_PRODUCT"]
                value: "DATA_PRODUCT"
                negated: true
              }
              { field: "domains", values: [$urn], value: $urn }
            ]
          }
        ]
        searchFlags: { skipCache: true }
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
 * __useGetDomainEntitySummaryQuery__
 *
 * To run a query within a React component, call `useGetDomainEntitySummaryQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDomainEntitySummaryQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDomainEntitySummaryQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetDomainEntitySummaryQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDomainEntitySummaryQuery,
    GetDomainEntitySummaryQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetDomainEntitySummaryQuery,
    GetDomainEntitySummaryQueryVariables
  >(GetDomainEntitySummaryDocument, baseOptions);
}
export function useGetDomainEntitySummaryLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDomainEntitySummaryQuery,
    GetDomainEntitySummaryQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetDomainEntitySummaryQuery,
    GetDomainEntitySummaryQueryVariables
  >(GetDomainEntitySummaryDocument, baseOptions);
}
export type GetDomainEntitySummaryQueryHookResult = ReturnType<
  typeof useGetDomainEntitySummaryQuery
>;
export type GetDomainEntitySummaryLazyQueryHookResult = ReturnType<
  typeof useGetDomainEntitySummaryLazyQuery
>;
export type GetDomainEntitySummaryQueryResult = Apollo.QueryResult<
  GetDomainEntitySummaryQuery,
  GetDomainEntitySummaryQueryVariables
>;
