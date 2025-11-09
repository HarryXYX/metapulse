package com.linkedin.datahub.graphql.generated;

/**
 * The type of the Action
 */
public enum AssertionActionType {

    /**
     * Raise an incident.
     */
    RAISE_INCIDENT("RAISE_INCIDENT"),
    /**
     * Resolve open incidents related to the assertion.
     */
    RESOLVE_INCIDENT("RESOLVE_INCIDENT");

    private final String graphqlName;

    private AssertionActionType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
