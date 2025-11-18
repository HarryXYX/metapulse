/* eslint-disable */
import * as Types from "../types.generated";

import {
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
  NonRecursiveMlFeatureTableFragment,
  NonRecursiveMlFeatureFragment,
  NonRecursiveMlPrimaryKeyFragment,
  ErmodelrelationPropertiesFieldsFragment,
  ErmodelrelationEditablePropertiesFieldsFragment,
  SchemaMetadataFieldsFragment,
} from "./fragments.generated";
import {
  SearchResultFields_AccessTokenMetadata_Fragment,
  SearchResultFields_Application_Fragment,
  SearchResultFields_Assertion_Fragment,
  SearchResultFields_BusinessAttribute_Fragment,
  SearchResultFields_Chart_Fragment,
  SearchResultFields_Container_Fragment,
  SearchResultFields_CorpGroup_Fragment,
  SearchResultFields_CorpUser_Fragment,
  SearchResultFields_Dashboard_Fragment,
  SearchResultFields_DataContract_Fragment,
  SearchResultFields_DataFlow_Fragment,
  SearchResultFields_DataHubConnection_Fragment,
  SearchResultFields_DataHubFile_Fragment,
  SearchResultFields_DataHubPageModule_Fragment,
  SearchResultFields_DataHubPageTemplate_Fragment,
  SearchResultFields_DataHubPolicy_Fragment,
  SearchResultFields_DataHubRole_Fragment,
  SearchResultFields_DataHubView_Fragment,
  SearchResultFields_DataJob_Fragment,
  SearchResultFields_DataPlatform_Fragment,
  SearchResultFields_DataPlatformInstance_Fragment,
  SearchResultFields_DataProcessInstance_Fragment,
  SearchResultFields_DataProduct_Fragment,
  SearchResultFields_DataTypeEntity_Fragment,
  SearchResultFields_Dataset_Fragment,
  SearchResultFields_Domain_Fragment,
  SearchResultFields_ErModelRelationship_Fragment,
  SearchResultFields_EntityTypeEntity_Fragment,
  SearchResultFields_ExecutionRequest_Fragment,
  SearchResultFields_Form_Fragment,
  SearchResultFields_GlossaryNode_Fragment,
  SearchResultFields_GlossaryTerm_Fragment,
  SearchResultFields_Incident_Fragment,
  SearchResultFields_MlFeature_Fragment,
  SearchResultFields_MlFeatureTable_Fragment,
  SearchResultFields_MlModel_Fragment,
  SearchResultFields_MlModelGroup_Fragment,
  SearchResultFields_MlPrimaryKey_Fragment,
  SearchResultFields_Notebook_Fragment,
  SearchResultFields_OwnershipTypeEntity_Fragment,
  SearchResultFields_Post_Fragment,
  SearchResultFields_QueryEntity_Fragment,
  SearchResultFields_Restricted_Fragment,
  SearchResultFields_Role_Fragment,
  SearchResultFields_SchemaFieldEntity_Fragment,
  SearchResultFields_StructuredPropertyEntity_Fragment,
  SearchResultFields_Tag_Fragment,
  SearchResultFields_Test_Fragment,
  SearchResultFields_VersionSet_Fragment,
  SearchResultFields_VersionedDataset_Fragment,
  SearchResultFieldsNoLineage_AccessTokenMetadata_Fragment,
  SearchResultFieldsNoLineage_Application_Fragment,
  SearchResultFieldsNoLineage_Assertion_Fragment,
  SearchResultFieldsNoLineage_BusinessAttribute_Fragment,
  SearchResultFieldsNoLineage_Chart_Fragment,
  SearchResultFieldsNoLineage_Container_Fragment,
  SearchResultFieldsNoLineage_CorpGroup_Fragment,
  SearchResultFieldsNoLineage_CorpUser_Fragment,
  SearchResultFieldsNoLineage_Dashboard_Fragment,
  SearchResultFieldsNoLineage_DataContract_Fragment,
  SearchResultFieldsNoLineage_DataFlow_Fragment,
  SearchResultFieldsNoLineage_DataHubConnection_Fragment,
  SearchResultFieldsNoLineage_DataHubFile_Fragment,
  SearchResultFieldsNoLineage_DataHubPageModule_Fragment,
  SearchResultFieldsNoLineage_DataHubPageTemplate_Fragment,
  SearchResultFieldsNoLineage_DataHubPolicy_Fragment,
  SearchResultFieldsNoLineage_DataHubRole_Fragment,
  SearchResultFieldsNoLineage_DataHubView_Fragment,
  SearchResultFieldsNoLineage_DataJob_Fragment,
  SearchResultFieldsNoLineage_DataPlatform_Fragment,
  SearchResultFieldsNoLineage_DataPlatformInstance_Fragment,
  SearchResultFieldsNoLineage_DataProcessInstance_Fragment,
  SearchResultFieldsNoLineage_DataProduct_Fragment,
  SearchResultFieldsNoLineage_DataTypeEntity_Fragment,
  SearchResultFieldsNoLineage_Dataset_Fragment,
  SearchResultFieldsNoLineage_Domain_Fragment,
  SearchResultFieldsNoLineage_ErModelRelationship_Fragment,
  SearchResultFieldsNoLineage_EntityTypeEntity_Fragment,
  SearchResultFieldsNoLineage_ExecutionRequest_Fragment,
  SearchResultFieldsNoLineage_Form_Fragment,
  SearchResultFieldsNoLineage_GlossaryNode_Fragment,
  SearchResultFieldsNoLineage_GlossaryTerm_Fragment,
  SearchResultFieldsNoLineage_Incident_Fragment,
  SearchResultFieldsNoLineage_MlFeature_Fragment,
  SearchResultFieldsNoLineage_MlFeatureTable_Fragment,
  SearchResultFieldsNoLineage_MlModel_Fragment,
  SearchResultFieldsNoLineage_MlModelGroup_Fragment,
  SearchResultFieldsNoLineage_MlPrimaryKey_Fragment,
  SearchResultFieldsNoLineage_Notebook_Fragment,
  SearchResultFieldsNoLineage_OwnershipTypeEntity_Fragment,
  SearchResultFieldsNoLineage_Post_Fragment,
  SearchResultFieldsNoLineage_QueryEntity_Fragment,
  SearchResultFieldsNoLineage_Restricted_Fragment,
  SearchResultFieldsNoLineage_Role_Fragment,
  SearchResultFieldsNoLineage_SchemaFieldEntity_Fragment,
  SearchResultFieldsNoLineage_StructuredPropertyEntity_Fragment,
  SearchResultFieldsNoLineage_Tag_Fragment,
  SearchResultFieldsNoLineage_Test_Fragment,
  SearchResultFieldsNoLineage_VersionSet_Fragment,
  SearchResultFieldsNoLineage_VersionedDataset_Fragment,
} from "./search.generated";
import { gql } from "@apollo/client";
import {
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
  NonRecursiveMlFeatureTableFragmentDoc,
  NonRecursiveMlFeatureFragmentDoc,
  NonRecursiveMlPrimaryKeyFragmentDoc,
  ErmodelrelationPropertiesFieldsFragmentDoc,
  ErmodelrelationEditablePropertiesFieldsFragmentDoc,
  SchemaMetadataFieldsFragmentDoc,
} from "./fragments.generated";
import {
  SearchResultFieldsFragmentDoc,
  SearchResultFieldsNoLineageFragmentDoc,
} from "./search.generated";
import * as Apollo from "@apollo/client";
export type GetQueryQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetQueryQuery = { __typename?: "Query" } & {
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
    | ({ __typename?: "QueryEntity" } & Pick<
        Types.QueryEntity,
        "urn" | "type"
      > &
        QueryFragment)
    | ({ __typename?: "Restricted" } & Pick<Types.Restricted, "urn" | "type">)
    | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type">)
    | ({ __typename?: "SchemaFieldEntity" } & Pick<
        Types.SchemaFieldEntity,
        "urn" | "type"
      >)
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

export type ActorWithDisplayNameFragment = { __typename?: "CorpUser" } & Pick<
  Types.CorpUser,
  "urn" | "type"
> & {
    editableProperties?: Types.Maybe<
      { __typename?: "CorpUserEditableProperties" } & Pick<
        Types.CorpUserEditableProperties,
        "pictureLink"
      >
    >;
    editableInfo?: Types.Maybe<
      { __typename?: "CorpUserEditableInfo" } & Pick<
        Types.CorpUserEditableInfo,
        "pictureLink"
      >
    >;
  } & EntityDisplayNameFields_CorpUser_Fragment;

export type QueryFragment = { __typename?: "QueryEntity" } & Pick<
  Types.QueryEntity,
  "urn"
> & {
    properties?: Types.Maybe<
      { __typename?: "QueryProperties" } & Pick<
        Types.QueryProperties,
        "name" | "description" | "source"
      > & {
          statement: { __typename?: "QueryStatement" } & Pick<
            Types.QueryStatement,
            "value" | "language"
          >;
          created: { __typename?: "AuditStamp" } & Pick<
            Types.AuditStamp,
            "time" | "actor"
          >;
          createdOn: { __typename?: "ResolvedAuditStamp" } & Pick<
            Types.ResolvedAuditStamp,
            "time"
          > & {
              actor?: Types.Maybe<
                { __typename?: "CorpUser" } & ActorWithDisplayNameFragment
              >;
            };
          lastModified: { __typename?: "AuditStamp" } & Pick<
            Types.AuditStamp,
            "time" | "actor"
          >;
          origin?: Types.Maybe<
            | ({
                __typename?: "AccessTokenMetadata";
              } & SearchResultFields_AccessTokenMetadata_Fragment)
            | ({
                __typename?: "Application";
              } & SearchResultFields_Application_Fragment)
            | ({
                __typename?: "Assertion";
              } & SearchResultFields_Assertion_Fragment)
            | ({
                __typename?: "BusinessAttribute";
              } & SearchResultFields_BusinessAttribute_Fragment)
            | ({ __typename?: "Chart" } & SearchResultFields_Chart_Fragment)
            | ({
                __typename?: "Container";
              } & SearchResultFields_Container_Fragment)
            | ({
                __typename?: "CorpGroup";
              } & SearchResultFields_CorpGroup_Fragment)
            | ({
                __typename?: "CorpUser";
              } & SearchResultFields_CorpUser_Fragment)
            | ({
                __typename?: "Dashboard";
              } & SearchResultFields_Dashboard_Fragment)
            | ({
                __typename?: "DataContract";
              } & SearchResultFields_DataContract_Fragment)
            | ({
                __typename?: "DataFlow";
              } & SearchResultFields_DataFlow_Fragment)
            | ({
                __typename?: "DataHubConnection";
              } & SearchResultFields_DataHubConnection_Fragment)
            | ({
                __typename?: "DataHubFile";
              } & SearchResultFields_DataHubFile_Fragment)
            | ({
                __typename?: "DataHubPageModule";
              } & SearchResultFields_DataHubPageModule_Fragment)
            | ({
                __typename?: "DataHubPageTemplate";
              } & SearchResultFields_DataHubPageTemplate_Fragment)
            | ({
                __typename?: "DataHubPolicy";
              } & SearchResultFields_DataHubPolicy_Fragment)
            | ({
                __typename?: "DataHubRole";
              } & SearchResultFields_DataHubRole_Fragment)
            | ({
                __typename?: "DataHubView";
              } & SearchResultFields_DataHubView_Fragment)
            | ({ __typename?: "DataJob" } & SearchResultFields_DataJob_Fragment)
            | ({
                __typename?: "DataPlatform";
              } & SearchResultFields_DataPlatform_Fragment)
            | ({
                __typename?: "DataPlatformInstance";
              } & SearchResultFields_DataPlatformInstance_Fragment)
            | ({
                __typename?: "DataProcessInstance";
              } & SearchResultFields_DataProcessInstance_Fragment)
            | ({
                __typename?: "DataProduct";
              } & SearchResultFields_DataProduct_Fragment)
            | ({
                __typename?: "DataTypeEntity";
              } & SearchResultFields_DataTypeEntity_Fragment)
            | ({ __typename?: "Dataset" } & SearchResultFields_Dataset_Fragment)
            | ({ __typename?: "Domain" } & SearchResultFields_Domain_Fragment)
            | ({
                __typename?: "ERModelRelationship";
              } & SearchResultFields_ErModelRelationship_Fragment)
            | ({
                __typename?: "EntityTypeEntity";
              } & SearchResultFields_EntityTypeEntity_Fragment)
            | ({
                __typename?: "ExecutionRequest";
              } & SearchResultFields_ExecutionRequest_Fragment)
            | ({ __typename?: "Form" } & SearchResultFields_Form_Fragment)
            | ({
                __typename?: "GlossaryNode";
              } & SearchResultFields_GlossaryNode_Fragment)
            | ({
                __typename?: "GlossaryTerm";
              } & SearchResultFields_GlossaryTerm_Fragment)
            | ({
                __typename?: "Incident";
              } & SearchResultFields_Incident_Fragment)
            | ({
                __typename?: "MLFeature";
              } & SearchResultFields_MlFeature_Fragment)
            | ({
                __typename?: "MLFeatureTable";
              } & SearchResultFields_MlFeatureTable_Fragment)
            | ({ __typename?: "MLModel" } & SearchResultFields_MlModel_Fragment)
            | ({
                __typename?: "MLModelGroup";
              } & SearchResultFields_MlModelGroup_Fragment)
            | ({
                __typename?: "MLPrimaryKey";
              } & SearchResultFields_MlPrimaryKey_Fragment)
            | ({
                __typename?: "Notebook";
              } & SearchResultFields_Notebook_Fragment)
            | ({
                __typename?: "OwnershipTypeEntity";
              } & SearchResultFields_OwnershipTypeEntity_Fragment)
            | ({ __typename?: "Post" } & SearchResultFields_Post_Fragment)
            | ({
                __typename?: "QueryEntity";
              } & SearchResultFields_QueryEntity_Fragment)
            | ({
                __typename?: "Restricted";
              } & SearchResultFields_Restricted_Fragment)
            | ({ __typename?: "Role" } & SearchResultFields_Role_Fragment)
            | ({
                __typename?: "SchemaFieldEntity";
              } & SearchResultFields_SchemaFieldEntity_Fragment)
            | ({
                __typename?: "StructuredPropertyEntity";
              } & SearchResultFields_StructuredPropertyEntity_Fragment)
            | ({ __typename?: "Tag" } & SearchResultFields_Tag_Fragment)
            | ({ __typename?: "Test" } & SearchResultFields_Test_Fragment)
            | ({
                __typename?: "VersionSet";
              } & SearchResultFields_VersionSet_Fragment)
            | ({
                __typename?: "VersionedDataset";
              } & SearchResultFields_VersionedDataset_Fragment)
          >;
        }
    >;
    platform?: Types.Maybe<
      { __typename?: "DataPlatform" } & PlatformFieldsFragment
    >;
    subjects?: Types.Maybe<
      Array<
        { __typename?: "QuerySubject" } & {
          dataset: { __typename?: "Dataset" } & Pick<
            Types.Dataset,
            "urn" | "type" | "name"
          >;
          schemaField?: Types.Maybe<
            { __typename?: "SchemaFieldEntity" } & Pick<
              Types.SchemaFieldEntity,
              "urn" | "type" | "fieldPath"
            >
          >;
        }
      >
    >;
  };

export type ListQueriesQueryVariables = Types.Exact<{
  input: Types.ListQueriesInput;
}>;

export type ListQueriesQuery = { __typename?: "Query" } & {
  listQueries?: Types.Maybe<
    { __typename?: "ListQueriesResult" } & Pick<
      Types.ListQueriesResult,
      "start" | "total" | "count"
    > & { queries: Array<{ __typename?: "QueryEntity" } & QueryFragment> }
  >;
};

export type CreateQueryMutationVariables = Types.Exact<{
  input: Types.CreateQueryInput;
}>;

export type CreateQueryMutation = { __typename?: "Mutation" } & {
  createQuery?: Types.Maybe<{ __typename?: "QueryEntity" } & QueryFragment>;
};

export type UpdateQueryMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  input: Types.UpdateQueryInput;
}>;

