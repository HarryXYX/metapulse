package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Result returned when fetching run events for an assertion.
 */
public class AssertionRunEventsResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int total;
    private int failed;
    private int succeeded;
    private int errored;
    @javax.annotation.Nonnull
    private java.util.List<AssertionRunEvent> runEvents;

    public AssertionRunEventsResult() {
    }

    public AssertionRunEventsResult(int total, int failed, int succeeded, int errored, java.util.List<AssertionRunEvent> runEvents) {
        this.total = total;
        this.failed = failed;
        this.succeeded = succeeded;
        this.errored = errored;
        this.runEvents = runEvents;
    }

    /**
     * The total number of run events returned
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of run events returned
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The number of failed run events
     */
    public int getFailed() {
        return failed;
    }
    /**
     * The number of failed run events
     */
    public void setFailed(int failed) {
        this.failed = failed;
    }

    /**
     * The number of succeeded run events
     */
    public int getSucceeded() {
        return succeeded;
    }
    /**
     * The number of succeeded run events
     */
    public void setSucceeded(int succeeded) {
        this.succeeded = succeeded;
    }

    /**
     * The number of errored run events
     */
    public int getErrored() {
        return errored;
    }
    /**
     * The number of errored run events
     */
    public void setErrored(int errored) {
        this.errored = errored;
    }

    /**
     * The run events themselves
     */
    public java.util.List<AssertionRunEvent> getRunEvents() {
        return runEvents;
    }
    /**
     * The run events themselves
     */
    public void setRunEvents(java.util.List<AssertionRunEvent> runEvents) {
        this.runEvents = runEvents;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("total: " + total);
        joiner.add("failed: " + failed);
        joiner.add("succeeded: " + succeeded);
        joiner.add("errored: " + errored);
        if (runEvents != null) {
            joiner.add("runEvents: " + runEvents);
        }
        return joiner.toString();
    }

    public static AssertionRunEventsResult.Builder builder() {
        return new AssertionRunEventsResult.Builder();
    }

    public static class Builder {

        private int total;
        private int failed;
        private int succeeded;
        private int errored;
        private java.util.List<AssertionRunEvent> runEvents;

        public Builder() {
        }

        /**
         * The total number of run events returned
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The number of failed run events
         */
        public Builder setFailed(int failed) {
            this.failed = failed;
            return this;
        }

        /**
         * The number of succeeded run events
         */
        public Builder setSucceeded(int succeeded) {
            this.succeeded = succeeded;
            return this;
        }

        /**
         * The number of errored run events
         */
        public Builder setErrored(int errored) {
            this.errored = errored;
            return this;
        }

        /**
         * The run events themselves
         */
        public Builder setRunEvents(java.util.List<AssertionRunEvent> runEvents) {
            this.runEvents = runEvents;
            return this;
        }


        public AssertionRunEventsResult build() {
            return new AssertionRunEventsResult(total, failed, succeeded, errored, runEvents);
        }

    }
}
