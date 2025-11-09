package com.linkedin.datahub.graphql.generated;

/**
 * The type of failure threshold.
 */
public enum FieldValuesFailThresholdType {

    /**
     * The maximum number of column values (i.e. rows) that are allowed
to fail the defined expectations before the assertion officially fails.
     */
    COUNT("COUNT"),
    /**
     * The maximum percentage of rows that are allowed
to fail the defined column expectations before the assertion officially fails.
     */
    PERCENTAGE("PERCENTAGE");

    private final String graphqlName;

    private FieldValuesFailThresholdType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
