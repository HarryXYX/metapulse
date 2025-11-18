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
import { AssertionDetailsFragment } from "./assertion.generated";
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
import { AssertionDetailsFragmentDoc } from "./assertion.generated";
import * as Apollo from "@apollo/client";
export type IncidentLinkedAssetPreview_AccessTokenMetadata_Fragment = {
  __typename?: "AccessTokenMetadata";
} & Pick<Types.AccessTokenMetadata, "urn" | "type">;

export type IncidentLinkedAssetPreview_Application_Fragment = {
  __typename?: "Application";
} & Pick<Types.Application, "urn" | "type">;

export type IncidentLinkedAssetPreview_Assertion_Fragment = {
  __typename?: "Assertion";
} & Pick<Types.Assertion, "urn" | "type">;

export type IncidentLinkedAssetPreview_BusinessAttribute_Fragment = {
  __typename?: "BusinessAttribute";
} & Pick<Types.BusinessAttribute, "urn" | "type">;

export type IncidentLinkedAssetPreview_Chart_Fragment = {
  __typename?: "Chart";
} & Pick<Types.Chart, "urn" | "type" | "tool" | "chartId"> & {
    properties?: Types.Maybe<
      { __typename?: "ChartProperties" } & Pick<
        Types.ChartProperties,
        "name" | "description" | "externalUrl" | "type" | "access"
      > & {
          lastModified: { __typename?: "AuditStamp" } & Pick<
            Types.AuditStamp,
            "time"
          >;
        }
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
  };

export type IncidentLinkedAssetPreview_Container_Fragment = {
  __typename?: "Container";
} & Pick<Types.Container, "urn" | "type">;

export type IncidentLinkedAssetPreview_CorpGroup_Fragment = {
  __typename?: "CorpGroup";
} & Pick<Types.CorpGroup, "urn" | "type">;

export type IncidentLinkedAssetPreview_CorpUser_Fragment = {
  __typename?: "CorpUser";
} & Pick<Types.CorpUser, "urn" | "type">;

export type IncidentLinkedAssetPreview_Dashboard_Fragment = {
  __typename?: "Dashboard";
} & Pick<Types.Dashboard, "urn" | "type" | "tool" | "dashboardId"> & {
    properties?: Types.Maybe<
      { __typename?: "DashboardProperties" } & Pick<
        Types.DashboardProperties,
        "name" | "description" | "externalUrl" | "access"
      > & {
          lastModified: { __typename?: "AuditStamp" } & Pick<
            Types.AuditStamp,
            "time"
          >;
        }
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
  };

export type IncidentLinkedAssetPreview_DataContract_Fragment = {
  __typename?: "DataContract";
} & Pick<Types.DataContract, "urn" | "type">;

export type IncidentLinkedAssetPreview_DataFlow_Fragment = {
  __typename?: "DataFlow";
} & Pick<
  Types.DataFlow,
  "urn" | "type" | "orchestrator" | "flowId" | "cluster"
> & {
    properties?: Types.Maybe<
      { __typename?: "DataFlowProperties" } & Pick<
        Types.DataFlowProperties,
        "name" | "description" | "project"
      >
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
  };

export type IncidentLinkedAssetPreview_DataHubConnection_Fragment = {
  __typename?: "DataHubConnection";
} & Pick<Types.DataHubConnection, "urn" | "type">;

export type IncidentLinkedAssetPreview_DataHubFile_Fragment = {
  __typename?: "DataHubFile";
} & Pick<Types.DataHubFile, "urn" | "type">;

export type IncidentLinkedAssetPreview_DataHubPageModule_Fragment = {
  __typename?: "DataHubPageModule";
} & Pick<Types.DataHubPageModule, "urn" | "type">;

export type IncidentLinkedAssetPreview_DataHubPageTemplate_Fragment = {
  __typename?: "DataHubPageTemplate";
} & Pick<Types.DataHubPageTemplate, "urn" | "type">;

export type IncidentLinkedAssetPreview_DataHubPolicy_Fragment = {
  __typename?: "DataHubPolicy";
} & Pick<Types.DataHubPolicy, "urn" | "type">;

export type IncidentLinkedAssetPreview_DataHubRole_Fragment = {
  __typename?: "DataHubRole";
} & Pick<Types.DataHubRole, "urn" | "type">;

export type IncidentLinkedAssetPreview_DataHubView_Fragment = {
  __typename?: "DataHubView";
} & Pick<Types.DataHubView, "urn" | "type">;

export type IncidentLinkedAssetPreview_DataJob_Fragment = {
  __typename?: "DataJob";
} & Pick<Types.DataJob, "urn" | "type">;

export type IncidentLinkedAssetPreview_DataPlatform_Fragment = {
  __typename?: "DataPlatform";
} & Pick<Types.DataPlatform, "urn" | "type"> &
  NonConflictingPlatformFieldsFragment;

export type IncidentLinkedAssetPreview_DataPlatformInstance_Fragment = {
  __typename?: "DataPlatformInstance";
} & Pick<Types.DataPlatformInstance, "urn" | "type">;

