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
import { VersionPropertiesFragment } from "./versioning.generated";
import { DataProductFieldsFragment } from "./dataProduct.generated";
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
import { VersionPropertiesFragmentDoc } from "./versioning.generated";
import { DataProductFieldsFragmentDoc } from "./dataProduct.generated";
export type EntityPreview_AccessTokenMetadata_Fragment = {
  __typename?: "AccessTokenMetadata";
} & Pick<Types.AccessTokenMetadata, "urn" | "type">;

export type EntityPreview_Application_Fragment = {
  __typename?: "Application";
} & Pick<Types.Application, "urn" | "type">;

export type EntityPreview_Assertion_Fragment = {
  __typename?: "Assertion";
} & Pick<Types.Assertion, "urn" | "type">;

export type EntityPreview_BusinessAttribute_Fragment = {
  __typename?: "BusinessAttribute";
} & Pick<Types.BusinessAttribute, "urn" | "type">;

export type EntityPreview_Chart_Fragment = { __typename?: "Chart" } & Pick<
  Types.Chart,
  "urn" | "type" | "tool" | "chartId"
> & {
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
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    globalTags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "ChartEditableProperties" } & Pick<
        Types.ChartEditableProperties,
        "description"
      >
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
    health?: Types.Maybe<
      Array<{ __typename?: "Health" } & EntityHealthFragment>
    >;
  } & EntityDataProduct_Chart_Fragment;

export type EntityPreview_Container_Fragment = {
  __typename?: "Container";
} & Pick<Types.Container, "urn" | "type"> &
  EntityContainerFragment;

export type EntityPreview_CorpGroup_Fragment = {
  __typename?: "CorpGroup";
} & Pick<Types.CorpGroup, "name" | "urn" | "type"> & {
    info?: Types.Maybe<
      { __typename?: "CorpGroupInfo" } & Pick<
        Types.CorpGroupInfo,
        "displayName" | "description"
      >
    >;
    memberCount?: Types.Maybe<
      { __typename?: "EntityRelationshipsResult" } & Pick<
        Types.EntityRelationshipsResult,
        "total"
      >
    >;
  };

export type EntityPreview_CorpUser_Fragment = {
  __typename?: "CorpUser";
} & Pick<Types.CorpUser, "username" | "urn" | "type"> & {
    info?: Types.Maybe<
      { __typename?: "CorpUserInfo" } & Pick<
        Types.CorpUserInfo,
        | "active"
        | "displayName"
        | "title"
        | "firstName"
        | "lastName"
        | "fullName"
      >
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "CorpUserEditableProperties" } & Pick<
        Types.CorpUserEditableProperties,
        "displayName" | "title" | "pictureLink"
      >
    >;
  };

export type EntityPreview_Dashboard_Fragment = {
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
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    globalTags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "DashboardEditableProperties" } & Pick<
        Types.DashboardEditableProperties,
        "description"
      >
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
    health?: Types.Maybe<
      Array<{ __typename?: "Health" } & EntityHealthFragment>
    >;
  } & EntityDataProduct_Dashboard_Fragment;

export type EntityPreview_DataContract_Fragment = {
  __typename?: "DataContract";
} & Pick<Types.DataContract, "urn" | "type">;

export type EntityPreview_DataFlow_Fragment = {
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
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    globalTags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "DataFlowEditableProperties" } & Pick<
        Types.DataFlowEditableProperties,
        "description"
      >
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    health?: Types.Maybe<
      Array<{ __typename?: "Health" } & EntityHealthFragment>
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
  } & EntityDataProduct_DataFlow_Fragment;

export type EntityPreview_DataHubConnection_Fragment = {
  __typename?: "DataHubConnection";
} & Pick<Types.DataHubConnection, "urn" | "type">;

export type EntityPreview_DataHubFile_Fragment = {
  __typename?: "DataHubFile";
} & Pick<Types.DataHubFile, "urn" | "type">;

