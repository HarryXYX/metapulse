package com.linkedin.datahub.graphql.generated;

/**
 * The type of the SQL assertion being monitored.
 */
public enum SqlAssertionType {

    /**
     * A SQL Metric Assertion, e.g. one based on a numeric value returned by an arbitrary SQL query.
     */
    METRIC("METRIC"),
    /**
     * A SQL assertion that is evaluated against the CHANGE in a metric assertion over time.
     */
    METRIC_CHANGE("METRIC_CHANGE");

    private final String graphqlName;

    private SqlAssertionType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
