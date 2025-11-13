package com.linkedin.datahub.graphql.generated;

/**
 * A time range used in fetching Usage statistics
 */
public enum TimeRange {

    /**
     * Last day
     */
    DAY("DAY"),
    /**
     * Last week
     */
    WEEK("WEEK"),
    /**
     * Last month
     */
    MONTH("MONTH"),
    /**
     * Last quarter
     */
    QUARTER("QUARTER"),
    /**
     * Last half year
     */
    HALF_YEAR("HALF_YEAR"),
    /**
     * Last year
     */
    YEAR("YEAR"),
    /**
     * All time
     */
    ALL("ALL");

    private final String graphqlName;

    private TimeRange(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
