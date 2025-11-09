package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input arguments for a full text search query across entities to get aggregations
 */
public class AggregateAcrossEntitiesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<EntityType> types;
    @javax.annotation.Nonnull
    private String query;
    private java.util.List<String> facets;
    private java.util.List<AndFilterInput> orFilters;
    private String viewUrn;
    private SearchFlags searchFlags;

    public AggregateAcrossEntitiesInput() {
    }

    public AggregateAcrossEntitiesInput(java.util.List<EntityType> types, String query, java.util.List<String> facets, java.util.List<AndFilterInput> orFilters, String viewUrn, SearchFlags searchFlags) {
        this.types = types;
        this.query = query;
        this.facets = facets;
        this.orFilters = orFilters;
        this.viewUrn = viewUrn;
        this.searchFlags = searchFlags;
    }

    public java.util.List<EntityType> getTypes() {
        return types;
    }
    public void setTypes(java.util.List<EntityType> types) {
        this.types = types;
    }

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }

    public java.util.List<String> getFacets() {
        return facets;
    }
    public void setFacets(java.util.List<String> facets) {
        this.facets = facets;
    }

    public java.util.List<AndFilterInput> getOrFilters() {
        return orFilters;
    }
    public void setOrFilters(java.util.List<AndFilterInput> orFilters) {
        this.orFilters = orFilters;
    }

    public String getViewUrn() {
        return viewUrn;
    }
    public void setViewUrn(String viewUrn) {
        this.viewUrn = viewUrn;
    }

    public SearchFlags getSearchFlags() {
        return searchFlags;
    }
    public void setSearchFlags(SearchFlags searchFlags) {
        this.searchFlags = searchFlags;
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
        if (facets != null) {
            joiner.add("facets: " + facets);
        }
        if (orFilters != null) {
            joiner.add("orFilters: " + orFilters);
        }
        if (viewUrn != null) {
            joiner.add("viewUrn: \"" + viewUrn + "\"");
        }
        if (searchFlags != null) {
            joiner.add("searchFlags: " + searchFlags);
        }
        return joiner.toString();
    }

    public static AggregateAcrossEntitiesInput.Builder builder() {
        return new AggregateAcrossEntitiesInput.Builder();
    }

    public static class Builder {

        private java.util.List<EntityType> types;
        private String query;
        private java.util.List<String> facets;
        private java.util.List<AndFilterInput> orFilters;
        private String viewUrn;
        private SearchFlags searchFlags;

        public Builder() {
        }

        public Builder setTypes(java.util.List<EntityType> types) {
            this.types = types;
            return this;
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder setFacets(java.util.List<String> facets) {
            this.facets = facets;
            return this;
        }

        public Builder setOrFilters(java.util.List<AndFilterInput> orFilters) {
            this.orFilters = orFilters;
            return this;
        }

        public Builder setViewUrn(String viewUrn) {
            this.viewUrn = viewUrn;
            return this;
        }

        public Builder setSearchFlags(SearchFlags searchFlags) {
            this.searchFlags = searchFlags;
            return this;
        }


        public AggregateAcrossEntitiesInput build() {
            return new AggregateAcrossEntitiesInput(types, query, facets, orFilters, viewUrn, searchFlags);
        }

    }
}