export type EntityPreview_DataHubPageModule_Fragment = {
  __typename?: "DataHubPageModule";
} & Pick<Types.DataHubPageModule, "urn" | "type">;

export type EntityPreview_DataHubPageTemplate_Fragment = {
  __typename?: "DataHubPageTemplate";
} & Pick<Types.DataHubPageTemplate, "urn" | "type">;

export type EntityPreview_DataHubPolicy_Fragment = {
  __typename?: "DataHubPolicy";
} & Pick<Types.DataHubPolicy, "urn" | "type">;

export type EntityPreview_DataHubRole_Fragment = {
  __typename?: "DataHubRole";
} & Pick<Types.DataHubRole, "urn" | "type">;

export type EntityPreview_DataHubView_Fragment = {
  __typename?: "DataHubView";
} & Pick<Types.DataHubView, "urn" | "type">;

export type EntityPreview_DataJob_Fragment = { __typename?: "DataJob" } & Pick<
  Types.DataJob,
  "urn" | "type" | "jobId"
> & {
    dataFlow?: Types.Maybe<
      { __typename?: "DataFlow" } & NonRecursiveDataFlowFieldsFragment
    >;
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    properties?: Types.Maybe<
      { __typename?: "DataJobProperties" } & Pick<
        Types.DataJobProperties,
        "name" | "description"
      >
    >;
    globalTags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "DataJobEditableProperties" } & Pick<
        Types.DataJobEditableProperties,
        "description"
      >
    >;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
    health?: Types.Maybe<
      Array<{ __typename?: "Health" } & EntityHealthFragment>
    >;
  } & EntityDataProduct_DataJob_Fragment;

export type EntityPreview_DataPlatform_Fragment = {
  __typename?: "DataPlatform";
} & Pick<Types.DataPlatform, "urn" | "type"> &
  NonConflictingPlatformFieldsFragment;

export type EntityPreview_DataPlatformInstance_Fragment = {
  __typename?: "DataPlatformInstance";
} & Pick<Types.DataPlatformInstance, "urn" | "type">;

export type EntityPreview_DataProcessInstance_Fragment = {
  __typename?: "DataProcessInstance";
} & Pick<Types.DataProcessInstance, "urn" | "type">;

export type EntityPreview_DataProduct_Fragment = {
  __typename?: "DataProduct";
} & Pick<Types.DataProduct, "urn" | "type"> &
  DataProductFieldsFragment;

export type EntityPreview_DataTypeEntity_Fragment = {
  __typename?: "DataTypeEntity";
} & Pick<Types.DataTypeEntity, "urn" | "type">;

export type EntityPreview_Dataset_Fragment = { __typename?: "Dataset" } & Pick<
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
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    globalTags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    health?: Types.Maybe<
      Array<{ __typename?: "Health" } & EntityHealthFragment>
    >;
    versionProperties?: Types.Maybe<
      { __typename?: "VersionProperties" } & VersionPropertiesFragment
    >;
  } & EntityDataProduct_Dataset_Fragment;

export type EntityPreview_Domain_Fragment = { __typename?: "Domain" } & Pick<
  Types.Domain,
  "urn" | "type"
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
    displayProperties?: Types.Maybe<
      { __typename?: "DisplayProperties" } & DisplayPropertiesFieldsFragment
    >;
  } & DomainEntitiesFieldsFragment;

export type EntityPreview_ErModelRelationship_Fragment = {
  __typename?: "ERModelRelationship";
} & Pick<Types.ErModelRelationship, "urn" | "type">;

export type EntityPreview_EntityTypeEntity_Fragment = {
  __typename?: "EntityTypeEntity";
} & Pick<Types.EntityTypeEntity, "urn" | "type">;

export type EntityPreview_ExecutionRequest_Fragment = {
  __typename?: "ExecutionRequest";
} & Pick<Types.ExecutionRequest, "urn" | "type">;

