package com.linkedin.datahub.graphql.generated;


/**
 * Fetches the metadata of an access token.
This is useful to debug when you have a raw token but don't know the actor.
 */
public interface GetAccessTokenMetadataQueryResolver {

    /**
     * Fetches the metadata of an access token.
This is useful to debug when you have a raw token but don't know the actor.
     */
    @javax.annotation.Nonnull
    AccessTokenMetadata getAccessTokenMetadata(@javax.annotation.Nonnull String token) throws Exception;

}
