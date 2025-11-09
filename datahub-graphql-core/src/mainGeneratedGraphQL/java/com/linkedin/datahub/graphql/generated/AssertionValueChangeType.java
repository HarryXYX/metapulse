package com.linkedin.datahub.graphql.generated;

/**
 * An enum to represent a type of change in an assertion value, metric, or measurement.
 */
public enum AssertionValueChangeType {

    /**
     * A change that is defined in absolute terms.
     */
    ABSOLUTE("ABSOLUTE"),
    /**
     * A change that is defined in relative terms using percentage change
from the original value.
     */
    PERCENTAGE("PERCENTAGE");

    private final String graphqlName;

    private AssertionValueChangeType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
