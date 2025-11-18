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
export type DownloadSearchResults_AccessTokenMetadata_Fragment = {
  __typename?: "AccessTokenMetadata";
} & Pick<Types.AccessTokenMetadata, "urn" | "type">;

export type DownloadSearchResults_Application_Fragment = {
  __typename?: "Application";
} & Pick<Types.Application, "urn" | "type">;

export type DownloadSearchResults_Assertion_Fragment = {
  __typename?: "Assertion";
} & Pick<Types.Assertion, "urn" | "type">;

export type DownloadSearchResults_BusinessAttribute_Fragment = {
  __typename?: "BusinessAttribute";
} & Pick<Types.BusinessAttribute, "urn" | "type">;

export type DownloadSearchResults_Chart_Fragment = {
  __typename?: "Chart";
} & Pick<Types.Chart, "chartId" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "ChartProperties" } & Pick<
        Types.ChartProperties,
        "name" | "description" | "externalUrl" | "type" | "access"
      > & {
          lastModified: { __typename?: "AuditStamp" } & Pick<
            Types.AuditStamp,
            "time"
          >;
          created: { __typename?: "AuditStamp" } & Pick<
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
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
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
  } & EntityDataProduct_Chart_Fragment;

export type DownloadSearchResults_Container_Fragment = {
  __typename?: "Container";
} & Pick<Types.Container, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "ContainerProperties" } & Pick<
        Types.ContainerProperties,
        "name" | "description" | "externalUrl"
      >
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
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
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
  };

export type DownloadSearchResults_CorpGroup_Fragment = {
  __typename?: "CorpGroup";
} & Pick<Types.CorpGroup, "name" | "urn" | "type"> & {
    info?: Types.Maybe<
      { __typename?: "CorpGroupInfo" } & Pick<
        Types.CorpGroupInfo,
        "displayName" | "description"
      >
    >;
  };

export type DownloadSearchResults_CorpUser_Fragment = {
  __typename?: "CorpUser";
} & Pick<Types.CorpUser, "username" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "CorpUserProperties" } & Pick<
        Types.CorpUserProperties,
        | "active"
        | "displayName"
        | "title"
        | "firstName"
        | "lastName"
        | "fullName"
        | "email"
      >
    >;
    info?: Types.Maybe<
      { __typename?: "CorpUserInfo" } & Pick<
        Types.CorpUserInfo,
        | "active"
        | "displayName"
        | "title"
        | "firstName"
        | "lastName"
        | "fullName"
        | "email"
      >
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "CorpUserEditableProperties" } & Pick<
        Types.CorpUserEditableProperties,
        "displayName" | "title" | "pictureLink"
      >
    >;
  };

export type DownloadSearchResults_Dashboard_Fragment = {
  __typename?: "Dashboard";
} & Pick<Types.Dashboard, "dashboardId" | "urn" | "type"> & {
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
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
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
  } & EntityDataProduct_Dashboard_Fragment;

export type DownloadSearchResults_DataContract_Fragment = {
  __typename?: "DataContract";
} & Pick<Types.DataContract, "urn" | "type">;

export type DownloadSearchResults_DataFlow_Fragment = {
  __typename?: "DataFlow";
} & Pick<Types.DataFlow, "flowId" | "cluster" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "DataFlowProperties" } & Pick<
        Types.DataFlowProperties,
        "name" | "description" | "project" | "externalUrl"
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
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
  } & EntityDataProduct_DataFlow_Fragment;

export type DownloadSearchResults_DataHubConnection_Fragment = {
  __typename?: "DataHubConnection";
} & Pick<Types.DataHubConnection, "urn" | "type">;

export type DownloadSearchResults_DataHubFile_Fragment = {
  __typename?: "DataHubFile";
} & Pick<Types.DataHubFile, "urn" | "type">;

export type DownloadSearchResults_DataHubPageModule_Fragment = {
  __typename?: "DataHubPageModule";
} & Pick<Types.DataHubPageModule, "urn" | "type">;

export type DownloadSearchResults_DataHubPageTemplate_Fragment = {
  __typename?: "DataHubPageTemplate";
} & Pick<Types.DataHubPageTemplate, "urn" | "type">;

export type DownloadSearchResults_DataHubPolicy_Fragment = {
  __typename?: "DataHubPolicy";
} & Pick<Types.DataHubPolicy, "urn" | "type">;

export type DownloadSearchResults_DataHubRole_Fragment = {
  __typename?: "DataHubRole";
} & Pick<Types.DataHubRole, "urn" | "type">;

