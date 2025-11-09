package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a Data Job (or Data Task) by primary key (urn)
 */
public interface DataJobQueryResolver {

    /**
     * Fetch a Data Job (or Data Task) by primary key (urn)
     */
    DataJob dataJob(@javax.annotation.Nonnull String urn) throws Exception;

}
