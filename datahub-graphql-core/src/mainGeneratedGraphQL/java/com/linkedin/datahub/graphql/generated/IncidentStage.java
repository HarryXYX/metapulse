package com.linkedin.datahub.graphql.generated;

/**
 * The lifecycle stage of the incident.
 */
public enum IncidentStage {

    /**
     * The impact and priority of the incident is being actively assessed.
     */
    TRIAGE("TRIAGE"),
    /**
     * The incident root cause is being investigated.
     */
    INVESTIGATION("INVESTIGATION"),
    /**
     * The incident is in the remediation stage.
     */
    WORK_IN_PROGRESS("WORK_IN_PROGRESS"),
    /**
     * The incident is in the resolved as completed stage.
     */
    FIXED("FIXED"),
    /**
     * The incident is in the resolved with no action required state, e.g., the
incident was a false positive, or was expected.
     */
    NO_ACTION_REQUIRED("NO_ACTION_REQUIRED");

    private final String graphqlName;

    private IncidentStage(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
