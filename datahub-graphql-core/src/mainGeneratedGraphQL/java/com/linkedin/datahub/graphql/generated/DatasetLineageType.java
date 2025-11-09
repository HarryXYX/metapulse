package com.linkedin.datahub.graphql.generated;

/**
 * Deprecated
The type of an edge between two Datasets
 */
public enum DatasetLineageType {

    /**
     * Direct copy without modification
     */
    COPY("COPY"),
    /**
     * Transformed dataset
     */
    TRANSFORMED("TRANSFORMED"),
    /**
     * Represents a view defined on the sources
     */
    VIEW("VIEW");

    private final String graphqlName;

    private DatasetLineageType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
