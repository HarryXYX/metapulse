package com.linkedin.datahub.graphql.generated;

/**
 * The duration for which an Access Token is valid.
 */
public enum AccessTokenDuration {

    /**
     * 1 hour
     */
    ONE_HOUR("ONE_HOUR"),
    /**
     * 1 day
     */
    ONE_DAY("ONE_DAY"),
    /**
     * 1 week
     */
    ONE_WEEK("ONE_WEEK"),
    /**
     * 1 month
     */
    ONE_MONTH("ONE_MONTH"),
    /**
     * 3 months
     */
    THREE_MONTHS("THREE_MONTHS"),
    /**
     * 6 months
     */
    SIX_MONTHS("SIX_MONTHS"),
    /**
     * 1 year
     */
    ONE_YEAR("ONE_YEAR"),
    /**
     * No expiry
     */
    NO_EXPIRY("NO_EXPIRY");

    private final String graphqlName;

    private AccessTokenDuration(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
