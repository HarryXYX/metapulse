package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Experimental - subject to change. A summary of usage metrics about a Dataset.
 */
public class DatasetStatsSummary implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer queryCountLast30Days;
    private Integer uniqueUserCountLast30Days;
    private java.util.List<CorpUser> topUsersLast30Days;

    public DatasetStatsSummary() {
    }

    public DatasetStatsSummary(Integer queryCountLast30Days, Integer uniqueUserCountLast30Days, java.util.List<CorpUser> topUsersLast30Days) {
        this.queryCountLast30Days = queryCountLast30Days;
        this.uniqueUserCountLast30Days = uniqueUserCountLast30Days;
        this.topUsersLast30Days = topUsersLast30Days;
    }

    /**
     * The query count in the past 30 days
     */
    public Integer getQueryCountLast30Days() {
        return queryCountLast30Days;
    }
    /**
     * The query count in the past 30 days
     */
    public void setQueryCountLast30Days(Integer queryCountLast30Days) {
        this.queryCountLast30Days = queryCountLast30Days;
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
        if (queryCountLast30Days != null) {
            joiner.add("queryCountLast30Days: " + queryCountLast30Days);
        }
        if (uniqueUserCountLast30Days != null) {
            joiner.add("uniqueUserCountLast30Days: " + uniqueUserCountLast30Days);
        }
        if (topUsersLast30Days != null) {
            joiner.add("topUsersLast30Days: " + topUsersLast30Days);
        }
        return joiner.toString();
    }

    public static DatasetStatsSummary.Builder builder() {
        return new DatasetStatsSummary.Builder();
    }

    public static class Builder {

        private Integer queryCountLast30Days;
        private Integer uniqueUserCountLast30Days;
        private java.util.List<CorpUser> topUsersLast30Days;

        public Builder() {
        }

        /**
         * The query count in the past 30 days
         */
        public Builder setQueryCountLast30Days(Integer queryCountLast30Days) {
            this.queryCountLast30Days = queryCountLast30Days;
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


        public DatasetStatsSummary build() {
            return new DatasetStatsSummary(queryCountLast30Days, uniqueUserCountLast30Days, topUsersLast30Days);
        }

    }
}
