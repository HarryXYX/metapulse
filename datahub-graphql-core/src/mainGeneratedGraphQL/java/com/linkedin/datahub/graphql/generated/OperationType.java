package com.linkedin.datahub.graphql.generated;

/**
 * Enum to define the operation type when an entity changes.
 */
public enum OperationType {

    /**
     * When data is inserted.
     */
    INSERT("INSERT"),
    /**
     * When data is updated.
     */
    UPDATE("UPDATE"),
    /**
     * When data is deleted.
     */
    DELETE("DELETE"),
    /**
     * When table is created.
     */
    CREATE("CREATE"),
    /**
     * When table is altered
     */
    ALTER("ALTER"),
    /**
     * When table is dropped
     */
    DROP("DROP"),
    /**
     * Unknown operation
     */
    UNKNOWN("UNKNOWN"),
    /**
     * Custom
     */
    CUSTOM("CUSTOM");

    private final String graphqlName;

    private OperationType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
