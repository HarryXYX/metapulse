package com.linkedin.datahub.graphql.generated;

/**
 * The type of the health status
 */
public enum HealthStatusType {

    /**
     * Assertions status
     */
    ASSERTIONS("ASSERTIONS"),
    /**
     * Incidents status
     */
    INCIDENTS("INCIDENTS");

    private final String graphqlName;

    private HealthStatusType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
