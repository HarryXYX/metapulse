package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Results returned by issuing a search across relationships query
 */
public class SearchAcrossLineageResults implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<SearchAcrossLineageResult> searchResults;
    private java.util.List<FacetMetadata> facets;
    private FreshnessStats freshness;
    private LineageSearchPath lineageSearchPath;

    public SearchAcrossLineageResults() {
    }

    public SearchAcrossLineageResults(int start, int count, int total, java.util.List<SearchAcrossLineageResult> searchResults, java.util.List<FacetMetadata> facets, FreshnessStats freshness, LineageSearchPath lineageSearchPath) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.searchResults = searchResults;
        this.facets = facets;
        this.freshness = freshness;
        this.lineageSearchPath = lineageSearchPath;
    }

    /**
     * The offset of the result set
     */
    public int getStart() {
        return start;
    }
    /**
     * The offset of the result set
     */
    public void setStart(int start) {
        this.start = start;
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

    /**
     * Optional freshness characteristics of this query (cached, staleness etc.)
     */
    public FreshnessStats getFreshness() {
        return freshness;
    }
    /**
     * Optional freshness characteristics of this query (cached, staleness etc.)
     */
    public void setFreshness(FreshnessStats freshness) {
        this.freshness = freshness;
    }

    /**
     * The path taken when doing search across lineage
     */
    public LineageSearchPath getLineageSearchPath() {
        return lineageSearchPath;
    }
    /**
     * The path taken when doing search across lineage
     */
    public void setLineageSearchPath(LineageSearchPath lineageSearchPath) {
        this.lineageSearchPath = lineageSearchPath;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        if (searchResults != null) {
            joiner.add("searchResults: " + searchResults);
        }
        if (facets != null) {
            joiner.add("facets: " + facets);
        }
        if (freshness != null) {
            joiner.add("freshness: " + freshness);
        }
        if (lineageSearchPath != null) {
            joiner.add("lineageSearchPath: " + lineageSearchPath);
        }
        return joiner.toString();
    }

    public static SearchAcrossLineageResults.Builder builder() {
        return new SearchAcrossLineageResults.Builder();
    }

    public static class Builder {

        private int start;
        private int count;
        private int total;
        private java.util.List<SearchAcrossLineageResult> searchResults;
        private java.util.List<FacetMetadata> facets;
        private FreshnessStats freshness;
        private LineageSearchPath lineageSearchPath;

        public Builder() {
        }

        /**
         * The offset of the result set
         */
        public Builder setStart(int start) {
            this.start = start;
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

        /**
         * Optional freshness characteristics of this query (cached, staleness etc.)
         */
        public Builder setFreshness(FreshnessStats freshness) {
            this.freshness = freshness;
            return this;
        }

        /**
         * The path taken when doing search across lineage
         */
        public Builder setLineageSearchPath(LineageSearchPath lineageSearchPath) {
            this.lineageSearchPath = lineageSearchPath;
            return this;
        }


        public SearchAcrossLineageResults build() {
            return new SearchAcrossLineageResults(start, count, total, searchResults, facets, freshness, lineageSearchPath);
        }

    }
}
