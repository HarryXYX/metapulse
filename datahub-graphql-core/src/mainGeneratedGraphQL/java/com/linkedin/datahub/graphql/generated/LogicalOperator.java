package com.linkedin.datahub.graphql.generated;

/**
 * A Logical Operator, AND or OR.
 */
public enum LogicalOperator {

    /**
     * An AND operator.
     */
    AND("AND"),
    /**
     * An OR operator.
     */
    OR("OR");

    private final String graphqlName;

    private LogicalOperator(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
