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
import { DataProductSearchFieldsFragment } from "./dataProduct.generated";
import { ApplicationSearchFieldsFragment } from "./application.generated";
import { BusinessAttributeFieldsFragment } from "./businessAttribute.generated";
import { VersionPropertiesFragment } from "./versioning.generated";
import { DataProcessInstanceFieldsFragment } from "./dataProcessInstance.generated";
import { IncidentFieldsFragment } from "./incident.generated";
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
import { DataProductSearchFieldsFragmentDoc } from "./dataProduct.generated";
import { ApplicationSearchFieldsFragmentDoc } from "./application.generated";
import { BusinessAttributeFieldsFragmentDoc } from "./businessAttribute.generated";
import { VersionPropertiesFragmentDoc } from "./versioning.generated";
import { DataProcessInstanceFieldsFragmentDoc } from "./dataProcessInstance.generated";
import { IncidentFieldsFragmentDoc } from "./incident.generated";
import * as Apollo from "@apollo/client";
export type AutoCompleteFields_AccessTokenMetadata_Fragment = {
  __typename?: "AccessTokenMetadata";
} & Pick<Types.AccessTokenMetadata, "urn" | "type">;

export type AutoCompleteFields_Application_Fragment = {
  __typename?: "Application";
} & Pick<Types.Application, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "ApplicationProperties" } & Pick<
        Types.ApplicationProperties,
        "name"
      >
    >;
  };

export type AutoCompleteFields_Assertion_Fragment = {
  __typename?: "Assertion";
} & Pick<Types.Assertion, "urn" | "type">;

export type AutoCompleteFields_BusinessAttribute_Fragment = {
  __typename?: "BusinessAttribute";
} & Pick<Types.BusinessAttribute, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "BusinessAttributeInfo" } & Pick<
        Types.BusinessAttributeInfo,
        "name" | "description"
      >
    >;
  };

export type AutoCompleteFields_Chart_Fragment = { __typename?: "Chart" } & Pick<
  Types.Chart,
  "chartId" | "urn" | "type"
> & {
    properties?: Types.Maybe<
      { __typename?: "ChartProperties" } & Pick<Types.ChartProperties, "name">
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
    >;
  };

export type AutoCompleteFields_Container_Fragment = {
  __typename?: "Container";
} & Pick<Types.Container, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "ContainerProperties" } & Pick<
        Types.ContainerProperties,
        "name"
      >
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
    >;
  };

export type AutoCompleteFields_CorpGroup_Fragment = {
  __typename?: "CorpGroup";
} & Pick<Types.CorpGroup, "name" | "urn" | "type"> & {
    info?: Types.Maybe<
      { __typename?: "CorpGroupInfo" } & Pick<
        Types.CorpGroupInfo,
        "displayName"
      >
    >;
  };

export type AutoCompleteFields_CorpUser_Fragment = {
  __typename?: "CorpUser";
} & Pick<Types.CorpUser, "username" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "CorpUserProperties" } & Pick<
        Types.CorpUserProperties,
        "displayName" | "title" | "firstName" | "lastName" | "fullName"
      >
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "CorpUserEditableProperties" } & Pick<
        Types.CorpUserEditableProperties,
        "displayName" | "pictureLink"
      >
    >;
  };

export type AutoCompleteFields_Dashboard_Fragment = {
  __typename?: "Dashboard";
} & Pick<Types.Dashboard, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "DashboardProperties" } & Pick<
        Types.DashboardProperties,
        "name"
      >
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
    >;
  };

export type AutoCompleteFields_DataContract_Fragment = {
  __typename?: "DataContract";
} & Pick<Types.DataContract, "urn" | "type">;

export type AutoCompleteFields_DataFlow_Fragment = {
  __typename?: "DataFlow";
} & Pick<Types.DataFlow, "orchestrator" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "DataFlowProperties" } & Pick<
        Types.DataFlowProperties,
        "name"
      >
    >;
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
  };

export type AutoCompleteFields_DataHubConnection_Fragment = {
  __typename?: "DataHubConnection";
} & Pick<Types.DataHubConnection, "urn" | "type">;

export type AutoCompleteFields_DataHubFile_Fragment = {
  __typename?: "DataHubFile";
} & Pick<Types.DataHubFile, "urn" | "type">;

export type AutoCompleteFields_DataHubPageModule_Fragment = {
  __typename?: "DataHubPageModule";
} & Pick<Types.DataHubPageModule, "urn" | "type">;

export type AutoCompleteFields_DataHubPageTemplate_Fragment = {
  __typename?: "DataHubPageTemplate";
} & Pick<Types.DataHubPageTemplate, "urn" | "type">;

export type AutoCompleteFields_DataHubPolicy_Fragment = {
  __typename?: "DataHubPolicy";
} & Pick<Types.DataHubPolicy, "urn" | "type">;

export type AutoCompleteFields_DataHubRole_Fragment = {
  __typename?: "DataHubRole";
} & Pick<Types.DataHubRole, "urn" | "type">;

export type AutoCompleteFields_DataHubView_Fragment = {
  __typename?: "DataHubView";
} & Pick<Types.DataHubView, "urn" | "type">;

export type AutoCompleteFields_DataJob_Fragment = {
  __typename?: "DataJob";
} & Pick<Types.DataJob, "jobId" | "urn" | "type"> & {
    dataFlow?: Types.Maybe<
      { __typename?: "DataFlow" } & Pick<Types.DataFlow, "orchestrator"> & {
          platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
          dataPlatformInstance?: Types.Maybe<
            {
              __typename?: "DataPlatformInstance";
            } & DataPlatformInstanceFieldsFragment
          >;
        }
    >;
    properties?: Types.Maybe<
      { __typename?: "DataJobProperties" } & Pick<
        Types.DataJobProperties,
        "name"
      >
    >;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
  };

export type AutoCompleteFields_DataPlatform_Fragment = {
  __typename?: "DataPlatform";
} & Pick<Types.DataPlatform, "urn" | "type"> &
  NonConflictingPlatformFieldsFragment;

export type AutoCompleteFields_DataPlatformInstance_Fragment = {
  __typename?: "DataPlatformInstance";
} & Pick<Types.DataPlatformInstance, "urn" | "type"> &
  DataPlatformInstanceFieldsFragment;

export type AutoCompleteFields_DataProcessInstance_Fragment = {
  __typename?: "DataProcessInstance";
} & Pick<Types.DataProcessInstance, "urn" | "type">;

export type AutoCompleteFields_DataProduct_Fragment = {
  __typename?: "DataProduct";
} & Pick<Types.DataProduct, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "DataProductProperties" } & Pick<
        Types.DataProductProperties,
        "name"
      >
    >;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & {
        domain: { __typename?: "Domain" } & Pick<
          Types.Domain,
          "urn" | "type"
        > & {
            properties?: Types.Maybe<
              { __typename?: "DomainProperties" } & Pick<
                Types.DomainProperties,
                "name"
              >
            >;
            parentDomains?: Types.Maybe<
              {
                __typename?: "ParentDomainsResult";
              } & ParentDomainsFieldsFragment
            >;
          };
      }
    >;
  };

export type AutoCompleteFields_DataTypeEntity_Fragment = {
  __typename?: "DataTypeEntity";
} & Pick<Types.DataTypeEntity, "urn" | "type">;

export type AutoCompleteFields_Dataset_Fragment = {
  __typename?: "Dataset";
} & Pick<Types.Dataset, "exists" | "name" | "urn" | "type"> & {
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    properties?: Types.Maybe<
      { __typename?: "DatasetProperties" } & Pick<
        Types.DatasetProperties,
        "name" | "qualifiedName"
      > & {
          lastModified: { __typename?: "AuditStamp" } & Pick<
            Types.AuditStamp,
            "time" | "actor"
          >;
        }
    >;
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
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
                    "exists" | "name" | "urn" | "type"
                  > & {
                      platform: {
                        __typename?: "DataPlatform";
                      } & PlatformFieldsFragment;
                      parentContainers?: Types.Maybe<
                        {
                          __typename?: "ParentContainersResult";
                        } & ParentContainersFieldsFragment
                      >;
                      properties?: Types.Maybe<
                        { __typename?: "DatasetProperties" } & Pick<
                          Types.DatasetProperties,
                          | "name"
                          | "description"
                          | "qualifiedName"
                          | "externalUrl"
                        > & {
                            lastModified: { __typename?: "AuditStamp" } & Pick<
                              Types.AuditStamp,
                              "time" | "actor"
                            >;
                          }
                      >;
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
                    "exists" | "name" | "urn" | "type"
                  > & {
                      platform: {
                        __typename?: "DataPlatform";
                      } & PlatformFieldsFragment;
                      parentContainers?: Types.Maybe<
                        {
                          __typename?: "ParentContainersResult";
                        } & ParentContainersFieldsFragment
                      >;
                      properties?: Types.Maybe<
                        { __typename?: "DatasetProperties" } & Pick<
                          Types.DatasetProperties,
                          | "name"
                          | "description"
                          | "qualifiedName"
                          | "externalUrl"
                        > & {
                            lastModified: { __typename?: "AuditStamp" } & Pick<
                              Types.AuditStamp,
                              "time" | "actor"
                            >;
                          }
                      >;
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
    access?: Types.Maybe<{ __typename?: "Access" } & GetAccessFragment>;
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
    >;
  } & DatasetStatsFieldsFragment;

export type AutoCompleteFields_Domain_Fragment = {
  __typename?: "Domain";
} & Pick<Types.Domain, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "DomainProperties" } & Pick<Types.DomainProperties, "name">
    >;
    parentDomains?: Types.Maybe<
      { __typename?: "ParentDomainsResult" } & ParentDomainsFieldsFragment
    >;
    displayProperties?: Types.Maybe<
      { __typename?: "DisplayProperties" } & DisplayPropertiesFieldsFragment
    >;
  };

export type AutoCompleteFields_ErModelRelationship_Fragment = {
  __typename?: "ERModelRelationship";
} & Pick<Types.ErModelRelationship, "urn" | "type">;

export type AutoCompleteFields_EntityTypeEntity_Fragment = {
  __typename?: "EntityTypeEntity";
} & Pick<Types.EntityTypeEntity, "urn" | "type">;

export type AutoCompleteFields_ExecutionRequest_Fragment = {
  __typename?: "ExecutionRequest";
} & Pick<Types.ExecutionRequest, "urn" | "type">;

export type AutoCompleteFields_Form_Fragment = { __typename?: "Form" } & Pick<
  Types.Form,
  "urn" | "type"
>;

export type AutoCompleteFields_GlossaryNode_Fragment = {
  __typename?: "GlossaryNode";
} & Pick<Types.GlossaryNode, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "GlossaryNodeProperties" } & Pick<
        Types.GlossaryNodeProperties,
        "name"
      >
    >;
  };

export type AutoCompleteFields_GlossaryTerm_Fragment = {
  __typename?: "GlossaryTerm";
} & Pick<Types.GlossaryTerm, "name" | "hierarchicalName" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "GlossaryTermProperties" } & Pick<
        Types.GlossaryTermProperties,
        "name"
      >
    >;
    parentNodes?: Types.Maybe<
      { __typename?: "ParentNodesResult" } & ParentNodesFieldsFragment
    >;
  };

export type AutoCompleteFields_Incident_Fragment = {
  __typename?: "Incident";
} & Pick<Types.Incident, "urn" | "type">;

export type AutoCompleteFields_MlFeature_Fragment = {
  __typename?: "MLFeature";
} & Pick<Types.MlFeature, "name" | "urn" | "type"> & {
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    featureTables?: Types.Maybe<
      { __typename?: "EntityRelationshipsResult" } & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & {
            entity?: Types.Maybe<
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
              | { __typename?: "Domain" }
              | { __typename?: "ERModelRelationship" }
              | { __typename?: "EntityTypeEntity" }
              | { __typename?: "ExecutionRequest" }
              | { __typename?: "Form" }
              | { __typename?: "GlossaryNode" }
              | { __typename?: "GlossaryTerm" }
              | { __typename?: "Incident" }
              | { __typename?: "MLFeature" }
              | ({ __typename?: "MLFeatureTable" } & {
                  platform: {
                    __typename?: "DataPlatform";
                  } & PlatformFieldsFragment;
                })
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
      }
    >;
  };

export type AutoCompleteFields_MlFeatureTable_Fragment = {
  __typename?: "MLFeatureTable";
} & Pick<Types.MlFeatureTable, "name" | "urn" | "type"> & {
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
  };

export type AutoCompleteFields_MlModel_Fragment = {
  __typename?: "MLModel";
} & Pick<Types.MlModel, "name" | "urn" | "type"> & {
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
  };

export type AutoCompleteFields_MlModelGroup_Fragment = {
  __typename?: "MLModelGroup";
} & Pick<Types.MlModelGroup, "name" | "urn" | "type"> & {
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
  };

export type AutoCompleteFields_MlPrimaryKey_Fragment = {
  __typename?: "MLPrimaryKey";
} & Pick<Types.MlPrimaryKey, "name" | "urn" | "type"> & {
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    featureTables?: Types.Maybe<
      { __typename?: "EntityRelationshipsResult" } & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & {
            entity?: Types.Maybe<
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
              | { __typename?: "Domain" }
              | { __typename?: "ERModelRelationship" }
              | { __typename?: "EntityTypeEntity" }
              | { __typename?: "ExecutionRequest" }
              | { __typename?: "Form" }
              | { __typename?: "GlossaryNode" }
              | { __typename?: "GlossaryTerm" }
              | { __typename?: "Incident" }
              | { __typename?: "MLFeature" }
              | ({ __typename?: "MLFeatureTable" } & {
                  platform: {
                    __typename?: "DataPlatform";
                  } & PlatformFieldsFragment;
                })
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
      }
    >;
  };

export type AutoCompleteFields_Notebook_Fragment = {
  __typename?: "Notebook";
} & Pick<Types.Notebook, "urn" | "type">;

export type AutoCompleteFields_OwnershipTypeEntity_Fragment = {
  __typename?: "OwnershipTypeEntity";
} & Pick<Types.OwnershipTypeEntity, "urn" | "type">;

export type AutoCompleteFields_Post_Fragment = { __typename?: "Post" } & Pick<
  Types.Post,
  "urn" | "type"
>;

export type AutoCompleteFields_QueryEntity_Fragment = {
  __typename?: "QueryEntity";
} & Pick<Types.QueryEntity, "urn" | "type">;

export type AutoCompleteFields_Restricted_Fragment = {
  __typename?: "Restricted";
} & Pick<Types.Restricted, "urn" | "type">;

export type AutoCompleteFields_Role_Fragment = { __typename?: "Role" } & Pick<
  Types.Role,
  "id" | "urn" | "type"
> & {
    properties?: Types.Maybe<
      { __typename?: "RoleProperties" } & Pick<
        Types.RoleProperties,
        "name" | "description"
      >
    >;
  };

export type AutoCompleteFields_SchemaFieldEntity_Fragment = {
  __typename?: "SchemaFieldEntity";
} & Pick<Types.SchemaFieldEntity, "fieldPath" | "urn" | "type"> & {
    parent:
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
      | ({ __typename?: "Dataset" } & Pick<Types.Dataset, "urn" | "type"> & {
            platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
          } & EntityDisplayNameFields_Dataset_Fragment)
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
  };

export type AutoCompleteFields_StructuredPropertyEntity_Fragment = {
  __typename?: "StructuredPropertyEntity";
} & Pick<Types.StructuredPropertyEntity, "urn" | "type">;

export type AutoCompleteFields_Tag_Fragment = { __typename?: "Tag" } & Pick<
  Types.Tag,
  "name" | "urn" | "type"
> & {
    properties?: Types.Maybe<
      { __typename?: "TagProperties" } & Pick<
        Types.TagProperties,
        "name" | "colorHex"
      >
    >;
  };

export type AutoCompleteFields_Test_Fragment = { __typename?: "Test" } & Pick<
  Types.Test,
  "urn" | "type"
>;

export type AutoCompleteFields_VersionSet_Fragment = {
  __typename?: "VersionSet";
} & Pick<Types.VersionSet, "urn" | "type">;

export type AutoCompleteFields_VersionedDataset_Fragment = {
  __typename?: "VersionedDataset";
} & Pick<Types.VersionedDataset, "urn" | "type">;

export type AutoCompleteFieldsFragment =
  | AutoCompleteFields_AccessTokenMetadata_Fragment
  | AutoCompleteFields_Application_Fragment
  | AutoCompleteFields_Assertion_Fragment
  | AutoCompleteFields_BusinessAttribute_Fragment
  | AutoCompleteFields_Chart_Fragment
  | AutoCompleteFields_Container_Fragment
  | AutoCompleteFields_CorpGroup_Fragment
  | AutoCompleteFields_CorpUser_Fragment
  | AutoCompleteFields_Dashboard_Fragment
  | AutoCompleteFields_DataContract_Fragment
  | AutoCompleteFields_DataFlow_Fragment
  | AutoCompleteFields_DataHubConnection_Fragment
  | AutoCompleteFields_DataHubFile_Fragment
  | AutoCompleteFields_DataHubPageModule_Fragment
  | AutoCompleteFields_DataHubPageTemplate_Fragment
  | AutoCompleteFields_DataHubPolicy_Fragment
  | AutoCompleteFields_DataHubRole_Fragment
  | AutoCompleteFields_DataHubView_Fragment
  | AutoCompleteFields_DataJob_Fragment
  | AutoCompleteFields_DataPlatform_Fragment
  | AutoCompleteFields_DataPlatformInstance_Fragment
  | AutoCompleteFields_DataProcessInstance_Fragment
  | AutoCompleteFields_DataProduct_Fragment
  | AutoCompleteFields_DataTypeEntity_Fragment
  | AutoCompleteFields_Dataset_Fragment
  | AutoCompleteFields_Domain_Fragment
  | AutoCompleteFields_ErModelRelationship_Fragment
  | AutoCompleteFields_EntityTypeEntity_Fragment
  | AutoCompleteFields_ExecutionRequest_Fragment
  | AutoCompleteFields_Form_Fragment
  | AutoCompleteFields_GlossaryNode_Fragment
  | AutoCompleteFields_GlossaryTerm_Fragment
  | AutoCompleteFields_Incident_Fragment
  | AutoCompleteFields_MlFeature_Fragment
  | AutoCompleteFields_MlFeatureTable_Fragment
  | AutoCompleteFields_MlModel_Fragment
  | AutoCompleteFields_MlModelGroup_Fragment
  | AutoCompleteFields_MlPrimaryKey_Fragment
  | AutoCompleteFields_Notebook_Fragment
  | AutoCompleteFields_OwnershipTypeEntity_Fragment
  | AutoCompleteFields_Post_Fragment
  | AutoCompleteFields_QueryEntity_Fragment
  | AutoCompleteFields_Restricted_Fragment
  | AutoCompleteFields_Role_Fragment
  | AutoCompleteFields_SchemaFieldEntity_Fragment
  | AutoCompleteFields_StructuredPropertyEntity_Fragment
  | AutoCompleteFields_Tag_Fragment
  | AutoCompleteFields_Test_Fragment
  | AutoCompleteFields_VersionSet_Fragment
  | AutoCompleteFields_VersionedDataset_Fragment;

export type GetAutoCompleteResultsQueryVariables = Types.Exact<{
  input: Types.AutoCompleteInput;
}>;

