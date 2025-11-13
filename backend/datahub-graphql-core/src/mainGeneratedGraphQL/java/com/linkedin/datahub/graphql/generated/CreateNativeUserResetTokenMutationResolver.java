package com.linkedin.datahub.graphql.generated;


/**
 * Generates a token that can be shared with existing native users to reset their credentials.
 */
public interface CreateNativeUserResetTokenMutationResolver {

    /**
     * Generates a token that can be shared with existing native users to reset their credentials.
     */
    ResetToken createNativeUserResetToken(@javax.annotation.Nonnull CreateNativeUserResetTokenInput input) throws Exception;

}
