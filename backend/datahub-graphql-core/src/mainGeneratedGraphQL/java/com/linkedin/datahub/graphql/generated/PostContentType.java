package com.linkedin.datahub.graphql.generated;

/**
 * The type of post
 */
public enum PostContentType {

    /**
     * Text content
     */
    TEXT("TEXT"),
    /**
     * Link content
     */
    LINK("LINK");

    private final String graphqlName;

    private PostContentType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
