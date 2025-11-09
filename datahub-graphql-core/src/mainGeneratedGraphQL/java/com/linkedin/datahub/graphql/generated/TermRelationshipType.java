package com.linkedin.datahub.graphql.generated;

/**
 * A type of Metadata Entity sub resource
 */
public enum TermRelationshipType {

    /**
     * When a Term inherits from, or has an 'Is A' relationship with another Term
     */
    isA("isA"),
    /**
     * When a Term contains, or has a 'Has A' relationship with another Term
     */
    hasA("hasA");

    private final String graphqlName;

    private TermRelationshipType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
