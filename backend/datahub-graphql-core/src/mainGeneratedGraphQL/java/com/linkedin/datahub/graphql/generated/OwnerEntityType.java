package com.linkedin.datahub.graphql.generated;

/**
 * Entities that are able to own other entities
 */
public enum OwnerEntityType {

    /**
     * A corp user owner
     */
    CORP_USER("CORP_USER"),
    /**
     * A corp group owner
     */
    CORP_GROUP("CORP_GROUP");

    private final String graphqlName;

    private OwnerEntityType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
