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
export type GetSchemaFieldQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetSchemaFieldQuery = { __typename?: "Query" } & {
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
      > &
        SchemaFieldEntityFieldsFragment)
    | ({ __typename?: "StructuredPropertyEntity" } & Pick<
        Types.StructuredPropertyEntity,
        "urn" | "type"
      >)
    | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn" | "type">)
    | ({ __typename?: "Test" } & Pick<Types.Test, "urn" | "type">)
    | ({ __typename?: "VersionSet" } & Pick<Types.VersionSet, "urn" | "type">)
    | ({ __typename?: "VersionedDataset" } & Pick<
        Types.VersionedDataset,
        "urn" | "type"
      >)
  >;
};

export type SchemaFieldEntityFieldsFragment = {
  __typename?: "SchemaFieldEntity";
} & Pick<Types.SchemaFieldEntity, "urn" | "fieldPath" | "type"> & {
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
    businessAttributes?: Types.Maybe<
      { __typename?: "BusinessAttributes" } & {
        businessAttribute?: Types.Maybe<
          {
            __typename?: "BusinessAttributeAssociation";
          } & BusinessAttributeFragment
        >;
      }
    >;
    documentation?: Types.Maybe<
      { __typename?: "Documentation" } & DocumentationFieldsFragment
    >;
    tags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
    >;
    parent:
      | ({ __typename?: "AccessTokenMetadata" } & Pick<
          Types.AccessTokenMetadata,
          "urn" | "type"
        > &
          EntityDisplayNameFields_AccessTokenMetadata_Fragment)
      | ({ __typename?: "Application" } & Pick<
          Types.Application,
          "urn" | "type"
        > &
          EntityDisplayNameFields_Application_Fragment)
      | ({ __typename?: "Assertion" } & Pick<Types.Assertion, "urn" | "type"> &
          EntityDisplayNameFields_Assertion_Fragment)
      | ({ __typename?: "BusinessAttribute" } & Pick<
          Types.BusinessAttribute,
          "urn" | "type"
        > &
          EntityDisplayNameFields_BusinessAttribute_Fragment)
      | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type"> & {
            platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
            subTypes?: Types.Maybe<
              { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
            >;
          } & EntityDisplayNameFields_Chart_Fragment)
      | ({ __typename?: "Container" } & Pick<Types.Container, "urn" | "type"> &
          EntityDisplayNameFields_Container_Fragment)
      | ({ __typename?: "CorpGroup" } & Pick<Types.CorpGroup, "urn" | "type"> &
          EntityDisplayNameFields_CorpGroup_Fragment)
      | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type"> &
          EntityDisplayNameFields_CorpUser_Fragment)
      | ({ __typename?: "Dashboard" } & Pick<
          Types.Dashboard,
          "urn" | "type"
        > & {
            platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
            subTypes?: Types.Maybe<
              { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
            >;
          } & EntityDisplayNameFields_Dashboard_Fragment)
      | ({ __typename?: "DataContract" } & Pick<
          Types.DataContract,
          "urn" | "type"
        > &
          EntityDisplayNameFields_DataContract_Fragment)
      | ({ __typename?: "DataFlow" } & Pick<Types.DataFlow, "urn" | "type"> &
          EntityDisplayNameFields_DataFlow_Fragment)
      | ({ __typename?: "DataHubConnection" } & Pick<
          Types.DataHubConnection,
          "urn" | "type"
        > &
          EntityDisplayNameFields_DataHubConnection_Fragment)
      | ({ __typename?: "DataHubFile" } & Pick<
          Types.DataHubFile,
          "urn" | "type"
        > &
          EntityDisplayNameFields_DataHubFile_Fragment)
      | ({ __typename?: "DataHubPageModule" } & Pick<
          Types.DataHubPageModule,
          "urn" | "type"
        > &
          EntityDisplayNameFields_DataHubPageModule_Fragment)
      | ({ __typename?: "DataHubPageTemplate" } & Pick<
          Types.DataHubPageTemplate,
          "urn" | "type"
        > &
          EntityDisplayNameFields_DataHubPageTemplate_Fragment)
      | ({ __typename?: "DataHubPolicy" } & Pick<
          Types.DataHubPolicy,
          "urn" | "type"
        > &
          EntityDisplayNameFields_DataHubPolicy_Fragment)
      | ({ __typename?: "DataHubRole" } & Pick<
          Types.DataHubRole,
          "urn" | "type"
        > &
          EntityDisplayNameFields_DataHubRole_Fragment)
      | ({ __typename?: "DataHubView" } & Pick<
          Types.DataHubView,
          "urn" | "type"
        > &
          EntityDisplayNameFields_DataHubView_Fragment)
      | ({ __typename?: "DataJob" } & Pick<Types.DataJob, "urn" | "type"> &
          EntityDisplayNameFields_DataJob_Fragment)
      | ({ __typename?: "DataPlatform" } & Pick<
          Types.DataPlatform,
          "urn" | "type"
        > &
          EntityDisplayNameFields_DataPlatform_Fragment)
      | ({ __typename?: "DataPlatformInstance" } & Pick<
          Types.DataPlatformInstance,
          "urn" | "type"
        > &
          EntityDisplayNameFields_DataPlatformInstance_Fragment)
      | ({ __typename?: "DataProcessInstance" } & Pick<
          Types.DataProcessInstance,
          "urn" | "type"
        > &
          EntityDisplayNameFields_DataProcessInstance_Fragment)
      | ({ __typename?: "DataProduct" } & Pick<
          Types.DataProduct,
          "urn" | "type"
        > &
          EntityDisplayNameFields_DataProduct_Fragment)
      | ({ __typename?: "DataTypeEntity" } & Pick<
          Types.DataTypeEntity,
          "urn" | "type"
        > &
          EntityDisplayNameFields_DataTypeEntity_Fragment)
      | ({ __typename?: "Dataset" } & Pick<Types.Dataset, "urn" | "type"> & {
            platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
            subTypes?: Types.Maybe<
              { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
            >;
            privileges?: Types.Maybe<
              { __typename?: "EntityPrivileges" } & EntityPrivilegesFragment
            >;
          } & EntityDisplayNameFields_Dataset_Fragment)
      | ({ __typename?: "Domain" } & Pick<Types.Domain, "urn" | "type"> &
          EntityDisplayNameFields_Domain_Fragment)
      | ({ __typename?: "ERModelRelationship" } & Pick<
          Types.ErModelRelationship,
          "urn" | "type"
        > &
          EntityDisplayNameFields_ErModelRelationship_Fragment)
      | ({ __typename?: "EntityTypeEntity" } & Pick<
          Types.EntityTypeEntity,
          "urn" | "type"
        > &
          EntityDisplayNameFields_EntityTypeEntity_Fragment)
      | ({ __typename?: "ExecutionRequest" } & Pick<
          Types.ExecutionRequest,
          "urn" | "type"
        > &
          EntityDisplayNameFields_ExecutionRequest_Fragment)
      | ({ __typename?: "Form" } & Pick<Types.Form, "urn" | "type"> &
          EntityDisplayNameFields_Form_Fragment)
      | ({ __typename?: "GlossaryNode" } & Pick<
          Types.GlossaryNode,
          "urn" | "type"
        > &
          EntityDisplayNameFields_GlossaryNode_Fragment)
      | ({ __typename?: "GlossaryTerm" } & Pick<
          Types.GlossaryTerm,
          "urn" | "type"
        > &
          EntityDisplayNameFields_GlossaryTerm_Fragment)
      | ({ __typename?: "Incident" } & Pick<Types.Incident, "urn" | "type"> &
          EntityDisplayNameFields_Incident_Fragment)
      | ({ __typename?: "MLFeature" } & Pick<Types.MlFeature, "urn" | "type"> &
          EntityDisplayNameFields_MlFeature_Fragment)
      | ({ __typename?: "MLFeatureTable" } & Pick<
          Types.MlFeatureTable,
          "urn" | "type"
        > &
          EntityDisplayNameFields_MlFeatureTable_Fragment)
      | ({ __typename?: "MLModel" } & Pick<Types.MlModel, "urn" | "type"> &
          EntityDisplayNameFields_MlModel_Fragment)
      | ({ __typename?: "MLModelGroup" } & Pick<
          Types.MlModelGroup,
          "urn" | "type"
        > &
          EntityDisplayNameFields_MlModelGroup_Fragment)
      | ({ __typename?: "MLPrimaryKey" } & Pick<
          Types.MlPrimaryKey,
          "urn" | "type"
        > &
          EntityDisplayNameFields_MlPrimaryKey_Fragment)
      | ({ __typename?: "Notebook" } & Pick<Types.Notebook, "urn" | "type"> &
          EntityDisplayNameFields_Notebook_Fragment)
      | ({ __typename?: "OwnershipTypeEntity" } & Pick<
          Types.OwnershipTypeEntity,
          "urn" | "type"
        > &
          EntityDisplayNameFields_OwnershipTypeEntity_Fragment)
      | ({ __typename?: "Post" } & Pick<Types.Post, "urn" | "type"> &
          EntityDisplayNameFields_Post_Fragment)
      | ({ __typename?: "QueryEntity" } & Pick<
          Types.QueryEntity,
          "urn" | "type"
        > &
          EntityDisplayNameFields_QueryEntity_Fragment)
      | ({ __typename?: "Restricted" } & Pick<
          Types.Restricted,
          "urn" | "type"
        > &
          EntityDisplayNameFields_Restricted_Fragment)
      | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type"> &
          EntityDisplayNameFields_Role_Fragment)
      | ({ __typename?: "SchemaFieldEntity" } & Pick<
          Types.SchemaFieldEntity,
          "urn" | "type"
        > &
          EntityDisplayNameFields_SchemaFieldEntity_Fragment)
      | ({ __typename?: "StructuredPropertyEntity" } & Pick<
          Types.StructuredPropertyEntity,
          "urn" | "type"
        > &
          EntityDisplayNameFields_StructuredPropertyEntity_Fragment)
      | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn" | "type"> &
          EntityDisplayNameFields_Tag_Fragment)
      | ({ __typename?: "Test" } & Pick<Types.Test, "urn" | "type"> &
          EntityDisplayNameFields_Test_Fragment)
      | ({ __typename?: "VersionSet" } & Pick<
          Types.VersionSet,
          "urn" | "type"
        > &
          EntityDisplayNameFields_VersionSet_Fragment)
      | ({ __typename?: "VersionedDataset" } & Pick<
          Types.VersionedDataset,
          "urn" | "type"
        > &
          EntityDisplayNameFields_VersionedDataset_Fragment);
  } & Notes_SchemaFieldEntity_Fragment;