export type UpdateQueryMutation = { __typename?: "Mutation" } & {
  updateQuery?: Types.Maybe<{ __typename?: "QueryEntity" } & QueryFragment>;
};

export type DeleteQueryMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type DeleteQueryMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "deleteQuery"
>;

export type SearchAcrossLineageForQueriesQueryVariables = Types.Exact<{
  input: Types.SearchAcrossLineageInput;
}>;

export type SearchAcrossLineageForQueriesQuery = { __typename?: "Query" } & {
  searchAcrossLineage?: Types.Maybe<
    { __typename?: "SearchAcrossLineageResults" } & Pick<
      Types.SearchAcrossLineageResults,
      "start" | "count" | "total"
    > & {
        searchResults: Array<
          { __typename?: "SearchAcrossLineageResult" } & Pick<
            Types.SearchAcrossLineageResult,
            "explored" | "ignoredAsHop"
          > & {
              entity:
                | ({ __typename?: "AccessTokenMetadata" } & Pick<
                    Types.AccessTokenMetadata,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_AccessTokenMetadata_Fragment)
                | ({ __typename?: "Application" } & Pick<
                    Types.Application,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_Application_Fragment)
                | ({ __typename?: "Assertion" } & Pick<
                    Types.Assertion,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_Assertion_Fragment)
                | ({ __typename?: "BusinessAttribute" } & Pick<
                    Types.BusinessAttribute,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_BusinessAttribute_Fragment)
                | ({ __typename?: "Chart" } & Pick<
                    Types.Chart,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_Chart_Fragment)
                | ({ __typename?: "Container" } & Pick<
                    Types.Container,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_Container_Fragment)
                | ({ __typename?: "CorpGroup" } & Pick<
                    Types.CorpGroup,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_CorpGroup_Fragment)
                | ({ __typename?: "CorpUser" } & Pick<
                    Types.CorpUser,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_CorpUser_Fragment)
                | ({ __typename?: "Dashboard" } & Pick<
                    Types.Dashboard,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_Dashboard_Fragment)
                | ({ __typename?: "DataContract" } & Pick<
                    Types.DataContract,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_DataContract_Fragment)
                | ({ __typename?: "DataFlow" } & Pick<
                    Types.DataFlow,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_DataFlow_Fragment)
                | ({ __typename?: "DataHubConnection" } & Pick<
                    Types.DataHubConnection,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_DataHubConnection_Fragment)
                | ({ __typename?: "DataHubFile" } & Pick<
                    Types.DataHubFile,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_DataHubFile_Fragment)
                | ({ __typename?: "DataHubPageModule" } & Pick<
                    Types.DataHubPageModule,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_DataHubPageModule_Fragment)
                | ({ __typename?: "DataHubPageTemplate" } & Pick<
                    Types.DataHubPageTemplate,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_DataHubPageTemplate_Fragment)
                | ({ __typename?: "DataHubPolicy" } & Pick<
                    Types.DataHubPolicy,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_DataHubPolicy_Fragment)
                | ({ __typename?: "DataHubRole" } & Pick<
                    Types.DataHubRole,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_DataHubRole_Fragment)
                | ({ __typename?: "DataHubView" } & Pick<
                    Types.DataHubView,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_DataHubView_Fragment)
                | ({ __typename?: "DataJob" } & Pick<
                    Types.DataJob,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_DataJob_Fragment)
                | ({ __typename?: "DataPlatform" } & Pick<
                    Types.DataPlatform,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_DataPlatform_Fragment)
                | ({ __typename?: "DataPlatformInstance" } & Pick<
                    Types.DataPlatformInstance,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_DataPlatformInstance_Fragment)
                | ({ __typename?: "DataProcessInstance" } & Pick<
                    Types.DataProcessInstance,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_DataProcessInstance_Fragment)
                | ({ __typename?: "DataProduct" } & Pick<
                    Types.DataProduct,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_DataProduct_Fragment)
                | ({ __typename?: "DataTypeEntity" } & Pick<
                    Types.DataTypeEntity,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_DataTypeEntity_Fragment)
                | ({ __typename?: "Dataset" } & Pick<
                    Types.Dataset,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_Dataset_Fragment)
                | ({ __typename?: "Domain" } & Pick<
                    Types.Domain,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_Domain_Fragment)
                | ({ __typename?: "ERModelRelationship" } & Pick<
                    Types.ErModelRelationship,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_ErModelRelationship_Fragment)
                | ({ __typename?: "EntityTypeEntity" } & Pick<
                    Types.EntityTypeEntity,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_EntityTypeEntity_Fragment)
                | ({ __typename?: "ExecutionRequest" } & Pick<
                    Types.ExecutionRequest,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_ExecutionRequest_Fragment)
                | ({ __typename?: "Form" } & Pick<Types.Form, "urn" | "type"> &
                    SearchResultFieldsNoLineage_Form_Fragment)
                | ({ __typename?: "GlossaryNode" } & Pick<
                    Types.GlossaryNode,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_GlossaryNode_Fragment)
                | ({ __typename?: "GlossaryTerm" } & Pick<
                    Types.GlossaryTerm,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_GlossaryTerm_Fragment)
                | ({ __typename?: "Incident" } & Pick<
                    Types.Incident,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_Incident_Fragment)
                | ({ __typename?: "MLFeature" } & Pick<
                    Types.MlFeature,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_MlFeature_Fragment)
                | ({ __typename?: "MLFeatureTable" } & Pick<
                    Types.MlFeatureTable,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_MlFeatureTable_Fragment)
                | ({ __typename?: "MLModel" } & Pick<
                    Types.MlModel,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_MlModel_Fragment)
                | ({ __typename?: "MLModelGroup" } & Pick<
                    Types.MlModelGroup,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_MlModelGroup_Fragment)
                | ({ __typename?: "MLPrimaryKey" } & Pick<
                    Types.MlPrimaryKey,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_MlPrimaryKey_Fragment)
                | ({ __typename?: "Notebook" } & Pick<
                    Types.Notebook,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_Notebook_Fragment)
                | ({ __typename?: "OwnershipTypeEntity" } & Pick<
                    Types.OwnershipTypeEntity,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_OwnershipTypeEntity_Fragment)
                | ({ __typename?: "Post" } & Pick<Types.Post, "urn" | "type"> &
                    SearchResultFieldsNoLineage_Post_Fragment)
                | ({ __typename?: "QueryEntity" } & Pick<
                    Types.QueryEntity,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_QueryEntity_Fragment)
                | ({ __typename?: "Restricted" } & Pick<
                    Types.Restricted,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_Restricted_Fragment)
                | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type"> &
                    SearchResultFieldsNoLineage_Role_Fragment)
                | ({ __typename?: "SchemaFieldEntity" } & Pick<
                    Types.SchemaFieldEntity,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_SchemaFieldEntity_Fragment)
                | ({ __typename?: "StructuredPropertyEntity" } & Pick<
                    Types.StructuredPropertyEntity,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_StructuredPropertyEntity_Fragment)
                | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn" | "type"> &
                    SearchResultFieldsNoLineage_Tag_Fragment)
                | ({ __typename?: "Test" } & Pick<Types.Test, "urn" | "type"> &
                    SearchResultFieldsNoLineage_Test_Fragment)
                | ({ __typename?: "VersionSet" } & Pick<
                    Types.VersionSet,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_VersionSet_Fragment)
                | ({ __typename?: "VersionedDataset" } & Pick<
                    Types.VersionedDataset,
                    "urn" | "type"
                  > &
                    SearchResultFieldsNoLineage_VersionedDataset_Fragment);
              paths?: Types.Maybe<
                Array<
                  Types.Maybe<
                    { __typename?: "EntityPath" } & {
                      path: Array<
                        Types.Maybe<
                          | ({ __typename?: "AccessTokenMetadata" } & Pick<
                              Types.AccessTokenMetadata,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "Application" } & Pick<
                              Types.Application,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "Assertion" } & Pick<
                              Types.Assertion,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "BusinessAttribute" } & Pick<
                              Types.BusinessAttribute,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "Chart" } & Pick<
                              Types.Chart,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "Container" } & Pick<
                              Types.Container,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "CorpGroup" } & Pick<
                              Types.CorpGroup,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "CorpUser" } & Pick<
                              Types.CorpUser,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "Dashboard" } & Pick<
                              Types.Dashboard,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "DataContract" } & Pick<
                              Types.DataContract,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "DataFlow" } & Pick<
                              Types.DataFlow,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "DataHubConnection" } & Pick<
                              Types.DataHubConnection,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "DataHubFile" } & Pick<
                              Types.DataHubFile,
                              "urn" | "type"
                            >)
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
                          | ({ __typename?: "DataHubRole" } & Pick<
                              Types.DataHubRole,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "DataHubView" } & Pick<
                              Types.DataHubView,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "DataJob" } & Pick<
                              Types.DataJob,
                              "urn" | "type"
                            >)
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
                          | ({ __typename?: "DataProduct" } & Pick<
                              Types.DataProduct,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "DataTypeEntity" } & Pick<
                              Types.DataTypeEntity,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "Dataset" } & Pick<
                              Types.Dataset,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "Domain" } & Pick<
                              Types.Domain,
                              "urn" | "type"
                            >)
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
                          | ({ __typename?: "Form" } & Pick<
                              Types.Form,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "GlossaryNode" } & Pick<
                              Types.GlossaryNode,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "GlossaryTerm" } & Pick<
                              Types.GlossaryTerm,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "Incident" } & Pick<
                              Types.Incident,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "MLFeature" } & Pick<
                              Types.MlFeature,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "MLFeatureTable" } & Pick<
                              Types.MlFeatureTable,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "MLModel" } & Pick<
                              Types.MlModel,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "MLModelGroup" } & Pick<
                              Types.MlModelGroup,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "MLPrimaryKey" } & Pick<
                              Types.MlPrimaryKey,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "Notebook" } & Pick<
                              Types.Notebook,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "OwnershipTypeEntity" } & Pick<
                              Types.OwnershipTypeEntity,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "Post" } & Pick<
                              Types.Post,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "QueryEntity" } & Pick<
                              Types.QueryEntity,
                              "urn" | "type"
                            > &
                              QueryFragment)
                          | ({ __typename?: "Restricted" } & Pick<
                              Types.Restricted,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "Role" } & Pick<
                              Types.Role,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "SchemaFieldEntity" } & Pick<
                              Types.SchemaFieldEntity,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "StructuredPropertyEntity" } & Pick<
                              Types.StructuredPropertyEntity,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "Tag" } & Pick<
                              Types.Tag,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "Test" } & Pick<
                              Types.Test,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "VersionSet" } & Pick<
                              Types.VersionSet,
                              "urn" | "type"
                            >)
                          | ({ __typename?: "VersionedDataset" } & Pick<
                              Types.VersionedDataset,
                              "urn" | "type"
                            >)
                        >
                      >;
                    }
                  >
                >
              >;
            }
        >;
      }
  >;
};

