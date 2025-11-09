package com.linkedin.datahub.graphql.generated;

/**
 * The type of an Freshness assertion
 */
public enum FreshnessAssertionScheduleType {

    /**
     * An schedule based on a CRON schedule representing the expected event times.
     */
    CRON("CRON"),
    /**
     * A scheduled based on a recurring fixed schedule which is used to compute the expected operation window. E.g. "every 24 hours".
     */
    FIXED_INTERVAL("FIXED_INTERVAL"),
    /**
     * A schedule computed based on when the assertion was last evaluated, to the current moment in time.
     */
    SINCE_THE_LAST_CHECK("SINCE_THE_LAST_CHECK");

    private final String graphqlName;

    private FreshnessAssertionScheduleType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
