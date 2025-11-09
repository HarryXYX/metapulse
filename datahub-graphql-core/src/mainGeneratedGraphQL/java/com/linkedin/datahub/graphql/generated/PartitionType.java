package com.linkedin.datahub.graphql.generated;

public enum PartitionType {

    FULL_TABLE("FULL_TABLE"),
    QUERY("QUERY"),
    PARTITION("PARTITION");

    private final String graphqlName;

    private PartitionType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