export const ActorWithDisplayNameFragmentDoc = gql`
  fragment ActorWithDisplayName on CorpUser {
    urn
    type
    ...entityDisplayNameFields
    editableProperties {
      pictureLink
    }
    editableInfo {
      pictureLink
    }
  }
  ${EntityDisplayNameFieldsFragmentDoc}
`;
export const QueryFragmentDoc = gql`
  fragment query on QueryEntity {
    urn
    properties {
      name
      description
      source
      statement {
        value
        language
      }
      created {
        time
        actor
      }
      createdOn {
        time
        actor {
          ...ActorWithDisplayName
        }
      }
      lastModified {
        time
        actor
      }
      origin {
        ...searchResultFields
      }
    }
    platform {
      ...platformFields
    }
    subjects {
      dataset {
        urn
        type
        name
      }
      schemaField {
        urn
        type
        fieldPath
      }
    }
  }
  ${ActorWithDisplayNameFragmentDoc}
  ${SearchResultFieldsFragmentDoc}
  ${PlatformFieldsFragmentDoc}
`;
export const GetQueryDocument = gql`
  query getQuery($urn: String!) {
    entity(urn: $urn) {
      urn
      type
      ... on QueryEntity {
        ...query
      }
    }
  }
  ${QueryFragmentDoc}
`;