export type IncidentLinkedAssetPreview_DataProcessInstance_Fragment = {
  __typename?: "DataProcessInstance";
} & Pick<Types.DataProcessInstance, "urn" | "type">;

export type IncidentLinkedAssetPreview_DataProduct_Fragment = {
  __typename?: "DataProduct";
} & Pick<Types.DataProduct, "urn" | "type">;

export type IncidentLinkedAssetPreview_DataTypeEntity_Fragment = {
  __typename?: "DataTypeEntity";
} & Pick<Types.DataTypeEntity, "urn" | "type">;

export type IncidentLinkedAssetPreview_Dataset_Fragment = {
  __typename?: "Dataset";
} & Pick<
  Types.Dataset,
  "name" | "origin" | "uri" | "platformNativeType" | "urn" | "type"
> & {
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    editableProperties?: Types.Maybe<
      { __typename?: "DatasetEditableProperties" } & Pick<
        Types.DatasetEditableProperties,
        "name" | "description"
      >
    >;
    properties?: Types.Maybe<
      { __typename?: "DatasetProperties" } & Pick<
        Types.DatasetProperties,
        "name" | "description"
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
  };

export type IncidentLinkedAssetPreview_Domain_Fragment = {
  __typename?: "Domain";
} & Pick<Types.Domain, "urn" | "type">;

export type IncidentLinkedAssetPreview_ErModelRelationship_Fragment = {
  __typename?: "ERModelRelationship";
} & Pick<Types.ErModelRelationship, "urn" | "type">;

export type IncidentLinkedAssetPreview_EntityTypeEntity_Fragment = {
  __typename?: "EntityTypeEntity";
} & Pick<Types.EntityTypeEntity, "urn" | "type">;

export type IncidentLinkedAssetPreview_ExecutionRequest_Fragment = {
  __typename?: "ExecutionRequest";
} & Pick<Types.ExecutionRequest, "urn" | "type">;

export type IncidentLinkedAssetPreview_Form_Fragment = {
  __typename?: "Form";
} & Pick<Types.Form, "urn" | "type">;

export type IncidentLinkedAssetPreview_GlossaryNode_Fragment = {
  __typename?: "GlossaryNode";
} & Pick<Types.GlossaryNode, "urn" | "type">;

export type IncidentLinkedAssetPreview_GlossaryTerm_Fragment = {
  __typename?: "GlossaryTerm";
} & Pick<Types.GlossaryTerm, "urn" | "type">;

export type IncidentLinkedAssetPreview_Incident_Fragment = {
  __typename?: "Incident";
} & Pick<Types.Incident, "urn" | "type">;

export type IncidentLinkedAssetPreview_MlFeature_Fragment = {
  __typename?: "MLFeature";
} & Pick<Types.MlFeature, "urn" | "type">;

export type IncidentLinkedAssetPreview_MlFeatureTable_Fragment = {
  __typename?: "MLFeatureTable";
} & Pick<Types.MlFeatureTable, "urn" | "type" | "name" | "description"> & {
    featureTableProperties?: Types.Maybe<
      { __typename?: "MLFeatureTableProperties" } & Pick<
        Types.MlFeatureTableProperties,
        "description"
      > & {
          mlFeatures?: Types.Maybe<
            Array<
              Types.Maybe<
                { __typename?: "MLFeature" } & Pick<Types.MlFeature, "urn">
              >
            >
          >;
          mlPrimaryKeys?: Types.Maybe<
            Array<
              Types.Maybe<
                { __typename?: "MLPrimaryKey" } & Pick<
                  Types.MlPrimaryKey,
                  "urn"
                >
              >
            >
          >;
        }
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
  };

export type IncidentLinkedAssetPreview_MlModel_Fragment = {
  __typename?: "MLModel";
} & Pick<Types.MlModel, "name" | "description" | "origin" | "urn" | "type"> & {
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
  };

export type IncidentLinkedAssetPreview_MlModelGroup_Fragment = {
  __typename?: "MLModelGroup";
} & Pick<
  Types.MlModelGroup,
  "name" | "origin" | "description" | "urn" | "type"
> & {
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
  };

export type IncidentLinkedAssetPreview_MlPrimaryKey_Fragment = {
  __typename?: "MLPrimaryKey";
} & Pick<Types.MlPrimaryKey, "urn" | "type">;

export type IncidentLinkedAssetPreview_Notebook_Fragment = {
  __typename?: "Notebook";
} & Pick<Types.Notebook, "urn" | "type">;

export type IncidentLinkedAssetPreview_OwnershipTypeEntity_Fragment = {
  __typename?: "OwnershipTypeEntity";
} & Pick<Types.OwnershipTypeEntity, "urn" | "type">;

export type IncidentLinkedAssetPreview_Post_Fragment = {
  __typename?: "Post";
} & Pick<Types.Post, "urn" | "type">;

export type IncidentLinkedAssetPreview_QueryEntity_Fragment = {
  __typename?: "QueryEntity";
} & Pick<Types.QueryEntity, "urn" | "type">;

