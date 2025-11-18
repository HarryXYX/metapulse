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
import {
  PartialLineageResultsFragment,
  LineageV2ResultFragment,
} from "./lineage.generated";
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
import {
  PartialLineageResultsFragmentDoc,
  LineageV2ResultFragmentDoc,
} from "./lineage.generated";
import * as Apollo from "@apollo/client";
export type DataFlowFieldsFragment = { __typename?: "DataFlow" } & Pick<
  Types.DataFlow,
  | "urn"
  | "type"
  | "exists"
  | "lastIngested"
  | "orchestrator"
  | "flowId"
  | "cluster"
> & {
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    properties?: Types.Maybe<
      { __typename?: "DataFlowProperties" } & Pick<
        Types.DataFlowProperties,
        "name" | "description" | "project" | "externalUrl"
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
    privileges?: Types.Maybe<
      { __typename?: "EntityPrivileges" } & EntityPrivilegesFragment
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "DataFlowEditableProperties" } & Pick<
        Types.DataFlowEditableProperties,
        "description"
      >
    >;
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    globalTags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
    >;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
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
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
    >;
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
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
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
  } & EntityDataProduct_DataFlow_Fragment;

export type GetDataFlowQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetDataFlowQuery = { __typename?: "Query" } & {
  dataFlow?: Types.Maybe<
    { __typename?: "DataFlow" } & {
      upstream?: Types.Maybe<
        { __typename?: "EntityLineageResult" } & PartialLineageResultsFragment
      >;
      downstream?: Types.Maybe<
        { __typename?: "EntityLineageResult" } & PartialLineageResultsFragment
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
    } & DataFlowFieldsFragment &
      Notes_DataFlow_Fragment
  >;
};

export type GetDataFlowChildJobsQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  start?: Types.Maybe<Types.Scalars["Int"]>;
  count?: Types.Maybe<Types.Scalars["Int"]>;
}>;

export type GetDataFlowChildJobsQuery = { __typename?: "Query" } & {
  dataFlow?: Types.Maybe<
    { __typename?: "DataFlow" } & {
      childJobs?: Types.Maybe<
        { __typename?: "EntityRelationshipsResult" } & Pick<
          Types.EntityRelationshipsResult,
          "start" | "count" | "total"
        > & {
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
                  | ({ __typename?: "DataJob" } & Pick<
                      Types.DataJob,
                      "urn" | "type" | "jobId"
                    > & {
                        dataFlow?: Types.Maybe<
                          { __typename?: "DataFlow" } & Pick<
                            Types.DataFlow,
                            "urn" | "type" | "orchestrator"
                          > & {
                              platform: {
                                __typename?: "DataPlatform";
                              } & PlatformFieldsFragment;
                            }
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
                        editableProperties?: Types.Maybe<
                          { __typename?: "DataJobEditableProperties" } & Pick<
                            Types.DataJobEditableProperties,
                            "description"
                          >
                        >;
                        globalTags?: Types.Maybe<
                          {
                            __typename?: "GlobalTags";
                          } & GlobalTagsFieldsFragment
                        >;
                        glossaryTerms?: Types.Maybe<
                          {
                            __typename?: "GlossaryTerms";
                          } & GlossaryTermsFragment
                        >;
                        deprecation?: Types.Maybe<
                          {
                            __typename?: "Deprecation";
                          } & DeprecationFieldsFragment
                        >;
                        subTypes?: Types.Maybe<
                          { __typename?: "SubTypes" } & Pick<
                            Types.SubTypes,
                            "typeNames"
                          >
                        >;
                      })
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
          }
      >;
    } & DataFlowFieldsFragment
  >;
};

export type GetDataFlowDagQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  start?: Types.Maybe<Types.Scalars["Int"]>;
  count?: Types.Maybe<Types.Scalars["Int"]>;
  separateSiblings?: Types.Maybe<Types.Scalars["Boolean"]>;
  startTimeMillis?: Types.Maybe<Types.Scalars["Long"]>;
  endTimeMillis?: Types.Maybe<Types.Scalars["Long"]>;
  includeGhostEntities?: Types.Maybe<Types.Scalars["Boolean"]>;
}>;