/**
 * __useGetQueryQuery__
 *
 * To run a query within a React component, call `useGetQueryQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetQueryQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetQueryQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetQueryQuery(
  baseOptions: Apollo.QueryHookOptions<GetQueryQuery, GetQueryQueryVariables>,
) {
  return Apollo.useQuery<GetQueryQuery, GetQueryQueryVariables>(
    GetQueryDocument,
    baseOptions,
  );
}
export function useGetQueryLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetQueryQuery,
    GetQueryQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetQueryQuery, GetQueryQueryVariables>(
    GetQueryDocument,
    baseOptions,
  );
}
export type GetQueryQueryHookResult = ReturnType<typeof useGetQueryQuery>;
export type GetQueryLazyQueryHookResult = ReturnType<
  typeof useGetQueryLazyQuery
>;
export type GetQueryQueryResult = Apollo.QueryResult<
  GetQueryQuery,
  GetQueryQueryVariables
>;
export const ListQueriesDocument = gql`
  query listQueries($input: ListQueriesInput!) {
    listQueries(input: $input) {
      start
      total
      count
      queries {
        ...query
      }
    }
  }
  ${QueryFragmentDoc}
`;

/**
 * __useListQueriesQuery__
 *
 * To run a query within a React component, call `useListQueriesQuery` and pass it any options that fit your needs.
 * When your component renders, `useListQueriesQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useListQueriesQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useListQueriesQuery(
  baseOptions: Apollo.QueryHookOptions<
    ListQueriesQuery,
    ListQueriesQueryVariables
  >,
) {
  return Apollo.useQuery<ListQueriesQuery, ListQueriesQueryVariables>(
    ListQueriesDocument,
    baseOptions,
  );
}
export function useListQueriesLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    ListQueriesQuery,
    ListQueriesQueryVariables
  >,
) {
  return Apollo.useLazyQuery<ListQueriesQuery, ListQueriesQueryVariables>(
    ListQueriesDocument,
    baseOptions,
  );
}
export type ListQueriesQueryHookResult = ReturnType<typeof useListQueriesQuery>;
export type ListQueriesLazyQueryHookResult = ReturnType<
  typeof useListQueriesLazyQuery
>;
export type ListQueriesQueryResult = Apollo.QueryResult<
  ListQueriesQuery,
  ListQueriesQueryVariables
>;
export const CreateQueryDocument = gql`
  mutation createQuery($input: CreateQueryInput!) {
    createQuery(input: $input) {
      ...query
    }
  }
  ${QueryFragmentDoc}
`;
export type CreateQueryMutationFn = Apollo.MutationFunction<
  CreateQueryMutation,
  CreateQueryMutationVariables
>;

/**
 * __useCreateQueryMutation__
 *
 * To run a mutation, you first call `useCreateQueryMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useCreateQueryMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [createQueryMutation, { data, loading, error }] = useCreateQueryMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useCreateQueryMutation(
  baseOptions?: Apollo.MutationHookOptions<
    CreateQueryMutation,
    CreateQueryMutationVariables
  >,
) {
  return Apollo.useMutation<CreateQueryMutation, CreateQueryMutationVariables>(
    CreateQueryDocument,
    baseOptions,
  );
}
export type CreateQueryMutationHookResult = ReturnType<
  typeof useCreateQueryMutation
>;
export type CreateQueryMutationResult =
  Apollo.MutationResult<CreateQueryMutation>;
export type CreateQueryMutationOptions = Apollo.BaseMutationOptions<
  CreateQueryMutation,
  CreateQueryMutationVariables
>;
export const UpdateQueryDocument = gql`
  mutation updateQuery($urn: String!, $input: UpdateQueryInput!) {
    updateQuery(urn: $urn, input: $input) {
      ...query
    }
  }
  ${QueryFragmentDoc}
`;
export type UpdateQueryMutationFn = Apollo.MutationFunction<
  UpdateQueryMutation,
  UpdateQueryMutationVariables
>;

/**
 * __useUpdateQueryMutation__
 *
 * To run a mutation, you first call `useUpdateQueryMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateQueryMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateQueryMutation, { data, loading, error }] = useUpdateQueryMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateQueryMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateQueryMutation,
    UpdateQueryMutationVariables
  >,
) {
  return Apollo.useMutation<UpdateQueryMutation, UpdateQueryMutationVariables>(
    UpdateQueryDocument,
    baseOptions,
  );
}
export type UpdateQueryMutationHookResult = ReturnType<
  typeof useUpdateQueryMutation
>;
export type UpdateQueryMutationResult =
  Apollo.MutationResult<UpdateQueryMutation>;
export type UpdateQueryMutationOptions = Apollo.BaseMutationOptions<
  UpdateQueryMutation,
  UpdateQueryMutationVariables
>;
export const DeleteQueryDocument = gql`
  mutation deleteQuery($urn: String!) {
    deleteQuery(urn: $urn)
  }
`;
export type DeleteQueryMutationFn = Apollo.MutationFunction<
  DeleteQueryMutation,
  DeleteQueryMutationVariables
>;

/**
 * __useDeleteQueryMutation__
 *
 * To run a mutation, you first call `useDeleteQueryMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useDeleteQueryMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [deleteQueryMutation, { data, loading, error }] = useDeleteQueryMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useDeleteQueryMutation(
  baseOptions?: Apollo.MutationHookOptions<
    DeleteQueryMutation,
    DeleteQueryMutationVariables
  >,
) {
  return Apollo.useMutation<DeleteQueryMutation, DeleteQueryMutationVariables>(
    DeleteQueryDocument,
    baseOptions,
  );
}
export type DeleteQueryMutationHookResult = ReturnType<
  typeof useDeleteQueryMutation
>;
export type DeleteQueryMutationResult =
  Apollo.MutationResult<DeleteQueryMutation>;
export type DeleteQueryMutationOptions = Apollo.BaseMutationOptions<
  DeleteQueryMutation,
  DeleteQueryMutationVariables
>;
export const SearchAcrossLineageForQueriesDocument = gql`
  query searchAcrossLineageForQueries($input: SearchAcrossLineageInput!) {
    searchAcrossLineage(input: $input) {
      start
      count
      total
      searchResults {
        entity {
          urn
          type
          ...searchResultFieldsNoLineage
        }
        paths {
          path {
            urn
            type
            ... on QueryEntity {
              ...query
            }
          }
        }
        explored
        ignoredAsHop
      }
    }
  }
  ${SearchResultFieldsNoLineageFragmentDoc}
  ${QueryFragmentDoc}
`;

/**
 * __useSearchAcrossLineageForQueriesQuery__
 *
 * To run a query within a React component, call `useSearchAcrossLineageForQueriesQuery` and pass it any options that fit your needs.
 * When your component renders, `useSearchAcrossLineageForQueriesQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useSearchAcrossLineageForQueriesQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useSearchAcrossLineageForQueriesQuery(
  baseOptions: Apollo.QueryHookOptions<
    SearchAcrossLineageForQueriesQuery,
    SearchAcrossLineageForQueriesQueryVariables
  >,
) {
  return Apollo.useQuery<
    SearchAcrossLineageForQueriesQuery,
    SearchAcrossLineageForQueriesQueryVariables
  >(SearchAcrossLineageForQueriesDocument, baseOptions);
}
export function useSearchAcrossLineageForQueriesLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    SearchAcrossLineageForQueriesQuery,
    SearchAcrossLineageForQueriesQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    SearchAcrossLineageForQueriesQuery,
    SearchAcrossLineageForQueriesQueryVariables
  >(SearchAcrossLineageForQueriesDocument, baseOptions);
}
export type SearchAcrossLineageForQueriesQueryHookResult = ReturnType<
  typeof useSearchAcrossLineageForQueriesQuery
>;
export type SearchAcrossLineageForQueriesLazyQueryHookResult = ReturnType<
  typeof useSearchAcrossLineageForQueriesLazyQuery
>;
export type SearchAcrossLineageForQueriesQueryResult = Apollo.QueryResult<
  SearchAcrossLineageForQueriesQuery,
  SearchAcrossLineageForQueriesQueryVariables
>;
