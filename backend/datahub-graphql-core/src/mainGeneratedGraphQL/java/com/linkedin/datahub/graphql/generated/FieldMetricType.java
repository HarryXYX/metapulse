package com.linkedin.datahub.graphql.generated;

/**
 * A standard metric that can be derived from the set of values
for a specific field / column of a dataset / table.
 */
public enum FieldMetricType {

    /**
     * The number of unique values found in the column value set
     */
    UNIQUE_COUNT("UNIQUE_COUNT"),
    /**
     * The percentage of unique values to total rows for the dataset
     */
    UNIQUE_PERCENTAGE("UNIQUE_PERCENTAGE"),
    /**
     * The number of null values found in the column value set
     */
    NULL_COUNT("NULL_COUNT"),
    /**
     * The percentage of null values to total rows for the dataset
     */
    NULL_PERCENTAGE("NULL_PERCENTAGE"),
    /**
     * The minimum value in the column set (applies to numeric columns)
     */
    MIN("MIN"),
    /**
     * The maximum value in the column set (applies to numeric columns)
     */
    MAX("MAX"),
    /**
     * The mean length found in the column set (applies to numeric columns)
     */
    MEAN("MEAN"),
    /**
     * The median length found in the column set (applies to numeric columns)
     */
    MEDIAN("MEDIAN"),
    /**
     * The stddev length found in the column set (applies to numeric columns)
     */
    STDDEV("STDDEV"),
    /**
     * The number of negative values found in the value set (applies to numeric columns)
     */
    NEGATIVE_COUNT("NEGATIVE_COUNT"),
    /**
     * The percentage of negative values to total rows for the dataset (applies to numeric columns)
     */
    NEGATIVE_PERCENTAGE("NEGATIVE_PERCENTAGE"),
    /**
     * The number of zero values found in the value set (applies to numeric columns)
     */
    ZERO_COUNT("ZERO_COUNT"),
    /**
     * The percentage of zero values to total rows for the dataset (applies to numeric columns)
     */
    ZERO_PERCENTAGE("ZERO_PERCENTAGE"),
    /**
     * The minimum length found in the column set (applies to string columns)
     */
    MIN_LENGTH("MIN_LENGTH"),
    /**
     * The maximum length found in the column set (applies to string columns)
     */
    MAX_LENGTH("MAX_LENGTH"),
    /**
     * The number of empty string values found in the value set (applies to string columns).
Note: This is a completely different metric different from NULL_COUNT!
     */
    EMPTY_COUNT("EMPTY_COUNT"),
    /**
     * The percentage of empty string values to total rows for the dataset (applies to string columns).
Note: This is a completely different metric different from NULL_PERCENTAGE!
     */
    EMPTY_PERCENTAGE("EMPTY_PERCENTAGE");

    private final String graphqlName;

    private FieldMetricType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
