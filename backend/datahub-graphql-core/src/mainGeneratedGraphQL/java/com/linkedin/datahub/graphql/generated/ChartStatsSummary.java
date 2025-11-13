package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Experimental - subject to change. A summary of usage metrics about a Chart.
 */
public class ChartStatsSummary implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer viewCount;
    private Integer viewCountLast30Days;
    private Integer uniqueUserCountLast30Days;
    private java.util.List<CorpUser> topUsersLast30Days;

    public ChartStatsSummary() {
    }

    public ChartStatsSummary(Integer viewCount, Integer viewCountLast30Days, Integer uniqueUserCountLast30Days, java.util.List<CorpUser> topUsersLast30Days) {
        this.viewCount = viewCount;
        this.viewCountLast30Days = viewCountLast30Days;
        this.uniqueUserCountLast30Days = uniqueUserCountLast30Days;
        this.topUsersLast30Days = topUsersLast30Days;
    }

    /**
     * The total view count for the chart
     */
    public Integer getViewCount() {
        return viewCount;
    }
    /**
     * The total view count for the chart
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * The view count in the last 30 days
     */
    public Integer getViewCountLast30Days() {
        return viewCountLast30Days;
    }
    /**
     * The view count in the last 30 days
     */
    public void setViewCountLast30Days(Integer viewCountLast30Days) {
        this.viewCountLast30Days = viewCountLast30Days;
    }

    /**
     * The unique user count in the past 30 days
     */
    public Integer getUniqueUserCountLast30Days() {
        return uniqueUserCountLast30Days;
    }
    /**
     * The unique user count in the past 30 days
     */
    public void setUniqueUserCountLast30Days(Integer uniqueUserCountLast30Days) {
        this.uniqueUserCountLast30Days = uniqueUserCountLast30Days;
    }

    /**
     * The top users in the past 30 days
     */
    public java.util.List<CorpUser> getTopUsersLast30Days() {
        return topUsersLast30Days;
    }
    /**
     * The top users in the past 30 days
     */
    public void setTopUsersLast30Days(java.util.List<CorpUser> topUsersLast30Days) {
        this.topUsersLast30Days = topUsersLast30Days;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (viewCount != null) {
            joiner.add("viewCount: " + viewCount);
        }
        if (viewCountLast30Days != null) {
            joiner.add("viewCountLast30Days: " + viewCountLast30Days);
        }
        if (uniqueUserCountLast30Days != null) {
            joiner.add("uniqueUserCountLast30Days: " + uniqueUserCountLast30Days);
        }
        if (topUsersLast30Days != null) {
            joiner.add("topUsersLast30Days: " + topUsersLast30Days);
        }
        return joiner.toString();
    }

    public static ChartStatsSummary.Builder builder() {
        return new ChartStatsSummary.Builder();
    }

    public static class Builder {

        private Integer viewCount;
        private Integer viewCountLast30Days;
        private Integer uniqueUserCountLast30Days;
        private java.util.List<CorpUser> topUsersLast30Days;

        public Builder() {
        }

        /**
         * The total view count for the chart
         */
        public Builder setViewCount(Integer viewCount) {
            this.viewCount = viewCount;
            return this;
        }

        /**
         * The view count in the last 30 days
         */
        public Builder setViewCountLast30Days(Integer viewCountLast30Days) {
            this.viewCountLast30Days = viewCountLast30Days;
            return this;
        }

        /**
         * The unique user count in the past 30 days
         */
        public Builder setUniqueUserCountLast30Days(Integer uniqueUserCountLast30Days) {
            this.uniqueUserCountLast30Days = uniqueUserCountLast30Days;
            return this;
        }

        /**
         * The top users in the past 30 days
         */
        public Builder setTopUsersLast30Days(java.util.List<CorpUser> topUsersLast30Days) {
            this.topUsersLast30Days = topUsersLast30Days;
            return this;
        }


        public ChartStatsSummary build() {
            return new ChartStatsSummary(viewCount, viewCountLast30Days, uniqueUserCountLast30Days, topUsersLast30Days);
        }

    }
}
