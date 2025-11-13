package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input arguments for a search query over the results of a multi-hop graph query
 */
public class SearchAcrossLineageInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String urn;
    @javax.annotation.Nonnull
    private LineageDirection direction;
    private java.util.List<EntityType> types;
    private String query;
    private Integer start;
    private Integer count;
    @Deprecated
    private java.util.List<FacetFilterInput> filters;
    private java.util.List<AndFilterInput> orFilters;
    @Deprecated
    private Long startTimeMillis;
    @Deprecated
    private Long endTimeMillis;
    private SearchFlags searchFlags;
    private LineageFlags lineageFlags;
    private String viewUrn;
    private SearchSortInput sortInput;

    public SearchAcrossLineageInput() {
    }

    public SearchAcrossLineageInput(String urn, LineageDirection direction, java.util.List<EntityType> types, String query, Integer start, Integer count, java.util.List<FacetFilterInput> filters, java.util.List<AndFilterInput> orFilters, Long startTimeMillis, Long endTimeMillis, SearchFlags searchFlags, LineageFlags lineageFlags, String viewUrn, SearchSortInput sortInput) {
        this.urn = urn;
        this.direction = direction;
        this.types = types;
        this.query = query;
        this.start = start;
        this.count = count;
        this.filters = filters;
        this.orFilters = orFilters;
        this.startTimeMillis = startTimeMillis;
        this.endTimeMillis = endTimeMillis;
        this.searchFlags = searchFlags;
        this.lineageFlags = lineageFlags;
        this.viewUrn = viewUrn;
        this.sortInput = sortInput;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public LineageDirection getDirection() {
        return direction;
    }
    public void setDirection(LineageDirection direction) {
        this.direction = direction;
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

    @Deprecated
    public Long getStartTimeMillis() {
        return startTimeMillis;
    }
    @Deprecated
    public void setStartTimeMillis(Long startTimeMillis) {
        this.startTimeMillis = startTimeMillis;
    }

    @Deprecated
    public Long getEndTimeMillis() {
        return endTimeMillis;
    }
    @Deprecated
    public void setEndTimeMillis(Long endTimeMillis) {
        this.endTimeMillis = endTimeMillis;
    }

    public SearchFlags getSearchFlags() {
        return searchFlags;
    }
    public void setSearchFlags(SearchFlags searchFlags) {
        this.searchFlags = searchFlags;
    }

    public LineageFlags getLineageFlags() {
        return lineageFlags;
    }
    public void setLineageFlags(LineageFlags lineageFlags) {
        this.lineageFlags = lineageFlags;
    }

    public String getViewUrn() {
        return viewUrn;
    }
    public void setViewUrn(String viewUrn) {
        this.viewUrn = viewUrn;
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
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (direction != null) {
            joiner.add("direction: " + direction);
        }
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
        if (startTimeMillis != null) {
            joiner.add("startTimeMillis: " + startTimeMillis);
        }
        if (endTimeMillis != null) {
            joiner.add("endTimeMillis: " + endTimeMillis);
        }
        if (searchFlags != null) {
            joiner.add("searchFlags: " + searchFlags);
        }
        if (lineageFlags != null) {
            joiner.add("lineageFlags: " + lineageFlags);
        }
        if (viewUrn != null) {
            joiner.add("viewUrn: \"" + viewUrn + "\"");
        }
        if (sortInput != null) {
            joiner.add("sortInput: " + sortInput);
        }
        return joiner.toString();
    }

    public static SearchAcrossLineageInput.Builder builder() {
        return new SearchAcrossLineageInput.Builder();
    }

    public static class Builder {

        private String urn;
        private LineageDirection direction;
        private java.util.List<EntityType> types;
        private String query;
        private Integer start;
        private Integer count;
        private java.util.List<FacetFilterInput> filters;
        private java.util.List<AndFilterInput> orFilters;
        private Long startTimeMillis;
        private Long endTimeMillis;
        private SearchFlags searchFlags;
        private LineageFlags lineageFlags;
        private String viewUrn;
        private SearchSortInput sortInput;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setDirection(LineageDirection direction) {
            this.direction = direction;
            return this;
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

        @Deprecated
        public Builder setStartTimeMillis(Long startTimeMillis) {
            this.startTimeMillis = startTimeMillis;
            return this;
        }

        @Deprecated
        public Builder setEndTimeMillis(Long endTimeMillis) {
            this.endTimeMillis = endTimeMillis;
            return this;
        }

        public Builder setSearchFlags(SearchFlags searchFlags) {
            this.searchFlags = searchFlags;
            return this;
        }

        public Builder setLineageFlags(LineageFlags lineageFlags) {
            this.lineageFlags = lineageFlags;
            return this;
        }

        public Builder setViewUrn(String viewUrn) {
            this.viewUrn = viewUrn;
            return this;
        }

        public Builder setSortInput(SearchSortInput sortInput) {
            this.sortInput = sortInput;
            return this;
        }


        public SearchAcrossLineageInput build() {
            return new SearchAcrossLineageInput(urn, direction, types, query, start, count, filters, orFilters, startTimeMillis, endTimeMillis, searchFlags, lineageFlags, viewUrn, sortInput);
        }

    }
}
