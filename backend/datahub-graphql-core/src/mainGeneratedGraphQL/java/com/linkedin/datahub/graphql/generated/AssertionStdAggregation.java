package com.linkedin.datahub.graphql.generated;

/**
 * An "aggregation" function that can be applied to column values of a Dataset to create the input to an Assertion Operator.
 */
public enum AssertionStdAggregation {

    /**
     * Assertion is applied on individual column value
     */
    IDENTITY("IDENTITY"),
    /**
     * Assertion is applied on column mean
     */
    MEAN("MEAN"),
    /**
     * Assertion is applied on column median
     */
    MEDIAN("MEDIAN"),
    /**
     * Assertion is applied on number of distinct values in column
     */
    UNIQUE_COUNT("UNIQUE_COUNT"),
    /**
     * Assertion is applied on proportion of distinct values in column
     */
    UNIQUE_PROPOTION("UNIQUE_PROPOTION"),
    /**
     * Assertion is applied on number of null values in column
     */
    NULL_COUNT("NULL_COUNT"),
    /**
     * Assertion is applied on proportion of null values in column
     */
    NULL_PROPORTION("NULL_PROPORTION"),
    /**
     * Assertion is applied on column std deviation
     */
    STDDEV("STDDEV"),
    /**
     * Assertion is applied on column min
     */
    MIN("MIN"),
    /**
     * Assertion is applied on column std deviation
     */
    MAX("MAX"),
    /**
     * Assertion is applied on column sum
     */
    SUM("SUM"),
    /**
     * Assertion is applied on all columns
     */
    COLUMNS("COLUMNS"),
    /**
     * Assertion is applied on number of columns
     */
    COLUMN_COUNT("COLUMN_COUNT"),
    /**
     * Assertion is applied on number of rows
     */
    ROW_COUNT("ROW_COUNT"),
    /**
     * Other
     */
    _NATIVE_("_NATIVE_");

    private final String graphqlName;

    private AssertionStdAggregation(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