export type IncidentLinkedAssetPreview_Restricted_Fragment = {
  __typename?: "Restricted";
} & Pick<Types.Restricted, "urn" | "type">;

export type IncidentLinkedAssetPreview_Role_Fragment = {
  __typename?: "Role";
} & Pick<Types.Role, "urn" | "type">;

export type IncidentLinkedAssetPreview_SchemaFieldEntity_Fragment = {
  __typename?: "SchemaFieldEntity";
} & Pick<Types.SchemaFieldEntity, "urn" | "type">;

export type IncidentLinkedAssetPreview_StructuredPropertyEntity_Fragment = {
  __typename?: "StructuredPropertyEntity";
} & Pick<Types.StructuredPropertyEntity, "urn" | "type">;

export type IncidentLinkedAssetPreview_Tag_Fragment = {
  __typename?: "Tag";
} & Pick<Types.Tag, "urn" | "type">;

export type IncidentLinkedAssetPreview_Test_Fragment = {
  __typename?: "Test";
} & Pick<Types.Test, "urn" | "type">;

export type IncidentLinkedAssetPreview_VersionSet_Fragment = {
  __typename?: "VersionSet";
} & Pick<Types.VersionSet, "urn" | "type">;

export type IncidentLinkedAssetPreview_VersionedDataset_Fragment = {
  __typename?: "VersionedDataset";
} & Pick<Types.VersionedDataset, "urn" | "type">;

export type IncidentLinkedAssetPreviewFragment =
  | IncidentLinkedAssetPreview_AccessTokenMetadata_Fragment
  | IncidentLinkedAssetPreview_Application_Fragment
  | IncidentLinkedAssetPreview_Assertion_Fragment
  | IncidentLinkedAssetPreview_BusinessAttribute_Fragment
  | IncidentLinkedAssetPreview_Chart_Fragment
  | IncidentLinkedAssetPreview_Container_Fragment
  | IncidentLinkedAssetPreview_CorpGroup_Fragment
  | IncidentLinkedAssetPreview_CorpUser_Fragment
  | IncidentLinkedAssetPreview_Dashboard_Fragment
  | IncidentLinkedAssetPreview_DataContract_Fragment
  | IncidentLinkedAssetPreview_DataFlow_Fragment
  | IncidentLinkedAssetPreview_DataHubConnection_Fragment
  | IncidentLinkedAssetPreview_DataHubFile_Fragment
  | IncidentLinkedAssetPreview_DataHubPageModule_Fragment
  | IncidentLinkedAssetPreview_DataHubPageTemplate_Fragment
  | IncidentLinkedAssetPreview_DataHubPolicy_Fragment
  | IncidentLinkedAssetPreview_DataHubRole_Fragment
  | IncidentLinkedAssetPreview_DataHubView_Fragment
  | IncidentLinkedAssetPreview_DataJob_Fragment
  | IncidentLinkedAssetPreview_DataPlatform_Fragment
  | IncidentLinkedAssetPreview_DataPlatformInstance_Fragment
  | IncidentLinkedAssetPreview_DataProcessInstance_Fragment
  | IncidentLinkedAssetPreview_DataProduct_Fragment
  | IncidentLinkedAssetPreview_DataTypeEntity_Fragment
  | IncidentLinkedAssetPreview_Dataset_Fragment
  | IncidentLinkedAssetPreview_Domain_Fragment
  | IncidentLinkedAssetPreview_ErModelRelationship_Fragment
  | IncidentLinkedAssetPreview_EntityTypeEntity_Fragment
  | IncidentLinkedAssetPreview_ExecutionRequest_Fragment
  | IncidentLinkedAssetPreview_Form_Fragment
  | IncidentLinkedAssetPreview_GlossaryNode_Fragment
  | IncidentLinkedAssetPreview_GlossaryTerm_Fragment
  | IncidentLinkedAssetPreview_Incident_Fragment
  | IncidentLinkedAssetPreview_MlFeature_Fragment
  | IncidentLinkedAssetPreview_MlFeatureTable_Fragment
  | IncidentLinkedAssetPreview_MlModel_Fragment
  | IncidentLinkedAssetPreview_MlModelGroup_Fragment
  | IncidentLinkedAssetPreview_MlPrimaryKey_Fragment
  | IncidentLinkedAssetPreview_Notebook_Fragment
  | IncidentLinkedAssetPreview_OwnershipTypeEntity_Fragment
  | IncidentLinkedAssetPreview_Post_Fragment
  | IncidentLinkedAssetPreview_QueryEntity_Fragment
  | IncidentLinkedAssetPreview_Restricted_Fragment
  | IncidentLinkedAssetPreview_Role_Fragment
  | IncidentLinkedAssetPreview_SchemaFieldEntity_Fragment
  | IncidentLinkedAssetPreview_StructuredPropertyEntity_Fragment
  | IncidentLinkedAssetPreview_Tag_Fragment
  | IncidentLinkedAssetPreview_Test_Fragment
  | IncidentLinkedAssetPreview_VersionSet_Fragment
  | IncidentLinkedAssetPreview_VersionedDataset_Fragment;

