package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An aggregation of Dataset usage statistics
 */
public class UsageAggregation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Long bucket;
    private WindowDuration duration;
    private String resource;
    private UsageAggregationMetrics metrics;

    public UsageAggregation() {
    }

    public UsageAggregation(Long bucket, WindowDuration duration, String resource, UsageAggregationMetrics metrics) {
        this.bucket = bucket;
        this.duration = duration;
        this.resource = resource;
        this.metrics = metrics;
    }

    /**
     * The time window start time
     */
    public Long getBucket() {
        return bucket;
    }
    /**
     * The time window start time
     */
    public void setBucket(Long bucket) {
        this.bucket = bucket;
    }

    /**
     * The time window span
     */
    public WindowDuration getDuration() {
        return duration;
    }
    /**
     * The time window span
     */
    public void setDuration(WindowDuration duration) {
        this.duration = duration;
    }

    /**
     * The resource urn associated with the usage information, eg a Dataset urn
     */
    public String getResource() {
        return resource;
    }
    /**
     * The resource urn associated with the usage information, eg a Dataset urn
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * The rolled up usage metrics
     */
    public UsageAggregationMetrics getMetrics() {
        return metrics;
    }
    /**
     * The rolled up usage metrics
     */
    public void setMetrics(UsageAggregationMetrics metrics) {
        this.metrics = metrics;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (bucket != null) {
            joiner.add("bucket: " + bucket);
        }
        if (duration != null) {
            joiner.add("duration: " + duration);
        }
        if (resource != null) {
            joiner.add("resource: \"" + resource + "\"");
        }
        if (metrics != null) {
            joiner.add("metrics: " + metrics);
        }
        return joiner.toString();
    }

    public static UsageAggregation.Builder builder() {
        return new UsageAggregation.Builder();
    }

    public static class Builder {

        private Long bucket;
        private WindowDuration duration;
        private String resource;
        private UsageAggregationMetrics metrics;

        public Builder() {
        }

        /**
         * The time window start time
         */
        public Builder setBucket(Long bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * The time window span
         */
        public Builder setDuration(WindowDuration duration) {
            this.duration = duration;
            return this;
        }

        /**
         * The resource urn associated with the usage information, eg a Dataset urn
         */
        public Builder setResource(String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * The rolled up usage metrics
         */
        public Builder setMetrics(UsageAggregationMetrics metrics) {
            this.metrics = metrics;
            return this;
        }


        public UsageAggregation build() {
            return new UsageAggregation(bucket, duration, resource, metrics);
        }

    }
}
