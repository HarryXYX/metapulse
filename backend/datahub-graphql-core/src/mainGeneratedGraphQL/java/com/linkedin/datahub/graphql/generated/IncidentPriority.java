package com.linkedin.datahub.graphql.generated;

/**
 * The priority of the incident
 */
public enum IncidentPriority {

    /**
     * A low priority incident (P3)
     */
    LOW("LOW"),
    /**
     * A medium priority incident (P2)
     */
    MEDIUM("MEDIUM"),
    /**
     * A high priority incident (P1)
     */
    HIGH("HIGH"),
    /**
     * A critical priority incident (P0)
     */
    CRITICAL("CRITICAL");

    private final String graphqlName;

    private IncidentPriority(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
