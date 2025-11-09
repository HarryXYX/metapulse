package com.linkedin.datahub.graphql.generated;

/**
 * Enum to define where an entity originated from.
 */
public enum OriginType {

    /**
     * The entity is native to DataHub.
     */
    NATIVE("NATIVE"),
    /**
     * The entity is external to DataHub.
     */
    EXTERNAL("EXTERNAL"),
    /**
     * The entity is of unknown origin.
     */
    UNKNOWN("UNKNOWN");

    private final String graphqlName;

    private OriginType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
