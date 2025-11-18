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
import { SearchResultsFragment } from "./search.generated";
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
import { SearchResultsFragmentDoc } from "./search.generated";
import * as Apollo from "@apollo/client";
export type GetUserQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  groupsCount: Types.Scalars["Int"];
}>;

export type GetUserQuery = { __typename?: "Query" } & {
  corpUser?: Types.Maybe<
    { __typename?: "CorpUser" } & Pick<
      Types.CorpUser,
      "urn" | "type" | "username" | "isNativeUser" | "exists"
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
            | "email"
            | "departmentName"
            | "countryCode"
          >
        >;
        editableProperties?: Types.Maybe<
          { __typename?: "CorpUserEditableProperties" } & Pick<
            Types.CorpUserEditableProperties,
            | "slack"
            | "phone"
            | "pictureLink"
            | "aboutMe"
            | "teams"
            | "skills"
            | "displayName"
            | "title"
            | "email"
          >
        >;
        privileges?: Types.Maybe<
          { __typename?: "EntityPrivileges" } & EntityPrivilegesFragment
        >;
        globalTags?: Types.Maybe<
          { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
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
        groups?: Types.Maybe<
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
                    | ({ __typename?: "CorpGroup" } & Pick<
                        Types.CorpGroup,
                        "urn" | "type" | "name"
                      > & {
                          info?: Types.Maybe<
                            { __typename?: "CorpGroupInfo" } & Pick<
                              Types.CorpGroupInfo,
                              "displayName" | "description" | "email"
                            >
                          >;
                          relationships?: Types.Maybe<
                            { __typename?: "EntityRelationshipsResult" } & Pick<
                              Types.EntityRelationshipsResult,
                              "start" | "count" | "total"
                            >
                          >;
                        })
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
            }
        >;
        roles?: Types.Maybe<
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
                    | ({ __typename?: "DataHubRole" } & Pick<
                        Types.DataHubRole,
                        "urn" | "type" | "name"
                      > & {
                          relationships?: Types.Maybe<
                            { __typename?: "EntityRelationshipsResult" } & Pick<
                              Types.EntityRelationshipsResult,
                              "start" | "count" | "total"
                            >
                          >;
                        })
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

export type GetUserGroupsQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  start: Types.Scalars["Int"];
  count: Types.Scalars["Int"];
}>;

export type GetUserGroupsQuery = { __typename?: "Query" } & {
  corpUser?: Types.Maybe<
    { __typename?: "CorpUser" } & {
      relationships?: Types.Maybe<
        { __typename?: "EntityRelationshipsResult" } & Pick<
          Types.EntityRelationshipsResult,
          "start" | "count" | "total"
        > & {
            relationships: Array<
              { __typename?: "EntityRelationship" } & {
                entity?: Types.Maybe<
                  | ({ __typename?: "AccessTokenMetadata" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "Application" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "Assertion" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "BusinessAttribute" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "Chart" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "Container" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "CorpGroup" } & Pick<
                      Types.CorpGroup,
                      "urn" | "type" | "name"
                    > & {
                        info?: Types.Maybe<
                          { __typename?: "CorpGroupInfo" } & Pick<
                            Types.CorpGroupInfo,
                            "displayName" | "description" | "email"
                          >
                        >;
                        relationships?: Types.Maybe<
                          { __typename?: "EntityRelationshipsResult" } & Pick<
                            Types.EntityRelationshipsResult,
                            "start" | "count" | "total"
                          >
                        >;
                      })
                  | ({ __typename?: "CorpUser" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "Dashboard" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "DataContract" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "DataFlow" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "DataHubConnection" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "DataHubFile" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "DataHubPageModule" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "DataHubPageTemplate" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "DataHubPolicy" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "DataHubRole" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "DataHubView" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "DataJob" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "DataPlatform" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "DataPlatformInstance" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "DataProcessInstance" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "DataProduct" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "DataTypeEntity" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "Dataset" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "Domain" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "ERModelRelationship" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "EntityTypeEntity" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "ExecutionRequest" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "Form" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "GlossaryNode" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "GlossaryTerm" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "Incident" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "MLFeature" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "MLFeatureTable" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "MLModel" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "MLModelGroup" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "MLPrimaryKey" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "Notebook" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "OwnershipTypeEntity" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "Post" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "QueryEntity" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "Restricted" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "Role" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "SchemaFieldEntity" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "StructuredPropertyEntity" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "Tag" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "Test" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "VersionSet" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                  | ({ __typename?: "VersionedDataset" } & {
                      relationships?: Types.Maybe<
                        { __typename?: "EntityRelationshipsResult" } & Pick<
                          Types.EntityRelationshipsResult,
                          "start" | "count" | "total"
                        >
                      >;
                    })
                >;
              }
            >;
          }
      >;
    }
  >;
};

export type GetUserGroupsUrnsQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  start: Types.Scalars["Int"];
  count: Types.Scalars["Int"];
}>;

export type GetUserGroupsUrnsQuery = { __typename?: "Query" } & {
  corpUser?: Types.Maybe<
    { __typename?: "CorpUser" } & {
      relationships?: Types.Maybe<
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
                >;
              }
            >;
          }
      >;
    }
  >;
};

