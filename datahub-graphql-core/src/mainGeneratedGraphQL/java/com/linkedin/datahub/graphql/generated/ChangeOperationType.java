package com.linkedin.datahub.graphql.generated;

/**
 * Enum of types of changes
 */
public enum ChangeOperationType {

    /**
     * When an element is added
     */
    ADD("ADD"),
    /**
     * When an element is modified
     */
    MODIFY("MODIFY"),
    /**
     * When an element is removed
     */
    REMOVE("REMOVE");

    private final String graphqlName;

    private ChangeOperationType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
