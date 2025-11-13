package com.linkedin.datahub.graphql.generated;


/**
 * Upsert a particular connection.
This requires the 'Manage Connections' platform privilege.
 */
public interface UpsertConnectionMutationResolver {

    /**
     * Upsert a particular connection.
This requires the 'Manage Connections' platform privilege.
     */
    @javax.annotation.Nonnull
    DataHubConnection upsertConnection(@javax.annotation.Nonnull UpsertDataHubConnectionInput input) throws Exception;

}
