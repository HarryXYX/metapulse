/* eslint-disable */
import * as Types from "../types.generated";

import {
  NonRecursiveDataFlowFieldsFragment,
  OwnershipFieldsFragment,
  InstitutionalMemoryFieldsFragment,
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
  ParentDomainsFieldsFragment,
  DisplayPropertiesFieldsFragment,
  DomainEntitiesFieldsFragment,
  NonRecursiveMlFeatureTableFragment,
  NonRecursiveMlFeatureFragment,
  NonRecursiveMlPrimaryKeyFragment,
  ErmodelrelationPropertiesFieldsFragment,
  ErmodelrelationEditablePropertiesFieldsFragment,
  SchemaMetadataFieldsFragment,
} from "./fragments.generated";
import { DataProcessInstanceFieldsFragment } from "./dataProcessInstance.generated";
import { VersionPropertiesFragment } from "./versioning.generated";
import { FacetFieldsFragment } from "./search.generated";
import { gql } from "@apollo/client";
import {
  NonRecursiveDataFlowFieldsFragmentDoc,
  OwnershipFieldsFragmentDoc,
  InstitutionalMemoryFieldsFragmentDoc,
  EntityDisplayNameFieldsFragmentDoc,
  PlatformFieldsFragmentDoc,
  GlobalTagsFieldsFragmentDoc,
  GlossaryTermsFragmentDoc,
  EntityDomainFragmentDoc,
  EntityDataProductFragmentDoc,
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
  ParentDomainsFieldsFragmentDoc,
  DisplayPropertiesFieldsFragmentDoc,
  DomainEntitiesFieldsFragmentDoc,
  NonRecursiveMlFeatureTableFragmentDoc,
  NonRecursiveMlFeatureFragmentDoc,
  NonRecursiveMlPrimaryKeyFragmentDoc,
  ErmodelrelationPropertiesFieldsFragmentDoc,
  ErmodelrelationEditablePropertiesFieldsFragmentDoc,
  SchemaMetadataFieldsFragmentDoc,
} from "./fragments.generated";
import { DataProcessInstanceFieldsFragmentDoc } from "./dataProcessInstance.generated";
import { VersionPropertiesFragmentDoc } from "./versioning.generated";
import { FacetFieldsFragmentDoc } from "./search.generated";
import * as Apollo from "@apollo/client";
export type LineageNodeProperties_Assertion_Fragment = {
  __typename?: "Assertion";
} & Pick<Types.Assertion, "urn" | "type">;

export type LineageNodeProperties_Chart_Fragment = {
  __typename?: "Chart";
} & Pick<Types.Chart, "exists" | "tool" | "chartId" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "ChartProperties" } & Pick<
        Types.ChartProperties,
        "name" | "description"
      >
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "ChartEditableProperties" } & Pick<
        Types.ChartEditableProperties,
        "description"
      >
    >;
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
    >;
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
    >;
    status?: Types.Maybe<
      { __typename?: "Status" } & Pick<Types.Status, "removed">
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    health?: Types.Maybe<
      Array<{ __typename?: "Health" } & EntityHealthFragment>
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
  } & EntityDataProduct_Chart_Fragment;

export type LineageNodeProperties_Dashboard_Fragment = {
  __typename?: "Dashboard";
} & Pick<
  Types.Dashboard,
  "exists" | "urn" | "type" | "tool" | "dashboardId"
> & {
    properties?: Types.Maybe<
      { __typename?: "DashboardProperties" } & Pick<
        Types.DashboardProperties,
        "name" | "description" | "externalUrl" | "lastRefreshed"
      > & {
          created: { __typename?: "AuditStamp" } & Pick<
            Types.AuditStamp,
            "time"
          >;
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
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
    >;
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
    >;
    status?: Types.Maybe<
      { __typename?: "Status" } & Pick<Types.Status, "removed">
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "DashboardEditableProperties" } & Pick<
        Types.DashboardEditableProperties,
        "description"
      >
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
    health?: Types.Maybe<
      Array<{ __typename?: "Health" } & EntityHealthFragment>
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
  } & EntityDataProduct_Dashboard_Fragment;

export type LineageNodeProperties_DataFlow_Fragment = {
  __typename?: "DataFlow";
} & Pick<
  Types.DataFlow,
  "exists" | "orchestrator" | "flowId" | "cluster" | "urn" | "type"
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
    status?: Types.Maybe<
      { __typename?: "Status" } & Pick<Types.Status, "removed">
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    health?: Types.Maybe<
      Array<{ __typename?: "Health" } & EntityHealthFragment>
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
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
    >;
  } & EntityDataProduct_DataFlow_Fragment;

export type LineageNodeProperties_DataJob_Fragment = {
  __typename?: "DataJob";
} & Pick<Types.DataJob, "urn" | "type" | "exists" | "jobId"> & {
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
    globalTags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
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
    editableProperties?: Types.Maybe<
      { __typename?: "DataJobEditableProperties" } & Pick<
        Types.DataJobEditableProperties,
        "description"
      >
    >;
    status?: Types.Maybe<
      { __typename?: "Status" } & Pick<Types.Status, "removed">
    >;
    inputOutput?: Types.Maybe<
      { __typename?: "DataJobInputOutput" } & {
        fineGrainedLineages?: Types.Maybe<
          Array<
            { __typename?: "FineGrainedLineage" } & Pick<
              Types.FineGrainedLineage,
              "query" | "transformOperation"
            > & {
                upstreams?: Types.Maybe<
                  Array<
                    { __typename?: "SchemaFieldRef" } & Pick<
                      Types.SchemaFieldRef,
                      "urn" | "path"
                    >
                  >
                >;
                downstreams?: Types.Maybe<
                  Array<
                    { __typename?: "SchemaFieldRef" } & Pick<
                      Types.SchemaFieldRef,
                      "urn" | "path"
                    >
                  >
                >;
              }
          >
        >;
      }
    >;
    health?: Types.Maybe<
      Array<{ __typename?: "Health" } & EntityHealthFragment>
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
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
    >;
    lastRun?: Types.Maybe<
      { __typename?: "DataProcessInstanceResult" } & Pick<
        Types.DataProcessInstanceResult,
        "count" | "start" | "total"
      > & {
          runs?: Types.Maybe<
            Array<
              Types.Maybe<
                { __typename?: "DataProcessInstance" } & Pick<
                  Types.DataProcessInstance,
                  "urn" | "type"
                > & {
                    properties?: Types.Maybe<
                      { __typename?: "DataProcessInstanceProperties" } & {
                        created: { __typename?: "AuditStamp" } & Pick<
                          Types.AuditStamp,
                          "time" | "actor"
                        >;
                      }
                    >;
                    state?: Types.Maybe<
                      Array<
                        Types.Maybe<
                          { __typename?: "DataProcessRunEvent" } & Pick<
                            Types.DataProcessRunEvent,
                            | "status"
                            | "attempt"
                            | "timestampMillis"
                            | "durationMillis"
                          > & {
                              result?: Types.Maybe<
                                {
                                  __typename?: "DataProcessInstanceRunResult";
                                } & Pick<
                                  Types.DataProcessInstanceRunResult,
                                  "resultType" | "nativeResultType"
                                >
                              >;
                            }
                        >
                      >
                    >;
                  }
              >
            >
          >;
        }
    >;
  } & EntityDataProduct_DataJob_Fragment;

export type LineageNodeProperties_DataProcessInstance_Fragment = {
  __typename?: "DataProcessInstance";
} & Pick<Types.DataProcessInstance, "urn" | "type"> &
  DataProcessInstanceFieldsFragment;

export type LineageNodeProperties_Dataset_Fragment = {
  __typename?: "Dataset";
} & Pick<Types.Dataset, "exists" | "name" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "DatasetProperties" } & Pick<
        Types.DatasetProperties,
        "name" | "description" | "qualifiedName"
      >
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "DatasetEditableProperties" } & Pick<
        Types.DatasetEditableProperties,
        "description"
      >
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
    >;
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
    status?: Types.Maybe<
      { __typename?: "Status" } & Pick<Types.Status, "removed">
    >;
    fineGrainedLineages?: Types.Maybe<
      Array<
        { __typename?: "FineGrainedLineage" } & Pick<
          Types.FineGrainedLineage,
          "query" | "transformOperation"
        > & {
            upstreams?: Types.Maybe<
              Array<
                { __typename?: "SchemaFieldRef" } & Pick<
                  Types.SchemaFieldRef,
                  "urn" | "path"
                >
              >
            >;
            downstreams?: Types.Maybe<
              Array<
                { __typename?: "SchemaFieldRef" } & Pick<
                  Types.SchemaFieldRef,
                  "urn" | "path"
                >
              >
            >;
          }
      >
    >;
    health?: Types.Maybe<
      Array<{ __typename?: "Health" } & EntityHealthFragment>
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
  };

export type LineageNodeProperties_ErModelRelationship_Fragment = {
  __typename?: "ERModelRelationship";
} & Pick<Types.ErModelRelationship, "urn" | "type" | "id"> & {
    properties?: Types.Maybe<
      {
        __typename?: "ERModelRelationshipProperties";
      } & ErmodelrelationPropertiesFieldsFragment
    >;
    editableProperties?: Types.Maybe<
      {
        __typename?: "ERModelRelationshipEditableProperties";
      } & ErmodelrelationEditablePropertiesFieldsFragment
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
  };

export type LineageNodeProperties_MlFeature_Fragment = {
  __typename?: "MLFeature";
} & Pick<Types.MlFeature, "urn" | "type"> &
  NonRecursiveMlFeatureFragment;

export type LineageNodeProperties_MlFeatureTable_Fragment = {
  __typename?: "MLFeatureTable";
} & Pick<Types.MlFeatureTable, "urn" | "type"> &
  NonRecursiveMlFeatureTableFragment;

export type LineageNodeProperties_MlModel_Fragment = {
  __typename?: "MLModel";
} & Pick<
  Types.MlModel,
  "exists" | "urn" | "type" | "name" | "description" | "origin"
