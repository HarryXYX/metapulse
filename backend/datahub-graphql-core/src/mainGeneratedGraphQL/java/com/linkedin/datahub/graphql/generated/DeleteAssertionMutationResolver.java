package com.linkedin.datahub.graphql.generated;


/**
 * Remove an assertion associated with an entity. Requires the 'Edit Assertions' privilege on the entity.
 */
public interface DeleteAssertionMutationResolver {

    /**
     * Remove an assertion associated with an entity. Requires the 'Edit Assertions' privilege on the entity.
     */
    Boolean deleteAssertion(@javax.annotation.Nonnull String urn) throws Exception;

}