export type ListUsersQueryVariables = Types.Exact<{
  input: Types.ListUsersInput;
}>;

export type ListUsersQuery = { __typename?: "Query" } & {
  listUsers?: Types.Maybe<
    { __typename?: "ListUsersResult" } & Pick<
      Types.ListUsersResult,
      "start" | "count" | "total"
    > & {
        users: Array<
          { __typename?: "CorpUser" } & Pick<
            Types.CorpUser,
            "urn" | "username" | "isNativeUser" | "status"
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
                  | "email"
                >
              >;
              editableProperties?: Types.Maybe<
                { __typename?: "CorpUserEditableProperties" } & Pick<
                  Types.CorpUserEditableProperties,
                  "displayName" | "pictureLink" | "teams" | "title" | "skills"
                >
              >;
              roles?: Types.Maybe<
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
                          | ({ __typename?: "DataHubRole" } & Pick<
                              Types.DataHubRole,
                              "urn" | "type" | "name"
                            > & {
                                relationships?: Types.Maybe<
                                  {
                                    __typename?: "EntityRelationshipsResult";
                                  } & Pick<
                                    Types.EntityRelationshipsResult,
                                    "start" | "count" | "total"
                                  >
                                >;
                              })
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

export type GetUsersQueryVariables = Types.Exact<{
  urns: Array<Types.Scalars["String"]> | Types.Scalars["String"];
}>;

export type GetUsersQuery = { __typename?: "Query" } & {
  entities?: Types.Maybe<
    Array<
      Types.Maybe<
        | { __typename?: "AccessTokenMetadata" }
        | { __typename?: "Application" }
        | { __typename?: "Assertion" }
        | { __typename?: "BusinessAttribute" }
        | { __typename?: "Chart" }
        | { __typename?: "Container" }
        | { __typename?: "CorpGroup" }
        | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type"> &
            UserFieldsFragment)
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
      >
    >
  >;
};

export type UserFieldsFragment = { __typename?: "CorpUser" } & Pick<
  Types.CorpUser,
  "username"
> & {
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

export type RemoveUserMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type RemoveUserMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "removeUser"
>;

export type UpdateUserStatusMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  status: Types.CorpUserStatus;
}>;

export type UpdateUserStatusMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "updateUserStatus"
>;

export type UpdateCorpUserPropertiesMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  input: Types.CorpUserUpdateInput;
}>;

