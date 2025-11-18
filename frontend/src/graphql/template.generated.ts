/* eslint-disable */
import * as Types from "../types.generated";

import { StructuredPropertyFieldsFragment } from "./fragments.generated";
import { gql } from "@apollo/client";
import { StructuredPropertyFieldsFragmentDoc } from "./fragments.generated";
import * as Apollo from "@apollo/client";
export type PageTemplateFragment = {
  __typename?: "DataHubPageTemplate";
} & Pick<Types.DataHubPageTemplate, "urn" | "type"> & {
    properties: { __typename?: "DataHubPageTemplateProperties" } & {
      rows: Array<
        { __typename?: "DataHubPageTemplateRow" } & PageTemplateRowFragment
      >;
      assetSummary?: Types.Maybe<
        {
          __typename?: "DataHubPageTemplateAssetSummary";
        } & PageTemplateAssetSummaryFragment
      >;
      surface: { __typename?: "DataHubPageTemplateSurface" } & Pick<
        Types.DataHubPageTemplateSurface,
        "surfaceType"
      >;
      visibility: { __typename?: "DataHubPageTemplateVisibility" } & Pick<
        Types.DataHubPageTemplateVisibility,
        "scope"
      >;
    };
  };

export type PageTemplateRowFragment = {
  __typename?: "DataHubPageTemplateRow";
} & {
  modules: Array<{ __typename?: "DataHubPageModule" } & PageModuleFragment>;
};

export type PageModuleFragment = { __typename?: "DataHubPageModule" } & Pick<
  Types.DataHubPageModule,
  "urn" | "type" | "exists"
> & {
    properties: { __typename?: "DataHubPageModuleProperties" } & Pick<
      Types.DataHubPageModuleProperties,
      "name" | "type"
    > & {
        visibility: { __typename?: "DataHubPageModuleVisibility" } & Pick<
          Types.DataHubPageModuleVisibility,
          "scope"
        >;
        params: { __typename?: "DataHubPageModuleParams" } & {
          richTextParams?: Types.Maybe<
            { __typename?: "RichTextModuleParams" } & Pick<
              Types.RichTextModuleParams,
              "content"
            >
          >;
          assetCollectionParams?: Types.Maybe<
            { __typename?: "AssetCollectionModuleParams" } & Pick<
              Types.AssetCollectionModuleParams,
              "assetUrns" | "dynamicFilterJson"
            >
          >;
          linkParams?: Types.Maybe<
            { __typename?: "LinkModuleParams" } & Pick<
              Types.LinkModuleParams,
              "linkUrl" | "imageUrl" | "description"
            >
          >;
          hierarchyViewParams?: Types.Maybe<
            { __typename?: "HierarchyViewModuleParams" } & Pick<
              Types.HierarchyViewModuleParams,
              "assetUrns" | "showRelatedEntities" | "relatedEntitiesFilterJson"
            >
          >;
        };
      };
  };

export type PageTemplateAssetSummaryFragment = {
  __typename?: "DataHubPageTemplateAssetSummary";
} & {
  summaryElements?: Types.Maybe<
    Array<{ __typename?: "SummaryElement" } & SummaryElementFragment>
  >;
};

export type SummaryElementFragment = { __typename?: "SummaryElement" } & Pick<
  Types.SummaryElement,
  "elementType"
> & {
    structuredProperty?: Types.Maybe<
      {
        __typename?: "StructuredPropertyEntity";
      } & StructuredPropertyFieldsFragment
    >;
  };

export type UpsertPageTemplateMutationVariables = Types.Exact<{
  input: Types.UpsertPageTemplateInput;
}>;

export type UpsertPageTemplateMutation = { __typename?: "Mutation" } & {
  upsertPageTemplate: {
    __typename?: "DataHubPageTemplate";
  } & PageTemplateFragment;
};

export type UpsertPageModuleMutationVariables = Types.Exact<{
  input: Types.UpsertPageModuleInput;
}>;

export type UpsertPageModuleMutation = { __typename?: "Mutation" } & {
  upsertPageModule: { __typename?: "DataHubPageModule" } & Pick<
    Types.DataHubPageModule,
    "urn"
  >;
};

export type DeletePageModuleMutationVariables = Types.Exact<{
  input: Types.DeletePageModuleInput;
}>;

export type DeletePageModuleMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "deletePageModule"
>;

export type DeletePageTemplateMutationVariables = Types.Exact<{
  input: Types.DeletePageTemplateInput;
}>;

export type DeletePageTemplateMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "deletePageTemplate"
>;

export const PageModuleFragmentDoc = gql`
  fragment PageModule on DataHubPageModule {
    urn
    type
    exists
    properties {
      name
      type
      visibility {
        scope
      }
      params {
        richTextParams {
          content
        }
        assetCollectionParams {
          assetUrns
          dynamicFilterJson
        }
        linkParams {
          linkUrl
          imageUrl
          description
        }
        hierarchyViewParams {
          assetUrns
          showRelatedEntities
          relatedEntitiesFilterJson
        }
      }
    }
  }
`;
export const PageTemplateRowFragmentDoc = gql`
  fragment PageTemplateRow on DataHubPageTemplateRow {
    modules {
      ...PageModule
    }
  }
  ${PageModuleFragmentDoc}
`;
export const SummaryElementFragmentDoc = gql`
  fragment SummaryElement on SummaryElement {
    elementType
    structuredProperty {
      ...structuredPropertyFields
    }
  }
  ${StructuredPropertyFieldsFragmentDoc}
`;
export const PageTemplateAssetSummaryFragmentDoc = gql`
  fragment PageTemplateAssetSummary on DataHubPageTemplateAssetSummary {
    summaryElements {
      ...SummaryElement
    }
  }
  ${SummaryElementFragmentDoc}
`;
export const PageTemplateFragmentDoc = gql`
  fragment PageTemplate on DataHubPageTemplate {
    urn
    type
    properties {
      rows {
        ...PageTemplateRow
      }
      assetSummary {
        ...PageTemplateAssetSummary
      }
      surface {
        surfaceType
      }
      visibility {
        scope
      }
    }
  }
  ${PageTemplateRowFragmentDoc}
  ${PageTemplateAssetSummaryFragmentDoc}
`;
export const UpsertPageTemplateDocument = gql`
  mutation upsertPageTemplate($input: UpsertPageTemplateInput!) {
    upsertPageTemplate(input: $input) {
      ...PageTemplate
    }
  }
  ${PageTemplateFragmentDoc}
`;
export type UpsertPageTemplateMutationFn = Apollo.MutationFunction<
  UpsertPageTemplateMutation,
  UpsertPageTemplateMutationVariables