export type DownloadSearchResults_DataHubView_Fragment = {
  __typename?: "DataHubView";
} & Pick<Types.DataHubView, "urn" | "type">;

export type DownloadSearchResults_DataJob_Fragment = {
  __typename?: "DataJob";
} & Pick<Types.DataJob, "jobId" | "urn" | "type"> & {
    dataFlow?: Types.Maybe<
      { __typename?: "DataFlow" } & NonRecursiveDataFlowFieldsFragment
    >;
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    properties?: Types.Maybe<
      { __typename?: "DataJobProperties" } & Pick<
        Types.DataJobProperties,
        "name" | "description" | "externalUrl"
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
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
  } & EntityDataProduct_DataJob_Fragment;

export type DownloadSearchResults_DataPlatform_Fragment = {
  __typename?: "DataPlatform";
} & Pick<Types.DataPlatform, "urn" | "type"> &
  NonConflictingPlatformFieldsFragment;

export type DownloadSearchResults_DataPlatformInstance_Fragment = {
  __typename?: "DataPlatformInstance";
} & Pick<Types.DataPlatformInstance, "urn" | "type">;

export type DownloadSearchResults_DataProcessInstance_Fragment = {
  __typename?: "DataProcessInstance";
} & Pick<Types.DataProcessInstance, "urn" | "type">;

export type DownloadSearchResults_DataProduct_Fragment = {
  __typename?: "DataProduct";
} & Pick<Types.DataProduct, "urn" | "type">;

export type DownloadSearchResults_DataTypeEntity_Fragment = {
  __typename?: "DataTypeEntity";
} & Pick<Types.DataTypeEntity, "urn" | "type">;

export type DownloadSearchResults_Dataset_Fragment = {
  __typename?: "Dataset";
} & Pick<
  Types.Dataset,
  "name" | "origin" | "uri" | "platformNativeType" | "urn" | "type"
> & {
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "DatasetEditableProperties" } & Pick<
        Types.DatasetEditableProperties,
        "description"
      >
    >;
    properties?: Types.Maybe<
      { __typename?: "DatasetProperties" } & Pick<
        Types.DatasetProperties,
        "name" | "description" | "qualifiedName" | "externalUrl"
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
  } & EntityDataProduct_Dataset_Fragment;

export type DownloadSearchResults_Domain_Fragment = {
  __typename?: "Domain";
} & Pick<Types.Domain, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "DomainProperties" } & Pick<
        Types.DomainProperties,
        "name" | "description"
      >
    >;
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
  };

export type DownloadSearchResults_ErModelRelationship_Fragment = {
  __typename?: "ERModelRelationship";
} & Pick<Types.ErModelRelationship, "urn" | "type">;

export type DownloadSearchResults_EntityTypeEntity_Fragment = {
  __typename?: "EntityTypeEntity";
} & Pick<Types.EntityTypeEntity, "urn" | "type">;

export type DownloadSearchResults_ExecutionRequest_Fragment = {
  __typename?: "ExecutionRequest";
} & Pick<Types.ExecutionRequest, "urn" | "type">;

export type DownloadSearchResults_Form_Fragment = {
  __typename?: "Form";
} & Pick<Types.Form, "urn" | "type">;

export type DownloadSearchResults_GlossaryNode_Fragment = {
  __typename?: "GlossaryNode";
} & Pick<Types.GlossaryNode, "urn" | "type"> & {
    parentNodes?: Types.Maybe<
      { __typename?: "ParentNodesResult" } & ParentNodesFieldsFragment
    >;
  } & GlossaryNodeFragment;

export type DownloadSearchResults_GlossaryTerm_Fragment = {
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
    parentNodes?: Types.Maybe<
      { __typename?: "ParentNodesResult" } & ParentNodesFieldsFragment
    >;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
  };

export type DownloadSearchResults_Incident_Fragment = {
  __typename?: "Incident";
} & Pick<Types.Incident, "urn" | "type">;

export type DownloadSearchResults_MlFeature_Fragment = {
  __typename?: "MLFeature";
} & Pick<Types.MlFeature, "urn" | "type"> &
  NonRecursiveMlFeatureFragment;

export type DownloadSearchResults_MlFeatureTable_Fragment = {
  __typename?: "MLFeatureTable";
} & Pick<Types.MlFeatureTable, "name" | "description" | "urn" | "type"> & {
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
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
  };