> & {
    tags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    status?: Types.Maybe<
      { __typename?: "Status" } & Pick<Types.Status, "removed">
    >;
    versionProperties?: Types.Maybe<
      { __typename?: "VersionProperties" } & Pick<
        Types.VersionProperties,
        "comment"
      > & {
          versionSet: { __typename?: "VersionSet" } & Pick<
            Types.VersionSet,
            "urn" | "type"
          >;
          version: { __typename?: "VersionTag" } & Pick<
            Types.VersionTag,
            "versionTag"
          >;
          aliases: Array<
            { __typename?: "VersionTag" } & Pick<Types.VersionTag, "versionTag">
          >;
        }
    >;
    properties?: Types.Maybe<
      { __typename?: "MLModelProperties" } & Pick<
        Types.MlModelProperties,
        "tags"
      > & { propertiesName: Types.MlModelProperties["name"] } & {
          createdTS?: Types.Maybe<
            { __typename?: "AuditStamp" } & Pick<
              Types.AuditStamp,
              "time" | "actor"
            >
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
    editableProperties?: Types.Maybe<
      { __typename?: "MLModelEditableProperties" } & Pick<
        Types.MlModelEditableProperties,
        "description"
      >
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
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
    >;
  };

export type LineageNodeProperties_MlModelGroup_Fragment = {
  __typename?: "MLModelGroup";
} & Pick<
  Types.MlModelGroup,
  "exists" | "urn" | "type" | "name" | "description" | "origin"
> & {
    tags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    status?: Types.Maybe<
      { __typename?: "Status" } & Pick<Types.Status, "removed">
    >;
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment &
        BrowsePathV2FieldsFragment
    >;
    properties?: Types.Maybe<
      { __typename?: "MLModelGroupProperties" } & {
        propertiesName: Types.MlModelGroupProperties["name"];
      } & {
        createdTS?: Types.Maybe<
          { __typename?: "AuditStamp" } & Pick<
            Types.AuditStamp,
            "time" | "actor"
          >
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
    editableProperties?: Types.Maybe<
      { __typename?: "MLModelGroupEditableProperties" } & Pick<
        Types.MlModelGroupEditableProperties,
        "description"
      >
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
  };

export type LineageNodeProperties_MlPrimaryKey_Fragment = {
  __typename?: "MLPrimaryKey";
} & Pick<Types.MlPrimaryKey, "urn" | "type"> &
  NonRecursiveMlPrimaryKeyFragment;

export type LineageNodeProperties_Restricted_Fragment = {
  __typename?: "Restricted";
} & Pick<Types.Restricted, "urn" | "type">;

export type LineageNodeProperties_SchemaFieldEntity_Fragment = {
  __typename?: "SchemaFieldEntity";
} & Pick<Types.SchemaFieldEntity, "urn" | "type">;

export type LineageNodePropertiesFragment =
  | LineageNodeProperties_Assertion_Fragment
  | LineageNodeProperties_Chart_Fragment
  | LineageNodeProperties_Dashboard_Fragment
  | LineageNodeProperties_DataFlow_Fragment
  | LineageNodeProperties_DataJob_Fragment
  | LineageNodeProperties_DataProcessInstance_Fragment
  | LineageNodeProperties_Dataset_Fragment
  | LineageNodeProperties_ErModelRelationship_Fragment
  | LineageNodeProperties_MlFeature_Fragment
  | LineageNodeProperties_MlFeatureTable_Fragment
  | LineageNodeProperties_MlModel_Fragment
  | LineageNodeProperties_MlModelGroup_Fragment
  | LineageNodeProperties_MlPrimaryKey_Fragment
  | LineageNodeProperties_Restricted_Fragment
  | LineageNodeProperties_SchemaFieldEntity_Fragment;

export type LineageFields_Assertion_Fragment = { __typename?: "Assertion" } & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_Assertion_Fragment &
  CanEditLineageFragment_Assertion_Fragment;

export type LineageFields_Chart_Fragment = { __typename?: "Chart" } & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_Chart_Fragment &
  CanEditLineageFragment_Chart_Fragment;

export type LineageFields_Dashboard_Fragment = { __typename?: "Dashboard" } & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_Dashboard_Fragment &
  CanEditLineageFragment_Dashboard_Fragment;

export type LineageFields_DataFlow_Fragment = { __typename?: "DataFlow" } & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_DataFlow_Fragment &
  CanEditLineageFragment_DataFlow_Fragment;

export type LineageFields_DataJob_Fragment = { __typename?: "DataJob" } & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_DataJob_Fragment &
  CanEditLineageFragment_DataJob_Fragment;

export type LineageFields_DataProcessInstance_Fragment = {
  __typename?: "DataProcessInstance";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_DataProcessInstance_Fragment &
  CanEditLineageFragment_DataProcessInstance_Fragment;

export type LineageFields_Dataset_Fragment = { __typename?: "Dataset" } & {
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
                  "exists" | "urn" | "type"
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
                  "exists" | "urn" | "type"
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
} & LineageNodeProperties_Dataset_Fragment &
  CanEditLineageFragment_Dataset_Fragment;

export type LineageFields_ErModelRelationship_Fragment = {
  __typename?: "ERModelRelationship";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_ErModelRelationship_Fragment &
  CanEditLineageFragment_ErModelRelationship_Fragment;

export type LineageFields_MlFeature_Fragment = { __typename?: "MLFeature" } & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_MlFeature_Fragment &
  CanEditLineageFragment_MlFeature_Fragment;

export type LineageFields_MlFeatureTable_Fragment = {
  __typename?: "MLFeatureTable";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_MlFeatureTable_Fragment &
  CanEditLineageFragment_MlFeatureTable_Fragment;

export type LineageFields_MlModel_Fragment = { __typename?: "MLModel" } & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_MlModel_Fragment &
  CanEditLineageFragment_MlModel_Fragment;

export type LineageFields_MlModelGroup_Fragment = {
  __typename?: "MLModelGroup";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_MlModelGroup_Fragment &
  CanEditLineageFragment_MlModelGroup_Fragment;

export type LineageFields_MlPrimaryKey_Fragment = {
  __typename?: "MLPrimaryKey";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_MlPrimaryKey_Fragment &
  CanEditLineageFragment_MlPrimaryKey_Fragment;

export type LineageFields_Restricted_Fragment = {
  __typename?: "Restricted";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_Restricted_Fragment &
  CanEditLineageFragment_Restricted_Fragment;

export type LineageFields_SchemaFieldEntity_Fragment = {
  __typename?: "SchemaFieldEntity";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & LeafLineageResultsFragment
  >;
} & LineageNodeProperties_SchemaFieldEntity_Fragment &
  CanEditLineageFragment_SchemaFieldEntity_Fragment;

export type LineageFieldsFragment =
  | LineageFields_Assertion_Fragment
  | LineageFields_Chart_Fragment
  | LineageFields_Dashboard_Fragment
  | LineageFields_DataFlow_Fragment
  | LineageFields_DataJob_Fragment
  | LineageFields_DataProcessInstance_Fragment
  | LineageFields_Dataset_Fragment
  | LineageFields_ErModelRelationship_Fragment
  | LineageFields_MlFeature_Fragment
  | LineageFields_MlFeatureTable_Fragment
  | LineageFields_MlModel_Fragment
  | LineageFields_MlModelGroup_Fragment
  | LineageFields_MlPrimaryKey_Fragment
  | LineageFields_Restricted_Fragment
  | LineageFields_SchemaFieldEntity_Fragment;

export type LineageRelationshipFieldsFragment = {
  __typename?: "LineageRelationship";
} & Pick<
  Types.LineageRelationship,
  "type" | "createdOn" | "updatedOn" | "isManual"
> & {
    createdActor?: Types.Maybe<
      | ({ __typename?: "AccessTokenMetadata" } & Pick<
          Types.AccessTokenMetadata,
          "urn" | "type"
        >)
      | ({ __typename?: "Application" } & Pick<
          Types.Application,
          "urn" | "type"
        >)
      | ({ __typename?: "Assertion" } & Pick<Types.Assertion, "urn" | "type">)
      | ({ __typename?: "BusinessAttribute" } & Pick<
          Types.BusinessAttribute,
          "urn" | "type"
        >)
      | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type">)
      | ({ __typename?: "Container" } & Pick<Types.Container, "urn" | "type">)
      | ({ __typename?: "CorpGroup" } & Pick<Types.CorpGroup, "urn" | "type">)
      | ({ __typename?: "CorpUser" } & Pick<
          Types.CorpUser,
          "username" | "urn" | "type"
        > & {
            info?: Types.Maybe<
              { __typename?: "CorpUserInfo" } & Pick<
                Types.CorpUserInfo,
                "displayName"
              >
            >;
            properties?: Types.Maybe<
              { __typename?: "CorpUserProperties" } & Pick<
                Types.CorpUserProperties,
                "displayName"
              >
            >;
            editableProperties?: Types.Maybe<
              { __typename?: "CorpUserEditableProperties" } & Pick<
                Types.CorpUserEditableProperties,
                "displayName"
              >
            >;
          })
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
        >)
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
    updatedActor?: Types.Maybe<
      | ({ __typename?: "AccessTokenMetadata" } & Pick<
          Types.AccessTokenMetadata,
          "urn" | "type"
        >)
      | ({ __typename?: "Application" } & Pick<
          Types.Application,
          "urn" | "type"
        >)
      | ({ __typename?: "Assertion" } & Pick<Types.Assertion, "urn" | "type">)
      | ({ __typename?: "BusinessAttribute" } & Pick<
          Types.BusinessAttribute,
          "urn" | "type"
        >)
      | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type">)
      | ({ __typename?: "Container" } & Pick<Types.Container, "urn" | "type">)
      | ({ __typename?: "CorpGroup" } & Pick<Types.CorpGroup, "urn" | "type">)
      | ({ __typename?: "CorpUser" } & Pick<
          Types.CorpUser,
          "username" | "urn" | "type"
        > & {
            info?: Types.Maybe<
              { __typename?: "CorpUserInfo" } & Pick<
                Types.CorpUserInfo,
                "displayName"
              >
            >;
            properties?: Types.Maybe<
              { __typename?: "CorpUserProperties" } & Pick<
                Types.CorpUserProperties,
                "displayName"
              >
            >;
            editableProperties?: Types.Maybe<
              { __typename?: "CorpUserEditableProperties" } & Pick<
                Types.CorpUserEditableProperties,
                "displayName"
              >
            >;
          })
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
        >)
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

export type FullLineageResultsFragment = {
  __typename?: "EntityLineageResult";
} & Pick<
  Types.EntityLineageResult,
  "start" | "count" | "total" | "filtered"
> & {
    relationships: Array<
      { __typename?: "LineageRelationship" } & {
        entity?: Types.Maybe<
          | { __typename?: "AccessTokenMetadata" }
          | { __typename?: "Application" }
          | ({ __typename?: "Assertion" } & LineageFields_Assertion_Fragment)
          | { __typename?: "BusinessAttribute" }
          | ({ __typename?: "Chart" } & {
              inputFields?: Types.Maybe<
                { __typename?: "InputFields" } & InputFieldsFieldsFragment
              >;
            } & LineageFields_Chart_Fragment)
          | { __typename?: "Container" }
          | { __typename?: "CorpGroup" }
          | { __typename?: "CorpUser" }
          | ({ __typename?: "Dashboard" } & LineageFields_Dashboard_Fragment)
          | { __typename?: "DataContract" }
          | ({ __typename?: "DataFlow" } & LineageFields_DataFlow_Fragment)
          | { __typename?: "DataHubConnection" }
          | { __typename?: "DataHubFile" }
          | { __typename?: "DataHubPageModule" }
          | { __typename?: "DataHubPageTemplate" }
          | { __typename?: "DataHubPolicy" }
          | { __typename?: "DataHubRole" }
          | { __typename?: "DataHubView" }
          | ({ __typename?: "DataJob" } & LineageFields_DataJob_Fragment)
          | { __typename?: "DataPlatform" }
          | { __typename?: "DataPlatformInstance" }
          | ({
              __typename?: "DataProcessInstance";
            } & LineageFields_DataProcessInstance_Fragment)
          | { __typename?: "DataProduct" }
          | { __typename?: "DataTypeEntity" }
          | ({ __typename?: "Dataset" } & {
              schemaMetadata?: Types.Maybe<
                { __typename?: "SchemaMetadata" } & SchemaMetadataFieldsFragment
              >;
            } & LineageFields_Dataset_Fragment)
          | { __typename?: "Domain" }
          | ({
              __typename?: "ERModelRelationship";
            } & LineageFields_ErModelRelationship_Fragment)
          | { __typename?: "EntityTypeEntity" }
          | { __typename?: "ExecutionRequest" }
          | { __typename?: "Form" }
          | { __typename?: "GlossaryNode" }
          | { __typename?: "GlossaryTerm" }
          | { __typename?: "Incident" }
          | ({ __typename?: "MLFeature" } & LineageFields_MlFeature_Fragment)
          | ({
              __typename?: "MLFeatureTable";
            } & LineageFields_MlFeatureTable_Fragment)
          | ({ __typename?: "MLModel" } & LineageFields_MlModel_Fragment)
          | ({
              __typename?: "MLModelGroup";
            } & LineageFields_MlModelGroup_Fragment)
          | ({
              __typename?: "MLPrimaryKey";
            } & LineageFields_MlPrimaryKey_Fragment)
          | { __typename?: "Notebook" }
          | { __typename?: "OwnershipTypeEntity" }
          | { __typename?: "Post" }
          | { __typename?: "QueryEntity" }
          | ({ __typename?: "Restricted" } & LineageFields_Restricted_Fragment)
          | { __typename?: "Role" }
          | ({
              __typename?: "SchemaFieldEntity";
            } & LineageFields_SchemaFieldEntity_Fragment)
          | { __typename?: "StructuredPropertyEntity" }
          | { __typename?: "Tag" }
          | { __typename?: "Test" }
          | { __typename?: "VersionSet" }
          | { __typename?: "VersionedDataset" }
        >;
      } & LineageRelationshipFieldsFragment
    >;
  };

export type LeafLineageResultsFragment = {
  __typename?: "EntityLineageResult";
} & Pick<
  Types.EntityLineageResult,
  "start" | "count" | "total" | "filtered"
> & {
    relationships: Array<
      { __typename?: "LineageRelationship" } & {
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
          | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type">)
          | ({ __typename?: "Dashboard" } & Pick<
              Types.Dashboard,
              "urn" | "type"
            >)
          | ({ __typename?: "DataContract" } & Pick<
              Types.DataContract,
              "urn" | "type"
            >)
          | ({ __typename?: "DataFlow" } & Pick<Types.DataFlow, "urn" | "type">)
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
          | ({ __typename?: "Incident" } & Pick<Types.Incident, "urn" | "type">)
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
          | ({ __typename?: "Notebook" } & Pick<Types.Notebook, "urn" | "type">)
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
      } & LineageRelationshipFieldsFragment
    >;
  };

export type PartialLineageResultsFragment = {
  __typename?: "EntityLineageResult";
} & Pick<Types.EntityLineageResult, "start" | "count" | "total" | "filtered">;

export type EntityLineage_AccessTokenMetadata_Fragment = {
  __typename?: "AccessTokenMetadata";
} & Pick<Types.AccessTokenMetadata, "urn" | "type">;

export type EntityLineage_Application_Fragment = {
  __typename?: "Application";
} & Pick<Types.Application, "urn" | "type">;

export type EntityLineage_Assertion_Fragment = {
  __typename?: "Assertion";
} & Pick<Types.Assertion, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
  } & LineageNodeProperties_Assertion_Fragment &
  CanEditLineageFragment_Assertion_Fragment;

export type EntityLineage_BusinessAttribute_Fragment = {
  __typename?: "BusinessAttribute";
} & Pick<Types.BusinessAttribute, "urn" | "type">;

export type EntityLineage_Chart_Fragment = { __typename?: "Chart" } & Pick<
  Types.Chart,
  "urn" | "type"
> & {
    inputFields?: Types.Maybe<
      { __typename?: "InputFields" } & InputFieldsFieldsFragment
    >;
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
  } & LineageNodeProperties_Chart_Fragment &
  CanEditLineageFragment_Chart_Fragment;

export type EntityLineage_Container_Fragment = {
  __typename?: "Container";
} & Pick<Types.Container, "urn" | "type">;

export type EntityLineage_CorpGroup_Fragment = {
  __typename?: "CorpGroup";
} & Pick<Types.CorpGroup, "urn" | "type">;

export type EntityLineage_CorpUser_Fragment = {
  __typename?: "CorpUser";
} & Pick<Types.CorpUser, "urn" | "type">;

export type EntityLineage_Dashboard_Fragment = {
  __typename?: "Dashboard";
} & Pick<Types.Dashboard, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
  } & LineageNodeProperties_Dashboard_Fragment &
  CanEditLineageFragment_Dashboard_Fragment;

export type EntityLineage_DataContract_Fragment = {
  __typename?: "DataContract";
} & Pick<Types.DataContract, "urn" | "type">;

export type EntityLineage_DataFlow_Fragment = {
  __typename?: "DataFlow";
} & Pick<Types.DataFlow, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
  } & LineageNodeProperties_DataFlow_Fragment &
  CanEditLineageFragment_DataFlow_Fragment;

export type EntityLineage_DataHubConnection_Fragment = {
  __typename?: "DataHubConnection";
} & Pick<Types.DataHubConnection, "urn" | "type">;

export type EntityLineage_DataHubFile_Fragment = {
  __typename?: "DataHubFile";
} & Pick<Types.DataHubFile, "urn" | "type">;

export type EntityLineage_DataHubPageModule_Fragment = {
  __typename?: "DataHubPageModule";
} & Pick<Types.DataHubPageModule, "urn" | "type">;

export type EntityLineage_DataHubPageTemplate_Fragment = {
  __typename?: "DataHubPageTemplate";
} & Pick<Types.DataHubPageTemplate, "urn" | "type">;

export type EntityLineage_DataHubPolicy_Fragment = {
  __typename?: "DataHubPolicy";
} & Pick<Types.DataHubPolicy, "urn" | "type">;

export type EntityLineage_DataHubRole_Fragment = {
  __typename?: "DataHubRole";
} & Pick<Types.DataHubRole, "urn" | "type">;

export type EntityLineage_DataHubView_Fragment = {
  __typename?: "DataHubView";
} & Pick<Types.DataHubView, "urn" | "type">;

export type EntityLineage_DataJob_Fragment = { __typename?: "DataJob" } & Pick<
  Types.DataJob,
  "urn" | "type"
> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
  } & LineageNodeProperties_DataJob_Fragment &
  CanEditLineageFragment_DataJob_Fragment;

export type EntityLineage_DataPlatform_Fragment = {
  __typename?: "DataPlatform";
} & Pick<Types.DataPlatform, "urn" | "type">;

export type EntityLineage_DataPlatformInstance_Fragment = {
  __typename?: "DataPlatformInstance";
} & Pick<Types.DataPlatformInstance, "urn" | "type">;

export type EntityLineage_DataProcessInstance_Fragment = {
  __typename?: "DataProcessInstance";
} & Pick<Types.DataProcessInstance, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
  } & LineageNodeProperties_DataProcessInstance_Fragment &
  CanEditLineageFragment_DataProcessInstance_Fragment;

export type EntityLineage_DataProduct_Fragment = {
  __typename?: "DataProduct";
} & Pick<Types.DataProduct, "urn" | "type">;

export type EntityLineage_DataTypeEntity_Fragment = {
  __typename?: "DataTypeEntity";
} & Pick<Types.DataTypeEntity, "urn" | "type">;

export type EntityLineage_Dataset_Fragment = { __typename?: "Dataset" } & Pick<
  Types.Dataset,
  "urn" | "type"
> & {
    schemaMetadata?: Types.Maybe<
      { __typename?: "SchemaMetadata" } & SchemaMetadataFieldsFragment
    >;
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
                | ({ __typename?: "Chart" } & Pick<
                    Types.Chart,
                    "urn" | "type"
                  > &
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
                    "exists" | "urn" | "type"
                  > &
                    LineageNodeProperties_Dataset_Fragment)
                | ({ __typename?: "Domain" } & Pick<
                    Types.Domain,
                    "urn" | "type"
                  >)
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
                | ({ __typename?: "Chart" } & Pick<
                    Types.Chart,
                    "urn" | "type"
                  > &
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
                    "exists" | "urn" | "type"
                  > &
                    LineageNodeProperties_Dataset_Fragment)
                | ({ __typename?: "Domain" } & Pick<
                    Types.Domain,
                    "urn" | "type"
                  >)
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
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
  } & LineageNodeProperties_Dataset_Fragment &
  CanEditLineageFragment_Dataset_Fragment;

export type EntityLineage_Domain_Fragment = { __typename?: "Domain" } & Pick<
  Types.Domain,
  "urn" | "type"
>;

export type EntityLineage_ErModelRelationship_Fragment = {
  __typename?: "ERModelRelationship";
} & Pick<Types.ErModelRelationship, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
  } & LineageNodeProperties_ErModelRelationship_Fragment &
  CanEditLineageFragment_ErModelRelationship_Fragment;

export type EntityLineage_EntityTypeEntity_Fragment = {
  __typename?: "EntityTypeEntity";
} & Pick<Types.EntityTypeEntity, "urn" | "type">;

export type EntityLineage_ExecutionRequest_Fragment = {
  __typename?: "ExecutionRequest";
} & Pick<Types.ExecutionRequest, "urn" | "type">;

export type EntityLineage_Form_Fragment = { __typename?: "Form" } & Pick<
  Types.Form,
  "urn" | "type"
>;

export type EntityLineage_GlossaryNode_Fragment = {
  __typename?: "GlossaryNode";
} & Pick<Types.GlossaryNode, "urn" | "type">;

export type EntityLineage_GlossaryTerm_Fragment = {
  __typename?: "GlossaryTerm";
} & Pick<Types.GlossaryTerm, "urn" | "type">;

export type EntityLineage_Incident_Fragment = {
  __typename?: "Incident";
} & Pick<Types.Incident, "urn" | "type">;

export type EntityLineage_MlFeature_Fragment = {
  __typename?: "MLFeature";
} & Pick<Types.MlFeature, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
  } & LineageNodeProperties_MlFeature_Fragment &
  CanEditLineageFragment_MlFeature_Fragment;

