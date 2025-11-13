package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class ListExecutionRequestsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer start;
    private Integer count;
    private String query;
    private java.util.List<FacetFilterInput> filters;
    private SortCriterion sort;
    private Boolean systemSources;

    public ListExecutionRequestsInput() {
    }

    public ListExecutionRequestsInput(Integer start, Integer count, String query, java.util.List<FacetFilterInput> filters, SortCriterion sort, Boolean systemSources) {
        this.start = start;
        this.count = count;
        this.query = query;
        this.filters = filters;
        this.sort = sort;
        this.systemSources = systemSources;
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

    public Boolean getSystemSources() {
        return systemSources;
    }
    public void setSystemSources(Boolean systemSources) {
        this.systemSources = systemSources;
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
        if (systemSources != null) {
            joiner.add("systemSources: " + systemSources);
        }
        return joiner.toString();
    }

    public static ListExecutionRequestsInput.Builder builder() {
        return new ListExecutionRequestsInput.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;
        private String query;
        private java.util.List<FacetFilterInput> filters;
        private SortCriterion sort;
        private Boolean systemSources;

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

        public Builder setSystemSources(Boolean systemSources) {
            this.systemSources = systemSources;
            return this;
        }


        public ListExecutionRequestsInput build() {
            return new ListExecutionRequestsInput(start, count, query, filters, sort, systemSources);
        }

    }
}
