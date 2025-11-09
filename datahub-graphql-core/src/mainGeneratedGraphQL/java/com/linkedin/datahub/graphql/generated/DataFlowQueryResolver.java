package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a Data Flow (or Data Pipeline) by primary key (urn)
 */
public interface DataFlowQueryResolver {

    /**
     * Fetch a Data Flow (or Data Pipeline) by primary key (urn)
     */
    DataFlow dataFlow(@javax.annotation.Nonnull String urn) throws Exception;

}