export type IncidentFieldsFragment = { __typename?: "Incident" } & Pick<
  Types.Incident,
  | "incidentType"
  | "customType"
  | "title"
  | "description"
  | "startedAt"
  | "priority"
> & {
    incidentStatus: { __typename?: "IncidentStatus" } & Pick<
      Types.IncidentStatus,
      "state" | "stage" | "message"
    > & {
        lastUpdated: { __typename?: "AuditStamp" } & Pick<
          Types.AuditStamp,
          "time" | "actor"
        >;
      };
    source?: Types.Maybe<
      { __typename?: "IncidentSource" } & Pick<Types.IncidentSource, "type"> & {
          source?: Types.Maybe<
            | { __typename?: "AccessTokenMetadata" }
            | { __typename?: "Application" }
            | ({ __typename?: "Assertion" } & AssertionDetailsFragment)
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
            | { __typename?: "StructuredPropertyEntity" }
            | { __typename?: "Tag" }
            | { __typename?: "Test" }
            | { __typename?: "VersionSet" }
            | { __typename?: "VersionedDataset" }
          >;
        }
    >;
    created: { __typename?: "AuditStamp" } & Pick<
      Types.AuditStamp,
      "time" | "actor"
    >;
    tags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    assignees?: Types.Maybe<
      Array<
        | { __typename?: "CorpGroup" }
        | ({ __typename?: "CorpUser" } & Pick<
            Types.CorpUser,
            "urn" | "type" | "username" | "status"
          > & {
              properties?: Types.Maybe<
                { __typename?: "CorpUserProperties" } & Pick<
                  Types.CorpUserProperties,
                  "displayName"
                >
              >;
            })
      >
    >;
    entity:
      | ({
          __typename?: "AccessTokenMetadata";
        } & IncidentLinkedAssetPreview_AccessTokenMetadata_Fragment)
      | ({
          __typename?: "Application";
        } & IncidentLinkedAssetPreview_Application_Fragment)
      | ({
          __typename?: "Assertion";
        } & IncidentLinkedAssetPreview_Assertion_Fragment)
      | ({
          __typename?: "BusinessAttribute";
        } & IncidentLinkedAssetPreview_BusinessAttribute_Fragment)
      | ({ __typename?: "Chart" } & IncidentLinkedAssetPreview_Chart_Fragment)
      | ({
          __typename?: "Container";
        } & IncidentLinkedAssetPreview_Container_Fragment)
      | ({
          __typename?: "CorpGroup";
        } & IncidentLinkedAssetPreview_CorpGroup_Fragment)
      | ({
          __typename?: "CorpUser";
        } & IncidentLinkedAssetPreview_CorpUser_Fragment)
      | ({
          __typename?: "Dashboard";
        } & IncidentLinkedAssetPreview_Dashboard_Fragment)
      | ({
          __typename?: "DataContract";
        } & IncidentLinkedAssetPreview_DataContract_Fragment)
      | ({
          __typename?: "DataFlow";
        } & IncidentLinkedAssetPreview_DataFlow_Fragment)
      | ({
          __typename?: "DataHubConnection";
        } & IncidentLinkedAssetPreview_DataHubConnection_Fragment)
      | ({
          __typename?: "DataHubFile";
        } & IncidentLinkedAssetPreview_DataHubFile_Fragment)
      | ({
          __typename?: "DataHubPageModule";
        } & IncidentLinkedAssetPreview_DataHubPageModule_Fragment)
      | ({
          __typename?: "DataHubPageTemplate";
        } & IncidentLinkedAssetPreview_DataHubPageTemplate_Fragment)
      | ({
          __typename?: "DataHubPolicy";
        } & IncidentLinkedAssetPreview_DataHubPolicy_Fragment)
      | ({
          __typename?: "DataHubRole";
        } & IncidentLinkedAssetPreview_DataHubRole_Fragment)
      | ({
          __typename?: "DataHubView";
        } & IncidentLinkedAssetPreview_DataHubView_Fragment)
      | ({
          __typename?: "DataJob";
        } & IncidentLinkedAssetPreview_DataJob_Fragment)
      | ({
          __typename?: "DataPlatform";
        } & IncidentLinkedAssetPreview_DataPlatform_Fragment)
      | ({
          __typename?: "DataPlatformInstance";
        } & IncidentLinkedAssetPreview_DataPlatformInstance_Fragment)
      | ({
          __typename?: "DataProcessInstance";
        } & IncidentLinkedAssetPreview_DataProcessInstance_Fragment)
      | ({
          __typename?: "DataProduct";
        } & IncidentLinkedAssetPreview_DataProduct_Fragment)
      | ({
          __typename?: "DataTypeEntity";
        } & IncidentLinkedAssetPreview_DataTypeEntity_Fragment)
      | ({
          __typename?: "Dataset";
        } & IncidentLinkedAssetPreview_Dataset_Fragment)
      | ({ __typename?: "Domain" } & IncidentLinkedAssetPreview_Domain_Fragment)
      | ({
          __typename?: "ERModelRelationship";
        } & IncidentLinkedAssetPreview_ErModelRelationship_Fragment)
      | ({
          __typename?: "EntityTypeEntity";
        } & IncidentLinkedAssetPreview_EntityTypeEntity_Fragment)
      | ({
          __typename?: "ExecutionRequest";
        } & IncidentLinkedAssetPreview_ExecutionRequest_Fragment)
      | ({ __typename?: "Form" } & IncidentLinkedAssetPreview_Form_Fragment)
      | ({
          __typename?: "GlossaryNode";
        } & IncidentLinkedAssetPreview_GlossaryNode_Fragment)
      | ({
          __typename?: "GlossaryTerm";
        } & IncidentLinkedAssetPreview_GlossaryTerm_Fragment)
      | ({
          __typename?: "Incident";
        } & IncidentLinkedAssetPreview_Incident_Fragment)
      | ({
          __typename?: "MLFeature";
        } & IncidentLinkedAssetPreview_MlFeature_Fragment)
      | ({
          __typename?: "MLFeatureTable";
        } & IncidentLinkedAssetPreview_MlFeatureTable_Fragment)
      | ({
          __typename?: "MLModel";
        } & IncidentLinkedAssetPreview_MlModel_Fragment)
      | ({
          __typename?: "MLModelGroup";
        } & IncidentLinkedAssetPreview_MlModelGroup_Fragment)
      | ({
          __typename?: "MLPrimaryKey";
        } & IncidentLinkedAssetPreview_MlPrimaryKey_Fragment)
      | ({
          __typename?: "Notebook";
        } & IncidentLinkedAssetPreview_Notebook_Fragment)
      | ({
          __typename?: "OwnershipTypeEntity";
        } & IncidentLinkedAssetPreview_OwnershipTypeEntity_Fragment)
      | ({ __typename?: "Post" } & IncidentLinkedAssetPreview_Post_Fragment)
      | ({
          __typename?: "QueryEntity";
        } & IncidentLinkedAssetPreview_QueryEntity_Fragment)
      | ({
          __typename?: "Restricted";
        } & IncidentLinkedAssetPreview_Restricted_Fragment)
      | ({ __typename?: "Role" } & IncidentLinkedAssetPreview_Role_Fragment)
      | ({
          __typename?: "SchemaFieldEntity";
        } & IncidentLinkedAssetPreview_SchemaFieldEntity_Fragment)
      | ({
          __typename?: "StructuredPropertyEntity";
        } & IncidentLinkedAssetPreview_StructuredPropertyEntity_Fragment)
      | ({ __typename?: "Tag" } & IncidentLinkedAssetPreview_Tag_Fragment)
      | ({ __typename?: "Test" } & IncidentLinkedAssetPreview_Test_Fragment)
      | ({
          __typename?: "VersionSet";
        } & IncidentLinkedAssetPreview_VersionSet_Fragment)
      | ({
          __typename?: "VersionedDataset";
        } & IncidentLinkedAssetPreview_VersionedDataset_Fragment);
    linkedAssets?: Types.Maybe<
      { __typename?: "EntityRelationshipsResult" } & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & {
            entity?: Types.Maybe<
              | ({
                  __typename?: "AccessTokenMetadata";
                } & IncidentLinkedAssetPreview_AccessTokenMetadata_Fragment)
              | ({
                  __typename?: "Application";
                } & IncidentLinkedAssetPreview_Application_Fragment)
              | ({
                  __typename?: "Assertion";
                } & IncidentLinkedAssetPreview_Assertion_Fragment)
              | ({
                  __typename?: "BusinessAttribute";
                } & IncidentLinkedAssetPreview_BusinessAttribute_Fragment)
              | ({
                  __typename?: "Chart";
                } & IncidentLinkedAssetPreview_Chart_Fragment)
              | ({
                  __typename?: "Container";
                } & IncidentLinkedAssetPreview_Container_Fragment)
              | ({
                  __typename?: "CorpGroup";
                } & IncidentLinkedAssetPreview_CorpGroup_Fragment)
              | ({
                  __typename?: "CorpUser";
                } & IncidentLinkedAssetPreview_CorpUser_Fragment)
              | ({
                  __typename?: "Dashboard";
                } & IncidentLinkedAssetPreview_Dashboard_Fragment)
              | ({
                  __typename?: "DataContract";
                } & IncidentLinkedAssetPreview_DataContract_Fragment)
              | ({
                  __typename?: "DataFlow";
                } & IncidentLinkedAssetPreview_DataFlow_Fragment)
              | ({
                  __typename?: "DataHubConnection";
                } & IncidentLinkedAssetPreview_DataHubConnection_Fragment)
              | ({
                  __typename?: "DataHubFile";
                } & IncidentLinkedAssetPreview_DataHubFile_Fragment)
              | ({
                  __typename?: "DataHubPageModule";
                } & IncidentLinkedAssetPreview_DataHubPageModule_Fragment)
              | ({
                  __typename?: "DataHubPageTemplate";
                } & IncidentLinkedAssetPreview_DataHubPageTemplate_Fragment)
              | ({
                  __typename?: "DataHubPolicy";
                } & IncidentLinkedAssetPreview_DataHubPolicy_Fragment)
              | ({
                  __typename?: "DataHubRole";
                } & IncidentLinkedAssetPreview_DataHubRole_Fragment)
              | ({
                  __typename?: "DataHubView";
                } & IncidentLinkedAssetPreview_DataHubView_Fragment)
              | ({
                  __typename?: "DataJob";
                } & IncidentLinkedAssetPreview_DataJob_Fragment)
              | ({
                  __typename?: "DataPlatform";
                } & IncidentLinkedAssetPreview_DataPlatform_Fragment)
              | ({
                  __typename?: "DataPlatformInstance";
                } & IncidentLinkedAssetPreview_DataPlatformInstance_Fragment)
              | ({
                  __typename?: "DataProcessInstance";
                } & IncidentLinkedAssetPreview_DataProcessInstance_Fragment)
              | ({
                  __typename?: "DataProduct";
                } & IncidentLinkedAssetPreview_DataProduct_Fragment)
              | ({
                  __typename?: "DataTypeEntity";
                } & IncidentLinkedAssetPreview_DataTypeEntity_Fragment)
              | ({
                  __typename?: "Dataset";
                } & IncidentLinkedAssetPreview_Dataset_Fragment)
              | ({
                  __typename?: "Domain";
                } & IncidentLinkedAssetPreview_Domain_Fragment)
              | ({
                  __typename?: "ERModelRelationship";
                } & IncidentLinkedAssetPreview_ErModelRelationship_Fragment)
              | ({
                  __typename?: "EntityTypeEntity";
                } & IncidentLinkedAssetPreview_EntityTypeEntity_Fragment)
              | ({
                  __typename?: "ExecutionRequest";
                } & IncidentLinkedAssetPreview_ExecutionRequest_Fragment)
              | ({
                  __typename?: "Form";
                } & IncidentLinkedAssetPreview_Form_Fragment)
              | ({
                  __typename?: "GlossaryNode";
                } & IncidentLinkedAssetPreview_GlossaryNode_Fragment)
              | ({
                  __typename?: "GlossaryTerm";
                } & IncidentLinkedAssetPreview_GlossaryTerm_Fragment)
              | ({
                  __typename?: "Incident";
                } & IncidentLinkedAssetPreview_Incident_Fragment)
              | ({
                  __typename?: "MLFeature";
                } & IncidentLinkedAssetPreview_MlFeature_Fragment)
              | ({
                  __typename?: "MLFeatureTable";
                } & IncidentLinkedAssetPreview_MlFeatureTable_Fragment)
              | ({
                  __typename?: "MLModel";
                } & IncidentLinkedAssetPreview_MlModel_Fragment)
              | ({
                  __typename?: "MLModelGroup";
                } & IncidentLinkedAssetPreview_MlModelGroup_Fragment)
              | ({
                  __typename?: "MLPrimaryKey";
                } & IncidentLinkedAssetPreview_MlPrimaryKey_Fragment)
              | ({
                  __typename?: "Notebook";
                } & IncidentLinkedAssetPreview_Notebook_Fragment)
              | ({
                  __typename?: "OwnershipTypeEntity";
                } & IncidentLinkedAssetPreview_OwnershipTypeEntity_Fragment)
              | ({
                  __typename?: "Post";
                } & IncidentLinkedAssetPreview_Post_Fragment)
              | ({
                  __typename?: "QueryEntity";
                } & IncidentLinkedAssetPreview_QueryEntity_Fragment)
              | ({
                  __typename?: "Restricted";
                } & IncidentLinkedAssetPreview_Restricted_Fragment)
              | ({
                  __typename?: "Role";
                } & IncidentLinkedAssetPreview_Role_Fragment)
              | ({
                  __typename?: "SchemaFieldEntity";
                } & IncidentLinkedAssetPreview_SchemaFieldEntity_Fragment)
              | ({
                  __typename?: "StructuredPropertyEntity";
                } & IncidentLinkedAssetPreview_StructuredPropertyEntity_Fragment)
              | ({
                  __typename?: "Tag";
                } & IncidentLinkedAssetPreview_Tag_Fragment)
              | ({
                  __typename?: "Test";
                } & IncidentLinkedAssetPreview_Test_Fragment)
              | ({
                  __typename?: "VersionSet";
                } & IncidentLinkedAssetPreview_VersionSet_Fragment)
              | ({
                  __typename?: "VersionedDataset";
                } & IncidentLinkedAssetPreview_VersionedDataset_Fragment)
            >;
          }
        >;
      }
    >;
  };

