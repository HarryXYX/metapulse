package com.linkedin.datahub.graphql.generated;

/**
 * A standard operator or condition that constitutes an assertion definition
 */
public enum AssertionStdOperator {

    /**
     * Value being asserted is between min_value and max_value
     */
    BETWEEN("BETWEEN"),
    /**
     * Value being asserted is less than max_value
     */
    LESS_THAN("LESS_THAN"),
    /**
     * Value being asserted is less than or equal to max_value
     */
    LESS_THAN_OR_EQUAL_TO("LESS_THAN_OR_EQUAL_TO"),
    /**
     * Value being asserted is greater than min_value
     */
    GREATER_THAN("GREATER_THAN"),
    /**
     * Value being asserted is greater than or equal to min_value
     */
    GREATER_THAN_OR_EQUAL_TO("GREATER_THAN_OR_EQUAL_TO"),
    /**
     * Value being asserted is equal to value
     */
    EQUAL_TO("EQUAL_TO"),
    /**
     * Value being asserted is not equal to value
     */
    NOT_EQUAL_TO("NOT_EQUAL_TO"),
    /**
     * Value being asserted is null
     */
    NULL("NULL"),
    /**
     * Value being asserted is not null
     */
    NOT_NULL("NOT_NULL"),
    /**
     * Value being asserted contains value
     */
    CONTAIN("CONTAIN"),
    /**
     * Value being asserted ends with value
     */
    END_WITH("END_WITH"),
    /**
     * Value being asserted starts with value
     */
    START_WITH("START_WITH"),
    /**
     * Value being asserted matches the regex value.
     */
    REGEX_MATCH("REGEX_MATCH"),
    /**
     * Value being asserted is one of the array values
     */
    IN("IN"),
    /**
     * Value being asserted is not in one of the array values.
     */
    NOT_IN("NOT_IN"),
    /**
     * Value being asserted is true
     */
    IS_TRUE("IS_TRUE"),
    /**
     * Value being asserted is false
     */
    IS_FALSE("IS_FALSE"),
    /**
     * Other
     */
    _NATIVE_("_NATIVE_");

    private final String graphqlName;

    private AssertionStdOperator(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
