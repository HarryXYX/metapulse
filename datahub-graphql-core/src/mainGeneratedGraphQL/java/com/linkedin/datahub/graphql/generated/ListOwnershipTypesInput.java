package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required for listing custom ownership types entities
 */
public class ListOwnershipTypesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer start;
    private Integer count;
    private String query;
    private java.util.List<FacetFilterInput> filters;

    public ListOwnershipTypesInput() {
    }

    public ListOwnershipTypesInput(Integer start, Integer count, String query, java.util.List<FacetFilterInput> filters) {
        this.start = start;
        this.count = count;
        this.query = query;
        this.filters = filters;
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
        return joiner.toString();
    }

    public static ListOwnershipTypesInput.Builder builder() {
        return new ListOwnershipTypesInput.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;
        private String query;
        private java.util.List<FacetFilterInput> filters;

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


        public ListOwnershipTypesInput build() {
            return new ListOwnershipTypesInput(start, count, query, filters);
        }

    }
}