export type EntityLineage_MlFeatureTable_Fragment = {
  __typename?: "MLFeatureTable";
} & Pick<Types.MlFeatureTable, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
  } & LineageNodeProperties_MlFeatureTable_Fragment &
  CanEditLineageFragment_MlFeatureTable_Fragment;

export type EntityLineage_MlModel_Fragment = { __typename?: "MLModel" } & Pick<
  Types.MlModel,
  "urn" | "type"
> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
  } & LineageNodeProperties_MlModel_Fragment &
  CanEditLineageFragment_MlModel_Fragment;

export type EntityLineage_MlModelGroup_Fragment = {
  __typename?: "MLModelGroup";
} & Pick<Types.MlModelGroup, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
  } & LineageNodeProperties_MlModelGroup_Fragment &
  CanEditLineageFragment_MlModelGroup_Fragment;

export type EntityLineage_MlPrimaryKey_Fragment = {
  __typename?: "MLPrimaryKey";
} & Pick<Types.MlPrimaryKey, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
  } & LineageNodeProperties_MlPrimaryKey_Fragment &
  CanEditLineageFragment_MlPrimaryKey_Fragment;

export type EntityLineage_Notebook_Fragment = {
  __typename?: "Notebook";
} & Pick<Types.Notebook, "urn" | "type">;

export type EntityLineage_OwnershipTypeEntity_Fragment = {
  __typename?: "OwnershipTypeEntity";
} & Pick<Types.OwnershipTypeEntity, "urn" | "type">;

export type EntityLineage_Post_Fragment = { __typename?: "Post" } & Pick<
  Types.Post,
  "urn" | "type"
>;

export type EntityLineage_QueryEntity_Fragment = {
  __typename?: "QueryEntity";
} & Pick<Types.QueryEntity, "urn" | "type">;

export type EntityLineage_Restricted_Fragment = {
  __typename?: "Restricted";
} & Pick<Types.Restricted, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
  } & LineageNodeProperties_Restricted_Fragment &
  CanEditLineageFragment_Restricted_Fragment;

export type EntityLineage_Role_Fragment = { __typename?: "Role" } & Pick<
  Types.Role,
  "urn" | "type"
>;

export type EntityLineage_SchemaFieldEntity_Fragment = {
  __typename?: "SchemaFieldEntity";
} & Pick<Types.SchemaFieldEntity, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & FullLineageResultsFragment
    >;
  } & LineageNodeProperties_SchemaFieldEntity_Fragment &
  CanEditLineageFragment_SchemaFieldEntity_Fragment;

export type EntityLineage_StructuredPropertyEntity_Fragment = {
  __typename?: "StructuredPropertyEntity";
} & Pick<Types.StructuredPropertyEntity, "urn" | "type">;

export type EntityLineage_Tag_Fragment = { __typename?: "Tag" } & Pick<
  Types.Tag,
  "urn" | "type"
>;

export type EntityLineage_Test_Fragment = { __typename?: "Test" } & Pick<
  Types.Test,
  "urn" | "type"
>;

export type EntityLineage_VersionSet_Fragment = {
  __typename?: "VersionSet";
} & Pick<Types.VersionSet, "urn" | "type">;

export type EntityLineage_VersionedDataset_Fragment = {
  __typename?: "VersionedDataset";
} & Pick<Types.VersionedDataset, "urn" | "type">;

export type EntityLineageFragment =
  | EntityLineage_AccessTokenMetadata_Fragment
  | EntityLineage_Application_Fragment
  | EntityLineage_Assertion_Fragment
  | EntityLineage_BusinessAttribute_Fragment
  | EntityLineage_Chart_Fragment
  | EntityLineage_Container_Fragment
  | EntityLineage_CorpGroup_Fragment
  | EntityLineage_CorpUser_Fragment
  | EntityLineage_Dashboard_Fragment
  | EntityLineage_DataContract_Fragment
  | EntityLineage_DataFlow_Fragment
  | EntityLineage_DataHubConnection_Fragment
  | EntityLineage_DataHubFile_Fragment
  | EntityLineage_DataHubPageModule_Fragment
  | EntityLineage_DataHubPageTemplate_Fragment
  | EntityLineage_DataHubPolicy_Fragment
  | EntityLineage_DataHubRole_Fragment
  | EntityLineage_DataHubView_Fragment
  | EntityLineage_DataJob_Fragment
  | EntityLineage_DataPlatform_Fragment
  | EntityLineage_DataPlatformInstance_Fragment
  | EntityLineage_DataProcessInstance_Fragment
  | EntityLineage_DataProduct_Fragment
  | EntityLineage_DataTypeEntity_Fragment
  | EntityLineage_Dataset_Fragment
  | EntityLineage_Domain_Fragment
  | EntityLineage_ErModelRelationship_Fragment
  | EntityLineage_EntityTypeEntity_Fragment
  | EntityLineage_ExecutionRequest_Fragment
  | EntityLineage_Form_Fragment
  | EntityLineage_GlossaryNode_Fragment
  | EntityLineage_GlossaryTerm_Fragment
  | EntityLineage_Incident_Fragment
  | EntityLineage_MlFeature_Fragment
  | EntityLineage_MlFeatureTable_Fragment
  | EntityLineage_MlModel_Fragment
  | EntityLineage_MlModelGroup_Fragment
  | EntityLineage_MlPrimaryKey_Fragment
  | EntityLineage_Notebook_Fragment
  | EntityLineage_OwnershipTypeEntity_Fragment
  | EntityLineage_Post_Fragment
  | EntityLineage_QueryEntity_Fragment
  | EntityLineage_Restricted_Fragment
  | EntityLineage_Role_Fragment
  | EntityLineage_SchemaFieldEntity_Fragment
  | EntityLineage_StructuredPropertyEntity_Fragment
  | EntityLineage_Tag_Fragment
  | EntityLineage_Test_Fragment
  | EntityLineage_VersionSet_Fragment
  | EntityLineage_VersionedDataset_Fragment;

export type LineageV2ResultFragment = {
  __typename?: "EntityLineageResult";
} & Pick<Types.EntityLineageResult, "filtered" | "total"> & {
    relationships: Array<
      { __typename?: "LineageRelationship" } & {
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
                      >)
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
                    | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn" | "type">)
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
          | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type">)
          | ({ __typename?: "Dashboard" } & Pick<
              Types.Dashboard,
              "urn" | "type"
            >)
          | ({ __typename?: "DataContract" } & Pick<
              Types.DataContract,
              "urn" | "type"
            >)
          | ({ __typename?: "DataFlow" } & Pick<Types.DataFlow, "urn" | "type">)
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
          | ({ __typename?: "Incident" } & Pick<Types.Incident, "urn" | "type">)
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
          | ({ __typename?: "Notebook" } & Pick<Types.Notebook, "urn" | "type">)
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
      } & LineageRelationshipFieldsFragment
    >;
  };

export type LineageSchemaFieldFragment = { __typename?: "SchemaField" } & Pick<
  Types.SchemaField,
  "fieldPath" | "type" | "nativeDataType"
>;

export type EntityLineageV2_AccessTokenMetadata_Fragment = {
  __typename?: "AccessTokenMetadata";
} & Pick<Types.AccessTokenMetadata, "urn" | "type">;

export type EntityLineageV2_Application_Fragment = {
  __typename?: "Application";
} & Pick<Types.Application, "urn" | "type">;

export type EntityLineageV2_Assertion_Fragment = {
  __typename?: "Assertion";
} & Pick<Types.Assertion, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
  } & LineageNodeProperties_Assertion_Fragment &
  CanEditLineageFragment_Assertion_Fragment;

export type EntityLineageV2_BusinessAttribute_Fragment = {
  __typename?: "BusinessAttribute";
} & Pick<Types.BusinessAttribute, "urn" | "type">;

export type EntityLineageV2_Chart_Fragment = { __typename?: "Chart" } & Pick<
  Types.Chart,
  "urn" | "type"
> & {
    inputFields?: Types.Maybe<
      { __typename?: "InputFields" } & {
        fields?: Types.Maybe<
          Array<
            Types.Maybe<
              { __typename?: "InputField" } & Pick<
                Types.InputField,
                "schemaFieldUrn"
              > & {
                  schemaField?: Types.Maybe<
                    { __typename?: "SchemaField" } & LineageSchemaFieldFragment
                  >;
                }
            >
          >
        >;
      }
    >;
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
  } & LineageNodeProperties_Chart_Fragment &
  CanEditLineageFragment_Chart_Fragment;

export type EntityLineageV2_Container_Fragment = {
  __typename?: "Container";
} & Pick<Types.Container, "urn" | "type">;

export type EntityLineageV2_CorpGroup_Fragment = {
  __typename?: "CorpGroup";
} & Pick<Types.CorpGroup, "urn" | "type">;

export type EntityLineageV2_CorpUser_Fragment = {
  __typename?: "CorpUser";
} & Pick<Types.CorpUser, "urn" | "type">;

export type EntityLineageV2_Dashboard_Fragment = {
  __typename?: "Dashboard";
} & Pick<Types.Dashboard, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
  } & LineageNodeProperties_Dashboard_Fragment &
  CanEditLineageFragment_Dashboard_Fragment;

export type EntityLineageV2_DataContract_Fragment = {
  __typename?: "DataContract";
} & Pick<Types.DataContract, "urn" | "type">;

export type EntityLineageV2_DataFlow_Fragment = {
  __typename?: "DataFlow";
} & Pick<Types.DataFlow, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
  } & LineageNodeProperties_DataFlow_Fragment &
  CanEditLineageFragment_DataFlow_Fragment;

export type EntityLineageV2_DataHubConnection_Fragment = {
  __typename?: "DataHubConnection";
} & Pick<Types.DataHubConnection, "urn" | "type">;

export type EntityLineageV2_DataHubFile_Fragment = {
  __typename?: "DataHubFile";
} & Pick<Types.DataHubFile, "urn" | "type">;

export type EntityLineageV2_DataHubPageModule_Fragment = {
  __typename?: "DataHubPageModule";
} & Pick<Types.DataHubPageModule, "urn" | "type">;

export type EntityLineageV2_DataHubPageTemplate_Fragment = {
  __typename?: "DataHubPageTemplate";
} & Pick<Types.DataHubPageTemplate, "urn" | "type">;

export type EntityLineageV2_DataHubPolicy_Fragment = {
  __typename?: "DataHubPolicy";
} & Pick<Types.DataHubPolicy, "urn" | "type">;

export type EntityLineageV2_DataHubRole_Fragment = {
  __typename?: "DataHubRole";
} & Pick<Types.DataHubRole, "urn" | "type">;

export type EntityLineageV2_DataHubView_Fragment = {
  __typename?: "DataHubView";
} & Pick<Types.DataHubView, "urn" | "type">;

export type EntityLineageV2_DataJob_Fragment = {
  __typename?: "DataJob";
} & Pick<Types.DataJob, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
  } & LineageNodeProperties_DataJob_Fragment &
  CanEditLineageFragment_DataJob_Fragment;

