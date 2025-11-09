package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Context that defines a search page requesting recommendatinos
 */
public class SearchRequestContext implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String query;
    private java.util.List<FacetFilterInput> filters;

    public SearchRequestContext() {
    }

    public SearchRequestContext(String query, java.util.List<FacetFilterInput> filters) {
        this.query = query;
        this.filters = filters;
    }

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }

    public java.util.List<FacetFilterInput> getFilters() {
        return filters;
    }
    public void setFilters(java.util.List<FacetFilterInput> filters) {
        this.filters = filters;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (query != null) {
            joiner.add("query: \"" + query + "\"");
        }
        if (filters != null) {
            joiner.add("filters: " + filters);
        }
        return joiner.toString();
    }

    public static SearchRequestContext.Builder builder() {
        return new SearchRequestContext.Builder();
    }

    public static class Builder {

        private String query;
        private java.util.List<FacetFilterInput> filters;

        public Builder() {
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder setFilters(java.util.List<FacetFilterInput> filters) {
            this.filters = filters;
            return this;
        }


        public SearchRequestContext build() {
            return new SearchRequestContext(query, filters);
        }

    }
}
