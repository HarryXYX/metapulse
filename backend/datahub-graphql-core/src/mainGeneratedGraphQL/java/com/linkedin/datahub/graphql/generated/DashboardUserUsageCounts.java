package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about individual user usage of a Dashboard
 */
public class DashboardUserUsageCounts implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CorpUser user;
    private Integer viewsCount;
    private Integer executionsCount;
    private Integer usageCount;

    public DashboardUserUsageCounts() {
    }

    public DashboardUserUsageCounts(CorpUser user, Integer viewsCount, Integer executionsCount, Integer usageCount) {
        this.user = user;
        this.viewsCount = viewsCount;
        this.executionsCount = executionsCount;
        this.usageCount = usageCount;
    }

    /**
     * The user of the Dashboard
     */
    public CorpUser getUser() {
        return user;
    }
    /**
     * The user of the Dashboard
     */
    public void setUser(CorpUser user) {
        this.user = user;
    }

    /**
     * number of times dashboard has been viewed by the user
     */
    public Integer getViewsCount() {
        return viewsCount;
    }
    /**
     * number of times dashboard has been viewed by the user
     */
    public void setViewsCount(Integer viewsCount) {
        this.viewsCount = viewsCount;
    }

    /**
     * number of dashboard executions by the user
     */
    public Integer getExecutionsCount() {
        return executionsCount;
    }
    /**
     * number of dashboard executions by the user
     */
    public void setExecutionsCount(Integer executionsCount) {
        this.executionsCount = executionsCount;
    }

    /**
     * Normalized numeric metric representing user's dashboard usage
Higher value represents more usage
     */
    public Integer getUsageCount() {
        return usageCount;
    }
    /**
     * Normalized numeric metric representing user's dashboard usage
Higher value represents more usage
     */
    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (user != null) {
            joiner.add("user: " + user);
        }
        if (viewsCount != null) {
            joiner.add("viewsCount: " + viewsCount);
        }
        if (executionsCount != null) {
            joiner.add("executionsCount: " + executionsCount);
        }
        if (usageCount != null) {
            joiner.add("usageCount: " + usageCount);
        }
        return joiner.toString();
    }

    public static DashboardUserUsageCounts.Builder builder() {
        return new DashboardUserUsageCounts.Builder();
    }

    public static class Builder {

        private CorpUser user;
        private Integer viewsCount;
        private Integer executionsCount;
        private Integer usageCount;

        public Builder() {
        }

        /**
         * The user of the Dashboard
         */
        public Builder setUser(CorpUser user) {
            this.user = user;
            return this;
        }

        /**
         * number of times dashboard has been viewed by the user
         */
        public Builder setViewsCount(Integer viewsCount) {
            this.viewsCount = viewsCount;
            return this;
        }

        /**
         * number of dashboard executions by the user
         */
        public Builder setExecutionsCount(Integer executionsCount) {
            this.executionsCount = executionsCount;
            return this;
        }

        /**
         * Normalized numeric metric representing user's dashboard usage
Higher value represents more usage
         */
        public Builder setUsageCount(Integer usageCount) {
            this.usageCount = usageCount;
            return this;
        }


        public DashboardUserUsageCounts build() {
            return new DashboardUserUsageCounts(user, viewsCount, executionsCount, usageCount);
        }

    }
}
