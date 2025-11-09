package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input arguments for a full text search query across entities
 */
public class SearchAcrossEntitiesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<EntityType> types;
    @javax.annotation.Nonnull
    private String query;
    private Integer start;
    private Integer count;
    @Deprecated
    private java.util.List<FacetFilterInput> filters;
    private java.util.List<AndFilterInput> orFilters;
    private String viewUrn;
    private SearchFlags searchFlags;
    private SearchSortInput sortInput;

    public SearchAcrossEntitiesInput() {
    }

    public SearchAcrossEntitiesInput(java.util.List<EntityType> types, String query, Integer start, Integer count, java.util.List<FacetFilterInput> filters, java.util.List<AndFilterInput> orFilters, String viewUrn, SearchFlags searchFlags, SearchSortInput sortInput) {
        this.types = types;
        this.query = query;
        this.start = start;
        this.count = count;
        this.filters = filters;
        this.orFilters = orFilters;
        this.viewUrn = viewUrn;
        this.searchFlags = searchFlags;
        this.sortInput = sortInput;
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

    public Integer getStart() {
        return start;
    }
    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }

    @Deprecated
    public java.util.List<FacetFilterInput> getFilters() {
        return filters;
    }
    @Deprecated
    public void setFilters(java.util.List<FacetFilterInput> filters) {
        this.filters = filters;
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

    public SearchSortInput getSortInput() {
        return sortInput;
    }
    public void setSortInput(SearchSortInput sortInput) {
        this.sortInput = sortInput;
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
        if (start != null) {
            joiner.add("start: " + start);
        }
        if (count != null) {
            joiner.add("count: " + count);
        }
        if (filters != null) {
            joiner.add("filters: " + filters);
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
        if (sortInput != null) {
            joiner.add("sortInput: " + sortInput);
        }
        return joiner.toString();
    }

    public static SearchAcrossEntitiesInput.Builder builder() {
        return new SearchAcrossEntitiesInput.Builder();
    }

    public static class Builder {

        private java.util.List<EntityType> types;
        private String query;
        private Integer start;
        private Integer count;
        private java.util.List<FacetFilterInput> filters;
        private java.util.List<AndFilterInput> orFilters;
        private String viewUrn;
        private SearchFlags searchFlags;
        private SearchSortInput sortInput;

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

        public Builder setStart(Integer start) {
            this.start = start;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }

        @Deprecated
        public Builder setFilters(java.util.List<FacetFilterInput> filters) {
            this.filters = filters;
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

        public Builder setSortInput(SearchSortInput sortInput) {
            this.sortInput = sortInput;
            return this;
        }


        public SearchAcrossEntitiesInput build() {
            return new SearchAcrossEntitiesInput(types, query, start, count, filters, orFilters, viewUrn, searchFlags, sortInput);
        }

    }
}
