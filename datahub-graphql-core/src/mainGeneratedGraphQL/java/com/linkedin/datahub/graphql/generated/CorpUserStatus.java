package com.linkedin.datahub.graphql.generated;

/**
 * The state of a CorpUser
 */
public enum CorpUserStatus {

    /**
     * A User that has been provisioned and logged in
     */
    ACTIVE("ACTIVE"),
    /**
     * A user that has been suspended
     */
    SUSPENDED("SUSPENDED");

    private final String graphqlName;

    private CorpUserStatus(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
