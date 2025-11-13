package com.linkedin.datahub.graphql.generated;

/**
 * A type of volume (row count) assertion
 */
public enum VolumeAssertionType {

    /**
     * A volume assertion that is evaluated against the total row count of a dataset.
     */
    ROW_COUNT_TOTAL("ROW_COUNT_TOTAL"),
    /**
     * A volume assertion that is evaluated against an incremental row count of a dataset,
or a row count change.
     */
    ROW_COUNT_CHANGE("ROW_COUNT_CHANGE"),
    /**
     * A volume assertion that checks the latest "segment" in a table based on an incrementing
column to check whether it's row count falls into a particular range.
This can be used to monitor the row count of an incrementing date-partition column segment.
     */
    INCREMENTING_SEGMENT_ROW_COUNT_TOTAL("INCREMENTING_SEGMENT_ROW_COUNT_TOTAL"),
    /**
     * A volume assertion that compares the row counts in neighboring "segments" or "partitions"
of an incrementing column. This can be used to track changes between subsequent date partition
in a table, for example.
     */
    INCREMENTING_SEGMENT_ROW_COUNT_CHANGE("INCREMENTING_SEGMENT_ROW_COUNT_CHANGE");

    private final String graphqlName;

    private VolumeAssertionType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