export type DownloadSearchResults_MlModel_Fragment = {
  __typename?: "MLModel";
} & Pick<Types.MlModel, "name" | "description" | "origin" | "urn" | "type"> & {
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
  };

export type DownloadSearchResults_MlModelGroup_Fragment = {
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
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
  };

export type DownloadSearchResults_MlPrimaryKey_Fragment = {
  __typename?: "MLPrimaryKey";
} & Pick<Types.MlPrimaryKey, "urn" | "type"> &
  NonRecursiveMlPrimaryKeyFragment;

export type DownloadSearchResults_Notebook_Fragment = {
  __typename?: "Notebook";
} & Pick<Types.Notebook, "urn" | "type">;

export type DownloadSearchResults_OwnershipTypeEntity_Fragment = {
  __typename?: "OwnershipTypeEntity";
} & Pick<Types.OwnershipTypeEntity, "urn" | "type">;

export type DownloadSearchResults_Post_Fragment = {
  __typename?: "Post";
} & Pick<Types.Post, "urn" | "type">;

export type DownloadSearchResults_QueryEntity_Fragment = {
  __typename?: "QueryEntity";
} & Pick<Types.QueryEntity, "urn" | "type">;

export type DownloadSearchResults_Restricted_Fragment = {
  __typename?: "Restricted";
} & Pick<Types.Restricted, "urn" | "type">;

export type DownloadSearchResults_Role_Fragment = {
  __typename?: "Role";
} & Pick<Types.Role, "urn" | "type">;

export type DownloadSearchResults_SchemaFieldEntity_Fragment = {
  __typename?: "SchemaFieldEntity";
} & Pick<Types.SchemaFieldEntity, "urn" | "type">;

export type DownloadSearchResults_StructuredPropertyEntity_Fragment = {
  __typename?: "StructuredPropertyEntity";
} & Pick<Types.StructuredPropertyEntity, "urn" | "type">;

export type DownloadSearchResults_Tag_Fragment = { __typename?: "Tag" } & Pick<
  Types.Tag,
  "name" | "description" | "urn" | "type"
> & {
    properties?: Types.Maybe<
      { __typename?: "TagProperties" } & Pick<Types.TagProperties, "name">
    >;
  };

export type DownloadSearchResults_Test_Fragment = {
  __typename?: "Test";
} & Pick<Types.Test, "urn" | "type">;

export type DownloadSearchResults_VersionSet_Fragment = {
  __typename?: "VersionSet";
} & Pick<Types.VersionSet, "urn" | "type">;

export type DownloadSearchResults_VersionedDataset_Fragment = {
  __typename?: "VersionedDataset";
} & Pick<Types.VersionedDataset, "urn" | "type">;

export type DownloadSearchResultsFragment =
  | DownloadSearchResults_AccessTokenMetadata_Fragment
  | DownloadSearchResults_Application_Fragment
  | DownloadSearchResults_Assertion_Fragment
  | DownloadSearchResults_BusinessAttribute_Fragment
  | DownloadSearchResults_Chart_Fragment
  | DownloadSearchResults_Container_Fragment
  | DownloadSearchResults_CorpGroup_Fragment
  | DownloadSearchResults_CorpUser_Fragment
  | DownloadSearchResults_Dashboard_Fragment
  | DownloadSearchResults_DataContract_Fragment
  | DownloadSearchResults_DataFlow_Fragment
  | DownloadSearchResults_DataHubConnection_Fragment
  | DownloadSearchResults_DataHubFile_Fragment
  | DownloadSearchResults_DataHubPageModule_Fragment
  | DownloadSearchResults_DataHubPageTemplate_Fragment
  | DownloadSearchResults_DataHubPolicy_Fragment
  | DownloadSearchResults_DataHubRole_Fragment
  | DownloadSearchResults_DataHubView_Fragment
  | DownloadSearchResults_DataJob_Fragment
  | DownloadSearchResults_DataPlatform_Fragment
  | DownloadSearchResults_DataPlatformInstance_Fragment
  | DownloadSearchResults_DataProcessInstance_Fragment
  | DownloadSearchResults_DataProduct_Fragment
  | DownloadSearchResults_DataTypeEntity_Fragment
  | DownloadSearchResults_Dataset_Fragment
  | DownloadSearchResults_Domain_Fragment
  | DownloadSearchResults_ErModelRelationship_Fragment
  | DownloadSearchResults_EntityTypeEntity_Fragment
  | DownloadSearchResults_ExecutionRequest_Fragment
  | DownloadSearchResults_Form_Fragment
  | DownloadSearchResults_GlossaryNode_Fragment
  | DownloadSearchResults_GlossaryTerm_Fragment
  | DownloadSearchResults_Incident_Fragment
  | DownloadSearchResults_MlFeature_Fragment
  | DownloadSearchResults_MlFeatureTable_Fragment
  | DownloadSearchResults_MlModel_Fragment
  | DownloadSearchResults_MlModelGroup_Fragment
  | DownloadSearchResults_MlPrimaryKey_Fragment
  | DownloadSearchResults_Notebook_Fragment
  | DownloadSearchResults_OwnershipTypeEntity_Fragment
  | DownloadSearchResults_Post_Fragment
  | DownloadSearchResults_QueryEntity_Fragment
  | DownloadSearchResults_Restricted_Fragment
  | DownloadSearchResults_Role_Fragment
  | DownloadSearchResults_SchemaFieldEntity_Fragment
  | DownloadSearchResults_StructuredPropertyEntity_Fragment
  | DownloadSearchResults_Tag_Fragment
  | DownloadSearchResults_Test_Fragment
  | DownloadSearchResults_VersionSet_Fragment
  | DownloadSearchResults_VersionedDataset_Fragment;

