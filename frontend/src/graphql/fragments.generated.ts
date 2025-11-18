/* eslint-disable */
import * as Types from "../types.generated";

import { gql } from "@apollo/client";
export type GlobalTagsFieldsFragment = { __typename?: "GlobalTags" } & {
  tags?: Types.Maybe<
    Array<
      { __typename?: "TagAssociation" } & Pick<
        Types.TagAssociation,
        "associatedUrn"
      > & {
          tag: { __typename?: "Tag" } & Pick<
            Types.Tag,
            "urn" | "type" | "name" | "description"
          > & {
              properties?: Types.Maybe<
                { __typename?: "TagProperties" } & Pick<
                  Types.TagProperties,
                  "name" | "colorHex"
                >
              >;
            };
          attribution?: Types.Maybe<
            { __typename?: "MetadataAttribution" } & AttributionFieldsFragment
          >;
        }
    >
  >;
};

export type DisplayPropertiesFieldsFragment = {
  __typename?: "DisplayProperties";
} & Pick<Types.DisplayProperties, "colorHex"> & {
    icon?: Types.Maybe<
      { __typename?: "IconProperties" } & Pick<
        Types.IconProperties,
        "name" | "style" | "iconLibrary"
      >
    >;
  };

export type RootGlossaryNodeWithFourLayersFragment = {
  __typename?: "GlossaryNode";
} & Pick<Types.GlossaryNode, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "GlossaryNodeProperties" } & Pick<
        Types.GlossaryNodeProperties,
        "name" | "description"
      >
    >;
    displayProperties?: Types.Maybe<
      { __typename?: "DisplayProperties" } & DisplayPropertiesFieldsFragment
    >;
    childrenCount?: Types.Maybe<
      { __typename?: "GlossaryNodeChildrenCount" } & Pick<
        Types.GlossaryNodeChildrenCount,
        "termsCount" | "nodesCount"
      >
    >;
    glossaryChildrenSearch?: Types.Maybe<
      { __typename?: "ScrollResults" } & Pick<Types.ScrollResults, "total"> & {
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
                  > & {
                      childrenCount?: Types.Maybe<
                        { __typename?: "GlossaryNodeChildrenCount" } & Pick<
                          Types.GlossaryNodeChildrenCount,
                          "termsCount" | "nodesCount"
                        >
                      >;
                      glossaryChildrenSearch?: Types.Maybe<
                        { __typename?: "ScrollResults" } & Pick<
                          Types.ScrollResults,
                          "total"
                        > & {
                            searchResults: Array<
                              { __typename?: "SearchResult" } & {
                                entity:
                                  | ({
                                      __typename?: "AccessTokenMetadata";
                                    } & Pick<
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
                                  | ({
                                      __typename?: "BusinessAttribute";
                                    } & Pick<
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
                                  | ({
                                      __typename?: "DataHubConnection";
                                    } & Pick<
                                      Types.DataHubConnection,
                                      "urn" | "type"
                                    >)
                                  | ({ __typename?: "DataHubFile" } & Pick<
                                      Types.DataHubFile,
                                      "urn" | "type"
                                    >)
                                  | ({
                                      __typename?: "DataHubPageModule";
                                    } & Pick<
                                      Types.DataHubPageModule,
                                      "urn" | "type"
                                    >)
                                  | ({
                                      __typename?: "DataHubPageTemplate";
                                    } & Pick<
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
                                  | ({
                                      __typename?: "DataPlatformInstance";
                                    } & Pick<
                                      Types.DataPlatformInstance,
                                      "urn" | "type"
                                    >)
                                  | ({
                                      __typename?: "DataProcessInstance";
                                    } & Pick<
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
                                  | ({
                                      __typename?: "ERModelRelationship";
                                    } & Pick<
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
                                    > & {
                                        childrenCount?: Types.Maybe<
                                          {
                                            __typename?: "GlossaryNodeChildrenCount";
                                          } & Pick<
                                            Types.GlossaryNodeChildrenCount,
                                            "termsCount" | "nodesCount"
                                          >
                                        >;
                                        glossaryChildrenSearch?: Types.Maybe<
                                          {
                                            __typename?: "ScrollResults";
                                          } & Pick<
                                            Types.ScrollResults,
                                            "total"
                                          > & {
                                              searchResults: Array<
                                                {
                                                  __typename?: "SearchResult";
                                                } & {
                                                  entity:
                                                    | ({
                                                        __typename?: "AccessTokenMetadata";
                                                      } & Pick<
                                                        Types.AccessTokenMetadata,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "Application";
                                                      } & Pick<
                                                        Types.Application,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "Assertion";
                                                      } & Pick<
                                                        Types.Assertion,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "BusinessAttribute";
                                                      } & Pick<
                                                        Types.BusinessAttribute,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "Chart";
                                                      } & Pick<
                                                        Types.Chart,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "Container";
                                                      } & Pick<
                                                        Types.Container,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "CorpGroup";
                                                      } & Pick<
                                                        Types.CorpGroup,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "CorpUser";
                                                      } & Pick<
                                                        Types.CorpUser,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "Dashboard";
                                                      } & Pick<
                                                        Types.Dashboard,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "DataContract";
                                                      } & Pick<
                                                        Types.DataContract,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "DataFlow";
                                                      } & Pick<
                                                        Types.DataFlow,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "DataHubConnection";
                                                      } & Pick<
                                                        Types.DataHubConnection,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "DataHubFile";
                                                      } & Pick<
                                                        Types.DataHubFile,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "DataHubPageModule";
                                                      } & Pick<
                                                        Types.DataHubPageModule,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "DataHubPageTemplate";
                                                      } & Pick<
                                                        Types.DataHubPageTemplate,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "DataHubPolicy";
                                                      } & Pick<
                                                        Types.DataHubPolicy,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "DataHubRole";
                                                      } & Pick<
                                                        Types.DataHubRole,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "DataHubView";
                                                      } & Pick<
                                                        Types.DataHubView,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "DataJob";
                                                      } & Pick<
                                                        Types.DataJob,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "DataPlatform";
                                                      } & Pick<
                                                        Types.DataPlatform,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "DataPlatformInstance";
                                                      } & Pick<
                                                        Types.DataPlatformInstance,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "DataProcessInstance";
                                                      } & Pick<
                                                        Types.DataProcessInstance,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "DataProduct";
                                                      } & Pick<
                                                        Types.DataProduct,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "DataTypeEntity";
                                                      } & Pick<
                                                        Types.DataTypeEntity,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "Dataset";
                                                      } & Pick<
                                                        Types.Dataset,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "Domain";
                                                      } & Pick<
                                                        Types.Domain,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "ERModelRelationship";
                                                      } & Pick<
                                                        Types.ErModelRelationship,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "EntityTypeEntity";
                                                      } & Pick<
                                                        Types.EntityTypeEntity,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "ExecutionRequest";
                                                      } & Pick<
                                                        Types.ExecutionRequest,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "Form";
                                                      } & Pick<
                                                        Types.Form,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "GlossaryNode";
                                                      } & Pick<
                                                        Types.GlossaryNode,
                                                        "urn" | "type"
                                                      > & {
                                                          childrenCount?: Types.Maybe<
                                                            {
                                                              __typename?: "GlossaryNodeChildrenCount";
                                                            } & Pick<
                                                              Types.GlossaryNodeChildrenCount,
                                                              | "termsCount"
                                                              | "nodesCount"
                                                            >
                                                          >;
                                                          glossaryChildrenSearch?: Types.Maybe<
                                                            {
                                                              __typename?: "ScrollResults";
                                                            } & Pick<
                                                              Types.ScrollResults,
                                                              "total"
                                                            > & {
                                                                searchResults: Array<
                                                                  {
                                                                    __typename?: "SearchResult";
                                                                  } & {
                                                                    entity:
                                                                      | ({
                                                                          __typename?: "AccessTokenMetadata";
                                                                        } & Pick<
                                                                          Types.AccessTokenMetadata,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "Application";
                                                                        } & Pick<
                                                                          Types.Application,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "Assertion";
                                                                        } & Pick<
                                                                          Types.Assertion,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "BusinessAttribute";
                                                                        } & Pick<
                                                                          Types.BusinessAttribute,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "Chart";
                                                                        } & Pick<
                                                                          Types.Chart,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "Container";
                                                                        } & Pick<
                                                                          Types.Container,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "CorpGroup";
                                                                        } & Pick<
                                                                          Types.CorpGroup,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "CorpUser";
                                                                        } & Pick<
                                                                          Types.CorpUser,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "Dashboard";
                                                                        } & Pick<
                                                                          Types.Dashboard,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "DataContract";
                                                                        } & Pick<
                                                                          Types.DataContract,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "DataFlow";
                                                                        } & Pick<
                                                                          Types.DataFlow,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "DataHubConnection";
                                                                        } & Pick<
                                                                          Types.DataHubConnection,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "DataHubFile";
                                                                        } & Pick<
                                                                          Types.DataHubFile,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "DataHubPageModule";
                                                                        } & Pick<
                                                                          Types.DataHubPageModule,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "DataHubPageTemplate";
                                                                        } & Pick<
                                                                          Types.DataHubPageTemplate,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "DataHubPolicy";
                                                                        } & Pick<
                                                                          Types.DataHubPolicy,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "DataHubRole";
                                                                        } & Pick<
                                                                          Types.DataHubRole,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "DataHubView";
                                                                        } & Pick<
                                                                          Types.DataHubView,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "DataJob";
                                                                        } & Pick<
                                                                          Types.DataJob,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "DataPlatform";
                                                                        } & Pick<
                                                                          Types.DataPlatform,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "DataPlatformInstance";
                                                                        } & Pick<
                                                                          Types.DataPlatformInstance,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "DataProcessInstance";
                                                                        } & Pick<
                                                                          Types.DataProcessInstance,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "DataProduct";
                                                                        } & Pick<
                                                                          Types.DataProduct,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "DataTypeEntity";
                                                                        } & Pick<
                                                                          Types.DataTypeEntity,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "Dataset";
                                                                        } & Pick<
                                                                          Types.Dataset,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "Domain";
                                                                        } & Pick<
                                                                          Types.Domain,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "ERModelRelationship";
                                                                        } & Pick<
                                                                          Types.ErModelRelationship,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "EntityTypeEntity";
                                                                        } & Pick<
                                                                          Types.EntityTypeEntity,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "ExecutionRequest";
                                                                        } & Pick<
                                                                          Types.ExecutionRequest,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "Form";
                                                                        } & Pick<
                                                                          Types.Form,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "GlossaryNode";
                                                                        } & Pick<
                                                                          Types.GlossaryNode,
                                                                          | "urn"
                                                                          | "type"
                                                                        > & {
                                                                            childrenCount?: Types.Maybe<
                                                                              {
                                                                                __typename?: "GlossaryNodeChildrenCount";
                                                                              } & Pick<
                                                                                Types.GlossaryNodeChildrenCount,
                                                                                | "termsCount"
                                                                                | "nodesCount"
                                                                              >
                                                                            >;
                                                                          })
                                                                      | ({
                                                                          __typename?: "GlossaryTerm";
                                                                        } & Pick<
                                                                          Types.GlossaryTerm,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "Incident";
                                                                        } & Pick<
                                                                          Types.Incident,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "MLFeature";
                                                                        } & Pick<
                                                                          Types.MlFeature,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "MLFeatureTable";
                                                                        } & Pick<
                                                                          Types.MlFeatureTable,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "MLModel";
                                                                        } & Pick<
                                                                          Types.MlModel,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "MLModelGroup";
                                                                        } & Pick<
                                                                          Types.MlModelGroup,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "MLPrimaryKey";
                                                                        } & Pick<
                                                                          Types.MlPrimaryKey,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "Notebook";
                                                                        } & Pick<
                                                                          Types.Notebook,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "OwnershipTypeEntity";
                                                                        } & Pick<
                                                                          Types.OwnershipTypeEntity,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "Post";
                                                                        } & Pick<
                                                                          Types.Post,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "QueryEntity";
                                                                        } & Pick<
                                                                          Types.QueryEntity,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "Restricted";
                                                                        } & Pick<
                                                                          Types.Restricted,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "Role";
                                                                        } & Pick<
                                                                          Types.Role,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "SchemaFieldEntity";
                                                                        } & Pick<
                                                                          Types.SchemaFieldEntity,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "StructuredPropertyEntity";
                                                                        } & Pick<
                                                                          Types.StructuredPropertyEntity,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "Tag";
                                                                        } & Pick<
                                                                          Types.Tag,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "Test";
                                                                        } & Pick<
                                                                          Types.Test,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "VersionSet";
                                                                        } & Pick<
                                                                          Types.VersionSet,
                                                                          | "urn"
                                                                          | "type"
                                                                        >)
                                                                      | ({
                                                                          __typename?: "VersionedDataset";
                                                                        } & Pick<
                                                                          Types.VersionedDataset,
                                                                          | "urn"
                                                                          | "type"
                                                                        >);
                                                                  }
                                                                >;
                                                              }
                                                          >;
                                                        })
                                                    | ({
                                                        __typename?: "GlossaryTerm";
                                                      } & Pick<
                                                        Types.GlossaryTerm,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "Incident";
                                                      } & Pick<
                                                        Types.Incident,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "MLFeature";
                                                      } & Pick<
                                                        Types.MlFeature,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "MLFeatureTable";
                                                      } & Pick<
                                                        Types.MlFeatureTable,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "MLModel";
                                                      } & Pick<
                                                        Types.MlModel,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "MLModelGroup";
                                                      } & Pick<
                                                        Types.MlModelGroup,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "MLPrimaryKey";
                                                      } & Pick<
                                                        Types.MlPrimaryKey,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "Notebook";
                                                      } & Pick<
                                                        Types.Notebook,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "OwnershipTypeEntity";
                                                      } & Pick<
                                                        Types.OwnershipTypeEntity,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "Post";
                                                      } & Pick<
                                                        Types.Post,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "QueryEntity";
                                                      } & Pick<
                                                        Types.QueryEntity,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "Restricted";
                                                      } & Pick<
                                                        Types.Restricted,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "Role";
                                                      } & Pick<
                                                        Types.Role,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "SchemaFieldEntity";
                                                      } & Pick<
                                                        Types.SchemaFieldEntity,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "StructuredPropertyEntity";
                                                      } & Pick<
                                                        Types.StructuredPropertyEntity,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "Tag";
                                                      } & Pick<
                                                        Types.Tag,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "Test";
                                                      } & Pick<
                                                        Types.Test,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "VersionSet";
                                                      } & Pick<
                                                        Types.VersionSet,
                                                        "urn" | "type"
                                                      >)
                                                    | ({
                                                        __typename?: "VersionedDataset";
                                                      } & Pick<
                                                        Types.VersionedDataset,
                                                        "urn" | "type"
                                                      >);
                                                }
                                              >;
                                            }
                                        >;
                                      })
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
                                  | ({
                                      __typename?: "OwnershipTypeEntity";
                                    } & Pick<
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
                                  | ({
                                      __typename?: "SchemaFieldEntity";
                                    } & Pick<
                                      Types.SchemaFieldEntity,
                                      "urn" | "type"
                                    >)
                                  | ({
                                      __typename?: "StructuredPropertyEntity";
                                    } & Pick<
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
                                    >);
                              }
                            >;
                          }
                      >;
                    })
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

export type GlossaryNodeFragment = { __typename?: "GlossaryNode" } & Pick<
  Types.GlossaryNode,
  "urn" | "type"
