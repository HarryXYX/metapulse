package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required when listing DataHub Access Policies
 */
public class ListPoliciesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer start;
    private Integer count;
    private String query;
    private java.util.List<AndFilterInput> orFilters;

    public ListPoliciesInput() {
    }

    public ListPoliciesInput(Integer start, Integer count, String query, java.util.List<AndFilterInput> orFilters) {
        this.start = start;
        this.count = count;
        this.query = query;
        this.orFilters = orFilters;
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

    public java.util.List<AndFilterInput> getOrFilters() {
        return orFilters;
    }
    public void setOrFilters(java.util.List<AndFilterInput> orFilters) {
        this.orFilters = orFilters;
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
        if (orFilters != null) {
            joiner.add("orFilters: " + orFilters);
        }
        return joiner.toString();
    }

    public static ListPoliciesInput.Builder builder() {
        return new ListPoliciesInput.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;
        private String query;
        private java.util.List<AndFilterInput> orFilters;

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

        public Builder setOrFilters(java.util.List<AndFilterInput> orFilters) {
            this.orFilters = orFilters;
            return this;
        }


        public ListPoliciesInput build() {
            return new ListPoliciesInput(start, count, query, orFilters);
        }

    }
}
