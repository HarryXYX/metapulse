package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a CorpUser, representing a DataHub platform user, by primary key (urn)
 */
public interface CorpUserQueryResolver {

    /**
     * Fetch a CorpUser, representing a DataHub platform user, by primary key (urn)
     */
    CorpUser corpUser(@javax.annotation.Nonnull String urn) throws Exception;

}
