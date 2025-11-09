package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Results returned by issuing a search query
 */
public class ScrollResults implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String nextScrollId;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<SearchResult> searchResults;
    private java.util.List<FacetMetadata> facets;

    public ScrollResults() {
    }

    public ScrollResults(String nextScrollId, int count, int total, java.util.List<SearchResult> searchResults, java.util.List<FacetMetadata> facets) {
        this.nextScrollId = nextScrollId;
        this.count = count;
        this.total = total;
        this.searchResults = searchResults;
        this.facets = facets;
    }

    /**
     * Opaque ID to pass to the next request to the server
     */
    public String getNextScrollId() {
        return nextScrollId;
    }
    /**
     * Opaque ID to pass to the next request to the server
     */
    public void setNextScrollId(String nextScrollId) {
        this.nextScrollId = nextScrollId;
    }

    /**
     * The number of entities included in the result set
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of entities included in the result set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of search results matching the query and filters
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of search results matching the query and filters
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The search result entities for a scroll request
     */
    public java.util.List<SearchResult> getSearchResults() {
        return searchResults;
    }
    /**
     * The search result entities for a scroll request
     */
    public void setSearchResults(java.util.List<SearchResult> searchResults) {
        this.searchResults = searchResults;
    }

    /**
     * Candidate facet aggregations used for search filtering
     */
    public java.util.List<FacetMetadata> getFacets() {
        return facets;
    }
    /**
     * Candidate facet aggregations used for search filtering
     */
    public void setFacets(java.util.List<FacetMetadata> facets) {
        this.facets = facets;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (nextScrollId != null) {
            joiner.add("nextScrollId: \"" + nextScrollId + "\"");
        }
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        if (searchResults != null) {
            joiner.add("searchResults: " + searchResults);
        }
        if (facets != null) {
            joiner.add("facets: " + facets);
        }
        return joiner.toString();
    }

    public static ScrollResults.Builder builder() {
        return new ScrollResults.Builder();
    }

    public static class Builder {

        private String nextScrollId;
        private int count;
        private int total;
        private java.util.List<SearchResult> searchResults;
        private java.util.List<FacetMetadata> facets;

        public Builder() {
        }

        /**
         * Opaque ID to pass to the next request to the server
         */
        public Builder setNextScrollId(String nextScrollId) {
            this.nextScrollId = nextScrollId;
            return this;
        }

        /**
         * The number of entities included in the result set
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of search results matching the query and filters
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The search result entities for a scroll request
         */
        public Builder setSearchResults(java.util.List<SearchResult> searchResults) {
            this.searchResults = searchResults;
            return this;
        }

        /**
         * Candidate facet aggregations used for search filtering
         */
        public Builder setFacets(java.util.List<FacetMetadata> facets) {
            this.facets = facets;
            return this;
        }


        public ScrollResults build() {
            return new ScrollResults(nextScrollId, count, total, searchResults, facets);
        }

    }
}
