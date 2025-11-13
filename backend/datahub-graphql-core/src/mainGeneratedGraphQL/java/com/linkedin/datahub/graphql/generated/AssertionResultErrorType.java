package com.linkedin.datahub.graphql.generated;

/**
 * The type of error encountered when evaluating an AssertionResult
 */
public enum AssertionResultErrorType {

    /**
     * Source is unreachable
     */
    SOURCE_CONNECTION_ERROR("SOURCE_CONNECTION_ERROR"),
    /**
     * Source query failed to execute
     */
    SOURCE_QUERY_FAILED("SOURCE_QUERY_FAILED"),
    /**
     * Invalid parameters were detected
     */
    INVALID_PARAMETERS("INVALID_PARAMETERS"),
    /**
     * Insufficient data to evaluate assertion
     */
    INSUFFICIENT_DATA("INSUFFICIENT_DATA"),
    /**
     * Event type not supported by the specified source
     */
    INVALID_SOURCE_TYPE("INVALID_SOURCE_TYPE"),
    /**
     * Platform not supported
     */
    UNSUPPORTED_PLATFORM("UNSUPPORTED_PLATFORM"),
    /**
     * Error while executing a custom SQL assertion
     */
    CUSTOM_SQL_ERROR("CUSTOM_SQL_ERROR"),
    /**
     * Error while executing a field assertion
     */
    FIELD_ASSERTION_ERROR("FIELD_ASSERTION_ERROR"),
    /**
     * Unknown error
     */
    UNKNOWN_ERROR("UNKNOWN_ERROR");

    private final String graphqlName;

    private AssertionResultErrorType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
