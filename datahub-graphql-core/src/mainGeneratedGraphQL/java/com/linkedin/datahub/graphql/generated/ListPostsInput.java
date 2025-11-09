package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when listing existing posts
 */
public class ListPostsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer start;
    private Integer count;
    private String query;
    private String resourceUrn;
    private java.util.List<AndFilterInput> orFilters;

    public ListPostsInput() {
    }

    public ListPostsInput(Integer start, Integer count, String query, String resourceUrn, java.util.List<AndFilterInput> orFilters) {
        this.start = start;
        this.count = count;
        this.query = query;
        this.resourceUrn = resourceUrn;
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

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
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
        if (resourceUrn != null) {
            joiner.add("resourceUrn: \"" + resourceUrn + "\"");
        }
        if (orFilters != null) {
            joiner.add("orFilters: " + orFilters);
        }
        return joiner.toString();
    }

    public static ListPostsInput.Builder builder() {
        return new ListPostsInput.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;
        private String query;
        private String resourceUrn;
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

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }

        public Builder setOrFilters(java.util.List<AndFilterInput> orFilters) {
            this.orFilters = orFilters;
            return this;
        }


        public ListPostsInput build() {
            return new ListPostsInput(start, count, query, resourceUrn, orFilters);
        }

    }
}
