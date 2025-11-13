package com.linkedin.datahub.graphql.generated;

/**
 * The type of ingestion source source
 */
public enum IngestionSourceSourceType {

    /**
     * A system internal source, e.g. for running search indexing operations, feature computation, etc.
     */
    SYSTEM("SYSTEM");

    private final String graphqlName;

    private IngestionSourceSourceType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
