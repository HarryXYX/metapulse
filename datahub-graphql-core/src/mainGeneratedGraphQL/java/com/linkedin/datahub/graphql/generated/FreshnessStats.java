package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Freshness stats for a query result.
Captures whether the query was served out of a cache, what the staleness was, etc.
 */
public class FreshnessStats implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean cached;
    private java.util.List<SystemFreshness> systemFreshness;

    public FreshnessStats() {
    }

    public FreshnessStats(Boolean cached, java.util.List<SystemFreshness> systemFreshness) {
        this.cached = cached;
        this.systemFreshness = systemFreshness;
    }

    /**
     * Whether a cache was used to respond to this query
     */
    public Boolean getCached() {
        return cached;
    }
    /**
     * Whether a cache was used to respond to this query
     */
    public void setCached(Boolean cached) {
        this.cached = cached;
    }

    /**
     * The latest timestamp in millis of the system that was used to respond to this query
In case a cache was consulted, this reflects the freshness of the cache
In case an index was consulted, this reflects the freshness of the index
     */
    public java.util.List<SystemFreshness> getSystemFreshness() {
        return systemFreshness;
    }
    /**
     * The latest timestamp in millis of the system that was used to respond to this query
In case a cache was consulted, this reflects the freshness of the cache
In case an index was consulted, this reflects the freshness of the index
     */
    public void setSystemFreshness(java.util.List<SystemFreshness> systemFreshness) {
        this.systemFreshness = systemFreshness;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cached != null) {
            joiner.add("cached: " + cached);
        }
        if (systemFreshness != null) {
            joiner.add("systemFreshness: " + systemFreshness);
        }
        return joiner.toString();
    }

    public static FreshnessStats.Builder builder() {
        return new FreshnessStats.Builder();
    }

    public static class Builder {

        private Boolean cached;
        private java.util.List<SystemFreshness> systemFreshness;

        public Builder() {
        }

        /**
         * Whether a cache was used to respond to this query
         */
        public Builder setCached(Boolean cached) {
            this.cached = cached;
            return this;
        }

        /**
         * The latest timestamp in millis of the system that was used to respond to this query
In case a cache was consulted, this reflects the freshness of the cache
In case an index was consulted, this reflects the freshness of the index
         */
        public Builder setSystemFreshness(java.util.List<SystemFreshness> systemFreshness) {
            this.systemFreshness = systemFreshness;
            return this;
        }


        public FreshnessStats build() {
            return new FreshnessStats(cached, systemFreshness);
        }

    }
}
