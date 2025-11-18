/* eslint-disable */
import * as Types from "../types.generated";

import {
  LineageNodeProperties_Assertion_Fragment,
  LineageNodeProperties_Chart_Fragment,
  LineageNodeProperties_Dashboard_Fragment,
  LineageNodeProperties_DataFlow_Fragment,
  LineageNodeProperties_DataJob_Fragment,
  LineageNodeProperties_DataProcessInstance_Fragment,
  LineageNodeProperties_Dataset_Fragment,
  LineageNodeProperties_ErModelRelationship_Fragment,
  LineageNodeProperties_MlFeature_Fragment,
  LineageNodeProperties_MlFeatureTable_Fragment,
  LineageNodeProperties_MlModel_Fragment,
  LineageNodeProperties_MlModelGroup_Fragment,
  LineageNodeProperties_MlPrimaryKey_Fragment,
  LineageNodeProperties_Restricted_Fragment,
  LineageNodeProperties_SchemaFieldEntity_Fragment,
  LeafLineageResultsFragment,
} from "./lineage.generated";
import {
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
} from "./fragments.generated";
import { gql } from "@apollo/client";
import {
  LineageNodePropertiesFragmentDoc,
  LeafLineageResultsFragmentDoc,
} from "./lineage.generated";
import { NotesFragmentDoc } from "./fragments.generated";
import * as Apollo from "@apollo/client";
export type FullRelationshipResultsFragment = {
  __typename?: "EntityRelationshipsResult";
} & Pick<Types.EntityRelationshipsResult, "start" | "count" | "total"> & {
    relationships: Array<
      { __typename?: "EntityRelationship" } & Pick<
        Types.EntityRelationship,
        "type" | "direction"
      > & {
          entity?: Types.Maybe<
            | { __typename?: "AccessTokenMetadata" }
            | { __typename?: "Application" }
            | ({
                __typename?: "Assertion";
              } & RelationshipFields_Assertion_Fragment)
            | { __typename?: "BusinessAttribute" }
            | ({ __typename?: "Chart" } & RelationshipFields_Chart_Fragment)
            | { __typename?: "Container" }
            | { __typename?: "CorpGroup" }
            | { __typename?: "CorpUser" }
            | ({
                __typename?: "Dashboard";
              } & RelationshipFields_Dashboard_Fragment)
            | { __typename?: "DataContract" }
            | ({
                __typename?: "DataFlow";
              } & RelationshipFields_DataFlow_Fragment)
            | { __typename?: "DataHubConnection" }
            | { __typename?: "DataHubFile" }
            | { __typename?: "DataHubPageModule" }
            | { __typename?: "DataHubPageTemplate" }
            | { __typename?: "DataHubPolicy" }
            | { __typename?: "DataHubRole" }
            | { __typename?: "DataHubView" }
            | ({ __typename?: "DataJob" } & RelationshipFields_DataJob_Fragment)
            | { __typename?: "DataPlatform" }
            | { __typename?: "DataPlatformInstance" }
            | ({
                __typename?: "DataProcessInstance";
              } & RelationshipFields_DataProcessInstance_Fragment)
            | { __typename?: "DataProduct" }
            | { __typename?: "DataTypeEntity" }
            | ({ __typename?: "Dataset" } & RelationshipFields_Dataset_Fragment)
            | { __typename?: "Domain" }
            | ({
                __typename?: "ERModelRelationship";
              } & RelationshipFields_ErModelRelationship_Fragment)
            | { __typename?: "EntityTypeEntity" }
            | { __typename?: "ExecutionRequest" }
            | { __typename?: "Form" }
            | { __typename?: "GlossaryNode" }
            | { __typename?: "GlossaryTerm" }
            | { __typename?: "Incident" }
            | ({
                __typename?: "MLFeature";
              } & RelationshipFields_MlFeature_Fragment)
            | ({
                __typename?: "MLFeatureTable";
              } & RelationshipFields_MlFeatureTable_Fragment)
            | ({ __typename?: "MLModel" } & RelationshipFields_MlModel_Fragment)
            | ({
                __typename?: "MLModelGroup";
              } & RelationshipFields_MlModelGroup_Fragment)
            | ({
                __typename?: "MLPrimaryKey";
              } & RelationshipFields_MlPrimaryKey_Fragment)
            | { __typename?: "Notebook" }
            | { __typename?: "OwnershipTypeEntity" }
            | { __typename?: "Post" }
            | { __typename?: "QueryEntity" }
            | ({
                __typename?: "Restricted";
              } & RelationshipFields_Restricted_Fragment)
            | { __typename?: "Role" }
            | ({
                __typename?: "SchemaFieldEntity";
              } & RelationshipFields_SchemaFieldEntity_Fragment)
            | { __typename?: "StructuredPropertyEntity" }
            | { __typename?: "Tag" }
            | { __typename?: "Test" }
            | { __typename?: "VersionSet" }
            | { __typename?: "VersionedDataset" }
          >;
        }
    >;
  };

