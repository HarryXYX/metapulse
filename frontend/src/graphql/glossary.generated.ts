/* eslint-disable */
import * as Types from "../types.generated";

import { ChildGlossaryTermFragment } from "./glossaryNode.generated";
import { RootGlossaryNodeWithFourLayersFragment } from "./fragments.generated";
import {
  AutoCompleteFields_AccessTokenMetadata_Fragment,
  AutoCompleteFields_Application_Fragment,
  AutoCompleteFields_Assertion_Fragment,
  AutoCompleteFields_BusinessAttribute_Fragment,
  AutoCompleteFields_Chart_Fragment,
  AutoCompleteFields_Container_Fragment,
  AutoCompleteFields_CorpGroup_Fragment,
  AutoCompleteFields_CorpUser_Fragment,
  AutoCompleteFields_Dashboard_Fragment,
  AutoCompleteFields_DataContract_Fragment,
  AutoCompleteFields_DataFlow_Fragment,
  AutoCompleteFields_DataHubConnection_Fragment,
  AutoCompleteFields_DataHubFile_Fragment,
  AutoCompleteFields_DataHubPageModule_Fragment,
  AutoCompleteFields_DataHubPageTemplate_Fragment,
  AutoCompleteFields_DataHubPolicy_Fragment,
  AutoCompleteFields_DataHubRole_Fragment,
  AutoCompleteFields_DataHubView_Fragment,
  AutoCompleteFields_DataJob_Fragment,
  AutoCompleteFields_DataPlatform_Fragment,
  AutoCompleteFields_DataPlatformInstance_Fragment,
  AutoCompleteFields_DataProcessInstance_Fragment,
  AutoCompleteFields_DataProduct_Fragment,
  AutoCompleteFields_DataTypeEntity_Fragment,
  AutoCompleteFields_Dataset_Fragment,
  AutoCompleteFields_Domain_Fragment,
  AutoCompleteFields_ErModelRelationship_Fragment,
  AutoCompleteFields_EntityTypeEntity_Fragment,
  AutoCompleteFields_ExecutionRequest_Fragment,
  AutoCompleteFields_Form_Fragment,
  AutoCompleteFields_GlossaryNode_Fragment,
  AutoCompleteFields_GlossaryTerm_Fragment,
  AutoCompleteFields_Incident_Fragment,
  AutoCompleteFields_MlFeature_Fragment,
  AutoCompleteFields_MlFeatureTable_Fragment,
  AutoCompleteFields_MlModel_Fragment,
  AutoCompleteFields_MlModelGroup_Fragment,
  AutoCompleteFields_MlPrimaryKey_Fragment,
  AutoCompleteFields_Notebook_Fragment,
  AutoCompleteFields_OwnershipTypeEntity_Fragment,
  AutoCompleteFields_Post_Fragment,
  AutoCompleteFields_QueryEntity_Fragment,
  AutoCompleteFields_Restricted_Fragment,
  AutoCompleteFields_Role_Fragment,
  AutoCompleteFields_SchemaFieldEntity_Fragment,
  AutoCompleteFields_StructuredPropertyEntity_Fragment,
  AutoCompleteFields_Tag_Fragment,
  AutoCompleteFields_Test_Fragment,
  AutoCompleteFields_VersionSet_Fragment,
  AutoCompleteFields_VersionedDataset_Fragment,
} from "./search.generated";
import { gql } from "@apollo/client";
import { ChildGlossaryTermFragmentDoc } from "./glossaryNode.generated";
import { RootGlossaryNodeWithFourLayersFragmentDoc } from "./fragments.generated";
import { AutoCompleteFieldsFragmentDoc } from "./search.generated";
import * as Apollo from "@apollo/client";
export type GetRootGlossaryTermsQueryVariables = Types.Exact<{
  [key: string]: never;
}>;

export type GetRootGlossaryTermsQuery = { __typename?: "Query" } & {
  getRootGlossaryTerms?: Types.Maybe<
    { __typename?: "GetRootGlossaryTermsResult" } & Pick<
      Types.GetRootGlossaryTermsResult,
      "count" | "start" | "total"
    > & {
        terms: Array<
          { __typename?: "GlossaryTerm" } & ChildGlossaryTermFragment
        >;
      }
  >;
};

