package com.linkedin.datahub.graphql.generated;

/**
 * Type of partition
 */
public enum DatasetFilterType {

    /**
     * Use a SQL string to apply the filter
     */
    SQL("SQL");

    private final String graphqlName;

    private DatasetFilterType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