export type EntityPreview_Form_Fragment = { __typename?: "Form" } & Pick<
  Types.Form,
  "urn" | "type"
>;

export type EntityPreview_GlossaryNode_Fragment = {
  __typename?: "GlossaryNode";
} & Pick<Types.GlossaryNode, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "GlossaryNodeProperties" } & Pick<
        Types.GlossaryNodeProperties,
        "name" | "description"
      >
    >;
  };

export type EntityPreview_GlossaryTerm_Fragment = {
  __typename?: "GlossaryTerm";
} & Pick<Types.GlossaryTerm, "name" | "hierarchicalName" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "GlossaryTermProperties" } & Pick<
        Types.GlossaryTermProperties,
        | "name"
        | "description"
        | "termSource"
        | "sourceRef"
        | "sourceUrl"
        | "rawSchema"
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
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
  };

export type EntityPreview_Incident_Fragment = {
  __typename?: "Incident";
} & Pick<Types.Incident, "urn" | "type">;

export type EntityPreview_MlFeature_Fragment = {
  __typename?: "MLFeature";
} & Pick<Types.MlFeature, "name" | "description" | "urn" | "type"> & {
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
  };

export type EntityPreview_MlFeatureTable_Fragment = {
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
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
  };

export type EntityPreview_MlModel_Fragment = { __typename?: "MLModel" } & Pick<
  Types.MlModel,
  "name" | "description" | "origin" | "urn" | "type"
> & {
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    versionProperties?: Types.Maybe<
      { __typename?: "VersionProperties" } & VersionPropertiesFragment
    >;
  };

export type EntityPreview_MlModelGroup_Fragment = {
  __typename?: "MLModelGroup";
} & Pick<
  Types.MlModelGroup,
  "name" | "origin" | "description" | "urn" | "type"
> & {
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
  };

export type EntityPreview_MlPrimaryKey_Fragment = {
  __typename?: "MLPrimaryKey";
} & Pick<Types.MlPrimaryKey, "urn" | "type">;

export type EntityPreview_Notebook_Fragment = {
  __typename?: "Notebook";
} & Pick<Types.Notebook, "urn" | "type">;

export type EntityPreview_OwnershipTypeEntity_Fragment = {
  __typename?: "OwnershipTypeEntity";
} & Pick<Types.OwnershipTypeEntity, "urn" | "type">;

export type EntityPreview_Post_Fragment = { __typename?: "Post" } & Pick<
  Types.Post,
  "urn" | "type"
>;

export type EntityPreview_QueryEntity_Fragment = {
  __typename?: "QueryEntity";
} & Pick<Types.QueryEntity, "urn" | "type">;

export type EntityPreview_Restricted_Fragment = {
  __typename?: "Restricted";
} & Pick<Types.Restricted, "urn" | "type">;

export type EntityPreview_Role_Fragment = { __typename?: "Role" } & Pick<
  Types.Role,
  "urn" | "type"
>;

export type EntityPreview_SchemaFieldEntity_Fragment = {
  __typename?: "SchemaFieldEntity";
} & Pick<Types.SchemaFieldEntity, "urn" | "type">;

export type EntityPreview_StructuredPropertyEntity_Fragment = {
  __typename?: "StructuredPropertyEntity";
} & Pick<Types.StructuredPropertyEntity, "urn" | "type">;

export type EntityPreview_Tag_Fragment = { __typename?: "Tag" } & Pick<
  Types.Tag,
  "name" | "description" | "urn" | "type"
> & {
    properties?: Types.Maybe<
      { __typename?: "TagProperties" } & Pick<
        Types.TagProperties,
        "name" | "description" | "colorHex"
      >
    >;
  };

export type EntityPreview_Test_Fragment = { __typename?: "Test" } & Pick<
  Types.Test,
  "urn" | "type"
>;

export type EntityPreview_VersionSet_Fragment = {
  __typename?: "VersionSet";
} & Pick<Types.VersionSet, "urn" | "type">;