export type LeafRelationshipResultsFragment = {
  __typename?: "EntityRelationshipsResult";
} & Pick<Types.EntityRelationshipsResult, "start" | "count" | "total"> & {
    relationships: Array<
      { __typename?: "EntityRelationship" } & Pick<
        Types.EntityRelationship,
        "type"
      > & {
          entity?: Types.Maybe<
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
            | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type">)
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
            | ({ __typename?: "DataProduct" } & Pick<
                Types.DataProduct,
                "urn" | "type"
              >)
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
            | ({ __typename?: "MLModel" } & Pick<Types.MlModel, "urn" | "type">)
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
            | ({ __typename?: "Post" } & Pick<Types.Post, "urn" | "type">)
            | ({ __typename?: "QueryEntity" } & Pick<
                Types.QueryEntity,
                "urn" | "type"
              >)
            | ({ __typename?: "Restricted" } & Pick<
                Types.Restricted,
                "urn" | "type"
              >)
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
            | ({ __typename?: "VersionSet" } & Pick<
                Types.VersionSet,
                "urn" | "type"
              >)
            | ({ __typename?: "VersionedDataset" } & Pick<
                Types.VersionedDataset,
                "urn" | "type"
              >)
          >;
        }
    >;
  };

export type RelationshipFields_Assertion_Fragment = {
  __typename?: "Assertion";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_Assertion_Fragment;

export type RelationshipFields_Chart_Fragment = { __typename?: "Chart" } & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_Chart_Fragment;

export type RelationshipFields_Dashboard_Fragment = {
  __typename?: "Dashboard";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_Dashboard_Fragment;

export type RelationshipFields_DataFlow_Fragment = {
  __typename?: "DataFlow";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_DataFlow_Fragment;

export type RelationshipFields_DataJob_Fragment = { __typename?: "DataJob" } & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_DataJob_Fragment;

export type RelationshipFields_DataProcessInstance_Fragment = {
  __typename?: "DataProcessInstance";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_DataProcessInstance_Fragment;

export type RelationshipFields_Dataset_Fragment = { __typename?: "Dataset" } & {
  siblings?: Types.Maybe<
    { __typename?: "SiblingProperties" } & Pick<
      Types.SiblingProperties,
      "isPrimary"
    > & {
        siblings?: Types.Maybe<
          Array<
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
                > &
                  LineageNodeProperties_Assertion_Fragment)
              | ({ __typename?: "BusinessAttribute" } & Pick<
                  Types.BusinessAttribute,
                  "urn" | "type"
                >)
              | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type"> &
                  LineageNodeProperties_Chart_Fragment)
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
                > &
                  LineageNodeProperties_Dashboard_Fragment)
              | ({ __typename?: "DataContract" } & Pick<
                  Types.DataContract,
                  "urn" | "type"
                >)
              | ({ __typename?: "DataFlow" } & Pick<
                  Types.DataFlow,
                  "urn" | "type"
                > &
                  LineageNodeProperties_DataFlow_Fragment)
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
                > &
                  LineageNodeProperties_DataJob_Fragment)
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
                > &
                  LineageNodeProperties_DataProcessInstance_Fragment)
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
                > &
                  LineageNodeProperties_Dataset_Fragment)
              | ({ __typename?: "Domain" } & Pick<Types.Domain, "urn" | "type">)
              | ({ __typename?: "ERModelRelationship" } & Pick<
                  Types.ErModelRelationship,
                  "urn" | "type"
                > &
                  LineageNodeProperties_ErModelRelationship_Fragment)
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
              | ({ __typename?: "Incident" } & Pick<
                  Types.Incident,
                  "urn" | "type"
                >)
              | ({ __typename?: "MLFeature" } & Pick<
                  Types.MlFeature,
                  "urn" | "type"
                > &
                  LineageNodeProperties_MlFeature_Fragment)
              | ({ __typename?: "MLFeatureTable" } & Pick<
                  Types.MlFeatureTable,
                  "urn" | "type"
                > &
                  LineageNodeProperties_MlFeatureTable_Fragment)
              | ({ __typename?: "MLModel" } & Pick<
                  Types.MlModel,
                  "urn" | "type"
                > &
                  LineageNodeProperties_MlModel_Fragment)
              | ({ __typename?: "MLModelGroup" } & Pick<
                  Types.MlModelGroup,
                  "urn" | "type"
                > &
                  LineageNodeProperties_MlModelGroup_Fragment)
              | ({ __typename?: "MLPrimaryKey" } & Pick<
                  Types.MlPrimaryKey,
                  "urn" | "type"
                > &
                  LineageNodeProperties_MlPrimaryKey_Fragment)
              | ({ __typename?: "Notebook" } & Pick<
                  Types.Notebook,
                  "urn" | "type"
                >)
              | ({ __typename?: "OwnershipTypeEntity" } & Pick<
                  Types.OwnershipTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Post" } & Pick<Types.Post, "urn" | "type">)
              | ({ __typename?: "QueryEntity" } & Pick<
                  Types.QueryEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Restricted" } & Pick<
                  Types.Restricted,
                  "urn" | "type"
                > &
                  LineageNodeProperties_Restricted_Fragment)
              | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type">)
              | ({ __typename?: "SchemaFieldEntity" } & Pick<
                  Types.SchemaFieldEntity,
                  "urn" | "type"
                > &
                  LineageNodeProperties_SchemaFieldEntity_Fragment)
              | ({ __typename?: "StructuredPropertyEntity" } & Pick<
                  Types.StructuredPropertyEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn" | "type">)
              | ({ __typename?: "Test" } & Pick<Types.Test, "urn" | "type">)
              | ({ __typename?: "VersionSet" } & Pick<
                  Types.VersionSet,
                  "urn" | "type"
                >)
              | ({ __typename?: "VersionedDataset" } & Pick<
                  Types.VersionedDataset,
                  "urn" | "type"
                >)
            >
          >
        >;
      }
  >;
  siblingsSearch?: Types.Maybe<
    { __typename?: "ScrollResults" } & Pick<
      Types.ScrollResults,
      "count" | "total"
    > & {
        searchResults: Array<
          { __typename?: "SearchResult" } & {
            entity:
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
                > &
                  LineageNodeProperties_Assertion_Fragment)
              | ({ __typename?: "BusinessAttribute" } & Pick<
                  Types.BusinessAttribute,
                  "urn" | "type"
                >)
              | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type"> &
                  LineageNodeProperties_Chart_Fragment)
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
                > &
                  LineageNodeProperties_Dashboard_Fragment)
              | ({ __typename?: "DataContract" } & Pick<
                  Types.DataContract,
                  "urn" | "type"
                >)
              | ({ __typename?: "DataFlow" } & Pick<
                  Types.DataFlow,
                  "urn" | "type"
                > &
                  LineageNodeProperties_DataFlow_Fragment)
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
                > &
                  LineageNodeProperties_DataJob_Fragment)
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
                > &
                  LineageNodeProperties_DataProcessInstance_Fragment)
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
                > &
                  LineageNodeProperties_Dataset_Fragment)
              | ({ __typename?: "Domain" } & Pick<Types.Domain, "urn" | "type">)
              | ({ __typename?: "ERModelRelationship" } & Pick<
                  Types.ErModelRelationship,
                  "urn" | "type"
                > &
                  LineageNodeProperties_ErModelRelationship_Fragment)
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
              | ({ __typename?: "Incident" } & Pick<
                  Types.Incident,
                  "urn" | "type"
                >)
              | ({ __typename?: "MLFeature" } & Pick<
                  Types.MlFeature,
                  "urn" | "type"
                > &
                  LineageNodeProperties_MlFeature_Fragment)
              | ({ __typename?: "MLFeatureTable" } & Pick<
                  Types.MlFeatureTable,
                  "urn" | "type"
                > &
                  LineageNodeProperties_MlFeatureTable_Fragment)
              | ({ __typename?: "MLModel" } & Pick<
                  Types.MlModel,
                  "urn" | "type"
                > &
                  LineageNodeProperties_MlModel_Fragment)
              | ({ __typename?: "MLModelGroup" } & Pick<
                  Types.MlModelGroup,
                  "urn" | "type"
                > &
                  LineageNodeProperties_MlModelGroup_Fragment)
              | ({ __typename?: "MLPrimaryKey" } & Pick<
                  Types.MlPrimaryKey,
                  "urn" | "type"
                > &
                  LineageNodeProperties_MlPrimaryKey_Fragment)
              | ({ __typename?: "Notebook" } & Pick<
                  Types.Notebook,
                  "urn" | "type"
                >)
              | ({ __typename?: "OwnershipTypeEntity" } & Pick<
                  Types.OwnershipTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Post" } & Pick<Types.Post, "urn" | "type">)
              | ({ __typename?: "QueryEntity" } & Pick<
                  Types.QueryEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Restricted" } & Pick<
                  Types.Restricted,
                  "urn" | "type"
                > &
                  LineageNodeProperties_Restricted_Fragment)
              | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type">)
              | ({ __typename?: "SchemaFieldEntity" } & Pick<
                  Types.SchemaFieldEntity,
                  "urn" | "type"
                > &
                  LineageNodeProperties_SchemaFieldEntity_Fragment)
              | ({ __typename?: "StructuredPropertyEntity" } & Pick<
                  Types.StructuredPropertyEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn" | "type">)
              | ({ __typename?: "Test" } & Pick<Types.Test, "urn" | "type">)
              | ({ __typename?: "VersionSet" } & Pick<
                  Types.VersionSet,
                  "urn" | "type"
                >)
              | ({ __typename?: "VersionedDataset" } & Pick<
                  Types.VersionedDataset,
                  "urn" | "type"
                >);
          }
        >;
      }
  >;
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_Dataset_Fragment;

