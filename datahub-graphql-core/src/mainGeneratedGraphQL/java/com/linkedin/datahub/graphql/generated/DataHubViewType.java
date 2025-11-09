package com.linkedin.datahub.graphql.generated;

/**
 * The type of a DataHub View
 */
public enum DataHubViewType {

    /**
     * A personal view - e.g. saved filters
     */
    PERSONAL("PERSONAL"),
    /**
     * A global view, e.g. role view
     */
    GLOBAL("GLOBAL");

    private final String graphqlName;

    private DataHubViewType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
