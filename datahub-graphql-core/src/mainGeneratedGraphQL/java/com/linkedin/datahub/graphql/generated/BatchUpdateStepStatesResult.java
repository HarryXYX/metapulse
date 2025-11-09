package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Result returned when fetching step state
 */
public class BatchUpdateStepStatesResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<UpdateStepStateResult> results;

    public BatchUpdateStepStatesResult() {
    }

    public BatchUpdateStepStatesResult(java.util.List<UpdateStepStateResult> results) {
        this.results = results;
    }

    /**
     * Results for each step
     */
    public java.util.List<UpdateStepStateResult> getResults() {
        return results;
    }
    /**
     * Results for each step
     */
    public void setResults(java.util.List<UpdateStepStateResult> results) {
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

    public static BatchUpdateStepStatesResult.Builder builder() {
        return new BatchUpdateStepStatesResult.Builder();
    }

    public static class Builder {

        private java.util.List<UpdateStepStateResult> results;

        public Builder() {
        }

        /**
         * Results for each step
         */
        public Builder setResults(java.util.List<UpdateStepStateResult> results) {
            this.results = results;
            return this;
        }


        public BatchUpdateStepStatesResult build() {
            return new BatchUpdateStepStatesResult(results);
        }

    }
}
