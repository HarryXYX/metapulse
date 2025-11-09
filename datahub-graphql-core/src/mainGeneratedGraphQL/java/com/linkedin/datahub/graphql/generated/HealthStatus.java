package com.linkedin.datahub.graphql.generated;

public enum HealthStatus {

    /**
     * The Asset is in a healthy state
     */
    PASS("PASS"),
    /**
     * The Asset is in a warning state
     */
    WARN("WARN"),
    /**
     * The Asset is in a failing (unhealthy) state
     */
    FAIL("FAIL");

    private final String graphqlName;

    private HealthStatus(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
