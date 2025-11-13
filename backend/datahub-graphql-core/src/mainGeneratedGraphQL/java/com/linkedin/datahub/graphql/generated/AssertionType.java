package com.linkedin.datahub.graphql.generated;

/**
 * The top-level assertion type.
 */
public enum AssertionType {

    /**
     * A single-dataset assertion.
     */
    DATASET("DATASET"),
    /**
     * An assertion which indicates when a particular operation should occur to an asset.
     */
    FRESHNESS("FRESHNESS"),
    /**
     * An assertion which indicates how much data should be available for a particular asset.
     */
    VOLUME("VOLUME"),
    /**
     * A raw SQL-statement based assertion.
     */
    SQL("SQL"),
    /**
     * A structured assertion targeting a specific column or field of the Dataset.
     */
    FIELD("FIELD"),
    /**
     * A schema or structural assertion.
     */
    DATA_SCHEMA("DATA_SCHEMA"),
    /**
     * A custom assertion.
     */
    CUSTOM("CUSTOM");

    private final String graphqlName;

    private AssertionType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