export type IncidentResultFieldsFragment = {
  __typename?: "EntityIncidentsResult";
} & Pick<Types.EntityIncidentsResult, "start" | "count" | "total"> & {
    incidents: Array<
      { __typename?: "Incident" } & Pick<Types.Incident, "urn" | "type"> & {
          status: { __typename?: "IncidentStatus" } & Pick<
            Types.IncidentStatus,
            "state" | "stage" | "message"
          > & {
              lastUpdated: { __typename?: "AuditStamp" } & Pick<
                Types.AuditStamp,
                "time" | "actor"
              >;
            };
        } & IncidentFieldsFragment
    >;
  };

export type DatasetSiblingIncidentsFragment = { __typename?: "Dataset" } & {
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
                > & {
                    incidents?: Types.Maybe<
                      {
                        __typename?: "EntityIncidentsResult";
                      } & IncidentResultFieldsFragment
                    >;
                  })
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
                > & {
                    incidents?: Types.Maybe<
                      {
                        __typename?: "EntityIncidentsResult";
                      } & IncidentResultFieldsFragment
                    >;
                  })
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
                >);
          }
        >;
      }
  >;
};

export type GetEntityIncidentsQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  start: Types.Scalars["Int"];
  count: Types.Scalars["Int"];
  state?: Types.Maybe<Types.IncidentState>;
}>;

