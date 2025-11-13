package com.linkedin.datahub.graphql.generated;

/**
 * Different scopes for where this template is relevant
 */
public enum PageTemplateScope {

    /**
     * This template is used for individual use only
     */
    PERSONAL("PERSONAL"),
    /**
     * This template is used across users
     */
    GLOBAL("GLOBAL");

    private final String graphqlName;

    private PageTemplateScope(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
