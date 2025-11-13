package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class SystemFreshness implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String systemName;
    @javax.annotation.Nonnull
    private Long freshnessMillis;

    public SystemFreshness() {
    }

    public SystemFreshness(String systemName, Long freshnessMillis) {
        this.systemName = systemName;
        this.freshnessMillis = freshnessMillis;
    }

    /**
     * Name of the system
     */
    public String getSystemName() {
        return systemName;
    }
    /**
     * Name of the system
     */
    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    /**
     * The latest timestamp in millis of the system that was used to respond to this query
In case a cache was consulted, this reflects the freshness of the cache
In case an index was consulted, this reflects the freshness of the index
     */
    public Long getFreshnessMillis() {
        return freshnessMillis;
    }
    /**
     * The latest timestamp in millis of the system that was used to respond to this query
In case a cache was consulted, this reflects the freshness of the cache
In case an index was consulted, this reflects the freshness of the index
     */
    public void setFreshnessMillis(Long freshnessMillis) {
        this.freshnessMillis = freshnessMillis;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (systemName != null) {
            joiner.add("systemName: \"" + systemName + "\"");
        }
        if (freshnessMillis != null) {
            joiner.add("freshnessMillis: " + freshnessMillis);
        }
        return joiner.toString();
    }

    public static SystemFreshness.Builder builder() {
        return new SystemFreshness.Builder();
    }

    public static class Builder {

        private String systemName;
        private Long freshnessMillis;

        public Builder() {
        }

        /**
         * Name of the system
         */
        public Builder setSystemName(String systemName) {
            this.systemName = systemName;
            return this;
        }

        /**
         * The latest timestamp in millis of the system that was used to respond to this query
In case a cache was consulted, this reflects the freshness of the cache
In case an index was consulted, this reflects the freshness of the index
         */
        public Builder setFreshnessMillis(Long freshnessMillis) {
            this.freshnessMillis = freshnessMillis;
            return this;
        }


        public SystemFreshness build() {
            return new SystemFreshness(systemName, freshnessMillis);
        }

    }
}
