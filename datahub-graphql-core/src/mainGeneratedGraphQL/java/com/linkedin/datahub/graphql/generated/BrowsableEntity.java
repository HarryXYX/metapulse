package com.linkedin.datahub.graphql.generated;


/**
 * A Metadata Entity which is browsable, or has browse paths.
 */
public interface BrowsableEntity {

    /**
     * The browse paths corresponding to an entity. If no Browse Paths have been generated before, this will be null.
     */
    java.util.List<BrowsePath> getBrowsePaths();

}
