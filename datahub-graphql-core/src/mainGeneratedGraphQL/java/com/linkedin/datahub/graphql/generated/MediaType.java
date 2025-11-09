package com.linkedin.datahub.graphql.generated;

/**
 * The type of media
 */
public enum MediaType {

    /**
     * An image
     */
    IMAGE("IMAGE");

    private final String graphqlName;

    private MediaType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
