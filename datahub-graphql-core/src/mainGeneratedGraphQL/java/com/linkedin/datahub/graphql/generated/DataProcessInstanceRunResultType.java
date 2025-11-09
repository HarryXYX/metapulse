package com.linkedin.datahub.graphql.generated;

/**
 * The result of the data process run
 */
public enum DataProcessInstanceRunResultType {

    /**
     * The run finished successfully
     */
    SUCCESS("SUCCESS"),
    /**
     * The run finished in failure
     */
    FAILURE("FAILURE"),
    /**
     * The run was skipped
     */
    SKIPPED("SKIPPED"),
    /**
     * The run failed and is up for retry
     */
    UP_FOR_RETRY("UP_FOR_RETRY");

    private final String graphqlName;

    private DataProcessInstanceRunResultType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
