package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The result obtained when listing DataHub Tests
 */
public class ListTestsResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<Test> tests;

    public ListTestsResult() {
    }

    public ListTestsResult(int start, int count, int total, java.util.List<Test> tests) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.tests = tests;
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
     * The number of Tests in the returned result set
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of Tests in the returned result set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of Tests in the result set
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of Tests in the result set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The Tests themselves
     */
    public java.util.List<Test> getTests() {
        return tests;
    }
    /**
     * The Tests themselves
     */
    public void setTests(java.util.List<Test> tests) {
        this.tests = tests;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        if (tests != null) {
            joiner.add("tests: " + tests);
        }
        return joiner.toString();
    }

    public static ListTestsResult.Builder builder() {
        return new ListTestsResult.Builder();
    }

    public static class Builder {

        private int start;
        private int count;
        private int total;
        private java.util.List<Test> tests;

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
         * The number of Tests in the returned result set
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of Tests in the result set
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The Tests themselves
         */
        public Builder setTests(java.util.List<Test> tests) {
            this.tests = tests;
            return this;
        }


        public ListTestsResult build() {
            return new ListTestsResult(start, count, total, tests);
        }

    }
}
