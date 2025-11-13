package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A set of absolute dashboard usage metrics
 */
public class DashboardUsageMetrics implements java.io.Serializable, TimeSeriesAspect {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Long timestampMillis;
    private Integer favoritesCount;
    private Integer viewsCount;
    private Integer executionsCount;
    private Long lastViewed;

    public DashboardUsageMetrics() {
    }

    public DashboardUsageMetrics(Long timestampMillis, Integer favoritesCount, Integer viewsCount, Integer executionsCount, Long lastViewed) {
        this.timestampMillis = timestampMillis;
        this.favoritesCount = favoritesCount;
        this.viewsCount = viewsCount;
        this.executionsCount = executionsCount;
        this.lastViewed = lastViewed;
    }

    /**
     * The time at which the metrics were reported
     */
    public Long getTimestampMillis() {
        return timestampMillis;
    }
    /**
     * The time at which the metrics were reported
     */
    public void setTimestampMillis(Long timestampMillis) {
        this.timestampMillis = timestampMillis;
    }

    /**
     * The total number of times dashboard has been favorited
FIXME: Qualifies as Popularity Metric rather than Usage Metric?
     */
    public Integer getFavoritesCount() {
        return favoritesCount;
    }
    /**
     * The total number of times dashboard has been favorited
FIXME: Qualifies as Popularity Metric rather than Usage Metric?
     */
    public void setFavoritesCount(Integer favoritesCount) {
        this.favoritesCount = favoritesCount;
    }

    /**
     * The total number of dashboard views
     */
    public Integer getViewsCount() {
        return viewsCount;
    }
    /**
     * The total number of dashboard views
     */
    public void setViewsCount(Integer viewsCount) {
        this.viewsCount = viewsCount;
    }

    /**
     * The total number of dashboard execution
     */
    public Integer getExecutionsCount() {
        return executionsCount;
    }
    /**
     * The total number of dashboard execution
     */
    public void setExecutionsCount(Integer executionsCount) {
        this.executionsCount = executionsCount;
    }

    /**
     * The time when this dashboard was last viewed
     */
    public Long getLastViewed() {
        return lastViewed;
    }
    /**
     * The time when this dashboard was last viewed
     */
    public void setLastViewed(Long lastViewed) {
        this.lastViewed = lastViewed;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (timestampMillis != null) {
            joiner.add("timestampMillis: " + timestampMillis);
        }
        if (favoritesCount != null) {
            joiner.add("favoritesCount: " + favoritesCount);
        }
        if (viewsCount != null) {
            joiner.add("viewsCount: " + viewsCount);
        }
        if (executionsCount != null) {
            joiner.add("executionsCount: " + executionsCount);
        }
        if (lastViewed != null) {
            joiner.add("lastViewed: " + lastViewed);
        }
        return joiner.toString();
    }

    public static DashboardUsageMetrics.Builder builder() {
        return new DashboardUsageMetrics.Builder();
    }

    public static class Builder {

        private Long timestampMillis;
        private Integer favoritesCount;
        private Integer viewsCount;
        private Integer executionsCount;
        private Long lastViewed;

        public Builder() {
        }

        /**
         * The time at which the metrics were reported
         */
        public Builder setTimestampMillis(Long timestampMillis) {
            this.timestampMillis = timestampMillis;
            return this;
        }

        /**
         * The total number of times dashboard has been favorited
FIXME: Qualifies as Popularity Metric rather than Usage Metric?
         */
        public Builder setFavoritesCount(Integer favoritesCount) {
            this.favoritesCount = favoritesCount;
            return this;
        }

        /**
         * The total number of dashboard views
         */
        public Builder setViewsCount(Integer viewsCount) {
            this.viewsCount = viewsCount;
            return this;
        }

        /**
         * The total number of dashboard execution
         */
        public Builder setExecutionsCount(Integer executionsCount) {
            this.executionsCount = executionsCount;
            return this;
        }

        /**
         * The time when this dashboard was last viewed
         */
        public Builder setLastViewed(Long lastViewed) {
            this.lastViewed = lastViewed;
            return this;
        }


        public DashboardUsageMetrics build() {
            return new DashboardUsageMetrics(timestampMillis, favoritesCount, viewsCount, executionsCount, lastViewed);
        }

    }
}
