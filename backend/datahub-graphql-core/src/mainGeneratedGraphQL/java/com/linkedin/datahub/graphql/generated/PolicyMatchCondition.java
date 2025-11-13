package com.linkedin.datahub.graphql.generated;

/**
 * Match condition
 */
public enum PolicyMatchCondition {

    /**
     * Whether the field matches the value
     */
    EQUALS("EQUALS"),
    /**
     * Whether the field value starts with the value
     */
    STARTS_WITH("STARTS_WITH"),
    /**
     * Whether the field does not match the value
     */
    NOT_EQUALS("NOT_EQUALS");

    private final String graphqlName;

    private PolicyMatchCondition(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
