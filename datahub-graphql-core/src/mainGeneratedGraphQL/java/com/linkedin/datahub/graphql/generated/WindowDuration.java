package com.linkedin.datahub.graphql.generated;

/**
 * The duration of a fixed window of time
 */
public enum WindowDuration {

    /**
     * A one day window
     */
    DAY("DAY"),
    /**
     * A one week window
     */
    WEEK("WEEK"),
    /**
     * A one month window
     */
    MONTH("MONTH"),
    /**
     * A one year window
     */
    YEAR("YEAR");

    private final String graphqlName;

    private WindowDuration(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