export type DownloadScrollResultFragment = {
  __typename?: "ScrollResults";
} & Pick<Types.ScrollResults, "nextScrollId" | "count" | "total"> & {
    searchResults: Array<
      { __typename?: "SearchResult" } & {
        entity:
          | ({
              __typename?: "AccessTokenMetadata";
            } & DownloadSearchResults_AccessTokenMetadata_Fragment)
          | ({
              __typename?: "Application";
            } & DownloadSearchResults_Application_Fragment)
          | ({
              __typename?: "Assertion";
            } & DownloadSearchResults_Assertion_Fragment)
          | ({
              __typename?: "BusinessAttribute";
            } & DownloadSearchResults_BusinessAttribute_Fragment)
          | ({ __typename?: "Chart" } & DownloadSearchResults_Chart_Fragment)
          | ({
              __typename?: "Container";
            } & DownloadSearchResults_Container_Fragment)
          | ({
              __typename?: "CorpGroup";
            } & DownloadSearchResults_CorpGroup_Fragment)
          | ({
              __typename?: "CorpUser";
            } & DownloadSearchResults_CorpUser_Fragment)
          | ({
              __typename?: "Dashboard";
            } & DownloadSearchResults_Dashboard_Fragment)
          | ({
              __typename?: "DataContract";
            } & DownloadSearchResults_DataContract_Fragment)
          | ({
              __typename?: "DataFlow";
            } & DownloadSearchResults_DataFlow_Fragment)
          | ({
              __typename?: "DataHubConnection";
            } & DownloadSearchResults_DataHubConnection_Fragment)
          | ({
              __typename?: "DataHubFile";
            } & DownloadSearchResults_DataHubFile_Fragment)
          | ({
              __typename?: "DataHubPageModule";
            } & DownloadSearchResults_DataHubPageModule_Fragment)
          | ({
              __typename?: "DataHubPageTemplate";
            } & DownloadSearchResults_DataHubPageTemplate_Fragment)
          | ({
              __typename?: "DataHubPolicy";
            } & DownloadSearchResults_DataHubPolicy_Fragment)
          | ({
              __typename?: "DataHubRole";
            } & DownloadSearchResults_DataHubRole_Fragment)
          | ({
              __typename?: "DataHubView";
            } & DownloadSearchResults_DataHubView_Fragment)
          | ({
              __typename?: "DataJob";
            } & DownloadSearchResults_DataJob_Fragment)
          | ({
              __typename?: "DataPlatform";
            } & DownloadSearchResults_DataPlatform_Fragment)
          | ({
              __typename?: "DataPlatformInstance";
            } & DownloadSearchResults_DataPlatformInstance_Fragment)
          | ({
              __typename?: "DataProcessInstance";
            } & DownloadSearchResults_DataProcessInstance_Fragment)
          | ({
              __typename?: "DataProduct";
            } & DownloadSearchResults_DataProduct_Fragment)
          | ({
              __typename?: "DataTypeEntity";
            } & DownloadSearchResults_DataTypeEntity_Fragment)
          | ({
              __typename?: "Dataset";
            } & DownloadSearchResults_Dataset_Fragment)
          | ({ __typename?: "Domain" } & DownloadSearchResults_Domain_Fragment)
          | ({
              __typename?: "ERModelRelationship";
            } & DownloadSearchResults_ErModelRelationship_Fragment)
          | ({
              __typename?: "EntityTypeEntity";
            } & DownloadSearchResults_EntityTypeEntity_Fragment)
          | ({
              __typename?: "ExecutionRequest";
            } & DownloadSearchResults_ExecutionRequest_Fragment)
          | ({ __typename?: "Form" } & DownloadSearchResults_Form_Fragment)
          | ({
              __typename?: "GlossaryNode";
            } & DownloadSearchResults_GlossaryNode_Fragment)
          | ({
              __typename?: "GlossaryTerm";
            } & DownloadSearchResults_GlossaryTerm_Fragment)
          | ({
              __typename?: "Incident";
            } & DownloadSearchResults_Incident_Fragment)
          | ({
              __typename?: "MLFeature";
            } & DownloadSearchResults_MlFeature_Fragment)
          | ({
              __typename?: "MLFeatureTable";
            } & DownloadSearchResults_MlFeatureTable_Fragment)
          | ({
              __typename?: "MLModel";
            } & DownloadSearchResults_MlModel_Fragment)
          | ({
              __typename?: "MLModelGroup";
            } & DownloadSearchResults_MlModelGroup_Fragment)
          | ({
              __typename?: "MLPrimaryKey";
            } & DownloadSearchResults_MlPrimaryKey_Fragment)
          | ({
              __typename?: "Notebook";
            } & DownloadSearchResults_Notebook_Fragment)
          | ({
              __typename?: "OwnershipTypeEntity";
            } & DownloadSearchResults_OwnershipTypeEntity_Fragment)
          | ({ __typename?: "Post" } & DownloadSearchResults_Post_Fragment)
          | ({
              __typename?: "QueryEntity";
            } & DownloadSearchResults_QueryEntity_Fragment)
          | ({
              __typename?: "Restricted";
            } & DownloadSearchResults_Restricted_Fragment)
          | ({ __typename?: "Role" } & DownloadSearchResults_Role_Fragment)
          | ({
              __typename?: "SchemaFieldEntity";
            } & DownloadSearchResults_SchemaFieldEntity_Fragment)
          | ({
              __typename?: "StructuredPropertyEntity";
            } & DownloadSearchResults_StructuredPropertyEntity_Fragment)
          | ({ __typename?: "Tag" } & DownloadSearchResults_Tag_Fragment)
          | ({ __typename?: "Test" } & DownloadSearchResults_Test_Fragment)
          | ({
              __typename?: "VersionSet";
            } & DownloadSearchResults_VersionSet_Fragment)
          | ({
              __typename?: "VersionedDataset";
            } & DownloadSearchResults_VersionedDataset_Fragment);
        matchedFields: Array<
          { __typename?: "MatchedField" } & Pick<
            Types.MatchedField,
            "name" | "value"
          >
        >;
        insights?: Types.Maybe<
          Array<
            { __typename?: "SearchInsight" } & Pick<
              Types.SearchInsight,
              "text" | "icon"
            >
          >
        >;
      }
    >;
    facets?: Types.Maybe<
      Array<{ __typename?: "FacetMetadata" } & FacetFieldsFragment>
    >;
  };

