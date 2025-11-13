package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Results when listing entity queries
 */
public class ListQueriesResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<QueryEntity> queries;

    public ListQueriesResult() {
    }

    public ListQueriesResult(int start, int count, int total, java.util.List<QueryEntity> queries) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.queries = queries;
    }

    /**
     * The starting offset of the result set
     */
    public int getStart() {
        return start;
    }
    /**
     * The starting offset of the result set
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * The number of results to be returned
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of results to be returned
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of results in the result set
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of results in the result set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The Queries themselves
     */
    public java.util.List<QueryEntity> getQueries() {
        return queries;
    }
    /**
     * The Queries themselves
     */
    public void setQueries(java.util.List<QueryEntity> queries) {
        this.queries = queries;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        if (queries != null) {
            joiner.add("queries: " + queries);
        }
        return joiner.toString();
    }

    public static ListQueriesResult.Builder builder() {
        return new ListQueriesResult.Builder();
    }

    public static class Builder {

        private int start;
        private int count;
        private int total;
        private java.util.List<QueryEntity> queries;

        public Builder() {
        }

        /**
         * The starting offset of the result set
         */
        public Builder setStart(int start) {
            this.start = start;
            return this;
        }

        /**
         * The number of results to be returned
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of results in the result set
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The Queries themselves
         */
        public Builder setQueries(java.util.List<QueryEntity> queries) {
            this.queries = queries;
            return this;
        }


        public ListQueriesResult build() {
            return new ListQueriesResult(start, count, total, queries);
        }

    }
}