export type EntityLineageV2_DataPlatform_Fragment = {
  __typename?: "DataPlatform";
} & Pick<Types.DataPlatform, "urn" | "type">;

export type EntityLineageV2_DataPlatformInstance_Fragment = {
  __typename?: "DataPlatformInstance";
} & Pick<Types.DataPlatformInstance, "urn" | "type">;

export type EntityLineageV2_DataProcessInstance_Fragment = {
  __typename?: "DataProcessInstance";
} & Pick<Types.DataProcessInstance, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
  } & DataProcessInstanceFieldsFragment &
  LineageNodeProperties_DataProcessInstance_Fragment &
  CanEditLineageFragment_DataProcessInstance_Fragment;

export type EntityLineageV2_DataProduct_Fragment = {
  __typename?: "DataProduct";
} & Pick<Types.DataProduct, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "DataProductProperties" } & Pick<
        Types.DataProductProperties,
        "name" | "description"
      >
    >;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    entities?: Types.Maybe<
      { __typename?: "SearchResults" } & Pick<Types.SearchResults, "total">
    >;
  };

export type EntityLineageV2_DataTypeEntity_Fragment = {
  __typename?: "DataTypeEntity";
} & Pick<Types.DataTypeEntity, "urn" | "type">;

export type EntityLineageV2_Dataset_Fragment = {
  __typename?: "Dataset";
} & Pick<Types.Dataset, "urn" | "type"> & {
    schemaMetadata?: Types.Maybe<
      { __typename?: "SchemaMetadata" } & {
        fields: Array<
          { __typename?: "SchemaField" } & LineageSchemaFieldFragment
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
                    "exists" | "urn" | "type"
                  > & {
                      subTypes?: Types.Maybe<
                        { __typename?: "SubTypes" } & Pick<
                          Types.SubTypes,
                          "typeNames"
                        >
                      >;
                      platform: {
                        __typename?: "DataPlatform";
                      } & PlatformFieldsFragment;
                    })
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
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    versionProperties?: Types.Maybe<
      { __typename?: "VersionProperties" } & VersionPropertiesFragment
    >;
  } & LineageNodeProperties_Dataset_Fragment &
  CanEditLineageFragment_Dataset_Fragment;

export type EntityLineageV2_Domain_Fragment = { __typename?: "Domain" } & Pick<
  Types.Domain,
  "id" | "urn" | "type"
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
    dataProducts?: Types.Maybe<
      { __typename?: "SearchResults" } & Pick<Types.SearchResults, "total"> & {
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
                | ({ __typename?: "DataProduct" } & Pick<
                    Types.DataProduct,
                    "urn" | "type"
                  > & {
                      properties?: Types.Maybe<
                        { __typename?: "DataProductProperties" } & Pick<
                          Types.DataProductProperties,
                          "name" | "description"
                        >
                      >;
                      domain?: Types.Maybe<
                        {
                          __typename?: "DomainAssociation";
                        } & EntityDomainFragment
                      >;
                      entities?: Types.Maybe<
                        { __typename?: "SearchResults" } & Pick<
                          Types.SearchResults,
                          "total"
                        >
                      >;
                    })
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
                | { __typename?: "VersionedDataset" };
            }
          >;
        }
    >;
  };

export type EntityLineageV2_ErModelRelationship_Fragment = {
  __typename?: "ERModelRelationship";
} & Pick<Types.ErModelRelationship, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
  } & LineageNodeProperties_ErModelRelationship_Fragment &
  CanEditLineageFragment_ErModelRelationship_Fragment;

export type EntityLineageV2_EntityTypeEntity_Fragment = {
  __typename?: "EntityTypeEntity";
} & Pick<Types.EntityTypeEntity, "urn" | "type">;

export type EntityLineageV2_ExecutionRequest_Fragment = {
  __typename?: "ExecutionRequest";
} & Pick<Types.ExecutionRequest, "urn" | "type">;

export type EntityLineageV2_Form_Fragment = { __typename?: "Form" } & Pick<
  Types.Form,
  "urn" | "type"
>;

export type EntityLineageV2_GlossaryNode_Fragment = {
  __typename?: "GlossaryNode";
} & Pick<Types.GlossaryNode, "urn" | "type">;

export type EntityLineageV2_GlossaryTerm_Fragment = {
  __typename?: "GlossaryTerm";
} & Pick<Types.GlossaryTerm, "urn" | "type">;

export type EntityLineageV2_Incident_Fragment = {
  __typename?: "Incident";
} & Pick<Types.Incident, "urn" | "type">;

export type EntityLineageV2_MlFeature_Fragment = {
  __typename?: "MLFeature";
} & Pick<Types.MlFeature, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
  } & LineageNodeProperties_MlFeature_Fragment &
  CanEditLineageFragment_MlFeature_Fragment;

export type EntityLineageV2_MlFeatureTable_Fragment = {
  __typename?: "MLFeatureTable";
} & Pick<Types.MlFeatureTable, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
  } & LineageNodeProperties_MlFeatureTable_Fragment &
  CanEditLineageFragment_MlFeatureTable_Fragment;

export type EntityLineageV2_MlModel_Fragment = {
  __typename?: "MLModel";
} & Pick<Types.MlModel, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    versionProperties?: Types.Maybe<
      { __typename?: "VersionProperties" } & VersionPropertiesFragment
    >;
  } & LineageNodeProperties_MlModel_Fragment &
  CanEditLineageFragment_MlModel_Fragment;

export type EntityLineageV2_MlModelGroup_Fragment = {
  __typename?: "MLModelGroup";
} & Pick<Types.MlModelGroup, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
  } & LineageNodeProperties_MlModelGroup_Fragment &
  CanEditLineageFragment_MlModelGroup_Fragment;

export type EntityLineageV2_MlPrimaryKey_Fragment = {
  __typename?: "MLPrimaryKey";
} & Pick<Types.MlPrimaryKey, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
  } & LineageNodeProperties_MlPrimaryKey_Fragment &
  CanEditLineageFragment_MlPrimaryKey_Fragment;

export type EntityLineageV2_Notebook_Fragment = {
  __typename?: "Notebook";
} & Pick<Types.Notebook, "urn" | "type">;

export type EntityLineageV2_OwnershipTypeEntity_Fragment = {
  __typename?: "OwnershipTypeEntity";
} & Pick<Types.OwnershipTypeEntity, "urn" | "type">;

export type EntityLineageV2_Post_Fragment = { __typename?: "Post" } & Pick<
  Types.Post,
  "urn" | "type"
>;

export type EntityLineageV2_QueryEntity_Fragment = {
  __typename?: "QueryEntity";
} & Pick<Types.QueryEntity, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "QueryProperties" } & {
        origin?: Types.Maybe<
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
          | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type">)
          | ({ __typename?: "Dashboard" } & Pick<
              Types.Dashboard,
              "urn" | "type"
            >)
          | ({ __typename?: "DataContract" } & Pick<
              Types.DataContract,
              "urn" | "type"
            >)
          | ({ __typename?: "DataFlow" } & Pick<Types.DataFlow, "urn" | "type">)
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
          | ({ __typename?: "Incident" } & Pick<Types.Incident, "urn" | "type">)
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
          | ({ __typename?: "Notebook" } & Pick<Types.Notebook, "urn" | "type">)
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
    queryPlatform?: Types.Maybe<
      { __typename?: "DataPlatform" } & PlatformFieldsFragment
    >;
  };

export type EntityLineageV2_Restricted_Fragment = {
  __typename?: "Restricted";
} & Pick<Types.Restricted, "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
  } & LineageNodeProperties_Restricted_Fragment &
  CanEditLineageFragment_Restricted_Fragment;

export type EntityLineageV2_Role_Fragment = { __typename?: "Role" } & Pick<
  Types.Role,
  "urn" | "type"
>;

