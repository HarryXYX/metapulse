package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Results returned when listing access tokens
 */
public class ListAccessTokenResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<AccessTokenMetadata> tokens;

    public ListAccessTokenResult() {
    }

    public ListAccessTokenResult(int start, int count, int total, java.util.List<AccessTokenMetadata> tokens) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.tokens = tokens;
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
     * The token metadata themselves
     */
    public java.util.List<AccessTokenMetadata> getTokens() {
        return tokens;
    }
    /**
     * The token metadata themselves
     */
    public void setTokens(java.util.List<AccessTokenMetadata> tokens) {
        this.tokens = tokens;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        if (tokens != null) {
            joiner.add("tokens: " + tokens);
        }
        return joiner.toString();
    }

    public static ListAccessTokenResult.Builder builder() {
        return new ListAccessTokenResult.Builder();
    }

    public static class Builder {

        private int start;
        private int count;
        private int total;
        private java.util.List<AccessTokenMetadata> tokens;

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
         * The token metadata themselves
         */
        public Builder setTokens(java.util.List<AccessTokenMetadata> tokens) {
            this.tokens = tokens;
            return this;
        }


        public ListAccessTokenResult build() {
            return new ListAccessTokenResult(start, count, total, tokens);
        }

    }
}
