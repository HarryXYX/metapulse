package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The result of a Dataset operations query
 */
public class OperationsQueryResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<OperationsAggregation> buckets;
    private OperationsAggregationsResult aggregations;

    public OperationsQueryResult() {
    }

    public OperationsQueryResult(java.util.List<OperationsAggregation> buckets, OperationsAggregationsResult aggregations) {
        this.buckets = buckets;
        this.aggregations = aggregations;
    }

    /**
     * A set of relevant time windows for use in displaying operations
     */
    public java.util.List<OperationsAggregation> getBuckets() {
        return buckets;
    }
    /**
     * A set of relevant time windows for use in displaying operations
     */
    public void setBuckets(java.util.List<OperationsAggregation> buckets) {
        this.buckets = buckets;
    }

    /**
     * A set of rolled up aggregations about the Dataset operations
     */
    public OperationsAggregationsResult getAggregations() {
        return aggregations;
    }
    /**
     * A set of rolled up aggregations about the Dataset operations
     */
    public void setAggregations(OperationsAggregationsResult aggregations) {
        this.aggregations = aggregations;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (buckets != null) {
            joiner.add("buckets: " + buckets);
        }
        if (aggregations != null) {
            joiner.add("aggregations: " + aggregations);
        }
        return joiner.toString();
    }

    public static OperationsQueryResult.Builder builder() {
        return new OperationsQueryResult.Builder();
    }

    public static class Builder {

        private java.util.List<OperationsAggregation> buckets;
        private OperationsAggregationsResult aggregations;

        public Builder() {
        }

        /**
         * A set of relevant time windows for use in displaying operations
         */
        public Builder setBuckets(java.util.List<OperationsAggregation> buckets) {
            this.buckets = buckets;
            return this;
        }

        /**
         * A set of rolled up aggregations about the Dataset operations
         */
        public Builder setAggregations(OperationsAggregationsResult aggregations) {
            this.aggregations = aggregations;
            return this;
        }


        public OperationsQueryResult build() {
            return new OperationsQueryResult(buckets, aggregations);
        }

    }
}
