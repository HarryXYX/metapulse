/* eslint-disable */
import * as Types from "../types.generated";

import { PageTemplateFragment } from "./template.generated";
import { gql } from "@apollo/client";
import { PageTemplateFragmentDoc } from "./template.generated";
import * as Apollo from "@apollo/client";
export type AssetSettingsFieldsFragment = { __typename?: "AssetSettings" } & {
  assetSummary?: Types.Maybe<
    { __typename?: "AssetSummarySettings" } & {
      templates?: Types.Maybe<
        Array<
          { __typename?: "AssetSummarySettingsTemplate" } & {
            template?: Types.Maybe<
              { __typename?: "DataHubPageTemplate" } & PageTemplateFragment
            >;
          }
        >
      >;
    }
  >;
};

export type UpdateAssetSettingsMutationVariables = Types.Exact<{
  input: Types.UpdateAssetSettingsInput;
}>;

export type UpdateAssetSettingsMutation = { __typename?: "Mutation" } & {
  updateAssetSettings: {
    __typename?: "AssetSettings";
  } & AssetSettingsFieldsFragment;
};

export const AssetSettingsFieldsFragmentDoc = gql`
  fragment AssetSettingsFields on AssetSettings {
    assetSummary {
      templates {
        template {
          ...PageTemplate
        }
      }
    }
  }
  ${PageTemplateFragmentDoc}
`;
export const UpdateAssetSettingsDocument = gql`
  mutation updateAssetSettings($input: UpdateAssetSettingsInput!) {
    updateAssetSettings(input: $input) {
      ...AssetSettingsFields
    }
  }
  ${AssetSettingsFieldsFragmentDoc}
`;
export type UpdateAssetSettingsMutationFn = Apollo.MutationFunction<
  UpdateAssetSettingsMutation,
  UpdateAssetSettingsMutationVariables
>;

/**
 * __useUpdateAssetSettingsMutation__
 *
 * To run a mutation, you first call `useUpdateAssetSettingsMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useUpdateAssetSettingsMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [updateAssetSettingsMutation, { data, loading, error }] = useUpdateAssetSettingsMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useUpdateAssetSettingsMutation(
  baseOptions?: Apollo.MutationHookOptions<
    UpdateAssetSettingsMutation,
    UpdateAssetSettingsMutationVariables
  >,
) {
  return Apollo.useMutation<
    UpdateAssetSettingsMutation,
    UpdateAssetSettingsMutationVariables
  >(UpdateAssetSettingsDocument, baseOptions);
}
export type UpdateAssetSettingsMutationHookResult = ReturnType<
  typeof useUpdateAssetSettingsMutation
>;
export type UpdateAssetSettingsMutationResult =
  Apollo.MutationResult<UpdateAssetSettingsMutation>;
export type UpdateAssetSettingsMutationOptions = Apollo.BaseMutationOptions<
  UpdateAssetSettingsMutation,
  UpdateAssetSettingsMutationVariables
>;