export type GetDownloadScrollResultsQueryVariables = Types.Exact<{
  input: Types.ScrollAcrossEntitiesInput;
}>;

export type GetDownloadScrollResultsQuery = { __typename?: "Query" } & {
  scrollAcrossEntities?: Types.Maybe<
    { __typename?: "ScrollResults" } & DownloadScrollResultFragment
  >;
};

export type DownloadScrollAcrossLineageResultFragment = {
  __typename?: "ScrollAcrossLineageResults";
} & Pick<
  Types.ScrollAcrossLineageResults,
  "nextScrollId" | "count" | "total"
> & {
    searchResults: Array<
      { __typename?: "SearchAcrossLineageResult" } & Pick<
        Types.SearchAcrossLineageResult,
        "degree"
      > & {
          entity:
            | ({
                __typename?: "AccessTokenMetadata";
              } & DownloadSearchResults_AccessTokenMetadata_Fragment)
            | ({
                __typename?: "Application";
              } & DownloadSearchResults_Application_Fragment)
            | ({
                __typename?: "Assertion";
              } & DownloadSearchResults_Assertion_Fragment)
            | ({
                __typename?: "BusinessAttribute";
              } & DownloadSearchResults_BusinessAttribute_Fragment)
            | ({ __typename?: "Chart" } & DownloadSearchResults_Chart_Fragment)
            | ({
                __typename?: "Container";
              } & DownloadSearchResults_Container_Fragment)
            | ({
                __typename?: "CorpGroup";
              } & DownloadSearchResults_CorpGroup_Fragment)
            | ({
                __typename?: "CorpUser";
              } & DownloadSearchResults_CorpUser_Fragment)
            | ({
                __typename?: "Dashboard";
              } & DownloadSearchResults_Dashboard_Fragment)
            | ({
                __typename?: "DataContract";
              } & DownloadSearchResults_DataContract_Fragment)
            | ({
                __typename?: "DataFlow";
              } & DownloadSearchResults_DataFlow_Fragment)
            | ({
                __typename?: "DataHubConnection";
              } & DownloadSearchResults_DataHubConnection_Fragment)
            | ({
                __typename?: "DataHubFile";
              } & DownloadSearchResults_DataHubFile_Fragment)
            | ({
                __typename?: "DataHubPageModule";
              } & DownloadSearchResults_DataHubPageModule_Fragment)
            | ({
                __typename?: "DataHubPageTemplate";
              } & DownloadSearchResults_DataHubPageTemplate_Fragment)
            | ({
                __typename?: "DataHubPolicy";
              } & DownloadSearchResults_DataHubPolicy_Fragment)
            | ({
                __typename?: "DataHubRole";
              } & DownloadSearchResults_DataHubRole_Fragment)
            | ({
                __typename?: "DataHubView";
              } & DownloadSearchResults_DataHubView_Fragment)
            | ({
                __typename?: "DataJob";
              } & DownloadSearchResults_DataJob_Fragment)
            | ({
                __typename?: "DataPlatform";
              } & DownloadSearchResults_DataPlatform_Fragment)
            | ({
                __typename?: "DataPlatformInstance";
              } & DownloadSearchResults_DataPlatformInstance_Fragment)
            | ({
                __typename?: "DataProcessInstance";
              } & DownloadSearchResults_DataProcessInstance_Fragment)
            | ({
                __typename?: "DataProduct";
              } & DownloadSearchResults_DataProduct_Fragment)
            | ({
                __typename?: "DataTypeEntity";
              } & DownloadSearchResults_DataTypeEntity_Fragment)
            | ({
                __typename?: "Dataset";
              } & DownloadSearchResults_Dataset_Fragment)
            | ({
                __typename?: "Domain";
              } & DownloadSearchResults_Domain_Fragment)
            | ({
                __typename?: "ERModelRelationship";
              } & DownloadSearchResults_ErModelRelationship_Fragment)
            | ({
                __typename?: "EntityTypeEntity";
              } & DownloadSearchResults_EntityTypeEntity_Fragment)
            | ({
                __typename?: "ExecutionRequest";
              } & DownloadSearchResults_ExecutionRequest_Fragment)
            | ({ __typename?: "Form" } & DownloadSearchResults_Form_Fragment)
            | ({
                __typename?: "GlossaryNode";
              } & DownloadSearchResults_GlossaryNode_Fragment)
            | ({
                __typename?: "GlossaryTerm";
              } & DownloadSearchResults_GlossaryTerm_Fragment)
            | ({
                __typename?: "Incident";
              } & DownloadSearchResults_Incident_Fragment)
            | ({
                __typename?: "MLFeature";
              } & DownloadSearchResults_MlFeature_Fragment)
            | ({
                __typename?: "MLFeatureTable";
              } & DownloadSearchResults_MlFeatureTable_Fragment)
            | ({
                __typename?: "MLModel";
              } & DownloadSearchResults_MlModel_Fragment)
            | ({
                __typename?: "MLModelGroup";
              } & DownloadSearchResults_MlModelGroup_Fragment)
            | ({
                __typename?: "MLPrimaryKey";
              } & DownloadSearchResults_MlPrimaryKey_Fragment)
            | ({
                __typename?: "Notebook";
              } & DownloadSearchResults_Notebook_Fragment)
            | ({
                __typename?: "OwnershipTypeEntity";
              } & DownloadSearchResults_OwnershipTypeEntity_Fragment)
            | ({ __typename?: "Post" } & DownloadSearchResults_Post_Fragment)
            | ({
                __typename?: "QueryEntity";
              } & DownloadSearchResults_QueryEntity_Fragment)
            | ({
                __typename?: "Restricted";
              } & DownloadSearchResults_Restricted_Fragment)
            | ({ __typename?: "Role" } & DownloadSearchResults_Role_Fragment)
            | ({
                __typename?: "SchemaFieldEntity";
              } & DownloadSearchResults_SchemaFieldEntity_Fragment)
            | ({
                __typename?: "StructuredPropertyEntity";
              } & DownloadSearchResults_StructuredPropertyEntity_Fragment)
            | ({ __typename?: "Tag" } & DownloadSearchResults_Tag_Fragment)
            | ({ __typename?: "Test" } & DownloadSearchResults_Test_Fragment)
            | ({
                __typename?: "VersionSet";
              } & DownloadSearchResults_VersionSet_Fragment)
            | ({
                __typename?: "VersionedDataset";
              } & DownloadSearchResults_VersionedDataset_Fragment);
          matchedFields: Array<
            { __typename?: "MatchedField" } & Pick<
              Types.MatchedField,
              "name" | "value"
            >
          >;
          insights?: Types.Maybe<
            Array<
              { __typename?: "SearchInsight" } & Pick<
                Types.SearchInsight,
                "text" | "icon"
              >
            >
          >;
        }
    >;
    facets?: Types.Maybe<
      Array<{ __typename?: "FacetMetadata" } & FacetFieldsFragment>
    >;
  };

