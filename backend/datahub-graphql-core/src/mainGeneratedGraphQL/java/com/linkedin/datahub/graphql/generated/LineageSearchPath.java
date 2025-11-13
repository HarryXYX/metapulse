package com.linkedin.datahub.graphql.generated;

/**
 * The path taken when doing search across lineage
 */
public enum LineageSearchPath {

    /**
     * Designates the tortoise lineage code path
     */
    TORTOISE("TORTOISE"),
    /**
     * Designates the lightning lineage code path
     */
    LIGHTNING("LIGHTNING");

    private final String graphqlName;

    private LineageSearchPath(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
