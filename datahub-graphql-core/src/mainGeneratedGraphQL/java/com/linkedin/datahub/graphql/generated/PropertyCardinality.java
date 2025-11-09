package com.linkedin.datahub.graphql.generated;

/**
 * The cardinality of a Structured Property determining whether one or multiple values
can be applied to the entity from this property.
 */
public enum PropertyCardinality {

    /**
     * Only one value of this property can applied to an entity
     */
    SINGLE("SINGLE"),
    /**
     * Multiple values of this property can applied to an entity
     */
    MULTIPLE("MULTIPLE");

    private final String graphqlName;

    private PropertyCardinality(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