export type EntityPreview_VersionedDataset_Fragment = {
  __typename?: "VersionedDataset";
} & Pick<Types.VersionedDataset, "urn" | "type">;

export type EntityPreviewFragment =
  | EntityPreview_AccessTokenMetadata_Fragment
  | EntityPreview_Application_Fragment
  | EntityPreview_Assertion_Fragment
  | EntityPreview_BusinessAttribute_Fragment
  | EntityPreview_Chart_Fragment
  | EntityPreview_Container_Fragment
  | EntityPreview_CorpGroup_Fragment
  | EntityPreview_CorpUser_Fragment
  | EntityPreview_Dashboard_Fragment
  | EntityPreview_DataContract_Fragment
  | EntityPreview_DataFlow_Fragment
  | EntityPreview_DataHubConnection_Fragment
  | EntityPreview_DataHubFile_Fragment
  | EntityPreview_DataHubPageModule_Fragment
  | EntityPreview_DataHubPageTemplate_Fragment
  | EntityPreview_DataHubPolicy_Fragment
  | EntityPreview_DataHubRole_Fragment
  | EntityPreview_DataHubView_Fragment
  | EntityPreview_DataJob_Fragment
  | EntityPreview_DataPlatform_Fragment
  | EntityPreview_DataPlatformInstance_Fragment
  | EntityPreview_DataProcessInstance_Fragment
  | EntityPreview_DataProduct_Fragment
  | EntityPreview_DataTypeEntity_Fragment
  | EntityPreview_Dataset_Fragment
  | EntityPreview_Domain_Fragment
  | EntityPreview_ErModelRelationship_Fragment
  | EntityPreview_EntityTypeEntity_Fragment
  | EntityPreview_ExecutionRequest_Fragment
  | EntityPreview_Form_Fragment
  | EntityPreview_GlossaryNode_Fragment
  | EntityPreview_GlossaryTerm_Fragment
  | EntityPreview_Incident_Fragment
  | EntityPreview_MlFeature_Fragment
  | EntityPreview_MlFeatureTable_Fragment
  | EntityPreview_MlModel_Fragment
  | EntityPreview_MlModelGroup_Fragment
  | EntityPreview_MlPrimaryKey_Fragment
  | EntityPreview_Notebook_Fragment
  | EntityPreview_OwnershipTypeEntity_Fragment
  | EntityPreview_Post_Fragment
  | EntityPreview_QueryEntity_Fragment
  | EntityPreview_Restricted_Fragment
  | EntityPreview_Role_Fragment
  | EntityPreview_SchemaFieldEntity_Fragment
  | EntityPreview_StructuredPropertyEntity_Fragment
  | EntityPreview_Tag_Fragment
  | EntityPreview_Test_Fragment
  | EntityPreview_VersionSet_Fragment
  | EntityPreview_VersionedDataset_Fragment;

