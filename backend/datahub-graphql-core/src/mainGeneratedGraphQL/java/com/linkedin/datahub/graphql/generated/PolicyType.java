package com.linkedin.datahub.graphql.generated;

/**
 * The type of the Access Policy
 */
public enum PolicyType {

    /**
     * An access policy that grants privileges pertaining to Metadata Entities
     */
    METADATA("METADATA"),
    /**
     * An access policy that grants top level administrative privileges pertaining to the DataHub Platform itself
     */
    PLATFORM("PLATFORM");

    private final String graphqlName;

    private PolicyType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
