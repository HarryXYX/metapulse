package com.linkedin.datahub.graphql.generated;

/**
 * Enum to define the source/reporter type for an Operation.
 */
public enum OperationSourceType {

    /**
     * A data process reported the operation.
     */
    DATA_PROCESS("DATA_PROCESS"),
    /**
     * A data platform reported the operation.
     */
    DATA_PLATFORM("DATA_PLATFORM");

    private final String graphqlName;

    private OperationSourceType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
