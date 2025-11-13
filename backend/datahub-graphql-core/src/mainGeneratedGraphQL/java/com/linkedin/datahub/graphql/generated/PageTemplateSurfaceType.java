package com.linkedin.datahub.graphql.generated;

/**
 * Different surface areas for a page template
 */
public enum PageTemplateSurfaceType {

    /**
     * This template applies to what to display on the home page for users.
     */
    HOME_PAGE("HOME_PAGE"),
    /**
     * This template applies to what to display on asset summary pages
     */
    ASSET_SUMMARY("ASSET_SUMMARY");

    private final String graphqlName;

    private PageTemplateSurfaceType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