>;

/**
 * __useUpsertPageTemplateMutation__
 *
 * To run a mutation, you first call `useUpsertPageTemplateMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpsertPageTemplateMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [upsertPageTemplateMutation, { data, loading, error }] = useUpsertPageTemplateMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpsertPageTemplateMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpsertPageTemplateMutation,
    UpsertPageTemplateMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpsertPageTemplateMutation,
    UpsertPageTemplateMutationVariables
  >(UpsertPageTemplateDocument, baseOptions);
}
export type UpsertPageTemplateMutationHookResult = ReturnType<
  typeof useUpsertPageTemplateMutation
>;
export type UpsertPageTemplateMutationResult =
  Apollo.MutationResult<UpsertPageTemplateMutation>;
export type UpsertPageTemplateMutationOptions = Apollo.BaseMutationOptions<
  UpsertPageTemplateMutation,
  UpsertPageTemplateMutationVariables
>;
export const UpsertPageModuleDocument = gql`
  mutation upsertPageModule($input: UpsertPageModuleInput!) {
    upsertPageModule(input: $input) {
      urn
    }
  }
`;
export type UpsertPageModuleMutationFn = Apollo.MutationFunction<
  UpsertPageModuleMutation,
  UpsertPageModuleMutationVariables
>;

/**
 * __useUpsertPageModuleMutation__
 *
 * To run a mutation, you first call `useUpsertPageModuleMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpsertPageModuleMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [upsertPageModuleMutation, { data, loading, error }] = useUpsertPageModuleMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpsertPageModuleMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpsertPageModuleMutation,
    UpsertPageModuleMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpsertPageModuleMutation,
    UpsertPageModuleMutationVariables
  >(UpsertPageModuleDocument, baseOptions);
}
export type UpsertPageModuleMutationHookResult = ReturnType<
  typeof useUpsertPageModuleMutation
>;
export type UpsertPageModuleMutationResult =
  Apollo.MutationResult<UpsertPageModuleMutation>;
export type UpsertPageModuleMutationOptions = Apollo.BaseMutationOptions<
  UpsertPageModuleMutation,
  UpsertPageModuleMutationVariables
>;
export const DeletePageModuleDocument = gql`
  mutation deletePageModule($input: DeletePageModuleInput!) {
    deletePageModule(input: $input)
  }
`;
export type DeletePageModuleMutationFn = Apollo.MutationFunction<
  DeletePageModuleMutation,
  DeletePageModuleMutationVariables
>;

/**
 * __useDeletePageModuleMutation__
 *
 * To run a mutation, you first call `useDeletePageModuleMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useDeletePageModuleMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [deletePageModuleMutation, { data, loading, error }] = useDeletePageModuleMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useDeletePageModuleMutation(
  baseOptions?: Apollo.MutationHookOptions<
    DeletePageModuleMutation,
    DeletePageModuleMutationVariables
  >,
) {
  return Apollo.useMutation<
    DeletePageModuleMutation,
    DeletePageModuleMutationVariables
  >(DeletePageModuleDocument, baseOptions);
}
export type DeletePageModuleMutationHookResult = ReturnType<
  typeof useDeletePageModuleMutation
>;
export type DeletePageModuleMutationResult =
  Apollo.MutationResult<DeletePageModuleMutation>;
export type DeletePageModuleMutationOptions = Apollo.BaseMutationOptions<
  DeletePageModuleMutation,
  DeletePageModuleMutationVariables
>;
export const DeletePageTemplateDocument = gql`
  mutation deletePageTemplate($input: DeletePageTemplateInput!) {
    deletePageTemplate(input: $input)
  }
`;
export type DeletePageTemplateMutationFn = Apollo.MutationFunction<
  DeletePageTemplateMutation,
  DeletePageTemplateMutationVariables
>;

/**
 * __useDeletePageTemplateMutation__
 *
 * To run a mutation, you first call `useDeletePageTemplateMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useDeletePageTemplateMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [deletePageTemplateMutation, { data, loading, error }] = useDeletePageTemplateMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useDeletePageTemplateMutation(
  baseOptions?: Apollo.MutationHookOptions<
    DeletePageTemplateMutation,
    DeletePageTemplateMutationVariables
  >,
) {
  return Apollo.useMutation<
    DeletePageTemplateMutation,
    DeletePageTemplateMutationVariables
  >(DeletePageTemplateDocument, baseOptions);
}
export type DeletePageTemplateMutationHookResult = ReturnType<
  typeof useDeletePageTemplateMutation
>;
export type DeletePageTemplateMutationResult =
  Apollo.MutationResult<DeletePageTemplateMutation>;
export type DeletePageTemplateMutationOptions = Apollo.BaseMutationOptions<
  DeletePageTemplateMutation,
  DeletePageTemplateMutationVariables
>;
