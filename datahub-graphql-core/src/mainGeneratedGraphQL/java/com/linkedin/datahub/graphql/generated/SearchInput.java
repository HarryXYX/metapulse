package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input arguments for a full text search query
 */
public class SearchInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String query;
    private Integer start;
    private Integer count;
    @Deprecated
    private java.util.List<FacetFilterInput> filters;
    private java.util.List<AndFilterInput> orFilters;
    private SearchFlags searchFlags;

    public SearchInput() {
    }

    public SearchInput(EntityType type, String query, Integer start, Integer count, java.util.List<FacetFilterInput> filters, java.util.List<AndFilterInput> orFilters, SearchFlags searchFlags) {
        this.type = type;
        this.query = query;
        this.start = start;
        this.count = count;
        this.filters = filters;
        this.orFilters = orFilters;
        this.searchFlags = searchFlags;
    }

    public EntityType getType() {
        return type;
    }
    public void setType(EntityType type) {
        this.type = type;
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

    public SearchFlags getSearchFlags() {
        return searchFlags;
    }
    public void setSearchFlags(SearchFlags searchFlags) {
        this.searchFlags = searchFlags;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
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
        if (searchFlags != null) {
            joiner.add("searchFlags: " + searchFlags);
        }
        return joiner.toString();
    }

    public static SearchInput.Builder builder() {
        return new SearchInput.Builder();
    }

    public static class Builder {

        private EntityType type;
        private String query;
        private Integer start;
        private Integer count;
        private java.util.List<FacetFilterInput> filters;
        private java.util.List<AndFilterInput> orFilters;
        private SearchFlags searchFlags;

        public Builder() {
        }

        public Builder setType(EntityType type) {
            this.type = type;
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

        public Builder setSearchFlags(SearchFlags searchFlags) {
            this.searchFlags = searchFlags;
            return this;
        }


        public SearchInput build() {
            return new SearchInput(type, query, start, count, filters, orFilters, searchFlags);
        }

    }
}
