/* eslint-disable */
import * as Types from "../types.generated";

import {
  EntityPrivilegesFragment,
  AutoRenderAspectFieldsFragment,
  StructuredPropertiesFieldsFragment,
  FormsFieldsFragment,
  OwnershipFieldsFragment,
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
  EntityDomainFragment,
  InstitutionalMemoryFieldsFragment,
  GlobalTagsFieldsFragment,
  GlossaryTermsFragment,
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
  EntityApplicationFragment,
  DeprecationFieldsFragment,
  EmbedFieldsFragment,
  DataPlatformInstanceFieldsFragment,
  EntityHealthFragment,
  BrowsePathV2FieldsFragment,
  ParentContainersFieldsFragment,
  InputFieldsFieldsFragment,
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
  EntityPrivilegesFragmentDoc,
  AutoRenderAspectFieldsFragmentDoc,
  StructuredPropertiesFieldsFragmentDoc,
  FormsFieldsFragmentDoc,
  OwnershipFieldsFragmentDoc,
  NotesFragmentDoc,
  EntityDomainFragmentDoc,
  InstitutionalMemoryFieldsFragmentDoc,
  GlobalTagsFieldsFragmentDoc,
  GlossaryTermsFragmentDoc,
  EntityDisplayNameFieldsFragmentDoc,
  PlatformFieldsFragmentDoc,
  EntityDataProductFragmentDoc,
  NonRecursiveDataFlowFieldsFragmentDoc,
  EntityApplicationFragmentDoc,
  DeprecationFieldsFragmentDoc,
  EmbedFieldsFragmentDoc,
  DataPlatformInstanceFieldsFragmentDoc,
  EntityHealthFragmentDoc,
  BrowsePathV2FieldsFragmentDoc,
  ParentContainersFieldsFragmentDoc,
  InputFieldsFieldsFragmentDoc,
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
export type GetGroupQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  membersCount: Types.Scalars["Int"];
}>;

export type GetGroupQuery = { __typename?: "Query" } & {
  corpGroup?: Types.Maybe<
    { __typename?: "CorpGroup" } & Pick<
      Types.CorpGroup,
      "urn" | "type" | "name" | "exists"
    > & {
        origin?: Types.Maybe<
          { __typename?: "Origin" } & Pick<
            Types.Origin,
            "type" | "externalType"
          >
        >;
        info?: Types.Maybe<
          { __typename?: "CorpGroupInfo" } & Pick<
            Types.CorpGroupInfo,
            "displayName" | "description" | "email"
          >
        >;
        editableProperties?: Types.Maybe<
          { __typename?: "CorpGroupEditableProperties" } & Pick<
            Types.CorpGroupEditableProperties,
            "description" | "slack" | "email" | "pictureLink"
          >
        >;
        properties?: Types.Maybe<
          { __typename?: "CorpGroupProperties" } & Pick<
            Types.CorpGroupProperties,
            "displayName" | "description" | "email" | "slack"
          >
        >;
        privileges?: Types.Maybe<
          { __typename?: "EntityPrivileges" } & EntityPrivilegesFragment
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
        ownership?: Types.Maybe<
          { __typename?: "Ownership" } & OwnershipFieldsFragment
        >;
        relationships?: Types.Maybe<
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
                    | ({ __typename?: "CorpUser" } & Pick<
                        Types.CorpUser,
                        "urn" | "username"
                      > & {
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
                            {
                              __typename?: "CorpUserEditableProperties";
                            } & Pick<
                              Types.CorpUserEditableProperties,
                              "displayName" | "title" | "pictureLink"
                            >
                          >;
                        })
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
            }
        >;
      }
  >;
};

export type GetAllGroupMembersQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  start: Types.Scalars["Int"];
  count: Types.Scalars["Int"];
}>;

export type GetAllGroupMembersQuery = { __typename?: "Query" } & {
  corpGroup?: Types.Maybe<
    { __typename?: "CorpGroup" } & {
      relationships?: Types.Maybe<
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
                  | ({ __typename?: "CorpUser" } & Pick<
                      Types.CorpUser,
                      "urn" | "username"
                    > & {
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
                        properties?: Types.Maybe<
                          { __typename?: "CorpUserProperties" } & Pick<
                            Types.CorpUserProperties,
                            "displayName"
                          >
                        >;
                        editableProperties?: Types.Maybe<
                          { __typename?: "CorpUserEditableProperties" } & Pick<
                            Types.CorpUserEditableProperties,
                            "displayName" | "title" | "pictureLink"
                          >
                        >;
                      })
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
          }
      >;
    }
  >;
};

