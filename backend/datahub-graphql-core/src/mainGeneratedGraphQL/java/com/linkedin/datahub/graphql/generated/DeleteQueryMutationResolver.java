package com.linkedin.datahub.graphql.generated;


/**
 * Delete a Query by urn. This requires the 'Edit Queries' Metadata Privilege.
 */
public interface DeleteQueryMutationResolver {

    /**
     * Delete a Query by urn. This requires the 'Edit Queries' Metadata Privilege.
     */
    Boolean deleteQuery(@javax.annotation.Nonnull String urn) throws Exception;

}
