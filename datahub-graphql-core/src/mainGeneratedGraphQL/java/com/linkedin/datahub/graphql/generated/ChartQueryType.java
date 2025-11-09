package com.linkedin.datahub.graphql.generated;

/**
 * The type of the Chart Query
 */
public enum ChartQueryType {

    /**
     * Standard ANSI SQL
     */
    SQL("SQL"),
    /**
     * LookML
     */
    LOOKML("LOOKML");

    private final String graphqlName;

    private ChartQueryType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