export type UpdateCorpUserPropertiesMutation = { __typename?: "Mutation" } & {
  updateCorpUserProperties?: Types.Maybe<
    { __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn">
  >;
};

export type CreateNativeUserResetTokenMutationVariables = Types.Exact<{
  input: Types.CreateNativeUserResetTokenInput;
}>;

export type CreateNativeUserResetTokenMutation = { __typename?: "Mutation" } & {
  createNativeUserResetToken?: Types.Maybe<
    { __typename?: "ResetToken" } & Pick<Types.ResetToken, "resetToken">
  >;
};

export type UpdateCorpUserViewsSettingsMutationVariables = Types.Exact<{
  input: Types.UpdateCorpUserViewsSettingsInput;
}>;

export type UpdateCorpUserViewsSettingsMutation = {
  __typename?: "Mutation";
} & Pick<Types.Mutation, "updateCorpUserViewsSettings">;

export type UpdateUserHomePageSettingsMutationVariables = Types.Exact<{
  input: Types.UpdateUserHomePageSettingsInput;
}>;

export type UpdateUserHomePageSettingsMutation = {
  __typename?: "Mutation";
} & Pick<Types.Mutation, "updateUserHomePageSettings">;

export type GetUserOwnedAssetsQueryVariables = Types.Exact<{
  urns: Array<Types.Scalars["String"]> | Types.Scalars["String"];
}>;

export type GetUserOwnedAssetsQuery = { __typename?: "Query" } & {
  searchAcrossEntities?: Types.Maybe<
    { __typename?: "SearchResults" } & SearchResultsFragment
  >;
};

export const UserFieldsFragmentDoc = gql`
  fragment userFields on CorpUser {
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
`;
export const GetUserDocument = gql`
  query getUser($urn: String!, $groupsCount: Int!) {
    corpUser(urn: $urn) {
      urn
      type
      username
      isNativeUser
      exists
      info {
        active
        displayName
        title
        firstName
        lastName
        fullName
        email
        departmentName
        countryCode
      }
      editableProperties {
        slack
        phone
        pictureLink
        aboutMe
        teams
        skills
        displayName
        title
        email
      }
      privileges {
        ...entityPrivileges
      }
      globalTags {
        ...globalTagsFields
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
      groups: relationships(
        input: {
          types: ["IsMemberOfGroup", "IsMemberOfNativeGroup"]
          direction: OUTGOING
          start: 0
          count: $groupsCount
        }
      ) {
        start
        count
        total
        relationships {
          entity {
            ... on CorpGroup {
              urn
              type
              name
              info {
                displayName
                description
                email
              }
              relationships(
                input: {
                  types: ["IsMemberOfGroup", "IsMemberOfNativeGroup"]
                  direction: INCOMING
                }
              ) {
                start
                count
                total
              }
            }
          }
        }
      }
      roles: relationships(
        input: {
          types: ["IsMemberOfRole"]
          direction: OUTGOING
          start: 0
          count: $groupsCount
        }
      ) {
        start
        count
        total
        relationships {
          entity {
            ... on DataHubRole {
              urn
              type
              name
              relationships(
                input: { types: ["IsMemberOfRole"], direction: INCOMING }
              ) {
                start
                count
                total
              }
            }
          }
        }
      }
    }
  }
  ${EntityPrivilegesFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${AutoRenderAspectFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${FormsFieldsFragmentDoc}
`;

/**
 * __useGetUserQuery__
 *
 * To run a query within a React component, call `useGetUserQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetUserQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetUserQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      groupsCount: // value for 'groupsCount'
 *   },
 * });
 */
export function useGetUserQuery(
  baseOptions: Apollo.QueryHookOptions<GetUserQuery, GetUserQueryVariables>,
) {
  return Apollo.useQuery<GetUserQuery, GetUserQueryVariables>(
    GetUserDocument,
    baseOptions,
  );
}
export function useGetUserLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetUserQuery,
    GetUserQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetUserQuery, GetUserQueryVariables>(
    GetUserDocument,
    baseOptions,
  );
}
export type GetUserQueryHookResult = ReturnType<typeof useGetUserQuery>;
export type GetUserLazyQueryHookResult = ReturnType<typeof useGetUserLazyQuery>;
export type GetUserQueryResult = Apollo.QueryResult<
  GetUserQuery,
  GetUserQueryVariables
>;
export const GetUserGroupsDocument = gql`
  query getUserGroups($urn: String!, $start: Int!, $count: Int!) {
    corpUser(urn: $urn) {
      relationships(
        input: {
          types: ["IsMemberOfGroup", "IsMemberOfNativeGroup"]
          direction: OUTGOING
          start: $start
          count: $count
        }
      ) {
        start
        count
        total
        relationships {
          entity {
            ... on CorpGroup {
              urn
              type
              name
              info {
                displayName
                description
                email
              }
            }
            relationships(
              input: {
                types: ["IsMemberOfGroup", "IsMemberOfNativeGroup"]
                direction: INCOMING
              }
            ) {
              start
              count
              total
            }
          }
        }
      }
    }
  }
`;

