package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A set of rolled up aggregations about the Dashboard usage
 */
public class DashboardUsageQueryResultAggregations implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer uniqueUserCount;
    private java.util.List<DashboardUserUsageCounts> users;
    private Integer viewsCount;
    private Integer executionsCount;

    public DashboardUsageQueryResultAggregations() {
    }

    public DashboardUsageQueryResultAggregations(Integer uniqueUserCount, java.util.List<DashboardUserUsageCounts> users, Integer viewsCount, Integer executionsCount) {
        this.uniqueUserCount = uniqueUserCount;
        this.users = users;
        this.viewsCount = viewsCount;
        this.executionsCount = executionsCount;
    }

    /**
     * The count of unique Dashboard users within the queried time range
     */
    public Integer getUniqueUserCount() {
        return uniqueUserCount;
    }
    /**
     * The count of unique Dashboard users within the queried time range
     */
    public void setUniqueUserCount(Integer uniqueUserCount) {
        this.uniqueUserCount = uniqueUserCount;
    }

    /**
     * The specific per user usage counts within the queried time range
     */
    public java.util.List<DashboardUserUsageCounts> getUsers() {
        return users;
    }
    /**
     * The specific per user usage counts within the queried time range
     */
    public void setUsers(java.util.List<DashboardUserUsageCounts> users) {
        this.users = users;
    }

    /**
     * The total number of dashboard views within the queried time range
     */
    public Integer getViewsCount() {
        return viewsCount;
    }
    /**
     * The total number of dashboard views within the queried time range
     */
    public void setViewsCount(Integer viewsCount) {
        this.viewsCount = viewsCount;
    }

    /**
     * The total number of dashboard executions within the queried time range
     */
    public Integer getExecutionsCount() {
        return executionsCount;
    }
    /**
     * The total number of dashboard executions within the queried time range
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
        if (users != null) {
            joiner.add("users: " + users);
        }
        if (viewsCount != null) {
            joiner.add("viewsCount: " + viewsCount);
        }
        if (executionsCount != null) {
            joiner.add("executionsCount: " + executionsCount);
        }
        return joiner.toString();
    }

    public static DashboardUsageQueryResultAggregations.Builder builder() {
        return new DashboardUsageQueryResultAggregations.Builder();
    }

    public static class Builder {

        private Integer uniqueUserCount;
        private java.util.List<DashboardUserUsageCounts> users;
        private Integer viewsCount;
        private Integer executionsCount;

        public Builder() {
        }

        /**
         * The count of unique Dashboard users within the queried time range
         */
        public Builder setUniqueUserCount(Integer uniqueUserCount) {
            this.uniqueUserCount = uniqueUserCount;
            return this;
        }

        /**
         * The specific per user usage counts within the queried time range
         */
        public Builder setUsers(java.util.List<DashboardUserUsageCounts> users) {
            this.users = users;
            return this;
        }

        /**
         * The total number of dashboard views within the queried time range
         */
        public Builder setViewsCount(Integer viewsCount) {
            this.viewsCount = viewsCount;
            return this;
        }

        /**
         * The total number of dashboard executions within the queried time range
         */
        public Builder setExecutionsCount(Integer executionsCount) {
            this.executionsCount = executionsCount;
            return this;
        }


        public DashboardUsageQueryResultAggregations build() {
            return new DashboardUsageQueryResultAggregations(uniqueUserCount, users, viewsCount, executionsCount);
        }

    }
}
