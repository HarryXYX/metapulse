package com.linkedin.datahub.graphql.generated;


/**
 * Sets the Domain for a Dataset, Chart, Dashboard, Data Flow (Pipeline), or Data Job (Task). Returns true if the Domain was successfully added, or already exists. Requires the Edit Domains privilege for the Entity.
 */
public interface SetDomainMutationResolver {

    /**
     * Sets the Domain for a Dataset, Chart, Dashboard, Data Flow (Pipeline), or Data Job (Task). Returns true if the Domain was successfully added, or already exists. Requires the Edit Domains privilege for the Entity.
     */
    Boolean setDomain(@javax.annotation.Nonnull String entityUrn, @javax.annotation.Nonnull String domainUrn) throws Exception;

}
