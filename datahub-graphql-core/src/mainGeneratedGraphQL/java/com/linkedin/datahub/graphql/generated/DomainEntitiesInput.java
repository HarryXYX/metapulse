package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to fetch the entities inside of a Domain.
 */
public class DomainEntitiesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String query;
    private Integer start;
    private Integer count;
    private java.util.List<FacetFilterInput> filters;

    public DomainEntitiesInput() {
    }

    public DomainEntitiesInput(String query, Integer start, Integer count, java.util.List<FacetFilterInput> filters) {
        this.query = query;
        this.start = start;
        this.count = count;
        this.filters = filters;
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

    public java.util.List<FacetFilterInput> getFilters() {
        return filters;
    }
    public void setFilters(java.util.List<FacetFilterInput> filters) {
        this.filters = filters;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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
        return joiner.toString();
    }

    public static DomainEntitiesInput.Builder builder() {
        return new DomainEntitiesInput.Builder();
    }

    public static class Builder {

        private String query;
        private Integer start;
        private Integer count;
        private java.util.List<FacetFilterInput> filters;

        public Builder() {
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

        public Builder setFilters(java.util.List<FacetFilterInput> filters) {
            this.filters = filters;
            return this;
        }


        public DomainEntitiesInput build() {
            return new DomainEntitiesInput(query, start, count, filters);
        }

    }
}
