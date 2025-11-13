package com.linkedin.datahub.graphql.generated;

/**
 * The result type of a test that has been run
 */
public enum TestResultType {

    /**
     * The test succeeded.
     */
    SUCCESS("SUCCESS"),
    /**
     * The test failed.
     */
    FAILURE("FAILURE");

    private final String graphqlName;

    private TestResultType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
