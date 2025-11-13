package com.linkedin.datahub.graphql.generated;

/**
 * The 'standard' transformer type. Note that not all source systems will support all operators.
 */
public enum IncrementingSegmentFieldTransformerType {

    /**
     * Rounds a timestamp (in seconds) down to the start of the month.
     */
    TIMESTAMP_MS_TO_MINUTE("TIMESTAMP_MS_TO_MINUTE"),
    /**
     * Rounds a timestamp (in milliseconds) down to the nearest hour.
     */
    TIMESTAMP_MS_TO_HOUR("TIMESTAMP_MS_TO_HOUR"),
    /**
     * Rounds a timestamp (in milliseconds) down to the start of the day.
     */
    TIMESTAMP_MS_TO_DATE("TIMESTAMP_MS_TO_DATE"),
    /**
     * Rounds a timestamp (in milliseconds) down to the start of the month
     */
    TIMESTAMP_MS_TO_MONTH("TIMESTAMP_MS_TO_MONTH"),
    /**
     * Rounds a timestamp (in milliseconds) down to the start of the year
     */
    TIMESTAMP_MS_TO_YEAR("TIMESTAMP_MS_TO_YEAR"),
    /**
     * Rounds a numeric value down to the nearest integer.
     */
    FLOOR("FLOOR"),
    /**
     * Rounds a numeric value up to the nearest integer.
     */
    CEILING("CEILING"),
    /**
     * A backdoor to provide a native operator type specific to a given source system like
Snowflake, Redshift, BQ, etc.
     */
    NATIVE("NATIVE");

    private final String graphqlName;

    private IncrementingSegmentFieldTransformerType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