export type RelationshipFields_ErModelRelationship_Fragment = {
  __typename?: "ERModelRelationship";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_ErModelRelationship_Fragment;

export type RelationshipFields_MlFeature_Fragment = {
  __typename?: "MLFeature";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_MlFeature_Fragment;

export type RelationshipFields_MlFeatureTable_Fragment = {
  __typename?: "MLFeatureTable";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_MlFeatureTable_Fragment;

export type RelationshipFields_MlModel_Fragment = { __typename?: "MLModel" } & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_MlModel_Fragment;

export type RelationshipFields_MlModelGroup_Fragment = {
  __typename?: "MLModelGroup";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_MlModelGroup_Fragment;

export type RelationshipFields_MlPrimaryKey_Fragment = {
  __typename?: "MLPrimaryKey";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_MlPrimaryKey_Fragment;

export type RelationshipFields_Restricted_Fragment = {
  __typename?: "Restricted";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_Restricted_Fragment;

export type RelationshipFields_SchemaFieldEntity_Fragment = {
  __typename?: "SchemaFieldEntity";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_SchemaFieldEntity_Fragment;

export type RelationshipFieldsFragment =
  | RelationshipFields_Assertion_Fragment
  | RelationshipFields_Chart_Fragment
  | RelationshipFields_Dashboard_Fragment
  | RelationshipFields_DataFlow_Fragment
  | RelationshipFields_DataJob_Fragment
  | RelationshipFields_DataProcessInstance_Fragment
  | RelationshipFields_Dataset_Fragment
  | RelationshipFields_ErModelRelationship_Fragment
  | RelationshipFields_MlFeature_Fragment
  | RelationshipFields_MlFeatureTable_Fragment
  | RelationshipFields_MlModel_Fragment
  | RelationshipFields_MlModelGroup_Fragment
  | RelationshipFields_MlPrimaryKey_Fragment
  | RelationshipFields_Restricted_Fragment
  | RelationshipFields_SchemaFieldEntity_Fragment;

export type GetEntitiesNotesQueryVariables = Types.Exact<{
  urns: Array<Types.Scalars["String"]> | Types.Scalars["String"];
}>;

export type GetEntitiesNotesQuery = { __typename?: "Query" } & {
  entities?: Types.Maybe<
    Array<
      Types.Maybe<
        | { __typename?: "AccessTokenMetadata" }
        | { __typename?: "Application" }
        | ({ __typename?: "Assertion" } & Pick<
            Types.Assertion,
            "urn" | "type"
          > &
            Notes_Assertion_Fragment)
        | { __typename?: "BusinessAttribute" }
        | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type"> &
            Notes_Chart_Fragment)
        | { __typename?: "Container" }
        | { __typename?: "CorpGroup" }
        | { __typename?: "CorpUser" }
        | ({ __typename?: "Dashboard" } & Pick<
            Types.Dashboard,
            "urn" | "type"
          > &
            Notes_Dashboard_Fragment)
        | { __typename?: "DataContract" }
        | ({ __typename?: "DataFlow" } & Pick<Types.DataFlow, "urn" | "type"> &
            Notes_DataFlow_Fragment)
        | { __typename?: "DataHubConnection" }
        | { __typename?: "DataHubFile" }
        | { __typename?: "DataHubPageModule" }
        | { __typename?: "DataHubPageTemplate" }
        | { __typename?: "DataHubPolicy" }
        | { __typename?: "DataHubRole" }
        | { __typename?: "DataHubView" }
        | ({ __typename?: "DataJob" } & Pick<Types.DataJob, "urn" | "type"> &
            Notes_DataJob_Fragment)
        | { __typename?: "DataPlatform" }
        | { __typename?: "DataPlatformInstance" }
        | ({ __typename?: "DataProcessInstance" } & Pick<
            Types.DataProcessInstance,
            "urn" | "type"
          > &
            Notes_DataProcessInstance_Fragment)
        | { __typename?: "DataProduct" }
        | { __typename?: "DataTypeEntity" }
        | ({ __typename?: "Dataset" } & Pick<Types.Dataset, "urn" | "type"> &
            Notes_Dataset_Fragment)
        | { __typename?: "Domain" }
        | ({ __typename?: "ERModelRelationship" } & Pick<
            Types.ErModelRelationship,
            "urn" | "type"
          > &
            Notes_ErModelRelationship_Fragment)
        | { __typename?: "EntityTypeEntity" }
        | { __typename?: "ExecutionRequest" }
        | { __typename?: "Form" }
        | { __typename?: "GlossaryNode" }
        | { __typename?: "GlossaryTerm" }
        | { __typename?: "Incident" }
        | ({ __typename?: "MLFeature" } & Pick<
            Types.MlFeature,
            "urn" | "type"
          > &
            Notes_MlFeature_Fragment)
        | ({ __typename?: "MLFeatureTable" } & Pick<
            Types.MlFeatureTable,
            "urn" | "type"
          > &
            Notes_MlFeatureTable_Fragment)
        | ({ __typename?: "MLModel" } & Pick<Types.MlModel, "urn" | "type"> &
            Notes_MlModel_Fragment)
        | ({ __typename?: "MLModelGroup" } & Pick<
            Types.MlModelGroup,
            "urn" | "type"
          > &
            Notes_MlModelGroup_Fragment)
        | ({ __typename?: "MLPrimaryKey" } & Pick<
            Types.MlPrimaryKey,
            "urn" | "type"
          > &
            Notes_MlPrimaryKey_Fragment)
        | { __typename?: "Notebook" }
        | { __typename?: "OwnershipTypeEntity" }
        | { __typename?: "Post" }
        | { __typename?: "QueryEntity" }
        | ({ __typename?: "Restricted" } & Pick<
            Types.Restricted,
            "urn" | "type"
          > &
            Notes_Restricted_Fragment)
        | { __typename?: "Role" }
        | ({ __typename?: "SchemaFieldEntity" } & Pick<
            Types.SchemaFieldEntity,
            "urn" | "type"
          > &
            Notes_SchemaFieldEntity_Fragment)
        | { __typename?: "StructuredPropertyEntity" }
        | { __typename?: "Tag" }
        | { __typename?: "Test" }
        | { __typename?: "VersionSet" }
        | { __typename?: "VersionedDataset" }
      >
    >
  >;
};

export const RelationshipFieldsFragmentDoc = gql`
  fragment relationshipFields on EntityWithRelationships {
    ...lineageNodeProperties
    ... on Dataset {
      siblings {
        isPrimary
        siblings {
          urn
          type
          ...lineageNodeProperties
        }
      }
      siblingsSearch(input: { query: "*", count: 5 }) {
        count
        total
        searchResults {
          entity {
            urn
            type
            ...lineageNodeProperties
          }
        }
      }
    }
    upstream: lineage(input: { direction: UPSTREAM, start: 0, count: 100 }) {
      ...leafLineageResults
    }
    downstream: lineage(
      input: { direction: DOWNSTREAM, start: 0, count: 100 }
    ) {
      ...leafLineageResults
    }
  }
  ${LineageNodePropertiesFragmentDoc}
  ${LeafLineageResultsFragmentDoc}
`;
export const FullRelationshipResultsFragmentDoc = gql`
  fragment fullRelationshipResults on EntityRelationshipsResult {
    start
    count
    total
    relationships {
      type
      direction
      entity {
        ...relationshipFields
      }
    }
  }
  ${RelationshipFieldsFragmentDoc}
`;
export const LeafRelationshipResultsFragmentDoc = gql`
  fragment leafRelationshipResults on EntityRelationshipsResult {
    start
    count
    total
    relationships {
      type
      entity {
        urn
        type
      }
    }
  }
`;
export const GetEntitiesNotesDocument = gql`
  query getEntitiesNotes($urns: [String!]!) {
    entities(urns: $urns) {
      ... on EntityWithRelationships {
        urn
        type
        ...notes
      }
    }
  }
  ${NotesFragmentDoc}
`;

/**
 * __useGetEntitiesNotesQuery__
 *
 * To run a query within a React component, call `useGetEntitiesNotesQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetEntitiesNotesQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetEntitiesNotesQuery({
 *   variables: {
 *      urns: // value for 'urns'
 *   },
 * });
 */
export function useGetEntitiesNotesQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetEntitiesNotesQuery,
    GetEntitiesNotesQueryVariables
  >,
) {
  return Apollo.useQuery<GetEntitiesNotesQuery, GetEntitiesNotesQueryVariables>(
    GetEntitiesNotesDocument,
    baseOptions,
  );
}
export function useGetEntitiesNotesLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetEntitiesNotesQuery,
    GetEntitiesNotesQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetEntitiesNotesQuery,
    GetEntitiesNotesQueryVariables
  >(GetEntitiesNotesDocument, baseOptions);
}
export type GetEntitiesNotesQueryHookResult = ReturnType<
  typeof useGetEntitiesNotesQuery
>;
export type GetEntitiesNotesLazyQueryHookResult = ReturnType<
  typeof useGetEntitiesNotesLazyQuery
>;
export type GetEntitiesNotesQueryResult = Apollo.QueryResult<
  GetEntitiesNotesQuery,
  GetEntitiesNotesQueryVariables
>;
