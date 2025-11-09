package com.linkedin.datahub.graphql.generated;

/**
 * The type of the Field Transform
 */
public enum FieldTransformType {

    /**
     * Obtain the length of a string field / column (applicable to string types)
     */
    LENGTH("LENGTH");

    private final String graphqlName;

    private FieldTransformType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