export const SchemaFieldEntityFieldsFragmentDoc = gql`
  fragment schemaFieldEntityFields on SchemaFieldEntity {
    urn
    fieldPath
    type
    structuredProperties {
      properties {
        ...structuredPropertiesFields
      }
    }
    businessAttributes {
      businessAttribute {
        ...businessAttribute
      }
    }
    documentation {
      ...documentationFields
    }
    tags {
      ...globalTagsFields
    }
    glossaryTerms {
      ...glossaryTerms
    }
    parent {
      urn
      type
      ...entityDisplayNameFields
      ... on Dataset {
        platform {
          ...platformFields
        }
        subTypes {
          typeNames
        }
        privileges {
          ...entityPrivileges
        }
      }
      ... on Dashboard {
        platform {
          ...platformFields
        }
        subTypes {
          typeNames
        }
      }
      ... on Chart {
        platform {
          ...platformFields
        }
        subTypes {
          typeNames
        }
      }
    }
    ...notes
  }
  ${StructuredPropertiesFieldsFragmentDoc}
  ${BusinessAttributeFragmentDoc}
  ${DocumentationFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDisplayNameFieldsFragmentDoc}
  ${PlatformFieldsFragmentDoc}
  ${EntityPrivilegesFragmentDoc}
  ${NotesFragmentDoc}
`;
export const GetSchemaFieldDocument = gql`
  query getSchemaField($urn: String!) {
    entity(urn: $urn) {
      urn
      type
      ... on SchemaFieldEntity {
        ...schemaFieldEntityFields
      }
    }
  }
  ${SchemaFieldEntityFieldsFragmentDoc}
`;

/**
 * __useGetSchemaFieldQuery__
 *
 * To run a query within a React component, call `useGetSchemaFieldQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetSchemaFieldQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetSchemaFieldQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetSchemaFieldQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetSchemaFieldQuery,
    GetSchemaFieldQueryVariables
  >,
) {
  return Apollo.useQuery<GetSchemaFieldQuery, GetSchemaFieldQueryVariables>(
    GetSchemaFieldDocument,
    baseOptions,
  );
}
export function useGetSchemaFieldLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetSchemaFieldQuery,
    GetSchemaFieldQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetSchemaFieldQuery, GetSchemaFieldQueryVariables>(
    GetSchemaFieldDocument,
    baseOptions,
  );
}
export type GetSchemaFieldQueryHookResult = ReturnType<
  typeof useGetSchemaFieldQuery
>;
export type GetSchemaFieldLazyQueryHookResult = ReturnType<
  typeof useGetSchemaFieldLazyQuery
>;
export type GetSchemaFieldQueryResult = Apollo.QueryResult<
  GetSchemaFieldQuery,
  GetSchemaFieldQueryVariables
>;
