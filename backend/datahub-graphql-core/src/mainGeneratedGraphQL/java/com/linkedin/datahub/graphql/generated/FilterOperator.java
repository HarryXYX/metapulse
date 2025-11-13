package com.linkedin.datahub.graphql.generated;

public enum FilterOperator {

    /**
     * Represent the relation: String field contains value, e.g. name contains Profile
     */
    CONTAIN("CONTAIN"),
    /**
     * Represent the relation: field = value, e.g. platform = hdfs
     */
    EQUAL("EQUAL"),
    /**
     * Represent the relation: field = value (case-insensitive), e.g. platform = HDFS
     */
    IEQUAL("IEQUAL"),
    /**
     * * Represent the relation: String field is one of the array values to, e.g. name in ["Profile", "Event"]
     */
    IN("IN"),
    /**
     * Represents the relation: The field exists. If the field is an array, the field is either not present or empty.
     */
    EXISTS("EXISTS"),
    /**
     * Represent the relation greater than, e.g. ownerCount > 5
     */
    GREATER_THAN("GREATER_THAN"),
    /**
     * Represent the relation greater than or equal to, e.g. ownerCount >= 5
     */
    GREATER_THAN_OR_EQUAL_TO("GREATER_THAN_OR_EQUAL_TO"),
    /**
     * Represent the relation less than, e.g. ownerCount < 3
     */
    LESS_THAN("LESS_THAN"),
    /**
     * Represent the relation less than or equal to, e.g. ownerCount <= 3
     */
    LESS_THAN_OR_EQUAL_TO("LESS_THAN_OR_EQUAL_TO"),
    /**
     * Represent the relation: String field starts with value, e.g. name starts with PageView
     */
    START_WITH("START_WITH"),
    /**
     * Represent the relation: String field ends with value, e.g. name ends with Event
     */
    END_WITH("END_WITH"),
    /**
     * Represent the relation: URN field any nested children in addition to the given URN
     */
    DESCENDANTS_INCL("DESCENDANTS_INCL"),
    /**
     * Represent the relation: URN field matches any nested parent in addition to the given URN
     */
    ANCESTORS_INCL("ANCESTORS_INCL"),
    /**
     * Represent the relation: URN field matches any nested child or parent in addition to the given URN
     */
    RELATED_INCL("RELATED_INCL");

    private final String graphqlName;

    private FilterOperator(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
