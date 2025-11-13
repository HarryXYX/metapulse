package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Rolled up metrics about Dashboard usage over time
 */
public class DashboardUsageAggregationMetrics implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer uniqueUserCount;
    private Integer viewsCount;
    private Integer executionsCount;

    public DashboardUsageAggregationMetrics() {
    }

    public DashboardUsageAggregationMetrics(Integer uniqueUserCount, Integer viewsCount, Integer executionsCount) {
        this.uniqueUserCount = uniqueUserCount;
        this.viewsCount = viewsCount;
        this.executionsCount = executionsCount;
    }

    /**
     * The unique number of dashboard users within the time range
     */
    public Integer getUniqueUserCount() {
        return uniqueUserCount;
    }
    /**
     * The unique number of dashboard users within the time range
     */
    public void setUniqueUserCount(Integer uniqueUserCount) {
        this.uniqueUserCount = uniqueUserCount;
    }

    /**
     * The total number of dashboard views within the time range
     */
    public Integer getViewsCount() {
        return viewsCount;
    }
    /**
     * The total number of dashboard views within the time range
     */
    public void setViewsCount(Integer viewsCount) {
        this.viewsCount = viewsCount;
    }

    /**
     * The total number of dashboard executions within the time range
     */
    public Integer getExecutionsCount() {
        return executionsCount;
    }
    /**
     * The total number of dashboard executions within the time range
     */
    public void setExecutionsCount(Integer executionsCount) {
        this.executionsCount = executionsCount;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (uniqueUserCount != null) {
            joiner.add("uniqueUserCount: " + uniqueUserCount);
        }
        if (viewsCount != null) {
            joiner.add("viewsCount: " + viewsCount);
        }
        if (executionsCount != null) {
            joiner.add("executionsCount: " + executionsCount);
        }
        return joiner.toString();
    }

    public static DashboardUsageAggregationMetrics.Builder builder() {
        return new DashboardUsageAggregationMetrics.Builder();
    }

    public static class Builder {

        private Integer uniqueUserCount;
        private Integer viewsCount;
        private Integer executionsCount;

        public Builder() {
        }

        /**
         * The unique number of dashboard users within the time range
         */
        public Builder setUniqueUserCount(Integer uniqueUserCount) {
            this.uniqueUserCount = uniqueUserCount;
            return this;
        }

        /**
         * The total number of dashboard views within the time range
         */
        public Builder setViewsCount(Integer viewsCount) {
            this.viewsCount = viewsCount;
            return this;
        }

        /**
         * The total number of dashboard executions within the time range
         */
        public Builder setExecutionsCount(Integer executionsCount) {
            this.executionsCount = executionsCount;
            return this;
        }


        public DashboardUsageAggregationMetrics build() {
            return new DashboardUsageAggregationMetrics(uniqueUserCount, viewsCount, executionsCount);
        }

    }
}
