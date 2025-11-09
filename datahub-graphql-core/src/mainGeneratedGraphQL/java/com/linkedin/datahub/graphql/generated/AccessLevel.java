package com.linkedin.datahub.graphql.generated;

/**
 * The access level for a Metadata Entity, either public or private
 */
public enum AccessLevel {

    /**
     * Publicly available
     */
    PUBLIC("PUBLIC"),
    /**
     * Restricted to a subset of viewers
     */
    PRIVATE("PRIVATE");

    private final String graphqlName;

    private AccessLevel(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
