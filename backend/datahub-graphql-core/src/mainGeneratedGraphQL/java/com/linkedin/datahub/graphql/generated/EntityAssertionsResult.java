package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A list of Assertions Associated with an Entity
 */
public class EntityAssertionsResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<Assertion> assertions;

    public EntityAssertionsResult() {
    }

    public EntityAssertionsResult(int start, int count, int total, java.util.List<Assertion> assertions) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.assertions = assertions;
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
     * The number of assertions in the returned result set
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of assertions in the returned result set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of assertions in the result set
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of assertions in the result set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The assertions themselves
     */
    public java.util.List<Assertion> getAssertions() {
        return assertions;
    }
    /**
     * The assertions themselves
     */
    public void setAssertions(java.util.List<Assertion> assertions) {
        this.assertions = assertions;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        if (assertions != null) {
            joiner.add("assertions: " + assertions);
        }
        return joiner.toString();
    }

    public static EntityAssertionsResult.Builder builder() {
        return new EntityAssertionsResult.Builder();
    }

    public static class Builder {

        private int start;
        private int count;
        private int total;
        private java.util.List<Assertion> assertions;

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
         * The number of assertions in the returned result set
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of assertions in the result set
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The assertions themselves
         */
        public Builder setAssertions(java.util.List<Assertion> assertions) {
            this.assertions = assertions;
            return this;
        }


        public EntityAssertionsResult build() {
            return new EntityAssertionsResult(start, count, total, assertions);
        }

    }
}