export type GetAutoCompleteResultsQuery = { __typename?: "Query" } & {
  autoComplete?: Types.Maybe<
    { __typename?: "AutoCompleteResults" } & Pick<
      Types.AutoCompleteResults,
      "query" | "suggestions"
    > & {
        entities: Array<
          | ({
              __typename?: "AccessTokenMetadata";
            } & AutoCompleteFields_AccessTokenMetadata_Fragment)
          | ({
              __typename?: "Application";
            } & AutoCompleteFields_Application_Fragment)
          | ({
              __typename?: "Assertion";
            } & AutoCompleteFields_Assertion_Fragment)
          | ({
              __typename?: "BusinessAttribute";
            } & AutoCompleteFields_BusinessAttribute_Fragment)
          | ({ __typename?: "Chart" } & AutoCompleteFields_Chart_Fragment)
          | ({
              __typename?: "Container";
            } & AutoCompleteFields_Container_Fragment)
          | ({
              __typename?: "CorpGroup";
            } & AutoCompleteFields_CorpGroup_Fragment)
          | ({ __typename?: "CorpUser" } & AutoCompleteFields_CorpUser_Fragment)
          | ({
              __typename?: "Dashboard";
            } & AutoCompleteFields_Dashboard_Fragment)
          | ({
              __typename?: "DataContract";
            } & AutoCompleteFields_DataContract_Fragment)
          | ({ __typename?: "DataFlow" } & AutoCompleteFields_DataFlow_Fragment)
          | ({
              __typename?: "DataHubConnection";
            } & AutoCompleteFields_DataHubConnection_Fragment)
          | ({
              __typename?: "DataHubFile";
            } & AutoCompleteFields_DataHubFile_Fragment)
          | ({
              __typename?: "DataHubPageModule";
            } & AutoCompleteFields_DataHubPageModule_Fragment)
          | ({
              __typename?: "DataHubPageTemplate";
            } & AutoCompleteFields_DataHubPageTemplate_Fragment)
          | ({
              __typename?: "DataHubPolicy";
            } & AutoCompleteFields_DataHubPolicy_Fragment)
          | ({
              __typename?: "DataHubRole";
            } & AutoCompleteFields_DataHubRole_Fragment)
          | ({
              __typename?: "DataHubView";
            } & AutoCompleteFields_DataHubView_Fragment)
          | ({ __typename?: "DataJob" } & AutoCompleteFields_DataJob_Fragment)
          | ({
              __typename?: "DataPlatform";
            } & AutoCompleteFields_DataPlatform_Fragment)
          | ({
              __typename?: "DataPlatformInstance";
            } & AutoCompleteFields_DataPlatformInstance_Fragment)
          | ({
              __typename?: "DataProcessInstance";
            } & AutoCompleteFields_DataProcessInstance_Fragment)
          | ({
              __typename?: "DataProduct";
            } & AutoCompleteFields_DataProduct_Fragment)
          | ({
              __typename?: "DataTypeEntity";
            } & AutoCompleteFields_DataTypeEntity_Fragment)
          | ({ __typename?: "Dataset" } & AutoCompleteFields_Dataset_Fragment)
          | ({ __typename?: "Domain" } & AutoCompleteFields_Domain_Fragment)
          | ({
              __typename?: "ERModelRelationship";
            } & AutoCompleteFields_ErModelRelationship_Fragment)
          | ({
              __typename?: "EntityTypeEntity";
            } & AutoCompleteFields_EntityTypeEntity_Fragment)
          | ({
              __typename?: "ExecutionRequest";
            } & AutoCompleteFields_ExecutionRequest_Fragment)
          | ({ __typename?: "Form" } & AutoCompleteFields_Form_Fragment)
          | ({
              __typename?: "GlossaryNode";
            } & AutoCompleteFields_GlossaryNode_Fragment)
          | ({
              __typename?: "GlossaryTerm";
            } & AutoCompleteFields_GlossaryTerm_Fragment)
          | ({ __typename?: "Incident" } & AutoCompleteFields_Incident_Fragment)
          | ({
              __typename?: "MLFeature";
            } & AutoCompleteFields_MlFeature_Fragment)
          | ({
              __typename?: "MLFeatureTable";
            } & AutoCompleteFields_MlFeatureTable_Fragment)
          | ({ __typename?: "MLModel" } & AutoCompleteFields_MlModel_Fragment)
          | ({
              __typename?: "MLModelGroup";
            } & AutoCompleteFields_MlModelGroup_Fragment)
          | ({
              __typename?: "MLPrimaryKey";
            } & AutoCompleteFields_MlPrimaryKey_Fragment)
          | ({ __typename?: "Notebook" } & AutoCompleteFields_Notebook_Fragment)
          | ({
              __typename?: "OwnershipTypeEntity";
            } & AutoCompleteFields_OwnershipTypeEntity_Fragment)
          | ({ __typename?: "Post" } & AutoCompleteFields_Post_Fragment)
          | ({
              __typename?: "QueryEntity";
            } & AutoCompleteFields_QueryEntity_Fragment)
          | ({
              __typename?: "Restricted";
            } & AutoCompleteFields_Restricted_Fragment)
          | ({ __typename?: "Role" } & AutoCompleteFields_Role_Fragment)
          | ({
              __typename?: "SchemaFieldEntity";
            } & AutoCompleteFields_SchemaFieldEntity_Fragment)
          | ({
              __typename?: "StructuredPropertyEntity";
            } & AutoCompleteFields_StructuredPropertyEntity_Fragment)
          | ({ __typename?: "Tag" } & AutoCompleteFields_Tag_Fragment)
          | ({ __typename?: "Test" } & AutoCompleteFields_Test_Fragment)
          | ({
              __typename?: "VersionSet";
            } & AutoCompleteFields_VersionSet_Fragment)
          | ({
              __typename?: "VersionedDataset";
            } & AutoCompleteFields_VersionedDataset_Fragment)
        >;
      }
  >;
};

export type GetAutoCompleteMultipleResultsQueryVariables = Types.Exact<{
  input: Types.AutoCompleteMultipleInput;
}>;

export type GetAutoCompleteMultipleResultsQuery = { __typename?: "Query" } & {
  autoCompleteForMultiple?: Types.Maybe<
    { __typename?: "AutoCompleteMultipleResults" } & Pick<
      Types.AutoCompleteMultipleResults,
      "query"
    > & {
        suggestions: Array<
          { __typename?: "AutoCompleteResultForEntity" } & Pick<
            Types.AutoCompleteResultForEntity,
            "type" | "suggestions"
          > & {
              entities: Array<
                | ({
                    __typename?: "AccessTokenMetadata";
                  } & AutoCompleteFields_AccessTokenMetadata_Fragment)
                | ({
                    __typename?: "Application";
                  } & AutoCompleteFields_Application_Fragment)
                | ({
                    __typename?: "Assertion";
                  } & AutoCompleteFields_Assertion_Fragment)
                | ({
                    __typename?: "BusinessAttribute";
                  } & AutoCompleteFields_BusinessAttribute_Fragment)
                | ({ __typename?: "Chart" } & AutoCompleteFields_Chart_Fragment)
                | ({
                    __typename?: "Container";
                  } & AutoCompleteFields_Container_Fragment)
                | ({
                    __typename?: "CorpGroup";
                  } & AutoCompleteFields_CorpGroup_Fragment)
                | ({
                    __typename?: "CorpUser";
                  } & AutoCompleteFields_CorpUser_Fragment)
                | ({
                    __typename?: "Dashboard";
                  } & AutoCompleteFields_Dashboard_Fragment)
                | ({
                    __typename?: "DataContract";
                  } & AutoCompleteFields_DataContract_Fragment)
                | ({
                    __typename?: "DataFlow";
                  } & AutoCompleteFields_DataFlow_Fragment)
                | ({
                    __typename?: "DataHubConnection";
                  } & AutoCompleteFields_DataHubConnection_Fragment)
                | ({
                    __typename?: "DataHubFile";
                  } & AutoCompleteFields_DataHubFile_Fragment)
                | ({
                    __typename?: "DataHubPageModule";
                  } & AutoCompleteFields_DataHubPageModule_Fragment)
                | ({
                    __typename?: "DataHubPageTemplate";
                  } & AutoCompleteFields_DataHubPageTemplate_Fragment)
                | ({
                    __typename?: "DataHubPolicy";
                  } & AutoCompleteFields_DataHubPolicy_Fragment)
                | ({
                    __typename?: "DataHubRole";
                  } & AutoCompleteFields_DataHubRole_Fragment)
                | ({
                    __typename?: "DataHubView";
                  } & AutoCompleteFields_DataHubView_Fragment)
                | ({
                    __typename?: "DataJob";
                  } & AutoCompleteFields_DataJob_Fragment)
                | ({
                    __typename?: "DataPlatform";
                  } & AutoCompleteFields_DataPlatform_Fragment)
                | ({
                    __typename?: "DataPlatformInstance";
                  } & AutoCompleteFields_DataPlatformInstance_Fragment)
                | ({
                    __typename?: "DataProcessInstance";
                  } & AutoCompleteFields_DataProcessInstance_Fragment)
                | ({
                    __typename?: "DataProduct";
                  } & AutoCompleteFields_DataProduct_Fragment)
                | ({
                    __typename?: "DataTypeEntity";
                  } & AutoCompleteFields_DataTypeEntity_Fragment)
                | ({
                    __typename?: "Dataset";
                  } & AutoCompleteFields_Dataset_Fragment)
                | ({
                    __typename?: "Domain";
                  } & AutoCompleteFields_Domain_Fragment)
                | ({
                    __typename?: "ERModelRelationship";
                  } & AutoCompleteFields_ErModelRelationship_Fragment)
                | ({
                    __typename?: "EntityTypeEntity";
                  } & AutoCompleteFields_EntityTypeEntity_Fragment)
                | ({
                    __typename?: "ExecutionRequest";
                  } & AutoCompleteFields_ExecutionRequest_Fragment)
                | ({ __typename?: "Form" } & AutoCompleteFields_Form_Fragment)
                | ({
                    __typename?: "GlossaryNode";
                  } & AutoCompleteFields_GlossaryNode_Fragment)
                | ({
                    __typename?: "GlossaryTerm";
                  } & AutoCompleteFields_GlossaryTerm_Fragment)
                | ({
                    __typename?: "Incident";
                  } & AutoCompleteFields_Incident_Fragment)
                | ({
                    __typename?: "MLFeature";
                  } & AutoCompleteFields_MlFeature_Fragment)
                | ({
                    __typename?: "MLFeatureTable";
                  } & AutoCompleteFields_MlFeatureTable_Fragment)
                | ({
                    __typename?: "MLModel";
                  } & AutoCompleteFields_MlModel_Fragment)
                | ({
                    __typename?: "MLModelGroup";
                  } & AutoCompleteFields_MlModelGroup_Fragment)
                | ({
                    __typename?: "MLPrimaryKey";
                  } & AutoCompleteFields_MlPrimaryKey_Fragment)
                | ({
                    __typename?: "Notebook";
                  } & AutoCompleteFields_Notebook_Fragment)
                | ({
                    __typename?: "OwnershipTypeEntity";
                  } & AutoCompleteFields_OwnershipTypeEntity_Fragment)
                | ({ __typename?: "Post" } & AutoCompleteFields_Post_Fragment)
                | ({
                    __typename?: "QueryEntity";
                  } & AutoCompleteFields_QueryEntity_Fragment)
                | ({
                    __typename?: "Restricted";
                  } & AutoCompleteFields_Restricted_Fragment)
                | ({ __typename?: "Role" } & AutoCompleteFields_Role_Fragment)
                | ({
                    __typename?: "SchemaFieldEntity";
                  } & AutoCompleteFields_SchemaFieldEntity_Fragment)
                | ({
                    __typename?: "StructuredPropertyEntity";
                  } & AutoCompleteFields_StructuredPropertyEntity_Fragment)
                | ({ __typename?: "Tag" } & AutoCompleteFields_Tag_Fragment)
                | ({ __typename?: "Test" } & AutoCompleteFields_Test_Fragment)
                | ({
                    __typename?: "VersionSet";
                  } & AutoCompleteFields_VersionSet_Fragment)
                | ({
                    __typename?: "VersionedDataset";
                  } & AutoCompleteFields_VersionedDataset_Fragment)
              >;
            }
        >;
      }
  >;
};

export type GetAccessFragment = { __typename?: "Access" } & {
  roles?: Types.Maybe<
    Array<
      { __typename?: "RoleAssociation" } & {
        role: { __typename?: "Role" } & GetRolesNameFragment;
      }
    >
  >;
};

export type GetRolesNameFragment = { __typename?: "Role" } & Pick<
  Types.Role,
  "urn" | "type" | "id"
> & {
    properties?: Types.Maybe<
      { __typename?: "RoleProperties" } & Pick<
        Types.RoleProperties,
        "name" | "description" | "type"
      >
    >;
  };

export type DatasetStatsFieldsFragment = { __typename?: "Dataset" } & {
  lastProfile?: Types.Maybe<
    Array<
      { __typename?: "DatasetProfile" } & Pick<
        Types.DatasetProfile,
        "rowCount" | "columnCount" | "sizeInBytes" | "timestampMillis"
      >
    >
  >;
  lastOperation?: Types.Maybe<
    Array<
      { __typename?: "Operation" } & Pick<
        Types.Operation,
        "lastUpdatedTimestamp" | "timestampMillis"
      >
    >
  >;
  statsSummary?: Types.Maybe<
    { __typename?: "DatasetStatsSummary" } & Pick<
      Types.DatasetStatsSummary,
      "queryCountLast30Days" | "uniqueUserCountLast30Days"
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
};

export type NonSiblingsDatasetSearchFieldsFragment = {
  __typename?: "Dataset";
} & Pick<
  Types.Dataset,
  "exists" | "name" | "origin" | "uri" | "platformNativeType"
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
        "name" | "description"
      >
    >;
    access?: Types.Maybe<{ __typename?: "Access" } & GetAccessFragment>;
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
          lastModified: { __typename?: "AuditStamp" } & Pick<
            Types.AuditStamp,
            "time" | "actor"
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
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    health?: Types.Maybe<
      Array<{ __typename?: "Health" } & EntityHealthFragment>
    >;
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
  } & DatasetStatsFieldsFragment;

export type SearchResultsWithoutSchemaField_AccessTokenMetadata_Fragment = {
  __typename?: "AccessTokenMetadata";
} & Pick<Types.AccessTokenMetadata, "urn" | "type">;

export type SearchResultsWithoutSchemaField_Application_Fragment = {
  __typename?: "Application";
} & Pick<Types.Application, "urn" | "type"> &
  ApplicationSearchFieldsFragment;

export type SearchResultsWithoutSchemaField_Assertion_Fragment = {
  __typename?: "Assertion";
} & Pick<Types.Assertion, "urn" | "type">;

export type SearchResultsWithoutSchemaField_BusinessAttribute_Fragment = {
  __typename?: "BusinessAttribute";
} & Pick<Types.BusinessAttribute, "urn" | "type"> &
  BusinessAttributeFieldsFragment;

export type SearchResultsWithoutSchemaField_Chart_Fragment = {
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
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
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
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
  };

export type SearchResultsWithoutSchemaField_Container_Fragment = {
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
    entities?: Types.Maybe<
      { __typename?: "SearchResults" } & Pick<Types.SearchResults, "total">
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
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
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
  };

export type SearchResultsWithoutSchemaField_CorpGroup_Fragment = {
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

export type SearchResultsWithoutSchemaField_CorpUser_Fragment = {
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
        | "departmentName"
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
        | "departmentName"
      >
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "CorpUserEditableProperties" } & Pick<
        Types.CorpUserEditableProperties,
        "displayName" | "title" | "pictureLink"
      >
    >;
  };

export type SearchResultsWithoutSchemaField_Dashboard_Fragment = {
  __typename?: "Dashboard";
} & Pick<Types.Dashboard, "tool" | "dashboardId" | "urn" | "type"> & {
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
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
    >;
    statsSummary?: Types.Maybe<
      { __typename?: "DashboardStatsSummary" } & Pick<
        Types.DashboardStatsSummary,
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
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
    >;
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
  };

export type SearchResultsWithoutSchemaField_DataContract_Fragment = {
  __typename?: "DataContract";
} & Pick<Types.DataContract, "urn" | "type">;

export type SearchResultsWithoutSchemaField_DataFlow_Fragment = {
  __typename?: "DataFlow";
} & Pick<
  Types.DataFlow,
  "orchestrator" | "flowId" | "cluster" | "urn" | "type"
> & {
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
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    childJobs?: Types.Maybe<
      { __typename?: "EntityRelationshipsResult" } & Pick<
        Types.EntityRelationshipsResult,
        "total"
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
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
  };

export type SearchResultsWithoutSchemaField_DataHubConnection_Fragment = {
  __typename?: "DataHubConnection";
} & Pick<Types.DataHubConnection, "urn" | "type">;

export type SearchResultsWithoutSchemaField_DataHubFile_Fragment = {
  __typename?: "DataHubFile";
} & Pick<Types.DataHubFile, "urn" | "type">;

export type SearchResultsWithoutSchemaField_DataHubPageModule_Fragment = {
  __typename?: "DataHubPageModule";
} & Pick<Types.DataHubPageModule, "urn" | "type">;

export type SearchResultsWithoutSchemaField_DataHubPageTemplate_Fragment = {
  __typename?: "DataHubPageTemplate";
} & Pick<Types.DataHubPageTemplate, "urn" | "type">;

export type SearchResultsWithoutSchemaField_DataHubPolicy_Fragment = {
  __typename?: "DataHubPolicy";
} & Pick<Types.DataHubPolicy, "urn" | "type">;

export type SearchResultsWithoutSchemaField_DataHubRole_Fragment = {
  __typename?: "DataHubRole";
} & Pick<Types.DataHubRole, "urn" | "type">;

export type SearchResultsWithoutSchemaField_DataHubView_Fragment = {
  __typename?: "DataHubView";
} & Pick<Types.DataHubView, "urn" | "type">;

export type SearchResultsWithoutSchemaField_DataJob_Fragment = {
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
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
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
                    created?: Types.Maybe<
                      { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >
                    >;
                  }
              >
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
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
  };

export type SearchResultsWithoutSchemaField_DataPlatform_Fragment = {
  __typename?: "DataPlatform";
} & Pick<Types.DataPlatform, "urn" | "type"> &
  NonConflictingPlatformFieldsFragment;

export type SearchResultsWithoutSchemaField_DataPlatformInstance_Fragment = {
  __typename?: "DataPlatformInstance";
} & Pick<Types.DataPlatformInstance, "urn" | "type"> & {
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
  } & DataPlatformInstanceFieldsFragment &
  DataPlatformInstanceFieldsFragment;

export type SearchResultsWithoutSchemaField_DataProcessInstance_Fragment = {
  __typename?: "DataProcessInstance";
} & Pick<Types.DataProcessInstance, "urn" | "type"> &
  DataProcessInstanceFieldsFragment;

export type SearchResultsWithoutSchemaField_DataProduct_Fragment = {
  __typename?: "DataProduct";
} & Pick<Types.DataProduct, "urn" | "type"> & {
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
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
  } & DataProductSearchFieldsFragment;

export type SearchResultsWithoutSchemaField_DataTypeEntity_Fragment = {
  __typename?: "DataTypeEntity";
} & Pick<Types.DataTypeEntity, "urn" | "type">;

export type SearchResultsWithoutSchemaField_Dataset_Fragment = {
  __typename?: "Dataset";
} & Pick<Types.Dataset, "urn" | "type"> & {
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
                    } & NonSiblingsDatasetSearchFieldsFragment)
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
                      siblings?: Types.Maybe<
                        { __typename?: "SiblingProperties" } & Pick<
                          Types.SiblingProperties,
                          "isPrimary"
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
                    } & NonSiblingsDatasetSearchFieldsFragment)
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
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
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
    versionProperties?: Types.Maybe<
      { __typename?: "VersionProperties" } & VersionPropertiesFragment
    >;
  } & NonSiblingsDatasetSearchFieldsFragment;

export type SearchResultsWithoutSchemaField_Domain_Fragment = {
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
    parentDomains?: Types.Maybe<
      { __typename?: "ParentDomainsResult" } & ParentDomainsFieldsFragment
    >;
    displayProperties?: Types.Maybe<
      { __typename?: "DisplayProperties" } & DisplayPropertiesFieldsFragment
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
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
  } & DomainEntitiesFieldsFragment;