export type GetEntityIncidentsQuery = { __typename?: "Query" } & {
  entity?: Types.Maybe<
    | { __typename?: "AccessTokenMetadata" }
    | { __typename?: "Application" }
    | { __typename?: "Assertion" }
    | { __typename?: "BusinessAttribute" }
    | ({ __typename?: "Chart" } & {
        incidents?: Types.Maybe<
          {
            __typename?: "EntityIncidentsResult";
          } & IncidentResultFieldsFragment
        >;
        privileges?: Types.Maybe<
          { __typename?: "EntityPrivileges" } & Pick<
            Types.EntityPrivileges,
            "canEditIncidents"
          >
        >;
      })
    | { __typename?: "Container" }
    | { __typename?: "CorpGroup" }
    | { __typename?: "CorpUser" }
    | ({ __typename?: "Dashboard" } & {
        incidents?: Types.Maybe<
          {
            __typename?: "EntityIncidentsResult";
          } & IncidentResultFieldsFragment
        >;
        privileges?: Types.Maybe<
          { __typename?: "EntityPrivileges" } & Pick<
            Types.EntityPrivileges,
            "canEditIncidents"
          >
        >;
      })
    | { __typename?: "DataContract" }
    | ({ __typename?: "DataFlow" } & {
        incidents?: Types.Maybe<
          {
            __typename?: "EntityIncidentsResult";
          } & IncidentResultFieldsFragment
        >;
        privileges?: Types.Maybe<
          { __typename?: "EntityPrivileges" } & Pick<
            Types.EntityPrivileges,
            "canEditIncidents"
          >
        >;
      })
    | { __typename?: "DataHubConnection" }
    | { __typename?: "DataHubFile" }
    | { __typename?: "DataHubPageModule" }
    | { __typename?: "DataHubPageTemplate" }
    | { __typename?: "DataHubPolicy" }
    | { __typename?: "DataHubRole" }
    | { __typename?: "DataHubView" }
    | ({ __typename?: "DataJob" } & {
        incidents?: Types.Maybe<
          {
            __typename?: "EntityIncidentsResult";
          } & IncidentResultFieldsFragment
        >;
        privileges?: Types.Maybe<
          { __typename?: "EntityPrivileges" } & Pick<
            Types.EntityPrivileges,
            "canEditIncidents"
          >
        >;
      })
    | { __typename?: "DataPlatform" }
    | { __typename?: "DataPlatformInstance" }
    | { __typename?: "DataProcessInstance" }
    | { __typename?: "DataProduct" }
    | { __typename?: "DataTypeEntity" }
    | ({ __typename?: "Dataset" } & {
        incidents?: Types.Maybe<
          {
            __typename?: "EntityIncidentsResult";
          } & IncidentResultFieldsFragment
        >;
        privileges?: Types.Maybe<
          { __typename?: "EntityPrivileges" } & Pick<
            Types.EntityPrivileges,
            "canEditIncidents"
          >
        >;
      } & DatasetSiblingIncidentsFragment)
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
};

