package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Results returned by issuing a search across relationships query using scroll API
 */
public class ScrollAcrossLineageResults implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String nextScrollId;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<SearchAcrossLineageResult> searchResults;
    private java.util.List<FacetMetadata> facets;

    public ScrollAcrossLineageResults() {
    }

    public ScrollAcrossLineageResults(String nextScrollId, int count, int total, java.util.List<SearchAcrossLineageResult> searchResults, java.util.List<FacetMetadata> facets) {
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
     * The search result entities
     */
    public java.util.List<SearchAcrossLineageResult> getSearchResults() {
        return searchResults;
    }
    /**
     * The search result entities
     */
    public void setSearchResults(java.util.List<SearchAcrossLineageResult> searchResults) {
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

    public static ScrollAcrossLineageResults.Builder builder() {
        return new ScrollAcrossLineageResults.Builder();
    }

    public static class Builder {

        private String nextScrollId;
        private int count;
        private int total;
        private java.util.List<SearchAcrossLineageResult> searchResults;
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
         * The search result entities
         */
        public Builder setSearchResults(java.util.List<SearchAcrossLineageResult> searchResults) {
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


        public ScrollAcrossLineageResults build() {
            return new ScrollAcrossLineageResults(nextScrollId, count, total, searchResults, facets);
        }

    }
}