export type EntityLineageV2_SchemaFieldEntity_Fragment = {
  __typename?: "SchemaFieldEntity";
} & Pick<Types.SchemaFieldEntity, "fieldPath" | "urn" | "type"> & {
    upstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    downstream?: Types.Maybe<
      { __typename?: "EntityLineageResult" } & LineageV2ResultFragment
    >;
    parent:
      | ({ __typename?: "AccessTokenMetadata" } & Pick<
          Types.AccessTokenMetadata,
          "urn" | "type"
        >)
      | ({ __typename?: "Application" } & Pick<
          Types.Application,
          "urn" | "type"
        >)
      | ({ __typename?: "Assertion" } & Pick<Types.Assertion, "urn" | "type"> &
          LineageNodeProperties_Assertion_Fragment)
      | ({ __typename?: "BusinessAttribute" } & Pick<
          Types.BusinessAttribute,
          "urn" | "type"
        >)
      | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type"> &
          LineageNodeProperties_Chart_Fragment)
      | ({ __typename?: "Container" } & Pick<Types.Container, "urn" | "type">)
      | ({ __typename?: "CorpGroup" } & Pick<Types.CorpGroup, "urn" | "type">)
      | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type">)
      | ({ __typename?: "Dashboard" } & Pick<Types.Dashboard, "urn" | "type"> &
          LineageNodeProperties_Dashboard_Fragment)
      | ({ __typename?: "DataContract" } & Pick<
          Types.DataContract,
          "urn" | "type"
        >)
      | ({ __typename?: "DataFlow" } & Pick<Types.DataFlow, "urn" | "type"> &
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
      | ({ __typename?: "DataJob" } & Pick<Types.DataJob, "urn" | "type"> &
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
      | ({ __typename?: "Dataset" } & Pick<Types.Dataset, "urn" | "type"> &
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
      | ({ __typename?: "Incident" } & Pick<Types.Incident, "urn" | "type">)
      | ({ __typename?: "MLFeature" } & Pick<Types.MlFeature, "urn" | "type"> &
          LineageNodeProperties_MlFeature_Fragment)
      | ({ __typename?: "MLFeatureTable" } & Pick<
          Types.MlFeatureTable,
          "urn" | "type"
        > &
          LineageNodeProperties_MlFeatureTable_Fragment)
      | ({ __typename?: "MLModel" } & Pick<Types.MlModel, "urn" | "type"> &
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
      | ({ __typename?: "Notebook" } & Pick<Types.Notebook, "urn" | "type">)
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
      | ({ __typename?: "VersionSet" } & Pick<Types.VersionSet, "urn" | "type">)
      | ({ __typename?: "VersionedDataset" } & Pick<
          Types.VersionedDataset,
          "urn" | "type"
        >);
    status?: Types.Maybe<
      { __typename?: "Status" } & Pick<Types.Status, "removed">
    >;
  } & LineageNodeProperties_SchemaFieldEntity_Fragment &
  CanEditLineageFragment_SchemaFieldEntity_Fragment;

export type EntityLineageV2_StructuredPropertyEntity_Fragment = {
  __typename?: "StructuredPropertyEntity";
} & Pick<Types.StructuredPropertyEntity, "urn" | "type">;

export type EntityLineageV2_Tag_Fragment = { __typename?: "Tag" } & Pick<
  Types.Tag,
  "urn" | "type"
>;

export type EntityLineageV2_Test_Fragment = { __typename?: "Test" } & Pick<
  Types.Test,
  "urn" | "type"
>;

export type EntityLineageV2_VersionSet_Fragment = {
  __typename?: "VersionSet";
} & Pick<Types.VersionSet, "urn" | "type">;

export type EntityLineageV2_VersionedDataset_Fragment = {
  __typename?: "VersionedDataset";
} & Pick<Types.VersionedDataset, "urn" | "type">;

export type EntityLineageV2Fragment =
  | EntityLineageV2_AccessTokenMetadata_Fragment
  | EntityLineageV2_Application_Fragment
  | EntityLineageV2_Assertion_Fragment
  | EntityLineageV2_BusinessAttribute_Fragment
  | EntityLineageV2_Chart_Fragment
  | EntityLineageV2_Container_Fragment
  | EntityLineageV2_CorpGroup_Fragment
  | EntityLineageV2_CorpUser_Fragment
  | EntityLineageV2_Dashboard_Fragment
  | EntityLineageV2_DataContract_Fragment
  | EntityLineageV2_DataFlow_Fragment
  | EntityLineageV2_DataHubConnection_Fragment
  | EntityLineageV2_DataHubFile_Fragment
  | EntityLineageV2_DataHubPageModule_Fragment
  | EntityLineageV2_DataHubPageTemplate_Fragment
  | EntityLineageV2_DataHubPolicy_Fragment
  | EntityLineageV2_DataHubRole_Fragment
  | EntityLineageV2_DataHubView_Fragment
  | EntityLineageV2_DataJob_Fragment
  | EntityLineageV2_DataPlatform_Fragment
  | EntityLineageV2_DataPlatformInstance_Fragment
  | EntityLineageV2_DataProcessInstance_Fragment
  | EntityLineageV2_DataProduct_Fragment
  | EntityLineageV2_DataTypeEntity_Fragment
  | EntityLineageV2_Dataset_Fragment
  | EntityLineageV2_Domain_Fragment
  | EntityLineageV2_ErModelRelationship_Fragment
  | EntityLineageV2_EntityTypeEntity_Fragment
  | EntityLineageV2_ExecutionRequest_Fragment
  | EntityLineageV2_Form_Fragment
  | EntityLineageV2_GlossaryNode_Fragment
  | EntityLineageV2_GlossaryTerm_Fragment
  | EntityLineageV2_Incident_Fragment
  | EntityLineageV2_MlFeature_Fragment
  | EntityLineageV2_MlFeatureTable_Fragment
  | EntityLineageV2_MlModel_Fragment
  | EntityLineageV2_MlModelGroup_Fragment
  | EntityLineageV2_MlPrimaryKey_Fragment
  | EntityLineageV2_Notebook_Fragment
  | EntityLineageV2_OwnershipTypeEntity_Fragment
  | EntityLineageV2_Post_Fragment
  | EntityLineageV2_QueryEntity_Fragment
  | EntityLineageV2_Restricted_Fragment
  | EntityLineageV2_Role_Fragment
  | EntityLineageV2_SchemaFieldEntity_Fragment
  | EntityLineageV2_StructuredPropertyEntity_Fragment
  | EntityLineageV2_Tag_Fragment
  | EntityLineageV2_Test_Fragment
  | EntityLineageV2_VersionSet_Fragment
  | EntityLineageV2_VersionedDataset_Fragment;

export type GetEntityLineageQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  separateSiblings?: Types.Maybe<Types.Scalars["Boolean"]>;
  showColumns: Types.Scalars["Boolean"];
  startTimeMillis?: Types.Maybe<Types.Scalars["Long"]>;
  endTimeMillis?: Types.Maybe<Types.Scalars["Long"]>;
  excludeUpstream?: Types.Maybe<Types.Scalars["Boolean"]>;
  excludeDownstream?: Types.Maybe<Types.Scalars["Boolean"]>;
}>;

export type GetEntityLineageQuery = { __typename?: "Query" } & {
  entity?: Types.Maybe<
    | ({
        __typename?: "AccessTokenMetadata";
      } & EntityLineage_AccessTokenMetadata_Fragment)
    | ({ __typename?: "Application" } & EntityLineage_Application_Fragment)
    | ({ __typename?: "Assertion" } & EntityLineage_Assertion_Fragment)
    | ({
        __typename?: "BusinessAttribute";
      } & EntityLineage_BusinessAttribute_Fragment)
    | ({ __typename?: "Chart" } & EntityLineage_Chart_Fragment)
    | ({ __typename?: "Container" } & EntityLineage_Container_Fragment)
    | ({ __typename?: "CorpGroup" } & EntityLineage_CorpGroup_Fragment)
    | ({ __typename?: "CorpUser" } & EntityLineage_CorpUser_Fragment)
    | ({ __typename?: "Dashboard" } & EntityLineage_Dashboard_Fragment)
    | ({ __typename?: "DataContract" } & EntityLineage_DataContract_Fragment)
    | ({ __typename?: "DataFlow" } & EntityLineage_DataFlow_Fragment)
    | ({
        __typename?: "DataHubConnection";
      } & EntityLineage_DataHubConnection_Fragment)
    | ({ __typename?: "DataHubFile" } & EntityLineage_DataHubFile_Fragment)
    | ({
        __typename?: "DataHubPageModule";
      } & EntityLineage_DataHubPageModule_Fragment)
    | ({
        __typename?: "DataHubPageTemplate";
      } & EntityLineage_DataHubPageTemplate_Fragment)
    | ({ __typename?: "DataHubPolicy" } & EntityLineage_DataHubPolicy_Fragment)
    | ({ __typename?: "DataHubRole" } & EntityLineage_DataHubRole_Fragment)
    | ({ __typename?: "DataHubView" } & EntityLineage_DataHubView_Fragment)
    | ({ __typename?: "DataJob" } & EntityLineage_DataJob_Fragment)
    | ({ __typename?: "DataPlatform" } & EntityLineage_DataPlatform_Fragment)
    | ({
        __typename?: "DataPlatformInstance";
      } & EntityLineage_DataPlatformInstance_Fragment)
    | ({
        __typename?: "DataProcessInstance";
      } & EntityLineage_DataProcessInstance_Fragment)
    | ({ __typename?: "DataProduct" } & EntityLineage_DataProduct_Fragment)
    | ({
        __typename?: "DataTypeEntity";
      } & EntityLineage_DataTypeEntity_Fragment)
    | ({ __typename?: "Dataset" } & EntityLineage_Dataset_Fragment)
    | ({ __typename?: "Domain" } & EntityLineage_Domain_Fragment)
    | ({
        __typename?: "ERModelRelationship";
      } & EntityLineage_ErModelRelationship_Fragment)
    | ({
        __typename?: "EntityTypeEntity";
      } & EntityLineage_EntityTypeEntity_Fragment)
    | ({
        __typename?: "ExecutionRequest";
      } & EntityLineage_ExecutionRequest_Fragment)
    | ({ __typename?: "Form" } & EntityLineage_Form_Fragment)
    | ({ __typename?: "GlossaryNode" } & EntityLineage_GlossaryNode_Fragment)
    | ({ __typename?: "GlossaryTerm" } & EntityLineage_GlossaryTerm_Fragment)
    | ({ __typename?: "Incident" } & EntityLineage_Incident_Fragment)
    | ({ __typename?: "MLFeature" } & EntityLineage_MlFeature_Fragment)
    | ({
        __typename?: "MLFeatureTable";
      } & EntityLineage_MlFeatureTable_Fragment)
    | ({ __typename?: "MLModel" } & EntityLineage_MlModel_Fragment)
    | ({ __typename?: "MLModelGroup" } & EntityLineage_MlModelGroup_Fragment)
    | ({ __typename?: "MLPrimaryKey" } & EntityLineage_MlPrimaryKey_Fragment)
    | ({ __typename?: "Notebook" } & EntityLineage_Notebook_Fragment)
    | ({
        __typename?: "OwnershipTypeEntity";
      } & EntityLineage_OwnershipTypeEntity_Fragment)
    | ({ __typename?: "Post" } & EntityLineage_Post_Fragment)
    | ({ __typename?: "QueryEntity" } & EntityLineage_QueryEntity_Fragment)
    | ({ __typename?: "Restricted" } & EntityLineage_Restricted_Fragment)
    | ({ __typename?: "Role" } & EntityLineage_Role_Fragment)
    | ({
        __typename?: "SchemaFieldEntity";
      } & EntityLineage_SchemaFieldEntity_Fragment)
    | ({
        __typename?: "StructuredPropertyEntity";
      } & EntityLineage_StructuredPropertyEntity_Fragment)
    | ({ __typename?: "Tag" } & EntityLineage_Tag_Fragment)
    | ({ __typename?: "Test" } & EntityLineage_Test_Fragment)
    | ({ __typename?: "VersionSet" } & EntityLineage_VersionSet_Fragment)
    | ({
        __typename?: "VersionedDataset";
      } & EntityLineage_VersionedDataset_Fragment)
  >;
};

export type GetEntityLineageV2QueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  separateSiblings?: Types.Maybe<Types.Scalars["Boolean"]>;
  showColumns: Types.Scalars["Boolean"];
  startTimeMillis?: Types.Maybe<Types.Scalars["Long"]>;
  endTimeMillis?: Types.Maybe<Types.Scalars["Long"]>;
  excludeUpstream?: Types.Maybe<Types.Scalars["Boolean"]>;
  excludeDownstream?: Types.Maybe<Types.Scalars["Boolean"]>;
  includeGhostEntities?: Types.Maybe<Types.Scalars["Boolean"]>;
}>;

export type GetEntityLineageV2Query = { __typename?: "Query" } & {
  entity?: Types.Maybe<
    | ({
        __typename?: "AccessTokenMetadata";
      } & EntityLineageV2_AccessTokenMetadata_Fragment)
    | ({ __typename?: "Application" } & EntityLineageV2_Application_Fragment)
    | ({ __typename?: "Assertion" } & EntityLineageV2_Assertion_Fragment)
    | ({
        __typename?: "BusinessAttribute";
      } & EntityLineageV2_BusinessAttribute_Fragment)
    | ({ __typename?: "Chart" } & EntityLineageV2_Chart_Fragment)
    | ({ __typename?: "Container" } & EntityLineageV2_Container_Fragment)
    | ({ __typename?: "CorpGroup" } & EntityLineageV2_CorpGroup_Fragment)
    | ({ __typename?: "CorpUser" } & EntityLineageV2_CorpUser_Fragment)
    | ({ __typename?: "Dashboard" } & EntityLineageV2_Dashboard_Fragment)
    | ({ __typename?: "DataContract" } & EntityLineageV2_DataContract_Fragment)
    | ({ __typename?: "DataFlow" } & EntityLineageV2_DataFlow_Fragment)
    | ({
        __typename?: "DataHubConnection";
      } & EntityLineageV2_DataHubConnection_Fragment)
    | ({ __typename?: "DataHubFile" } & EntityLineageV2_DataHubFile_Fragment)
    | ({
        __typename?: "DataHubPageModule";
      } & EntityLineageV2_DataHubPageModule_Fragment)
    | ({
        __typename?: "DataHubPageTemplate";
      } & EntityLineageV2_DataHubPageTemplate_Fragment)
    | ({
        __typename?: "DataHubPolicy";
      } & EntityLineageV2_DataHubPolicy_Fragment)
    | ({ __typename?: "DataHubRole" } & EntityLineageV2_DataHubRole_Fragment)
    | ({ __typename?: "DataHubView" } & EntityLineageV2_DataHubView_Fragment)
    | ({ __typename?: "DataJob" } & EntityLineageV2_DataJob_Fragment)
    | ({ __typename?: "DataPlatform" } & EntityLineageV2_DataPlatform_Fragment)
    | ({
        __typename?: "DataPlatformInstance";
      } & EntityLineageV2_DataPlatformInstance_Fragment)
    | ({
        __typename?: "DataProcessInstance";
      } & EntityLineageV2_DataProcessInstance_Fragment)
    | ({ __typename?: "DataProduct" } & EntityLineageV2_DataProduct_Fragment)
    | ({
        __typename?: "DataTypeEntity";
      } & EntityLineageV2_DataTypeEntity_Fragment)
    | ({ __typename?: "Dataset" } & EntityLineageV2_Dataset_Fragment)
    | ({ __typename?: "Domain" } & EntityLineageV2_Domain_Fragment)
    | ({
        __typename?: "ERModelRelationship";
      } & EntityLineageV2_ErModelRelationship_Fragment)
    | ({
        __typename?: "EntityTypeEntity";
      } & EntityLineageV2_EntityTypeEntity_Fragment)
    | ({
        __typename?: "ExecutionRequest";
      } & EntityLineageV2_ExecutionRequest_Fragment)
    | ({ __typename?: "Form" } & EntityLineageV2_Form_Fragment)
    | ({ __typename?: "GlossaryNode" } & EntityLineageV2_GlossaryNode_Fragment)
    | ({ __typename?: "GlossaryTerm" } & EntityLineageV2_GlossaryTerm_Fragment)
    | ({ __typename?: "Incident" } & EntityLineageV2_Incident_Fragment)
    | ({ __typename?: "MLFeature" } & EntityLineageV2_MlFeature_Fragment)
    | ({
        __typename?: "MLFeatureTable";
      } & EntityLineageV2_MlFeatureTable_Fragment)
    | ({ __typename?: "MLModel" } & EntityLineageV2_MlModel_Fragment)
    | ({ __typename?: "MLModelGroup" } & EntityLineageV2_MlModelGroup_Fragment)
    | ({ __typename?: "MLPrimaryKey" } & EntityLineageV2_MlPrimaryKey_Fragment)
    | ({ __typename?: "Notebook" } & EntityLineageV2_Notebook_Fragment)
    | ({
        __typename?: "OwnershipTypeEntity";
      } & EntityLineageV2_OwnershipTypeEntity_Fragment)
    | ({ __typename?: "Post" } & EntityLineageV2_Post_Fragment)
    | ({ __typename?: "QueryEntity" } & EntityLineageV2_QueryEntity_Fragment)
    | ({ __typename?: "Restricted" } & EntityLineageV2_Restricted_Fragment)
    | ({ __typename?: "Role" } & EntityLineageV2_Role_Fragment)
    | ({
        __typename?: "SchemaFieldEntity";
      } & EntityLineageV2_SchemaFieldEntity_Fragment)
    | ({
        __typename?: "StructuredPropertyEntity";
      } & EntityLineageV2_StructuredPropertyEntity_Fragment)
    | ({ __typename?: "Tag" } & EntityLineageV2_Tag_Fragment)
    | ({ __typename?: "Test" } & EntityLineageV2_Test_Fragment)
    | ({ __typename?: "VersionSet" } & EntityLineageV2_VersionSet_Fragment)
    | ({
        __typename?: "VersionedDataset";
      } & EntityLineageV2_VersionedDataset_Fragment)
  >;
};

export type GetBulkEntityLineageV2QueryVariables = Types.Exact<{
  urns: Array<Types.Scalars["String"]> | Types.Scalars["String"];
  separateSiblings?: Types.Maybe<Types.Scalars["Boolean"]>;
  showColumns: Types.Scalars["Boolean"];
  startTimeMillis?: Types.Maybe<Types.Scalars["Long"]>;
  endTimeMillis?: Types.Maybe<Types.Scalars["Long"]>;
  excludeUpstream?: Types.Maybe<Types.Scalars["Boolean"]>;
  excludeDownstream?: Types.Maybe<Types.Scalars["Boolean"]>;
  includeGhostEntities?: Types.Maybe<Types.Scalars["Boolean"]>;
}>;

export type GetBulkEntityLineageV2Query = { __typename?: "Query" } & {
  entities?: Types.Maybe<
    Array<
      Types.Maybe<
        | ({
            __typename?: "AccessTokenMetadata";
          } & EntityLineageV2_AccessTokenMetadata_Fragment)
        | ({
            __typename?: "Application";
          } & EntityLineageV2_Application_Fragment)
        | ({ __typename?: "Assertion" } & EntityLineageV2_Assertion_Fragment)
        | ({
            __typename?: "BusinessAttribute";
          } & EntityLineageV2_BusinessAttribute_Fragment)
        | ({ __typename?: "Chart" } & EntityLineageV2_Chart_Fragment)
        | ({ __typename?: "Container" } & EntityLineageV2_Container_Fragment)
        | ({ __typename?: "CorpGroup" } & EntityLineageV2_CorpGroup_Fragment)
        | ({ __typename?: "CorpUser" } & EntityLineageV2_CorpUser_Fragment)
        | ({ __typename?: "Dashboard" } & EntityLineageV2_Dashboard_Fragment)
        | ({
            __typename?: "DataContract";
          } & EntityLineageV2_DataContract_Fragment)
        | ({ __typename?: "DataFlow" } & EntityLineageV2_DataFlow_Fragment)
        | ({
            __typename?: "DataHubConnection";
          } & EntityLineageV2_DataHubConnection_Fragment)
        | ({
            __typename?: "DataHubFile";
          } & EntityLineageV2_DataHubFile_Fragment)
        | ({
            __typename?: "DataHubPageModule";
          } & EntityLineageV2_DataHubPageModule_Fragment)
        | ({
            __typename?: "DataHubPageTemplate";
          } & EntityLineageV2_DataHubPageTemplate_Fragment)
        | ({
            __typename?: "DataHubPolicy";
          } & EntityLineageV2_DataHubPolicy_Fragment)
        | ({
            __typename?: "DataHubRole";
          } & EntityLineageV2_DataHubRole_Fragment)
        | ({
            __typename?: "DataHubView";
          } & EntityLineageV2_DataHubView_Fragment)
        | ({ __typename?: "DataJob" } & EntityLineageV2_DataJob_Fragment)
        | ({
            __typename?: "DataPlatform";
          } & EntityLineageV2_DataPlatform_Fragment)
        | ({
            __typename?: "DataPlatformInstance";
          } & EntityLineageV2_DataPlatformInstance_Fragment)
        | ({
            __typename?: "DataProcessInstance";
          } & EntityLineageV2_DataProcessInstance_Fragment)
        | ({
            __typename?: "DataProduct";
          } & EntityLineageV2_DataProduct_Fragment)
        | ({
            __typename?: "DataTypeEntity";
          } & EntityLineageV2_DataTypeEntity_Fragment)
        | ({ __typename?: "Dataset" } & EntityLineageV2_Dataset_Fragment)
        | ({ __typename?: "Domain" } & EntityLineageV2_Domain_Fragment)
        | ({
            __typename?: "ERModelRelationship";
          } & EntityLineageV2_ErModelRelationship_Fragment)
        | ({
            __typename?: "EntityTypeEntity";
          } & EntityLineageV2_EntityTypeEntity_Fragment)
        | ({
            __typename?: "ExecutionRequest";
          } & EntityLineageV2_ExecutionRequest_Fragment)
        | ({ __typename?: "Form" } & EntityLineageV2_Form_Fragment)
        | ({
            __typename?: "GlossaryNode";
          } & EntityLineageV2_GlossaryNode_Fragment)
        | ({
            __typename?: "GlossaryTerm";
          } & EntityLineageV2_GlossaryTerm_Fragment)
        | ({ __typename?: "Incident" } & EntityLineageV2_Incident_Fragment)
        | ({ __typename?: "MLFeature" } & EntityLineageV2_MlFeature_Fragment)
        | ({
            __typename?: "MLFeatureTable";
          } & EntityLineageV2_MlFeatureTable_Fragment)
        | ({ __typename?: "MLModel" } & EntityLineageV2_MlModel_Fragment)
        | ({
            __typename?: "MLModelGroup";
          } & EntityLineageV2_MlModelGroup_Fragment)
        | ({
            __typename?: "MLPrimaryKey";
          } & EntityLineageV2_MlPrimaryKey_Fragment)
        | ({ __typename?: "Notebook" } & EntityLineageV2_Notebook_Fragment)
        | ({
            __typename?: "OwnershipTypeEntity";
          } & EntityLineageV2_OwnershipTypeEntity_Fragment)
        | ({ __typename?: "Post" } & EntityLineageV2_Post_Fragment)
        | ({
            __typename?: "QueryEntity";
          } & EntityLineageV2_QueryEntity_Fragment)
        | ({ __typename?: "Restricted" } & EntityLineageV2_Restricted_Fragment)
        | ({ __typename?: "Role" } & EntityLineageV2_Role_Fragment)
        | ({
            __typename?: "SchemaFieldEntity";
          } & EntityLineageV2_SchemaFieldEntity_Fragment)
        | ({
            __typename?: "StructuredPropertyEntity";
          } & EntityLineageV2_StructuredPropertyEntity_Fragment)
        | ({ __typename?: "Tag" } & EntityLineageV2_Tag_Fragment)
        | ({ __typename?: "Test" } & EntityLineageV2_Test_Fragment)
        | ({ __typename?: "VersionSet" } & EntityLineageV2_VersionSet_Fragment)
        | ({
            __typename?: "VersionedDataset";
          } & EntityLineageV2_VersionedDataset_Fragment)
      >
    >
  >;
};

export type CanEditLineageFragment_Assertion_Fragment = {
  __typename?: "Assertion";
};

export type CanEditLineageFragment_Chart_Fragment = { __typename?: "Chart" } & {
  privileges?: Types.Maybe<
    { __typename?: "EntityPrivileges" } & Pick<
      Types.EntityPrivileges,
      "canEditLineage"
    >
  >;
};

export type CanEditLineageFragment_Dashboard_Fragment = {
  __typename?: "Dashboard";
} & {
  privileges?: Types.Maybe<
    { __typename?: "EntityPrivileges" } & Pick<
      Types.EntityPrivileges,
      "canEditLineage"
    >
  >;
};

export type CanEditLineageFragment_DataFlow_Fragment = {
  __typename?: "DataFlow";
};

export type CanEditLineageFragment_DataJob_Fragment = {
  __typename?: "DataJob";
} & {
  privileges?: Types.Maybe<
    { __typename?: "EntityPrivileges" } & Pick<
      Types.EntityPrivileges,
      "canEditLineage"
    >
  >;
};

export type CanEditLineageFragment_DataProcessInstance_Fragment = {
  __typename?: "DataProcessInstance";
};

export type CanEditLineageFragment_Dataset_Fragment = {
  __typename?: "Dataset";
} & {
  privileges?: Types.Maybe<
    { __typename?: "EntityPrivileges" } & Pick<
      Types.EntityPrivileges,
      "canEditLineage"
    >
  >;
};

export type CanEditLineageFragment_ErModelRelationship_Fragment = {
  __typename?: "ERModelRelationship";
};

export type CanEditLineageFragment_MlFeature_Fragment = {
  __typename?: "MLFeature";
};

export type CanEditLineageFragment_MlFeatureTable_Fragment = {
  __typename?: "MLFeatureTable";
};

export type CanEditLineageFragment_MlModel_Fragment = {
  __typename?: "MLModel";
};

export type CanEditLineageFragment_MlModelGroup_Fragment = {
  __typename?: "MLModelGroup";
};

export type CanEditLineageFragment_MlPrimaryKey_Fragment = {
  __typename?: "MLPrimaryKey";
};

export type CanEditLineageFragment_Restricted_Fragment = {
  __typename?: "Restricted";
};

export type CanEditLineageFragment_SchemaFieldEntity_Fragment = {
  __typename?: "SchemaFieldEntity";
};

export type CanEditLineageFragmentFragment =
  | CanEditLineageFragment_Assertion_Fragment
  | CanEditLineageFragment_Chart_Fragment
  | CanEditLineageFragment_Dashboard_Fragment
  | CanEditLineageFragment_DataFlow_Fragment
  | CanEditLineageFragment_DataJob_Fragment
  | CanEditLineageFragment_DataProcessInstance_Fragment
  | CanEditLineageFragment_Dataset_Fragment
  | CanEditLineageFragment_ErModelRelationship_Fragment
  | CanEditLineageFragment_MlFeature_Fragment
  | CanEditLineageFragment_MlFeatureTable_Fragment
  | CanEditLineageFragment_MlModel_Fragment
  | CanEditLineageFragment_MlModelGroup_Fragment
  | CanEditLineageFragment_MlPrimaryKey_Fragment
  | CanEditLineageFragment_Restricted_Fragment
  | CanEditLineageFragment_SchemaFieldEntity_Fragment;

export type GetLineageCountsQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  separateSiblings?: Types.Maybe<Types.Scalars["Boolean"]>;
  startTimeMillis?: Types.Maybe<Types.Scalars["Long"]>;
  endTimeMillis?: Types.Maybe<Types.Scalars["Long"]>;
  excludeUpstream?: Types.Maybe<Types.Scalars["Boolean"]>;
  excludeDownstream?: Types.Maybe<Types.Scalars["Boolean"]>;
  includeGhostEntities?: Types.Maybe<Types.Scalars["Boolean"]>;
}>;

