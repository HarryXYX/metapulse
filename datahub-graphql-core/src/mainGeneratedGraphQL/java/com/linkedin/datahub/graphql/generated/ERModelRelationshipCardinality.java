package com.linkedin.datahub.graphql.generated;

/**
 * The Cardinality of the ERModelRelationship
 */
public enum ERModelRelationshipCardinality {

    /**
     * One to One
     */
    ONE_ONE("ONE_ONE"),
    /**
     * One to Many
     */
    ONE_N("ONE_N"),
    /**
     * Many to One
     */
    N_ONE("N_ONE"),
    /**
     * Many to Many
     */
    N_N("N_N");

    private final String graphqlName;

    private ERModelRelationshipCardinality(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
