package com.linkedin.datahub.graphql.generated;


/**
 * Update an existing data incident. Any fields that are omitted will simply not be updated.
 */
public interface UpdateIncidentMutationResolver {

    /**
     * Update an existing data incident. Any fields that are omitted will simply not be updated.
     */
    Boolean updateIncident(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull UpdateIncidentInput input) throws Exception;

}