export type GetLineageCountsQuery = { __typename?: "Query" } & {
  entity?: Types.Maybe<
    | ({ __typename?: "AccessTokenMetadata" } & Pick<
        Types.AccessTokenMetadata,
        "urn" | "type"
      >)
    | ({ __typename?: "Application" } & Pick<Types.Application, "urn" | "type">)
    | ({ __typename?: "Assertion" } & Pick<Types.Assertion, "urn" | "type"> & {
          upstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
          downstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
        })
    | ({ __typename?: "BusinessAttribute" } & Pick<
        Types.BusinessAttribute,
        "urn" | "type"
      >)
    | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type"> & {
          upstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
          downstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
        })
    | ({ __typename?: "Container" } & Pick<Types.Container, "urn" | "type">)
    | ({ __typename?: "CorpGroup" } & Pick<Types.CorpGroup, "urn" | "type">)
    | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type">)
    | ({ __typename?: "Dashboard" } & Pick<Types.Dashboard, "urn" | "type"> & {
          upstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
          downstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
        })
    | ({ __typename?: "DataContract" } & Pick<
        Types.DataContract,
        "urn" | "type"
      >)
    | ({ __typename?: "DataFlow" } & Pick<Types.DataFlow, "urn" | "type"> & {
          upstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
          downstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
        })
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
    | ({ __typename?: "DataJob" } & Pick<Types.DataJob, "urn" | "type"> & {
          upstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
          downstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
        })
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
      > & {
          upstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
          downstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
        })
    | ({ __typename?: "DataProduct" } & Pick<Types.DataProduct, "urn" | "type">)
    | ({ __typename?: "DataTypeEntity" } & Pick<
        Types.DataTypeEntity,
        "urn" | "type"
      >)
    | ({ __typename?: "Dataset" } & Pick<Types.Dataset, "urn" | "type"> & {
          upstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
          downstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
        })
    | ({ __typename?: "Domain" } & Pick<Types.Domain, "urn" | "type">)
    | ({ __typename?: "ERModelRelationship" } & Pick<
        Types.ErModelRelationship,
        "urn" | "type"
      > & {
          upstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
          downstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
        })
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
    | ({ __typename?: "MLFeature" } & Pick<Types.MlFeature, "urn" | "type"> & {
          upstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
          downstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
        })
    | ({ __typename?: "MLFeatureTable" } & Pick<
        Types.MlFeatureTable,
        "urn" | "type"
      > & {
          upstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
          downstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
        })
    | ({ __typename?: "MLModel" } & Pick<Types.MlModel, "urn" | "type"> & {
          upstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
          downstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
        })
    | ({ __typename?: "MLModelGroup" } & Pick<
        Types.MlModelGroup,
        "urn" | "type"
      > & {
          upstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
          downstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
        })
    | ({ __typename?: "MLPrimaryKey" } & Pick<
        Types.MlPrimaryKey,
        "urn" | "type"
      > & {
          upstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
          downstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
        })
    | ({ __typename?: "Notebook" } & Pick<Types.Notebook, "urn" | "type">)
    | ({ __typename?: "OwnershipTypeEntity" } & Pick<
        Types.OwnershipTypeEntity,
        "urn" | "type"
      >)
    | ({ __typename?: "Post" } & Pick<Types.Post, "urn" | "type">)
    | ({ __typename?: "QueryEntity" } & Pick<Types.QueryEntity, "urn" | "type">)
    | ({ __typename?: "Restricted" } & Pick<
        Types.Restricted,
        "urn" | "type"
      > & {
          upstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
          downstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
        })
    | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type">)
    | ({ __typename?: "SchemaFieldEntity" } & Pick<
        Types.SchemaFieldEntity,
        "urn" | "type"
      > & {
          upstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
          downstream?: Types.Maybe<
            { __typename?: "EntityLineageResult" } & Pick<
              Types.EntityLineageResult,
              "filtered" | "total"
            >
          >;
        })
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

export type GetSearchAcrossLineageCountsQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  startTimeMillis?: Types.Maybe<Types.Scalars["Long"]>;
  endTimeMillis?: Types.Maybe<Types.Scalars["Long"]>;
  excludeUpstream?: Types.Maybe<Types.Scalars["Boolean"]>;
  excludeDownstream?: Types.Maybe<Types.Scalars["Boolean"]>;
}>;

export type GetSearchAcrossLineageCountsQuery = { __typename?: "Query" } & {
  upstreams?: Types.Maybe<
    { __typename?: "SearchAcrossLineageResults" } & Pick<
      Types.SearchAcrossLineageResults,
      "start" | "count" | "total"
    > & {
        facets?: Types.Maybe<
          Array<{ __typename?: "FacetMetadata" } & FacetFieldsFragment>
        >;
      }
  >;
  downstreams?: Types.Maybe<
    { __typename?: "SearchAcrossLineageResults" } & Pick<
      Types.SearchAcrossLineageResults,
      "start" | "count" | "total"
    > & {
        facets?: Types.Maybe<
          Array<{ __typename?: "FacetMetadata" } & FacetFieldsFragment>
        >;
      }
  >;
};

export type SearchAcrossLineageNamesQueryVariables = Types.Exact<{
  input: Types.SearchAcrossLineageInput;
}>;

