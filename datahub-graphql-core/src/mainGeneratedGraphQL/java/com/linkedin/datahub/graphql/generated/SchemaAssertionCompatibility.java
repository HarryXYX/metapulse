package com.linkedin.datahub.graphql.generated;

/**
 * Defines the required compatibility level for the schema assertion to pass.
 */
public enum SchemaAssertionCompatibility {

    /**
     * The schema must be exactly the same as the expected schema.
     */
    EXACT_MATCH("EXACT_MATCH"),
    /**
     * The schema must be a superset of the expected schema.
     */
    SUPERSET("SUPERSET"),
    /**
     * The schema must be a subset of the expected schema.
     */
    SUBSET("SUBSET");

    private final String graphqlName;

    private SchemaAssertionCompatibility(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
