package com.linkedin.datahub.graphql.generated;


/**
 * Delete an existing test - note that this will NOT delete dangling pointers until the next execution of the test.
 */
public interface DeleteTestMutationResolver {

    /**
     * Delete an existing test - note that this will NOT delete dangling pointers until the next execution of the test.
     */
    Boolean deleteTest(@javax.annotation.Nonnull String urn) throws Exception;

}
