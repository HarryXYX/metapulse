package com.linkedin.datahub.graphql.generated;


/**
 * Create a new Domain. Returns the urn of the newly created Domain. Requires the 'Create Domains' or 'Manage Domains' Platform Privilege. If a Domain with the provided ID already exists,
it will be overwritten.
 */
public interface CreateDomainMutationResolver {

    /**
     * Create a new Domain. Returns the urn of the newly created Domain. Requires the 'Create Domains' or 'Manage Domains' Platform Privilege. If a Domain with the provided ID already exists,
it will be overwritten.
     */
    String createDomain(@javax.annotation.Nonnull CreateDomainInput input) throws Exception;

}