export type GetGroupMembersQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  start: Types.Scalars["Int"];
  count: Types.Scalars["Int"];
}>;

export type GetGroupMembersQuery = { __typename?: "Query" } & {
  corpGroup?: Types.Maybe<
    { __typename?: "CorpGroup" } & {
      relationships?: Types.Maybe<
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
                  | ({ __typename?: "CorpUser" } & Pick<
                      Types.CorpUser,
                      "urn" | "username"
                    > & {
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
                        properties?: Types.Maybe<
                          { __typename?: "CorpUserProperties" } & Pick<
                            Types.CorpUserProperties,
                            "displayName"
                          >
                        >;
                        editableProperties?: Types.Maybe<
                          { __typename?: "CorpUserEditableProperties" } & Pick<
                            Types.CorpUserEditableProperties,
                            "displayName" | "title" | "pictureLink"
                          >
                        >;
                      })
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
          }
      >;
    }
  >;
};

export type GetNativeGroupMembersQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  start: Types.Scalars["Int"];
  count: Types.Scalars["Int"];
}>;

export type GetNativeGroupMembersQuery = { __typename?: "Query" } & {
  corpGroup?: Types.Maybe<
    { __typename?: "CorpGroup" } & {
      relationships?: Types.Maybe<
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
                  | ({ __typename?: "CorpUser" } & Pick<
                      Types.CorpUser,
                      "urn" | "username"
                    > & {
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
                        properties?: Types.Maybe<
                          { __typename?: "CorpUserProperties" } & Pick<
                            Types.CorpUserProperties,
                            "displayName"
                          >
                        >;
                        editableProperties?: Types.Maybe<
                          { __typename?: "CorpUserEditableProperties" } & Pick<
                            Types.CorpUserEditableProperties,
                            "displayName" | "title" | "pictureLink"
                          >
                        >;
                      })
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
          }
      >;
    }
  >;
};

export type ListGroupsQueryVariables = Types.Exact<{
  input: Types.ListGroupsInput;
}>;

export type ListGroupsQuery = { __typename?: "Query" } & {
  listGroups?: Types.Maybe<
    { __typename?: "ListGroupsResult" } & Pick<
      Types.ListGroupsResult,
      "start" | "count" | "total"
    > & {
        groups: Array<
          { __typename?: "CorpGroup" } & Pick<
            Types.CorpGroup,
            "urn" | "type" | "name"
          > & {
              origin?: Types.Maybe<
                { __typename?: "Origin" } & Pick<
                  Types.Origin,
                  "type" | "externalType"
                >
              >;
              info?: Types.Maybe<
                { __typename?: "CorpGroupInfo" } & Pick<
                  Types.CorpGroupInfo,
                  "displayName" | "description" | "email"
                >
              >;
              editableProperties?: Types.Maybe<
                { __typename?: "CorpGroupEditableProperties" } & Pick<
                  Types.CorpGroupEditableProperties,
                  "pictureLink"
                >
              >;
              memberCount?: Types.Maybe<
                { __typename?: "EntityRelationshipsResult" } & Pick<
                  Types.EntityRelationshipsResult,
                  "total"
                >
              >;
              roles?: Types.Maybe<
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
                        | ({ __typename?: "DataHubRole" } & Pick<
                            Types.DataHubRole,
                            "urn" | "type" | "name"
                          >)
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
                }
              >;
            }
        >;
      }
  >;
};

export type AddGroupMembersMutationVariables = Types.Exact<{
  groupUrn: Types.Scalars["String"];
  userUrns: Array<Types.Scalars["String"]> | Types.Scalars["String"];
}>;

export type AddGroupMembersMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "addGroupMembers"
>;

export type RemoveGroupMembersMutationVariables = Types.Exact<{
  groupUrn: Types.Scalars["String"];
  userUrns: Array<Types.Scalars["String"]> | Types.Scalars["String"];
}>;

export type RemoveGroupMembersMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "removeGroupMembers"
>;

export type RemoveGroupMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type RemoveGroupMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "removeGroup"
>;