export const EntityPreviewFragmentDoc = gql`
  fragment entityPreview on Entity {
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
      ownership {
        ...ownershipFields
      }
      globalTags {
        ...globalTagsFields
      }
      glossaryTerms {
        ...glossaryTerms
      }
      subTypes {
        typeNames
      }
      domain {
        ...entityDomain
      }
      ...entityDataProduct
      deprecation {
        ...deprecationFields
      }
      health {
        ...entityHealth
      }
    }
    ... on CorpUser {
      username
      info {
        active
        displayName
        title
        firstName
        lastName
        fullName
      }
      editableProperties {
        displayName
        title
        pictureLink
      }
    }
    ... on CorpGroup {
      name
      info {
        displayName
        description
      }
      memberCount: relationships(
        input: {
          types: ["IsMemberOfGroup", "IsMemberOfNativeGroup"]
          direction: INCOMING
          start: 0
          count: 1
        }
      ) {
        total
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
      ownership {
        ...ownershipFields
      }
      globalTags {
        ...globalTagsFields
      }
      glossaryTerms {
        ...glossaryTerms
      }
      editableProperties {
        description
      }
      platform {
        ...platformFields
      }
      domain {
        ...entityDomain
      }
      ...entityDataProduct
      deprecation {
        ...deprecationFields
      }
      subTypes {
        typeNames
      }
      health {
        ...entityHealth
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
      ownership {
        ...ownershipFields
      }
      globalTags {
        ...globalTagsFields
      }
      glossaryTerms {
        ...glossaryTerms
      }
      editableProperties {
        description
      }
      platform {
        ...platformFields
      }
      domain {
        ...entityDomain
      }
      ...entityDataProduct
      deprecation {
        ...deprecationFields
      }
      subTypes {
        typeNames
      }
      health {
        ...entityHealth
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
      ownership {
        ...ownershipFields
      }
      globalTags {
        ...globalTagsFields
      }
      glossaryTerms {
        ...glossaryTerms
      }
      editableProperties {
        description
      }
      platform {
        ...platformFields
      }
      domain {
        ...entityDomain
      }
      ...entityDataProduct
      deprecation {
        ...deprecationFields
      }
      health {
        ...entityHealth
      }
      subTypes {
        typeNames
      }
    }
    ... on DataJob {
      urn
      type
      dataFlow {
        ...nonRecursiveDataFlowFields
      }
      jobId
      ownership {
        ...ownershipFields
      }
      properties {
        name
        description
      }
      globalTags {
        ...globalTagsFields
      }
      glossaryTerms {
        ...glossaryTerms
      }
      editableProperties {
        description
      }
      domain {
        ...entityDomain
      }
      ...entityDataProduct
      deprecation {
        ...deprecationFields
      }
      subTypes {
        typeNames
      }
      health {
        ...entityHealth
      }
    }
    ... on GlossaryTerm {
      name
      hierarchicalName
      properties {
        name
        description
        termSource
        sourceRef
        sourceUrl
        rawSchema
        customProperties {
          key
          value
        }
      }
      deprecation {
        ...deprecationFields
      }
    }
    ... on GlossaryNode {
      properties {
        name
        description
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
      ownership {
        ...ownershipFields
      }
      platform {
        ...platformFields
      }
      deprecation {
        ...deprecationFields
      }
    }
    ... on MLModel {
      name
      description
      origin
      ownership {
        ...ownershipFields
      }
      platform {
        ...platformFields
      }
      deprecation {
        ...deprecationFields
      }
    }
    ... on MLFeature {
      name
      description
      ownership {
        ...ownershipFields
      }
      deprecation {
        ...deprecationFields
      }
    }
    ... on MLModelGroup {
      name
      origin
      description
      ownership {
        ...ownershipFields
      }
      platform {
        ...platformFields
      }
      deprecation {
        ...deprecationFields
      }
    }
    ... on Tag {
      name
      description
      properties {
        name
        description
        colorHex
      }
    }
    ... on DataPlatform {
      ...nonConflictingPlatformFields
    }
    ... on Domain {
      urn
      properties {
        name
        description
      }
      parentDomains {
        ...parentDomainsFields
      }
      displayProperties {
        ...displayPropertiesFields
      }
      ...domainEntitiesFields
    }
    ... on Container {
      ...entityContainer
    }
    ... on SupportsVersions {
      versionProperties {
        ...versionProperties
      }
    }
    ... on DataProduct {
      ...dataProductFields
    }
  }
  ${PlatformFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityDataProductFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${EntityHealthFragmentDoc}
  ${NonRecursiveDataFlowFieldsFragmentDoc}
  ${NonConflictingPlatformFieldsFragmentDoc}
  ${ParentDomainsFieldsFragmentDoc}
  ${DisplayPropertiesFieldsFragmentDoc}
  ${DomainEntitiesFieldsFragmentDoc}
  ${EntityContainerFragmentDoc}
  ${VersionPropertiesFragmentDoc}
  ${DataProductFieldsFragmentDoc}
`;
