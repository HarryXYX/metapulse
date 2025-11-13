package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Represents lineage information for ML entities.
 */
public class MLModelLineageInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> trainingJobs;
    private java.util.List<String> downstreamJobs;

    public MLModelLineageInfo() {
    }

    public MLModelLineageInfo(java.util.List<String> trainingJobs, java.util.List<String> downstreamJobs) {
        this.trainingJobs = trainingJobs;
        this.downstreamJobs = downstreamJobs;
    }

    /**
     * List of jobs or processes used to train the model.
     */
    public java.util.List<String> getTrainingJobs() {
        return trainingJobs;
    }
    /**
     * List of jobs or processes used to train the model.
     */
    public void setTrainingJobs(java.util.List<String> trainingJobs) {
        this.trainingJobs = trainingJobs;
    }

    /**
     * List of jobs or processes that use this model.
     */
    public java.util.List<String> getDownstreamJobs() {
        return downstreamJobs;
    }
    /**
     * List of jobs or processes that use this model.
     */
    public void setDownstreamJobs(java.util.List<String> downstreamJobs) {
        this.downstreamJobs = downstreamJobs;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (trainingJobs != null) {
            joiner.add("trainingJobs: " + trainingJobs);
        }
        if (downstreamJobs != null) {
            joiner.add("downstreamJobs: " + downstreamJobs);
        }
        return joiner.toString();
    }

    public static MLModelLineageInfo.Builder builder() {
        return new MLModelLineageInfo.Builder();
    }

    public static class Builder {

        private java.util.List<String> trainingJobs;
        private java.util.List<String> downstreamJobs;

        public Builder() {
        }

        /**
         * List of jobs or processes used to train the model.
         */
        public Builder setTrainingJobs(java.util.List<String> trainingJobs) {
            this.trainingJobs = trainingJobs;
            return this;
        }

        /**
         * List of jobs or processes that use this model.
         */
        public Builder setDownstreamJobs(java.util.List<String> downstreamJobs) {
            this.downstreamJobs = downstreamJobs;
            return this;
        }


        public MLModelLineageInfo build() {
            return new MLModelLineageInfo(trainingJobs, downstreamJobs);
        }

    }
}