export type SearchResultsWithoutSchemaField_ErModelRelationship_Fragment = {
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

export type SearchResultsWithoutSchemaField_EntityTypeEntity_Fragment = {
  __typename?: "EntityTypeEntity";
} & Pick<Types.EntityTypeEntity, "urn" | "type">;

export type SearchResultsWithoutSchemaField_ExecutionRequest_Fragment = {
  __typename?: "ExecutionRequest";
} & Pick<Types.ExecutionRequest, "urn" | "type">;

export type SearchResultsWithoutSchemaField_Form_Fragment = {
  __typename?: "Form";
} & Pick<Types.Form, "urn" | "type">;

export type SearchResultsWithoutSchemaField_GlossaryNode_Fragment = {
  __typename?: "GlossaryNode";
} & Pick<Types.GlossaryNode, "urn" | "type"> & {
    parentNodes?: Types.Maybe<
      { __typename?: "ParentNodesResult" } & ParentNodesFieldsFragment
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
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
  } & GlossaryNodeFragment;

export type SearchResultsWithoutSchemaField_GlossaryTerm_Fragment = {
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
          createdOn?: Types.Maybe<
            { __typename?: "ResolvedAuditStamp" } & Pick<
              Types.ResolvedAuditStamp,
              "time"
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
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
  };

export type SearchResultsWithoutSchemaField_Incident_Fragment = {
  __typename?: "Incident";
} & Pick<Types.Incident, "urn" | "type"> &
  IncidentFieldsFragment;

export type SearchResultsWithoutSchemaField_MlFeature_Fragment = {
  __typename?: "MLFeature";
} & Pick<Types.MlFeature, "urn" | "type"> & {
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
  } & NonRecursiveMlFeatureFragment;

export type SearchResultsWithoutSchemaField_MlFeatureTable_Fragment = {
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
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
  };

export type SearchResultsWithoutSchemaField_MlModel_Fragment = {
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
    properties?: Types.Maybe<
      { __typename?: "MLModelProperties" } & {
        propertiesName: Types.MlModelProperties["name"];
      }
    >;
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
    versionProperties?: Types.Maybe<
      { __typename?: "VersionProperties" } & VersionPropertiesFragment
    >;
  };

export type SearchResultsWithoutSchemaField_MlModelGroup_Fragment = {
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
    properties?: Types.Maybe<
      { __typename?: "MLModelGroupProperties" } & {
        propertiesName: Types.MlModelGroupProperties["name"];
      }
    >;
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
  };

export type SearchResultsWithoutSchemaField_MlPrimaryKey_Fragment = {
  __typename?: "MLPrimaryKey";
} & Pick<Types.MlPrimaryKey, "urn" | "type"> & {
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
  } & NonRecursiveMlPrimaryKeyFragment;

export type SearchResultsWithoutSchemaField_Notebook_Fragment = {
  __typename?: "Notebook";
} & Pick<Types.Notebook, "urn" | "type">;

export type SearchResultsWithoutSchemaField_OwnershipTypeEntity_Fragment = {
  __typename?: "OwnershipTypeEntity";
} & Pick<Types.OwnershipTypeEntity, "urn" | "type">;

export type SearchResultsWithoutSchemaField_Post_Fragment = {
  __typename?: "Post";
} & Pick<Types.Post, "urn" | "type">;

export type SearchResultsWithoutSchemaField_QueryEntity_Fragment = {
  __typename?: "QueryEntity";
} & Pick<Types.QueryEntity, "urn" | "type">;

export type SearchResultsWithoutSchemaField_Restricted_Fragment = {
  __typename?: "Restricted";
} & Pick<Types.Restricted, "urn" | "type">;

export type SearchResultsWithoutSchemaField_Role_Fragment = {
  __typename?: "Role";
} & Pick<Types.Role, "id" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "RoleProperties" } & Pick<
        Types.RoleProperties,
        "name" | "description"
      >
    >;
  };

export type SearchResultsWithoutSchemaField_SchemaFieldEntity_Fragment = {
  __typename?: "SchemaFieldEntity";
} & Pick<Types.SchemaFieldEntity, "urn" | "type">;

export type SearchResultsWithoutSchemaField_StructuredPropertyEntity_Fragment =
  { __typename?: "StructuredPropertyEntity" } & Pick<
    Types.StructuredPropertyEntity,
    "urn" | "type"
  > &
    StructuredPropertyFieldsFragment;

export type SearchResultsWithoutSchemaField_Tag_Fragment = {
  __typename?: "Tag";
} & Pick<Types.Tag, "name" | "description" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "TagProperties" } & Pick<
        Types.TagProperties,
        "name" | "colorHex"
      >
    >;
  };

export type SearchResultsWithoutSchemaField_Test_Fragment = {
  __typename?: "Test";
} & Pick<Types.Test, "urn" | "type">;

export type SearchResultsWithoutSchemaField_VersionSet_Fragment = {
  __typename?: "VersionSet";
} & Pick<Types.VersionSet, "urn" | "type">;

export type SearchResultsWithoutSchemaField_VersionedDataset_Fragment = {
  __typename?: "VersionedDataset";
} & Pick<Types.VersionedDataset, "urn" | "type">;

export type SearchResultsWithoutSchemaFieldFragment =
  | SearchResultsWithoutSchemaField_AccessTokenMetadata_Fragment
  | SearchResultsWithoutSchemaField_Application_Fragment
  | SearchResultsWithoutSchemaField_Assertion_Fragment
  | SearchResultsWithoutSchemaField_BusinessAttribute_Fragment
  | SearchResultsWithoutSchemaField_Chart_Fragment
  | SearchResultsWithoutSchemaField_Container_Fragment
  | SearchResultsWithoutSchemaField_CorpGroup_Fragment
  | SearchResultsWithoutSchemaField_CorpUser_Fragment
  | SearchResultsWithoutSchemaField_Dashboard_Fragment
  | SearchResultsWithoutSchemaField_DataContract_Fragment
  | SearchResultsWithoutSchemaField_DataFlow_Fragment
  | SearchResultsWithoutSchemaField_DataHubConnection_Fragment
  | SearchResultsWithoutSchemaField_DataHubFile_Fragment
  | SearchResultsWithoutSchemaField_DataHubPageModule_Fragment
  | SearchResultsWithoutSchemaField_DataHubPageTemplate_Fragment
  | SearchResultsWithoutSchemaField_DataHubPolicy_Fragment
  | SearchResultsWithoutSchemaField_DataHubRole_Fragment
  | SearchResultsWithoutSchemaField_DataHubView_Fragment
  | SearchResultsWithoutSchemaField_DataJob_Fragment
  | SearchResultsWithoutSchemaField_DataPlatform_Fragment
  | SearchResultsWithoutSchemaField_DataPlatformInstance_Fragment
  | SearchResultsWithoutSchemaField_DataProcessInstance_Fragment
  | SearchResultsWithoutSchemaField_DataProduct_Fragment
  | SearchResultsWithoutSchemaField_DataTypeEntity_Fragment
  | SearchResultsWithoutSchemaField_Dataset_Fragment
  | SearchResultsWithoutSchemaField_Domain_Fragment
  | SearchResultsWithoutSchemaField_ErModelRelationship_Fragment
  | SearchResultsWithoutSchemaField_EntityTypeEntity_Fragment
  | SearchResultsWithoutSchemaField_ExecutionRequest_Fragment
  | SearchResultsWithoutSchemaField_Form_Fragment
  | SearchResultsWithoutSchemaField_GlossaryNode_Fragment
  | SearchResultsWithoutSchemaField_GlossaryTerm_Fragment
  | SearchResultsWithoutSchemaField_Incident_Fragment
  | SearchResultsWithoutSchemaField_MlFeature_Fragment
  | SearchResultsWithoutSchemaField_MlFeatureTable_Fragment
  | SearchResultsWithoutSchemaField_MlModel_Fragment
  | SearchResultsWithoutSchemaField_MlModelGroup_Fragment
  | SearchResultsWithoutSchemaField_MlPrimaryKey_Fragment
  | SearchResultsWithoutSchemaField_Notebook_Fragment
  | SearchResultsWithoutSchemaField_OwnershipTypeEntity_Fragment
  | SearchResultsWithoutSchemaField_Post_Fragment
  | SearchResultsWithoutSchemaField_QueryEntity_Fragment
  | SearchResultsWithoutSchemaField_Restricted_Fragment
  | SearchResultsWithoutSchemaField_Role_Fragment
  | SearchResultsWithoutSchemaField_SchemaFieldEntity_Fragment
  | SearchResultsWithoutSchemaField_StructuredPropertyEntity_Fragment
  | SearchResultsWithoutSchemaField_Tag_Fragment
  | SearchResultsWithoutSchemaField_Test_Fragment
  | SearchResultsWithoutSchemaField_VersionSet_Fragment
  | SearchResultsWithoutSchemaField_VersionedDataset_Fragment;

export type SearchResultFieldsNoLineage_AccessTokenMetadata_Fragment = {
  __typename?: "AccessTokenMetadata";
} & SearchResultsWithoutSchemaField_AccessTokenMetadata_Fragment;

export type SearchResultFieldsNoLineage_Application_Fragment = {
  __typename?: "Application";
} & SearchResultsWithoutSchemaField_Application_Fragment;

export type SearchResultFieldsNoLineage_Assertion_Fragment = {
  __typename?: "Assertion";
} & SearchResultsWithoutSchemaField_Assertion_Fragment;

export type SearchResultFieldsNoLineage_BusinessAttribute_Fragment = {
  __typename?: "BusinessAttribute";
} & SearchResultsWithoutSchemaField_BusinessAttribute_Fragment;

export type SearchResultFieldsNoLineage_Chart_Fragment = {
  __typename?: "Chart";
} & SearchResultsWithoutSchemaField_Chart_Fragment;

export type SearchResultFieldsNoLineage_Container_Fragment = {
  __typename?: "Container";
} & SearchResultsWithoutSchemaField_Container_Fragment;

export type SearchResultFieldsNoLineage_CorpGroup_Fragment = {
  __typename?: "CorpGroup";
} & SearchResultsWithoutSchemaField_CorpGroup_Fragment;

export type SearchResultFieldsNoLineage_CorpUser_Fragment = {
  __typename?: "CorpUser";
} & SearchResultsWithoutSchemaField_CorpUser_Fragment;

export type SearchResultFieldsNoLineage_Dashboard_Fragment = {
  __typename?: "Dashboard";
} & SearchResultsWithoutSchemaField_Dashboard_Fragment;

export type SearchResultFieldsNoLineage_DataContract_Fragment = {
  __typename?: "DataContract";
} & SearchResultsWithoutSchemaField_DataContract_Fragment;

export type SearchResultFieldsNoLineage_DataFlow_Fragment = {
  __typename?: "DataFlow";
} & SearchResultsWithoutSchemaField_DataFlow_Fragment;

export type SearchResultFieldsNoLineage_DataHubConnection_Fragment = {
  __typename?: "DataHubConnection";
} & SearchResultsWithoutSchemaField_DataHubConnection_Fragment;

export type SearchResultFieldsNoLineage_DataHubFile_Fragment = {
  __typename?: "DataHubFile";
} & SearchResultsWithoutSchemaField_DataHubFile_Fragment;

export type SearchResultFieldsNoLineage_DataHubPageModule_Fragment = {
  __typename?: "DataHubPageModule";
} & SearchResultsWithoutSchemaField_DataHubPageModule_Fragment;

export type SearchResultFieldsNoLineage_DataHubPageTemplate_Fragment = {
  __typename?: "DataHubPageTemplate";
} & SearchResultsWithoutSchemaField_DataHubPageTemplate_Fragment;

export type SearchResultFieldsNoLineage_DataHubPolicy_Fragment = {
  __typename?: "DataHubPolicy";
} & SearchResultsWithoutSchemaField_DataHubPolicy_Fragment;

export type SearchResultFieldsNoLineage_DataHubRole_Fragment = {
  __typename?: "DataHubRole";
} & SearchResultsWithoutSchemaField_DataHubRole_Fragment;

export type SearchResultFieldsNoLineage_DataHubView_Fragment = {
  __typename?: "DataHubView";
} & SearchResultsWithoutSchemaField_DataHubView_Fragment;

export type SearchResultFieldsNoLineage_DataJob_Fragment = {
  __typename?: "DataJob";
} & SearchResultsWithoutSchemaField_DataJob_Fragment;

export type SearchResultFieldsNoLineage_DataPlatform_Fragment = {
  __typename?: "DataPlatform";
} & SearchResultsWithoutSchemaField_DataPlatform_Fragment;

export type SearchResultFieldsNoLineage_DataPlatformInstance_Fragment = {
  __typename?: "DataPlatformInstance";
} & SearchResultsWithoutSchemaField_DataPlatformInstance_Fragment;

export type SearchResultFieldsNoLineage_DataProcessInstance_Fragment = {
  __typename?: "DataProcessInstance";
} & SearchResultsWithoutSchemaField_DataProcessInstance_Fragment;

export type SearchResultFieldsNoLineage_DataProduct_Fragment = {
  __typename?: "DataProduct";
} & SearchResultsWithoutSchemaField_DataProduct_Fragment;

export type SearchResultFieldsNoLineage_DataTypeEntity_Fragment = {
  __typename?: "DataTypeEntity";
} & SearchResultsWithoutSchemaField_DataTypeEntity_Fragment;

export type SearchResultFieldsNoLineage_Dataset_Fragment = {
  __typename?: "Dataset";
} & SearchResultsWithoutSchemaField_Dataset_Fragment;

export type SearchResultFieldsNoLineage_Domain_Fragment = {
  __typename?: "Domain";
} & SearchResultsWithoutSchemaField_Domain_Fragment;

export type SearchResultFieldsNoLineage_ErModelRelationship_Fragment = {
  __typename?: "ERModelRelationship";
} & SearchResultsWithoutSchemaField_ErModelRelationship_Fragment;

export type SearchResultFieldsNoLineage_EntityTypeEntity_Fragment = {
  __typename?: "EntityTypeEntity";
} & SearchResultsWithoutSchemaField_EntityTypeEntity_Fragment;

export type SearchResultFieldsNoLineage_ExecutionRequest_Fragment = {
  __typename?: "ExecutionRequest";
} & SearchResultsWithoutSchemaField_ExecutionRequest_Fragment;

export type SearchResultFieldsNoLineage_Form_Fragment = {
  __typename?: "Form";
} & SearchResultsWithoutSchemaField_Form_Fragment;

export type SearchResultFieldsNoLineage_GlossaryNode_Fragment = {
  __typename?: "GlossaryNode";
} & SearchResultsWithoutSchemaField_GlossaryNode_Fragment;

export type SearchResultFieldsNoLineage_GlossaryTerm_Fragment = {
  __typename?: "GlossaryTerm";
} & SearchResultsWithoutSchemaField_GlossaryTerm_Fragment;

export type SearchResultFieldsNoLineage_Incident_Fragment = {
  __typename?: "Incident";
} & SearchResultsWithoutSchemaField_Incident_Fragment;

export type SearchResultFieldsNoLineage_MlFeature_Fragment = {
  __typename?: "MLFeature";
} & SearchResultsWithoutSchemaField_MlFeature_Fragment;

export type SearchResultFieldsNoLineage_MlFeatureTable_Fragment = {
  __typename?: "MLFeatureTable";
} & SearchResultsWithoutSchemaField_MlFeatureTable_Fragment;

export type SearchResultFieldsNoLineage_MlModel_Fragment = {
  __typename?: "MLModel";
} & SearchResultsWithoutSchemaField_MlModel_Fragment;

export type SearchResultFieldsNoLineage_MlModelGroup_Fragment = {
  __typename?: "MLModelGroup";
} & SearchResultsWithoutSchemaField_MlModelGroup_Fragment;

export type SearchResultFieldsNoLineage_MlPrimaryKey_Fragment = {
  __typename?: "MLPrimaryKey";
} & SearchResultsWithoutSchemaField_MlPrimaryKey_Fragment;

export type SearchResultFieldsNoLineage_Notebook_Fragment = {
  __typename?: "Notebook";
} & SearchResultsWithoutSchemaField_Notebook_Fragment;

export type SearchResultFieldsNoLineage_OwnershipTypeEntity_Fragment = {
  __typename?: "OwnershipTypeEntity";
} & SearchResultsWithoutSchemaField_OwnershipTypeEntity_Fragment;

export type SearchResultFieldsNoLineage_Post_Fragment = {
  __typename?: "Post";
} & SearchResultsWithoutSchemaField_Post_Fragment;

export type SearchResultFieldsNoLineage_QueryEntity_Fragment = {
  __typename?: "QueryEntity";
} & SearchResultsWithoutSchemaField_QueryEntity_Fragment;

export type SearchResultFieldsNoLineage_Restricted_Fragment = {
  __typename?: "Restricted";
} & SearchResultsWithoutSchemaField_Restricted_Fragment;

export type SearchResultFieldsNoLineage_Role_Fragment = {
  __typename?: "Role";
} & SearchResultsWithoutSchemaField_Role_Fragment;

export type SearchResultFieldsNoLineage_SchemaFieldEntity_Fragment = {
  __typename?: "SchemaFieldEntity";
} & EntityFieldFragment &
  SearchResultsWithoutSchemaField_SchemaFieldEntity_Fragment;

export type SearchResultFieldsNoLineage_StructuredPropertyEntity_Fragment = {
  __typename?: "StructuredPropertyEntity";
} & SearchResultsWithoutSchemaField_StructuredPropertyEntity_Fragment;

export type SearchResultFieldsNoLineage_Tag_Fragment = {
  __typename?: "Tag";
} & SearchResultsWithoutSchemaField_Tag_Fragment;

export type SearchResultFieldsNoLineage_Test_Fragment = {
  __typename?: "Test";
} & SearchResultsWithoutSchemaField_Test_Fragment;

export type SearchResultFieldsNoLineage_VersionSet_Fragment = {
  __typename?: "VersionSet";
} & SearchResultsWithoutSchemaField_VersionSet_Fragment;

export type SearchResultFieldsNoLineage_VersionedDataset_Fragment = {
  __typename?: "VersionedDataset";
} & SearchResultsWithoutSchemaField_VersionedDataset_Fragment;

export type SearchResultFieldsNoLineageFragment =
  | SearchResultFieldsNoLineage_AccessTokenMetadata_Fragment
  | SearchResultFieldsNoLineage_Application_Fragment
  | SearchResultFieldsNoLineage_Assertion_Fragment
  | SearchResultFieldsNoLineage_BusinessAttribute_Fragment
  | SearchResultFieldsNoLineage_Chart_Fragment
  | SearchResultFieldsNoLineage_Container_Fragment
  | SearchResultFieldsNoLineage_CorpGroup_Fragment
  | SearchResultFieldsNoLineage_CorpUser_Fragment
  | SearchResultFieldsNoLineage_Dashboard_Fragment
  | SearchResultFieldsNoLineage_DataContract_Fragment
  | SearchResultFieldsNoLineage_DataFlow_Fragment
  | SearchResultFieldsNoLineage_DataHubConnection_Fragment
  | SearchResultFieldsNoLineage_DataHubFile_Fragment
  | SearchResultFieldsNoLineage_DataHubPageModule_Fragment
  | SearchResultFieldsNoLineage_DataHubPageTemplate_Fragment
  | SearchResultFieldsNoLineage_DataHubPolicy_Fragment
  | SearchResultFieldsNoLineage_DataHubRole_Fragment
  | SearchResultFieldsNoLineage_DataHubView_Fragment
  | SearchResultFieldsNoLineage_DataJob_Fragment
  | SearchResultFieldsNoLineage_DataPlatform_Fragment
  | SearchResultFieldsNoLineage_DataPlatformInstance_Fragment
  | SearchResultFieldsNoLineage_DataProcessInstance_Fragment
  | SearchResultFieldsNoLineage_DataProduct_Fragment
  | SearchResultFieldsNoLineage_DataTypeEntity_Fragment
  | SearchResultFieldsNoLineage_Dataset_Fragment
  | SearchResultFieldsNoLineage_Domain_Fragment
  | SearchResultFieldsNoLineage_ErModelRelationship_Fragment
  | SearchResultFieldsNoLineage_EntityTypeEntity_Fragment
  | SearchResultFieldsNoLineage_ExecutionRequest_Fragment
  | SearchResultFieldsNoLineage_Form_Fragment
  | SearchResultFieldsNoLineage_GlossaryNode_Fragment
  | SearchResultFieldsNoLineage_GlossaryTerm_Fragment
  | SearchResultFieldsNoLineage_Incident_Fragment
  | SearchResultFieldsNoLineage_MlFeature_Fragment
  | SearchResultFieldsNoLineage_MlFeatureTable_Fragment
  | SearchResultFieldsNoLineage_MlModel_Fragment
  | SearchResultFieldsNoLineage_MlModelGroup_Fragment
  | SearchResultFieldsNoLineage_MlPrimaryKey_Fragment
  | SearchResultFieldsNoLineage_Notebook_Fragment
  | SearchResultFieldsNoLineage_OwnershipTypeEntity_Fragment
  | SearchResultFieldsNoLineage_Post_Fragment
  | SearchResultFieldsNoLineage_QueryEntity_Fragment
  | SearchResultFieldsNoLineage_Restricted_Fragment
  | SearchResultFieldsNoLineage_Role_Fragment
  | SearchResultFieldsNoLineage_SchemaFieldEntity_Fragment
  | SearchResultFieldsNoLineage_StructuredPropertyEntity_Fragment
  | SearchResultFieldsNoLineage_Tag_Fragment
  | SearchResultFieldsNoLineage_Test_Fragment
  | SearchResultFieldsNoLineage_VersionSet_Fragment
  | SearchResultFieldsNoLineage_VersionedDataset_Fragment;

