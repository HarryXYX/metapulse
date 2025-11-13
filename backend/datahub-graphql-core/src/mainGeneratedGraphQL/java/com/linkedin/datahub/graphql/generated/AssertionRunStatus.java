package com.linkedin.datahub.graphql.generated;

/**
 * The state of an assertion run, as defined within an Assertion Run Event.
 */
public enum AssertionRunStatus {

    /**
     * An assertion run has completed.
     */
    COMPLETE("COMPLETE");

    private final String graphqlName;

    private AssertionRunStatus(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
