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
import { FullRelationshipResultsFragment } from "./relationships.generated";
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
import { FullRelationshipResultsFragmentDoc } from "./relationships.generated";
import * as Apollo from "@apollo/client";
export type GetChartQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetChartQuery = { __typename?: "Query" } & {
  chart?: Types.Maybe<
    { __typename?: "Chart" } & Pick<
      Types.Chart,
      "urn" | "type" | "exists" | "lastIngested" | "tool" | "chartId"
    > & {
        platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
        properties?: Types.Maybe<
          { __typename?: "ChartProperties" } & Pick<
            Types.ChartProperties,
            | "name"
            | "description"
            | "externalUrl"
            | "type"
            | "access"
            | "lastRefreshed"
          > & {
              lastModified: { __typename?: "AuditStamp" } & Pick<
                Types.AuditStamp,
                "time"
              >;
              created: { __typename?: "AuditStamp" } & Pick<
                Types.AuditStamp,
                "time"
              >;
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
        query?: Types.Maybe<
          { __typename?: "ChartQuery" } & Pick<
            Types.ChartQuery,
            "rawQuery" | "type"
          >
        >;
        ownership?: Types.Maybe<
          { __typename?: "Ownership" } & OwnershipFieldsFragment
        >;
        globalTags?: Types.Maybe<
          { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
        >;
        editableProperties?: Types.Maybe<
          { __typename?: "ChartEditableProperties" } & Pick<
            Types.ChartEditableProperties,
            "description"
          >
        >;
        institutionalMemory?: Types.Maybe<
          {
            __typename?: "InstitutionalMemory";
          } & InstitutionalMemoryFieldsFragment
        >;
        glossaryTerms?: Types.Maybe<
          { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
        >;
        domain?: Types.Maybe<
          { __typename?: "DomainAssociation" } & EntityDomainFragment
        >;
        application?: Types.Maybe<
          { __typename?: "ApplicationAssociation" } & EntityApplicationFragment
        >;
        deprecation?: Types.Maybe<
          { __typename?: "Deprecation" } & DeprecationFieldsFragment
        >;
        embed?: Types.Maybe<{ __typename?: "Embed" } & EmbedFieldsFragment>;
        inputs?: Types.Maybe<
          {
            __typename?: "EntityRelationshipsResult";
          } & FullRelationshipResultsFragment
        >;
        dashboards?: Types.Maybe<
          {
            __typename?: "EntityRelationshipsResult";
          } & FullRelationshipResultsFragment
        >;
        parentContainers?: Types.Maybe<
          {
            __typename?: "ParentContainersResult";
          } & ParentContainersFieldsFragment
        >;
        status?: Types.Maybe<
          { __typename?: "Status" } & Pick<Types.Status, "removed">
        >;
        dataPlatformInstance?: Types.Maybe<
          {
            __typename?: "DataPlatformInstance";
          } & DataPlatformInstanceFieldsFragment
        >;
        browsePathV2?: Types.Maybe<
          { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
        >;
        statsSummary?: Types.Maybe<
          { __typename?: "ChartStatsSummary" } & Pick<
            Types.ChartStatsSummary,
            "viewCount" | "uniqueUserCountLast30Days"
          > & {
              topUsersLast30Days?: Types.Maybe<
                Array<
                  { __typename?: "CorpUser" } & Pick<
                    Types.CorpUser,
                    "urn" | "type" | "username"
                  > & {
                      properties?: Types.Maybe<
                        { __typename?: "CorpUserProperties" } & Pick<
                          Types.CorpUserProperties,
                          "displayName" | "firstName" | "lastName" | "fullName"
                        >
                      >;
                      editableProperties?: Types.Maybe<
                        { __typename?: "CorpUserEditableProperties" } & Pick<
                          Types.CorpUserEditableProperties,
                          "displayName" | "pictureLink"
                        >
                      >;
                    }
                >
              >;
            }
        >;
        inputFields?: Types.Maybe<
          { __typename?: "InputFields" } & InputFieldsFieldsFragment
        >;
        privileges?: Types.Maybe<
          { __typename?: "EntityPrivileges" } & EntityPrivilegesFragment
        >;
        subTypes?: Types.Maybe<
          { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
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
        health?: Types.Maybe<
          Array<{ __typename?: "Health" } & EntityHealthFragment>
        >;
        activeIncidents?: Types.Maybe<
          { __typename?: "EntityIncidentsResult" } & Pick<
            Types.EntityIncidentsResult,
            "total"
          >
        >;
        forms?: Types.Maybe<{ __typename?: "Forms" } & FormsFieldsFragment>;
      } & EntityDataProduct_Chart_Fragment &
      Notes_Chart_Fragment
  >;
};

export type UpdateChartMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  input: Types.ChartUpdateInput;
}>;

export type UpdateChartMutation = { __typename?: "Mutation" } & {
  updateChart?: Types.Maybe<
    { __typename?: "Chart" } & Pick<Types.Chart, "urn">
  >;
};

export const GetChartDocument = gql`
  query getChart($urn: String!) {
    chart(urn: $urn) {
      urn
      type
      exists
      lastIngested
      tool
      chartId
      platform {
        ...platformFields
      }
      properties {
        name
        description
        externalUrl
        type
        access
        lastRefreshed
        lastModified {
          time
        }
        created {
          time
        }
        customProperties {
          key
          value
        }
      }
      query {
        rawQuery
        type
      }
      ownership {
        ...ownershipFields
      }
      globalTags {
        ...globalTagsFields
      }
      editableProperties {
        description
      }
      institutionalMemory {
        ...institutionalMemoryFields
      }
      glossaryTerms {
        ...glossaryTerms
      }
      domain {
        ...entityDomain
      }
      application {
        ...entityApplication
      }
      ...entityDataProduct
      deprecation {
        ...deprecationFields
      }
      embed {
        ...embedFields
      }
      inputs: relationships(
        input: {
          types: ["Consumes"]
          direction: OUTGOING
          start: 0
          count: 100
        }
      ) {
        ...fullRelationshipResults
      }
      dashboards: relationships(
        input: {
          types: ["Contains"]
          direction: INCOMING
          start: 0
          count: 100
        }
      ) {
        ...fullRelationshipResults
      }
      parentContainers {
        ...parentContainersFields
      }
      status {
        removed
      }
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
      browsePathV2 {
        ...browsePathV2Fields
      }
      statsSummary {
        viewCount
        uniqueUserCountLast30Days
        topUsersLast30Days {
          urn
          type
          username
          properties {
            displayName
            firstName
            lastName
            fullName
          }
          editableProperties {
            displayName
            pictureLink
          }
        }
      }
      inputFields {
        ...inputFieldsFields
      }
      privileges {
        ...entityPrivileges
      }
      subTypes {
        typeNames
      }
      autoRenderAspects: aspects(input: { autoRenderOnly: true }) {
        ...autoRenderAspectFields
      }
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
      health {
        ...entityHealth
      }
      activeIncidents: incidents(start: 0, count: 1, state: ACTIVE) {
        total
      }
      forms {
        ...formsFields
      }
      ...notes
    }
  }
  ${PlatformFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityApplicationFragmentDoc}
  ${EntityDataProductFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${EmbedFieldsFragmentDoc}
  ${FullRelationshipResultsFragmentDoc}
  ${ParentContainersFieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${BrowsePathV2FieldsFragmentDoc}
  ${InputFieldsFieldsFragmentDoc}
  ${EntityPrivilegesFragmentDoc}
  ${AutoRenderAspectFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${EntityHealthFragmentDoc}
  ${FormsFieldsFragmentDoc}
  ${NotesFragmentDoc}
`;

/**
 * __useGetChartQuery__
 *
 * To run a query within a React component, call `useGetChartQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetChartQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetChartQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetChartQuery(
  baseOptions: Apollo.QueryHookOptions<GetChartQuery, GetChartQueryVariables>,
) {
  return Apollo.useQuery<GetChartQuery, GetChartQueryVariables>(
    GetChartDocument,
    baseOptions,
  );
}
export function useGetChartLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetChartQuery,
    GetChartQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetChartQuery, GetChartQueryVariables>(
    GetChartDocument,
    baseOptions,
  );
}
export type GetChartQueryHookResult = ReturnType<typeof useGetChartQuery>;
export type GetChartLazyQueryHookResult = ReturnType<
  typeof useGetChartLazyQuery
>;
export type GetChartQueryResult = Apollo.QueryResult<
  GetChartQuery,
  GetChartQueryVariables
>;
export const UpdateChartDocument = gql`
  mutation updateChart($urn: String!, $input: ChartUpdateInput!) {
    updateChart(urn: $urn, input: $input) {
      urn
    }
  }
`;
export type UpdateChartMutationFn = Apollo.MutationFunction<
  UpdateChartMutation,
  UpdateChartMutationVariables
>;

/**
 * __useUpdateChartMutation__
 *
 * To run a mutation, you first call `useUpdateChartMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateChartMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateChartMutation, { data, loading, error }] = useUpdateChartMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateChartMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateChartMutation,
    UpdateChartMutationVariables
  >,
) {
  return Apollo.useMutation<UpdateChartMutation, UpdateChartMutationVariables>(
    UpdateChartDocument,
    baseOptions,
  );
}
export type UpdateChartMutationHookResult = ReturnType<
  typeof useUpdateChartMutation
>;
export type UpdateChartMutationResult =
  Apollo.MutationResult<UpdateChartMutation>;
export type UpdateChartMutationOptions = Apollo.BaseMutationOptions<
  UpdateChartMutation,
  UpdateChartMutationVariables
>;