/**
 * __useGetUserGroupsQuery__
 *
 * To run a query within a React component, call `useGetUserGroupsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetUserGroupsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetUserGroupsQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      start: // value for 'start'
 *      count: // value for 'count'
 *   },
 * });
 */
export function useGetUserGroupsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetUserGroupsQuery,
    GetUserGroupsQueryVariables
  >,
) {
  return Apollo.useQuery<GetUserGroupsQuery, GetUserGroupsQueryVariables>(
    GetUserGroupsDocument,
    baseOptions,
  );
}
export function useGetUserGroupsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetUserGroupsQuery,
    GetUserGroupsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetUserGroupsQuery, GetUserGroupsQueryVariables>(
    GetUserGroupsDocument,
    baseOptions,
  );
}
export type GetUserGroupsQueryHookResult = ReturnType<
  typeof useGetUserGroupsQuery
>;
export type GetUserGroupsLazyQueryHookResult = ReturnType<
  typeof useGetUserGroupsLazyQuery
>;
export type GetUserGroupsQueryResult = Apollo.QueryResult<
  GetUserGroupsQuery,
  GetUserGroupsQueryVariables
>;
export const GetUserGroupsUrnsDocument = gql`
  query getUserGroupsUrns($urn: String!, $start: Int!, $count: Int!) {
    corpUser(urn: $urn) {
      relationships(
        input: {
          types: ["IsMemberOfGroup", "IsMemberOfNativeGroup"]
          direction: OUTGOING
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
          }
        }
      }
    }
  }
`;

/**
 * __useGetUserGroupsUrnsQuery__
 *
 * To run a query within a React component, call `useGetUserGroupsUrnsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetUserGroupsUrnsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetUserGroupsUrnsQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *      start: // value for 'start'
 *      count: // value for 'count'
 *   },
 * });
 */
export function useGetUserGroupsUrnsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetUserGroupsUrnsQuery,
    GetUserGroupsUrnsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetUserGroupsUrnsQuery,
    GetUserGroupsUrnsQueryVariables
  >(GetUserGroupsUrnsDocument, baseOptions);
}
export function useGetUserGroupsUrnsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetUserGroupsUrnsQuery,
    GetUserGroupsUrnsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetUserGroupsUrnsQuery,
    GetUserGroupsUrnsQueryVariables
  >(GetUserGroupsUrnsDocument, baseOptions);
}
export type GetUserGroupsUrnsQueryHookResult = ReturnType<
  typeof useGetUserGroupsUrnsQuery
>;
export type GetUserGroupsUrnsLazyQueryHookResult = ReturnType<
  typeof useGetUserGroupsUrnsLazyQuery
>;
export type GetUserGroupsUrnsQueryResult = Apollo.QueryResult<
  GetUserGroupsUrnsQuery,
  GetUserGroupsUrnsQueryVariables
>;
export const ListUsersDocument = gql`
  query listUsers($input: ListUsersInput!) {
    listUsers(input: $input) {
      start
      count
      total
      users {
        urn
        username
        isNativeUser
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
          pictureLink
          teams
          title
          skills
        }
        status
        roles: relationships(
          input: { types: ["IsMemberOfRole"], direction: OUTGOING, start: 0 }
        ) {
          start
          count
          total
          relationships {
            entity {
              ... on DataHubRole {
                urn
                type
                name
                relationships(
                  input: { types: ["IsMemberOfRole"], direction: INCOMING }
                ) {
                  start
                  count
                  total
                }
              }
            }
          }
        }
      }
    }
  }
`;

