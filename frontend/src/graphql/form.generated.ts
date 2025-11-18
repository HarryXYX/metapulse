/* eslint-disable */
import * as Types from "../types.generated";

import { gql } from "@apollo/client";
import * as Apollo from "@apollo/client";
export type SubmitFormPromptMutationVariables = Types.Exact<{
  urn: Types.Scalars["String"];
  input: Types.SubmitFormPromptInput;
}>;

export type SubmitFormPromptMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "submitFormPrompt"
>;

export type VerifyFormMutationVariables = Types.Exact<{
  input: Types.VerifyFormInput;
}>;

export type VerifyFormMutation = { __typename?: "Mutation" } & Pick<
  Types.Mutation,
  "verifyForm"
>;

export const SubmitFormPromptDocument = gql`
  mutation submitFormPrompt($urn: String!, $input: SubmitFormPromptInput!) {
    submitFormPrompt(urn: $urn, input: $input)
  }
`;
export type SubmitFormPromptMutationFn = Apollo.MutationFunction<
  SubmitFormPromptMutation,
  SubmitFormPromptMutationVariables
>;

/**
 * __useSubmitFormPromptMutation__
 *
 * To run a mutation, you first call `useSubmitFormPromptMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useSubmitFormPromptMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [submitFormPromptMutation, { data, loading, error }] = useSubmitFormPromptMutation({
 *   variables: {
 *      urn: // value for 'urn'
 *      input: // value for 'input'
 *   },
 * });
 */
export function useSubmitFormPromptMutation(
  baseOptions?: Apollo.MutationHookOptions<
    SubmitFormPromptMutation,
    SubmitFormPromptMutationVariables
  >,
) {
  return Apollo.useMutation<
    SubmitFormPromptMutation,
    SubmitFormPromptMutationVariables
  >(SubmitFormPromptDocument, baseOptions);
}
export type SubmitFormPromptMutationHookResult = ReturnType<
  typeof useSubmitFormPromptMutation
>;
export type SubmitFormPromptMutationResult =
  Apollo.MutationResult<SubmitFormPromptMutation>;
export type SubmitFormPromptMutationOptions = Apollo.BaseMutationOptions<
  SubmitFormPromptMutation,
  SubmitFormPromptMutationVariables
>;
export const VerifyFormDocument = gql`
  mutation verifyForm($input: VerifyFormInput!) {
    verifyForm(input: $input)
  }
`;
export type VerifyFormMutationFn = Apollo.MutationFunction<
  VerifyFormMutation,
  VerifyFormMutationVariables
>;

/**
 * __useVerifyFormMutation__
 *
 * To run a mutation, you first call `useVerifyFormMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useVerifyFormMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [verifyFormMutation, { data, loading, error }] = useVerifyFormMutation({
 *   variables: {
 *      input: // value for 'input'
 *   },
 * });
 */
export function useVerifyFormMutation(
  baseOptions?: Apollo.MutationHookOptions<
    VerifyFormMutation,
    VerifyFormMutationVariables
  >,
) {
  return Apollo.useMutation<VerifyFormMutation, VerifyFormMutationVariables>(
    VerifyFormDocument,
    baseOptions,
  );
}
export type VerifyFormMutationHookResult = ReturnType<
  typeof useVerifyFormMutation
>;
export type VerifyFormMutationResult =
  Apollo.MutationResult<VerifyFormMutation>;
export type VerifyFormMutationOptions = Apollo.BaseMutationOptions<
  VerifyFormMutation,
  VerifyFormMutationVariables
>;
