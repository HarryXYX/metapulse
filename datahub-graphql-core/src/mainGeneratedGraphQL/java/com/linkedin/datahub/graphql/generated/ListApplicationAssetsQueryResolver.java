package com.linkedin.datahub.graphql.generated;


/**
 * List Application assets for a given urn
 */
public interface ListApplicationAssetsQueryResolver {

    /**
     * List Application assets for a given urn
     */
    SearchResults listApplicationAssets(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull SearchAcrossEntitiesInput input) throws Exception;

}
