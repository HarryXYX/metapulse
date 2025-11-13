package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The result of running a test
 */
public class TestResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Test test;
    @javax.annotation.Nonnull
    private TestResultType type;

    public TestResult() {
    }

    public TestResult(Test test, TestResultType type) {
        this.test = test;
        this.type = type;
    }

    /**
     * The test itself, or null if the test has been deleted
     */
    public Test getTest() {
        return test;
    }
    /**
     * The test itself, or null if the test has been deleted
     */
    public void setTest(Test test) {
        this.test = test;
    }

    /**
     * The final result, e.g. either SUCCESS or FAILURE.
     */
    public TestResultType getType() {
        return type;
    }
    /**
     * The final result, e.g. either SUCCESS or FAILURE.
     */
    public void setType(TestResultType type) {
        this.type = type;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (test != null) {
            joiner.add("test: " + test);
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        return joiner.toString();
    }

    public static TestResult.Builder builder() {
        return new TestResult.Builder();
    }

    public static class Builder {

        private Test test;
        private TestResultType type;

        public Builder() {
        }

        /**
         * The test itself, or null if the test has been deleted
         */
        public Builder setTest(Test test) {
            this.test = test;
            return this;
        }

        /**
         * The final result, e.g. either SUCCESS or FAILURE.
         */
        public Builder setType(TestResultType type) {
            this.type = type;
            return this;
        }


        public TestResult build() {
            return new TestResult(test, type);
        }

    }
}