export type GetDataFlowDagQuery = { __typename?: "Query" } & {
  dataFlow?: Types.Maybe<
    { __typename?: "DataFlow" } & {
      childJobs?: Types.Maybe<
        { __typename?: "EntityRelationshipsResult" } & Pick<
          Types.EntityRelationshipsResult,
          "start" | "count" | "total"
        > & {
            relationships: Array<
              { __typename?: "EntityRelationship" } & {
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
                    > & {
                        upstream?: Types.Maybe<
                          {
                            __typename?: "EntityLineageResult";
                          } & LineageV2ResultFragment
                        >;
                      })
                  | ({ __typename?: "BusinessAttribute" } & Pick<
                      Types.BusinessAttribute,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "Chart" } & Pick<
                      Types.Chart,
                      "urn" | "type"
                    > & {
                        upstream?: Types.Maybe<
                          {
                            __typename?: "EntityLineageResult";
                          } & LineageV2ResultFragment
                        >;
                      })
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
                    > & {
                        upstream?: Types.Maybe<
                          {
                            __typename?: "EntityLineageResult";
                          } & LineageV2ResultFragment
                        >;
                      })
                  | ({ __typename?: "DataContract" } & Pick<
                      Types.DataContract,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "DataFlow" } & Pick<
                      Types.DataFlow,
                      "urn" | "type"
                    > & {
                        upstream?: Types.Maybe<
                          {
                            __typename?: "EntityLineageResult";
                          } & LineageV2ResultFragment
                        >;
                      })
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
                    > & {
                        upstream?: Types.Maybe<
                          {
                            __typename?: "EntityLineageResult";
                          } & LineageV2ResultFragment
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
                          {
                            __typename?: "EntityLineageResult";
                          } & LineageV2ResultFragment
                        >;
                      })
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
                        upstream?: Types.Maybe<
                          {
                            __typename?: "EntityLineageResult";
                          } & LineageV2ResultFragment
                        >;
                      })
                  | ({ __typename?: "Domain" } & Pick<
                      Types.Domain,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "ERModelRelationship" } & Pick<
                      Types.ErModelRelationship,
                      "urn" | "type"
                    > & {
                        upstream?: Types.Maybe<
                          {
                            __typename?: "EntityLineageResult";
                          } & LineageV2ResultFragment
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
                  | ({ __typename?: "Incident" } & Pick<
                      Types.Incident,
                      "urn" | "type"
                    >)
                  | ({ __typename?: "MLFeature" } & Pick<
                      Types.MlFeature,
                      "urn" | "type"
                    > & {
                        upstream?: Types.Maybe<
                          {
                            __typename?: "EntityLineageResult";
                          } & LineageV2ResultFragment
                        >;
                      })
                  | ({ __typename?: "MLFeatureTable" } & Pick<
                      Types.MlFeatureTable,
                      "urn" | "type"
                    > & {
                        upstream?: Types.Maybe<
                          {
                            __typename?: "EntityLineageResult";
                          } & LineageV2ResultFragment
                        >;
                      })
                  | ({ __typename?: "MLModel" } & Pick<
                      Types.MlModel,
                      "urn" | "type"
                    > & {
                        upstream?: Types.Maybe<
                          {
                            __typename?: "EntityLineageResult";
                          } & LineageV2ResultFragment
                        >;
                      })
                  | ({ __typename?: "MLModelGroup" } & Pick<
                      Types.MlModelGroup,
                      "urn" | "type"
                    > & {
                        upstream?: Types.Maybe<
                          {
                            __typename?: "EntityLineageResult";
                          } & LineageV2ResultFragment
                        >;
                      })
                  | ({ __typename?: "MLPrimaryKey" } & Pick<
                      Types.MlPrimaryKey,
                      "urn" | "type"
                    > & {
                        upstream?: Types.Maybe<
                          {
                            __typename?: "EntityLineageResult";
                          } & LineageV2ResultFragment
                        >;
                      })
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
                    > & {
                        upstream?: Types.Maybe<
                          {
                            __typename?: "EntityLineageResult";
                          } & LineageV2ResultFragment
                        >;
                      })
                  | ({ __typename?: "Role" } & Pick<Types.Role, "urn" | "type">)
                  | ({ __typename?: "SchemaFieldEntity" } & Pick<
                      Types.SchemaFieldEntity,
                      "urn" | "type"
                    > & {
                        upstream?: Types.Maybe<
                          {
                            __typename?: "EntityLineageResult";
                          } & LineageV2ResultFragment
                        >;
                      })
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
          }
      >;
    }
  >;
};

export type UpdateDataFlowMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  input: Types.DataFlowUpdateInput;
}>;

