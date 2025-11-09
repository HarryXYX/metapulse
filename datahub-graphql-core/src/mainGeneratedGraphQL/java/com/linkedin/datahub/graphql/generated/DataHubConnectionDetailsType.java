package com.linkedin.datahub.graphql.generated;

/**
 * The type of a DataHub connection
 */
public enum DataHubConnectionDetailsType {

    /**
     * A json-encoded set of connection details.
     */
    JSON("JSON");

    private final String graphqlName;

    private DataHubConnectionDetailsType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
