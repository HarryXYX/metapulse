package com.linkedin.datahub.graphql.generated;

/**
 * Different scopes for where this module is relevant
 */
public enum PageModuleScope {

    /**
     * This module is used for individual use only
     */
    PERSONAL("PERSONAL"),
    /**
     * This module is used across users
     */
    GLOBAL("GLOBAL");

    private final String graphqlName;

    private PageModuleScope(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