export type GetDownloadScrollAcrossLineageResultsQueryVariables = Types.Exact<{
  input: Types.ScrollAcrossLineageInput;
}>;

export type GetDownloadScrollAcrossLineageResultsQuery = {
  __typename?: "Query";
} & {
  scrollAcrossLineage?: Types.Maybe<
    {
      __typename?: "ScrollAcrossLineageResults";
    } & DownloadScrollAcrossLineageResultFragment
  >;
};

export const DownloadSearchResultsFragmentDoc = gql`
  fragment downloadSearchResults on Entity {
    urn
    type
    ... on Dataset {
      name
      origin
      uri
      platform {
        ...platformFields
      }
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
      editableProperties {
        description
      }
      platformNativeType
      properties {
        name
        description
        qualifiedName
        customProperties {
          key
          value
        }
        externalUrl
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
    }
    ... on CorpUser {
      username
      properties {
        active
        displayName
        title
        firstName
        lastName
        fullName
        email
      }
      info {
        active
        displayName
        title
        firstName
        lastName
        fullName
        email
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
    }
    ... on Dashboard {
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
      dataPlatformInstance {
        ...dataPlatformInstanceFields
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
    }
    ... on Chart {
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
        created {
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
      dataPlatformInstance {
        ...dataPlatformInstanceFields
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
    }
    ... on DataFlow {
      flowId
      cluster
      properties {
        name
        description
        project
        externalUrl
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
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
      domain {
        ...entityDomain
      }
      ...entityDataProduct
      deprecation {
        ...deprecationFields
      }
    }
    ... on DataJob {
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
        externalUrl
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
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
      subTypes {
        typeNames
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
      parentNodes {
        ...parentNodesFields
      }
      domain {
        ...entityDomain
      }
    }
    ... on GlossaryNode {
      ...glossaryNode
      parentNodes {
        ...parentNodesFields
      }
    }
    ... on Domain {
      properties {
        name
        description
      }
      ownership {
        ...ownershipFields
      }
    }
    ... on Container {
      properties {
        name
        description
        externalUrl
      }
      platform {
        ...platformFields
      }
      dataPlatformInstance {
        ...dataPlatformInstanceFields
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
      glossaryTerms {
        ...glossaryTerms
      }
      subTypes {
        typeNames
      }
      deprecation {
        ...deprecationFields
      }
    }
    ... on MLFeatureTable {
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
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
    }
    ... on MLFeature {
      ...nonRecursiveMLFeature
    }
    ... on MLPrimaryKey {
      ...nonRecursiveMLPrimaryKey
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
      dataPlatformInstance {
        ...dataPlatformInstanceFields
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
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
    }
    ... on Tag {
      name
      properties {
        name
      }
      description
    }
    ... on DataPlatform {
      ...nonConflictingPlatformFields
    }
  }
  ${PlatformFieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityDataProductFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${NonRecursiveDataFlowFieldsFragmentDoc}
  ${ParentNodesFieldsFragmentDoc}
  ${GlossaryNodeFragmentDoc}
  ${NonRecursiveMlFeatureFragmentDoc}
  ${NonRecursiveMlPrimaryKeyFragmentDoc}
  ${NonConflictingPlatformFieldsFragmentDoc}
`;
export const DownloadScrollResultFragmentDoc = gql`
  fragment downloadScrollResult on ScrollResults {
    nextScrollId
    count
    total
    searchResults {
      entity {
        ...downloadSearchResults
      }
      matchedFields {
        name
        value
      }
      insights {
        text
        icon
      }
    }
    facets {
      ...facetFields
    }
  }
  ${DownloadSearchResultsFragmentDoc}
  ${FacetFieldsFragmentDoc}
`;
export const DownloadScrollAcrossLineageResultFragmentDoc = gql`
  fragment downloadScrollAcrossLineageResult on ScrollAcrossLineageResults {
    nextScrollId
    count
    total
    searchResults {
      degree
      entity {
        ...downloadSearchResults
      }
      matchedFields {
        name
        value
      }
      insights {
        text
        icon
      }
    }
    facets {
      ...facetFields
    }
  }
  ${DownloadSearchResultsFragmentDoc}
  ${FacetFieldsFragmentDoc}
`;
export const GetDownloadScrollResultsDocument = gql`
  query getDownloadScrollResults($input: ScrollAcrossEntitiesInput!) {
    scrollAcrossEntities(input: $input) {
      ...downloadScrollResult
    }
  }
  ${DownloadScrollResultFragmentDoc}
`;

