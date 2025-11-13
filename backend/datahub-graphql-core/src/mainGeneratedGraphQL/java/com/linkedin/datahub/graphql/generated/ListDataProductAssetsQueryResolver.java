package com.linkedin.datahub.graphql.generated;


/**
 * List Data Product assets for a given urn
 */
public interface ListDataProductAssetsQueryResolver {

    /**
     * List Data Product assets for a given urn
     */
    SearchResults listDataProductAssets(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull SearchAcrossEntitiesInput input) throws Exception;

}