export type UpdateDataFlowMutation = { __typename?: "Mutation" } & {
  updateDataFlow?: Types.Maybe<
    { __typename?: "DataFlow" } & Pick<Types.DataFlow, "urn">
  >;
};

export const DataFlowFieldsFragmentDoc = gql`
  fragment dataFlowFields on DataFlow {
    urn
    type
    exists
    lastIngested
    orchestrator
    flowId
    cluster
    platform {
      ...platformFields
    }
    properties {
      name
      description
      project
      externalUrl
      customProperties {
        key
        value
      }
    }
    privileges {
      ...entityPrivileges
    }
    editableProperties {
      description
    }
    ownership {
      ...ownershipFields
    }
    globalTags {
      ...globalTagsFields
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
    ...entityDataProduct
    status {
      removed
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
    browsePathV2 {
      ...browsePathV2Fields
    }
    health {
      ...entityHealth
    }
    activeIncidents: incidents(start: 0, count: 1, state: ACTIVE) {
      total
    }
    subTypes {
      typeNames
    }
  }
  ${PlatformFieldsFragmentDoc}
  ${EntityPrivilegesFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityDataProductFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${ParentContainersFieldsFragmentDoc}
  ${BrowsePathV2FieldsFragmentDoc}
  ${EntityHealthFragmentDoc}
`;
export const GetDataFlowDocument = gql`
  query getDataFlow($urn: String!) {
    dataFlow(urn: $urn) {
      ...dataFlowFields
      upstream: lineage(input: { direction: UPSTREAM, start: 0, count: 100 }) {
        ...partialLineageResults
      }
      downstream: lineage(
        input: { direction: DOWNSTREAM, start: 0, count: 100 }
      ) {
        ...partialLineageResults
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
      ...notes
    }
  }
  ${DataFlowFieldsFragmentDoc}
  ${PartialLineageResultsFragmentDoc}
  ${AutoRenderAspectFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${FormsFieldsFragmentDoc}
  ${NotesFragmentDoc}
`;

/**
 * __useGetDataFlowQuery__
 *
 * To run a query within a React component, call `useGetDataFlowQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDataFlowQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDataFlowQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetDataFlowQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDataFlowQuery,
    GetDataFlowQueryVariables
  >,
) {
  return Apollo.useQuery<GetDataFlowQuery, GetDataFlowQueryVariables>(
    GetDataFlowDocument,
    baseOptions,
  );
}
export function useGetDataFlowLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDataFlowQuery,
    GetDataFlowQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetDataFlowQuery, GetDataFlowQueryVariables>(
    GetDataFlowDocument,
    baseOptions,
  );
}
export type GetDataFlowQueryHookResult = ReturnType<typeof useGetDataFlowQuery>;
export type GetDataFlowLazyQueryHookResult = ReturnType<
  typeof useGetDataFlowLazyQuery
>;
export type GetDataFlowQueryResult = Apollo.QueryResult<
  GetDataFlowQuery,
  GetDataFlowQueryVariables
>;
export const GetDataFlowChildJobsDocument = gql`
  query getDataFlowChildJobs($urn: String!, $start: Int, $count: Int) {
    dataFlow(urn: $urn) {
      ...dataFlowFields
      childJobs: relationships(
        input: {
          types: ["IsPartOf"]
          direction: INCOMING
          start: $start
          count: $count
        }
      ) {
        start
        count
        total
        relationships {
          entity {
            ... on DataJob {
              urn
              type
              jobId
              dataFlow {
                urn
                type
                orchestrator
                platform {
                  ...platformFields
                }
              }
              ownership {
                ...ownershipFields
              }
              properties {
                name
                description
              }
              editableProperties {
                description
              }
              globalTags {
                ...globalTagsFields
              }
              glossaryTerms {
                ...glossaryTerms
              }
              deprecation {
                ...deprecationFields
              }
              subTypes {
                typeNames
              }
            }
          }
        }
      }
    }
  }
  ${DataFlowFieldsFragmentDoc}
  ${PlatformFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
`;

/**
 * __useGetDataFlowChildJobsQuery__
 *
 * To run a query within a React component, call `useGetDataFlowChildJobsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDataFlowChildJobsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDataFlowChildJobsQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      start: // value for 'start'
 *      count: // value for 'count'
 *   },
 * });
 */
export function useGetDataFlowChildJobsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDataFlowChildJobsQuery,
    GetDataFlowChildJobsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetDataFlowChildJobsQuery,
    GetDataFlowChildJobsQueryVariables
  >(GetDataFlowChildJobsDocument, baseOptions);
}
export function useGetDataFlowChildJobsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDataFlowChildJobsQuery,
    GetDataFlowChildJobsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetDataFlowChildJobsQuery,
    GetDataFlowChildJobsQueryVariables
  >(GetDataFlowChildJobsDocument, baseOptions);
}
export type GetDataFlowChildJobsQueryHookResult = ReturnType<
  typeof useGetDataFlowChildJobsQuery
>;
export type GetDataFlowChildJobsLazyQueryHookResult = ReturnType<
  typeof useGetDataFlowChildJobsLazyQuery
>;
export type GetDataFlowChildJobsQueryResult = Apollo.QueryResult<
  GetDataFlowChildJobsQuery,
  GetDataFlowChildJobsQueryVariables
>;
export const GetDataFlowDagDocument = gql`
  query getDataFlowDag(
    $urn: String!
    $start: Int
    $count: Int
    $separateSiblings: Boolean
    $startTimeMillis: Long
    $endTimeMillis: Long
    $includeGhostEntities: Boolean = false
  ) {
    dataFlow(urn: $urn) {
      childJobs: relationships(
        input: {
          types: ["IsPartOf"]
          direction: INCOMING
          start: $start
          count: $count
        }
      ) {
        start
        count
        total
        relationships {
          entity {
            urn
            type
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
              ) {
                ...lineageV2Result
              }
            }
          }
        }
      }
    }
  }
  ${LineageV2ResultFragmentDoc}
`;

/**
 * __useGetDataFlowDagQuery__
 *
 * To run a query within a React component, call `useGetDataFlowDagQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetDataFlowDagQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetDataFlowDagQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      start: // value for 'start'
 *      count: // value for 'count'
 *      separateSiblings: // value for 'separateSiblings'
 *      startTimeMillis: // value for 'startTimeMillis'
 *      endTimeMillis: // value for 'endTimeMillis'
 *      includeGhostEntities: // value for 'includeGhostEntities'
 *   },
 * });
 */
export function useGetDataFlowDagQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetDataFlowDagQuery,
    GetDataFlowDagQueryVariables
  >,
) {
  return Apollo.useQuery<GetDataFlowDagQuery, GetDataFlowDagQueryVariables>(
    GetDataFlowDagDocument,
    baseOptions,
  );
}
export function useGetDataFlowDagLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetDataFlowDagQuery,
    GetDataFlowDagQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetDataFlowDagQuery, GetDataFlowDagQueryVariables>(
    GetDataFlowDagDocument,
    baseOptions,
  );
}
export type GetDataFlowDagQueryHookResult = ReturnType<
  typeof useGetDataFlowDagQuery
>;
export type GetDataFlowDagLazyQueryHookResult = ReturnType<
  typeof useGetDataFlowDagLazyQuery
>;
export type GetDataFlowDagQueryResult = Apollo.QueryResult<
  GetDataFlowDagQuery,
  GetDataFlowDagQueryVariables
>;
export const UpdateDataFlowDocument = gql`
  mutation updateDataFlow($urn: String!, $input: DataFlowUpdateInput!) {
    updateDataFlow(urn: $urn, input: $input) {
      urn
    }
  }
`;
export type UpdateDataFlowMutationFn = Apollo.MutationFunction<
  UpdateDataFlowMutation,
  UpdateDataFlowMutationVariables
>;

/**
 * __useUpdateDataFlowMutation__
 *
 * To run a mutation, you first call `useUpdateDataFlowMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateDataFlowMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateDataFlowMutation, { data, loading, error }] = useUpdateDataFlowMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateDataFlowMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateDataFlowMutation,
    UpdateDataFlowMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateDataFlowMutation,
    UpdateDataFlowMutationVariables
  >(UpdateDataFlowDocument, baseOptions);
}
export type UpdateDataFlowMutationHookResult = ReturnType<
  typeof useUpdateDataFlowMutation
>;
export type UpdateDataFlowMutationResult =
  Apollo.MutationResult<UpdateDataFlowMutation>;
export type UpdateDataFlowMutationOptions = Apollo.BaseMutationOptions<
  UpdateDataFlowMutation,
  UpdateDataFlowMutationVariables
>;
