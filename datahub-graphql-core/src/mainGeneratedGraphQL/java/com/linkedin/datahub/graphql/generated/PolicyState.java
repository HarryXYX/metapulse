package com.linkedin.datahub.graphql.generated;

/**
 * The state of an Access Policy
 */
public enum PolicyState {

    /**
     * A Policy that has not been officially created, but in progress
Currently unused
     */
    DRAFT("DRAFT"),
    /**
     * A Policy that is active and being enforced
     */
    ACTIVE("ACTIVE"),
    /**
     * A Policy that is not active or being enforced
     */
    INACTIVE("INACTIVE");

    private final String graphqlName;

    private PolicyState(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
