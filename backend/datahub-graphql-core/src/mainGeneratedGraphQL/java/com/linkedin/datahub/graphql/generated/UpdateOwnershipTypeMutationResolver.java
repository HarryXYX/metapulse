package com.linkedin.datahub.graphql.generated;


/**
 * Update an existing Query. This requires the 'Manage Ownership Types' Metadata Privilege.
 */
public interface UpdateOwnershipTypeMutationResolver {

    /**
     * Update an existing Query. This requires the 'Manage Ownership Types' Metadata Privilege.
     */
    OwnershipTypeEntity updateOwnershipType(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull UpdateOwnershipTypeInput input) throws Exception;

}
