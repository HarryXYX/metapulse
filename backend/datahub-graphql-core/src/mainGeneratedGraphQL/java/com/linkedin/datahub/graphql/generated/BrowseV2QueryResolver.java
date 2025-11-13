package com.linkedin.datahub.graphql.generated;


/**
 * Browse for different entities by getting organizational groups and their
aggregated counts + content. Uses browsePathsV2 aspect and replaces our old
browse endpoint.
 */
public interface BrowseV2QueryResolver {

    /**
     * Browse for different entities by getting organizational groups and their
aggregated counts + content. Uses browsePathsV2 aspect and replaces our old
browse endpoint.
     */
    BrowseResultsV2 browseV2(@javax.annotation.Nonnull BrowseV2Input input) throws Exception;

}