export type CreateGroupMutationVariables = Types.Exact<{
  input: Types.CreateGroupInput;
}>;

export type CreateGroupMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "createGroup"
>;

export type UpdateCorpGroupPropertiesMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  input: Types.CorpGroupUpdateInput;
}>;

export type UpdateCorpGroupPropertiesMutation = { __typename?: "Mutation" } & {
  updateCorpGroupProperties?: Types.Maybe<
    { __typename?: "CorpGroup" } & Pick<Types.CorpGroup, "urn">
  >;
};

export const GetGroupDocument = gql`
  query getGroup($urn: String!, $membersCount: Int!) {
    corpGroup(urn: $urn) {
      urn
      type
      name
      exists
      origin {
        type
        externalType
      }
      info {
        displayName
        description
        email
      }
      editableProperties {
        description
        slack
        email
        pictureLink
      }
      properties {
        displayName
        description
        email
        slack
      }
      privileges {
        ...entityPrivileges
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
      ownership {
        ...ownershipFields
      }
      relationships(
        input: {
          types: ["IsMemberOfGroup", "IsMemberOfNativeGroup"]
          direction: INCOMING
          start: 0
          count: $membersCount
          includeSoftDelete: false
        }
      ) {
        start
        count
        total
        relationships {
          entity {
            ... on CorpUser {
              urn
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
          }
        }
      }
    }
  }
  ${EntityPrivilegesFragmentDoc}
  ${AutoRenderAspectFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${FormsFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
`;

/**
 * __useGetGroupQuery__
 *
 * To run a query within a React component, call `useGetGroupQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetGroupQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetGroupQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      membersCount: // value for 'membersCount'
 *   },
 * });
 */
export function useGetGroupQuery(
  baseOptions: Apollo.QueryHookOptions<GetGroupQuery, GetGroupQueryVariables>,
) {
  return Apollo.useQuery<GetGroupQuery, GetGroupQueryVariables>(
    GetGroupDocument,
    baseOptions,
  );
}
export function useGetGroupLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetGroupQuery,
    GetGroupQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetGroupQuery, GetGroupQueryVariables>(
    GetGroupDocument,
    baseOptions,
  );
}
export type GetGroupQueryHookResult = ReturnType<typeof useGetGroupQuery>;
export type GetGroupLazyQueryHookResult = ReturnType<
  typeof useGetGroupLazyQuery
>;
export type GetGroupQueryResult = Apollo.QueryResult<
  GetGroupQuery,
  GetGroupQueryVariables
>;
export const GetAllGroupMembersDocument = gql`
  query getAllGroupMembers($urn: String!, $start: Int!, $count: Int!) {
    corpGroup(urn: $urn) {
      relationships(
        input: {
          types: ["IsMemberOfGroup", "IsMemberOfNativeGroup"]
          direction: INCOMING
          start: $start
          count: $count
          includeSoftDelete: false
        }
      ) {
        start
        count
        total
        relationships {
          entity {
            ... on CorpUser {
              urn
              username
              info {
                active
                displayName
                title
                firstName
                lastName
                fullName
              }
              properties {
                displayName
              }
              editableProperties {
                displayName
                title
                pictureLink
              }
            }
          }
        }
      }
    }
  }
`;

/**
 * __useGetAllGroupMembersQuery__
 *
 * To run a query within a React component, call `useGetAllGroupMembersQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetAllGroupMembersQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetAllGroupMembersQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      start: // value for 'start'
 *      count: // value for 'count'
 *   },
 * });
 */
export function useGetAllGroupMembersQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetAllGroupMembersQuery,
    GetAllGroupMembersQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetAllGroupMembersQuery,
    GetAllGroupMembersQueryVariables
  >(GetAllGroupMembersDocument, baseOptions);
}
export function useGetAllGroupMembersLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetAllGroupMembersQuery,
    GetAllGroupMembersQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetAllGroupMembersQuery,
    GetAllGroupMembersQueryVariables
  >(GetAllGroupMembersDocument, baseOptions);
}
export type GetAllGroupMembersQueryHookResult = ReturnType<
  typeof useGetAllGroupMembersQuery
>;
export type GetAllGroupMembersLazyQueryHookResult = ReturnType<
  typeof useGetAllGroupMembersLazyQuery
>;
export type GetAllGroupMembersQueryResult = Apollo.QueryResult<
  GetAllGroupMembersQuery,
  GetAllGroupMembersQueryVariables
