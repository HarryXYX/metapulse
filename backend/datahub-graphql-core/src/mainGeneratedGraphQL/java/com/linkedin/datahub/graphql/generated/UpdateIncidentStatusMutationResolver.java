package com.linkedin.datahub.graphql.generated;


/**
 * Update the status of an existing incident for a resource (asset)
 */
public interface UpdateIncidentStatusMutationResolver {

    /**
     * Update the status of an existing incident for a resource (asset)
     */
    Boolean updateIncidentStatus(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull IncidentStatusInput input) throws Exception;

}
