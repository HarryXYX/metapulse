package com.linkedin.datahub.graphql.generated;

/**
 * Variants of APIs used in the Search bar to get data
 */
public enum SearchBarAPI {

    AUTOCOMPLETE_FOR_MULTIPLE("AUTOCOMPLETE_FOR_MULTIPLE"),
    SEARCH_ACROSS_ENTITIES("SEARCH_ACROSS_ENTITIES");

    private final String graphqlName;

    private SearchBarAPI(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