/**
 * __useGetDownloadScrollResultsQuery__
 *
 * To run a query within a React component, call `useGetDownloadScrollResultsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDownloadScrollResultsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDownloadScrollResultsQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useGetDownloadScrollResultsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDownloadScrollResultsQuery,
    GetDownloadScrollResultsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetDownloadScrollResultsQuery,
    GetDownloadScrollResultsQueryVariables
  >(GetDownloadScrollResultsDocument, baseOptions);
}
export function useGetDownloadScrollResultsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDownloadScrollResultsQuery,
    GetDownloadScrollResultsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetDownloadScrollResultsQuery,
    GetDownloadScrollResultsQueryVariables
  >(GetDownloadScrollResultsDocument, baseOptions);
}
export type GetDownloadScrollResultsQueryHookResult = ReturnType<
  typeof useGetDownloadScrollResultsQuery
>;
export type GetDownloadScrollResultsLazyQueryHookResult = ReturnType<
  typeof useGetDownloadScrollResultsLazyQuery
>;
export type GetDownloadScrollResultsQueryResult = Apollo.QueryResult<
  GetDownloadScrollResultsQuery,
  GetDownloadScrollResultsQueryVariables
>;
export const GetDownloadScrollAcrossLineageResultsDocument = gql`
  query getDownloadScrollAcrossLineageResults(
    $input: ScrollAcrossLineageInput!
  ) {
    scrollAcrossLineage(input: $input) {
      ...downloadScrollAcrossLineageResult
    }
  }
  ${DownloadScrollAcrossLineageResultFragmentDoc}
`;

/**
 * __useGetDownloadScrollAcrossLineageResultsQuery__
 *
 * To run a query within a React component, call `useGetDownloadScrollAcrossLineageResultsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDownloadScrollAcrossLineageResultsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDownloadScrollAcrossLineageResultsQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useGetDownloadScrollAcrossLineageResultsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDownloadScrollAcrossLineageResultsQuery,
    GetDownloadScrollAcrossLineageResultsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetDownloadScrollAcrossLineageResultsQuery,
    GetDownloadScrollAcrossLineageResultsQueryVariables
  >(GetDownloadScrollAcrossLineageResultsDocument, baseOptions);
}
export function useGetDownloadScrollAcrossLineageResultsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDownloadScrollAcrossLineageResultsQuery,
    GetDownloadScrollAcrossLineageResultsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetDownloadScrollAcrossLineageResultsQuery,
    GetDownloadScrollAcrossLineageResultsQueryVariables
  >(GetDownloadScrollAcrossLineageResultsDocument, baseOptions);
}
export type GetDownloadScrollAcrossLineageResultsQueryHookResult = ReturnType<
  typeof useGetDownloadScrollAcrossLineageResultsQuery
>;
export type GetDownloadScrollAcrossLineageResultsLazyQueryHookResult =
  ReturnType<typeof useGetDownloadScrollAcrossLineageResultsLazyQuery>;
export type GetDownloadScrollAcrossLineageResultsQueryResult =
  Apollo.QueryResult<
    GetDownloadScrollAcrossLineageResultsQuery,
    GetDownloadScrollAcrossLineageResultsQueryVariables
  >;