export type SearchResultFields_AccessTokenMetadata_Fragment = {
  __typename?: "AccessTokenMetadata";
} & SearchResultFieldsNoLineage_AccessTokenMetadata_Fragment;

export type SearchResultFields_Application_Fragment = {
  __typename?: "Application";
} & SearchResultFieldsNoLineage_Application_Fragment;

export type SearchResultFields_Assertion_Fragment = {
  __typename?: "Assertion";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
} & SearchResultFieldsNoLineage_Assertion_Fragment;

export type SearchResultFields_BusinessAttribute_Fragment = {
  __typename?: "BusinessAttribute";
} & SearchResultFieldsNoLineage_BusinessAttribute_Fragment;

export type SearchResultFields_Chart_Fragment = { __typename?: "Chart" } & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
} & SearchResultFieldsNoLineage_Chart_Fragment;

export type SearchResultFields_Container_Fragment = {
  __typename?: "Container";
} & SearchResultFieldsNoLineage_Container_Fragment;

export type SearchResultFields_CorpGroup_Fragment = {
  __typename?: "CorpGroup";
} & SearchResultFieldsNoLineage_CorpGroup_Fragment;

export type SearchResultFields_CorpUser_Fragment = {
  __typename?: "CorpUser";
} & SearchResultFieldsNoLineage_CorpUser_Fragment;

export type SearchResultFields_Dashboard_Fragment = {
  __typename?: "Dashboard";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
} & SearchResultFieldsNoLineage_Dashboard_Fragment;

export type SearchResultFields_DataContract_Fragment = {
  __typename?: "DataContract";
} & SearchResultFieldsNoLineage_DataContract_Fragment;

export type SearchResultFields_DataFlow_Fragment = {
  __typename?: "DataFlow";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
} & SearchResultFieldsNoLineage_DataFlow_Fragment;

export type SearchResultFields_DataHubConnection_Fragment = {
  __typename?: "DataHubConnection";
} & SearchResultFieldsNoLineage_DataHubConnection_Fragment;

export type SearchResultFields_DataHubFile_Fragment = {
  __typename?: "DataHubFile";
} & SearchResultFieldsNoLineage_DataHubFile_Fragment;

export type SearchResultFields_DataHubPageModule_Fragment = {
  __typename?: "DataHubPageModule";
} & SearchResultFieldsNoLineage_DataHubPageModule_Fragment;

export type SearchResultFields_DataHubPageTemplate_Fragment = {
  __typename?: "DataHubPageTemplate";
} & SearchResultFieldsNoLineage_DataHubPageTemplate_Fragment;

export type SearchResultFields_DataHubPolicy_Fragment = {
  __typename?: "DataHubPolicy";
} & SearchResultFieldsNoLineage_DataHubPolicy_Fragment;

export type SearchResultFields_DataHubRole_Fragment = {
  __typename?: "DataHubRole";
} & SearchResultFieldsNoLineage_DataHubRole_Fragment;

export type SearchResultFields_DataHubView_Fragment = {
  __typename?: "DataHubView";
} & SearchResultFieldsNoLineage_DataHubView_Fragment;

export type SearchResultFields_DataJob_Fragment = { __typename?: "DataJob" } & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
} & SearchResultFieldsNoLineage_DataJob_Fragment;

export type SearchResultFields_DataPlatform_Fragment = {
  __typename?: "DataPlatform";
} & SearchResultFieldsNoLineage_DataPlatform_Fragment;

export type SearchResultFields_DataPlatformInstance_Fragment = {
  __typename?: "DataPlatformInstance";
} & SearchResultFieldsNoLineage_DataPlatformInstance_Fragment;

export type SearchResultFields_DataProcessInstance_Fragment = {
  __typename?: "DataProcessInstance";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
} & SearchResultFieldsNoLineage_DataProcessInstance_Fragment;

export type SearchResultFields_DataProduct_Fragment = {
  __typename?: "DataProduct";
} & SearchResultFieldsNoLineage_DataProduct_Fragment;

export type SearchResultFields_DataTypeEntity_Fragment = {
  __typename?: "DataTypeEntity";
} & SearchResultFieldsNoLineage_DataTypeEntity_Fragment;

export type SearchResultFields_Dataset_Fragment = { __typename?: "Dataset" } & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
} & SearchResultFieldsNoLineage_Dataset_Fragment;

export type SearchResultFields_Domain_Fragment = {
  __typename?: "Domain";
} & SearchResultFieldsNoLineage_Domain_Fragment;

export type SearchResultFields_ErModelRelationship_Fragment = {
  __typename?: "ERModelRelationship";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
} & SearchResultFieldsNoLineage_ErModelRelationship_Fragment;

export type SearchResultFields_EntityTypeEntity_Fragment = {
  __typename?: "EntityTypeEntity";
} & SearchResultFieldsNoLineage_EntityTypeEntity_Fragment;

export type SearchResultFields_ExecutionRequest_Fragment = {
  __typename?: "ExecutionRequest";
} & SearchResultFieldsNoLineage_ExecutionRequest_Fragment;

export type SearchResultFields_Form_Fragment = {
  __typename?: "Form";
} & SearchResultFieldsNoLineage_Form_Fragment;

export type SearchResultFields_GlossaryNode_Fragment = {
  __typename?: "GlossaryNode";
} & SearchResultFieldsNoLineage_GlossaryNode_Fragment;

export type SearchResultFields_GlossaryTerm_Fragment = {
  __typename?: "GlossaryTerm";
} & SearchResultFieldsNoLineage_GlossaryTerm_Fragment;

export type SearchResultFields_Incident_Fragment = {
  __typename?: "Incident";
} & SearchResultFieldsNoLineage_Incident_Fragment;

export type SearchResultFields_MlFeature_Fragment = {
  __typename?: "MLFeature";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
} & SearchResultFieldsNoLineage_MlFeature_Fragment;

export type SearchResultFields_MlFeatureTable_Fragment = {
  __typename?: "MLFeatureTable";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
} & SearchResultFieldsNoLineage_MlFeatureTable_Fragment;

export type SearchResultFields_MlModel_Fragment = { __typename?: "MLModel" } & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
} & SearchResultFieldsNoLineage_MlModel_Fragment;

export type SearchResultFields_MlModelGroup_Fragment = {
  __typename?: "MLModelGroup";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
} & SearchResultFieldsNoLineage_MlModelGroup_Fragment;

export type SearchResultFields_MlPrimaryKey_Fragment = {
  __typename?: "MLPrimaryKey";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
} & SearchResultFieldsNoLineage_MlPrimaryKey_Fragment;

export type SearchResultFields_Notebook_Fragment = {
  __typename?: "Notebook";
} & SearchResultFieldsNoLineage_Notebook_Fragment;

export type SearchResultFields_OwnershipTypeEntity_Fragment = {
  __typename?: "OwnershipTypeEntity";
} & SearchResultFieldsNoLineage_OwnershipTypeEntity_Fragment;

export type SearchResultFields_Post_Fragment = {
  __typename?: "Post";
} & SearchResultFieldsNoLineage_Post_Fragment;

export type SearchResultFields_QueryEntity_Fragment = {
  __typename?: "QueryEntity";
} & SearchResultFieldsNoLineage_QueryEntity_Fragment;

export type SearchResultFields_Restricted_Fragment = {
  __typename?: "Restricted";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
} & SearchResultFieldsNoLineage_Restricted_Fragment;

export type SearchResultFields_Role_Fragment = {
  __typename?: "Role";
} & SearchResultFieldsNoLineage_Role_Fragment;

export type SearchResultFields_SchemaFieldEntity_Fragment = {
  __typename?: "SchemaFieldEntity";
} & {
  upstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
  downstream?: Types.Maybe<
    { __typename?: "EntityLineageResult" } & Pick<
      Types.EntityLineageResult,
      "total" | "filtered"
    >
  >;
} & SearchResultFieldsNoLineage_SchemaFieldEntity_Fragment;

export type SearchResultFields_StructuredPropertyEntity_Fragment = {
  __typename?: "StructuredPropertyEntity";
} & SearchResultFieldsNoLineage_StructuredPropertyEntity_Fragment;

export type SearchResultFields_Tag_Fragment = {
  __typename?: "Tag";
} & SearchResultFieldsNoLineage_Tag_Fragment;

export type SearchResultFields_Test_Fragment = {
  __typename?: "Test";
} & SearchResultFieldsNoLineage_Test_Fragment;

export type SearchResultFields_VersionSet_Fragment = {
  __typename?: "VersionSet";
} & SearchResultFieldsNoLineage_VersionSet_Fragment;

export type SearchResultFields_VersionedDataset_Fragment = {
  __typename?: "VersionedDataset";
} & SearchResultFieldsNoLineage_VersionedDataset_Fragment;

export type SearchResultFieldsFragment =
  | SearchResultFields_AccessTokenMetadata_Fragment
  | SearchResultFields_Application_Fragment
  | SearchResultFields_Assertion_Fragment
  | SearchResultFields_BusinessAttribute_Fragment
  | SearchResultFields_Chart_Fragment
  | SearchResultFields_Container_Fragment
  | SearchResultFields_CorpGroup_Fragment
  | SearchResultFields_CorpUser_Fragment
  | SearchResultFields_Dashboard_Fragment
  | SearchResultFields_DataContract_Fragment
  | SearchResultFields_DataFlow_Fragment
  | SearchResultFields_DataHubConnection_Fragment
  | SearchResultFields_DataHubFile_Fragment
  | SearchResultFields_DataHubPageModule_Fragment
  | SearchResultFields_DataHubPageTemplate_Fragment
  | SearchResultFields_DataHubPolicy_Fragment
  | SearchResultFields_DataHubRole_Fragment
  | SearchResultFields_DataHubView_Fragment
  | SearchResultFields_DataJob_Fragment
  | SearchResultFields_DataPlatform_Fragment
  | SearchResultFields_DataPlatformInstance_Fragment
  | SearchResultFields_DataProcessInstance_Fragment
  | SearchResultFields_DataProduct_Fragment
  | SearchResultFields_DataTypeEntity_Fragment
  | SearchResultFields_Dataset_Fragment
  | SearchResultFields_Domain_Fragment
  | SearchResultFields_ErModelRelationship_Fragment
  | SearchResultFields_EntityTypeEntity_Fragment
  | SearchResultFields_ExecutionRequest_Fragment
  | SearchResultFields_Form_Fragment
  | SearchResultFields_GlossaryNode_Fragment
  | SearchResultFields_GlossaryTerm_Fragment
  | SearchResultFields_Incident_Fragment
  | SearchResultFields_MlFeature_Fragment
  | SearchResultFields_MlFeatureTable_Fragment
  | SearchResultFields_MlModel_Fragment
  | SearchResultFields_MlModelGroup_Fragment
  | SearchResultFields_MlPrimaryKey_Fragment
  | SearchResultFields_Notebook_Fragment
  | SearchResultFields_OwnershipTypeEntity_Fragment
  | SearchResultFields_Post_Fragment
  | SearchResultFields_QueryEntity_Fragment
  | SearchResultFields_Restricted_Fragment
  | SearchResultFields_Role_Fragment
  | SearchResultFields_SchemaFieldEntity_Fragment
  | SearchResultFields_StructuredPropertyEntity_Fragment
  | SearchResultFields_Tag_Fragment
  | SearchResultFields_Test_Fragment
  | SearchResultFields_VersionSet_Fragment
  | SearchResultFields_VersionedDataset_Fragment;

export type FacetFieldsFragment = { __typename?: "FacetMetadata" } & Pick<
  Types.FacetMetadata,
  "field" | "displayName"
> & {
    entity?: Types.Maybe<
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
      | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type"> &
          EntityDisplayNameFields_Chart_Fragment)
      | ({ __typename?: "Container" } & Pick<Types.Container, "urn" | "type"> &
          EntityDisplayNameFields_Container_Fragment)
      | ({ __typename?: "CorpGroup" } & Pick<Types.CorpGroup, "urn" | "type"> &
          EntityDisplayNameFields_CorpGroup_Fragment)
      | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type"> &
          EntityDisplayNameFields_CorpUser_Fragment)
      | ({ __typename?: "Dashboard" } & Pick<Types.Dashboard, "urn" | "type"> &
          EntityDisplayNameFields_Dashboard_Fragment)
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
      | ({ __typename?: "Dataset" } & Pick<Types.Dataset, "urn" | "type"> &
          EntityDisplayNameFields_Dataset_Fragment)
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
        > & {
            definition: { __typename?: "StructuredPropertyDefinition" } & {
              valueType: { __typename?: "DataTypeEntity" } & Pick<
                Types.DataTypeEntity,
                "urn"
              >;
            };
          } & EntityDisplayNameFields_StructuredPropertyEntity_Fragment)
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
          EntityDisplayNameFields_VersionedDataset_Fragment)
    >;
    aggregations: Array<
      { __typename?: "AggregationMetadata" } & Pick<
        Types.AggregationMetadata,
        "value" | "count"
      > & {
          entity?: Types.Maybe<
            | ({ __typename?: "AccessTokenMetadata" } & Pick<
                Types.AccessTokenMetadata,
                "urn" | "type"
              > &
                EntityDisplayNameFields_AccessTokenMetadata_Fragment)
            | ({ __typename?: "Application" } & Pick<
                Types.Application,
                "urn" | "type"
              > & {
                  properties?: Types.Maybe<
                    { __typename?: "ApplicationProperties" } & Pick<
                      Types.ApplicationProperties,
                      "name"
                    >
                  >;
                } & EntityDisplayNameFields_Application_Fragment)
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
              > & {
                  platform: {
                    __typename?: "DataPlatform";
                  } & PlatformFieldsFragment;
                  properties?: Types.Maybe<
                    { __typename?: "ContainerProperties" } & Pick<
                      Types.ContainerProperties,
                      "name"
                    >
                  >;
                  parentContainers?: Types.Maybe<
                    {
                      __typename?: "ParentContainersResult";
                    } & ParentContainersFieldsFragment
                  >;
                } & EntityDisplayNameFields_Container_Fragment)
            | ({ __typename?: "CorpGroup" } & Pick<
                Types.CorpGroup,
                "name" | "urn" | "type"
              > & {
                  properties?: Types.Maybe<
                    { __typename?: "CorpGroupProperties" } & Pick<
                      Types.CorpGroupProperties,
                      "displayName"
                    >
                  >;
                } & EntityDisplayNameFields_CorpGroup_Fragment)
            | ({ __typename?: "CorpUser" } & Pick<
                Types.CorpUser,
                "username" | "urn" | "type"
              > & {
                  properties?: Types.Maybe<
                    { __typename?: "CorpUserProperties" } & Pick<
                      Types.CorpUserProperties,
                      "displayName" | "fullName"
                    >
                  >;
                  editableProperties?: Types.Maybe<
                    { __typename?: "CorpUserEditableProperties" } & Pick<
                      Types.CorpUserEditableProperties,
                      "displayName" | "pictureLink"
                    >
                  >;
                } & EntityDisplayNameFields_CorpUser_Fragment)
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
                PlatformFieldsFragment &
                EntityDisplayNameFields_DataPlatform_Fragment)
            | ({ __typename?: "DataPlatformInstance" } & Pick<
                Types.DataPlatformInstance,
                "urn" | "type"
              > &
                DataPlatformInstanceFieldsFragment &
                EntityDisplayNameFields_DataPlatformInstance_Fragment)
            | ({ __typename?: "DataProcessInstance" } & Pick<
                Types.DataProcessInstance,
                "urn" | "type"
              > &
                EntityDisplayNameFields_DataProcessInstance_Fragment)
            | ({ __typename?: "DataProduct" } & Pick<
                Types.DataProduct,
                "urn" | "type"
              > & {
                  properties?: Types.Maybe<
                    { __typename?: "DataProductProperties" } & Pick<
                      Types.DataProductProperties,
                      "name"
                    >
                  >;
                } & EntityDisplayNameFields_DataProduct_Fragment)
            | ({ __typename?: "DataTypeEntity" } & Pick<
                Types.DataTypeEntity,
                "urn" | "type"
              > &
                EntityDisplayNameFields_DataTypeEntity_Fragment)
            | ({ __typename?: "Dataset" } & Pick<
                Types.Dataset,
                "urn" | "type"
              > & {
                  platform: {
                    __typename?: "DataPlatform";
                  } & PlatformFieldsFragment;
                } & EntityDisplayNameFields_Dataset_Fragment)
            | ({ __typename?: "Domain" } & Pick<
                Types.Domain,
                "urn" | "type"
              > & {
                  properties?: Types.Maybe<
                    { __typename?: "DomainProperties" } & Pick<
                      Types.DomainProperties,
                      "name"
                    >
                  >;
                  parentDomains?: Types.Maybe<
                    {
                      __typename?: "ParentDomainsResult";
                    } & ParentDomainsFieldsFragment
                  >;
                } & EntityDisplayNameFields_Domain_Fragment)
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
                "name" | "urn" | "type"
              > & {
                  properties?: Types.Maybe<
                    { __typename?: "GlossaryTermProperties" } & Pick<
                      Types.GlossaryTermProperties,
                      "name"
                    >
                  >;
                  parentNodes?: Types.Maybe<
                    {
                      __typename?: "ParentNodesResult";
                    } & ParentNodesFieldsFragment
                  >;
                } & EntityDisplayNameFields_GlossaryTerm_Fragment)
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
            | ({ __typename?: "Tag" } & Pick<
                Types.Tag,
                "name" | "urn" | "type"
              > & {
                  properties?: Types.Maybe<
                    { __typename?: "TagProperties" } & Pick<
                      Types.TagProperties,
                      "name" | "colorHex"
                    >
                  >;
                } & EntityDisplayNameFields_Tag_Fragment)
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
                EntityDisplayNameFields_VersionedDataset_Fragment)
          >;
        }
    >;
  };

export type SearchResultsFragment = { __typename?: "SearchResults" } & Pick<
  Types.SearchResults,
  "start" | "count" | "total"
> & {
    searchResults: Array<
      { __typename?: "SearchResult" } & {
        entity:
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
          | ({ __typename?: "CorpUser" } & SearchResultFields_CorpUser_Fragment)
          | ({
              __typename?: "Dashboard";
            } & SearchResultFields_Dashboard_Fragment)
          | ({
              __typename?: "DataContract";
            } & SearchResultFields_DataContract_Fragment)
          | ({ __typename?: "DataFlow" } & SearchResultFields_DataFlow_Fragment)
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
          | ({ __typename?: "Incident" } & SearchResultFields_Incident_Fragment)
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
          | ({ __typename?: "Notebook" } & SearchResultFields_Notebook_Fragment)
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
            } & SearchResultFields_VersionedDataset_Fragment);
        matchedFields: Array<
          { __typename?: "MatchedField" } & Pick<
            Types.MatchedField,
            "name" | "value"
          > & {
              entity?: Types.Maybe<
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
                | ({ __typename?: "Chart" } & Pick<
                    Types.Chart,
                    "urn" | "type"
                  > &
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
                    EntityDisplayNameFields_VersionedDataset_Fragment)
              >;
            }
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
    suggestions?: Types.Maybe<
      Array<
        { __typename?: "SearchSuggestion" } & Pick<
          Types.SearchSuggestion,
          "text" | "frequency" | "score"
        >
      >
    >;
  };

