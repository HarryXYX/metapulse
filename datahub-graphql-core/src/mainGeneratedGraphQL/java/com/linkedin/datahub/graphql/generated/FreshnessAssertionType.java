package com.linkedin.datahub.graphql.generated;

/**
 * The type of an Freshness assertion
 */
public enum FreshnessAssertionType {

    /**
     * An assertion defined against a Dataset Change Operation - insert, update, delete, etc
     */
    DATASET_CHANGE("DATASET_CHANGE"),
    /**
     * An assertion defined against a Data Job run
     */
    DATA_JOB_RUN("DATA_JOB_RUN");

    private final String graphqlName;

    private FreshnessAssertionType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