export const IncidentLinkedAssetPreviewFragmentDoc = gql`
  fragment incidentLinkedAssetPreview on Entity {
    urn
    type
    ... on Dataset {
      name
      origin
      uri
      platform {
        ...platformFields
      }
      editableProperties {
        name
        description
      }
      platformNativeType
      properties {
        name
        description
        customProperties {
          key
          value
        }
      }
    }
    ... on Dashboard {
      urn
      type
      tool
      dashboardId
      properties {
        name
        description
        externalUrl
        access
        lastModified {
          time
        }
      }
      platform {
        ...platformFields
      }
    }
    ... on Chart {
      urn
      type
      tool
      chartId
      properties {
        name
        description
        externalUrl
        type
        access
        lastModified {
          time
        }
      }
      platform {
        ...platformFields
      }
    }
    ... on DataFlow {
      urn
      type
      orchestrator
      flowId
      cluster
      properties {
        name
        description
        project
      }
      platform {
        ...platformFields
      }
    }
    ... on MLFeatureTable {
      urn
      type
      name
      description
      featureTableProperties {
        description
        mlFeatures {
          urn
        }
        mlPrimaryKeys {
          urn
        }
      }
      platform {
        ...platformFields
      }
    }
    ... on MLModel {
      name
      description
      origin
      platform {
        ...platformFields
      }
      deprecation {
        ...deprecationFields
      }
    }
    ... on MLModelGroup {
      name
      origin
      description
      platform {
        ...platformFields
      }
      deprecation {
        ...deprecationFields
      }
    }
    ... on DataPlatform {
      ...nonConflictingPlatformFields
    }
  }
  ${PlatformFieldsFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${NonConflictingPlatformFieldsFragmentDoc}
`;
export const IncidentFieldsFragmentDoc = gql`
  fragment incidentFields on Incident {
    incidentType
    customType
    title
    description
    startedAt
    incidentStatus {
      state
      stage
      message
      lastUpdated {
        time
        actor
      }
    }
    source {
      type
      source {
        ...assertionDetails
      }
    }
    created {
      time
      actor
    }
    tags {
      ...globalTagsFields
    }
    priority
    assignees {
      ... on CorpUser {
        urn
        type
        username
        status
        properties {
          displayName
        }
      }
    }
    entity {
      ...incidentLinkedAssetPreview
    }
    linkedAssets: relationships(
      input: {
        types: ["IncidentOn"]
        direction: OUTGOING
        start: 0
        count: 1000
        includeSoftDelete: false
      }
    ) {
      relationships {
        entity {
          ...incidentLinkedAssetPreview
        }
      }
    }
  }
  ${AssertionDetailsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${IncidentLinkedAssetPreviewFragmentDoc}
`;
export const IncidentResultFieldsFragmentDoc = gql`
  fragment incidentResultFields on EntityIncidentsResult {
    start
    count
    total
    incidents {
      urn
      type
      ...incidentFields
      status {
        state
        stage
        message
        lastUpdated {
          time
          actor
        }
      }
    }
  }
  ${IncidentFieldsFragmentDoc}
`;
export const DatasetSiblingIncidentsFragmentDoc = gql`
  fragment datasetSiblingIncidents on Dataset {
    siblings {
      isPrimary
      siblings {
        urn
        type
        ... on Dataset {
          incidents(start: $start, count: $count, state: $state) {
            ...incidentResultFields
          }
        }
      }
    }
    siblingsSearch(input: { query: "*", count: 5 }) {
      count
      total
      searchResults {
        entity {
          urn
          type
          ... on Dataset {
            incidents(start: $start, count: $count, state: $state) {
              ...incidentResultFields
            }
          }
        }
      }
    }
  }
  ${IncidentResultFieldsFragmentDoc}
`;
export const GetEntityIncidentsDocument = gql`
  query getEntityIncidents(
    $urn: String!
    $start: Int!
    $count: Int!
    $state: IncidentState
  ) {
    entity(urn: $urn) {
      ... on Dataset {
        incidents(start: $start, count: $count, state: $state) {
          ...incidentResultFields
        }
        ...datasetSiblingIncidents
        privileges {
          canEditIncidents
        }
      }
      ... on DataJob {
        incidents(start: $start, count: $count, state: $state) {
          ...incidentResultFields
        }
        privileges {
          canEditIncidents
        }
      }
      ... on DataFlow {
        incidents(start: $start, count: $count, state: $state) {
          ...incidentResultFields
        }
        privileges {
          canEditIncidents
        }
      }
      ... on Dashboard {
        incidents(start: $start, count: $count, state: $state) {
          ...incidentResultFields
        }
        privileges {
          canEditIncidents
        }
      }
      ... on Chart {
        incidents(start: $start, count: $count, state: $state) {
          ...incidentResultFields
        }
        privileges {
          canEditIncidents
        }
      }
    }
  }
  ${IncidentResultFieldsFragmentDoc}
  ${DatasetSiblingIncidentsFragmentDoc}
`;

/**
 * __useGetEntityIncidentsQuery__
 *
 * To run a query within a React component, call `useGetEntityIncidentsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetEntityIncidentsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetEntityIncidentsQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      start: // value for 'start'
 *      count: // value for 'count'
 *      state: // value for 'state'
 *   },
 * });
 */
export function useGetEntityIncidentsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetEntityIncidentsQuery,
    GetEntityIncidentsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetEntityIncidentsQuery,
    GetEntityIncidentsQueryVariables
  >(GetEntityIncidentsDocument, baseOptions);
}
export function useGetEntityIncidentsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetEntityIncidentsQuery,
    GetEntityIncidentsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetEntityIncidentsQuery,
    GetEntityIncidentsQueryVariables
  >(GetEntityIncidentsDocument, baseOptions);
}
export type GetEntityIncidentsQueryHookResult = ReturnType<
  typeof useGetEntityIncidentsQuery
>;
export type GetEntityIncidentsLazyQueryHookResult = ReturnType<
  typeof useGetEntityIncidentsLazyQuery
>;
export type GetEntityIncidentsQueryResult = Apollo.QueryResult<
  GetEntityIncidentsQuery,
  GetEntityIncidentsQueryVariables
>;