>;
export const GetGroupMembersDocument = gql`
  query getGroupMembers($urn: String!, $start: Int!, $count: Int!) {
    corpGroup(urn: $urn) {
      relationships(
        input: {
          types: ["IsMemberOfGroup"]
          direction: INCOMING
          start: $start
          count: $count
          includeSoftDelete: false
        }
      ) {
        start
        count
        total
        relationships {
          entity {
            ... on CorpUser {
              urn
              username
              info {
                active
                displayName
                title
                firstName
                lastName
                fullName
              }
              properties {
                displayName
              }
              editableProperties {
                displayName
                title
                pictureLink
              }
            }
          }
        }
      }
    }
  }
`;

/**
 * __useGetGroupMembersQuery__
 *
 * To run a query within a React component, call `useGetGroupMembersQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetGroupMembersQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetGroupMembersQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      start: // value for 'start'
 *      count: // value for 'count'
 *   },
 * });
 */
export function useGetGroupMembersQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetGroupMembersQuery,
    GetGroupMembersQueryVariables
  >,
) {
  return Apollo.useQuery<GetGroupMembersQuery, GetGroupMembersQueryVariables>(
    GetGroupMembersDocument,
    baseOptions,
  );
}
export function useGetGroupMembersLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetGroupMembersQuery,
    GetGroupMembersQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetGroupMembersQuery,
    GetGroupMembersQueryVariables
  >(GetGroupMembersDocument, baseOptions);
}
export type GetGroupMembersQueryHookResult = ReturnType<
  typeof useGetGroupMembersQuery
>;
export type GetGroupMembersLazyQueryHookResult = ReturnType<
  typeof useGetGroupMembersLazyQuery
>;
export type GetGroupMembersQueryResult = Apollo.QueryResult<
  GetGroupMembersQuery,
  GetGroupMembersQueryVariables
>;
export const GetNativeGroupMembersDocument = gql`
  query getNativeGroupMembers($urn: String!, $start: Int!, $count: Int!) {
    corpGroup(urn: $urn) {
      relationships(
        input: {
          types: ["IsMemberOfNativeGroup"]
          direction: INCOMING
          start: $start
          count: $count
          includeSoftDelete: false
        }
      ) {
        start
        count
        total
        relationships {
          entity {
            ... on CorpUser {
              urn
              username
              info {
                active
                displayName
                title
                firstName
                lastName
                fullName
              }
              properties {
                displayName
              }
              editableProperties {
                displayName
                title
                pictureLink
              }
            }
          }
        }
      }
    }
  }
`;

/**
 * __useGetNativeGroupMembersQuery__
 *
 * To run a query within a React component, call `useGetNativeGroupMembersQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetNativeGroupMembersQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetNativeGroupMembersQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      start: // value for 'start'
 *      count: // value for 'count'
 *   },
 * });
 */
export function useGetNativeGroupMembersQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetNativeGroupMembersQuery,
    GetNativeGroupMembersQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetNativeGroupMembersQuery,
    GetNativeGroupMembersQueryVariables
  >(GetNativeGroupMembersDocument, baseOptions);
}
export function useGetNativeGroupMembersLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetNativeGroupMembersQuery,
    GetNativeGroupMembersQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetNativeGroupMembersQuery,
    GetNativeGroupMembersQueryVariables
  >(GetNativeGroupMembersDocument, baseOptions);
}
export type GetNativeGroupMembersQueryHookResult = ReturnType<
  typeof useGetNativeGroupMembersQuery
>;
export type GetNativeGroupMembersLazyQueryHookResult = ReturnType<
  typeof useGetNativeGroupMembersLazyQuery
>;
export type GetNativeGroupMembersQueryResult = Apollo.QueryResult<
  GetNativeGroupMembersQuery,
  GetNativeGroupMembersQueryVariables
>;
export const ListGroupsDocument = gql`
  query listGroups($input: ListGroupsInput!) {
    listGroups(input: $input) {
      start
      count
      total
      groups {
        urn
        type
        name
        origin {
          type
          externalType
        }
        info {
          displayName
          description
          email
        }
        editableProperties {
          pictureLink
        }
        memberCount: relationships(
          input: {
            types: ["IsMemberOfGroup", "IsMemberOfNativeGroup"]
            direction: INCOMING
            start: 0
            count: 1
            includeSoftDelete: false
          }
        ) {
          total
        }
        roles: relationships(
          input: { types: ["IsMemberOfRole"], direction: OUTGOING, start: 0 }
        ) {
          relationships {
            entity {
              ... on DataHubRole {
                urn
                type
                name
              }
            }
          }
        }
      }
    }
  }
`;

