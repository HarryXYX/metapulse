package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required when listing DataHub Users
 */
public class ListUsersInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer start;
    private Integer count;
    private String query;

    public ListUsersInput() {
    }

    public ListUsersInput(Integer start, Integer count, String query) {
        this.start = start;
        this.count = count;
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

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
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
        return joiner.toString();
    }

    public static ListUsersInput.Builder builder() {
        return new ListUsersInput.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;
        private String query;

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


        public ListUsersInput build() {
            return new ListUsersInput(start, count, query);
        }

    }
}
