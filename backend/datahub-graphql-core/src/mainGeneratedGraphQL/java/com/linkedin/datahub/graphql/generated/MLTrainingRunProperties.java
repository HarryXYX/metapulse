package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Properties specific to an ML model training run instance
 */
public class MLTrainingRunProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private java.util.List<String> outputUrls;
    private java.util.List<MLHyperParam> hyperParams;
    private java.util.List<MLMetric> trainingMetrics;

    public MLTrainingRunProperties() {
    }

    public MLTrainingRunProperties(String id, java.util.List<String> outputUrls, java.util.List<MLHyperParam> hyperParams, java.util.List<MLMetric> trainingMetrics) {
        this.id = id;
        this.outputUrls = outputUrls;
        this.hyperParams = hyperParams;
        this.trainingMetrics = trainingMetrics;
    }

    /**
     * Unique identifier for this training run
     */
    public String getId() {
        return id;
    }
    /**
     * Unique identifier for this training run
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * List of URLs to access training run outputs (e.g. model artifacts, logs)
     */
    public java.util.List<String> getOutputUrls() {
        return outputUrls;
    }
    /**
     * List of URLs to access training run outputs (e.g. model artifacts, logs)
     */
    public void setOutputUrls(java.util.List<String> outputUrls) {
        this.outputUrls = outputUrls;
    }

    /**
     * Hyperparameters used in this training run
     */
    public java.util.List<MLHyperParam> getHyperParams() {
        return hyperParams;
    }
    /**
     * Hyperparameters used in this training run
     */
    public void setHyperParams(java.util.List<MLHyperParam> hyperParams) {
        this.hyperParams = hyperParams;
    }

    /**
     * Performance metrics recorded during this training run
     */
    public java.util.List<MLMetric> getTrainingMetrics() {
        return trainingMetrics;
    }
    /**
     * Performance metrics recorded during this training run
     */
    public void setTrainingMetrics(java.util.List<MLMetric> trainingMetrics) {
        this.trainingMetrics = trainingMetrics;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
        if (outputUrls != null) {
            joiner.add("outputUrls: " + outputUrls);
        }
        if (hyperParams != null) {
            joiner.add("hyperParams: " + hyperParams);
        }
        if (trainingMetrics != null) {
            joiner.add("trainingMetrics: " + trainingMetrics);
        }
        return joiner.toString();
    }

    public static MLTrainingRunProperties.Builder builder() {
        return new MLTrainingRunProperties.Builder();
    }

    public static class Builder {

        private String id;
        private java.util.List<String> outputUrls;
        private java.util.List<MLHyperParam> hyperParams;
        private java.util.List<MLMetric> trainingMetrics;

        public Builder() {
        }

        /**
         * Unique identifier for this training run
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * List of URLs to access training run outputs (e.g. model artifacts, logs)
         */
        public Builder setOutputUrls(java.util.List<String> outputUrls) {
            this.outputUrls = outputUrls;
            return this;
        }

        /**
         * Hyperparameters used in this training run
         */
        public Builder setHyperParams(java.util.List<MLHyperParam> hyperParams) {
            this.hyperParams = hyperParams;
            return this;
        }

        /**
         * Performance metrics recorded during this training run
         */
        public Builder setTrainingMetrics(java.util.List<MLMetric> trainingMetrics) {
            this.trainingMetrics = trainingMetrics;
            return this;
        }


        public MLTrainingRunProperties build() {
            return new MLTrainingRunProperties(id, outputUrls, hyperParams, trainingMetrics);
        }

    }
}
