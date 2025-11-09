package com.linkedin.datahub.graphql.generated;

/**
 * The type of a Field assertion
 */
public enum FieldAssertionType {

    /**
     * An assertion used to validate the values contained with a field / column given a set of rows.
     */
    FIELD_VALUES("FIELD_VALUES"),
    /**
     * An assertion used to validate the value of a common field / column metric (e.g. aggregation)
such as null count + percentage, min, max, median, and more.
     */
    FIELD_METRIC("FIELD_METRIC");

    private final String graphqlName;

    private FieldAssertionType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