export type SearchAcrossLineageNamesQuery = { __typename?: "Query" } & {
  searchAcrossLineage?: Types.Maybe<
    { __typename?: "SearchAcrossLineageResults" } & Pick<
      Types.SearchAcrossLineageResults,
      "start" | "count" | "total"
    > & {
        searchResults: Array<
          { __typename?: "SearchAcrossLineageResult" } & {
            entity:
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
              | ({ __typename?: "Assertion" } & Pick<
                  Types.Assertion,
                  "urn" | "type"
                > &
                  EntityDisplayNameFields_Assertion_Fragment)
              | ({ __typename?: "BusinessAttribute" } & Pick<
                  Types.BusinessAttribute,
                  "urn" | "type"
                > &
                  EntityDisplayNameFields_BusinessAttribute_Fragment)
              | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type"> &
                  EntityDisplayNameFields_Chart_Fragment)
              | ({ __typename?: "Container" } & Pick<
                  Types.Container,
                  "urn" | "type"
                > &
                  EntityDisplayNameFields_Container_Fragment)
              | ({ __typename?: "CorpGroup" } & Pick<
                  Types.CorpGroup,
                  "urn" | "type"
                > &
                  EntityDisplayNameFields_CorpGroup_Fragment)
              | ({ __typename?: "CorpUser" } & Pick<
                  Types.CorpUser,
                  "urn" | "type"
                > &
                  EntityDisplayNameFields_CorpUser_Fragment)
              | ({ __typename?: "Dashboard" } & Pick<
                  Types.Dashboard,
                  "urn" | "type"
                > &
                  EntityDisplayNameFields_Dashboard_Fragment)
              | ({ __typename?: "DataContract" } & Pick<
                  Types.DataContract,
                  "urn" | "type"
                > &
                  EntityDisplayNameFields_DataContract_Fragment)
              | ({ __typename?: "DataFlow" } & Pick<
                  Types.DataFlow,
                  "urn" | "type"
                > &
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
              | ({ __typename?: "DataJob" } & Pick<
                  Types.DataJob,
                  "urn" | "type"
                > &
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
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                > &
                  EntityDisplayNameFields_Dataset_Fragment)
              | ({ __typename?: "Domain" } & Pick<
                  Types.Domain,
                  "urn" | "type"
                > &
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
              | ({ __typename?: "Incident" } & Pick<
                  Types.Incident,
                  "urn" | "type"
                > &
                  EntityDisplayNameFields_Incident_Fragment)
              | ({ __typename?: "MLFeature" } & Pick<
                  Types.MlFeature,
                  "urn" | "type"
                > &
                  EntityDisplayNameFields_MlFeature_Fragment)
              | ({ __typename?: "MLFeatureTable" } & Pick<
                  Types.MlFeatureTable,
                  "urn" | "type"
                > &
                  EntityDisplayNameFields_MlFeatureTable_Fragment)
              | ({ __typename?: "MLModel" } & Pick<
                  Types.MlModel,
                  "urn" | "type"
                > &
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
              | ({ __typename?: "Notebook" } & Pick<
                  Types.Notebook,
                  "urn" | "type"
                > &
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
          }
        >;
      }
  >;
};

export const PartialLineageResultsFragmentDoc = gql`
  fragment partialLineageResults on EntityLineageResult {
    start
    count
    total
    filtered
  }
`;
export const LineageNodePropertiesFragmentDoc = gql`
  fragment lineageNodeProperties on EntityWithRelationships {
    urn
    type
    ... on DataJob {
      urn
      type
      exists
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
        customProperties {
          key
          value
        }
      }
      globalTags {
        ...globalTagsFields
      }
      glossaryTerms {
        ...glossaryTerms
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
      editableProperties {
        description
      }
      status {
        removed
      }
      inputOutput {
        fineGrainedLineages {
          upstreams {
            urn
            path
          }
          downstreams {
            urn
            path
          }
          query
          transformOperation
        }
      }
      health {
        ...entityHealth
      }
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
      browsePathV2 {
        ...browsePathV2Fields
      }
      lastRun: runs(start: 0, count: 1) {
        count
        start
        total
        runs {
          urn
          type
          properties {
            created {
              time
              actor
            }
          }
          state(startTimeMillis: null, endTimeMillis: null, limit: 1) {
            status
            attempt
            result {
              resultType
              nativeResultType
            }
            timestampMillis
            durationMillis
          }
        }
      }
    }
    ... on DataFlow {
      exists
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
      status {
        removed
      }
      deprecation {
        ...deprecationFields
      }
      health {
        ...entityHealth
      }
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
      browsePathV2 {
        ...browsePathV2Fields
      }
    }
    ... on Dashboard {
      exists
      urn
      type
      tool
      dashboardId
      properties {
        name
        description
        externalUrl
        lastRefreshed
        created {
          time
        }
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
      platform {
        ...platformFields
      }
      domain {
        ...entityDomain
      }
      ...entityDataProduct
      parentContainers {
        ...parentContainersFields
      }
      browsePathV2 {
        ...browsePathV2Fields
      }
      status {
        removed
      }
      deprecation {
        ...deprecationFields
      }
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
      editableProperties {
        description
      }
      status {
        removed
      }
      subTypes {
        typeNames
      }
      health {
        ...entityHealth
      }
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
    }
    ... on Chart {
      exists
      tool
      chartId
      properties {
        name
        description
      }
      editableProperties {
        description
      }
      ownership {
        ...ownershipFields
      }
      platform {
        ...platformFields
      }
      domain {
        ...entityDomain
      }
      parentContainers {
        ...parentContainersFields
      }
      browsePathV2 {
        ...browsePathV2Fields
      }
      ...entityDataProduct
      status {
        removed
      }
      subTypes {
        typeNames
      }
      deprecation {
        ...deprecationFields
      }
      health {
        ...entityHealth
      }
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
    }
    ... on Dataset {
      exists
      name
      properties {
        name
        description
        qualifiedName
      }
      editableProperties {
        description
      }
      platform {
        ...platformFields
      }
      ownership {
        ...ownershipFields
      }
      parentContainers {
        ...parentContainersFields
      }
      browsePathV2 {
        ...browsePathV2Fields
      }
      subTypes {
        typeNames
      }
      status {
        removed
      }
      fineGrainedLineages {
        upstreams {
          urn
          path
        }
        downstreams {
          urn
          path
        }
        query
        transformOperation
      }
      health {
        ...entityHealth
      }
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
    }
    ... on MLModelGroup {
      exists
      urn
      type
      name
      description
      origin
      tags {
        ...globalTagsFields
      }
      platform {
        ...platformFields
      }
      ownership {
        ...ownershipFields
      }
      status {
        removed
      }
      browsePathV2 {
        ...browsePathV2Fields
        ...browsePathV2Fields
      }
      properties {
        propertiesName: name
        createdTS: created {
          time
          actor
        }
        customProperties {
          key
          value
        }
      }
      editableProperties {
        description
      }
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
      browsePathV2 {
        ...browsePathV2Fields
      }
    }
    ... on MLModel {
      exists
      urn
      type
      name
      description
      origin
      tags {
        ...globalTagsFields
      }
      platform {
        ...platformFields
      }
      ownership {
        ...ownershipFields
      }
      status {
        removed
      }
      versionProperties {
        versionSet {
          urn
          type
        }
        version {
          versionTag
        }
        aliases {
          versionTag
        }
        comment
      }
      properties {
        propertiesName: name
        createdTS: created {
          time
          actor
        }
        tags
        customProperties {
          key
          value
        }
      }
      editableProperties {
        description
      }
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
      browsePathV2 {
        ...browsePathV2Fields
      }
    }
    ... on MLFeatureTable {
      ...nonRecursiveMLFeatureTable
    }
    ... on MLFeature {
      ...nonRecursiveMLFeature
    }
    ... on MLPrimaryKey {
      ...nonRecursiveMLPrimaryKey
    }
    ... on ERModelRelationship {
      urn
      type
      id
      properties {
        ...ermodelrelationPropertiesFields
      }
      editableProperties {
        ...ermodelrelationEditablePropertiesFields
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
    }
    ... on Restricted {
      urn
      type
    }
    ... on DataProcessInstance {
      ...dataProcessInstanceFields
    }
  }
  ${NonRecursiveDataFlowFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityDataProductFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${EntityHealthFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${BrowsePathV2FieldsFragmentDoc}
  ${PlatformFieldsFragmentDoc}
  ${ParentContainersFieldsFragmentDoc}
  ${NonRecursiveMlFeatureTableFragmentDoc}
  ${NonRecursiveMlFeatureFragmentDoc}
  ${NonRecursiveMlPrimaryKeyFragmentDoc}
  ${ErmodelrelationPropertiesFieldsFragmentDoc}
  ${ErmodelrelationEditablePropertiesFieldsFragmentDoc}
  ${DataProcessInstanceFieldsFragmentDoc}
`;
export const CanEditLineageFragmentFragmentDoc = gql`
  fragment canEditLineageFragment on EntityWithRelationships {
    ... on Dataset {
      privileges {
        canEditLineage
      }
    }
    ... on Chart {
      privileges {
        canEditLineage
      }
    }
    ... on Dashboard {
      privileges {
        canEditLineage
      }
    }
    ... on DataJob {
      privileges {
        canEditLineage
      }
    }
  }
`;
export const LineageRelationshipFieldsFragmentDoc = gql`
  fragment lineageRelationshipFields on LineageRelationship {
    type
    createdOn
    createdActor {
      urn
      type
      ... on CorpUser {
        username
        info {
          displayName
        }
        properties {
          displayName
        }
        editableProperties {
          displayName
        }
      }
    }
    updatedOn
    updatedActor {
      urn
      type
      ... on CorpUser {
        username
        info {
          displayName
        }
        properties {
          displayName
        }
        editableProperties {
          displayName
        }
      }
    }
    isManual
  }
`;
export const LeafLineageResultsFragmentDoc = gql`
  fragment leafLineageResults on EntityLineageResult {
    start
    count
    total
    filtered
    relationships {
      ...lineageRelationshipFields
      entity {
        urn
        type
      }
    }
  }
  ${LineageRelationshipFieldsFragmentDoc}
`;
export const LineageFieldsFragmentDoc = gql`
  fragment lineageFields on EntityWithRelationships {
    ...lineageNodeProperties
    ...canEditLineageFragment
    ... on Dataset {
      siblings {
        isPrimary
        siblings {
          urn
          type
          ... on Dataset {
            exists
          }
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
            ... on Dataset {
              exists
            }
            ...lineageNodeProperties
          }
        }
      }
    }
    upstream: lineage(
      input: {
        direction: UPSTREAM
        start: 0
        count: 100
        separateSiblings: $separateSiblings
      }
    ) {
      ...leafLineageResults
    }
    downstream: lineage(
      input: {
        direction: DOWNSTREAM
        start: 0
        count: 100
        separateSiblings: $separateSiblings
      }
    ) {
      ...leafLineageResults
    }
  }
  ${LineageNodePropertiesFragmentDoc}
  ${CanEditLineageFragmentFragmentDoc}
  ${LeafLineageResultsFragmentDoc}
`;
export const FullLineageResultsFragmentDoc = gql`
  fragment fullLineageResults on EntityLineageResult {
    start
    count
    total
    filtered
    relationships {
      ...lineageRelationshipFields
      entity {
        ...lineageFields
        ... on Dataset {
          schemaMetadata(version: 0) @include(if: $showColumns) {
            ...schemaMetadataFields
          }
        }
        ... on Chart {
          inputFields @include(if: $showColumns) {
            ...inputFieldsFields
          }
        }
      }
    }
  }
  ${LineageRelationshipFieldsFragmentDoc}
  ${LineageFieldsFragmentDoc}
  ${SchemaMetadataFieldsFragmentDoc}
  ${InputFieldsFieldsFragmentDoc}
`;
export const EntityLineageFragmentDoc = gql`
  fragment entityLineage on Entity {
    urn
    type
    ...lineageNodeProperties
    ...canEditLineageFragment
    ... on Dataset {
      schemaMetadata(version: 0) @include(if: $showColumns) {
        ...schemaMetadataFields
      }
      siblings {
        isPrimary
        siblings {
          urn
          type
          ... on Dataset {
            exists
          }
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
            ... on Dataset {
              exists
            }
            ...lineageNodeProperties
          }
        }
      }
    }
    ... on Chart {
      inputFields @include(if: $showColumns) {
        ...inputFieldsFields
      }
    }
    ... on EntityWithRelationships {
      upstream: lineage(
        input: {
          direction: UPSTREAM
          start: 0
          count: 100
          separateSiblings: $separateSiblings
          startTimeMillis: $startTimeMillis
          endTimeMillis: $endTimeMillis
        }
      ) @skip(if: $excludeUpstream) {
        ...fullLineageResults
      }
      downstream: lineage(
        input: {
          direction: DOWNSTREAM
          start: 0
          count: 100
          separateSiblings: $separateSiblings
          startTimeMillis: $startTimeMillis
          endTimeMillis: $endTimeMillis
        }
      ) @skip(if: $excludeDownstream) {
        ...fullLineageResults
      }
    }
  }
  ${LineageNodePropertiesFragmentDoc}
  ${CanEditLineageFragmentFragmentDoc}
  ${SchemaMetadataFieldsFragmentDoc}
  ${InputFieldsFieldsFragmentDoc}
  ${FullLineageResultsFragmentDoc}
`;
export const LineageSchemaFieldFragmentDoc = gql`
  fragment lineageSchemaField on SchemaField {
    fieldPath
    type
    nativeDataType
  }
`;
export const LineageV2ResultFragmentDoc = gql`
  fragment lineageV2Result on EntityLineageResult {
    filtered
    total
    relationships {
      ...lineageRelationshipFields
      paths {
        path {
          urn
          type
        }
      }
      entity {
        urn
        type
      }
    }
  }
  ${LineageRelationshipFieldsFragmentDoc}
`;
export const EntityLineageV2FragmentDoc = gql`
  fragment entityLineageV2 on Entity {
    urn
    type
    ...lineageNodeProperties
    ...canEditLineageFragment
    ... on Dataset {
      schemaMetadata(version: 0) @include(if: $showColumns) {
        fields {
          ...lineageSchemaField
        }
      }
      siblingsSearch(input: { query: "*", count: 1 }) {
        count
        total
        searchResults {
          entity {
            urn
            type
            ... on Dataset {
              exists
              subTypes {
                typeNames
              }
              platform {
                ...platformFields
              }
            }
          }
        }
      }
    }
    ... on Chart {
      inputFields @include(if: $showColumns) {
        fields {
          schemaFieldUrn
          schemaField {
            ...lineageSchemaField
          }
        }
      }
    }
    ... on EntityWithRelationships {
      upstream: lineage(
        input: {
          direction: UPSTREAM
          start: 0
          count: 1000
          separateSiblings: $separateSiblings
          startTimeMillis: $startTimeMillis
          endTimeMillis: $endTimeMillis
          includeGhostEntities: $includeGhostEntities
        }
      ) @skip(if: $excludeUpstream) {
        ...lineageV2Result
      }
      downstream: lineage(
        input: {
          direction: DOWNSTREAM
          start: 0
          count: 1000
          separateSiblings: $separateSiblings
          startTimeMillis: $startTimeMillis
          endTimeMillis: $endTimeMillis
          includeGhostEntities: $includeGhostEntities
        }
      ) @skip(if: $excludeDownstream) {
        ...lineageV2Result
      }
    }
    ... on SupportsVersions {
      versionProperties {
        ...versionProperties
      }
    }
    ... on SchemaFieldEntity {
      fieldPath
      parent {
        urn
        type
        ...lineageNodeProperties
      }
      status {
        removed
      }
    }
    ... on QueryEntity {
      properties {
        origin {
          urn
          type
        }
      }
      queryPlatform: platform {
        ...platformFields
      }
    }
    ... on DataProcessInstance {
      ...dataProcessInstanceFields
    }
    ... on Domain {
      id
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
      dataProducts: entities(
        input: {
          start: 0
          count: 0
          filters: [{ field: "_entityType", value: "DATA_PRODUCT" }]
        }
      ) {
        total
        searchResults {
          entity {
            ... on DataProduct {
              urn
              type
              properties {
                name
                description
              }
              domain {
                ...entityDomain
              }
              entities(input: { start: 0, count: 0, query: "*" }) {
                total
              }
            }
          }
        }
      }
    }
    ... on DataProduct {
      properties {
        name
        description
      }
      domain {
        ...entityDomain
      }
      entities(input: { start: 0, count: 0, query: "*" }) {
        total
      }
    }
  }
  ${LineageNodePropertiesFragmentDoc}
  ${CanEditLineageFragmentFragmentDoc}
  ${LineageSchemaFieldFragmentDoc}
  ${PlatformFieldsFragmentDoc}
  ${LineageV2ResultFragmentDoc}
  ${VersionPropertiesFragmentDoc}
  ${DataProcessInstanceFieldsFragmentDoc}
  ${ParentDomainsFieldsFragmentDoc}
  ${DisplayPropertiesFieldsFragmentDoc}
  ${EntityDomainFragmentDoc}
`;
export const GetEntityLineageDocument = gql`
  query getEntityLineage(
    $urn: String!
    $separateSiblings: Boolean
    $showColumns: Boolean!
    $startTimeMillis: Long
    $endTimeMillis: Long
    $excludeUpstream: Boolean = false
    $excludeDownstream: Boolean = false
  ) {
    entity(urn: $urn) {
      ...entityLineage
    }
  }
  ${EntityLineageFragmentDoc}
`;

/**
 * __useGetEntityLineageQuery__
 *
 * To run a query within a React component, call `useGetEntityLineageQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetEntityLineageQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetEntityLineageQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      separateSiblings: // value for 'separateSiblings'
 *      showColumns: // value for 'showColumns'
 *      startTimeMillis: // value for 'startTimeMillis'
 *      endTimeMillis: // value for 'endTimeMillis'
 *      excludeUpstream: // value for 'excludeUpstream'
 *      excludeDownstream: // value for 'excludeDownstream'
 *   },
 * });
 */
export function useGetEntityLineageQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetEntityLineageQuery,
    GetEntityLineageQueryVariables
  >,
) {
  return Apollo.useQuery<GetEntityLineageQuery, GetEntityLineageQueryVariables>(
    GetEntityLineageDocument,
    baseOptions,
  );
}
export function useGetEntityLineageLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetEntityLineageQuery,
    GetEntityLineageQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetEntityLineageQuery,
    GetEntityLineageQueryVariables
  >(GetEntityLineageDocument, baseOptions);
}
export type GetEntityLineageQueryHookResult = ReturnType<
  typeof useGetEntityLineageQuery
>;
export type GetEntityLineageLazyQueryHookResult = ReturnType<
  typeof useGetEntityLineageLazyQuery
>;
export type GetEntityLineageQueryResult = Apollo.QueryResult<
  GetEntityLineageQuery,
  GetEntityLineageQueryVariables
>;
export const GetEntityLineageV2Document = gql`
  query getEntityLineageV2(
    $urn: String!
    $separateSiblings: Boolean
    $showColumns: Boolean!
    $startTimeMillis: Long
    $endTimeMillis: Long
    $excludeUpstream: Boolean = false
    $excludeDownstream: Boolean = false
    $includeGhostEntities: Boolean = false
  ) {
    entity(urn: $urn) {
      ...entityLineageV2
    }
  }
  ${EntityLineageV2FragmentDoc}
`;

/**
 * __useGetEntityLineageV2Query__
 *
 * To run a query within a React component, call `useGetEntityLineageV2Query` and pass it any options that fit your needs.
 * When your component renders, `useGetEntityLineageV2Query` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetEntityLineageV2Query({
 *   variables: {
 *      urn: // value for 'urn'
 *      separateSiblings: // value for 'separateSiblings'
 *      showColumns: // value for 'showColumns'
 *      startTimeMillis: // value for 'startTimeMillis'
 *      endTimeMillis: // value for 'endTimeMillis'
 *      excludeUpstream: // value for 'excludeUpstream'
 *      excludeDownstream: // value for 'excludeDownstream'
 *      includeGhostEntities: // value for 'includeGhostEntities'
 *   },
 * });
 */
export function useGetEntityLineageV2Query(
  baseOptions: Apollo.QueryHookOptions<
    GetEntityLineageV2Query,
    GetEntityLineageV2QueryVariables
  >,
) {
  return Apollo.useQuery<
    GetEntityLineageV2Query,
    GetEntityLineageV2QueryVariables
  >(GetEntityLineageV2Document, baseOptions);
}
export function useGetEntityLineageV2LazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetEntityLineageV2Query,
    GetEntityLineageV2QueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetEntityLineageV2Query,
    GetEntityLineageV2QueryVariables
  >(GetEntityLineageV2Document, baseOptions);
}
export type GetEntityLineageV2QueryHookResult = ReturnType<
  typeof useGetEntityLineageV2Query
