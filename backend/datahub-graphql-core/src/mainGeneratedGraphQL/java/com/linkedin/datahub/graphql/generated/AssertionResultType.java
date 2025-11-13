package com.linkedin.datahub.graphql.generated;

/**
 * The result type of an assertion, success or failure.
 */
public enum AssertionResultType {

    /**
     * The assertion has not yet been fully evaluated.
     */
    INIT("INIT"),
    /**
     * The assertion succeeded.
     */
    SUCCESS("SUCCESS"),
    /**
     * The assertion failed.
     */
    FAILURE("FAILURE"),
    /**
     * The assertion errored.
     */
    ERROR("ERROR");

    private final String graphqlName;

    private AssertionResultType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
