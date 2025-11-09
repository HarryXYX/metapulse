package com.linkedin.datahub.graphql.generated;


/**
 * Sets the Domain for a Dataset, Chart, Dashboard, Data Flow (Pipeline), or Data Job (Task). Returns true if the Domain was successfully removed, or was already removed. Requires the Edit Domains privilege for an asset.
 */
public interface UnsetDomainMutationResolver {

    /**
     * Sets the Domain for a Dataset, Chart, Dashboard, Data Flow (Pipeline), or Data Job (Task). Returns true if the Domain was successfully removed, or was already removed. Requires the Edit Domains privilege for an asset.
     */
    Boolean unsetDomain(@javax.annotation.Nonnull String entityUrn) throws Exception;

}
