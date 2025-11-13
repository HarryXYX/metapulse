package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The result obtained when listing DataHub Access Policies
 */
public class ListPoliciesResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<Policy> policies;

    public ListPoliciesResult() {
    }

    public ListPoliciesResult(int start, int count, int total, java.util.List<Policy> policies) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.policies = policies;
    }

    /**
     * The starting offset of the result set returned
     */
    public int getStart() {
        return start;
    }
    /**
     * The starting offset of the result set returned
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * The number of Policies in the returned result set
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of Policies in the returned result set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of Policies in the result set
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of Policies in the result set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The Policies themselves
     */
    public java.util.List<Policy> getPolicies() {
        return policies;
    }
    /**
     * The Policies themselves
     */
    public void setPolicies(java.util.List<Policy> policies) {
        this.policies = policies;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        if (policies != null) {
            joiner.add("policies: " + policies);
        }
        return joiner.toString();
    }

    public static ListPoliciesResult.Builder builder() {
        return new ListPoliciesResult.Builder();
    }

    public static class Builder {

        private int start;
        private int count;
        private int total;
        private java.util.List<Policy> policies;

        public Builder() {
        }

        /**
         * The starting offset of the result set returned
         */
        public Builder setStart(int start) {
            this.start = start;
            return this;
        }

        /**
         * The number of Policies in the returned result set
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of Policies in the result set
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The Policies themselves
         */
        public Builder setPolicies(java.util.List<Policy> policies) {
            this.policies = policies;
            return this;
        }


        public ListPoliciesResult build() {
            return new ListPoliciesResult(start, count, total, policies);
        }

    }
}