export type ScrollResultsFragment = { __typename?: "ScrollResults" } & Pick<
  Types.ScrollResults,
  "count" | "total" | "nextScrollId"
> & {
    searchResults: Array<
      { __typename?: "SearchResult" } & {
        entity:
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
          | ({ __typename?: "CorpUser" } & SearchResultFields_CorpUser_Fragment)
          | ({
              __typename?: "Dashboard";
            } & SearchResultFields_Dashboard_Fragment)
          | ({
              __typename?: "DataContract";
            } & SearchResultFields_DataContract_Fragment)
          | ({ __typename?: "DataFlow" } & SearchResultFields_DataFlow_Fragment)
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
          | ({ __typename?: "Incident" } & SearchResultFields_Incident_Fragment)
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
          | ({ __typename?: "Notebook" } & SearchResultFields_Notebook_Fragment)
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
            } & SearchResultFields_VersionedDataset_Fragment);
        matchedFields: Array<
          { __typename?: "MatchedField" } & Pick<
            Types.MatchedField,
            "name" | "value"
          > & {
              entity?: Types.Maybe<
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
                | ({ __typename?: "Chart" } & Pick<
                    Types.Chart,
                    "urn" | "type"
                  > &
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
                    EntityDisplayNameFields_VersionedDataset_Fragment)
              >;
            }
        >;
        insights?: Types.Maybe<
          Array<
            { __typename?: "SearchInsight" } & Pick<
              Types.SearchInsight,
              "text" | "icon"
            >
          >
        >;
        extraProperties?: Types.Maybe<
          Array<
            { __typename?: "ExtraProperty" } & Pick<
              Types.ExtraProperty,
              "name" | "value"
            >
          >
        >;
      }
    >;
    facets?: Types.Maybe<
      Array<{ __typename?: "FacetMetadata" } & FacetFieldsFragment>
    >;
  };

export type EntityFieldFragment = { __typename?: "SchemaFieldEntity" } & Pick<
  Types.SchemaFieldEntity,
  "urn" | "type" | "fieldPath"
> & {
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
      | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type"> &
          EntityDisplayNameFields_Chart_Fragment)
      | ({ __typename?: "Container" } & Pick<Types.Container, "urn" | "type"> &
          EntityDisplayNameFields_Container_Fragment)
      | ({ __typename?: "CorpGroup" } & Pick<Types.CorpGroup, "urn" | "type"> &
          EntityDisplayNameFields_CorpGroup_Fragment)
      | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type"> &
          EntityDisplayNameFields_CorpUser_Fragment)
      | ({ __typename?: "Dashboard" } & Pick<Types.Dashboard, "urn" | "type"> &
          EntityDisplayNameFields_Dashboard_Fragment)
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
            dataPlatformInstance?: Types.Maybe<
              {
                __typename?: "DataPlatformInstance";
              } & DataPlatformInstanceFieldsFragment
            >;
            parentContainers?: Types.Maybe<
              {
                __typename?: "ParentContainersResult";
              } & ParentContainersFieldsFragment
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
  };

export type SchemaFieldEntitySearchFieldsFragment = {
  __typename?: "SchemaFieldEntity";
} & Pick<Types.SchemaFieldEntity, "urn" | "type" | "fieldPath"> & {
    parent:
      | ({
          __typename?: "AccessTokenMetadata";
        } & SearchResultsWithoutSchemaField_AccessTokenMetadata_Fragment)
      | ({
          __typename?: "Application";
        } & SearchResultsWithoutSchemaField_Application_Fragment)
      | ({
          __typename?: "Assertion";
        } & SearchResultsWithoutSchemaField_Assertion_Fragment)
      | ({
          __typename?: "BusinessAttribute";
        } & SearchResultsWithoutSchemaField_BusinessAttribute_Fragment)
      | ({
          __typename?: "Chart";
        } & SearchResultsWithoutSchemaField_Chart_Fragment)
      | ({
          __typename?: "Container";
        } & SearchResultsWithoutSchemaField_Container_Fragment)
      | ({
          __typename?: "CorpGroup";
        } & SearchResultsWithoutSchemaField_CorpGroup_Fragment)
      | ({
          __typename?: "CorpUser";
        } & SearchResultsWithoutSchemaField_CorpUser_Fragment)
      | ({
          __typename?: "Dashboard";
        } & SearchResultsWithoutSchemaField_Dashboard_Fragment)
      | ({
          __typename?: "DataContract";
        } & SearchResultsWithoutSchemaField_DataContract_Fragment)
      | ({
          __typename?: "DataFlow";
        } & SearchResultsWithoutSchemaField_DataFlow_Fragment)
      | ({
          __typename?: "DataHubConnection";
        } & SearchResultsWithoutSchemaField_DataHubConnection_Fragment)
      | ({
          __typename?: "DataHubFile";
        } & SearchResultsWithoutSchemaField_DataHubFile_Fragment)
      | ({
          __typename?: "DataHubPageModule";
        } & SearchResultsWithoutSchemaField_DataHubPageModule_Fragment)
      | ({
          __typename?: "DataHubPageTemplate";
        } & SearchResultsWithoutSchemaField_DataHubPageTemplate_Fragment)
      | ({
          __typename?: "DataHubPolicy";
        } & SearchResultsWithoutSchemaField_DataHubPolicy_Fragment)
      | ({
          __typename?: "DataHubRole";
        } & SearchResultsWithoutSchemaField_DataHubRole_Fragment)
      | ({
          __typename?: "DataHubView";
        } & SearchResultsWithoutSchemaField_DataHubView_Fragment)
      | ({
          __typename?: "DataJob";
        } & SearchResultsWithoutSchemaField_DataJob_Fragment)
      | ({
          __typename?: "DataPlatform";
        } & SearchResultsWithoutSchemaField_DataPlatform_Fragment)
      | ({
          __typename?: "DataPlatformInstance";
        } & SearchResultsWithoutSchemaField_DataPlatformInstance_Fragment)
      | ({
          __typename?: "DataProcessInstance";
        } & SearchResultsWithoutSchemaField_DataProcessInstance_Fragment)
      | ({
          __typename?: "DataProduct";
        } & SearchResultsWithoutSchemaField_DataProduct_Fragment)
      | ({
          __typename?: "DataTypeEntity";
        } & SearchResultsWithoutSchemaField_DataTypeEntity_Fragment)
      | ({
          __typename?: "Dataset";
        } & SearchResultsWithoutSchemaField_Dataset_Fragment)
      | ({
          __typename?: "Domain";
        } & SearchResultsWithoutSchemaField_Domain_Fragment)
      | ({
          __typename?: "ERModelRelationship";
        } & SearchResultsWithoutSchemaField_ErModelRelationship_Fragment)
      | ({
          __typename?: "EntityTypeEntity";
        } & SearchResultsWithoutSchemaField_EntityTypeEntity_Fragment)
      | ({
          __typename?: "ExecutionRequest";
        } & SearchResultsWithoutSchemaField_ExecutionRequest_Fragment)
      | ({
          __typename?: "Form";
        } & SearchResultsWithoutSchemaField_Form_Fragment)
      | ({
          __typename?: "GlossaryNode";
        } & SearchResultsWithoutSchemaField_GlossaryNode_Fragment)
      | ({
          __typename?: "GlossaryTerm";
        } & SearchResultsWithoutSchemaField_GlossaryTerm_Fragment)
      | ({
          __typename?: "Incident";
        } & SearchResultsWithoutSchemaField_Incident_Fragment)
      | ({
          __typename?: "MLFeature";
        } & SearchResultsWithoutSchemaField_MlFeature_Fragment)
      | ({
          __typename?: "MLFeatureTable";
        } & SearchResultsWithoutSchemaField_MlFeatureTable_Fragment)
      | ({
          __typename?: "MLModel";
        } & SearchResultsWithoutSchemaField_MlModel_Fragment)
      | ({
          __typename?: "MLModelGroup";
        } & SearchResultsWithoutSchemaField_MlModelGroup_Fragment)
      | ({
          __typename?: "MLPrimaryKey";
        } & SearchResultsWithoutSchemaField_MlPrimaryKey_Fragment)
      | ({
          __typename?: "Notebook";
        } & SearchResultsWithoutSchemaField_Notebook_Fragment)
      | ({
          __typename?: "OwnershipTypeEntity";
        } & SearchResultsWithoutSchemaField_OwnershipTypeEntity_Fragment)
      | ({
          __typename?: "Post";
        } & SearchResultsWithoutSchemaField_Post_Fragment)
      | ({
          __typename?: "QueryEntity";
        } & SearchResultsWithoutSchemaField_QueryEntity_Fragment)
      | ({
          __typename?: "Restricted";
        } & SearchResultsWithoutSchemaField_Restricted_Fragment)
      | ({
          __typename?: "Role";
        } & SearchResultsWithoutSchemaField_Role_Fragment)
      | ({
          __typename?: "SchemaFieldEntity";
        } & SearchResultsWithoutSchemaField_SchemaFieldEntity_Fragment)
      | ({
          __typename?: "StructuredPropertyEntity";
        } & SearchResultsWithoutSchemaField_StructuredPropertyEntity_Fragment)
      | ({ __typename?: "Tag" } & SearchResultsWithoutSchemaField_Tag_Fragment)
      | ({
          __typename?: "Test";
        } & SearchResultsWithoutSchemaField_Test_Fragment)
      | ({
          __typename?: "VersionSet";
        } & SearchResultsWithoutSchemaField_VersionSet_Fragment)
      | ({
          __typename?: "VersionedDataset";
        } & SearchResultsWithoutSchemaField_VersionedDataset_Fragment);
  };

export type SearchAcrossRelationshipResultsFragment = {
  __typename?: "SearchAcrossLineageResults";
} & Pick<
  Types.SearchAcrossLineageResults,
  "start" | "count" | "total" | "lineageSearchPath"
> & {
    searchResults: Array<
      { __typename?: "SearchAcrossLineageResult" } & Pick<
        Types.SearchAcrossLineageResult,
        "degree"
      > & {
          entity:
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
            | ({ __typename?: "Dataset" } & {
                assertions?: Types.Maybe<
                  { __typename?: "EntityAssertionsResult" } & {
                    assertions: Array<
                      { __typename?: "Assertion" } & {
                        runEvents?: Types.Maybe<
                          { __typename?: "AssertionRunEventsResult" } & Pick<
                            Types.AssertionRunEventsResult,
                            "total" | "failed" | "succeeded"
                          >
                        >;
                      }
                    >;
                  }
                >;
              } & SearchResultFields_Dataset_Fragment)
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
              } & SearchResultFields_VersionedDataset_Fragment);
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
          paths?: Types.Maybe<
            Array<
              Types.Maybe<
                { __typename?: "EntityPath" } & {
                  path: Array<
                    Types.Maybe<
                      | ({
                          __typename?: "AccessTokenMetadata";
                        } & SearchResultsWithoutSchemaField_AccessTokenMetadata_Fragment)
                      | ({
                          __typename?: "Application";
                        } & SearchResultsWithoutSchemaField_Application_Fragment)
                      | ({
                          __typename?: "Assertion";
                        } & SearchResultsWithoutSchemaField_Assertion_Fragment)
                      | ({
                          __typename?: "BusinessAttribute";
                        } & SearchResultsWithoutSchemaField_BusinessAttribute_Fragment)
                      | ({
                          __typename?: "Chart";
                        } & SearchResultsWithoutSchemaField_Chart_Fragment)
                      | ({
                          __typename?: "Container";
                        } & SearchResultsWithoutSchemaField_Container_Fragment)
                      | ({
                          __typename?: "CorpGroup";
                        } & SearchResultsWithoutSchemaField_CorpGroup_Fragment)
                      | ({
                          __typename?: "CorpUser";
                        } & SearchResultsWithoutSchemaField_CorpUser_Fragment)
                      | ({
                          __typename?: "Dashboard";
                        } & SearchResultsWithoutSchemaField_Dashboard_Fragment)
                      | ({
                          __typename?: "DataContract";
                        } & SearchResultsWithoutSchemaField_DataContract_Fragment)
                      | ({
                          __typename?: "DataFlow";
                        } & SearchResultsWithoutSchemaField_DataFlow_Fragment)
                      | ({
                          __typename?: "DataHubConnection";
                        } & SearchResultsWithoutSchemaField_DataHubConnection_Fragment)
                      | ({
                          __typename?: "DataHubFile";
                        } & SearchResultsWithoutSchemaField_DataHubFile_Fragment)
                      | ({
                          __typename?: "DataHubPageModule";
                        } & SearchResultsWithoutSchemaField_DataHubPageModule_Fragment)
                      | ({
                          __typename?: "DataHubPageTemplate";
                        } & SearchResultsWithoutSchemaField_DataHubPageTemplate_Fragment)
                      | ({
                          __typename?: "DataHubPolicy";
                        } & SearchResultsWithoutSchemaField_DataHubPolicy_Fragment)
                      | ({
                          __typename?: "DataHubRole";
                        } & SearchResultsWithoutSchemaField_DataHubRole_Fragment)
                      | ({
                          __typename?: "DataHubView";
                        } & SearchResultsWithoutSchemaField_DataHubView_Fragment)
                      | ({
                          __typename?: "DataJob";
                        } & SearchResultsWithoutSchemaField_DataJob_Fragment)
                      | ({
                          __typename?: "DataPlatform";
                        } & SearchResultsWithoutSchemaField_DataPlatform_Fragment)
                      | ({
                          __typename?: "DataPlatformInstance";
                        } & SearchResultsWithoutSchemaField_DataPlatformInstance_Fragment)
                      | ({
                          __typename?: "DataProcessInstance";
                        } & SearchResultsWithoutSchemaField_DataProcessInstance_Fragment)
                      | ({
                          __typename?: "DataProduct";
                        } & SearchResultsWithoutSchemaField_DataProduct_Fragment)
                      | ({
                          __typename?: "DataTypeEntity";
                        } & SearchResultsWithoutSchemaField_DataTypeEntity_Fragment)
                      | ({
                          __typename?: "Dataset";
                        } & SearchResultsWithoutSchemaField_Dataset_Fragment)
                      | ({
                          __typename?: "Domain";
                        } & SearchResultsWithoutSchemaField_Domain_Fragment)
                      | ({
                          __typename?: "ERModelRelationship";
                        } & SearchResultsWithoutSchemaField_ErModelRelationship_Fragment)
                      | ({
                          __typename?: "EntityTypeEntity";
                        } & SearchResultsWithoutSchemaField_EntityTypeEntity_Fragment)
                      | ({
                          __typename?: "ExecutionRequest";
                        } & SearchResultsWithoutSchemaField_ExecutionRequest_Fragment)
                      | ({
                          __typename?: "Form";
                        } & SearchResultsWithoutSchemaField_Form_Fragment)
                      | ({
                          __typename?: "GlossaryNode";
                        } & SearchResultsWithoutSchemaField_GlossaryNode_Fragment)
                      | ({
                          __typename?: "GlossaryTerm";
                        } & SearchResultsWithoutSchemaField_GlossaryTerm_Fragment)
                      | ({
                          __typename?: "Incident";
                        } & SearchResultsWithoutSchemaField_Incident_Fragment)
                      | ({
                          __typename?: "MLFeature";
                        } & SearchResultsWithoutSchemaField_MlFeature_Fragment)
                      | ({
                          __typename?: "MLFeatureTable";
                        } & SearchResultsWithoutSchemaField_MlFeatureTable_Fragment)
                      | ({
                          __typename?: "MLModel";
                        } & SearchResultsWithoutSchemaField_MlModel_Fragment)
                      | ({
                          __typename?: "MLModelGroup";
                        } & SearchResultsWithoutSchemaField_MlModelGroup_Fragment)
                      | ({
                          __typename?: "MLPrimaryKey";
                        } & SearchResultsWithoutSchemaField_MlPrimaryKey_Fragment)
                      | ({
                          __typename?: "Notebook";
                        } & SearchResultsWithoutSchemaField_Notebook_Fragment)
                      | ({
                          __typename?: "OwnershipTypeEntity";
                        } & SearchResultsWithoutSchemaField_OwnershipTypeEntity_Fragment)
                      | ({
                          __typename?: "Post";
                        } & SearchResultsWithoutSchemaField_Post_Fragment)
                      | ({
                          __typename?: "QueryEntity";
                        } & SearchResultsWithoutSchemaField_QueryEntity_Fragment)
                      | ({
                          __typename?: "Restricted";
                        } & SearchResultsWithoutSchemaField_Restricted_Fragment)
                      | ({
                          __typename?: "Role";
                        } & SearchResultsWithoutSchemaField_Role_Fragment)
                      | ({
                          __typename?: "SchemaFieldEntity";
                        } & SchemaFieldEntitySearchFieldsFragment &
                          SearchResultsWithoutSchemaField_SchemaFieldEntity_Fragment)
                      | ({
                          __typename?: "StructuredPropertyEntity";
                        } & SearchResultsWithoutSchemaField_StructuredPropertyEntity_Fragment)
                      | ({
                          __typename?: "Tag";
                        } & SearchResultsWithoutSchemaField_Tag_Fragment)
                      | ({
                          __typename?: "Test";
                        } & SearchResultsWithoutSchemaField_Test_Fragment)
                      | ({
                          __typename?: "VersionSet";
                        } & SearchResultsWithoutSchemaField_VersionSet_Fragment)
                      | ({
                          __typename?: "VersionedDataset";
                        } & SearchResultsWithoutSchemaField_VersionedDataset_Fragment)
                    >
                  >;
                }
              >
            >
          >;
        }
    >;
    facets?: Types.Maybe<
      Array<{ __typename?: "FacetMetadata" } & FacetFieldsFragment>
    >;
  };

export type GetSearchResultsQueryVariables = Types.Exact<{
  input: Types.SearchInput;
}>;

export type GetSearchResultsQuery = { __typename?: "Query" } & {
  search?: Types.Maybe<
    { __typename?: "SearchResults" } & SearchResultsFragment
  >;
};

export type GetSearchResultsForMultipleQueryVariables = Types.Exact<{
  input: Types.SearchAcrossEntitiesInput;
}>;

export type GetSearchResultsForMultipleQuery = { __typename?: "Query" } & {
  searchAcrossEntities?: Types.Maybe<
    { __typename?: "SearchResults" } & SearchResultsFragment
  >;
};

export type GetSearchResultsForMultipleTrimmedQueryVariables = Types.Exact<{
  input: Types.SearchAcrossEntitiesInput;
}>;

