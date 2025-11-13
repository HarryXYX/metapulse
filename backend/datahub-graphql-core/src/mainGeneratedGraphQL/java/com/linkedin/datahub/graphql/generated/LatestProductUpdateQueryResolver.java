package com.linkedin.datahub.graphql.generated;


/**
 * Fetch the latest product update information from configured JSON source.
Returns null if the JSON source is unavailable or feature is disabled.
 */
public interface LatestProductUpdateQueryResolver {

    /**
     * Fetch the latest product update information from configured JSON source.
Returns null if the JSON source is unavailable or feature is disabled.
     */
    ProductUpdate latestProductUpdate(Boolean refreshCache) throws Exception;

}
