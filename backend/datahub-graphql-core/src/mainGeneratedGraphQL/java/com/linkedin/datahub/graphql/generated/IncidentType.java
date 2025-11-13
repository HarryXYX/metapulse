package com.linkedin.datahub.graphql.generated;

/**
 * A specific type of incident
 */
public enum IncidentType {

    /**
     * A Freshness Assertion has failed, triggering the incident.
Raised on assets where assertions are configured to generate incidents.
     */
    FRESHNESS("FRESHNESS"),
    /**
     * A Volume Assertion has failed, triggering the incident.
Raised on assets where assertions are configured to generate incidents.
     */
    VOLUME("VOLUME"),
    /**
     * A Field Assertion has failed, triggering the incident.
Raised on assets where assertions are configured to generate incidents.
     */
    FIELD("FIELD"),
    /**
     * A SQL Assertion has failed, triggering the incident.
Raised on assets where assertions are configured to generate incidents.
     */
    SQL("SQL"),
    /**
     * A Schema has failed, triggering the incident.
Raised on assets where assertions are configured to generate incidents.
     */
    DATA_SCHEMA("DATA_SCHEMA"),
    /**
     * An operational incident, e.g. failure to materialize a dataset, or failure to execute a task / pipeline.
     */
    OPERATIONAL("OPERATIONAL"),
    /**
     * A custom type of incident
     */
    CUSTOM("CUSTOM");

    private final String graphqlName;

    private IncidentType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