>;
export type GetEntityLineageV2LazyQueryHookResult = ReturnType<
  typeof useGetEntityLineageV2LazyQuery
>;
export type GetEntityLineageV2QueryResult = Apollo.QueryResult<
  GetEntityLineageV2Query,
  GetEntityLineageV2QueryVariables
>;
export const GetBulkEntityLineageV2Document = gql`
  query getBulkEntityLineageV2(
    $urns: [String!]!
    $separateSiblings: Boolean
    $showColumns: Boolean!
    $startTimeMillis: Long
    $endTimeMillis: Long
    $excludeUpstream: Boolean = false
    $excludeDownstream: Boolean = false
    $includeGhostEntities: Boolean = false
  ) {
    entities(urns: $urns) {
      ...entityLineageV2
    }
  }
  ${EntityLineageV2FragmentDoc}
`;

/**
 * __useGetBulkEntityLineageV2Query__
 *
 * To run a query within a React component, call `useGetBulkEntityLineageV2Query` and pass it any options that fit your needs.
 * When your component renders, `useGetBulkEntityLineageV2Query` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetBulkEntityLineageV2Query({
 *   variables: {
 *      urns: // value for 'urns'
 *      separateSiblings: // value for 'separateSiblings'
 *      showColumns: // value for 'showColumns'
 *      startTimeMillis: // value for 'startTimeMillis'
 *      endTimeMillis: // value for 'endTimeMillis'
 *      excludeUpstream: // value for 'excludeUpstream'
 *      excludeDownstream: // value for 'excludeDownstream'
 *      includeGhostEntities: // value for 'includeGhostEntities'
 *   },
 * });
 */
export function useGetBulkEntityLineageV2Query(
  baseOptions: Apollo.QueryHookOptions<
    GetBulkEntityLineageV2Query,
    GetBulkEntityLineageV2QueryVariables
  >,
) {
  return Apollo.useQuery<
    GetBulkEntityLineageV2Query,
    GetBulkEntityLineageV2QueryVariables
  >(GetBulkEntityLineageV2Document, baseOptions);
}
export function useGetBulkEntityLineageV2LazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetBulkEntityLineageV2Query,
    GetBulkEntityLineageV2QueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetBulkEntityLineageV2Query,
    GetBulkEntityLineageV2QueryVariables
  >(GetBulkEntityLineageV2Document, baseOptions);
}
export type GetBulkEntityLineageV2QueryHookResult = ReturnType<
  typeof useGetBulkEntityLineageV2Query
>;
export type GetBulkEntityLineageV2LazyQueryHookResult = ReturnType<
  typeof useGetBulkEntityLineageV2LazyQuery
>;
export type GetBulkEntityLineageV2QueryResult = Apollo.QueryResult<
  GetBulkEntityLineageV2Query,
  GetBulkEntityLineageV2QueryVariables
>;
export const GetLineageCountsDocument = gql`
  query getLineageCounts(
    $urn: String!
    $separateSiblings: Boolean
    $startTimeMillis: Long
    $endTimeMillis: Long
    $excludeUpstream: Boolean = false
    $excludeDownstream: Boolean = false
    $includeGhostEntities: Boolean = false
  ) {
    entity(urn: $urn) {
      urn
      type
      ... on EntityWithRelationships {
        upstream: lineage(
          input: {
            direction: UPSTREAM
            start: 0
            count: 100
            separateSiblings: $separateSiblings
            startTimeMillis: $startTimeMillis
            endTimeMillis: $endTimeMillis
            includeGhostEntities: $includeGhostEntities
          }
        ) @skip(if: $excludeUpstream) {
          filtered
          total
        }
        downstream: lineage(
          input: {
            direction: DOWNSTREAM
            start: 0
            count: 100
            separateSiblings: $separateSiblings
            startTimeMillis: $startTimeMillis
            endTimeMillis: $endTimeMillis
            includeGhostEntities: $includeGhostEntities
          }
        ) @skip(if: $excludeDownstream) {
          filtered
          total
        }
      }
    }
  }
`;

/**
 * __useGetLineageCountsQuery__
 *
 * To run a query within a React component, call `useGetLineageCountsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetLineageCountsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetLineageCountsQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      separateSiblings: // value for 'separateSiblings'
 *      startTimeMillis: // value for 'startTimeMillis'
 *      endTimeMillis: // value for 'endTimeMillis'
 *      excludeUpstream: // value for 'excludeUpstream'
 *      excludeDownstream: // value for 'excludeDownstream'
 *      includeGhostEntities: // value for 'includeGhostEntities'
 *   },
 * });
 */
export function useGetLineageCountsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetLineageCountsQuery,
    GetLineageCountsQueryVariables
  >,
) {
  return Apollo.useQuery<GetLineageCountsQuery, GetLineageCountsQueryVariables>(
    GetLineageCountsDocument,
    baseOptions,
  );
}
export function useGetLineageCountsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetLineageCountsQuery,
    GetLineageCountsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetLineageCountsQuery,
    GetLineageCountsQueryVariables
  >(GetLineageCountsDocument, baseOptions);
}
export type GetLineageCountsQueryHookResult = ReturnType<
  typeof useGetLineageCountsQuery
>;
export type GetLineageCountsLazyQueryHookResult = ReturnType<
  typeof useGetLineageCountsLazyQuery
>;
export type GetLineageCountsQueryResult = Apollo.QueryResult<
  GetLineageCountsQuery,
  GetLineageCountsQueryVariables
>;
export const GetSearchAcrossLineageCountsDocument = gql`
  query getSearchAcrossLineageCounts(
    $urn: String!
    $startTimeMillis: Long
    $endTimeMillis: Long
    $excludeUpstream: Boolean = false
    $excludeDownstream: Boolean = false
  ) {
    upstreams: searchAcrossLineage(
      input: {
        urn: $urn
        query: "*"
        start: 0
        count: 2000
        filters: [{ field: "degree", value: "1", values: ["1"] }]
        direction: UPSTREAM
        lineageFlags: {
          startTimeMillis: $startTimeMillis
          endTimeMillis: $endTimeMillis
        }
      }
    ) @skip(if: $excludeUpstream) {
      start
      count
      total
      facets {
        ...facetFields
      }
    }
    downstreams: searchAcrossLineage(
      input: {
        urn: $urn
        query: "*"
        start: 0
        count: 2000
        filters: [{ field: "degree", value: "1", values: ["1"] }]
        direction: DOWNSTREAM
        lineageFlags: {
          startTimeMillis: $startTimeMillis
          endTimeMillis: $endTimeMillis
        }
      }
    ) @skip(if: $excludeDownstream) {
      start
      count
      total
      facets {
        ...facetFields
      }
    }
  }
  ${FacetFieldsFragmentDoc}
`;

/**
 * __useGetSearchAcrossLineageCountsQuery__
 *
 * To run a query within a React component, call `useGetSearchAcrossLineageCountsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetSearchAcrossLineageCountsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetSearchAcrossLineageCountsQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      startTimeMillis: // value for 'startTimeMillis'
 *      endTimeMillis: // value for 'endTimeMillis'
 *      excludeUpstream: // value for 'excludeUpstream'
 *      excludeDownstream: // value for 'excludeDownstream'
 *   },
 * });
 */
export function useGetSearchAcrossLineageCountsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetSearchAcrossLineageCountsQuery,
    GetSearchAcrossLineageCountsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetSearchAcrossLineageCountsQuery,
    GetSearchAcrossLineageCountsQueryVariables
  >(GetSearchAcrossLineageCountsDocument, baseOptions);
}
export function useGetSearchAcrossLineageCountsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetSearchAcrossLineageCountsQuery,
    GetSearchAcrossLineageCountsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetSearchAcrossLineageCountsQuery,
    GetSearchAcrossLineageCountsQueryVariables
  >(GetSearchAcrossLineageCountsDocument, baseOptions);
}
export type GetSearchAcrossLineageCountsQueryHookResult = ReturnType<
  typeof useGetSearchAcrossLineageCountsQuery
>;
export type GetSearchAcrossLineageCountsLazyQueryHookResult = ReturnType<
  typeof useGetSearchAcrossLineageCountsLazyQuery
>;
export type GetSearchAcrossLineageCountsQueryResult = Apollo.QueryResult<
  GetSearchAcrossLineageCountsQuery,
  GetSearchAcrossLineageCountsQueryVariables
>;
export const SearchAcrossLineageNamesDocument = gql`
  query searchAcrossLineageNames($input: SearchAcrossLineageInput!) {
    searchAcrossLineage(input: $input) {
      start
      count
      total
      searchResults {
        entity {
          urn
          type
          ...entityDisplayNameFields
        }
      }
    }
  }
  ${EntityDisplayNameFieldsFragmentDoc}
`;

/**
 * __useSearchAcrossLineageNamesQuery__
 *
 * To run a query within a React component, call `useSearchAcrossLineageNamesQuery` and pass it any options that fit your needs.
 * When your component renders, `useSearchAcrossLineageNamesQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useSearchAcrossLineageNamesQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useSearchAcrossLineageNamesQuery(
  baseOptions: Apollo.QueryHookOptions<
    SearchAcrossLineageNamesQuery,
    SearchAcrossLineageNamesQueryVariables
  >,
) {
  return Apollo.useQuery<
    SearchAcrossLineageNamesQuery,
    SearchAcrossLineageNamesQueryVariables
  >(SearchAcrossLineageNamesDocument, baseOptions);
}
export function useSearchAcrossLineageNamesLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    SearchAcrossLineageNamesQuery,
    SearchAcrossLineageNamesQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    SearchAcrossLineageNamesQuery,
    SearchAcrossLineageNamesQueryVariables
  >(SearchAcrossLineageNamesDocument, baseOptions);
}
export type SearchAcrossLineageNamesQueryHookResult = ReturnType<
  typeof useSearchAcrossLineageNamesQuery
>;
export type SearchAcrossLineageNamesLazyQueryHookResult = ReturnType<
  typeof useSearchAcrossLineageNamesLazyQuery
>;
export type SearchAcrossLineageNamesQueryResult = Apollo.QueryResult<
  SearchAcrossLineageNamesQuery,
  SearchAcrossLineageNamesQueryVariables
>;