/**
 * __useListGroupsQuery__
 *
 * To run a query within a React component, call `useListGroupsQuery` and pass it any options that fit your needs.
 * When your component renders, `useListGroupsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useListGroupsQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useListGroupsQuery(
  baseOptions: Apollo.QueryHookOptions<
    ListGroupsQuery,
    ListGroupsQueryVariables
  >,
) {
  return Apollo.useQuery<ListGroupsQuery, ListGroupsQueryVariables>(
    ListGroupsDocument,
    baseOptions,
  );
}
export function useListGroupsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    ListGroupsQuery,
    ListGroupsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<ListGroupsQuery, ListGroupsQueryVariables>(
    ListGroupsDocument,
    baseOptions,
  );
}
export type ListGroupsQueryHookResult = ReturnType<typeof useListGroupsQuery>;
export type ListGroupsLazyQueryHookResult = ReturnType<
  typeof useListGroupsLazyQuery
>;
export type ListGroupsQueryResult = Apollo.QueryResult<
  ListGroupsQuery,
  ListGroupsQueryVariables
>;
export const AddGroupMembersDocument = gql`
  mutation addGroupMembers($groupUrn: String!, $userUrns: [String!]!) {
    addGroupMembers(input: { groupUrn: $groupUrn, userUrns: $userUrns })
  }
`;
export type AddGroupMembersMutationFn = Apollo.MutationFunction<
  AddGroupMembersMutation,
  AddGroupMembersMutationVariables
>;

/**
 * __useAddGroupMembersMutation__
 *
 * To run a mutation, you first call `useAddGroupMembersMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useAddGroupMembersMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [addGroupMembersMutation, { data, loading, error }] = useAddGroupMembersMutation({
 *   variables: {
 *      groupUrn: // value for 'groupUrn'
 *      userUrns: // value for 'userUrns'
 *   },
 * });
 */
export function useAddGroupMembersMutation(
  baseOptions?: Apollo.MutationHookOptions<
    AddGroupMembersMutation,
    AddGroupMembersMutationVariables
  >,
) {
  return Apollo.useMutation<
    AddGroupMembersMutation,
    AddGroupMembersMutationVariables
  >(AddGroupMembersDocument, baseOptions);
}
export type AddGroupMembersMutationHookResult = ReturnType<
  typeof useAddGroupMembersMutation
>;
export type AddGroupMembersMutationResult =
  Apollo.MutationResult<AddGroupMembersMutation>;
export type AddGroupMembersMutationOptions = Apollo.BaseMutationOptions<
  AddGroupMembersMutation,
  AddGroupMembersMutationVariables
>;
export const RemoveGroupMembersDocument = gql`
  mutation removeGroupMembers($groupUrn: String!, $userUrns: [String!]!) {
    removeGroupMembers(input: { groupUrn: $groupUrn, userUrns: $userUrns })
  }
`;
export type RemoveGroupMembersMutationFn = Apollo.MutationFunction<
  RemoveGroupMembersMutation,
  RemoveGroupMembersMutationVariables
>;

/**
 * __useRemoveGroupMembersMutation__
 *
 * To run a mutation, you first call `useRemoveGroupMembersMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useRemoveGroupMembersMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [removeGroupMembersMutation, { data, loading, error }] = useRemoveGroupMembersMutation({
 *   variables: {
 *      groupUrn: // value for 'groupUrn'
 *      userUrns: // value for 'userUrns'
 *   },
 * });
 */
export function useRemoveGroupMembersMutation(
  baseOptions?: Apollo.MutationHookOptions<
    RemoveGroupMembersMutation,
    RemoveGroupMembersMutationVariables
  >,
) {
  return Apollo.useMutation<
    RemoveGroupMembersMutation,
    RemoveGroupMembersMutationVariables
  >(RemoveGroupMembersDocument, baseOptions);
}
export type RemoveGroupMembersMutationHookResult = ReturnType<
  typeof useRemoveGroupMembersMutation
