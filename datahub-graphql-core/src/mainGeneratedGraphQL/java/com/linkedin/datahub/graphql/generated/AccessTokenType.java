package com.linkedin.datahub.graphql.generated;

/**
 * A type of DataHub Access Token.
 */
public enum AccessTokenType {

    /**
     * Generates a personal access token
     */
    PERSONAL("PERSONAL");

    private final String graphqlName;

    private AccessTokenType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