/**
 * __useListUsersQuery__
 *
 * To run a query within a React component, call `useListUsersQuery` and pass it any options that fit your needs.
 * When your component renders, `useListUsersQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useListUsersQuery({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useListUsersQuery(
  baseOptions: Apollo.QueryHookOptions<ListUsersQuery, ListUsersQueryVariables>,
) {
  return Apollo.useQuery<ListUsersQuery, ListUsersQueryVariables>(
    ListUsersDocument,
    baseOptions,
  );
}
export function useListUsersLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    ListUsersQuery,
    ListUsersQueryVariables
  >,
) {
  return Apollo.useLazyQuery<ListUsersQuery, ListUsersQueryVariables>(
    ListUsersDocument,
    baseOptions,
  );
}
export type ListUsersQueryHookResult = ReturnType<typeof useListUsersQuery>;
export type ListUsersLazyQueryHookResult = ReturnType<
  typeof useListUsersLazyQuery
>;
export type ListUsersQueryResult = Apollo.QueryResult<
  ListUsersQuery,
  ListUsersQueryVariables
>;
export const GetUsersDocument = gql`
  query getUsers($urns: [String!]!) {
    entities(urns: $urns) {
      ... on CorpUser {
        urn
        type
        ...userFields
      }
    }
  }
  ${UserFieldsFragmentDoc}
`;

/**
 * __useGetUsersQuery__
 *
 * To run a query within a React component, call `useGetUsersQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetUsersQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetUsersQuery({
 *   variables: {
 *      urns: // value for 'urns'
 *   },
 * });
 */
export function useGetUsersQuery(
  baseOptions: Apollo.QueryHookOptions<GetUsersQuery, GetUsersQueryVariables>,
) {
  return Apollo.useQuery<GetUsersQuery, GetUsersQueryVariables>(
    GetUsersDocument,
    baseOptions,
  );
}
export function useGetUsersLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetUsersQuery,
    GetUsersQueryVariables
  >,
) {
  return Apollo.useLazyQuery<GetUsersQuery, GetUsersQueryVariables>(
    GetUsersDocument,
    baseOptions,
  );
}
export type GetUsersQueryHookResult = ReturnType<typeof useGetUsersQuery>;
export type GetUsersLazyQueryHookResult = ReturnType<
  typeof useGetUsersLazyQuery
>;
export type GetUsersQueryResult = Apollo.QueryResult<
  GetUsersQuery,
  GetUsersQueryVariables
>;
export const RemoveUserDocument = gql`
  mutation removeUser($urn: String!) {
    removeUser(urn: $urn)
  }
`;
export type RemoveUserMutationFn = Apollo.MutationFunction<
  RemoveUserMutation,
  RemoveUserMutationVariables
>;

/**
 * __useRemoveUserMutation__
 *
 * To run a mutation, you first call `useRemoveUserMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useRemoveUserMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [removeUserMutation, { data, loading, error }] = useRemoveUserMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useRemoveUserMutation(
  baseOptions?: Apollo.MutationHookOptions<
    RemoveUserMutation,
    RemoveUserMutationVariables
  >,
) {
  return Apollo.useMutation<RemoveUserMutation, RemoveUserMutationVariables>(
    RemoveUserDocument,
    baseOptions,
  );
}
export type RemoveUserMutationHookResult = ReturnType<
  typeof useRemoveUserMutation
>;
export type RemoveUserMutationResult =
  Apollo.MutationResult<RemoveUserMutation>;
export type RemoveUserMutationOptions = Apollo.BaseMutationOptions<
  RemoveUserMutation,
  RemoveUserMutationVariables
>;
export const UpdateUserStatusDocument = gql`
  mutation updateUserStatus($urn: String!, $status: CorpUserStatus!) {
    updateUserStatus(urn: $urn, status: $status)
  }
`;
export type UpdateUserStatusMutationFn = Apollo.MutationFunction<
  UpdateUserStatusMutation,
  UpdateUserStatusMutationVariables
>;

/**
 * __useUpdateUserStatusMutation__
 *
 * To run a mutation, you first call `useUpdateUserStatusMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateUserStatusMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateUserStatusMutation, { data, loading, error }] = useUpdateUserStatusMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *      status: // value for 'status'
 *   },
 * });
 */
export function useUpdateUserStatusMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateUserStatusMutation,
    UpdateUserStatusMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateUserStatusMutation,
    UpdateUserStatusMutationVariables
  >(UpdateUserStatusDocument, baseOptions);
}
export type UpdateUserStatusMutationHookResult = ReturnType<
  typeof useUpdateUserStatusMutation