>;
export type RemoveGroupMembersMutationResult =
  Apollo.MutationResult<RemoveGroupMembersMutation>;
export type RemoveGroupMembersMutationOptions = Apollo.BaseMutationOptions<
  RemoveGroupMembersMutation,
  RemoveGroupMembersMutationVariables
>;
export const RemoveGroupDocument = gql`
  mutation removeGroup($urn: String!) {
    removeGroup(urn: $urn)
  }
`;
export type RemoveGroupMutationFn = Apollo.MutationFunction<
  RemoveGroupMutation,
  RemoveGroupMutationVariables
>;

/**
 * __useRemoveGroupMutation__
 *
 * To run a mutation, you first call `useRemoveGroupMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useRemoveGroupMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [removeGroupMutation, { data, loading, error }] = useRemoveGroupMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useRemoveGroupMutation(
  baseOptions?: Apollo.MutationHookOptions<
    RemoveGroupMutation,
    RemoveGroupMutationVariables
  >,
) {
  return Apollo.useMutation<RemoveGroupMutation, RemoveGroupMutationVariables>(
    RemoveGroupDocument,
    baseOptions,
  );
}
export type RemoveGroupMutationHookResult = ReturnType<
  typeof useRemoveGroupMutation
>;
export type RemoveGroupMutationResult =
  Apollo.MutationResult<RemoveGroupMutation>;
export type RemoveGroupMutationOptions = Apollo.BaseMutationOptions<
  RemoveGroupMutation,
  RemoveGroupMutationVariables
>;
export const CreateGroupDocument = gql`
  mutation createGroup($input: CreateGroupInput!) {
    createGroup(input: $input)
  }
`;
export type CreateGroupMutationFn = Apollo.MutationFunction<
  CreateGroupMutation,
  CreateGroupMutationVariables
>;

/**
 * __useCreateGroupMutation__
 *
 * To run a mutation, you first call `useCreateGroupMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useCreateGroupMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [createGroupMutation, { data, loading, error }] = useCreateGroupMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useCreateGroupMutation(
  baseOptions?: Apollo.MutationHookOptions<
    CreateGroupMutation,
    CreateGroupMutationVariables
  >,
) {
  return Apollo.useMutation<CreateGroupMutation, CreateGroupMutationVariables>(
    CreateGroupDocument,
    baseOptions,
  );
}
export type CreateGroupMutationHookResult = ReturnType<
  typeof useCreateGroupMutation
>;
export type CreateGroupMutationResult =
  Apollo.MutationResult<CreateGroupMutation>;
export type CreateGroupMutationOptions = Apollo.BaseMutationOptions<
  CreateGroupMutation,
  CreateGroupMutationVariables
>;
export const UpdateCorpGroupPropertiesDocument = gql`
  mutation updateCorpGroupProperties(
    $urn: String!
    $input: CorpGroupUpdateInput!
  ) {
    updateCorpGroupProperties(urn: $urn, input: $input) {
      urn
    }
  }
`;
export type UpdateCorpGroupPropertiesMutationFn = Apollo.MutationFunction<
  UpdateCorpGroupPropertiesMutation,
  UpdateCorpGroupPropertiesMutationVariables
>;

/**
 * __useUpdateCorpGroupPropertiesMutation__
 *
 * To run a mutation, you first call `useUpdateCorpGroupPropertiesMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateCorpGroupPropertiesMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateCorpGroupPropertiesMutation, { data, loading, error }] = useUpdateCorpGroupPropertiesMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateCorpGroupPropertiesMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateCorpGroupPropertiesMutation,
    UpdateCorpGroupPropertiesMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateCorpGroupPropertiesMutation,
    UpdateCorpGroupPropertiesMutationVariables
  >(UpdateCorpGroupPropertiesDocument, baseOptions);
}
export type UpdateCorpGroupPropertiesMutationHookResult = ReturnType<
  typeof useUpdateCorpGroupPropertiesMutation
>;
export type UpdateCorpGroupPropertiesMutationResult =
  Apollo.MutationResult<UpdateCorpGroupPropertiesMutation>;
export type UpdateCorpGroupPropertiesMutationOptions =
  Apollo.BaseMutationOptions<
    UpdateCorpGroupPropertiesMutation,
    UpdateCorpGroupPropertiesMutationVariables
  >;