> & {
    properties?: Types.Maybe<
      { __typename?: "GlossaryNodeProperties" } & Pick<
        Types.GlossaryNodeProperties,
        "name" | "description"
      > & {
          createdOn?: Types.Maybe<
            { __typename?: "ResolvedAuditStamp" } & Pick<
              Types.ResolvedAuditStamp,
              "time"
            >
          >;
        }
    >;
    displayProperties?: Types.Maybe<
      { __typename?: "DisplayProperties" } & DisplayPropertiesFieldsFragment
    >;
    childrenCount?: Types.Maybe<
      { __typename?: "GlossaryNodeChildrenCount" } & Pick<
        Types.GlossaryNodeChildrenCount,
        "termsCount" | "nodesCount"
      >
    >;
    children?: Types.Maybe<
      { __typename?: "EntityRelationshipsResult" } & Pick<
        Types.EntityRelationshipsResult,
        "total"
      > & {
          relationships: Array<
            { __typename?: "EntityRelationship" } & Pick<
              Types.EntityRelationship,
              "type"
            > & {
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
                  | ({ __typename?: "GlossaryNode" } & Pick<
                      Types.GlossaryNode,
                      "urn" | "type"
                    > & {
                        properties?: Types.Maybe<
                          { __typename?: "GlossaryNodeProperties" } & Pick<
                            Types.GlossaryNodeProperties,
                            "name" | "description"
                          >
                        >;
                        displayProperties?: Types.Maybe<
                          {
                            __typename?: "DisplayProperties";
                          } & DisplayPropertiesFieldsFragment
                        >;
                      })
                  | ({ __typename?: "GlossaryTerm" } & Pick<
                      Types.GlossaryTerm,
                      "urn" | "name" | "type" | "hierarchicalName"
                    > & {
                        properties?: Types.Maybe<
                          { __typename?: "GlossaryTermProperties" } & Pick<
                            Types.GlossaryTermProperties,
                            "name" | "description"
                          >
                        >;
                      })
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
  };

export type GlossaryTermFragment = { __typename?: "GlossaryTerm" } & Pick<
  Types.GlossaryTerm,
  "urn" | "name" | "type" | "hierarchicalName"
> & {
    properties?: Types.Maybe<
      { __typename?: "GlossaryTermProperties" } & Pick<
        Types.GlossaryTermProperties,
        "name" | "description" | "definition" | "termSource"
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
    parentNodes?: Types.Maybe<
      { __typename?: "ParentNodesResult" } & ParentNodesFieldsFragment
    >;
  };

export type GlossaryTermsFragment = { __typename?: "GlossaryTerms" } & {
  terms?: Types.Maybe<
    Array<
      { __typename?: "GlossaryTermAssociation" } & Pick<
        Types.GlossaryTermAssociation,
        "associatedUrn"
      > & {
          term: { __typename?: "GlossaryTerm" } & GlossaryTermFragment;
          actor?: Types.Maybe<
            { __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn">
          >;
          attribution?: Types.Maybe<
            { __typename?: "MetadataAttribution" } & AttributionFieldsFragment
          >;
        }
    >
  >;
};

export type DeprecationFieldsFragment = { __typename?: "Deprecation" } & Pick<
  Types.Deprecation,
  "actor" | "deprecated" | "note" | "decommissionTime"
> & {
    actorEntity?: Types.Maybe<
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
    replacement?: Types.Maybe<
      | ({
          __typename?: "AccessTokenMetadata";
        } & EntityDisplayNameFields_AccessTokenMetadata_Fragment)
      | ({
          __typename?: "Application";
        } & EntityDisplayNameFields_Application_Fragment)
      | ({
          __typename?: "Assertion";
        } & EntityDisplayNameFields_Assertion_Fragment)
      | ({
          __typename?: "BusinessAttribute";
        } & EntityDisplayNameFields_BusinessAttribute_Fragment)
      | ({ __typename?: "Chart" } & EntityDisplayNameFields_Chart_Fragment)
      | ({
          __typename?: "Container";
        } & EntityDisplayNameFields_Container_Fragment)
      | ({
          __typename?: "CorpGroup";
        } & EntityDisplayNameFields_CorpGroup_Fragment)
      | ({
          __typename?: "CorpUser";
        } & EntityDisplayNameFields_CorpUser_Fragment)
      | ({
          __typename?: "Dashboard";
        } & EntityDisplayNameFields_Dashboard_Fragment)
      | ({
          __typename?: "DataContract";
        } & EntityDisplayNameFields_DataContract_Fragment)
      | ({
          __typename?: "DataFlow";
        } & EntityDisplayNameFields_DataFlow_Fragment)
      | ({
          __typename?: "DataHubConnection";
        } & EntityDisplayNameFields_DataHubConnection_Fragment)
      | ({
          __typename?: "DataHubFile";
        } & EntityDisplayNameFields_DataHubFile_Fragment)
      | ({
          __typename?: "DataHubPageModule";
        } & EntityDisplayNameFields_DataHubPageModule_Fragment)
      | ({
          __typename?: "DataHubPageTemplate";
        } & EntityDisplayNameFields_DataHubPageTemplate_Fragment)
      | ({
          __typename?: "DataHubPolicy";
        } & EntityDisplayNameFields_DataHubPolicy_Fragment)
      | ({
          __typename?: "DataHubRole";
        } & EntityDisplayNameFields_DataHubRole_Fragment)
      | ({
          __typename?: "DataHubView";
        } & EntityDisplayNameFields_DataHubView_Fragment)
      | ({ __typename?: "DataJob" } & EntityDisplayNameFields_DataJob_Fragment)
      | ({
          __typename?: "DataPlatform";
        } & EntityDisplayNameFields_DataPlatform_Fragment)
      | ({
          __typename?: "DataPlatformInstance";
        } & EntityDisplayNameFields_DataPlatformInstance_Fragment)
      | ({
          __typename?: "DataProcessInstance";
        } & EntityDisplayNameFields_DataProcessInstance_Fragment)
      | ({
          __typename?: "DataProduct";
        } & EntityDisplayNameFields_DataProduct_Fragment)
      | ({
          __typename?: "DataTypeEntity";
        } & EntityDisplayNameFields_DataTypeEntity_Fragment)
      | ({ __typename?: "Dataset" } & {
          platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
        } & EntityDisplayNameFields_Dataset_Fragment)
      | ({ __typename?: "Domain" } & EntityDisplayNameFields_Domain_Fragment)
      | ({
          __typename?: "ERModelRelationship";
        } & EntityDisplayNameFields_ErModelRelationship_Fragment)
      | ({
          __typename?: "EntityTypeEntity";
        } & EntityDisplayNameFields_EntityTypeEntity_Fragment)
      | ({
          __typename?: "ExecutionRequest";
        } & EntityDisplayNameFields_ExecutionRequest_Fragment)
      | ({ __typename?: "Form" } & EntityDisplayNameFields_Form_Fragment)
      | ({
          __typename?: "GlossaryNode";
        } & EntityDisplayNameFields_GlossaryNode_Fragment)
      | ({
          __typename?: "GlossaryTerm";
        } & EntityDisplayNameFields_GlossaryTerm_Fragment)
      | ({
          __typename?: "Incident";
        } & EntityDisplayNameFields_Incident_Fragment)
      | ({
          __typename?: "MLFeature";
        } & EntityDisplayNameFields_MlFeature_Fragment)
      | ({
          __typename?: "MLFeatureTable";
        } & EntityDisplayNameFields_MlFeatureTable_Fragment)
      | ({ __typename?: "MLModel" } & EntityDisplayNameFields_MlModel_Fragment)
      | ({
          __typename?: "MLModelGroup";
        } & EntityDisplayNameFields_MlModelGroup_Fragment)
      | ({
          __typename?: "MLPrimaryKey";
        } & EntityDisplayNameFields_MlPrimaryKey_Fragment)
      | ({
          __typename?: "Notebook";
        } & EntityDisplayNameFields_Notebook_Fragment)
      | ({
          __typename?: "OwnershipTypeEntity";
        } & EntityDisplayNameFields_OwnershipTypeEntity_Fragment)
      | ({ __typename?: "Post" } & EntityDisplayNameFields_Post_Fragment)
      | ({
          __typename?: "QueryEntity";
        } & EntityDisplayNameFields_QueryEntity_Fragment)
      | ({
          __typename?: "Restricted";
        } & EntityDisplayNameFields_Restricted_Fragment)
      | ({ __typename?: "Role" } & EntityDisplayNameFields_Role_Fragment)
      | ({
          __typename?: "SchemaFieldEntity";
        } & EntityDisplayNameFields_SchemaFieldEntity_Fragment)
      | ({
          __typename?: "StructuredPropertyEntity";
        } & EntityDisplayNameFields_StructuredPropertyEntity_Fragment)
      | ({ __typename?: "Tag" } & EntityDisplayNameFields_Tag_Fragment)
      | ({ __typename?: "Test" } & EntityDisplayNameFields_Test_Fragment)
      | ({
          __typename?: "VersionSet";
        } & EntityDisplayNameFields_VersionSet_Fragment)
      | ({
          __typename?: "VersionedDataset";
        } & EntityDisplayNameFields_VersionedDataset_Fragment)
    >;
  };

export type ParentContainersFieldsFragment = {
  __typename?: "ParentContainersResult";
} & Pick<Types.ParentContainersResult, "count"> & {
    containers: Array<
      { __typename?: "Container" } & ParentContainerFieldsFragment
    >;
  };

export type ParentNodesFieldsFragment = {
  __typename?: "ParentNodesResult";
} & Pick<Types.ParentNodesResult, "count"> & {
    nodes: Array<
      { __typename?: "GlossaryNode" } & Pick<
        Types.GlossaryNode,
        "urn" | "type"
      > & {
          properties?: Types.Maybe<
            { __typename?: "GlossaryNodeProperties" } & Pick<
              Types.GlossaryNodeProperties,
              "name"
            >
          >;
          displayProperties?: Types.Maybe<
            {
              __typename?: "DisplayProperties";
            } & DisplayPropertiesFieldsFragment
          >;
        }
    >;
  };

export type ParentDomainsFieldsFragment = {
  __typename?: "ParentDomainsResult";
} & Pick<Types.ParentDomainsResult, "count"> & {
    domains: Array<
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
      | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type">)
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
      | ({ __typename?: "Domain" } & Pick<Types.Domain, "urn" | "type"> & {
            displayProperties?: Types.Maybe<
              {
                __typename?: "DisplayProperties";
              } & DisplayPropertiesFieldsFragment
            >;
            properties?: Types.Maybe<
              { __typename?: "DomainProperties" } & Pick<
                Types.DomainProperties,
                "name" | "description"
              >
            >;
          })
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

export type OwnershipFieldsFragment = { __typename?: "Ownership" } & {
  owners?: Types.Maybe<
    Array<
      { __typename?: "Owner" } & Pick<Types.Owner, "type" | "associatedUrn"> & {
          owner:
            | ({ __typename?: "CorpGroup" } & Pick<
                Types.CorpGroup,
                "urn" | "type" | "name"
              > & {
                  properties?: Types.Maybe<
                    { __typename?: "CorpGroupProperties" } & Pick<
                      Types.CorpGroupProperties,
                      "displayName" | "email"
                    >
                  >;
                  info?: Types.Maybe<
                    { __typename?: "CorpGroupInfo" } & Pick<
                      Types.CorpGroupInfo,
                      "displayName" | "email" | "groups"
                    > & {
                        admins?: Types.Maybe<
                          Array<
                            { __typename?: "CorpUser" } & Pick<
                              Types.CorpUser,
                              "urn" | "username"
                            > & {
                                info?: Types.Maybe<
                                  { __typename?: "CorpUserInfo" } & Pick<
                                    Types.CorpUserInfo,
                                    | "active"
                                    | "displayName"
                                    | "title"
                                    | "email"
                                    | "firstName"
                                    | "lastName"
                                    | "fullName"
                                  >
                                >;
                                editableInfo?: Types.Maybe<
                                  {
                                    __typename?: "CorpUserEditableInfo";
                                  } & Pick<
                                    Types.CorpUserEditableInfo,
                                    "pictureLink" | "teams" | "skills"
                                  >
                                >;
                              }
                          >
                        >;
                        members?: Types.Maybe<
                          Array<
                            { __typename?: "CorpUser" } & Pick<
                              Types.CorpUser,
                              "urn" | "username"
                            > & {
                                info?: Types.Maybe<
                                  { __typename?: "CorpUserInfo" } & Pick<
                                    Types.CorpUserInfo,
                                    | "active"
                                    | "displayName"
                                    | "title"
                                    | "email"
                                    | "firstName"
                                    | "lastName"
                                    | "fullName"
                                  >
                                >;
                                editableInfo?: Types.Maybe<
                                  {
                                    __typename?: "CorpUserEditableInfo";
                                  } & Pick<
                                    Types.CorpUserEditableInfo,
                                    "pictureLink" | "teams" | "skills"
                                  >
                                >;
                              }
                          >
                        >;
                      }
                  >;
                })
            | ({ __typename?: "CorpUser" } & Pick<
                Types.CorpUser,
                "urn" | "type" | "username"
              > & {
                  info?: Types.Maybe<
                    { __typename?: "CorpUserInfo" } & Pick<
                      Types.CorpUserInfo,
                      | "active"
                      | "displayName"
                      | "title"
                      | "email"
                      | "firstName"
                      | "lastName"
                      | "fullName"
                    >
                  >;
                  properties?: Types.Maybe<
                    { __typename?: "CorpUserProperties" } & Pick<
                      Types.CorpUserProperties,
                      | "active"
                      | "displayName"
                      | "title"
                      | "email"
                      | "firstName"
                      | "lastName"
                      | "fullName"
                    >
                  >;
                  editableProperties?: Types.Maybe<
                    { __typename?: "CorpUserEditableProperties" } & Pick<
                      Types.CorpUserEditableProperties,
                      "displayName" | "title" | "pictureLink" | "email"
                    >
                  >;
                });
          ownershipType?: Types.Maybe<
            { __typename?: "OwnershipTypeEntity" } & Pick<
              Types.OwnershipTypeEntity,
              "urn" | "type"
            > & {
                info?: Types.Maybe<
                  { __typename?: "OwnershipTypeInfo" } & Pick<
                    Types.OwnershipTypeInfo,
                    "name" | "description"
                  >
                >;
                status?: Types.Maybe<
                  { __typename?: "Status" } & Pick<Types.Status, "removed">
                >;
              }
          >;
          attribution?: Types.Maybe<
            { __typename?: "MetadataAttribution" } & AttributionFieldsFragment
          >;
        }
    >
  >;
  lastModified: { __typename?: "AuditStamp" } & Pick<Types.AuditStamp, "time">;
};

export type EmbedFieldsFragment = { __typename?: "Embed" } & Pick<
  Types.Embed,
  "renderUrl"
>;

export type ResolvedActorFields_CorpGroup_Fragment = {
  __typename?: "CorpGroup";
} & Pick<Types.CorpGroup, "urn"> &
  EntityDisplayNameFields_CorpGroup_Fragment;

export type ResolvedActorFields_CorpUser_Fragment = {
  __typename?: "CorpUser";
} & Pick<Types.CorpUser, "urn"> &
  EntityDisplayNameFields_CorpUser_Fragment;

export type ResolvedActorFieldsFragment =
  | ResolvedActorFields_CorpGroup_Fragment
  | ResolvedActorFields_CorpUser_Fragment;

export type InstitutionalMemoryFieldsFragment = {
  __typename?: "InstitutionalMemory";
} & {
  elements: Array<
    { __typename?: "InstitutionalMemoryMetadata" } & Pick<
      Types.InstitutionalMemoryMetadata,
      "url" | "description" | "label" | "associatedUrn"
    > & {
        actor:
          | ({
              __typename?: "CorpGroup";
            } & ResolvedActorFields_CorpGroup_Fragment)
          | ({
              __typename?: "CorpUser";
            } & ResolvedActorFields_CorpUser_Fragment);
        created: { __typename?: "AuditStamp" } & Pick<
          Types.AuditStamp,
          "actor" | "time"
        >;
        settings?: Types.Maybe<
          { __typename?: "InstitutionalMemoryMetadataSettings" } & Pick<
            Types.InstitutionalMemoryMetadataSettings,
            "showInAssetPreview"
          >
        >;
      }
  >;
};

export type AttributionFieldsFragment = {
  __typename?: "MetadataAttribution";
} & Pick<Types.MetadataAttribution, "time"> & {
    actor:
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
    source?: Types.Maybe<
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
      | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type">)
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
    sourceDetail?: Types.Maybe<
      Array<
        { __typename?: "StringMapEntry" } & Pick<
          Types.StringMapEntry,
          "key" | "value"
        >
      >
    >;
  };

export type DocumentationFieldsFragment = { __typename?: "Documentation" } & {
  documentations: Array<
    { __typename?: "DocumentationAssociation" } & Pick<
      Types.DocumentationAssociation,
      "documentation"
    > & {
        attribution?: Types.Maybe<
          { __typename?: "MetadataAttribution" } & AttributionFieldsFragment
        >;
      }
  >;
};

export type NonRecursiveDatasetFieldsFragment = {
  __typename?: "Dataset";
} & Pick<
  Types.Dataset,
  | "urn"
  | "name"
  | "type"
  | "origin"
  | "uri"
  | "lastIngested"
  | "platformNativeType"
> & {
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    properties?: Types.Maybe<
      { __typename?: "DatasetProperties" } & Pick<
        Types.DatasetProperties,
        "name" | "qualifiedName" | "description" | "externalUrl"
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
    editableProperties?: Types.Maybe<
      { __typename?: "DatasetEditableProperties" } & Pick<
        Types.DatasetEditableProperties,
        "name" | "description"
      >
    >;
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
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
    application?: Types.Maybe<
      { __typename?: "ApplicationAssociation" } & EntityApplicationFragment
    >;
    container?: Types.Maybe<
      { __typename?: "Container" } & EntityContainerFragment
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    embed?: Types.Maybe<{ __typename?: "Embed" } & EmbedFieldsFragment>;
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
    >;
  };

export type NonRecursiveDataFlowFieldsFragment = {
  __typename?: "DataFlow";
} & Pick<
  Types.DataFlow,
  "urn" | "type" | "orchestrator" | "flowId" | "cluster"
> & {
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
    editableProperties?: Types.Maybe<
      { __typename?: "DataFlowEditableProperties" } & Pick<
        Types.DataFlowEditableProperties,
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
    application?: Types.Maybe<
      { __typename?: "ApplicationAssociation" } & EntityApplicationFragment
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
  } & EntityDataProduct_DataFlow_Fragment;

export type NonRecursiveDataJobFieldsFragment = {
  __typename?: "DataJob";
} & Pick<Types.DataJob, "urn"> & {
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
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    application?: Types.Maybe<
      { __typename?: "ApplicationAssociation" } & EntityApplicationFragment
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
    platform?: Types.Maybe<
      { __typename?: "DataPlatform" } & PlatformFieldsFragment
    >;
  } & EntityDataProduct_DataJob_Fragment;

export type DataJobFieldsFragment = { __typename?: "DataJob" } & Pick<
  Types.DataJob,
  "urn" | "type" | "exists" | "lastIngested" | "jobId"
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
    editableProperties?: Types.Maybe<
      { __typename?: "DataJobEditableProperties" } & Pick<
        Types.DataJobEditableProperties,
        "description"
      >
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
    application?: Types.Maybe<
      { __typename?: "ApplicationAssociation" } & EntityApplicationFragment
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    status?: Types.Maybe<
      { __typename?: "Status" } & Pick<Types.Status, "removed">
    >;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
    >;
    privileges?: Types.Maybe<
      { __typename?: "EntityPrivileges" } & Pick<
        Types.EntityPrivileges,
        "canEditLineage"
      >
    >;
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
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
    dataTransformLogic?: Types.Maybe<
      { __typename?: "DataTransformLogic" } & DataTransformLogicFieldsFragment
    >;
    platform?: Types.Maybe<
      { __typename?: "DataPlatform" } & PlatformFieldsFragment
    >;
  } & EntityDataProduct_DataJob_Fragment;

export type DashboardFieldsFragment = { __typename?: "Dashboard" } & Pick<
  Types.Dashboard,
  "urn" | "type" | "exists" | "lastIngested" | "tool" | "dashboardId"
> & {
    properties?: Types.Maybe<
      { __typename?: "DashboardProperties" } & Pick<
        Types.DashboardProperties,
        "name" | "description" | "externalUrl" | "access" | "lastRefreshed"
      > & {
          customProperties?: Types.Maybe<
            Array<
              { __typename?: "CustomPropertiesEntry" } & Pick<
                Types.CustomPropertiesEntry,
                "key" | "value"
              >
            >
          >;
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
    editableProperties?: Types.Maybe<
      { __typename?: "DashboardEditableProperties" } & Pick<
        Types.DashboardEditableProperties,
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
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    application?: Types.Maybe<
      { __typename?: "ApplicationAssociation" } & EntityApplicationFragment
    >;
    parentContainers?: Types.Maybe<
      { __typename?: "ParentContainersResult" } & ParentContainersFieldsFragment
    >;
    status?: Types.Maybe<
      { __typename?: "Status" } & Pick<Types.Status, "removed">
    >;
    embed?: Types.Maybe<{ __typename?: "Embed" } & EmbedFieldsFragment>;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
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
    inputFields?: Types.Maybe<
      { __typename?: "InputFields" } & InputFieldsFieldsFragment
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
    privileges?: Types.Maybe<
      { __typename?: "EntityPrivileges" } & Pick<
        Types.EntityPrivileges,
        "canEditLineage" | "canEditEmbed"
      >
    >;
    health?: Types.Maybe<
      Array<{ __typename?: "Health" } & EntityHealthFragment>
    >;
  } & EntityDataProduct_Dashboard_Fragment;

export type NonRecursiveMlFeatureFragment = { __typename?: "MLFeature" } & Pick<
  Types.MlFeature,
  | "urn"
  | "type"
  | "exists"
  | "lastIngested"
  | "name"
  | "featureNamespace"
  | "description"
  | "dataType"
> & {
    properties?: Types.Maybe<
      { __typename?: "MLFeatureProperties" } & Pick<
        Types.MlFeatureProperties,
        "description" | "dataType"
      > & {
          version?: Types.Maybe<
            { __typename?: "VersionTag" } & Pick<Types.VersionTag, "versionTag">
          >;
          sources?: Types.Maybe<
            Array<
              Types.Maybe<
                { __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  | "urn"
                  | "name"
                  | "type"
                  | "origin"
                  | "description"
                  | "uri"
                  | "platformNativeType"
                > & {
                    platform: {
                      __typename?: "DataPlatform";
                    } & PlatformFieldsFragment;
                  }
              >
            >
          >;
        }
    >;
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
    status?: Types.Maybe<
      { __typename?: "Status" } & Pick<Types.Status, "removed">
    >;
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
    >;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    application?: Types.Maybe<
      { __typename?: "ApplicationAssociation" } & EntityApplicationFragment
    >;
    tags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "MLFeatureEditableProperties" } & Pick<
        Types.MlFeatureEditableProperties,
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
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
    >;
    featureTables?: Types.Maybe<
      { __typename?: "EntityRelationshipsResult" } & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
  } & EntityDataProduct_MlFeature_Fragment;

export type NonRecursiveMlPrimaryKeyFragment = {
  __typename?: "MLPrimaryKey";
} & Pick<
  Types.MlPrimaryKey,
  | "urn"
  | "type"
  | "exists"
  | "lastIngested"
  | "name"
  | "featureNamespace"
  | "description"
  | "dataType"
> & {
    properties?: Types.Maybe<
      { __typename?: "MLPrimaryKeyProperties" } & Pick<
        Types.MlPrimaryKeyProperties,
        "description" | "dataType"
      > & {
          version?: Types.Maybe<
            { __typename?: "VersionTag" } & Pick<Types.VersionTag, "versionTag">
          >;
          sources?: Types.Maybe<
            Array<
              Types.Maybe<
                { __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  | "urn"
                  | "name"
                  | "type"
                  | "origin"
                  | "description"
                  | "uri"
                  | "platformNativeType"
                > & {
                    platform: {
                      __typename?: "DataPlatform";
                    } & PlatformFieldsFragment;
                  }
              >
            >
          >;
        }
    >;
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
    status?: Types.Maybe<
      { __typename?: "Status" } & Pick<Types.Status, "removed">
    >;
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
    >;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    tags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "MLPrimaryKeyEditableProperties" } & Pick<
        Types.MlPrimaryKeyEditableProperties,
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
    featureTables?: Types.Maybe<
      { __typename?: "EntityRelationshipsResult" } & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
  } & EntityDataProduct_MlPrimaryKey_Fragment;

export type NonRecursiveMlFeatureTableFragment = {
  __typename?: "MLFeatureTable";
} & Pick<
  Types.MlFeatureTable,
  "urn" | "type" | "exists" | "lastIngested" | "name" | "description"
> & {
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    properties?: Types.Maybe<
      { __typename?: "MLFeatureTableProperties" } & Pick<
        Types.MlFeatureTableProperties,
        "description"
      > & {
          mlFeatures?: Types.Maybe<
            Array<
              Types.Maybe<
                { __typename?: "MLFeature" } & NonRecursiveMlFeatureFragment
              >
            >
          >;
          mlPrimaryKeys?: Types.Maybe<
            Array<
              Types.Maybe<
                {
                  __typename?: "MLPrimaryKey";
                } & NonRecursiveMlPrimaryKeyFragment
              >
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
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
    status?: Types.Maybe<
      { __typename?: "Status" } & Pick<Types.Status, "removed">
    >;
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
    >;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    application?: Types.Maybe<
      { __typename?: "ApplicationAssociation" } & EntityApplicationFragment
    >;
    tags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "MLFeatureTableEditableProperties" } & Pick<
        Types.MlFeatureTableEditableProperties,
        "description"
      >
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
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
  } & EntityDataProduct_MlFeatureTable_Fragment;

export type EntitySchemaFieldEntityFieldsFragment = {
  __typename?: "SchemaFieldEntity";
} & Pick<Types.SchemaFieldEntity, "urn" | "fieldPath" | "type"> & {
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
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
    businessAttributes?: Types.Maybe<
      { __typename?: "BusinessAttributes" } & {
        businessAttribute?: Types.Maybe<
          {
            __typename?: "BusinessAttributeAssociation";
          } & BusinessAttributeFragment
        >;
      }
    >;
    documentation?: Types.Maybe<
      { __typename?: "Documentation" } & DocumentationFieldsFragment
    >;
    tags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
    >;
  };

export type EntitySchemaFieldFieldsFragment = {
  __typename?: "SchemaField";
} & Pick<
  Types.SchemaField,
  | "fieldPath"
  | "label"
  | "jsonPath"
  | "nullable"
  | "description"
  | "type"
  | "nativeDataType"
  | "recursive"
  | "isPartOfKey"
  | "isPartitioningKey"
> & {
    globalTags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
    >;
    schemaFieldEntity?: Types.Maybe<
      {
        __typename?: "SchemaFieldEntity";
      } & EntitySchemaFieldEntityFieldsFragment
    >;
  };

export type SchemaMetadataFieldsFragment = {
  __typename?: "SchemaMetadata";
} & Pick<
  Types.SchemaMetadata,
  | "aspectVersion"
  | "createdAt"
  | "datasetUrn"
  | "name"
  | "platformUrn"
  | "version"
  | "cluster"
  | "hash"
  | "primaryKeys"
> & {
    platformSchema?: Types.Maybe<
      | ({ __typename?: "KeyValueSchema" } & Pick<
          Types.KeyValueSchema,
          "keySchema" | "valueSchema"
        >)
      | ({ __typename?: "TableSchema" } & Pick<Types.TableSchema, "schema">)
    >;
    fields: Array<
      { __typename?: "SchemaField" } & EntitySchemaFieldFieldsFragment
    >;
    foreignKeys?: Types.Maybe<
      Array<
        Types.Maybe<
          { __typename?: "ForeignKeyConstraint" } & Pick<
            Types.ForeignKeyConstraint,
            "name"
          > & {
              sourceFields?: Types.Maybe<
                Array<
                  Types.Maybe<
                    { __typename?: "SchemaFieldEntity" } & Pick<
                      Types.SchemaFieldEntity,
                      "fieldPath"
                    >
                  >
                >
              >;
              foreignFields?: Types.Maybe<
                Array<
                  Types.Maybe<
                    { __typename?: "SchemaFieldEntity" } & Pick<
                      Types.SchemaFieldEntity,
                      "fieldPath"
                    >
                  >
                >
              >;
              foreignDataset?: Types.Maybe<
                { __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  | "urn"
                  | "name"
                  | "type"
                  | "origin"
                  | "uri"
                  | "platformNativeType"
                > & {
                    properties?: Types.Maybe<
                      { __typename?: "DatasetProperties" } & Pick<
                        Types.DatasetProperties,
                        "description"
                      >
                    >;
                    platform: {
                      __typename?: "DataPlatform";
                    } & PlatformFieldsFragment;
                    ownership?: Types.Maybe<
                      { __typename?: "Ownership" } & OwnershipFieldsFragment
                    >;
                    globalTags?: Types.Maybe<
                      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
                    >;
                    glossaryTerms?: Types.Maybe<
                      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
                    >;
                  }
              >;
            }
        >
      >
    >;
  };

export type NonRecursiveMlModelFragment = { __typename?: "MLModel" } & Pick<
  Types.MlModel,
  "urn" | "type" | "exists" | "lastIngested" | "name" | "description" | "origin"
> & {
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    properties?: Types.Maybe<
      { __typename?: "MLModelProperties" } & Pick<
        Types.MlModelProperties,
        | "name"
        | "description"
        | "date"
        | "externalUrl"
        | "version"
        | "type"
        | "mlFeatures"
      > & {
          created?: Types.Maybe<
            { __typename?: "AuditStamp" } & Pick<
              Types.AuditStamp,
              "time" | "actor"
            >
          >;
          lastModified?: Types.Maybe<
            { __typename?: "AuditStamp" } & Pick<
              Types.AuditStamp,
              "time" | "actor"
            >
          >;
          trainingMetrics?: Types.Maybe<
            Array<
              Types.Maybe<
                { __typename?: "MLMetric" } & Pick<
                  Types.MlMetric,
                  "name" | "description" | "value"
                >
              >
            >
          >;
          hyperParams?: Types.Maybe<
            Array<
              Types.Maybe<
                { __typename?: "MLHyperParam" } & Pick<
                  Types.MlHyperParam,
                  "name" | "description" | "value"
                >
              >
            >
          >;
          groups?: Types.Maybe<
            Array<
              Types.Maybe<
                { __typename?: "MLModelGroup" } & Pick<
                  Types.MlModelGroup,
                  "urn" | "name" | "description"
                > & {
                    properties?: Types.Maybe<
                      { __typename?: "MLModelGroupProperties" } & Pick<
                        Types.MlModelGroupProperties,
                        "name"
                      >
                    >;
                    editableProperties?: Types.Maybe<
                      { __typename?: "MLModelGroupEditableProperties" } & Pick<
                        Types.MlModelGroupEditableProperties,
                        "description"
                      >
                    >;
                  }
              >
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
          mlModelLineageInfo?: Types.Maybe<
            { __typename?: "MLModelLineageInfo" } & Pick<
              Types.MlModelLineageInfo,
              "trainingJobs" | "downstreamJobs"
            >
          >;
        }
    >;
    globalTags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    status?: Types.Maybe<
      { __typename?: "Status" } & Pick<Types.Status, "removed">
    >;
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
    >;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    application?: Types.Maybe<
      { __typename?: "ApplicationAssociation" } & EntityApplicationFragment
    >;
    tags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "MLModelEditableProperties" } & Pick<
        Types.MlModelEditableProperties,
        "description"
      >
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
    >;
  } & EntityDataProduct_MlModel_Fragment;

export type NonRecursiveMlModelGroupFieldsFragment = {
  __typename?: "MLModelGroup";
} & Pick<
  Types.MlModelGroup,
  "urn" | "type" | "exists" | "lastIngested" | "name" | "description" | "origin"
> & {
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    dataPlatformInstance?: Types.Maybe<
      {
        __typename?: "DataPlatformInstance";
      } & DataPlatformInstanceFieldsFragment
    >;
    ownership?: Types.Maybe<
      { __typename?: "Ownership" } & OwnershipFieldsFragment
    >;
    status?: Types.Maybe<
      { __typename?: "Status" } & Pick<Types.Status, "removed">
    >;
    glossaryTerms?: Types.Maybe<
      { __typename?: "GlossaryTerms" } & GlossaryTermsFragment
    >;
    domain?: Types.Maybe<
      { __typename?: "DomainAssociation" } & EntityDomainFragment
    >;
    application?: Types.Maybe<
      { __typename?: "ApplicationAssociation" } & EntityApplicationFragment
    >;
    tags?: Types.Maybe<
      { __typename?: "GlobalTags" } & GlobalTagsFieldsFragment
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "MLModelGroupEditableProperties" } & Pick<
        Types.MlModelGroupEditableProperties,
        "description"
      >
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
    properties?: Types.Maybe<
      { __typename?: "MLModelGroupProperties" } & Pick<
        Types.MlModelGroupProperties,
        "name" | "description"
      > & {
          created?: Types.Maybe<
            { __typename?: "AuditStamp" } & Pick<
              Types.AuditStamp,
              "time" | "actor"
            >
          >;
          lastModified?: Types.Maybe<
            { __typename?: "AuditStamp" } & Pick<
              Types.AuditStamp,
              "time" | "actor"
            >
          >;
          mlModelLineageInfo?: Types.Maybe<
            { __typename?: "MLModelLineageInfo" } & Pick<
              Types.MlModelLineageInfo,
              "trainingJobs" | "downstreamJobs"
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
    browsePathV2?: Types.Maybe<
      { __typename?: "BrowsePathV2" } & BrowsePathV2FieldsFragment
    >;
    institutionalMemory?: Types.Maybe<
      { __typename?: "InstitutionalMemory" } & InstitutionalMemoryFieldsFragment
    >;
  } & EntityDataProduct_MlModelGroup_Fragment;

export type PlatformFieldsFragment = { __typename?: "DataPlatform" } & Pick<
  Types.DataPlatform,
  "urn" | "type" | "lastIngested" | "name" | "displayName"
> & {
    properties?: Types.Maybe<
      { __typename?: "DataPlatformProperties" } & Pick<
        Types.DataPlatformProperties,
        "type" | "displayName" | "datasetNameDelimiter" | "logoUrl"
      >
    >;
    info?: Types.Maybe<
      { __typename?: "DataPlatformInfo" } & Pick<
        Types.DataPlatformInfo,
        "type" | "displayName" | "datasetNameDelimiter" | "logoUrl"
      >
    >;
  };

export type NonConflictingPlatformFieldsFragment = {
  __typename?: "DataPlatform";
} & Pick<Types.DataPlatform, "urn" | "type" | "name" | "displayName"> & {
    properties?: Types.Maybe<
      { __typename?: "DataPlatformProperties" } & Pick<
        Types.DataPlatformProperties,
        "displayName" | "datasetNameDelimiter" | "logoUrl"
      >
    >;
    info?: Types.Maybe<
      { __typename?: "DataPlatformInfo" } & Pick<
        Types.DataPlatformInfo,
        "type" | "displayName" | "datasetNameDelimiter" | "logoUrl"
      >
    >;
  };

export type DataPlatformInstanceFieldsFragment = {
  __typename?: "DataPlatformInstance";
} & Pick<Types.DataPlatformInstance, "urn" | "type" | "instanceId"> & {
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
  };

export type EntityContainerFragment = { __typename?: "Container" } & Pick<
  Types.Container,
  "urn"
> & {
    platform: { __typename?: "DataPlatform" } & PlatformFieldsFragment;
    properties?: Types.Maybe<
      { __typename?: "ContainerProperties" } & Pick<
        Types.ContainerProperties,
        "name"
      >
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
    deprecation?: Types.Maybe<
      { __typename?: "Deprecation" } & DeprecationFieldsFragment
    >;
  };

export type ParentContainerFieldsFragment = { __typename?: "Container" } & Pick<
  Types.Container,
  "urn" | "type"
> & {
    properties?: Types.Maybe<
      { __typename?: "ContainerProperties" } & Pick<
        Types.ContainerProperties,
        "name"
      >
    >;
    subTypes?: Types.Maybe<
      { __typename?: "SubTypes" } & Pick<Types.SubTypes, "typeNames">
    >;
  };

export type DomainEntitiesFieldsFragment = { __typename?: "Domain" } & {
  entities?: Types.Maybe<
    { __typename?: "SearchResults" } & Pick<Types.SearchResults, "total">
  >;
  dataProducts?: Types.Maybe<
    { __typename?: "SearchResults" } & Pick<Types.SearchResults, "total">
  >;
  applications?: Types.Maybe<
    { __typename?: "SearchResults" } & Pick<Types.SearchResults, "total">
  >;
  children?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    >
  >;
};

export type EntityDomainFragment = { __typename?: "DomainAssociation" } & Pick<
  Types.DomainAssociation,
  "associatedUrn"
> & {
    domain: { __typename?: "Domain" } & Pick<Types.Domain, "urn" | "type"> & {
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
  };

export type EntityApplicationFragment = {
  __typename?: "ApplicationAssociation";
} & {
  application: { __typename?: "Application" } & Pick<
    Types.Application,
    "urn" | "type"
  > & {
      properties?: Types.Maybe<
        { __typename?: "ApplicationProperties" } & Pick<
          Types.ApplicationProperties,
          "name" | "description" | "externalUrl"
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
      domain?: Types.Maybe<
        { __typename?: "DomainAssociation" } & EntityDomainFragment
      >;
      children?: Types.Maybe<
        { __typename?: "EntityRelationshipsResult" } & Pick<
          Types.EntityRelationshipsResult,
          "total"
        >
      >;
    };
};

export type EntityDataProduct_AccessTokenMetadata_Fragment = {
  __typename?: "AccessTokenMetadata";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_Application_Fragment = {
  __typename?: "Application";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_Assertion_Fragment = {
  __typename?: "Assertion";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_BusinessAttribute_Fragment = {
  __typename?: "BusinessAttribute";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_Chart_Fragment = { __typename?: "Chart" } & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_Container_Fragment = {
  __typename?: "Container";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_CorpGroup_Fragment = {
  __typename?: "CorpGroup";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_CorpUser_Fragment = {
  __typename?: "CorpUser";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_Dashboard_Fragment = {
  __typename?: "Dashboard";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_DataContract_Fragment = {
  __typename?: "DataContract";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_DataFlow_Fragment = {
  __typename?: "DataFlow";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_DataHubConnection_Fragment = {
  __typename?: "DataHubConnection";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_DataHubFile_Fragment = {
  __typename?: "DataHubFile";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_DataHubPageModule_Fragment = {
  __typename?: "DataHubPageModule";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_DataHubPageTemplate_Fragment = {
  __typename?: "DataHubPageTemplate";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_DataHubPolicy_Fragment = {
  __typename?: "DataHubPolicy";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_DataHubRole_Fragment = {
  __typename?: "DataHubRole";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_DataHubView_Fragment = {
  __typename?: "DataHubView";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_DataJob_Fragment = { __typename?: "DataJob" } & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_DataPlatform_Fragment = {
  __typename?: "DataPlatform";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_DataPlatformInstance_Fragment = {
  __typename?: "DataPlatformInstance";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_DataProcessInstance_Fragment = {
  __typename?: "DataProcessInstance";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_DataProduct_Fragment = {
  __typename?: "DataProduct";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_DataTypeEntity_Fragment = {
  __typename?: "DataTypeEntity";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_Dataset_Fragment = { __typename?: "Dataset" } & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_Domain_Fragment = { __typename?: "Domain" } & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_ErModelRelationship_Fragment = {
  __typename?: "ERModelRelationship";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_EntityTypeEntity_Fragment = {
  __typename?: "EntityTypeEntity";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_ExecutionRequest_Fragment = {
  __typename?: "ExecutionRequest";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_Form_Fragment = { __typename?: "Form" } & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_GlossaryNode_Fragment = {
  __typename?: "GlossaryNode";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_GlossaryTerm_Fragment = {
  __typename?: "GlossaryTerm";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_Incident_Fragment = {
  __typename?: "Incident";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_MlFeature_Fragment = {
  __typename?: "MLFeature";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_MlFeatureTable_Fragment = {
  __typename?: "MLFeatureTable";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_MlModel_Fragment = { __typename?: "MLModel" } & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_MlModelGroup_Fragment = {
  __typename?: "MLModelGroup";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_MlPrimaryKey_Fragment = {
  __typename?: "MLPrimaryKey";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_Notebook_Fragment = {
  __typename?: "Notebook";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_OwnershipTypeEntity_Fragment = {
  __typename?: "OwnershipTypeEntity";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_Post_Fragment = { __typename?: "Post" } & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_QueryEntity_Fragment = {
  __typename?: "QueryEntity";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_Restricted_Fragment = {
  __typename?: "Restricted";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_Role_Fragment = { __typename?: "Role" } & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_SchemaFieldEntity_Fragment = {
  __typename?: "SchemaFieldEntity";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_StructuredPropertyEntity_Fragment = {
  __typename?: "StructuredPropertyEntity";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_Tag_Fragment = { __typename?: "Tag" } & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_Test_Fragment = { __typename?: "Test" } & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_VersionSet_Fragment = {
  __typename?: "VersionSet";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProduct_VersionedDataset_Fragment = {
  __typename?: "VersionedDataset";
} & {
  dataProduct?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & {
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
                  })
              | ({ __typename?: "DataTypeEntity" } & Pick<
                  Types.DataTypeEntity,
                  "urn" | "type"
                >)
              | ({ __typename?: "Dataset" } & Pick<
                  Types.Dataset,
                  "urn" | "type"
                >)
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
            >;
          }
      >;
    }
  >;
};

export type EntityDataProductFragment =
  | EntityDataProduct_AccessTokenMetadata_Fragment
  | EntityDataProduct_Application_Fragment
  | EntityDataProduct_Assertion_Fragment
  | EntityDataProduct_BusinessAttribute_Fragment
  | EntityDataProduct_Chart_Fragment
  | EntityDataProduct_Container_Fragment
  | EntityDataProduct_CorpGroup_Fragment
  | EntityDataProduct_CorpUser_Fragment
  | EntityDataProduct_Dashboard_Fragment
  | EntityDataProduct_DataContract_Fragment
  | EntityDataProduct_DataFlow_Fragment
  | EntityDataProduct_DataHubConnection_Fragment
  | EntityDataProduct_DataHubFile_Fragment
  | EntityDataProduct_DataHubPageModule_Fragment
  | EntityDataProduct_DataHubPageTemplate_Fragment
  | EntityDataProduct_DataHubPolicy_Fragment
  | EntityDataProduct_DataHubRole_Fragment
  | EntityDataProduct_DataHubView_Fragment
  | EntityDataProduct_DataJob_Fragment
  | EntityDataProduct_DataPlatform_Fragment
  | EntityDataProduct_DataPlatformInstance_Fragment
  | EntityDataProduct_DataProcessInstance_Fragment
  | EntityDataProduct_DataProduct_Fragment
  | EntityDataProduct_DataTypeEntity_Fragment
  | EntityDataProduct_Dataset_Fragment
  | EntityDataProduct_Domain_Fragment
  | EntityDataProduct_ErModelRelationship_Fragment
  | EntityDataProduct_EntityTypeEntity_Fragment
  | EntityDataProduct_ExecutionRequest_Fragment
  | EntityDataProduct_Form_Fragment
  | EntityDataProduct_GlossaryNode_Fragment
  | EntityDataProduct_GlossaryTerm_Fragment
  | EntityDataProduct_Incident_Fragment
  | EntityDataProduct_MlFeature_Fragment
  | EntityDataProduct_MlFeatureTable_Fragment
  | EntityDataProduct_MlModel_Fragment
  | EntityDataProduct_MlModelGroup_Fragment
  | EntityDataProduct_MlPrimaryKey_Fragment
  | EntityDataProduct_Notebook_Fragment
  | EntityDataProduct_OwnershipTypeEntity_Fragment
  | EntityDataProduct_Post_Fragment
  | EntityDataProduct_QueryEntity_Fragment
  | EntityDataProduct_Restricted_Fragment
  | EntityDataProduct_Role_Fragment
  | EntityDataProduct_SchemaFieldEntity_Fragment
  | EntityDataProduct_StructuredPropertyEntity_Fragment
  | EntityDataProduct_Tag_Fragment
  | EntityDataProduct_Test_Fragment
  | EntityDataProduct_VersionSet_Fragment
  | EntityDataProduct_VersionedDataset_Fragment;

export type InputFieldsFieldsFragment = { __typename?: "InputFields" } & {
  fields?: Types.Maybe<
    Array<
      Types.Maybe<
        { __typename?: "InputField" } & Pick<
          Types.InputField,
          "schemaFieldUrn"
        > & {
            schemaField?: Types.Maybe<
              { __typename?: "SchemaField" } & EntitySchemaFieldFieldsFragment
            >;
          }
      >
    >
  >;
};

export type BrowsePathV2FieldsFragment = { __typename?: "BrowsePathV2" } & {
  path: Array<
    { __typename?: "BrowsePathEntry" } & Pick<Types.BrowsePathEntry, "name"> & {
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
};

export type EntityDisplayNameFields_AccessTokenMetadata_Fragment = {
  __typename?: "AccessTokenMetadata";
} & Pick<Types.AccessTokenMetadata, "urn" | "type">;

export type EntityDisplayNameFields_Application_Fragment = {
  __typename?: "Application";
} & Pick<Types.Application, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "ApplicationProperties" } & Pick<
        Types.ApplicationProperties,
        "name"
      >
    >;
  };

export type EntityDisplayNameFields_Assertion_Fragment = {
  __typename?: "Assertion";
} & Pick<Types.Assertion, "urn" | "type">;

export type EntityDisplayNameFields_BusinessAttribute_Fragment = {
  __typename?: "BusinessAttribute";
} & Pick<Types.BusinessAttribute, "urn" | "type">;

export type EntityDisplayNameFields_Chart_Fragment = {
  __typename?: "Chart";
} & Pick<Types.Chart, "chartId" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "ChartProperties" } & Pick<Types.ChartProperties, "name">
    >;
  };

export type EntityDisplayNameFields_Container_Fragment = {
  __typename?: "Container";
} & Pick<Types.Container, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "ContainerProperties" } & Pick<
        Types.ContainerProperties,
        "name"
      >
    >;
  };

export type EntityDisplayNameFields_CorpGroup_Fragment = {
  __typename?: "CorpGroup";
} & Pick<Types.CorpGroup, "name" | "urn" | "type"> & {
    info?: Types.Maybe<
      { __typename?: "CorpGroupInfo" } & Pick<
        Types.CorpGroupInfo,
        "displayName"
      >
    >;
  };

export type EntityDisplayNameFields_CorpUser_Fragment = {
  __typename?: "CorpUser";
} & Pick<Types.CorpUser, "username" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "CorpUserProperties" } & Pick<
        Types.CorpUserProperties,
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
  };

export type EntityDisplayNameFields_Dashboard_Fragment = {
  __typename?: "Dashboard";
} & Pick<Types.Dashboard, "dashboardId" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "DashboardProperties" } & Pick<
        Types.DashboardProperties,
        "name"
      >
    >;
  };

export type EntityDisplayNameFields_DataContract_Fragment = {
  __typename?: "DataContract";
} & Pick<Types.DataContract, "urn" | "type">;

export type EntityDisplayNameFields_DataFlow_Fragment = {
  __typename?: "DataFlow";
} & Pick<Types.DataFlow, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "DataFlowProperties" } & Pick<
        Types.DataFlowProperties,
        "name"
      >
    >;
  };

export type EntityDisplayNameFields_DataHubConnection_Fragment = {
  __typename?: "DataHubConnection";
} & Pick<Types.DataHubConnection, "urn" | "type">;

export type EntityDisplayNameFields_DataHubFile_Fragment = {
  __typename?: "DataHubFile";
} & Pick<Types.DataHubFile, "urn" | "type">;

export type EntityDisplayNameFields_DataHubPageModule_Fragment = {
  __typename?: "DataHubPageModule";
} & Pick<Types.DataHubPageModule, "urn" | "type">;

export type EntityDisplayNameFields_DataHubPageTemplate_Fragment = {
  __typename?: "DataHubPageTemplate";
} & Pick<Types.DataHubPageTemplate, "urn" | "type">;

export type EntityDisplayNameFields_DataHubPolicy_Fragment = {
  __typename?: "DataHubPolicy";
} & Pick<Types.DataHubPolicy, "urn" | "type">;

export type EntityDisplayNameFields_DataHubRole_Fragment = {
  __typename?: "DataHubRole";
} & Pick<Types.DataHubRole, "urn" | "type">;

export type EntityDisplayNameFields_DataHubView_Fragment = {
  __typename?: "DataHubView";
} & Pick<Types.DataHubView, "urn" | "type">;

export type EntityDisplayNameFields_DataJob_Fragment = {
  __typename?: "DataJob";
} & Pick<Types.DataJob, "jobId" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "DataJobProperties" } & Pick<
        Types.DataJobProperties,
        "name"
      >
    >;
  };

export type EntityDisplayNameFields_DataPlatform_Fragment = {
  __typename?: "DataPlatform";
} & Pick<Types.DataPlatform, "urn" | "type"> &
  NonConflictingPlatformFieldsFragment;

export type EntityDisplayNameFields_DataPlatformInstance_Fragment = {
  __typename?: "DataPlatformInstance";
} & Pick<Types.DataPlatformInstance, "instanceId" | "urn" | "type">;

export type EntityDisplayNameFields_DataProcessInstance_Fragment = {
  __typename?: "DataProcessInstance";
} & Pick<Types.DataProcessInstance, "urn" | "type">;

export type EntityDisplayNameFields_DataProduct_Fragment = {
  __typename?: "DataProduct";
} & Pick<Types.DataProduct, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "DataProductProperties" } & Pick<
        Types.DataProductProperties,
        "name"
      >
    >;
  };

export type EntityDisplayNameFields_DataTypeEntity_Fragment = {
  __typename?: "DataTypeEntity";
} & Pick<Types.DataTypeEntity, "urn" | "type">;

export type EntityDisplayNameFields_Dataset_Fragment = {
  __typename?: "Dataset";
} & Pick<Types.Dataset, "name" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "DatasetProperties" } & Pick<
        Types.DatasetProperties,
        "name" | "qualifiedName"
      >
    >;
  };

export type EntityDisplayNameFields_Domain_Fragment = {
  __typename?: "Domain";
} & Pick<Types.Domain, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "DomainProperties" } & Pick<Types.DomainProperties, "name">
    >;
  };

export type EntityDisplayNameFields_ErModelRelationship_Fragment = {
  __typename?: "ERModelRelationship";
} & Pick<Types.ErModelRelationship, "urn" | "type">;

export type EntityDisplayNameFields_EntityTypeEntity_Fragment = {
  __typename?: "EntityTypeEntity";
} & Pick<Types.EntityTypeEntity, "urn" | "type">;

export type EntityDisplayNameFields_ExecutionRequest_Fragment = {
  __typename?: "ExecutionRequest";
} & Pick<Types.ExecutionRequest, "urn" | "type">;

export type EntityDisplayNameFields_Form_Fragment = {
  __typename?: "Form";
} & Pick<Types.Form, "urn" | "type">;

export type EntityDisplayNameFields_GlossaryNode_Fragment = {
  __typename?: "GlossaryNode";
} & Pick<Types.GlossaryNode, "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "GlossaryNodeProperties" } & Pick<
        Types.GlossaryNodeProperties,
        "name" | "description"
      >
    >;
  };

export type EntityDisplayNameFields_GlossaryTerm_Fragment = {
  __typename?: "GlossaryTerm";
} & Pick<Types.GlossaryTerm, "name" | "hierarchicalName" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "GlossaryTermProperties" } & Pick<
        Types.GlossaryTermProperties,
        "name"
      >
    >;
  };

export type EntityDisplayNameFields_Incident_Fragment = {
  __typename?: "Incident";
} & Pick<Types.Incident, "urn" | "type">;

export type EntityDisplayNameFields_MlFeature_Fragment = {
  __typename?: "MLFeature";
} & Pick<Types.MlFeature, "name" | "urn" | "type">;

export type EntityDisplayNameFields_MlFeatureTable_Fragment = {
  __typename?: "MLFeatureTable";
} & Pick<Types.MlFeatureTable, "name" | "urn" | "type">;

export type EntityDisplayNameFields_MlModel_Fragment = {
  __typename?: "MLModel";
} & Pick<Types.MlModel, "name" | "urn" | "type">;

export type EntityDisplayNameFields_MlModelGroup_Fragment = {
  __typename?: "MLModelGroup";
} & Pick<Types.MlModelGroup, "name" | "urn" | "type">;

export type EntityDisplayNameFields_MlPrimaryKey_Fragment = {
  __typename?: "MLPrimaryKey";
} & Pick<Types.MlPrimaryKey, "name" | "urn" | "type">;

export type EntityDisplayNameFields_Notebook_Fragment = {
  __typename?: "Notebook";
} & Pick<Types.Notebook, "urn" | "type">;

export type EntityDisplayNameFields_OwnershipTypeEntity_Fragment = {
  __typename?: "OwnershipTypeEntity";
} & Pick<Types.OwnershipTypeEntity, "urn" | "type"> & {
    info?: Types.Maybe<
      { __typename?: "OwnershipTypeInfo" } & Pick<
        Types.OwnershipTypeInfo,
        "name"
      >
    >;
  };

export type EntityDisplayNameFields_Post_Fragment = {
  __typename?: "Post";
} & Pick<Types.Post, "urn" | "type">;

export type EntityDisplayNameFields_QueryEntity_Fragment = {
  __typename?: "QueryEntity";
} & Pick<Types.QueryEntity, "urn" | "type">;

export type EntityDisplayNameFields_Restricted_Fragment = {
  __typename?: "Restricted";
} & Pick<Types.Restricted, "urn" | "type">;

export type EntityDisplayNameFields_Role_Fragment = {
  __typename?: "Role";
} & Pick<Types.Role, "urn" | "type">;

export type EntityDisplayNameFields_SchemaFieldEntity_Fragment = {
  __typename?: "SchemaFieldEntity";
} & Pick<Types.SchemaFieldEntity, "fieldPath" | "urn" | "type">;

export type EntityDisplayNameFields_StructuredPropertyEntity_Fragment = {
  __typename?: "StructuredPropertyEntity";
} & Pick<Types.StructuredPropertyEntity, "urn" | "type"> & {
    definition: { __typename?: "StructuredPropertyDefinition" } & Pick<
      Types.StructuredPropertyDefinition,
      "displayName" | "qualifiedName"
    >;
  };

export type EntityDisplayNameFields_Tag_Fragment = {
  __typename?: "Tag";
} & Pick<Types.Tag, "name" | "urn" | "type"> & {
    properties?: Types.Maybe<
      { __typename?: "TagProperties" } & Pick<
        Types.TagProperties,
        "name" | "colorHex"
      >
    >;
  };

export type EntityDisplayNameFields_Test_Fragment = {
  __typename?: "Test";
} & Pick<Types.Test, "urn" | "type">;

export type EntityDisplayNameFields_VersionSet_Fragment = {
  __typename?: "VersionSet";
} & Pick<Types.VersionSet, "urn" | "type">;

export type EntityDisplayNameFields_VersionedDataset_Fragment = {
  __typename?: "VersionedDataset";
} & Pick<Types.VersionedDataset, "urn" | "type">;

export type EntityDisplayNameFieldsFragment =
  | EntityDisplayNameFields_AccessTokenMetadata_Fragment
  | EntityDisplayNameFields_Application_Fragment
  | EntityDisplayNameFields_Assertion_Fragment
  | EntityDisplayNameFields_BusinessAttribute_Fragment
  | EntityDisplayNameFields_Chart_Fragment
  | EntityDisplayNameFields_Container_Fragment
  | EntityDisplayNameFields_CorpGroup_Fragment
  | EntityDisplayNameFields_CorpUser_Fragment
  | EntityDisplayNameFields_Dashboard_Fragment
  | EntityDisplayNameFields_DataContract_Fragment
  | EntityDisplayNameFields_DataFlow_Fragment
  | EntityDisplayNameFields_DataHubConnection_Fragment
  | EntityDisplayNameFields_DataHubFile_Fragment
  | EntityDisplayNameFields_DataHubPageModule_Fragment
  | EntityDisplayNameFields_DataHubPageTemplate_Fragment
  | EntityDisplayNameFields_DataHubPolicy_Fragment
  | EntityDisplayNameFields_DataHubRole_Fragment
  | EntityDisplayNameFields_DataHubView_Fragment
  | EntityDisplayNameFields_DataJob_Fragment
  | EntityDisplayNameFields_DataPlatform_Fragment
  | EntityDisplayNameFields_DataPlatformInstance_Fragment
  | EntityDisplayNameFields_DataProcessInstance_Fragment
  | EntityDisplayNameFields_DataProduct_Fragment
  | EntityDisplayNameFields_DataTypeEntity_Fragment
  | EntityDisplayNameFields_Dataset_Fragment
  | EntityDisplayNameFields_Domain_Fragment
  | EntityDisplayNameFields_ErModelRelationship_Fragment
  | EntityDisplayNameFields_EntityTypeEntity_Fragment
  | EntityDisplayNameFields_ExecutionRequest_Fragment
  | EntityDisplayNameFields_Form_Fragment
  | EntityDisplayNameFields_GlossaryNode_Fragment
  | EntityDisplayNameFields_GlossaryTerm_Fragment
  | EntityDisplayNameFields_Incident_Fragment
  | EntityDisplayNameFields_MlFeature_Fragment
  | EntityDisplayNameFields_MlFeatureTable_Fragment
  | EntityDisplayNameFields_MlModel_Fragment
  | EntityDisplayNameFields_MlModelGroup_Fragment
  | EntityDisplayNameFields_MlPrimaryKey_Fragment
  | EntityDisplayNameFields_Notebook_Fragment
  | EntityDisplayNameFields_OwnershipTypeEntity_Fragment
  | EntityDisplayNameFields_Post_Fragment
  | EntityDisplayNameFields_QueryEntity_Fragment
  | EntityDisplayNameFields_Restricted_Fragment
  | EntityDisplayNameFields_Role_Fragment
  | EntityDisplayNameFields_SchemaFieldEntity_Fragment
  | EntityDisplayNameFields_StructuredPropertyEntity_Fragment
  | EntityDisplayNameFields_Tag_Fragment
  | EntityDisplayNameFields_Test_Fragment
  | EntityDisplayNameFields_VersionSet_Fragment
  | EntityDisplayNameFields_VersionedDataset_Fragment;

export type ErmodelrelationPropertiesFieldsFragment = {
  __typename?: "ERModelRelationshipProperties";
} & Pick<
  Types.ErModelRelationshipProperties,
  "name" | "createdTime" | "cardinality"
> & {
    source: {
      __typename?: "Dataset";
    } & DatasetErModelRelationshipFieldsFragment;
    destination: {
      __typename?: "Dataset";
    } & DatasetErModelRelationshipFieldsFragment;
    relationshipFieldMappings?: Types.Maybe<
      Array<
        {
          __typename?: "RelationshipFieldMapping";
        } & RelationshipFieldMappingFragment
      >
    >;
    createdActor?: Types.Maybe<
      | ({ __typename?: "AccessTokenMetadata" } & Pick<
          Types.AccessTokenMetadata,
          "urn"
        >)
      | ({ __typename?: "Application" } & Pick<Types.Application, "urn">)
      | ({ __typename?: "Assertion" } & Pick<Types.Assertion, "urn">)
      | ({ __typename?: "BusinessAttribute" } & Pick<
          Types.BusinessAttribute,
          "urn"
        >)
      | ({ __typename?: "Chart" } & Pick<Types.Chart, "urn">)
      | ({ __typename?: "Container" } & Pick<Types.Container, "urn">)
      | ({ __typename?: "CorpGroup" } & Pick<Types.CorpGroup, "urn">)
      | ({ __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn">)
      | ({ __typename?: "Dashboard" } & Pick<Types.Dashboard, "urn">)
      | ({ __typename?: "DataContract" } & Pick<Types.DataContract, "urn">)
      | ({ __typename?: "DataFlow" } & Pick<Types.DataFlow, "urn">)
      | ({ __typename?: "DataHubConnection" } & Pick<
          Types.DataHubConnection,
          "urn"
        >)
      | ({ __typename?: "DataHubFile" } & Pick<Types.DataHubFile, "urn">)
      | ({ __typename?: "DataHubPageModule" } & Pick<
          Types.DataHubPageModule,
          "urn"
        >)
      | ({ __typename?: "DataHubPageTemplate" } & Pick<
          Types.DataHubPageTemplate,
          "urn"
        >)
      | ({ __typename?: "DataHubPolicy" } & Pick<Types.DataHubPolicy, "urn">)
      | ({ __typename?: "DataHubRole" } & Pick<Types.DataHubRole, "urn">)
      | ({ __typename?: "DataHubView" } & Pick<Types.DataHubView, "urn">)
      | ({ __typename?: "DataJob" } & Pick<Types.DataJob, "urn">)
      | ({ __typename?: "DataPlatform" } & Pick<Types.DataPlatform, "urn">)
      | ({ __typename?: "DataPlatformInstance" } & Pick<
          Types.DataPlatformInstance,
          "urn"
        >)
      | ({ __typename?: "DataProcessInstance" } & Pick<
          Types.DataProcessInstance,
          "urn"
        >)
      | ({ __typename?: "DataProduct" } & Pick<Types.DataProduct, "urn">)
      | ({ __typename?: "DataTypeEntity" } & Pick<Types.DataTypeEntity, "urn">)
      | ({ __typename?: "Dataset" } & Pick<Types.Dataset, "urn">)
      | ({ __typename?: "Domain" } & Pick<Types.Domain, "urn">)
      | ({ __typename?: "ERModelRelationship" } & Pick<
          Types.ErModelRelationship,
          "urn"
        >)
      | ({ __typename?: "EntityTypeEntity" } & Pick<
          Types.EntityTypeEntity,
          "urn"
        >)
      | ({ __typename?: "ExecutionRequest" } & Pick<
          Types.ExecutionRequest,
          "urn"
        >)
      | ({ __typename?: "Form" } & Pick<Types.Form, "urn">)
      | ({ __typename?: "GlossaryNode" } & Pick<Types.GlossaryNode, "urn">)
      | ({ __typename?: "GlossaryTerm" } & Pick<Types.GlossaryTerm, "urn">)
      | ({ __typename?: "Incident" } & Pick<Types.Incident, "urn">)
      | ({ __typename?: "MLFeature" } & Pick<Types.MlFeature, "urn">)
      | ({ __typename?: "MLFeatureTable" } & Pick<Types.MlFeatureTable, "urn">)
      | ({ __typename?: "MLModel" } & Pick<Types.MlModel, "urn">)
      | ({ __typename?: "MLModelGroup" } & Pick<Types.MlModelGroup, "urn">)
      | ({ __typename?: "MLPrimaryKey" } & Pick<Types.MlPrimaryKey, "urn">)
      | ({ __typename?: "Notebook" } & Pick<Types.Notebook, "urn">)
      | ({ __typename?: "OwnershipTypeEntity" } & Pick<
          Types.OwnershipTypeEntity,
          "urn"
        >)
      | ({ __typename?: "Post" } & Pick<Types.Post, "urn">)
      | ({ __typename?: "QueryEntity" } & Pick<Types.QueryEntity, "urn">)
      | ({ __typename?: "Restricted" } & Pick<Types.Restricted, "urn">)
      | ({ __typename?: "Role" } & Pick<Types.Role, "urn">)
      | ({ __typename?: "SchemaFieldEntity" } & Pick<
          Types.SchemaFieldEntity,
          "urn"
        >)
      | ({ __typename?: "StructuredPropertyEntity" } & Pick<
          Types.StructuredPropertyEntity,
          "urn"
        >)
      | ({ __typename?: "Tag" } & Pick<Types.Tag, "urn">)
      | ({ __typename?: "Test" } & Pick<Types.Test, "urn">)
      | ({ __typename?: "VersionSet" } & Pick<Types.VersionSet, "urn">)
      | ({ __typename?: "VersionedDataset" } & Pick<
          Types.VersionedDataset,
          "urn"
        >)
    >;
  };

export type RelationshipFieldMappingFragment = {
  __typename?: "RelationshipFieldMapping";
} & Pick<Types.RelationshipFieldMapping, "sourceField" | "destinationField">;

export type ErmodelrelationEditablePropertiesFieldsFragment = {
  __typename?: "ERModelRelationshipEditableProperties";
} & Pick<Types.ErModelRelationshipEditableProperties, "description" | "name">;

export type DatasetErModelRelationshipFieldsFragment = {
  __typename?: "Dataset";
} & Pick<Types.Dataset, "urn" | "name"> & {
    properties?: Types.Maybe<
      { __typename?: "DatasetProperties" } & Pick<
        Types.DatasetProperties,
        "name" | "description"
      >
    >;
    editableProperties?: Types.Maybe<
      { __typename?: "DatasetEditableProperties" } & Pick<
        Types.DatasetEditableProperties,
        "name" | "description"
      >
    >;
    schemaMetadata?: Types.Maybe<
      { __typename?: "SchemaMetadata" } & SchemaMetadataFieldsFragment
    >;
  };

export type StructuredPropertyFieldsFragment = {
  __typename?: "StructuredPropertyEntity";
} & Pick<Types.StructuredPropertyEntity, "urn" | "type" | "exists"> & {
    definition: { __typename?: "StructuredPropertyDefinition" } & Pick<
      Types.StructuredPropertyDefinition,
      | "displayName"
      | "qualifiedName"
      | "description"
      | "cardinality"
      | "immutable"
    > & {
        valueType: { __typename?: "DataTypeEntity" } & Pick<
          Types.DataTypeEntity,
          "urn" | "type"
        > & {
            info: { __typename?: "DataTypeInfo" } & Pick<
              Types.DataTypeInfo,
              "type" | "displayName"
            >;
          };
        entityTypes: Array<
          { __typename?: "EntityTypeEntity" } & Pick<
            Types.EntityTypeEntity,
            "urn" | "type"
          > & {
              info: { __typename?: "EntityTypeInfo" } & Pick<
                Types.EntityTypeInfo,
                "type"
              >;
            }
        >;
        typeQualifier?: Types.Maybe<
          { __typename?: "TypeQualifier" } & {
            allowedTypes?: Types.Maybe<
              Array<
                { __typename?: "EntityTypeEntity" } & Pick<
                  Types.EntityTypeEntity,
                  "urn" | "type"
                > & {
                    info: { __typename?: "EntityTypeInfo" } & Pick<
                      Types.EntityTypeInfo,
                      "type" | "displayName"
                    >;
                  }
              >
            >;
          }
        >;
        allowedValues?: Types.Maybe<
          Array<
            { __typename?: "AllowedValue" } & Pick<
              Types.AllowedValue,
              "description"
            > & {
                value:
                  | ({ __typename?: "NumberValue" } & Pick<
                      Types.NumberValue,
                      "numberValue"
                    >)
                  | ({ __typename?: "StringValue" } & Pick<
                      Types.StringValue,
                      "stringValue"
                    >);
              }
          >
        >;
        created?: Types.Maybe<
          { __typename?: "ResolvedAuditStamp" } & Pick<
            Types.ResolvedAuditStamp,
            "time"
          > & {
              actor?: Types.Maybe<
                { __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn"> & {
                    editableProperties?: Types.Maybe<
                      { __typename?: "CorpUserEditableProperties" } & Pick<
                        Types.CorpUserEditableProperties,
                        "displayName" | "pictureLink"
                      >
                    >;
                  } & EntityDisplayNameFields_CorpUser_Fragment
              >;
            }
        >;
        lastModified?: Types.Maybe<
          { __typename?: "ResolvedAuditStamp" } & Pick<
            Types.ResolvedAuditStamp,
            "time"
          > & {
              actor?: Types.Maybe<
                { __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn"> & {
                    editableProperties?: Types.Maybe<
                      { __typename?: "CorpUserEditableProperties" } & Pick<
                        Types.CorpUserEditableProperties,
                        "displayName" | "pictureLink"
                      >
                    >;
                  } & EntityDisplayNameFields_CorpUser_Fragment
              >;
            }
        >;
      };
    settings?: Types.Maybe<
      { __typename?: "StructuredPropertySettings" } & Pick<
        Types.StructuredPropertySettings,
        | "isHidden"
        | "showInSearchFilters"
        | "showAsAssetBadge"
        | "showInAssetSummary"
        | "hideInAssetSummaryWhenEmpty"
        | "showInColumnsTable"
      >
    >;
  };

export type StructuredPropertiesFieldsFragment = {
  __typename?: "StructuredPropertiesEntry";
} & Pick<Types.StructuredPropertiesEntry, "associatedUrn"> & {
    structuredProperty: { __typename?: "StructuredPropertyEntity" } & Pick<
      Types.StructuredPropertyEntity,
      "exists"
    > &
      StructuredPropertyFieldsFragment;
    values: Array<
      Types.Maybe<
        | ({ __typename?: "NumberValue" } & Pick<
            Types.NumberValue,
            "numberValue"
          >)
        | ({ __typename?: "StringValue" } & Pick<
            Types.StringValue,
            "stringValue"
          >)
      >
    >;
    valueEntities?: Types.Maybe<
      Array<
        Types.Maybe<
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
        >
      >
    >;
    attribution?: Types.Maybe<
      { __typename?: "MetadataAttribution" } & AttributionFieldsFragment
    >;
  };

export type AutoRenderAspectFieldsFragment = {
  __typename?: "RawAspect";
} & Pick<Types.RawAspect, "aspectName" | "payload"> & {
    renderSpec?: Types.Maybe<
      { __typename?: "AspectRenderSpec" } & Pick<
        Types.AspectRenderSpec,
        "displayType" | "displayName" | "key"
      >
    >;
  };

export type FormAssociationFieldsFragment = {
  __typename?: "FormAssociation";
} & Pick<Types.FormAssociation, "associatedUrn"> & {
    incompletePrompts?: Types.Maybe<
      Array<
        {
          __typename?: "FormPromptAssociation";
        } & FormPromptAssociationFieldsFragment
      >
    >;
    completedPrompts?: Types.Maybe<
      Array<
        {
          __typename?: "FormPromptAssociation";
        } & FormPromptAssociationFieldsFragment
      >
    >;
    form: { __typename?: "Form" } & Pick<Types.Form, "urn" | "type"> & {
        info: { __typename?: "FormInfo" } & Pick<
          Types.FormInfo,
          "name" | "description" | "type"
        > & {
            prompts: Array<
              { __typename?: "FormPrompt" } & Pick<
                Types.FormPrompt,
                "id" | "formUrn" | "title" | "description" | "type" | "required"
              > & {
                  structuredPropertyParams?: Types.Maybe<
                    { __typename?: "StructuredPropertyParams" } & {
                      structuredProperty: {
                        __typename?: "StructuredPropertyEntity";
                      } & StructuredPropertyFieldsFragment;
                    }
                  >;
                }
            >;
            actors: { __typename?: "FormActorAssignment" } & Pick<
              Types.FormActorAssignment,
              "owners" | "isAssignedToMe"
            >;
          };
        ownership?: Types.Maybe<
          { __typename?: "Ownership" } & OwnershipFieldsFragment
        >;
      };
  };

export type FormPromptAssociationFieldsFragment = {
  __typename?: "FormPromptAssociation";
} & Pick<Types.FormPromptAssociation, "id"> & {
    lastModified: { __typename?: "ResolvedAuditStamp" } & Pick<
      Types.ResolvedAuditStamp,
      "time"
    > & {
        actor?: Types.Maybe<
          { __typename?: "CorpUser" } & Pick<Types.CorpUser, "urn" | "type"> &
            EntityDisplayNameFields_CorpUser_Fragment
        >;
      };
    fieldAssociations?: Types.Maybe<
      { __typename?: "FormPromptFieldAssociations" } & {
        completedFieldPrompts?: Types.Maybe<
          Array<
            { __typename?: "FieldFormPromptAssociation" } & Pick<
              Types.FieldFormPromptAssociation,
              "fieldPath"
            > & {
                lastModified: { __typename?: "ResolvedAuditStamp" } & Pick<
                  Types.ResolvedAuditStamp,
                  "time"
                > & {
                    actor?: Types.Maybe<
                      { __typename?: "CorpUser" } & Pick<
                        Types.CorpUser,
                        "urn" | "type"
                      > &
                        EntityDisplayNameFields_CorpUser_Fragment
                    >;
                  };
              }
          >
        >;
      }
    >;
  };

export type EntityHealthFragment = { __typename?: "Health" } & Pick<
  Types.Health,
  "type" | "status" | "message" | "causes"
>;

export type FormsFieldsFragment = { __typename?: "Forms" } & {
  completedForms: Array<
    { __typename?: "FormAssociation" } & FormAssociationFieldsFragment
  >;
  incompleteForms: Array<
    { __typename?: "FormAssociation" } & FormAssociationFieldsFragment
  >;
  verifications: Array<
    { __typename?: "FormVerificationAssociation" } & {
      form: { __typename?: "Form" } & Pick<Types.Form, "urn">;
      lastModified?: Types.Maybe<
        { __typename?: "ResolvedAuditStamp" } & Pick<
          Types.ResolvedAuditStamp,
          "time"
        > & {
            actor?: Types.Maybe<
              { __typename?: "CorpUser" } & Pick<
                Types.CorpUser,
                "urn" | "type"
              > &
                EntityDisplayNameFields_CorpUser_Fragment
            >;
          }
      >;
    }
  >;
};

export type EntityPrivilegesFragment = {
  __typename?: "EntityPrivileges";
} & Pick<
  Types.EntityPrivileges,
  | "canEditLineage"
  | "canEditDomains"
  | "canEditDataProducts"
  | "canEditTags"
  | "canEditGlossaryTerms"
  | "canEditDescription"
  | "canEditLinks"
  | "canEditOwners"
  | "canEditAssertions"
  | "canEditIncidents"
  | "canEditDeprecation"
  | "canEditSchemaFieldTags"
  | "canEditSchemaFieldGlossaryTerms"
  | "canEditSchemaFieldDescription"
  | "canEditQueries"
  | "canEditEmbed"
  | "canManageEntity"
  | "canManageChildren"
  | "canEditProperties"
  | "canViewDatasetUsage"
  | "canViewDatasetProfile"
  | "canViewDatasetOperations"
  | "canManageAssetSummary"
>;

export type BusinessAttributeFragment = {
  __typename?: "BusinessAttributeAssociation";
} & Pick<Types.BusinessAttributeAssociation, "associatedUrn"> & {
    businessAttribute: { __typename?: "BusinessAttribute" } & Pick<
      Types.BusinessAttribute,
      "urn" | "type"
    > & {
        ownership?: Types.Maybe<
          { __typename?: "Ownership" } & OwnershipFieldsFragment
        >;
        properties?: Types.Maybe<
          { __typename?: "BusinessAttributeInfo" } & Pick<
            Types.BusinessAttributeInfo,
            "name" | "description"
          > & {
              businessAttributeDataType: Types.BusinessAttributeInfo["type"];
            } & {
              lastModified: { __typename?: "AuditStamp" } & Pick<
                Types.AuditStamp,
                "time"
              >;
              created: { __typename?: "AuditStamp" } & Pick<
                Types.AuditStamp,
                "time"
              >;
              tags?: Types.Maybe<
                { __typename?: "GlobalTags" } & {
                  tags?: Types.Maybe<
                    Array<
                      { __typename?: "TagAssociation" } & Pick<
                        Types.TagAssociation,
                        "associatedUrn"
                      > & {
                          tag: { __typename?: "Tag" } & Pick<
                            Types.Tag,
                            "urn" | "name"
                          > & {
                              properties?: Types.Maybe<
                                { __typename?: "TagProperties" } & Pick<
                                  Types.TagProperties,
                                  "name"
                                >
                              >;
                            };
                        }
                    >
                  >;
                }
              >;
              glossaryTerms?: Types.Maybe<
                { __typename?: "GlossaryTerms" } & {
                  terms?: Types.Maybe<
                    Array<
                      { __typename?: "GlossaryTermAssociation" } & Pick<
                        Types.GlossaryTermAssociation,
                        "associatedUrn"
                      > & {
                          term: { __typename?: "GlossaryTerm" } & Pick<
                            Types.GlossaryTerm,
                            "urn" | "type"
                          > & {
                              properties?: Types.Maybe<
                                {
                                  __typename?: "GlossaryTermProperties";
                                } & Pick<Types.GlossaryTermProperties, "name">
                              >;
                            };
                        }
                    >
                  >;
                }
              >;
            }
        >;
      };
  };

export type DatasetProfileFieldsFragment = {
  __typename?: "DatasetProfile";
} & Pick<
  Types.DatasetProfile,
  "rowCount" | "columnCount" | "sizeInBytes" | "timestampMillis"
> & {
    partitionSpec?: Types.Maybe<
      { __typename?: "PartitionSpec" } & Pick<
        Types.PartitionSpec,
        "type" | "partition"
      > & {
          timePartition?: Types.Maybe<
            { __typename?: "TimeWindow" } & Pick<
              Types.TimeWindow,
              "startTimeMillis" | "durationMillis"
            >
          >;
        }
    >;
    fieldProfiles?: Types.Maybe<
      Array<
        { __typename?: "DatasetFieldProfile" } & Pick<
          Types.DatasetFieldProfile,
          | "fieldPath"
          | "uniqueCount"
          | "uniqueProportion"
          | "nullCount"
          | "nullProportion"
          | "min"
          | "max"
          | "mean"
          | "median"
          | "stdev"
          | "sampleValues"
        > & {
            quantiles?: Types.Maybe<
              Array<
                { __typename?: "Quantile" } & Pick<
                  Types.Quantile,
                  "quantile" | "value"
                >
              >
            >;
            distinctValueFrequencies?: Types.Maybe<
              Array<
                { __typename?: "ValueFrequency" } & Pick<
                  Types.ValueFrequency,
                  "value" | "frequency"
                >
              >
            >;
          }
      >
    >;
  };

export type Notes_AccessTokenMetadata_Fragment = {
  __typename?: "AccessTokenMetadata";
} & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_Application_Fragment = { __typename?: "Application" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_Assertion_Fragment = { __typename?: "Assertion" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_BusinessAttribute_Fragment = {
  __typename?: "BusinessAttribute";
} & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_Chart_Fragment = { __typename?: "Chart" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_Container_Fragment = { __typename?: "Container" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_CorpGroup_Fragment = { __typename?: "CorpGroup" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_CorpUser_Fragment = { __typename?: "CorpUser" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_Dashboard_Fragment = { __typename?: "Dashboard" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_DataContract_Fragment = { __typename?: "DataContract" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_DataFlow_Fragment = { __typename?: "DataFlow" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_DataHubConnection_Fragment = {
  __typename?: "DataHubConnection";
} & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_DataHubFile_Fragment = { __typename?: "DataHubFile" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_DataHubPageModule_Fragment = {
  __typename?: "DataHubPageModule";
} & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_DataHubPageTemplate_Fragment = {
  __typename?: "DataHubPageTemplate";
} & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_DataHubPolicy_Fragment = { __typename?: "DataHubPolicy" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_DataHubRole_Fragment = { __typename?: "DataHubRole" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_DataHubView_Fragment = { __typename?: "DataHubView" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_DataJob_Fragment = { __typename?: "DataJob" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_DataPlatform_Fragment = { __typename?: "DataPlatform" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_DataPlatformInstance_Fragment = {
  __typename?: "DataPlatformInstance";
} & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_DataProcessInstance_Fragment = {
  __typename?: "DataProcessInstance";
} & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_DataProduct_Fragment = { __typename?: "DataProduct" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_DataTypeEntity_Fragment = {
  __typename?: "DataTypeEntity";
} & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_Dataset_Fragment = { __typename?: "Dataset" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_Domain_Fragment = { __typename?: "Domain" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_ErModelRelationship_Fragment = {
  __typename?: "ERModelRelationship";
} & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_EntityTypeEntity_Fragment = {
  __typename?: "EntityTypeEntity";
} & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_ExecutionRequest_Fragment = {
  __typename?: "ExecutionRequest";
} & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_Form_Fragment = { __typename?: "Form" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_GlossaryNode_Fragment = { __typename?: "GlossaryNode" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_GlossaryTerm_Fragment = { __typename?: "GlossaryTerm" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_Incident_Fragment = { __typename?: "Incident" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_MlFeature_Fragment = { __typename?: "MLFeature" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_MlFeatureTable_Fragment = {
  __typename?: "MLFeatureTable";
} & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_MlModel_Fragment = { __typename?: "MLModel" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_MlModelGroup_Fragment = { __typename?: "MLModelGroup" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_MlPrimaryKey_Fragment = { __typename?: "MLPrimaryKey" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_Notebook_Fragment = { __typename?: "Notebook" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_OwnershipTypeEntity_Fragment = {
  __typename?: "OwnershipTypeEntity";
} & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_Post_Fragment = { __typename?: "Post" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_QueryEntity_Fragment = { __typename?: "QueryEntity" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_Restricted_Fragment = { __typename?: "Restricted" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_Role_Fragment = { __typename?: "Role" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_SchemaFieldEntity_Fragment = {
  __typename?: "SchemaFieldEntity";
} & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_StructuredPropertyEntity_Fragment = {
  __typename?: "StructuredPropertyEntity";
} & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_Tag_Fragment = { __typename?: "Tag" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_Test_Fragment = { __typename?: "Test" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_VersionSet_Fragment = { __typename?: "VersionSet" } & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type Notes_VersionedDataset_Fragment = {
  __typename?: "VersionedDataset";
} & {
  notes?: Types.Maybe<
    { __typename?: "EntityRelationshipsResult" } & Pick<
      Types.EntityRelationshipsResult,
      "total"
    > & {
        relationships: Array<
          { __typename?: "EntityRelationship" } & Pick<
            Types.EntityRelationship,
            "type"
          > & {
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
                | { __typename?: "MLFeatureTable" }
                | { __typename?: "MLModel" }
                | { __typename?: "MLModelGroup" }
                | { __typename?: "MLPrimaryKey" }
                | { __typename?: "Notebook" }
                | { __typename?: "OwnershipTypeEntity" }
                | ({ __typename?: "Post" } & Pick<
                    Types.Post,
                    "urn" | "type" | "postType"
                  > & {
                      lastModified: { __typename?: "AuditStamp" } & Pick<
                        Types.AuditStamp,
                        "time" | "actor"
                      >;
                      content: { __typename?: "PostContent" } & Pick<
                        Types.PostContent,
                        "contentType" | "title" | "description" | "link"
                      > & {
                          media?: Types.Maybe<
                            { __typename?: "Media" } & Pick<
                              Types.Media,
                              "type" | "location"
                            >
                          >;
                        };
                    })
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

export type NotesFragment =
  | Notes_AccessTokenMetadata_Fragment
  | Notes_Application_Fragment
  | Notes_Assertion_Fragment
  | Notes_BusinessAttribute_Fragment
  | Notes_Chart_Fragment
  | Notes_Container_Fragment
  | Notes_CorpGroup_Fragment
  | Notes_CorpUser_Fragment
  | Notes_Dashboard_Fragment
  | Notes_DataContract_Fragment
  | Notes_DataFlow_Fragment
  | Notes_DataHubConnection_Fragment
  | Notes_DataHubFile_Fragment
  | Notes_DataHubPageModule_Fragment
  | Notes_DataHubPageTemplate_Fragment
  | Notes_DataHubPolicy_Fragment
  | Notes_DataHubRole_Fragment
  | Notes_DataHubView_Fragment
  | Notes_DataJob_Fragment
  | Notes_DataPlatform_Fragment
  | Notes_DataPlatformInstance_Fragment
  | Notes_DataProcessInstance_Fragment
  | Notes_DataProduct_Fragment
  | Notes_DataTypeEntity_Fragment
  | Notes_Dataset_Fragment
  | Notes_Domain_Fragment
  | Notes_ErModelRelationship_Fragment
  | Notes_EntityTypeEntity_Fragment
  | Notes_ExecutionRequest_Fragment
  | Notes_Form_Fragment
  | Notes_GlossaryNode_Fragment
  | Notes_GlossaryTerm_Fragment
  | Notes_Incident_Fragment
  | Notes_MlFeature_Fragment
  | Notes_MlFeatureTable_Fragment
  | Notes_MlModel_Fragment
  | Notes_MlModelGroup_Fragment
  | Notes_MlPrimaryKey_Fragment
  | Notes_Notebook_Fragment
  | Notes_OwnershipTypeEntity_Fragment
  | Notes_Post_Fragment
  | Notes_QueryEntity_Fragment
  | Notes_Restricted_Fragment
  | Notes_Role_Fragment
  | Notes_SchemaFieldEntity_Fragment
  | Notes_StructuredPropertyEntity_Fragment
  | Notes_Tag_Fragment
  | Notes_Test_Fragment
  | Notes_VersionSet_Fragment
  | Notes_VersionedDataset_Fragment;

export type DataTransformLogicFieldsFragment = {
  __typename?: "DataTransformLogic";
} & {
  transforms: Array<
    { __typename?: "DataTransform" } & {
      queryStatement?: Types.Maybe<
        { __typename?: "QueryStatement" } & Pick<
          Types.QueryStatement,
          "value" | "language"
        >
      >;
    }
  >;
};

export type CustomPropertiesFieldsFragment = {
  __typename?: "CustomPropertiesEntry";
} & Pick<Types.CustomPropertiesEntry, "key" | "value" | "associatedUrn">;

export type IngestionSourceFieldsFragment = {
  __typename?: "IngestionSource";
} & Pick<Types.IngestionSource, "urn" | "name" | "type"> & {
    config: { __typename?: "IngestionConfig" } & Pick<
      Types.IngestionConfig,
      "recipe" | "version" | "executorId" | "debugMode"
    > & {
        extraArgs?: Types.Maybe<
          Array<
            { __typename?: "StringMapEntry" } & Pick<
              Types.StringMapEntry,
              "key" | "value"
            >
          >
        >;
      };
    schedule?: Types.Maybe<
      { __typename?: "IngestionSchedule" } & Pick<
        Types.IngestionSchedule,
        "interval" | "timezone"
      >
    >;
    platform?: Types.Maybe<
      { __typename?: "DataPlatform" } & Pick<
        Types.DataPlatform,
        "urn" | "type" | "name"
      >
    >;
    source?: Types.Maybe<
      { __typename?: "IngestionSourceSource" } & Pick<
        Types.IngestionSourceSource,
        "type"
      >
    >;
  };

export type MinimalIngestionExecutionRequestFieldsFragment = {
  __typename?: "ExecutionRequest";
} & Pick<Types.ExecutionRequest, "urn" | "id" | "type"> & {
    input: { __typename?: "ExecutionRequestInput" } & Pick<
      Types.ExecutionRequestInput,
      "requestedAt" | "task"
    > & {
        source: { __typename?: "ExecutionRequestSource" } & Pick<
          Types.ExecutionRequestSource,
          "type"
        >;
      };
  };

export type IngestionExecutionRequestFieldsFragment = {
  __typename?: "ExecutionRequest";
} & Pick<Types.ExecutionRequest, "urn" | "id" | "type"> & {
    input: { __typename?: "ExecutionRequestInput" } & Pick<
      Types.ExecutionRequestInput,
      "requestedAt" | "task" | "executorId"
    > & {
        source: { __typename?: "ExecutionRequestSource" } & Pick<
          Types.ExecutionRequestSource,
          "type"
        >;
        arguments?: Types.Maybe<
          Array<
            { __typename?: "StringMapEntry" } & Pick<
              Types.StringMapEntry,
              "key" | "value"
            >
          >
        >;
        actor?: Types.Maybe<
          { __typename?: "CorpUser" } & Pick<
            Types.CorpUser,
            "urn" | "type" | "username"
          > & {
              properties?: Types.Maybe<
                { __typename?: "CorpUserProperties" } & Pick<
                  Types.CorpUserProperties,
                  | "displayName"
                  | "firstName"
                  | "lastName"
                  | "fullName"
                  | "active"
                >
              >;
              editableProperties?: Types.Maybe<
                { __typename?: "CorpUserEditableProperties" } & Pick<
                  Types.CorpUserEditableProperties,
                  "displayName" | "pictureLink"
                >
              >;
            }
        >;
      };
    result?: Types.Maybe<
      { __typename?: "ExecutionRequestResult" } & Pick<
        Types.ExecutionRequestResult,
        "status" | "startTimeMs" | "durationMs" | "report"
      > & {
          structuredReport?: Types.Maybe<
            { __typename?: "StructuredReport" } & Pick<
              Types.StructuredReport,
              "type" | "serializedValue" | "contentType"
            >
          >;
        }
    >;
  };

export const DisplayPropertiesFieldsFragmentDoc = gql`
  fragment displayPropertiesFields on DisplayProperties {
    colorHex
    icon {
      name
      style
      iconLibrary
    }
  }
`;
export const RootGlossaryNodeWithFourLayersFragmentDoc = gql`
  fragment rootGlossaryNodeWithFourLayers on GlossaryNode {
    urn
    type
    properties {
      name
      description
    }
    displayProperties {
      ...displayPropertiesFields
    }
    childrenCount {
      termsCount
      nodesCount
    }
    glossaryChildrenSearch(
      input: { query: "*", count: 500, types: [GLOSSARY_NODE] }
    ) {
      total
      searchResults {
        entity {
          urn
          type
          ... on GlossaryNode {
            childrenCount {
              termsCount
              nodesCount
            }
            glossaryChildrenSearch(
              input: { query: "*", count: 500, types: [GLOSSARY_NODE] }
            ) {
              total
              searchResults {
                entity {
                  urn
                  type
                  ... on GlossaryNode {
                    childrenCount {
                      termsCount
                      nodesCount
                    }
                    glossaryChildrenSearch(
                      input: { query: "*", count: 500, types: [GLOSSARY_NODE] }
                    ) {
                      total
                      searchResults {
                        entity {
                          urn
                          type
                          ... on GlossaryNode {
                            childrenCount {
                              termsCount
                              nodesCount
                            }
                            glossaryChildrenSearch(
                              input: {
                                query: "*"
                                count: 500
                                types: [GLOSSARY_NODE]
                              }
                            ) {
                              total
                              searchResults {
                                entity {
                                  urn
                                  type
                                  ... on GlossaryNode {
                                    childrenCount {
                                      termsCount
                                      nodesCount
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  ${DisplayPropertiesFieldsFragmentDoc}
`;
export const GlossaryNodeFragmentDoc = gql`
  fragment glossaryNode on GlossaryNode {
    urn
    type
    properties {
      name
      description
      createdOn {
        time
      }
    }
    displayProperties {
      ...displayPropertiesFields
    }
    childrenCount {
      termsCount
      nodesCount
    }
    children: relationships(
      input: { types: ["IsPartOf"], direction: INCOMING, start: 0, count: 1000 }
    ) {
      total
      relationships {
        type
        entity {
          ... on GlossaryTerm {
            urn
            name
            type
            hierarchicalName
            properties {
              name
              description
            }
          }
          ... on GlossaryNode {
            urn
            type
            properties {
              name
              description
            }
            displayProperties {
              ...displayPropertiesFields
            }
          }
        }
      }
    }
  }
  ${DisplayPropertiesFieldsFragmentDoc}
`;
export const PlatformFieldsFragmentDoc = gql`
  fragment platformFields on DataPlatform {
    urn
    type
    lastIngested
    name
    properties {
      type
      displayName
      datasetNameDelimiter
      logoUrl
    }
    displayName
    info {
      type
      displayName
      datasetNameDelimiter
      logoUrl
    }
  }
`;
export const DataPlatformInstanceFieldsFragmentDoc = gql`
  fragment dataPlatformInstanceFields on DataPlatformInstance {
    urn
    type
    platform {
      ...platformFields
    }
    instanceId
  }
  ${PlatformFieldsFragmentDoc}
`;
export const NonConflictingPlatformFieldsFragmentDoc = gql`
  fragment nonConflictingPlatformFields on DataPlatform {
    urn
    type
    name
    properties {
      displayName
      datasetNameDelimiter
      logoUrl
    }
    displayName
    info {
      type
      displayName
      datasetNameDelimiter
      logoUrl
    }
  }
`;
export const EntityDisplayNameFieldsFragmentDoc = gql`
  fragment entityDisplayNameFields on Entity {
    urn
    type
    ... on Dataset {
      name
      properties {
        name
        qualifiedName
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
    }
    ... on CorpGroup {
      name
      info {
        displayName
      }
    }
    ... on Dashboard {
      dashboardId
      properties {
        name
      }
    }
    ... on Chart {
      chartId
      properties {
        name
      }
    }
    ... on DataFlow {
      properties {
        name
      }
    }
    ... on DataJob {
      jobId
      properties {
        name
      }
    }
    ... on GlossaryTerm {
      name
      hierarchicalName
      properties {
        name
      }
    }
    ... on GlossaryNode {
      properties {
        name
        description
      }
    }
    ... on Domain {
      properties {
        name
      }
    }
    ... on Container {
      properties {
        name
      }
    }
    ... on MLFeatureTable {
      name
    }
    ... on MLFeature {
      name
    }
    ... on MLPrimaryKey {
      name
    }
    ... on MLModel {
      name
    }
    ... on MLModelGroup {
      name
    }
    ... on Tag {
      name
      properties {
        name
        colorHex
      }
    }
    ... on DataPlatform {
      ...nonConflictingPlatformFields
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
    ... on DataPlatformInstance {
      instanceId
    }
    ... on StructuredPropertyEntity {
      definition {
        displayName
        qualifiedName
      }
    }
    ... on SchemaFieldEntity {
      fieldPath
    }
    ... on OwnershipTypeEntity {
      info {
        name
      }
    }
  }
  ${NonConflictingPlatformFieldsFragmentDoc}
`;
export const StructuredPropertyFieldsFragmentDoc = gql`
  fragment structuredPropertyFields on StructuredPropertyEntity {
    urn
    type
    exists
    definition {
      displayName
      qualifiedName
      description
      cardinality
      immutable
      valueType {
        urn
        type
        info {
          type
          displayName
        }
      }
      entityTypes {
        urn
        type
        info {
          type
        }
      }
      cardinality
      typeQualifier {
        allowedTypes {
          urn
          type
          info {
            type
            displayName
          }
        }
      }
      allowedValues {
        value {
          ... on StringValue {
            stringValue
          }
          ... on NumberValue {
            numberValue
          }
        }
        description
      }
      created {
        time
        actor {
          urn
          editableProperties {
            displayName
            pictureLink
          }
          ...entityDisplayNameFields
        }
      }
      lastModified {
        time
        actor {
          urn
          editableProperties {
            displayName
            pictureLink
          }
          ...entityDisplayNameFields
        }
      }
    }
    settings {
      isHidden
      showInSearchFilters
      showAsAssetBadge
      showInAssetSummary
      hideInAssetSummaryWhenEmpty
      showInColumnsTable
    }
  }
  ${EntityDisplayNameFieldsFragmentDoc}
`;
export const AttributionFieldsFragmentDoc = gql`
  fragment attributionFields on MetadataAttribution {
    time
    actor {
      urn
      type
      ...entityDisplayNameFields
    }
    source {
      urn
      type
    }
    sourceDetail {
      key
      value
    }
  }
  ${EntityDisplayNameFieldsFragmentDoc}
`;
export const StructuredPropertiesFieldsFragmentDoc = gql`
  fragment structuredPropertiesFields on StructuredPropertiesEntry {
    structuredProperty {
      exists
      ...structuredPropertyFields
    }
    values {
      ... on StringValue {
        stringValue
      }
      ... on NumberValue {
        numberValue
      }
    }
    valueEntities {
      urn
      type
      ...entityDisplayNameFields
    }
    associatedUrn
    attribution {
      ...attributionFields
    }
  }
  ${StructuredPropertyFieldsFragmentDoc}
  ${EntityDisplayNameFieldsFragmentDoc}
  ${AttributionFieldsFragmentDoc}
`;
export const OwnershipFieldsFragmentDoc = gql`
  fragment ownershipFields on Ownership {
    owners {
      owner {
        ... on CorpUser {
          urn
          type
          username
          info {
            active
            displayName
            title
            email
            firstName
            lastName
            fullName
          }
          properties {
            active
            displayName
            title
            email
            firstName
            lastName
            fullName
          }
          editableProperties {
            displayName
            title
            pictureLink
            email
          }
        }
        ... on CorpGroup {
          urn
          type
          name
          properties {
            displayName
            email
          }
          info {
            displayName
            email
            admins {
              urn
              username
              info {
                active
                displayName
                title
                email
                firstName
                lastName
                fullName
              }
              editableInfo {
                pictureLink
                teams
                skills
              }
            }
            members {
              urn
              username
              info {
                active
                displayName
                title
                email
                firstName
                lastName
                fullName
              }
              editableInfo {
                pictureLink
                teams
                skills
              }
            }
            groups
          }
        }
      }
      type
      ownershipType {
        urn
        type
        info {
          name
          description
        }
        status {
          removed
        }
      }
      associatedUrn
      attribution {
        ...attributionFields
      }
    }
    lastModified {
      time
    }
  }
  ${AttributionFieldsFragmentDoc}
`;
export const ResolvedActorFieldsFragmentDoc = gql`
  fragment resolvedActorFields on ResolvedActor {
    ... on CorpUser {
      urn
      ...entityDisplayNameFields
    }
    ... on CorpGroup {
      urn
      ...entityDisplayNameFields
    }
  }
  ${EntityDisplayNameFieldsFragmentDoc}
`;
export const InstitutionalMemoryFieldsFragmentDoc = gql`
  fragment institutionalMemoryFields on InstitutionalMemory {
    elements {
      url
      actor {
        ...resolvedActorFields
      }
      description
      label
      created {
        actor
        time
      }
      associatedUrn
      settings {
        showInAssetPreview
      }
    }
  }
  ${ResolvedActorFieldsFragmentDoc}
`;
export const GlobalTagsFieldsFragmentDoc = gql`
  fragment globalTagsFields on GlobalTags {
    tags {
      tag {
        urn
        type
        name
        description
        properties {
          name
          colorHex
        }
      }
      associatedUrn
      attribution {
        ...attributionFields
      }
    }
  }
  ${AttributionFieldsFragmentDoc}
`;
export const ParentNodesFieldsFragmentDoc = gql`
  fragment parentNodesFields on ParentNodesResult {
    count
    nodes {
      urn
      type
      properties {
        name
      }
      displayProperties {
        ...displayPropertiesFields
      }
    }
  }
  ${DisplayPropertiesFieldsFragmentDoc}
`;
export const GlossaryTermFragmentDoc = gql`
  fragment glossaryTerm on GlossaryTerm {
    urn
    name
    type
    hierarchicalName
    properties {
      name
      description
      definition
      termSource
      customProperties {
        key
        value
      }
    }
    ownership {
      ...ownershipFields
    }
    parentNodes {
      ...parentNodesFields
    }
  }
  ${OwnershipFieldsFragmentDoc}
  ${ParentNodesFieldsFragmentDoc}
`;
export const GlossaryTermsFragmentDoc = gql`
  fragment glossaryTerms on GlossaryTerms {
    terms {
      term {
        ...glossaryTerm
      }
      actor {
        urn
      }
      associatedUrn
      attribution {
        ...attributionFields
      }
    }
  }
  ${GlossaryTermFragmentDoc}
  ${AttributionFieldsFragmentDoc}
`;
export const ParentDomainsFieldsFragmentDoc = gql`
  fragment parentDomainsFields on ParentDomainsResult {
    count
    domains {
      urn
      type
      ... on Domain {
        displayProperties {
          ...displayPropertiesFields
        }
        properties {
          name
          description
        }
      }
    }
  }
  ${DisplayPropertiesFieldsFragmentDoc}
`;
export const DomainEntitiesFieldsFragmentDoc = gql`
  fragment domainEntitiesFields on Domain {
    entities(input: { start: 0, count: 0 }) {
      total
    }
    dataProducts: entities(
      input: {
        start: 0
        count: 0
        filters: [{ field: "_entityType", values: "DATA_PRODUCT" }]
      }
    ) {
      total
    }
    applications: entities(
      input: {
        start: 0
        count: 0
        filters: [{ field: "_entityType", values: "APPLICATION" }]
      }
    ) {
      total
    }
    children: relationships(
      input: { types: ["IsPartOf"], direction: INCOMING, start: 0, count: 0 }
    ) {
      total
    }
  }
`;
export const EntityDomainFragmentDoc = gql`
  fragment entityDomain on DomainAssociation {
    domain {
      urn
      type
      properties {
        name
        description
      }
      parentDomains {
        ...parentDomainsFields
      }
      ...domainEntitiesFields
      displayProperties {
        ...displayPropertiesFields
      }
    }
    associatedUrn
  }
  ${ParentDomainsFieldsFragmentDoc}
  ${DomainEntitiesFieldsFragmentDoc}
  ${DisplayPropertiesFieldsFragmentDoc}
`;
export const EntityApplicationFragmentDoc = gql`
  fragment entityApplication on ApplicationAssociation {
    application {
      urn
      type
      properties {
        name
        description
        externalUrl
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
      domain {
        ...entityDomain
      }
      children: relationships(
        input: {
          types: ["AssociatedWith"]
          direction: INCOMING
          start: 0
          count: 0
        }
      ) {
        total
      }
    }
  }
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDomainFragmentDoc}
`;
export const DeprecationFieldsFragmentDoc = gql`
  fragment deprecationFields on Deprecation {
    actor
    deprecated
    note
    decommissionTime
    actorEntity {
      urn
      type
      ...entityDisplayNameFields
    }
    replacement {
      ...entityDisplayNameFields
      ... on Dataset {
        platform {
          ...platformFields
        }
      }
    }
  }
  ${EntityDisplayNameFieldsFragmentDoc}
  ${PlatformFieldsFragmentDoc}
`;
export const EntityContainerFragmentDoc = gql`
  fragment entityContainer on Container {
    urn
    platform {
      ...platformFields
    }
    properties {
      name
    }
    subTypes {
      typeNames
    }
    deprecation {
      ...deprecationFields
    }
  }
  ${PlatformFieldsFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
`;
export const EmbedFieldsFragmentDoc = gql`
  fragment embedFields on Embed {
    renderUrl
  }
`;
export const BrowsePathV2FieldsFragmentDoc = gql`
  fragment browsePathV2Fields on BrowsePathV2 {
    path {
      name
      entity {
        urn
        type
        ...entityDisplayNameFields
      }
    }
  }
  ${EntityDisplayNameFieldsFragmentDoc}
`;
export const NonRecursiveDatasetFieldsFragmentDoc = gql`
  fragment nonRecursiveDatasetFields on Dataset {
    urn
    name
    type
    origin
    uri
    lastIngested
    platform {
      ...platformFields
    }
    dataPlatformInstance {
      ...dataPlatformInstanceFields
    }
    platformNativeType
    properties {
      name
      qualifiedName
      description
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
    structuredProperties {
      properties {
        ...structuredPropertiesFields
      }
    }
    editableProperties {
      name
      description
    }
    ownership {
      ...ownershipFields
    }
    institutionalMemory {
      ...institutionalMemoryFields
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
    application {
      ...entityApplication
    }
    container {
      ...entityContainer
    }
    deprecation {
      ...deprecationFields
    }
    embed {
      ...embedFields
    }
    browsePathV2 {
      ...browsePathV2Fields
    }
  }
  ${PlatformFieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityApplicationFragmentDoc}
  ${EntityContainerFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${EmbedFieldsFragmentDoc}
  ${BrowsePathV2FieldsFragmentDoc}
`;
export const EntityDataProductFragmentDoc = gql`
  fragment entityDataProduct on Entity {
    dataProduct: relationships(
      input: {
        types: ["DataProductContains"]
        direction: INCOMING
        start: 0
        count: 1
      }
    ) {
      relationships {
        type
        entity {
          urn
          type
          ... on DataProduct {
            properties {
              name
              description
            }
            domain {
              ...entityDomain
            }
          }
        }
      }
    }
  }
  ${EntityDomainFragmentDoc}
`;
export const NonRecursiveDataJobFieldsFragmentDoc = gql`
  fragment nonRecursiveDataJobFields on DataJob {
    urn
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
    domain {
      ...entityDomain
    }
    application {
      ...entityApplication
    }
    ...entityDataProduct
    deprecation {
      ...deprecationFields
    }
    subTypes {
      typeNames
    }
    platform {
      ...platformFields
    }
  }
  ${GlobalTagsFieldsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityApplicationFragmentDoc}
  ${EntityDataProductFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${PlatformFieldsFragmentDoc}
`;
export const NonRecursiveDataFlowFieldsFragmentDoc = gql`
  fragment nonRecursiveDataFlowFields on DataFlow {
    urn
    type
    orchestrator
    flowId
    cluster
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
    application {
      ...entityApplication
    }
    ...entityDataProduct
    deprecation {
      ...deprecationFields
    }
    subTypes {
      typeNames
    }
  }
  ${OwnershipFieldsFragmentDoc}
  ${PlatformFieldsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityApplicationFragmentDoc}
  ${EntityDataProductFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
`;
export const ParentContainerFieldsFragmentDoc = gql`
  fragment parentContainerFields on Container {
    urn
    type
    properties {
      name
    }
    subTypes {
      typeNames
    }
  }
`;
export const ParentContainersFieldsFragmentDoc = gql`
  fragment parentContainersFields on ParentContainersResult {
    count
    containers {
      ...parentContainerFields
    }
  }
  ${ParentContainerFieldsFragmentDoc}
`;
export const EntityHealthFragmentDoc = gql`
  fragment entityHealth on Health {
    type
    status
    message
    causes
  }
`;
export const DataTransformLogicFieldsFragmentDoc = gql`
  fragment dataTransformLogicFields on DataTransformLogic {
    transforms {
      queryStatement {
        value
        language
      }
    }
  }
`;
export const DataJobFieldsFragmentDoc = gql`
  fragment dataJobFields on DataJob {
    urn
    type
    exists
    lastIngested
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
    editableProperties {
      description
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
    application {
      ...entityApplication
    }
    ...entityDataProduct
    deprecation {
      ...deprecationFields
    }
    status {
      removed
    }
    dataPlatformInstance {
      ...dataPlatformInstanceFields
    }
    parentContainers {
      ...parentContainersFields
    }
    privileges {
      canEditLineage
    }
    browsePathV2 {
      ...browsePathV2Fields
    }
    subTypes {
      typeNames
    }
    health {
      ...entityHealth
    }
    activeIncidents: incidents(start: 0, count: 1, state: ACTIVE) {
      total
    }
    dataTransformLogic {
      ...dataTransformLogicFields
    }
    platform {
      ...platformFields
    }
  }
  ${NonRecursiveDataFlowFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityApplicationFragmentDoc}
  ${EntityDataProductFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${ParentContainersFieldsFragmentDoc}
  ${BrowsePathV2FieldsFragmentDoc}
  ${EntityHealthFragmentDoc}
  ${DataTransformLogicFieldsFragmentDoc}
  ${PlatformFieldsFragmentDoc}
`;
export const BusinessAttributeFragmentDoc = gql`
  fragment businessAttribute on BusinessAttributeAssociation {
    businessAttribute {
      urn
      type
      ownership {
        ...ownershipFields
      }
      properties {
        name
        description
        businessAttributeDataType: type
        lastModified {
          time
        }
        created {
          time
        }
        tags {
          tags {
            tag {
              urn
              name
              properties {
                name
              }
            }
            associatedUrn
          }
        }
        glossaryTerms {
          terms {
            term {
              urn
              type
              properties {
                name
              }
            }
            associatedUrn
          }
        }
      }
    }
    associatedUrn
  }
  ${OwnershipFieldsFragmentDoc}
`;
export const DocumentationFieldsFragmentDoc = gql`
  fragment documentationFields on Documentation {
    documentations {
      documentation
      attribution {
        ...attributionFields
      }
    }
  }
  ${AttributionFieldsFragmentDoc}
`;
export const EntitySchemaFieldEntityFieldsFragmentDoc = gql`
  fragment entitySchemaFieldEntityFields on SchemaFieldEntity {
    deprecation {
      ...deprecationFields
    }
    urn
    fieldPath
    type
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
    documentation {
      ...documentationFields
    }
    tags {
      ...globalTagsFields
    }
    glossaryTerms {
      ...glossaryTerms
    }
  }
  ${DeprecationFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
  ${BusinessAttributeFragmentDoc}
  ${DocumentationFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
`;
export const EntitySchemaFieldFieldsFragmentDoc = gql`
  fragment entitySchemaFieldFields on SchemaField {
    fieldPath
    label
    jsonPath
    nullable
    description
    type
    nativeDataType
    recursive
    isPartOfKey
    isPartitioningKey
    globalTags {
      ...globalTagsFields
    }
    glossaryTerms {
      ...glossaryTerms
    }
    schemaFieldEntity {
      ...entitySchemaFieldEntityFields
    }
  }
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntitySchemaFieldEntityFieldsFragmentDoc}
`;
export const InputFieldsFieldsFragmentDoc = gql`
  fragment inputFieldsFields on InputFields {
    fields {
      schemaFieldUrn
      schemaField {
        ...entitySchemaFieldFields
      }
    }
  }
  ${EntitySchemaFieldFieldsFragmentDoc}
`;
export const DashboardFieldsFragmentDoc = gql`
  fragment dashboardFields on Dashboard {
    urn
    type
    exists
    lastIngested
    tool
    dashboardId
    properties {
      name
      description
      customProperties {
        key
        value
      }
      externalUrl
      access
      lastRefreshed
      created {
        time
      }
      lastModified {
        time
      }
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
    platform {
      ...platformFields
    }
    domain {
      ...entityDomain
    }
    application {
      ...entityApplication
    }
    ...entityDataProduct
    parentContainers {
      ...parentContainersFields
    }
    status {
      removed
    }
    embed {
      ...embedFields
    }
    deprecation {
      ...deprecationFields
    }
    dataPlatformInstance {
      ...dataPlatformInstanceFields
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
    inputFields {
      ...inputFieldsFields
    }
    subTypes {
      typeNames
    }
    privileges {
      canEditLineage
      canEditEmbed
    }
    health {
      ...entityHealth
    }
  }
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${PlatformFieldsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityApplicationFragmentDoc}
  ${EntityDataProductFragmentDoc}
  ${ParentContainersFieldsFragmentDoc}
  ${EmbedFieldsFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${BrowsePathV2FieldsFragmentDoc}
  ${InputFieldsFieldsFragmentDoc}
  ${EntityHealthFragmentDoc}
`;
export const NonRecursiveMlFeatureFragmentDoc = gql`
  fragment nonRecursiveMLFeature on MLFeature {
    urn
    type
    exists
    lastIngested
    name
    featureNamespace
    description
    dataType
    properties {
      description
      dataType
      version {
        versionTag
      }
      sources {
        urn
        name
        type
        origin
        description
        uri
        platform {
          ...platformFields
        }
        platformNativeType
      }
    }
    ownership {
      ...ownershipFields
    }
    institutionalMemory {
      ...institutionalMemoryFields
    }
    status {
      removed
    }
    glossaryTerms {
      ...glossaryTerms
    }
    domain {
      ...entityDomain
    }
    application {
      ...entityApplication
    }
    ...entityDataProduct
    tags {
      ...globalTagsFields
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
    browsePathV2 {
      ...browsePathV2Fields
    }
    featureTables: relationships(
      input: { types: ["Contains"], direction: INCOMING, start: 0, count: 100 }
    ) {
      relationships {
        type
        entity {
          ... on MLFeatureTable {
            platform {
              ...platformFields
            }
          }
        }
      }
    }
    structuredProperties {
      properties {
        ...structuredPropertiesFields
      }
    }
  }
  ${PlatformFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityApplicationFragmentDoc}
  ${EntityDataProductFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${BrowsePathV2FieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
`;
export const NonRecursiveMlPrimaryKeyFragmentDoc = gql`
  fragment nonRecursiveMLPrimaryKey on MLPrimaryKey {
    urn
    type
    exists
    lastIngested
    name
    featureNamespace
    description
    dataType
    properties {
      description
      dataType
      version {
        versionTag
      }
      sources {
        urn
        name
        type
        origin
        description
        uri
        platform {
          ...platformFields
        }
        platformNativeType
      }
    }
    ownership {
      ...ownershipFields
    }
    institutionalMemory {
      ...institutionalMemoryFields
    }
    status {
      removed
    }
    glossaryTerms {
      ...glossaryTerms
    }
    domain {
      ...entityDomain
    }
    ...entityDataProduct
    tags {
      ...globalTagsFields
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
    featureTables: relationships(
      input: { types: ["KeyedBy"], direction: INCOMING, start: 0, count: 100 }
    ) {
      relationships {
        type
        entity {
          ... on MLFeatureTable {
            platform {
              ...platformFields
            }
          }
        }
      }
    }
    structuredProperties {
      properties {
        ...structuredPropertiesFields
      }
    }
  }
  ${PlatformFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityDataProductFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
`;
export const NonRecursiveMlFeatureTableFragmentDoc = gql`
  fragment nonRecursiveMLFeatureTable on MLFeatureTable {
    urn
    type
    exists
    lastIngested
    name
    platform {
      ...platformFields
    }
    dataPlatformInstance {
      ...dataPlatformInstanceFields
    }
    description
    properties {
      description
      mlFeatures {
        ...nonRecursiveMLFeature
      }
      mlPrimaryKeys {
        ...nonRecursiveMLPrimaryKey
      }
      customProperties {
        key
        value
      }
    }
    ownership {
      ...ownershipFields
    }
    institutionalMemory {
      ...institutionalMemoryFields
    }
    status {
      removed
    }
    glossaryTerms {
      ...glossaryTerms
    }
    domain {
      ...entityDomain
    }
    application {
      ...entityApplication
    }
    ...entityDataProduct
    tags {
      ...globalTagsFields
    }
    editableProperties {
      description
    }
    deprecation {
      ...deprecationFields
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
  ${PlatformFieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${NonRecursiveMlFeatureFragmentDoc}
  ${NonRecursiveMlPrimaryKeyFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityApplicationFragmentDoc}
  ${EntityDataProductFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${BrowsePathV2FieldsFragmentDoc}
  ${StructuredPropertiesFieldsFragmentDoc}
`;
export const NonRecursiveMlModelFragmentDoc = gql`
  fragment nonRecursiveMLModel on MLModel {
    urn
    type
    exists
    lastIngested
    name
    description
    origin
    platform {
      ...platformFields
    }
    dataPlatformInstance {
      ...dataPlatformInstanceFields
    }
    ownership {
      ...ownershipFields
    }
    properties {
      name
      description
      date
      created {
        time
        actor
      }
      lastModified {
        time
        actor
      }
      externalUrl
      version
      type
      trainingMetrics {
        name
        description
        value
      }
      hyperParams {
        name
        description
        value
      }
      mlFeatures
      groups {
        urn
        name
        description
        properties {
          name
        }
        editableProperties {
          description
        }
      }
      customProperties {
        key
        value
      }
      mlModelLineageInfo {
        trainingJobs
        downstreamJobs
      }
    }
    globalTags {
      ...globalTagsFields
    }
    status {
      removed
    }
    glossaryTerms {
      ...glossaryTerms
    }
    domain {
      ...entityDomain
    }
    application {
      ...entityApplication
    }
    ...entityDataProduct
    tags {
      ...globalTagsFields
    }
    editableProperties {
      description
    }
    deprecation {
      ...deprecationFields
    }
    institutionalMemory {
      ...institutionalMemoryFields
    }
    browsePathV2 {
      ...browsePathV2Fields
    }
  }
  ${PlatformFieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityApplicationFragmentDoc}
  ${EntityDataProductFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
  ${BrowsePathV2FieldsFragmentDoc}
`;
export const NonRecursiveMlModelGroupFieldsFragmentDoc = gql`
  fragment nonRecursiveMLModelGroupFields on MLModelGroup {
    urn
    type
    exists
    lastIngested
    name
    description
    origin
    platform {
      ...platformFields
    }
    dataPlatformInstance {
      ...dataPlatformInstanceFields
    }
    ownership {
      ...ownershipFields
    }
    status {
      removed
    }
    glossaryTerms {
      ...glossaryTerms
    }
    domain {
      ...entityDomain
    }
    application {
      ...entityApplication
    }
    ...entityDataProduct
    tags {
      ...globalTagsFields
    }
    editableProperties {
      description
    }
    deprecation {
      ...deprecationFields
    }
    properties {
      name
      description
      created {
        time
        actor
      }
      lastModified {
        time
        actor
      }
      mlModelLineageInfo {
        trainingJobs
        downstreamJobs
      }
      customProperties {
        key
        value
      }
    }
    browsePathV2 {
      ...browsePathV2Fields
    }
    institutionalMemory {
      ...institutionalMemoryFields
    }
  }
  ${PlatformFieldsFragmentDoc}
  ${DataPlatformInstanceFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
  ${EntityDomainFragmentDoc}
  ${EntityApplicationFragmentDoc}
  ${EntityDataProductFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${DeprecationFieldsFragmentDoc}
  ${BrowsePathV2FieldsFragmentDoc}
  ${InstitutionalMemoryFieldsFragmentDoc}
`;
export const SchemaMetadataFieldsFragmentDoc = gql`
  fragment schemaMetadataFields on SchemaMetadata {
    aspectVersion
    createdAt
    datasetUrn
    name
    platformUrn
    version
    cluster
    hash
    platformSchema {
      ... on TableSchema {
        schema
      }
      ... on KeyValueSchema {
        keySchema
        valueSchema
      }
    }
    fields {
      ...entitySchemaFieldFields
    }
    primaryKeys
    foreignKeys {
      name
      sourceFields {
        fieldPath
      }
      foreignFields {
        fieldPath
      }
      foreignDataset {
        urn
        name
        type
        origin
        uri
        properties {
          description
        }
        platform {
          ...platformFields
        }
        platformNativeType
        ownership {
          ...ownershipFields
        }
        globalTags {
          ...globalTagsFields
        }
        glossaryTerms {
          ...glossaryTerms
        }
      }
    }
  }
  ${EntitySchemaFieldFieldsFragmentDoc}
  ${PlatformFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
  ${GlobalTagsFieldsFragmentDoc}
  ${GlossaryTermsFragmentDoc}
`;
export const DatasetErModelRelationshipFieldsFragmentDoc = gql`
  fragment datasetERModelRelationshipFields on Dataset {
    urn
    name
    properties {
      name
      description
    }
    editableProperties {
      name
      description
    }
    schemaMetadata {
      ...schemaMetadataFields
    }
  }
  ${SchemaMetadataFieldsFragmentDoc}
`;
export const RelationshipFieldMappingFragmentDoc = gql`
  fragment relationshipFieldMapping on RelationshipFieldMapping {
    sourceField
    destinationField
  }
`;
export const ErmodelrelationPropertiesFieldsFragmentDoc = gql`
  fragment ermodelrelationPropertiesFields on ERModelRelationshipProperties {
    name
    source {
      ...datasetERModelRelationshipFields
    }
    destination {
      ...datasetERModelRelationshipFields
    }
    relationshipFieldMappings {
      ...relationshipFieldMapping
    }
    createdTime
    createdActor {
      urn
    }
    cardinality
  }
  ${DatasetErModelRelationshipFieldsFragmentDoc}
  ${RelationshipFieldMappingFragmentDoc}
`;
export const ErmodelrelationEditablePropertiesFieldsFragmentDoc = gql`
  fragment ermodelrelationEditablePropertiesFields on ERModelRelationshipEditableProperties {
    description
    name
  }
`;
export const AutoRenderAspectFieldsFragmentDoc = gql`
  fragment autoRenderAspectFields on RawAspect {
    aspectName
    payload
    renderSpec {
      displayType
      displayName
      key
    }
  }
`;
export const FormPromptAssociationFieldsFragmentDoc = gql`
  fragment formPromptAssociationFields on FormPromptAssociation {
    id
    lastModified {
      time
      actor {
        urn
        type
        ...entityDisplayNameFields
      }
    }
    fieldAssociations {
      completedFieldPrompts {
        fieldPath
        lastModified {
          time
          actor {
            urn
            type
            ...entityDisplayNameFields
          }
        }
      }
    }
  }
  ${EntityDisplayNameFieldsFragmentDoc}
`;
export const FormAssociationFieldsFragmentDoc = gql`
  fragment formAssociationFields on FormAssociation {
    associatedUrn
    incompletePrompts {
      ...formPromptAssociationFields
    }
    completedPrompts {
      ...formPromptAssociationFields
    }
    form {
      urn
      type
      info {
        name
        description
        type
        prompts {
          id
          formUrn
          title
          description
          type
          required
          structuredPropertyParams {
            structuredProperty {
              ...structuredPropertyFields
            }
          }
        }
        actors {
          owners
          isAssignedToMe
        }
      }
      ownership {
        ...ownershipFields
      }
    }
  }
  ${FormPromptAssociationFieldsFragmentDoc}
  ${StructuredPropertyFieldsFragmentDoc}
  ${OwnershipFieldsFragmentDoc}
`;
export const FormsFieldsFragmentDoc = gql`
  fragment formsFields on Forms {
    completedForms {
      ...formAssociationFields
    }
    incompleteForms {
      ...formAssociationFields
    }
    verifications {
      form {
        urn
      }
      lastModified {
        time
        actor {
          urn
          type
          ...entityDisplayNameFields
        }
      }
    }
  }
  ${FormAssociationFieldsFragmentDoc}
  ${EntityDisplayNameFieldsFragmentDoc}
`;
export const EntityPrivilegesFragmentDoc = gql`
  fragment entityPrivileges on EntityPrivileges {
    canEditLineage
    canEditDomains
    canEditDataProducts
    canEditTags
    canEditGlossaryTerms
    canEditDescription
    canEditLinks
    canEditOwners
    canEditAssertions
    canEditIncidents
    canEditDeprecation
    canEditSchemaFieldTags
    canEditSchemaFieldGlossaryTerms
    canEditSchemaFieldDescription
    canEditQueries
    canEditEmbed
    canManageEntity
    canManageChildren
    canEditProperties
    canViewDatasetUsage
    canViewDatasetProfile
    canViewDatasetOperations
    canManageAssetSummary
  }
`;
export const DatasetProfileFieldsFragmentDoc = gql`
  fragment datasetProfileFields on DatasetProfile {
    rowCount
    columnCount
    sizeInBytes
    timestampMillis
    partitionSpec {
      type
      partition
      timePartition {
        startTimeMillis
        durationMillis
      }
    }
    fieldProfiles {
      fieldPath
      uniqueCount
      uniqueProportion
      nullCount
      nullProportion
      min
      max
      mean
      median
      stdev
      sampleValues
      quantiles {
        quantile
        value
      }
      distinctValueFrequencies {
        value
        frequency
      }
    }
  }
`;
export const NotesFragmentDoc = gql`
  fragment notes on Entity {
    notes: relationships(
      input: {
        types: ["PostTarget"]
        direction: INCOMING
        start: 0
        count: 100
      }
    ) {
      total
      relationships {
        type
        entity {
          ... on Post {
            urn
            type
            postType
            lastModified {
              time
              actor
            }
            content {
              contentType
              title
              description
              link
              media {
                type
                location
              }
            }
          }
        }
      }
    }
  }
`;
export const CustomPropertiesFieldsFragmentDoc = gql`
  fragment customPropertiesFields on CustomPropertiesEntry {
    key
    value
    associatedUrn
  }
`;
export const IngestionSourceFieldsFragmentDoc = gql`
  fragment ingestionSourceFields on IngestionSource {
    urn
    name
    type
    config {
      recipe
      version
      executorId
      debugMode
      extraArgs {
        key
        value
      }
    }
    schedule {
      interval
      timezone
    }
    platform {
      urn
      type
      name
    }
    source {
      type
    }
  }
`;
export const MinimalIngestionExecutionRequestFieldsFragmentDoc = gql`
  fragment minimalIngestionExecutionRequestFields on ExecutionRequest {
    urn
    id
    type
    input {
      requestedAt
      source {
        type
      }
      task
    }
  }
`;
export const IngestionExecutionRequestFieldsFragmentDoc = gql`
  fragment ingestionExecutionRequestFields on ExecutionRequest {
    urn
    id
    type
    input {
      requestedAt
      source {
        type
      }
      arguments {
        key
        value
      }
      actor {
        urn
        type
        username
        properties {
          displayName
          firstName
          lastName
          fullName
          active
        }
        editableProperties {
          displayName
          pictureLink
        }
      }
      task
      executorId
    }
    result {
      status
      startTimeMs
      durationMs
      report
      structuredReport {
        type
        serializedValue
        contentType
      }
    }
  }
`;
