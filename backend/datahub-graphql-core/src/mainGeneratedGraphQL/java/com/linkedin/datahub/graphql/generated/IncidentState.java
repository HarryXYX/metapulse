package com.linkedin.datahub.graphql.generated;

/**
 * The state of an incident.
 */
public enum IncidentState {

    /**
     * The incident is ongoing, or active.
     */
    ACTIVE("ACTIVE"),
    /**
     * The incident is resolved.
     */
    RESOLVED("RESOLVED");

    private final String graphqlName;

    private IncidentState(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
