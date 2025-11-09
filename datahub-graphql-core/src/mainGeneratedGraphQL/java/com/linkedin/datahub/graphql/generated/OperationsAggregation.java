package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An aggregation of Dataset operations statistics
 */
public class OperationsAggregation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Long bucket;
    private WindowDuration duration;
    private String resource;
    private OperationsAggregationsResult aggregations;

    public OperationsAggregation() {
    }

    public OperationsAggregation(Long bucket, WindowDuration duration, String resource, OperationsAggregationsResult aggregations) {
        this.bucket = bucket;
        this.duration = duration;
        this.resource = resource;
        this.aggregations = aggregations;
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
     * The resource urn associated with the operations information, eg a Dataset urn
     */
    public String getResource() {
        return resource;
    }
    /**
     * The resource urn associated with the operations information, eg a Dataset urn
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * The rolled up operations metrics
     */
    public OperationsAggregationsResult getAggregations() {
        return aggregations;
    }
    /**
     * The rolled up operations metrics
     */
    public void setAggregations(OperationsAggregationsResult aggregations) {
        this.aggregations = aggregations;
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
        if (aggregations != null) {
            joiner.add("aggregations: " + aggregations);
        }
        return joiner.toString();
    }

    public static OperationsAggregation.Builder builder() {
        return new OperationsAggregation.Builder();
    }

    public static class Builder {

        private Long bucket;
        private WindowDuration duration;
        private String resource;
        private OperationsAggregationsResult aggregations;

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
         * The resource urn associated with the operations information, eg a Dataset urn
         */
        public Builder setResource(String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * The rolled up operations metrics
         */
        public Builder setAggregations(OperationsAggregationsResult aggregations) {
            this.aggregations = aggregations;
            return this;
        }


        public OperationsAggregation build() {
            return new OperationsAggregation(bucket, duration, resource, aggregations);
        }

    }
}