export type GetSearchResultsForMultipleTrimmedQuery = {
  __typename?: "Query";
} & {
  searchAcrossEntities?: Types.Maybe<
    { __typename?: "SearchResults" } & {
      searchResults: Array<
        { __typename?: "SearchResult" } & {
          entity:
            | ({
                __typename?: "AccessTokenMetadata";
              } & AutoCompleteFields_AccessTokenMetadata_Fragment)
            | ({
                __typename?: "Application";
              } & AutoCompleteFields_Application_Fragment)
            | ({
                __typename?: "Assertion";
              } & AutoCompleteFields_Assertion_Fragment)
            | ({
                __typename?: "BusinessAttribute";
              } & AutoCompleteFields_BusinessAttribute_Fragment)
            | ({ __typename?: "Chart" } & AutoCompleteFields_Chart_Fragment)
            | ({
                __typename?: "Container";
              } & AutoCompleteFields_Container_Fragment)
            | ({
                __typename?: "CorpGroup";
              } & AutoCompleteFields_CorpGroup_Fragment)
            | ({
                __typename?: "CorpUser";
              } & AutoCompleteFields_CorpUser_Fragment)
            | ({
                __typename?: "Dashboard";
              } & AutoCompleteFields_Dashboard_Fragment)
            | ({
                __typename?: "DataContract";
              } & AutoCompleteFields_DataContract_Fragment)
            | ({
                __typename?: "DataFlow";
              } & AutoCompleteFields_DataFlow_Fragment)
            | ({
                __typename?: "DataHubConnection";
              } & AutoCompleteFields_DataHubConnection_Fragment)
            | ({
                __typename?: "DataHubFile";
              } & AutoCompleteFields_DataHubFile_Fragment)
            | ({
                __typename?: "DataHubPageModule";
              } & AutoCompleteFields_DataHubPageModule_Fragment)
            | ({
                __typename?: "DataHubPageTemplate";
              } & AutoCompleteFields_DataHubPageTemplate_Fragment)
            | ({
                __typename?: "DataHubPolicy";
              } & AutoCompleteFields_DataHubPolicy_Fragment)
            | ({
                __typename?: "DataHubRole";
              } & AutoCompleteFields_DataHubRole_Fragment)
            | ({
                __typename?: "DataHubView";
              } & AutoCompleteFields_DataHubView_Fragment)
            | ({ __typename?: "DataJob" } & AutoCompleteFields_DataJob_Fragment)
            | ({
                __typename?: "DataPlatform";
              } & AutoCompleteFields_DataPlatform_Fragment)
            | ({
                __typename?: "DataPlatformInstance";
              } & AutoCompleteFields_DataPlatformInstance_Fragment)
            | ({
                __typename?: "DataProcessInstance";
              } & AutoCompleteFields_DataProcessInstance_Fragment)
            | ({
                __typename?: "DataProduct";
              } & AutoCompleteFields_DataProduct_Fragment)
            | ({
                __typename?: "DataTypeEntity";
              } & AutoCompleteFields_DataTypeEntity_Fragment)
            | ({ __typename?: "Dataset" } & AutoCompleteFields_Dataset_Fragment)
            | ({ __typename?: "Domain" } & AutoCompleteFields_Domain_Fragment)
            | ({
                __typename?: "ERModelRelationship";
              } & AutoCompleteFields_ErModelRelationship_Fragment)
            | ({
                __typename?: "EntityTypeEntity";
              } & AutoCompleteFields_EntityTypeEntity_Fragment)
            | ({
                __typename?: "ExecutionRequest";
              } & AutoCompleteFields_ExecutionRequest_Fragment)
            | ({ __typename?: "Form" } & AutoCompleteFields_Form_Fragment)
            | ({
                __typename?: "GlossaryNode";
              } & AutoCompleteFields_GlossaryNode_Fragment)
            | ({
                __typename?: "GlossaryTerm";
              } & AutoCompleteFields_GlossaryTerm_Fragment)
            | ({
                __typename?: "Incident";
              } & AutoCompleteFields_Incident_Fragment)
            | ({
                __typename?: "MLFeature";
              } & AutoCompleteFields_MlFeature_Fragment)
            | ({
                __typename?: "MLFeatureTable";
              } & AutoCompleteFields_MlFeatureTable_Fragment)
            | ({ __typename?: "MLModel" } & AutoCompleteFields_MlModel_Fragment)
            | ({
                __typename?: "MLModelGroup";
              } & AutoCompleteFields_MlModelGroup_Fragment)
            | ({
                __typename?: "MLPrimaryKey";
              } & AutoCompleteFields_MlPrimaryKey_Fragment)
            | ({
                __typename?: "Notebook";
              } & AutoCompleteFields_Notebook_Fragment)
            | ({
                __typename?: "OwnershipTypeEntity";
              } & AutoCompleteFields_OwnershipTypeEntity_Fragment)
            | ({ __typename?: "Post" } & AutoCompleteFields_Post_Fragment)
            | ({
                __typename?: "QueryEntity";
              } & AutoCompleteFields_QueryEntity_Fragment)
            | ({
                __typename?: "Restricted";
              } & AutoCompleteFields_Restricted_Fragment)
            | ({ __typename?: "Role" } & AutoCompleteFields_Role_Fragment)
            | ({
                __typename?: "SchemaFieldEntity";
              } & AutoCompleteFields_SchemaFieldEntity_Fragment)
            | ({
                __typename?: "StructuredPropertyEntity";
              } & AutoCompleteFields_StructuredPropertyEntity_Fragment)
            | ({ __typename?: "Tag" } & AutoCompleteFields_Tag_Fragment)
            | ({ __typename?: "Test" } & AutoCompleteFields_Test_Fragment)
            | ({
                __typename?: "VersionSet";
              } & AutoCompleteFields_VersionSet_Fragment)
            | ({
                __typename?: "VersionedDataset";
              } & AutoCompleteFields_VersionedDataset_Fragment);
          matchedFields: Array<
            { __typename?: "MatchedField" } & Pick<
              Types.MatchedField,
              "name" | "value"
            > & {
                entity?: Types.Maybe<
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
                  | ({ __typename?: "Chart" } & Pick<
                      Types.Chart,
                      "urn" | "type"
                    > &
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
                  | ({ __typename?: "Form" } & Pick<
                      Types.Form,
                      "urn" | "type"
                    > &
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
                  | ({ __typename?: "Post" } & Pick<
                      Types.Post,
                      "urn" | "type"
                    > &
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
                  | ({ __typename?: "Role" } & Pick<
                      Types.Role,
                      "urn" | "type"
                    > &
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
                  | ({ __typename?: "Test" } & Pick<
                      Types.Test,
                      "urn" | "type"
                    > &
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
                      EntityDisplayNameFields_VersionedDataset_Fragment)
                >;
              }
          >;
        }
      >;
      facets?: Types.Maybe<
        Array<{ __typename?: "FacetMetadata" } & FacetFieldsFragment>
      >;
    }
  >;
};

export type GetSearchCountQueryVariables = Types.Exact<{
  input: Types.SearchAcrossEntitiesInput;
}>;

export type GetSearchCountQuery = { __typename?: "Query" } & {
  searchAcrossEntities?: Types.Maybe<
    { __typename?: "SearchResults" } & Pick<Types.SearchResults, "total">
  >;
};

export type SearchAcrossLineageQueryVariables = Types.Exact<{
  input: Types.SearchAcrossLineageInput;
  includeAssertions?: Types.Maybe<Types.Scalars["Boolean"]>;
}>;

export type SearchAcrossLineageQuery = { __typename?: "Query" } & {
  searchAcrossLineage?: Types.Maybe<
    {
      __typename?: "SearchAcrossLineageResults";
    } & SearchAcrossRelationshipResultsFragment
  >;
};

export type SearchAcrossLineageCountQueryVariables = Types.Exact<{
  input: Types.SearchAcrossLineageInput;
}>;

export type SearchAcrossLineageCountQuery = { __typename?: "Query" } & {
  searchAcrossLineage?: Types.Maybe<
    { __typename?: "SearchAcrossLineageResults" } & Pick<
      Types.SearchAcrossLineageResults,
      "total"
    >
  >;
};

export type SearchAcrossLineageStructureQueryVariables = Types.Exact<{
  input: Types.SearchAcrossLineageInput;
}>;

export type SearchAcrossLineageStructureQuery = { __typename?: "Query" } & {
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

export type AggregateAcrossLineageQueryVariables = Types.Exact<{
  input: Types.SearchAcrossLineageInput;
}>;

export type AggregateAcrossLineageQuery = { __typename?: "Query" } & {
  searchAcrossLineage?: Types.Maybe<
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

export type GetEntityMentionNodeQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetEntityMentionNodeQuery = { __typename?: "Query" } & {
  entity?: Types.Maybe<
    | ({ __typename?: "AccessTokenMetadata" } & Pick<
        Types.AccessTokenMetadata,
        "urn" | "type"
      > &
        SearchResultFields_AccessTokenMetadata_Fragment)
    | ({ __typename?: "Application" } & Pick<
        Types.Application,
        "urn" | "type"
      > &
        SearchResultFields_Application_Fragment)
    | ({ __typename?: "Assertion" } & Pick<Types.Assertion, "urn" | "type"> &
        SearchResultFields_Assertion_Fragment)
    | ({ __typename?: "BusinessAttribute" } & Pick<
        Types.BusinessAttribute,
        "urn" | "type"
      > &
        SearchResultFields_BusinessAttribute_Fragment)
    | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type"> &
        SearchResultFields_Chart_Fragment)
    | ({ __typename?: "Container" } & Pick<Types.Container, "urn" | "type"> &
        SearchResultFields_Container_Fragment)
    | ({ __typename?: "CorpGroup" } & Pick<Types.CorpGroup, "urn" | "type"> &
        SearchResultFields_CorpGroup_Fragment)
    | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type"> &
        SearchResultFields_CorpUser_Fragment)
    | ({ __typename?: "Dashboard" } & Pick<Types.Dashboard, "urn" | "type"> &
        SearchResultFields_Dashboard_Fragment)
    | ({ __typename?: "DataContract" } & Pick<
        Types.DataContract,
        "urn" | "type"
      > &
        SearchResultFields_DataContract_Fragment)
    | ({ __typename?: "DataFlow" } & Pick<Types.DataFlow, "urn" | "type"> &
        SearchResultFields_DataFlow_Fragment)
    | ({ __typename?: "DataHubConnection" } & Pick<
        Types.DataHubConnection,
        "urn" | "type"
      > &
        SearchResultFields_DataHubConnection_Fragment)
    | ({ __typename?: "DataHubFile" } & Pick<
        Types.DataHubFile,
        "urn" | "type"
      > &
        SearchResultFields_DataHubFile_Fragment)
    | ({ __typename?: "DataHubPageModule" } & Pick<
        Types.DataHubPageModule,
        "urn" | "type"
      > &
        SearchResultFields_DataHubPageModule_Fragment)
    | ({ __typename?: "DataHubPageTemplate" } & Pick<
        Types.DataHubPageTemplate,
        "urn" | "type"
      > &
        SearchResultFields_DataHubPageTemplate_Fragment)
    | ({ __typename?: "DataHubPolicy" } & Pick<
        Types.DataHubPolicy,
        "urn" | "type"
      > &
        SearchResultFields_DataHubPolicy_Fragment)
    | ({ __typename?: "DataHubRole" } & Pick<
        Types.DataHubRole,
        "urn" | "type"
      > &
        SearchResultFields_DataHubRole_Fragment)
    | ({ __typename?: "DataHubView" } & Pick<
        Types.DataHubView,
        "urn" | "type"
      > &
        SearchResultFields_DataHubView_Fragment)
    | ({ __typename?: "DataJob" } & Pick<Types.DataJob, "urn" | "type"> &
        SearchResultFields_DataJob_Fragment)
    | ({ __typename?: "DataPlatform" } & Pick<
        Types.DataPlatform,
        "urn" | "type"
      > &
        SearchResultFields_DataPlatform_Fragment)
    | ({ __typename?: "DataPlatformInstance" } & Pick<
        Types.DataPlatformInstance,
        "urn" | "type"
      > &
        SearchResultFields_DataPlatformInstance_Fragment)
    | ({ __typename?: "DataProcessInstance" } & Pick<
        Types.DataProcessInstance,
        "urn" | "type"
      > &
        SearchResultFields_DataProcessInstance_Fragment)
    | ({ __typename?: "DataProduct" } & Pick<
        Types.DataProduct,
        "urn" | "type"
      > &
        SearchResultFields_DataProduct_Fragment)
    | ({ __typename?: "DataTypeEntity" } & Pick<
        Types.DataTypeEntity,
        "urn" | "type"
      > &
        SearchResultFields_DataTypeEntity_Fragment)
    | ({ __typename?: "Dataset" } & Pick<Types.Dataset, "urn" | "type"> &
        SearchResultFields_Dataset_Fragment)
    | ({ __typename?: "Domain" } & Pick<Types.Domain, "urn" | "type"> &
        SearchResultFields_Domain_Fragment)
    | ({ __typename?: "ERModelRelationship" } & Pick<
        Types.ErModelRelationship,
        "urn" | "type"
      > &
        SearchResultFields_ErModelRelationship_Fragment)
    | ({ __typename?: "EntityTypeEntity" } & Pick<
        Types.EntityTypeEntity,
        "urn" | "type"
      > &
        SearchResultFields_EntityTypeEntity_Fragment)
    | ({ __typename?: "ExecutionRequest" } & Pick<
        Types.ExecutionRequest,
        "urn" | "type"
      > &
        SearchResultFields_ExecutionRequest_Fragment)
    | ({ __typename?: "Form" } & Pick<Types.Form, "urn" | "type"> &
        SearchResultFields_Form_Fragment)
    | ({ __typename?: "GlossaryNode" } & Pick<
        Types.GlossaryNode,
        "urn" | "type"
      > &
        SearchResultFields_GlossaryNode_Fragment)
    | ({ __typename?: "GlossaryTerm" } & Pick<
        Types.GlossaryTerm,
        "urn" | "type"
      > &
        SearchResultFields_GlossaryTerm_Fragment)
    | ({ __typename?: "Incident" } & Pick<Types.Incident, "urn" | "type"> &
        SearchResultFields_Incident_Fragment)
    | ({ __typename?: "MLFeature" } & Pick<Types.MlFeature, "urn" | "type"> &
        SearchResultFields_MlFeature_Fragment)
    | ({ __typename?: "MLFeatureTable" } & Pick<
        Types.MlFeatureTable,
        "urn" | "type"
      > &
        SearchResultFields_MlFeatureTable_Fragment)
    | ({ __typename?: "MLModel" } & Pick<Types.MlModel, "urn" | "type"> &
        SearchResultFields_MlModel_Fragment)
    | ({ __typename?: "MLModelGroup" } & Pick<
        Types.MlModelGroup,
        "urn" | "type"
      > &
        SearchResultFields_MlModelGroup_Fragment)
    | ({ __typename?: "MLPrimaryKey" } & Pick<
        Types.MlPrimaryKey,
        "urn" | "type"
      > &
        SearchResultFields_MlPrimaryKey_Fragment)
    | ({ __typename?: "Notebook" } & Pick<Types.Notebook, "urn" | "type"> &
        SearchResultFields_Notebook_Fragment)
    | ({ __typename?: "OwnershipTypeEntity" } & Pick<
        Types.OwnershipTypeEntity,
        "urn" | "type"
      > &
        SearchResultFields_OwnershipTypeEntity_Fragment)
    | ({ __typename?: "Post" } & Pick<Types.Post, "urn" | "type"> &
        SearchResultFields_Post_Fragment)
    | ({ __typename?: "QueryEntity" } & Pick<
        Types.QueryEntity,
        "urn" | "type"
      > &
        SearchResultFields_QueryEntity_Fragment)
    | ({ __typename?: "Restricted" } & Pick<Types.Restricted, "urn" | "type"> &
        SearchResultFields_Restricted_Fragment)
    | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type"> &
        SearchResultFields_Role_Fragment)
    | ({ __typename?: "SchemaFieldEntity" } & Pick<
        Types.SchemaFieldEntity,
        "urn" | "type"
      > &
        SearchResultFields_SchemaFieldEntity_Fragment)
    | ({ __typename?: "StructuredPropertyEntity" } & Pick<
        Types.StructuredPropertyEntity,
        "urn" | "type"
      > &
        SearchResultFields_StructuredPropertyEntity_Fragment)
    | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn" | "type"> &
        SearchResultFields_Tag_Fragment)
    | ({ __typename?: "Test" } & Pick<Types.Test, "urn" | "type"> &
        SearchResultFields_Test_Fragment)
    | ({ __typename?: "VersionSet" } & Pick<Types.VersionSet, "urn" | "type"> &
        SearchResultFields_VersionSet_Fragment)
    | ({ __typename?: "VersionedDataset" } & Pick<
        Types.VersionedDataset,
        "urn" | "type"
      > &
        SearchResultFields_VersionedDataset_Fragment)
  >;
};

export type GetEntityDisplayNameQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetEntityDisplayNameQuery = { __typename?: "Query" } & {
  entity?: Types.Maybe<
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
    | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn" | "type"> &
        EntityDisplayNameFields_Chart_Fragment)
    | ({ __typename?: "Container" } & Pick<Types.Container, "urn" | "type"> &
        EntityDisplayNameFields_Container_Fragment)
    | ({ __typename?: "CorpGroup" } & Pick<Types.CorpGroup, "urn" | "type"> &
        EntityDisplayNameFields_CorpGroup_Fragment)
    | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type"> &
        EntityDisplayNameFields_CorpUser_Fragment)
    | ({ __typename?: "Dashboard" } & Pick<Types.Dashboard, "urn" | "type"> &
        EntityDisplayNameFields_Dashboard_Fragment)
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
    | ({ __typename?: "Dataset" } & Pick<Types.Dataset, "urn" | "type"> &
        EntityDisplayNameFields_Dataset_Fragment)
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
    | ({ __typename?: "Restricted" } & Pick<Types.Restricted, "urn" | "type"> &
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
    | ({ __typename?: "VersionSet" } & Pick<Types.VersionSet, "urn" | "type"> &
        EntityDisplayNameFields_VersionSet_Fragment)
    | ({ __typename?: "VersionedDataset" } & Pick<
        Types.VersionedDataset,
        "urn" | "type"
      > &
        EntityDisplayNameFields_VersionedDataset_Fragment)
  >;
};

export type AggregateAcrossEntitiesQueryVariables = Types.Exact<{
  input: Types.AggregateAcrossEntitiesInput;
}>;

export type AggregateAcrossEntitiesQuery = { __typename?: "Query" } & {
  aggregateAcrossEntities?: Types.Maybe<
    { __typename?: "AggregateResults" } & {
      facets?: Types.Maybe<
        Array<{ __typename?: "FacetMetadata" } & FacetFieldsFragment>
      >;
    }
  >;
};

export type ListDataProductAssetsQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  input: Types.SearchAcrossEntitiesInput;
}>;

export type ListDataProductAssetsQuery = { __typename?: "Query" } & {
  listDataProductAssets?: Types.Maybe<
    { __typename?: "SearchResults" } & SearchResultsFragment
  >;
};

export type ScrollAcrossEntitiesQueryVariables = Types.Exact<{
  input: Types.ScrollAcrossEntitiesInput;
}>;

export type ScrollAcrossEntitiesQuery = { __typename?: "Query" } & {
  scrollAcrossEntities?: Types.Maybe<
    { __typename?: "ScrollResults" } & ScrollResultsFragment
  >;
};

