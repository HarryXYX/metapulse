package com.linkedin.datahub.graphql.generated;


/**
 * Delete a Custom Ownership Type by urn. This requires the 'Manage Ownership Types' Metadata Privilege.
 */
public interface DeleteOwnershipTypeMutationResolver {

    /**
     * Delete a Custom Ownership Type by urn. This requires the 'Manage Ownership Types' Metadata Privilege.
     */
    Boolean deleteOwnershipType(@javax.annotation.Nonnull String urn, Boolean deleteReferences) throws Exception;

}
