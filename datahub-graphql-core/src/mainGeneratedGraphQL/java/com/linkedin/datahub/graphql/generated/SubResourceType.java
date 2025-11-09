package com.linkedin.datahub.graphql.generated;

/**
 * A type of Metadata Entity sub resource
 */
public enum SubResourceType {

    /**
     * A Dataset field or column
     */
    DATASET_FIELD("DATASET_FIELD");

    private final String graphqlName;

    private SubResourceType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