export const DatasetStatsFieldsFragmentDoc = gql`
  fragment datasetStatsFields on Dataset {
    lastProfile: datasetProfiles(limit: 1) {
      rowCount
      columnCount
      sizeInBytes
      timestampMillis
    }
    lastOperation: operations(limit: 1) {
      lastUpdatedTimestamp
      timestampMillis
    }
    statsSummary {
      queryCountLast30Days
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
  }
`;
export const GetRolesNameFragmentDoc = gql`
  fragment getRolesName on Role {
    urn
    type
    id
    properties {
      name
      description
      type
    }
  }
`;
export const GetAccessFragmentDoc = gql`
  fragment getAccess on Access {
    roles {
      role {
        ...getRolesName
      }
    }
  }
  ${GetRolesNameFragmentDoc}
`;
export const AutoCompleteFieldsFragmentDoc = gql`
  fragment autoCompleteFields on Entity {
    urn
    type
    ... on Dataset {
      exists
      name
      platform {
        ...platformFields
      }
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
      properties {
        name
        qualifiedName
        lastModified {
          time
          actor
        }
      }
      parentContainers {
        ...parentContainersFields
      }
      subTypes {
        typeNames
      }
      siblings {
        isPrimary
        siblings {
          urn
          type
          ... on Dataset {
            exists
            platform {
              ...platformFields
            }
            parentContainers {
              ...parentContainersFields
            }
            name
            properties {
              name
              description
              qualifiedName
              externalUrl
              lastModified {
                time
                actor
              }
            }
          }
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
              platform {
                ...platformFields
              }
              parentContainers {
                ...parentContainersFields
              }
              name
              properties {
                name
                description
                qualifiedName
                externalUrl
                lastModified {
                  time
                  actor
                }
              }
            }
          }
        }
      }
      ...datasetStatsFields
      access {
        ...getAccess
      }
      browsePathV2 {
        ...browsePathV2Fields
      }
    }
    ... on Role {
      id
      properties {
        name
        description
      }
    }
    ... on CorpUser {
      username
      properties {
        displayName
        title
        firstName
        lastName
        fullName
      }
      editableProperties {
        displayName
        pictureLink
      }
    }
    ... on CorpGroup {
      name
      info {
        displayName
      }
    }
    ... on Dashboard {
      properties {
        name
      }
      platform {
        ...platformFields
      }
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
      parentContainers {
        ...parentContainersFields
      }
      subTypes {
        typeNames
      }
      browsePathV2 {
        ...browsePathV2Fields
      }
    }
    ... on Chart {
      chartId
      properties {
        name
      }
      platform {
        ...platformFields
      }
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
      parentContainers {
        ...parentContainersFields
      }
      subTypes {
        typeNames
      }
      browsePathV2 {
        ...browsePathV2Fields
      }
    }
    ... on DataFlow {
      orchestrator
      properties {
        name
      }
      platform {
        ...platformFields
      }
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
      parentContainers {
        ...parentContainersFields
      }
      subTypes {
        typeNames
      }
    }
    ... on DataJob {
      dataFlow {
        orchestrator
        platform {
          ...platformFields
        }
        dataPlatformInstance {
          ...dataPlatformInstanceFields
        }
      }
      jobId
      properties {
        name
      }
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
      parentContainers {
        ...parentContainersFields
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
      }
      parentNodes {
        ...parentNodesFields
      }
    }
    ... on GlossaryNode {
      properties {
        name
      }
    }
    ... on Domain {
      properties {
        name
      }
      parentDomains {
        ...parentDomainsFields
      }
      displayProperties {
        ...displayPropertiesFields
      }
    }
    ... on DataProduct {
      properties {
        name
      }
      domain {
        domain {
          urn
          type
          properties {
            name
          }
          parentDomains {
            ...parentDomainsFields
          }
        }
      }
    }
    ... on Application {
      properties {
        name
      }
    }
    ... on Container {
      properties {
        name
      }
      platform {
        ...platformFields
      }
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
      parentContainers {
        ...parentContainersFields
      }
      subTypes {
        typeNames
      }
      browsePathV2 {
        ...browsePathV2Fields
      }
    }
    ... on Tag {
      name
      properties {
        name
        colorHex
      }
    }
    ... on MLFeatureTable {
      name
      platform {
        ...platformFields
      }
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
    }
    ... on MLFeature {
      name
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
      featureTables: relationships(
        input: { types: ["Contains"], direction: INCOMING, start: 0, count: 1 }
      ) {
        relationships {
          entity {
            ... on MLFeatureTable {
              platform {
                ...platformFields
              }
            }
          }
        }
      }
    }
    ... on MLPrimaryKey {
      name
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
      featureTables: relationships(
        input: { types: ["KeyedBy"], direction: INCOMING, start: 0, count: 1 }
      ) {
        relationships {
          entity {
            ... on MLFeatureTable {
              platform {
                ...platformFields
              }
            }
          }
        }
      }
    }
    ... on MLModel {
      name
      platform {
        ...platformFields
      }
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
    }
    ... on MLModelGroup {
      name
      platform {
        ...platformFields
      }
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
    }
    ... on DataPlatform {
      ...nonConflictingPlatformFields
    }
    ... on BusinessAttribute {
      properties {
        name
        description
      }
    }
    ... on SchemaFieldEntity {
      fieldPath
      parent {
        ... on Dataset {
          urn
          type
          ...entityDisplayNameFields
          platform {
            ...platformFields
          }
        }
      }
    }
    ... on DataPlatformInstance {
      ...dataPlatformInstanceFields
    }
  }
  ${PlatformFieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${ParentContainersFieldsFragmentDoc}
  ${DatasetStatsFieldsFragmentDoc}
  ${GetAccessFragmentDoc}
  ${BrowsePathV2FieldsFragmentDoc}
  ${ParentNodesFieldsFragmentDoc}
  ${ParentDomainsFieldsFragmentDoc}
  ${DisplayPropertiesFieldsFragmentDoc}
  ${NonConflictingPlatformFieldsFragmentDoc}
  ${EntityDisplayNameFieldsFragmentDoc}
`;
export const NonSiblingsDatasetSearchFieldsFragmentDoc = gql`
  fragment nonSiblingsDatasetSearchFields on Dataset {
    exists
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
      name
      description
    }
    access {
      ...getAccess
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
      lastModified {
        time
        actor
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
    parentContainers {
      ...parentContainersFields
    }
    deprecation {
      ...deprecationFields
    }
    health {
      ...entityHealth
    }
    institutionalMemory {
      ...institutionalMemoryFields
    }
    ...datasetStatsFields
  }
  ${PlatformFieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${GetAccessFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${ParentContainersFieldsFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${EntityHealthFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
  ${DatasetStatsFieldsFragmentDoc}
`;
export const SearchResultsWithoutSchemaFieldFragmentDoc = gql`
  fragment searchResultsWithoutSchemaField on Entity {
    urn
    type
    ... on Dataset {
      ...nonSiblingsDatasetSearchFields
      siblings {
        isPrimary
        siblings {
          urn
          type
          ... on Dataset {
            ...nonSiblingsDatasetSearchFields
            structuredProperties {
              properties {
                ...structuredPropertiesFields
              }
            }
          }
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
              ...nonSiblingsDatasetSearchFields
              siblings {
                isPrimary
              }
              structuredProperties {
                properties {
                  ...structuredPropertiesFields
                }
              }
            }
          }
        }
      }
      browsePathV2 {
        ...browsePathV2Fields
      }
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
    }
    ... on DataPlatformInstance {
      ...dataPlatformInstanceFields
      institutionalMemory {
        ...institutionalMemoryFields
      }
    }
    ... on Role {
      id
      properties {
        name
        description
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
        departmentName
        title
      }
      info {
        active
        displayName
        title
        firstName
        lastName
        fullName
        email
        departmentName
        title
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
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
      deprecation {
        ...deprecationFields
      }
      parentContainers {
        ...parentContainersFields
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
      browsePathV2 {
        ...browsePathV2Fields
      }
      institutionalMemory {
        ...institutionalMemoryFields
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
      deprecation {
        ...deprecationFields
      }
      parentContainers {
        ...parentContainersFields
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
      institutionalMemory {
        ...institutionalMemoryFields
      }
    }
    ... on DataFlow {
      orchestrator
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
      parentContainers {
        ...parentContainersFields
      }
      deprecation {
        ...deprecationFields
      }
      childJobs: relationships(
        input: {
          types: ["IsPartOf"]
          direction: INCOMING
          start: 0
          count: 100
        }
      ) {
        total
      }
      health {
        ...entityHealth
      }
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
      subTypes {
        typeNames
      }
      institutionalMemory {
        ...institutionalMemoryFields
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
      deprecation {
        ...deprecationFields
      }
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
      parentContainers {
        ...parentContainersFields
      }
      subTypes {
        typeNames
      }
      lastRun: runs(start: 0, count: 1) {
        count
        start
        total
        runs {
          urn
          type
          created {
            time
            actor
          }
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
      institutionalMemory {
        ...institutionalMemoryFields
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
        createdOn {
          time
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
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
      institutionalMemory {
        ...institutionalMemoryFields
      }
    }
    ... on GlossaryNode {
      ...glossaryNode
      parentNodes {
        ...parentNodesFields
      }
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
      institutionalMemory {
        ...institutionalMemoryFields
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
      parentDomains {
        ...parentDomainsFields
      }
      displayProperties {
        ...displayPropertiesFields
      }
      ...domainEntitiesFields
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
      institutionalMemory {
        ...institutionalMemoryFields
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
      entities(input: {}) {
        total
      }
      deprecation {
        ...deprecationFields
      }
      parentContainers {
        ...parentContainersFields
      }
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
      institutionalMemory {
        ...institutionalMemoryFields
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
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
      institutionalMemory {
        ...institutionalMemoryFields
      }
    }
    ... on MLFeature {
      ...nonRecursiveMLFeature
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
    }
    ... on MLPrimaryKey {
      ...nonRecursiveMLPrimaryKey
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
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
      dataPlatformInstance {
        ...dataPlatformInstanceFields
      }
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
      properties {
        propertiesName: name
      }
      institutionalMemory {
        ...institutionalMemoryFields
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
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
      properties {
        propertiesName: name
      }
      institutionalMemory {
        ...institutionalMemoryFields
      }
    }
    ... on Tag {
      name
      properties {
        name
        colorHex
      }
      description
    }
    ... on DataPlatform {
      ...nonConflictingPlatformFields
    }
    ... on DataProduct {
      ...dataProductSearchFields
      structuredProperties {
        properties {
          ...structuredPropertiesFields
        }
      }
      institutionalMemory {
        ...institutionalMemoryFields
      }
    }
    ... on Application {
      ...applicationSearchFields
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
    ... on BusinessAttribute {
      ...businessAttributeFields
    }
    ... on StructuredPropertyEntity {
      ...structuredPropertyFields
    }
    ... on SupportsVersions {
      versionProperties {
        ...versionProperties
      }
    }
    ... on DataProcessInstance {
      ...dataProcessInstanceFields
    }
    ... on DataPlatformInstance {
      ...dataPlatformInstanceFields
    }
    ... on Incident {
      ...incidentFields
    }
  }
  ${NonSiblingsDatasetSearchFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${BrowsePathV2FieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${PlatformFieldsFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${ParentContainersFieldsFragmentDoc}
  ${EntityHealthFragmentDoc}
  ${NonRecursiveDataFlowFieldsFragmentDoc}
  ${ParentNodesFieldsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${GlossaryNodeFragmentDoc}
  ${ParentDomainsFieldsFragmentDoc}
  ${DisplayPropertiesFieldsFragmentDoc}
  ${DomainEntitiesFieldsFragmentDoc}
  ${NonRecursiveMlFeatureFragmentDoc}
  ${NonRecursiveMlPrimaryKeyFragmentDoc}
  ${NonConflictingPlatformFieldsFragmentDoc}
  ${DataProductSearchFieldsFragmentDoc}
  ${ApplicationSearchFieldsFragmentDoc}
  ${ErmodelrelationPropertiesFieldsFragmentDoc}
  ${ErmodelrelationEditablePropertiesFieldsFragmentDoc}
  ${BusinessAttributeFieldsFragmentDoc}
  ${StructuredPropertyFieldsFragmentDoc}
  ${VersionPropertiesFragmentDoc}
  ${DataProcessInstanceFieldsFragmentDoc}
  ${IncidentFieldsFragmentDoc}
`;
export const EntityFieldFragmentDoc = gql`
  fragment entityField on SchemaFieldEntity {
    urn
    type
    parent {
      urn
      type
      ...entityDisplayNameFields
      ... on Dataset {
        platform {
          ...platformFields
        }
        dataPlatformInstance {
          ...dataPlatformInstanceFields
        }
        parentContainers {
          ...parentContainersFields
        }
      }
    }
    fieldPath
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
  }
  ${EntityDisplayNameFieldsFragmentDoc}
  ${PlatformFieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${ParentContainersFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${BusinessAttributeFragmentDoc}
`;
export const SearchResultFieldsNoLineageFragmentDoc = gql`
  fragment searchResultFieldsNoLineage on Entity {
    ...searchResultsWithoutSchemaField
    ... on SchemaFieldEntity {
      ...entityField
    }
  }
  ${SearchResultsWithoutSchemaFieldFragmentDoc}
  ${EntityFieldFragmentDoc}
`;
export const SearchResultFieldsFragmentDoc = gql`
  fragment searchResultFields on Entity {
    ...searchResultFieldsNoLineage
    ... on EntityWithRelationships {
      upstream: lineage(input: { direction: UPSTREAM, start: 0, count: 100 }) {
        total
        filtered
      }
      downstream: lineage(
        input: { direction: DOWNSTREAM, start: 0, count: 100 }
      ) {
        total
        filtered
      }
    }
  }
  ${SearchResultFieldsNoLineageFragmentDoc}
`;
export const FacetFieldsFragmentDoc = gql`
  fragment facetFields on FacetMetadata {
    field
    displayName
    entity {
      urn
      type
      ...entityDisplayNameFields
      ... on StructuredPropertyEntity {
        definition {
          valueType {
            urn
          }
        }
      }
    }
    aggregations {
      value
      count
      entity {
        urn
        type
        ...entityDisplayNameFields
        ... on Tag {
          name
          properties {
            name
            colorHex
          }
        }
        ... on GlossaryTerm {
          name
          properties {
            name
          }
          parentNodes {
            ...parentNodesFields
          }
        }
        ... on DataPlatform {
          ...platformFields
        }
        ... on DataPlatformInstance {
          ...dataPlatformInstanceFields
        }
        ... on Domain {
          properties {
            name
          }
          parentDomains {
            ...parentDomainsFields
          }
        }
        ... on Dataset {
          platform {
            ...platformFields
          }
        }
        ... on Container {
          platform {
            ...platformFields
          }
          properties {
            name
          }
          parentContainers {
            ...parentContainersFields
          }
        }
        ... on CorpUser {
          username
          properties {
            displayName
            fullName
          }
          editableProperties {
            displayName
            pictureLink
          }
        }
        ... on CorpGroup {
          name
          properties {
            displayName
          }
        }
        ... on DataProduct {
          properties {
            name
          }
        }
        ... on Application {
          properties {
            name
          }
        }
      }
    }
  }
  ${EntityDisplayNameFieldsFragmentDoc}
  ${ParentNodesFieldsFragmentDoc}
  ${PlatformFieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${ParentDomainsFieldsFragmentDoc}
  ${ParentContainersFieldsFragmentDoc}
`;
export const SearchResultsFragmentDoc = gql`
  fragment searchResults on SearchResults {
    start
    count
    total
    searchResults {
      entity {
        ...searchResultFields
      }
      matchedFields {
        name
        value
        entity {
          urn
          type
          ...entityDisplayNameFields
        }
      }
      insights {
        text
        icon
      }
    }
    facets {
      ...facetFields
    }
    suggestions {
      text
      frequency
      score
    }
  }
  ${SearchResultFieldsFragmentDoc}
  ${EntityDisplayNameFieldsFragmentDoc}
  ${FacetFieldsFragmentDoc}
`;
export const ScrollResultsFragmentDoc = gql`
  fragment scrollResults on ScrollResults {
    count
    total
    nextScrollId
    searchResults {
      entity {
        ...searchResultFields
      }
      matchedFields {
        name
        value
        entity {
          urn
          type
          ...entityDisplayNameFields
        }
      }
      insights {
        text
        icon
      }
      extraProperties {
        name
        value
      }
    }
    facets {
      ...facetFields
    }
  }
  ${SearchResultFieldsFragmentDoc}
  ${EntityDisplayNameFieldsFragmentDoc}
  ${FacetFieldsFragmentDoc}
`;
export const SchemaFieldEntitySearchFieldsFragmentDoc = gql`
  fragment schemaFieldEntitySearchFields on SchemaFieldEntity {
    urn
    type
    fieldPath
    parent {
      ...searchResultsWithoutSchemaField
    }
  }
  ${SearchResultsWithoutSchemaFieldFragmentDoc}
`;
export const SearchAcrossRelationshipResultsFragmentDoc = gql`
  fragment searchAcrossRelationshipResults on SearchAcrossLineageResults {
    start
    count
    total
    searchResults {
      entity {
        ...searchResultFields
        ... on Dataset {
          assertions(start: 0, count: 1000) @include(if: $includeAssertions) {
            assertions {
              runEvents(status: COMPLETE, limit: 1) {
                total
                failed
                succeeded
              }
            }
          }
        }
      }
      matchedFields {
        name
        value
      }
      insights {
        text
        icon
      }
      paths {
        path {
          ...searchResultsWithoutSchemaField
          ... on SchemaFieldEntity {
            ...schemaFieldEntitySearchFields
          }
        }
      }
      degree
    }
    facets {
      ...facetFields
    }
    lineageSearchPath
  }
  ${SearchResultFieldsFragmentDoc}
  ${SearchResultsWithoutSchemaFieldFragmentDoc}
  ${SchemaFieldEntitySearchFieldsFragmentDoc}
  ${FacetFieldsFragmentDoc}
`;
export const GetAutoCompleteResultsDocument = gql`
  query getAutoCompleteResults($input: AutoCompleteInput!) {
    autoComplete(input: $input) {
      query
      suggestions
      entities {
        ...autoCompleteFields
      }
    }
  }
  ${AutoCompleteFieldsFragmentDoc}
`;