>;
export type UpdateUserStatusMutationResult =
  Apollo.MutationResult<UpdateUserStatusMutation>;
export type UpdateUserStatusMutationOptions = Apollo.BaseMutationOptions<
  UpdateUserStatusMutation,
  UpdateUserStatusMutationVariables
>;
export const UpdateCorpUserPropertiesDocument = gql`
  mutation updateCorpUserProperties(
    $urn: String!
    $input: CorpUserUpdateInput!
  ) {
    updateCorpUserProperties(urn: $urn, input: $input) {
      urn
    }
  }
`;
export type UpdateCorpUserPropertiesMutationFn = Apollo.MutationFunction<
  UpdateCorpUserPropertiesMutation,
  UpdateCorpUserPropertiesMutationVariables
>;

/**
 * __useUpdateCorpUserPropertiesMutation__
 *
 * To run a mutation, you first call `useUpdateCorpUserPropertiesMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateCorpUserPropertiesMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateCorpUserPropertiesMutation, { data, loading, error }] = useUpdateCorpUserPropertiesMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateCorpUserPropertiesMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateCorpUserPropertiesMutation,
    UpdateCorpUserPropertiesMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateCorpUserPropertiesMutation,
    UpdateCorpUserPropertiesMutationVariables
  >(UpdateCorpUserPropertiesDocument, baseOptions);
}
export type UpdateCorpUserPropertiesMutationHookResult = ReturnType<
  typeof useUpdateCorpUserPropertiesMutation
>;
export type UpdateCorpUserPropertiesMutationResult =
  Apollo.MutationResult<UpdateCorpUserPropertiesMutation>;
export type UpdateCorpUserPropertiesMutationOptions =
  Apollo.BaseMutationOptions<
    UpdateCorpUserPropertiesMutation,
    UpdateCorpUserPropertiesMutationVariables
  >;
export const CreateNativeUserResetTokenDocument = gql`
  mutation createNativeUserResetToken(
    $input: CreateNativeUserResetTokenInput!
  ) {
    createNativeUserResetToken(input: $input) {
      resetToken
    }
  }
`;
export type CreateNativeUserResetTokenMutationFn = Apollo.MutationFunction<
  CreateNativeUserResetTokenMutation,
  CreateNativeUserResetTokenMutationVariables
>;

/**
 * __useCreateNativeUserResetTokenMutation__
 *
 * To run a mutation, you first call `useCreateNativeUserResetTokenMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useCreateNativeUserResetTokenMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [createNativeUserResetTokenMutation, { data, loading, error }] = useCreateNativeUserResetTokenMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useCreateNativeUserResetTokenMutation(
  baseOptions?: Apollo.MutationHookOptions<
    CreateNativeUserResetTokenMutation,
    CreateNativeUserResetTokenMutationVariables
  >,
) {
  return Apollo.useMutation<
    CreateNativeUserResetTokenMutation,
    CreateNativeUserResetTokenMutationVariables
  >(CreateNativeUserResetTokenDocument, baseOptions);
}
export type CreateNativeUserResetTokenMutationHookResult = ReturnType<
  typeof useCreateNativeUserResetTokenMutation
>;
export type CreateNativeUserResetTokenMutationResult =
  Apollo.MutationResult<CreateNativeUserResetTokenMutation>;
export type CreateNativeUserResetTokenMutationOptions =
  Apollo.BaseMutationOptions<
    CreateNativeUserResetTokenMutation,
    CreateNativeUserResetTokenMutationVariables
  >;
export const UpdateCorpUserViewsSettingsDocument = gql`
  mutation updateCorpUserViewsSettings(
    $input: UpdateCorpUserViewsSettingsInput!
  ) {
    updateCorpUserViewsSettings(input: $input)
  }
`;
export type UpdateCorpUserViewsSettingsMutationFn = Apollo.MutationFunction<
  UpdateCorpUserViewsSettingsMutation,
  UpdateCorpUserViewsSettingsMutationVariables
>;

/**
 * __useUpdateCorpUserViewsSettingsMutation__
 *
 * To run a mutation, you first call `useUpdateCorpUserViewsSettingsMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateCorpUserViewsSettingsMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateCorpUserViewsSettingsMutation, { data, loading, error }] = useUpdateCorpUserViewsSettingsMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateCorpUserViewsSettingsMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateCorpUserViewsSettingsMutation,
    UpdateCorpUserViewsSettingsMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateCorpUserViewsSettingsMutation,
    UpdateCorpUserViewsSettingsMutationVariables
  >(UpdateCorpUserViewsSettingsDocument, baseOptions);
}
export type UpdateCorpUserViewsSettingsMutationHookResult = ReturnType<
  typeof useUpdateCorpUserViewsSettingsMutation
>;
export type UpdateCorpUserViewsSettingsMutationResult =
  Apollo.MutationResult<UpdateCorpUserViewsSettingsMutation>;
export type UpdateCorpUserViewsSettingsMutationOptions =
  Apollo.BaseMutationOptions<
    UpdateCorpUserViewsSettingsMutation,
    UpdateCorpUserViewsSettingsMutationVariables
  >;
export const UpdateUserHomePageSettingsDocument = gql`
  mutation updateUserHomePageSettings(
    $input: UpdateUserHomePageSettingsInput!
  ) {
    updateUserHomePageSettings(input: $input)
  }
`;
export type UpdateUserHomePageSettingsMutationFn = Apollo.MutationFunction<
  UpdateUserHomePageSettingsMutation,
  UpdateUserHomePageSettingsMutationVariables
>;

/**
 * __useUpdateUserHomePageSettingsMutation__
 *
 * To run a mutation, you first call `useUpdateUserHomePageSettingsMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateUserHomePageSettingsMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateUserHomePageSettingsMutation, { data, loading, error }] = useUpdateUserHomePageSettingsMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateUserHomePageSettingsMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateUserHomePageSettingsMutation,
    UpdateUserHomePageSettingsMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateUserHomePageSettingsMutation,
    UpdateUserHomePageSettingsMutationVariables
  >(UpdateUserHomePageSettingsDocument, baseOptions);
}
export type UpdateUserHomePageSettingsMutationHookResult = ReturnType<
  typeof useUpdateUserHomePageSettingsMutation
>;
export type UpdateUserHomePageSettingsMutationResult =
  Apollo.MutationResult<UpdateUserHomePageSettingsMutation>;
export type UpdateUserHomePageSettingsMutationOptions =
  Apollo.BaseMutationOptions<
    UpdateUserHomePageSettingsMutation,
    UpdateUserHomePageSettingsMutationVariables
  >;
export const GetUserOwnedAssetsDocument = gql`
  query getUserOwnedAssets($urns: [String!]!) {
    searchAcrossEntities(
      input: { query: "", filters: [{ field: "owners", values: $urns }] }
    ) {
      ...searchResults
    }
  }
  ${SearchResultsFragmentDoc}
`;

/**
 * __useGetUserOwnedAssetsQuery__
 *
 * To run a query within a React component, call `useGetUserOwnedAssetsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetUserOwnedAssetsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetUserOwnedAssetsQuery({
 *   variables: {
 *      urns: // value for 'urns'
 *   },
 * });
 */
export function useGetUserOwnedAssetsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetUserOwnedAssetsQuery,
    GetUserOwnedAssetsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetUserOwnedAssetsQuery,
    GetUserOwnedAssetsQueryVariables
  >(GetUserOwnedAssetsDocument, baseOptions);
}
export function useGetUserOwnedAssetsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetUserOwnedAssetsQuery,
    GetUserOwnedAssetsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetUserOwnedAssetsQuery,
    GetUserOwnedAssetsQueryVariables
  >(GetUserOwnedAssetsDocument, baseOptions);
}
export type GetUserOwnedAssetsQueryHookResult = ReturnType<
  typeof useGetUserOwnedAssetsQuery
>;
export type GetUserOwnedAssetsLazyQueryHookResult = ReturnType<
  typeof useGetUserOwnedAssetsLazyQuery
>;
export type GetUserOwnedAssetsQueryResult = Apollo.QueryResult<
  GetUserOwnedAssetsQuery,
  GetUserOwnedAssetsQueryVariables
>;