export type GetRootGlossaryNodesQueryVariables = Types.Exact<{
  [key: string]: never;
}>;

export type GetRootGlossaryNodesQuery = { __typename?: "Query" } & {
  getRootGlossaryNodes?: Types.Maybe<
    { __typename?: "GetRootGlossaryNodesResult" } & Pick<
      Types.GetRootGlossaryNodesResult,
      "count" | "start" | "total"
    > & {
        nodes: Array<
          {
            __typename?: "GlossaryNode";
          } & RootGlossaryNodeWithFourLayersFragment
        >;
      }
  >;
};

export type GetRelatedTermsQueryVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type GetRelatedTermsQuery = { __typename?: "Query" } & {
  glossaryTerm?: Types.Maybe<
    { __typename?: "GlossaryTerm" } & Pick<
      Types.GlossaryTerm,
      "urn" | "type" | "exists" | "name" | "hierarchicalName"
    > & {
        isRelatedTerms?: Types.Maybe<
          { __typename?: "EntityRelationshipsResult" } & Pick<
            Types.EntityRelationshipsResult,
            "start" | "count" | "total"
          > & {
              relationships: Array<
                { __typename?: "EntityRelationship" } & {
                  entity?: Types.Maybe<
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
                    | ({
                        __typename?: "Chart";
                      } & AutoCompleteFields_Chart_Fragment)
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
                    | ({
                        __typename?: "Form";
                      } & AutoCompleteFields_Form_Fragment)
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
                    | ({
                        __typename?: "Post";
                      } & AutoCompleteFields_Post_Fragment)
                    | ({
                        __typename?: "QueryEntity";
                      } & AutoCompleteFields_QueryEntity_Fragment)
                    | ({
                        __typename?: "Restricted";
                      } & AutoCompleteFields_Restricted_Fragment)
                    | ({
                        __typename?: "Role";
                      } & AutoCompleteFields_Role_Fragment)
                    | ({
                        __typename?: "SchemaFieldEntity";
                      } & AutoCompleteFields_SchemaFieldEntity_Fragment)
                    | ({
                        __typename?: "StructuredPropertyEntity";
                      } & AutoCompleteFields_StructuredPropertyEntity_Fragment)
                    | ({ __typename?: "Tag" } & AutoCompleteFields_Tag_Fragment)
                    | ({
                        __typename?: "Test";
                      } & AutoCompleteFields_Test_Fragment)
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
        hasRelatedTerms?: Types.Maybe<
          { __typename?: "EntityRelationshipsResult" } & Pick<
            Types.EntityRelationshipsResult,
            "start" | "count" | "total"
          > & {
              relationships: Array<
                { __typename?: "EntityRelationship" } & {
                  entity?: Types.Maybe<
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
                    | ({
                        __typename?: "Chart";
                      } & AutoCompleteFields_Chart_Fragment)
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
                    | ({
                        __typename?: "Form";
                      } & AutoCompleteFields_Form_Fragment)
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
                    | ({
                        __typename?: "Post";
                      } & AutoCompleteFields_Post_Fragment)
                    | ({
                        __typename?: "QueryEntity";
                      } & AutoCompleteFields_QueryEntity_Fragment)
                    | ({
                        __typename?: "Restricted";
                      } & AutoCompleteFields_Restricted_Fragment)
                    | ({
                        __typename?: "Role";
                      } & AutoCompleteFields_Role_Fragment)
                    | ({
                        __typename?: "SchemaFieldEntity";
                      } & AutoCompleteFields_SchemaFieldEntity_Fragment)
                    | ({
                        __typename?: "StructuredPropertyEntity";
                      } & AutoCompleteFields_StructuredPropertyEntity_Fragment)
                    | ({ __typename?: "Tag" } & AutoCompleteFields_Tag_Fragment)
                    | ({
                        __typename?: "Test";
                      } & AutoCompleteFields_Test_Fragment)
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
        isAChildren?: Types.Maybe<
          { __typename?: "EntityRelationshipsResult" } & Pick<
            Types.EntityRelationshipsResult,
            "start" | "count" | "total"
          > & {
              relationships: Array<
                { __typename?: "EntityRelationship" } & {
                  entity?: Types.Maybe<
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
                    | ({
                        __typename?: "Chart";
                      } & AutoCompleteFields_Chart_Fragment)
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
                    | ({
                        __typename?: "Form";
                      } & AutoCompleteFields_Form_Fragment)
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
                    | ({
                        __typename?: "Post";
                      } & AutoCompleteFields_Post_Fragment)
                    | ({
                        __typename?: "QueryEntity";
                      } & AutoCompleteFields_QueryEntity_Fragment)
                    | ({
                        __typename?: "Restricted";
                      } & AutoCompleteFields_Restricted_Fragment)
                    | ({
                        __typename?: "Role";
                      } & AutoCompleteFields_Role_Fragment)
                    | ({
                        __typename?: "SchemaFieldEntity";
                      } & AutoCompleteFields_SchemaFieldEntity_Fragment)
                    | ({
                        __typename?: "StructuredPropertyEntity";
                      } & AutoCompleteFields_StructuredPropertyEntity_Fragment)
                    | ({ __typename?: "Tag" } & AutoCompleteFields_Tag_Fragment)
                    | ({
                        __typename?: "Test";
                      } & AutoCompleteFields_Test_Fragment)
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
        containedBy?: Types.Maybe<
          { __typename?: "EntityRelationshipsResult" } & Pick<
            Types.EntityRelationshipsResult,
            "start" | "count" | "total"
          > & {
              relationships: Array<
                { __typename?: "EntityRelationship" } & {
                  entity?: Types.Maybe<
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
                    | ({
                        __typename?: "Chart";
                      } & AutoCompleteFields_Chart_Fragment)
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
                    | ({
                        __typename?: "Form";
                      } & AutoCompleteFields_Form_Fragment)
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
                    | ({
                        __typename?: "Post";
                      } & AutoCompleteFields_Post_Fragment)
                    | ({
                        __typename?: "QueryEntity";
                      } & AutoCompleteFields_QueryEntity_Fragment)
                    | ({
                        __typename?: "Restricted";
                      } & AutoCompleteFields_Restricted_Fragment)
                    | ({
                        __typename?: "Role";
                      } & AutoCompleteFields_Role_Fragment)
                    | ({
                        __typename?: "SchemaFieldEntity";
                      } & AutoCompleteFields_SchemaFieldEntity_Fragment)
                    | ({
                        __typename?: "StructuredPropertyEntity";
                      } & AutoCompleteFields_StructuredPropertyEntity_Fragment)
                    | ({ __typename?: "Tag" } & AutoCompleteFields_Tag_Fragment)
                    | ({
                        __typename?: "Test";
                      } & AutoCompleteFields_Test_Fragment)
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
      }
  >;
};

export type UpdateParentNodeMutationVariables = Types.Exact<{
  input: Types.UpdateParentNodeInput;
}>;

export type UpdateParentNodeMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "updateParentNode"
>;

export type DeleteGlossaryEntityMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
}>;

export type DeleteGlossaryEntityMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "deleteGlossaryEntity"
>;

export const GetRootGlossaryTermsDocument = gql`
  query getRootGlossaryTerms {
    getRootGlossaryTerms(input: { start: 0, count: 1000 }) {
      count
      start
      total
      terms {
        ...childGlossaryTerm
      }
    }
  }
  ${ChildGlossaryTermFragmentDoc}
`;

/**
 * __useGetRootGlossaryTermsQuery__
 *
 * To run a query within a React component, call `useGetRootGlossaryTermsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetRootGlossaryTermsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetRootGlossaryTermsQuery({
 *   variables: {
 *   },
 * });
 */
export function useGetRootGlossaryTermsQuery(
  baseOptions?: Apollo.QueryHookOptions<
    GetRootGlossaryTermsQuery,
    GetRootGlossaryTermsQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetRootGlossaryTermsQuery,
    GetRootGlossaryTermsQueryVariables
  >(GetRootGlossaryTermsDocument, baseOptions);
}
export function useGetRootGlossaryTermsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetRootGlossaryTermsQuery,
    GetRootGlossaryTermsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetRootGlossaryTermsQuery,
    GetRootGlossaryTermsQueryVariables
  >(GetRootGlossaryTermsDocument, baseOptions);
}
export type GetRootGlossaryTermsQueryHookResult = ReturnType<
  typeof useGetRootGlossaryTermsQuery
>;
export type GetRootGlossaryTermsLazyQueryHookResult = ReturnType<
  typeof useGetRootGlossaryTermsLazyQuery
>;
export type GetRootGlossaryTermsQueryResult = Apollo.QueryResult<
  GetRootGlossaryTermsQuery,
  GetRootGlossaryTermsQueryVariables
>;
export const GetRootGlossaryNodesDocument = gql`
  query getRootGlossaryNodes {
    getRootGlossaryNodes(input: { start: 0, count: 1000 }) {
      count
      start
      total
      nodes {
        ...rootGlossaryNodeWithFourLayers
      }
    }
  }
  ${RootGlossaryNodeWithFourLayersFragmentDoc}
`;

/**
 * __useGetRootGlossaryNodesQuery__
 *
 * To run a query within a React component, call `useGetRootGlossaryNodesQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetRootGlossaryNodesQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetRootGlossaryNodesQuery({
 *   variables: {
 *   },
 * });
 */
export function useGetRootGlossaryNodesQuery(
  baseOptions?: Apollo.QueryHookOptions<
    GetRootGlossaryNodesQuery,
    GetRootGlossaryNodesQueryVariables
  >,
) {
  return Apollo.useQuery<
    GetRootGlossaryNodesQuery,
    GetRootGlossaryNodesQueryVariables
  >(GetRootGlossaryNodesDocument, baseOptions);
}
export function useGetRootGlossaryNodesLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetRootGlossaryNodesQuery,
    GetRootGlossaryNodesQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetRootGlossaryNodesQuery,
    GetRootGlossaryNodesQueryVariables
  >(GetRootGlossaryNodesDocument, baseOptions);
}
export type GetRootGlossaryNodesQueryHookResult = ReturnType<
  typeof useGetRootGlossaryNodesQuery
>;
export type GetRootGlossaryNodesLazyQueryHookResult = ReturnType<
  typeof useGetRootGlossaryNodesLazyQuery
>;
export type GetRootGlossaryNodesQueryResult = Apollo.QueryResult<
  GetRootGlossaryNodesQuery,
  GetRootGlossaryNodesQueryVariables
>;
export const GetRelatedTermsDocument = gql`
  query getRelatedTerms($urn: String!) {
    glossaryTerm(urn: $urn) {
      urn
      type
      exists
      name
      hierarchicalName
      isRelatedTerms: relationships(
        input: { types: ["IsA"], direction: OUTGOING, start: 0, count: 10 }
      ) {
        start
        count
        total
        relationships {
          entity {
            ...autoCompleteFields
          }
        }
      }
      hasRelatedTerms: relationships(
        input: { types: ["HasA"], direction: OUTGOING, start: 0, count: 10 }
      ) {
        start
        count
        total
        relationships {
          entity {
            ...autoCompleteFields
          }
        }
      }
      isAChildren: relationships(
        input: { types: ["IsA"], direction: INCOMING, start: 0, count: 10 }
      ) {
        start
        count
        total
        relationships {
          entity {
            ...autoCompleteFields
          }
        }
      }
      containedBy: relationships(
        input: { types: ["HasA"], direction: INCOMING, start: 0, count: 10 }
      ) {
        start
        count
        total
        relationships {
          entity {
            ...autoCompleteFields
          }
        }
      }
    }
  }
  ${AutoCompleteFieldsFragmentDoc}
`;

/**
 * __useGetRelatedTermsQuery__
 *
 * To run a query within a React component, call `useGetRelatedTermsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetRelatedTermsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetRelatedTermsQuery({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useGetRelatedTermsQuery(
  baseOptions: Apollo.QueryHookOptions<
    GetRelatedTermsQuery,
    GetRelatedTermsQueryVariables
  >,
) {
  return Apollo.useQuery<GetRelatedTermsQuery, GetRelatedTermsQueryVariables>(
    GetRelatedTermsDocument,
    baseOptions,
  );
}
export function useGetRelatedTermsLazyQuery(
  baseOptions?: Apollo.LazyQueryHookOptions<
    GetRelatedTermsQuery,
    GetRelatedTermsQueryVariables
  >,
) {
  return Apollo.useLazyQuery<
    GetRelatedTermsQuery,
    GetRelatedTermsQueryVariables
  >(GetRelatedTermsDocument, baseOptions);
}
export type GetRelatedTermsQueryHookResult = ReturnType<
  typeof useGetRelatedTermsQuery
>;
export type GetRelatedTermsLazyQueryHookResult = ReturnType<
  typeof useGetRelatedTermsLazyQuery
>;
export type GetRelatedTermsQueryResult = Apollo.QueryResult<
  GetRelatedTermsQuery,
  GetRelatedTermsQueryVariables
>;
export const UpdateParentNodeDocument = gql`
  mutation updateParentNode($input: UpdateParentNodeInput!) {
    updateParentNode(input: $input)
  }
`;
export type UpdateParentNodeMutationFn = Apollo.MutationFunction<
  UpdateParentNodeMutation,
  UpdateParentNodeMutationVariables
>;

/**
 * __useUpdateParentNodeMutation__
 *
 * To run a mutation, you first call `useUpdateParentNodeMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateParentNodeMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateParentNodeMutation, { data, loading, error }] = useUpdateParentNodeMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateParentNodeMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateParentNodeMutation,
    UpdateParentNodeMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateParentNodeMutation,
    UpdateParentNodeMutationVariables
  >(UpdateParentNodeDocument, baseOptions);
}
export type UpdateParentNodeMutationHookResult = ReturnType<
  typeof useUpdateParentNodeMutation
>;
export type UpdateParentNodeMutationResult =
  Apollo.MutationResult<UpdateParentNodeMutation>;
export type UpdateParentNodeMutationOptions = Apollo.BaseMutationOptions<
  UpdateParentNodeMutation,
  UpdateParentNodeMutationVariables
>;
export const DeleteGlossaryEntityDocument = gql`
  mutation deleteGlossaryEntity($urn: String!) {
    deleteGlossaryEntity(urn: $urn)
  }
`;
export type DeleteGlossaryEntityMutationFn = Apollo.MutationFunction<
  DeleteGlossaryEntityMutation,
  DeleteGlossaryEntityMutationVariables
>;

/**
 * __useDeleteGlossaryEntityMutation__
 *
 * To run a mutation, you first call `useDeleteGlossaryEntityMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useDeleteGlossaryEntityMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [deleteGlossaryEntityMutation, { data, loading, error }] = useDeleteGlossaryEntityMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *   },
 * });
 */
export function useDeleteGlossaryEntityMutation(
  baseOptions?: Apollo.MutationHookOptions<
    DeleteGlossaryEntityMutation,
    DeleteGlossaryEntityMutationVariables
  >,
) {
  return Apollo.useMutation<
    DeleteGlossaryEntityMutation,
    DeleteGlossaryEntityMutationVariables
  >(DeleteGlossaryEntityDocument, baseOptions);
}
export type DeleteGlossaryEntityMutationHookResult = ReturnType<
  typeof useDeleteGlossaryEntityMutation
>;
export type DeleteGlossaryEntityMutationResult =
  Apollo.MutationResult<DeleteGlossaryEntityMutation>;
export type DeleteGlossaryEntityMutationOptions = Apollo.BaseMutationOptions<
  DeleteGlossaryEntityMutation,
  DeleteGlossaryEntityMutationVariables
>;
