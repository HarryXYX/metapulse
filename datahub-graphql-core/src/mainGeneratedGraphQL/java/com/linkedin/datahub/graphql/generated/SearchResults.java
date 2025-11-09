package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Results returned by issuing a search query
 */
public class SearchResults implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<SearchResult> searchResults;
    private java.util.List<FacetMetadata> facets;
    private java.util.List<SearchSuggestion> suggestions;

    public SearchResults() {
    }

    public SearchResults(int start, int count, int total, java.util.List<SearchResult> searchResults, java.util.List<FacetMetadata> facets, java.util.List<SearchSuggestion> suggestions) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.searchResults = searchResults;
        this.facets = facets;
        this.suggestions = suggestions;
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
    public java.util.List<SearchResult> getSearchResults() {
        return searchResults;
    }
    /**
     * The search result entities
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

    /**
     * Search suggestions based on the query provided for alternate query texts
     */
    public java.util.List<SearchSuggestion> getSuggestions() {
        return suggestions;
    }
    /**
     * Search suggestions based on the query provided for alternate query texts
     */
    public void setSuggestions(java.util.List<SearchSuggestion> suggestions) {
        this.suggestions = suggestions;
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
        if (suggestions != null) {
            joiner.add("suggestions: " + suggestions);
        }
        return joiner.toString();
    }

    public static SearchResults.Builder builder() {
        return new SearchResults.Builder();
    }

    public static class Builder {

        private int start;
        private int count;
        private int total;
        private java.util.List<SearchResult> searchResults;
        private java.util.List<FacetMetadata> facets;
        private java.util.List<SearchSuggestion> suggestions;

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

        /**
         * Search suggestions based on the query provided for alternate query texts
         */
        public Builder setSuggestions(java.util.List<SearchSuggestion> suggestions) {
            this.suggestions = suggestions;
            return this;
        }


        public SearchResults build() {
            return new SearchResults(start, count, total, searchResults, facets, suggestions);
        }

    }
}
