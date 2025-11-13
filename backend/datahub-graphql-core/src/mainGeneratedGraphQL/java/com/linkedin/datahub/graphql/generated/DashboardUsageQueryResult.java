package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The result of a dashboard usage query
 */
public class DashboardUsageQueryResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<DashboardUsageAggregation> buckets;
    private DashboardUsageQueryResultAggregations aggregations;
    private java.util.List<DashboardUsageMetrics> metrics;

    public DashboardUsageQueryResult() {
    }

    public DashboardUsageQueryResult(java.util.List<DashboardUsageAggregation> buckets, DashboardUsageQueryResultAggregations aggregations, java.util.List<DashboardUsageMetrics> metrics) {
        this.buckets = buckets;
        this.aggregations = aggregations;
        this.metrics = metrics;
    }

    /**
     * A set of relevant time windows for use in displaying usage statistics
     */
    public java.util.List<DashboardUsageAggregation> getBuckets() {
        return buckets;
    }
    /**
     * A set of relevant time windows for use in displaying usage statistics
     */
    public void setBuckets(java.util.List<DashboardUsageAggregation> buckets) {
        this.buckets = buckets;
    }

    /**
     * A set of rolled up aggregations about the dashboard usage
     */
    public DashboardUsageQueryResultAggregations getAggregations() {
        return aggregations;
    }
    /**
     * A set of rolled up aggregations about the dashboard usage
     */
    public void setAggregations(DashboardUsageQueryResultAggregations aggregations) {
        this.aggregations = aggregations;
    }

    /**
     * A set of absolute dashboard usage metrics
     */
    public java.util.List<DashboardUsageMetrics> getMetrics() {
        return metrics;
    }
    /**
     * A set of absolute dashboard usage metrics
     */
    public void setMetrics(java.util.List<DashboardUsageMetrics> metrics) {
        this.metrics = metrics;
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
        if (metrics != null) {
            joiner.add("metrics: " + metrics);
        }
        return joiner.toString();
    }

    public static DashboardUsageQueryResult.Builder builder() {
        return new DashboardUsageQueryResult.Builder();
    }

    public static class Builder {

        private java.util.List<DashboardUsageAggregation> buckets;
        private DashboardUsageQueryResultAggregations aggregations;
        private java.util.List<DashboardUsageMetrics> metrics;

        public Builder() {
        }

        /**
         * A set of relevant time windows for use in displaying usage statistics
         */
        public Builder setBuckets(java.util.List<DashboardUsageAggregation> buckets) {
            this.buckets = buckets;
            return this;
        }

        /**
         * A set of rolled up aggregations about the dashboard usage
         */
        public Builder setAggregations(DashboardUsageQueryResultAggregations aggregations) {
            this.aggregations = aggregations;
            return this;
        }

        /**
         * A set of absolute dashboard usage metrics
         */
        public Builder setMetrics(java.util.List<DashboardUsageMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }


        public DashboardUsageQueryResult build() {
            return new DashboardUsageQueryResult(buckets, aggregations, metrics);
        }

    }
}
