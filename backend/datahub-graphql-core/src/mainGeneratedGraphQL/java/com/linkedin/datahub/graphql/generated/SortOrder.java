package com.linkedin.datahub.graphql.generated;

/**
 * Order for sorting
 */
public enum SortOrder {

    ASCENDING("ASCENDING"),
    DESCENDING("DESCENDING");

    private final String graphqlName;

    private SortOrder(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
