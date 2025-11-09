package com.linkedin.datahub.graphql.generated;

/**
 * The source type of an incident, implying how it was created.
 */
public enum IncidentSourceType {

    /**
     * The incident was created manually, from either the API or the UI.
     */
    MANUAL("MANUAL"),
    /**
     * An assertion has failed, triggering the incident.
     */
    ASSERTION_FAILURE("ASSERTION_FAILURE");

    private final String graphqlName;

    private IncidentSourceType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