/**
 * __useGetAutoCompleteResultsQuery__
 *
 * To run a query within a React component, call `useGetAutoCompleteResultsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetAutoCompleteResultsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetAutoCompleteResultsQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useGetAutoCompleteResultsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetAutoCompleteResultsQuery,
    GetAutoCompleteResultsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetAutoCompleteResultsQuery,
    GetAutoCompleteResultsQueryVariables
  >(GetAutoCompleteResultsDocument, baseOptions);
}
export function useGetAutoCompleteResultsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetAutoCompleteResultsQuery,
    GetAutoCompleteResultsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetAutoCompleteResultsQuery,
    GetAutoCompleteResultsQueryVariables
  >(GetAutoCompleteResultsDocument, baseOptions);
}
export type GetAutoCompleteResultsQueryHookResult = ReturnType<
  typeof useGetAutoCompleteResultsQuery
>;
export type GetAutoCompleteResultsLazyQueryHookResult = ReturnType<
  typeof useGetAutoCompleteResultsLazyQuery
>;
export type GetAutoCompleteResultsQueryResult = Apollo.QueryResult<
  GetAutoCompleteResultsQuery,
  GetAutoCompleteResultsQueryVariables
>;
export const GetAutoCompleteMultipleResultsDocument = gql`
  query getAutoCompleteMultipleResults($input: AutoCompleteMultipleInput!) {
    autoCompleteForMultiple(input: $input) {
      query
      suggestions {
        type
        suggestions
        entities {
          ...autoCompleteFields
        }
      }
    }
  }
  ${AutoCompleteFieldsFragmentDoc}
`;

/**
 * __useGetAutoCompleteMultipleResultsQuery__
 *
 * To run a query within a React component, call `useGetAutoCompleteMultipleResultsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetAutoCompleteMultipleResultsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetAutoCompleteMultipleResultsQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useGetAutoCompleteMultipleResultsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetAutoCompleteMultipleResultsQuery,
    GetAutoCompleteMultipleResultsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetAutoCompleteMultipleResultsQuery,
    GetAutoCompleteMultipleResultsQueryVariables
  >(GetAutoCompleteMultipleResultsDocument, baseOptions);
}
export function useGetAutoCompleteMultipleResultsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetAutoCompleteMultipleResultsQuery,
    GetAutoCompleteMultipleResultsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetAutoCompleteMultipleResultsQuery,
    GetAutoCompleteMultipleResultsQueryVariables
  >(GetAutoCompleteMultipleResultsDocument, baseOptions);
}
export type GetAutoCompleteMultipleResultsQueryHookResult = ReturnType<
  typeof useGetAutoCompleteMultipleResultsQuery
>;
export type GetAutoCompleteMultipleResultsLazyQueryHookResult = ReturnType<
  typeof useGetAutoCompleteMultipleResultsLazyQuery
>;
export type GetAutoCompleteMultipleResultsQueryResult = Apollo.QueryResult<
  GetAutoCompleteMultipleResultsQuery,
  GetAutoCompleteMultipleResultsQueryVariables
>;
export const GetSearchResultsDocument = gql`
  query getSearchResults($input: SearchInput!) {
    search(input: $input) {
      ...searchResults
    }
  }
  ${SearchResultsFragmentDoc}
`;

/**
 * __useGetSearchResultsQuery__
 *
 * To run a query within a React component, call `useGetSearchResultsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetSearchResultsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetSearchResultsQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useGetSearchResultsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetSearchResultsQuery,
    GetSearchResultsQueryVariables
  >,
) {
  return Apollo.useQuery<GetSearchResultsQuery, GetSearchResultsQueryVariables>(
    GetSearchResultsDocument,
    baseOptions,
  );
}
export function useGetSearchResultsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetSearchResultsQuery,
    GetSearchResultsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetSearchResultsQuery,
    GetSearchResultsQueryVariables
  >(GetSearchResultsDocument, baseOptions);
}
export type GetSearchResultsQueryHookResult = ReturnType<
  typeof useGetSearchResultsQuery
>;
export type GetSearchResultsLazyQueryHookResult = ReturnType<
  typeof useGetSearchResultsLazyQuery
>;
export type GetSearchResultsQueryResult = Apollo.QueryResult<
  GetSearchResultsQuery,
  GetSearchResultsQueryVariables
>;
export const GetSearchResultsForMultipleDocument = gql`
  query getSearchResultsForMultiple($input: SearchAcrossEntitiesInput!) {
    searchAcrossEntities(input: $input) {
      ...searchResults
    }
  }
  ${SearchResultsFragmentDoc}
`;

/**
 * __useGetSearchResultsForMultipleQuery__
 *
 * To run a query within a React component, call `useGetSearchResultsForMultipleQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetSearchResultsForMultipleQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetSearchResultsForMultipleQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useGetSearchResultsForMultipleQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetSearchResultsForMultipleQuery,
    GetSearchResultsForMultipleQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetSearchResultsForMultipleQuery,
    GetSearchResultsForMultipleQueryVariables
  >(GetSearchResultsForMultipleDocument, baseOptions);
}
export function useGetSearchResultsForMultipleLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetSearchResultsForMultipleQuery,
    GetSearchResultsForMultipleQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetSearchResultsForMultipleQuery,
    GetSearchResultsForMultipleQueryVariables
  >(GetSearchResultsForMultipleDocument, baseOptions);
}
export type GetSearchResultsForMultipleQueryHookResult = ReturnType<
  typeof useGetSearchResultsForMultipleQuery
>;
export type GetSearchResultsForMultipleLazyQueryHookResult = ReturnType<
  typeof useGetSearchResultsForMultipleLazyQuery
>;
export type GetSearchResultsForMultipleQueryResult = Apollo.QueryResult<
  GetSearchResultsForMultipleQuery,
  GetSearchResultsForMultipleQueryVariables
>;
export const GetSearchResultsForMultipleTrimmedDocument = gql`
  query getSearchResultsForMultipleTrimmed($input: SearchAcrossEntitiesInput!) {
    searchAcrossEntities(input: $input) {
      searchResults {
        entity {
          ...autoCompleteFields
        }
        matchedFields {
          name
          value
          entity {
            urn
            type
            ...entityDisplayNameFields
          }
        }
      }
      facets {
        ...facetFields
      }
    }
  }
  ${AutoCompleteFieldsFragmentDoc}
  ${EntityDisplayNameFieldsFragmentDoc}
  ${FacetFieldsFragmentDoc}
`;

/**
 * __useGetSearchResultsForMultipleTrimmedQuery__
 *
 * To run a query within a React component, call `useGetSearchResultsForMultipleTrimmedQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetSearchResultsForMultipleTrimmedQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetSearchResultsForMultipleTrimmedQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useGetSearchResultsForMultipleTrimmedQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetSearchResultsForMultipleTrimmedQuery,
    GetSearchResultsForMultipleTrimmedQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetSearchResultsForMultipleTrimmedQuery,
    GetSearchResultsForMultipleTrimmedQueryVariables
  >(GetSearchResultsForMultipleTrimmedDocument, baseOptions);
}
export function useGetSearchResultsForMultipleTrimmedLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetSearchResultsForMultipleTrimmedQuery,
    GetSearchResultsForMultipleTrimmedQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetSearchResultsForMultipleTrimmedQuery,
    GetSearchResultsForMultipleTrimmedQueryVariables
  >(GetSearchResultsForMultipleTrimmedDocument, baseOptions);
}
export type GetSearchResultsForMultipleTrimmedQueryHookResult = ReturnType<
  typeof useGetSearchResultsForMultipleTrimmedQuery
>;
export type GetSearchResultsForMultipleTrimmedLazyQueryHookResult = ReturnType<
  typeof useGetSearchResultsForMultipleTrimmedLazyQuery
>;
export type GetSearchResultsForMultipleTrimmedQueryResult = Apollo.QueryResult<
  GetSearchResultsForMultipleTrimmedQuery,
  GetSearchResultsForMultipleTrimmedQueryVariables
>;
export const GetSearchCountDocument = gql`
  query getSearchCount($input: SearchAcrossEntitiesInput!) {
    searchAcrossEntities(input: $input) {
      total
    }
  }
`;

/**
 * __useGetSearchCountQuery__
 *
 * To run a query within a React component, call `useGetSearchCountQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetSearchCountQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetSearchCountQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useGetSearchCountQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetSearchCountQuery,
    GetSearchCountQueryVariables
  >,
) {
  return Apollo.useQuery<GetSearchCountQuery, GetSearchCountQueryVariables>(
    GetSearchCountDocument,
    baseOptions,
  );
}
export function useGetSearchCountLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetSearchCountQuery,
    GetSearchCountQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetSearchCountQuery, GetSearchCountQueryVariables>(
    GetSearchCountDocument,
    baseOptions,
  );
}
export type GetSearchCountQueryHookResult = ReturnType<
  typeof useGetSearchCountQuery
>;
export type GetSearchCountLazyQueryHookResult = ReturnType<
  typeof useGetSearchCountLazyQuery
>;
export type GetSearchCountQueryResult = Apollo.QueryResult<
  GetSearchCountQuery,
  GetSearchCountQueryVariables
>;
export const SearchAcrossLineageDocument = gql`
  query searchAcrossLineage(
    $input: SearchAcrossLineageInput!
    $includeAssertions: Boolean = false
  ) {
    searchAcrossLineage(input: $input) {
      ...searchAcrossRelationshipResults
    }
  }
  ${SearchAcrossRelationshipResultsFragmentDoc}
`;

/**
 * __useSearchAcrossLineageQuery__
 *
 * To run a query within a React component, call `useSearchAcrossLineageQuery` and pass it any options that fit your needs.
 * When your component renders, `useSearchAcrossLineageQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useSearchAcrossLineageQuery({
 *   variables: {
 *      input: // value for 'input'
 *      includeAssertions: // value for 'includeAssertions'
 *   },
 * });
 */
export function useSearchAcrossLineageQuery(
  baseOptions: Apollo.QueryHookOptions<
    SearchAcrossLineageQuery,
    SearchAcrossLineageQueryVariables
  >,
) {
  return Apollo.useQuery<
    SearchAcrossLineageQuery,
    SearchAcrossLineageQueryVariables
  >(SearchAcrossLineageDocument, baseOptions);
}
export function useSearchAcrossLineageLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    SearchAcrossLineageQuery,
    SearchAcrossLineageQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    SearchAcrossLineageQuery,
    SearchAcrossLineageQueryVariables
  >(SearchAcrossLineageDocument, baseOptions);
}
export type SearchAcrossLineageQueryHookResult = ReturnType<
  typeof useSearchAcrossLineageQuery
>;
export type SearchAcrossLineageLazyQueryHookResult = ReturnType<
  typeof useSearchAcrossLineageLazyQuery
>;
export type SearchAcrossLineageQueryResult = Apollo.QueryResult<
  SearchAcrossLineageQuery,
  SearchAcrossLineageQueryVariables
>;
export const SearchAcrossLineageCountDocument = gql`
  query searchAcrossLineageCount($input: SearchAcrossLineageInput!) {
    searchAcrossLineage(input: $input) {
      total
    }
  }
`;

/**
 * __useSearchAcrossLineageCountQuery__
 *
 * To run a query within a React component, call `useSearchAcrossLineageCountQuery` and pass it any options that fit your needs.
 * When your component renders, `useSearchAcrossLineageCountQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useSearchAcrossLineageCountQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useSearchAcrossLineageCountQuery(
  baseOptions: Apollo.QueryHookOptions<
    SearchAcrossLineageCountQuery,
    SearchAcrossLineageCountQueryVariables
  >,
) {
  return Apollo.useQuery<
    SearchAcrossLineageCountQuery,
    SearchAcrossLineageCountQueryVariables
  >(SearchAcrossLineageCountDocument, baseOptions);
}
export function useSearchAcrossLineageCountLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    SearchAcrossLineageCountQuery,
    SearchAcrossLineageCountQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    SearchAcrossLineageCountQuery,
    SearchAcrossLineageCountQueryVariables
  >(SearchAcrossLineageCountDocument, baseOptions);
}
export type SearchAcrossLineageCountQueryHookResult = ReturnType<
  typeof useSearchAcrossLineageCountQuery
>;
export type SearchAcrossLineageCountLazyQueryHookResult = ReturnType<
  typeof useSearchAcrossLineageCountLazyQuery
>;
export type SearchAcrossLineageCountQueryResult = Apollo.QueryResult<
  SearchAcrossLineageCountQuery,
  SearchAcrossLineageCountQueryVariables
>;
export const SearchAcrossLineageStructureDocument = gql`
  query searchAcrossLineageStructure($input: SearchAcrossLineageInput!) {
    searchAcrossLineage(input: $input) {
      start
      count
      total
      searchResults {
        entity {
          urn
          type
        }
        paths {
          path {
            urn
            type
          }
        }
        explored
        ignoredAsHop
      }
    }
  }
`;

/**
 * __useSearchAcrossLineageStructureQuery__
 *
 * To run a query within a React component, call `useSearchAcrossLineageStructureQuery` and pass it any options that fit your needs.
 * When your component renders, `useSearchAcrossLineageStructureQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useSearchAcrossLineageStructureQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useSearchAcrossLineageStructureQuery(
  baseOptions: Apollo.QueryHookOptions<
    SearchAcrossLineageStructureQuery,
    SearchAcrossLineageStructureQueryVariables
  >,
) {
  return Apollo.useQuery<
    SearchAcrossLineageStructureQuery,
    SearchAcrossLineageStructureQueryVariables
  >(SearchAcrossLineageStructureDocument, baseOptions);
}
export function useSearchAcrossLineageStructureLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    SearchAcrossLineageStructureQuery,
    SearchAcrossLineageStructureQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    SearchAcrossLineageStructureQuery,
    SearchAcrossLineageStructureQueryVariables
  >(SearchAcrossLineageStructureDocument, baseOptions);
}
export type SearchAcrossLineageStructureQueryHookResult = ReturnType<
  typeof useSearchAcrossLineageStructureQuery
>;
export type SearchAcrossLineageStructureLazyQueryHookResult = ReturnType<
  typeof useSearchAcrossLineageStructureLazyQuery
>;
export type SearchAcrossLineageStructureQueryResult = Apollo.QueryResult<
  SearchAcrossLineageStructureQuery,
  SearchAcrossLineageStructureQueryVariables
>;
export const AggregateAcrossLineageDocument = gql`
  query aggregateAcrossLineage($input: SearchAcrossLineageInput!) {
    searchAcrossLineage(input: $input) {
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
 * __useAggregateAcrossLineageQuery__
 *
 * To run a query within a React component, call `useAggregateAcrossLineageQuery` and pass it any options that fit your needs.
 * When your component renders, `useAggregateAcrossLineageQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useAggregateAcrossLineageQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useAggregateAcrossLineageQuery(
  baseOptions: Apollo.QueryHookOptions<
    AggregateAcrossLineageQuery,
    AggregateAcrossLineageQueryVariables
  >,
) {
  return Apollo.useQuery<
    AggregateAcrossLineageQuery,
    AggregateAcrossLineageQueryVariables
  >(AggregateAcrossLineageDocument, baseOptions);
}
export function useAggregateAcrossLineageLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    AggregateAcrossLineageQuery,
    AggregateAcrossLineageQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    AggregateAcrossLineageQuery,
    AggregateAcrossLineageQueryVariables
  >(AggregateAcrossLineageDocument, baseOptions);
}
export type AggregateAcrossLineageQueryHookResult = ReturnType<
  typeof useAggregateAcrossLineageQuery
>;
export type AggregateAcrossLineageLazyQueryHookResult = ReturnType<
  typeof useAggregateAcrossLineageLazyQuery
>;
export type AggregateAcrossLineageQueryResult = Apollo.QueryResult<
  AggregateAcrossLineageQuery,
  AggregateAcrossLineageQueryVariables
>;
export const GetEntityMentionNodeDocument = gql`
  query getEntityMentionNode($urn: String!) {
    entity(urn: $urn) {
      urn
      type
      ...searchResultFields
    }
  }
  ${SearchResultFieldsFragmentDoc}
`;

/**
 * __useGetEntityMentionNodeQuery__
 *
 * To run a query within a React component, call `useGetEntityMentionNodeQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetEntityMentionNodeQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetEntityMentionNodeQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetEntityMentionNodeQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetEntityMentionNodeQuery,
    GetEntityMentionNodeQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetEntityMentionNodeQuery,
    GetEntityMentionNodeQueryVariables
  >(GetEntityMentionNodeDocument, baseOptions);
}
export function useGetEntityMentionNodeLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetEntityMentionNodeQuery,
    GetEntityMentionNodeQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetEntityMentionNodeQuery,
    GetEntityMentionNodeQueryVariables
  >(GetEntityMentionNodeDocument, baseOptions);
}
export type GetEntityMentionNodeQueryHookResult = ReturnType<
  typeof useGetEntityMentionNodeQuery
>;
export type GetEntityMentionNodeLazyQueryHookResult = ReturnType<
  typeof useGetEntityMentionNodeLazyQuery
>;
export type GetEntityMentionNodeQueryResult = Apollo.QueryResult<
  GetEntityMentionNodeQuery,
  GetEntityMentionNodeQueryVariables
>;
export const GetEntityDisplayNameDocument = gql`
  query getEntityDisplayName($urn: String!) {
    entity(urn: $urn) {
      urn
      type
      ...entityDisplayNameFields
    }
  }
  ${EntityDisplayNameFieldsFragmentDoc}
`;

/**
 * __useGetEntityDisplayNameQuery__
 *
 * To run a query within a React component, call `useGetEntityDisplayNameQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetEntityDisplayNameQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetEntityDisplayNameQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetEntityDisplayNameQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetEntityDisplayNameQuery,
    GetEntityDisplayNameQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetEntityDisplayNameQuery,
    GetEntityDisplayNameQueryVariables
  >(GetEntityDisplayNameDocument, baseOptions);
}
export function useGetEntityDisplayNameLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetEntityDisplayNameQuery,
    GetEntityDisplayNameQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetEntityDisplayNameQuery,
    GetEntityDisplayNameQueryVariables
  >(GetEntityDisplayNameDocument, baseOptions);
}
export type GetEntityDisplayNameQueryHookResult = ReturnType<
  typeof useGetEntityDisplayNameQuery
>;
export type GetEntityDisplayNameLazyQueryHookResult = ReturnType<
  typeof useGetEntityDisplayNameLazyQuery
>;
export type GetEntityDisplayNameQueryResult = Apollo.QueryResult<
  GetEntityDisplayNameQuery,
  GetEntityDisplayNameQueryVariables
>;
export const AggregateAcrossEntitiesDocument = gql`
  query aggregateAcrossEntities($input: AggregateAcrossEntitiesInput!) {
    aggregateAcrossEntities(input: $input) {
      facets {
        ...facetFields
      }
    }
  }
  ${FacetFieldsFragmentDoc}
`;

/**
 * __useAggregateAcrossEntitiesQuery__
 *
 * To run a query within a React component, call `useAggregateAcrossEntitiesQuery` and pass it any options that fit your needs.
 * When your component renders, `useAggregateAcrossEntitiesQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useAggregateAcrossEntitiesQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useAggregateAcrossEntitiesQuery(
  baseOptions: Apollo.QueryHookOptions<
    AggregateAcrossEntitiesQuery,
    AggregateAcrossEntitiesQueryVariables
  >,
) {
  return Apollo.useQuery<
    AggregateAcrossEntitiesQuery,
    AggregateAcrossEntitiesQueryVariables
  >(AggregateAcrossEntitiesDocument, baseOptions);
}
export function useAggregateAcrossEntitiesLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    AggregateAcrossEntitiesQuery,
    AggregateAcrossEntitiesQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    AggregateAcrossEntitiesQuery,
    AggregateAcrossEntitiesQueryVariables
  >(AggregateAcrossEntitiesDocument, baseOptions);
}
export type AggregateAcrossEntitiesQueryHookResult = ReturnType<
  typeof useAggregateAcrossEntitiesQuery
>;
export type AggregateAcrossEntitiesLazyQueryHookResult = ReturnType<
  typeof useAggregateAcrossEntitiesLazyQuery
>;
export type AggregateAcrossEntitiesQueryResult = Apollo.QueryResult<
  AggregateAcrossEntitiesQuery,
  AggregateAcrossEntitiesQueryVariables
>;
export const ListDataProductAssetsDocument = gql`
  query listDataProductAssets(
    $urn: String!
    $input: SearchAcrossEntitiesInput!
  ) {
    listDataProductAssets(urn: $urn, input: $input) {
      ...searchResults
    }
  }
  ${SearchResultsFragmentDoc}
`;

/**
 * __useListDataProductAssetsQuery__
 *
 * To run a query within a React component, call `useListDataProductAssetsQuery` and pass it any options that fit your needs.
 * When your component renders, `useListDataProductAssetsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useListDataProductAssetsQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      input: // value for 'input'
 *   },
 * });
 */
export function useListDataProductAssetsQuery(
  baseOptions: Apollo.QueryHookOptions<
    ListDataProductAssetsQuery,
    ListDataProductAssetsQueryVariables
  >,
) {
  return Apollo.useQuery<
    ListDataProductAssetsQuery,
    ListDataProductAssetsQueryVariables
  >(ListDataProductAssetsDocument, baseOptions);
}
export function useListDataProductAssetsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    ListDataProductAssetsQuery,
    ListDataProductAssetsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    ListDataProductAssetsQuery,
    ListDataProductAssetsQueryVariables
  >(ListDataProductAssetsDocument, baseOptions);
}
export type ListDataProductAssetsQueryHookResult = ReturnType<
  typeof useListDataProductAssetsQuery
>;
export type ListDataProductAssetsLazyQueryHookResult = ReturnType<
  typeof useListDataProductAssetsLazyQuery
>;
export type ListDataProductAssetsQueryResult = Apollo.QueryResult<
  ListDataProductAssetsQuery,
  ListDataProductAssetsQueryVariables
>;
export const ScrollAcrossEntitiesDocument = gql`
  query scrollAcrossEntities($input: ScrollAcrossEntitiesInput!) {
    scrollAcrossEntities(input: $input) {
      ...scrollResults
    }
  }
  ${ScrollResultsFragmentDoc}
`;

/**
 * __useScrollAcrossEntitiesQuery__
 *
 * To run a query within a React component, call `useScrollAcrossEntitiesQuery` and pass it any options that fit your needs.
 * When your component renders, `useScrollAcrossEntitiesQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useScrollAcrossEntitiesQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useScrollAcrossEntitiesQuery(
  baseOptions: Apollo.QueryHookOptions<
    ScrollAcrossEntitiesQuery,
    ScrollAcrossEntitiesQueryVariables
  >,
) {
  return Apollo.useQuery<
    ScrollAcrossEntitiesQuery,
    ScrollAcrossEntitiesQueryVariables
  >(ScrollAcrossEntitiesDocument, baseOptions);
}
export function useScrollAcrossEntitiesLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    ScrollAcrossEntitiesQuery,
    ScrollAcrossEntitiesQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    ScrollAcrossEntitiesQuery,
    ScrollAcrossEntitiesQueryVariables
  >(ScrollAcrossEntitiesDocument, baseOptions);
}
export type ScrollAcrossEntitiesQueryHookResult = ReturnType<
  typeof useScrollAcrossEntitiesQuery
>;
export type ScrollAcrossEntitiesLazyQueryHookResult = ReturnType<
  typeof useScrollAcrossEntitiesLazyQuery
>;
export type ScrollAcrossEntitiesQueryResult = Apollo.QueryResult<
  ScrollAcrossEntitiesQuery,
  ScrollAcrossEntitiesQueryVariables
>;
