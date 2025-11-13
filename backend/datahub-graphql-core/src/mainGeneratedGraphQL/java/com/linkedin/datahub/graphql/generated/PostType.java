package com.linkedin.datahub.graphql.generated;

/**
 * The type of post
 */
public enum PostType {

    /**
     * Posts on the home page
     */
    HOME_PAGE_ANNOUNCEMENT("HOME_PAGE_ANNOUNCEMENT"),
    /**
     * Posts on an entity page
     */
    ENTITY_ANNOUNCEMENT("ENTITY_ANNOUNCEMENT");

    private final String graphqlName;

    private PostType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
