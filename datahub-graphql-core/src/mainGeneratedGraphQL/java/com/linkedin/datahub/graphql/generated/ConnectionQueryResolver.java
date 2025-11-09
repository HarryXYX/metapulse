package com.linkedin.datahub.graphql.generated;


/**
 * Get a set of connection details by URN.
This requires the 'Manage Connections' platform privilege.
Returns null if a connection with the provided urn does not exist.
 */
public interface ConnectionQueryResolver {

    /**
     * Get a set of connection details by URN.
This requires the 'Manage Connections' platform privilege.
Returns null if a connection with the provided urn does not exist.
     */
    DataHubConnection connection(@javax.annotation.Nonnull String urn) throws Exception;

}
