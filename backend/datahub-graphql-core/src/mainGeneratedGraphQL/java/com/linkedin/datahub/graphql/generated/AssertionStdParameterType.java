package com.linkedin.datahub.graphql.generated;

/**
 * The type of an AssertionStdParameter
 */
public enum AssertionStdParameterType {

    /**
     * A string value
     */
    STRING("STRING"),
    /**
     * A numeric value
     */
    NUMBER("NUMBER"),
    /**
     * A list of values. When used, the value should be formatted as a serialized JSON array.
     */
    LIST("LIST"),
    /**
     * A set of values. When used, the value should be formatted as a serialized JSON array.
     */
    SET("SET"),
    /**
     * A value of unknown type
     */
    UNKNOWN("UNKNOWN");

    private final String graphqlName;

    private AssertionStdParameterType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
