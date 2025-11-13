package com.linkedin.datahub.graphql.generated;

/**
 * The state of the data contract
 */
public enum DataContractState {

    /**
     * The data contract is active.
     */
    ACTIVE("ACTIVE"),
    /**
     * The data contract is pending. Note that this symbol is currently experimental.
     */
    PENDING("PENDING");

    private final String graphqlName;

    private DataContractState(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
