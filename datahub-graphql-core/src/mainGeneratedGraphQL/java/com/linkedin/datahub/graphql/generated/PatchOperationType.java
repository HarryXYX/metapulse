package com.linkedin.datahub.graphql.generated;

public enum PatchOperationType {

    ADD("ADD"),
    REMOVE("REMOVE"),
    REPLACE("REPLACE"),
    MOVE("MOVE"),
    COPY("COPY"),
    TEST("TEST");

    private final String graphqlName;

    private PatchOperationType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
