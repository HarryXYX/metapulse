package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input arguments for listing Ingestion Sources
 */
public class ListIngestionSourcesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer start;
    private Integer count;
    private String query;
    private java.util.List<FacetFilterInput> filters;
    private SortCriterion sort;

    public ListIngestionSourcesInput() {
    }

    public ListIngestionSourcesInput(Integer start, Integer count, String query, java.util.List<FacetFilterInput> filters, SortCriterion sort) {
        this.start = start;
        this.count = count;
        this.query = query;
        this.filters = filters;
        this.sort = sort;
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

    public SortCriterion getSort() {
        return sort;
    }
    public void setSort(SortCriterion sort) {
        this.sort = sort;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (start != null) {
            joiner.add("start: " + start);
        }
        if (count != null) {
            joiner.add("count: " + count);
        }
        if (query != null) {
            joiner.add("query: \"" + query + "\"");
        }
        if (filters != null) {
            joiner.add("filters: " + filters);
        }
        if (sort != null) {
            joiner.add("sort: " + sort);
        }
        return joiner.toString();
    }

    public static ListIngestionSourcesInput.Builder builder() {
        return new ListIngestionSourcesInput.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;
        private String query;
        private java.util.List<FacetFilterInput> filters;
        private SortCriterion sort;

        public Builder() {
        }

        public Builder setStart(Integer start) {
            this.start = start;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder setFilters(java.util.List<FacetFilterInput> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setSort(SortCriterion sort) {
            this.sort = sort;
            return this;
        }


        public ListIngestionSourcesInput build() {
            return new ListIngestionSourcesInput(start, count, query, filters, sort);
        }

    }
}
