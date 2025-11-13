package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Context to define the search recommendations
 */
public class SearchParams implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<EntityType> types;
    @javax.annotation.Nonnull
    private String query;
    private java.util.List<FacetFilter> filters;

    public SearchParams() {
    }

    public SearchParams(java.util.List<EntityType> types, String query, java.util.List<FacetFilter> filters) {
        this.types = types;
        this.query = query;
        this.filters = filters;
    }

    /**
     * Entity types to be searched. If this is not provided, all entities will be searched.
     */
    public java.util.List<EntityType> getTypes() {
        return types;
    }
    /**
     * Entity types to be searched. If this is not provided, all entities will be searched.
     */
    public void setTypes(java.util.List<EntityType> types) {
        this.types = types;
    }

    /**
     * Search query
     */
    public String getQuery() {
        return query;
    }
    /**
     * Search query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * Filters
     */
    public java.util.List<FacetFilter> getFilters() {
        return filters;
    }
    /**
     * Filters
     */
    public void setFilters(java.util.List<FacetFilter> filters) {
        this.filters = filters;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (types != null) {
            joiner.add("types: " + types);
        }
        if (query != null) {
            joiner.add("query: \"" + query + "\"");
        }
        if (filters != null) {
            joiner.add("filters: " + filters);
        }
        return joiner.toString();
    }

    public static SearchParams.Builder builder() {
        return new SearchParams.Builder();
    }

    public static class Builder {

        private java.util.List<EntityType> types;
        private String query;
        private java.util.List<FacetFilter> filters;

        public Builder() {
        }

        /**
         * Entity types to be searched. If this is not provided, all entities will be searched.
         */
        public Builder setTypes(java.util.List<EntityType> types) {
            this.types = types;
            return this;
        }

        /**
         * Search query
         */
        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        /**
         * Filters
         */
        public Builder setFilters(java.util.List<FacetFilter> filters) {
            this.filters = filters;
            return this;
        }


        public SearchParams build() {
            return new SearchParams(types, query, filters);
        }

    }
}
