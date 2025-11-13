package com.linkedin.datahub.graphql.generated;

/**
 * The source of the query
 */
public enum QuerySource {

    /**
     * The query was provided manually, e.g. from the UI.
     */
    MANUAL("MANUAL"),
    /**
     * The query was extracted by the system, e.g. from a dashboard.
     */
    SYSTEM("SYSTEM");

    private final String graphqlName;

    private QuerySource(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
