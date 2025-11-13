package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Result returned when fetching step state
 */
public class BatchGetStepStatesResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<StepStateResult> results;

    public BatchGetStepStatesResult() {
    }

    public BatchGetStepStatesResult(java.util.List<StepStateResult> results) {
        this.results = results;
    }

    /**
     * The step states
     */
    public java.util.List<StepStateResult> getResults() {
        return results;
    }
    /**
     * The step states
     */
    public void setResults(java.util.List<StepStateResult> results) {
        this.results = results;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (results != null) {
            joiner.add("results: " + results);
        }
        return joiner.toString();
    }

    public static BatchGetStepStatesResult.Builder builder() {
        return new BatchGetStepStatesResult.Builder();
    }

    public static class Builder {

        private java.util.List<StepStateResult> results;

        public Builder() {
        }

        /**
         * The step states
         */
        public Builder setResults(java.util.List<StepStateResult> results) {
            this.results = results;
            return this;
        }


        public BatchGetStepStatesResult build() {
            return new BatchGetStepStatesResult(results);
        }

    }
}
