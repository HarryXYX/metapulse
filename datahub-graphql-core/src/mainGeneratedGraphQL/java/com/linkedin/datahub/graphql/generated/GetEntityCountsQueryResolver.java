package com.linkedin.datahub.graphql.generated;


/**
 * Fetches the number of entities ingested by type
 */
public interface GetEntityCountsQueryResolver {

    /**
     * Fetches the number of entities ingested by type
     */
    EntityCountResults getEntityCounts(EntityCountInput input) throws Exception;

}
