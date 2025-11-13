package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about an Freshness assertion.
 */
public class FreshnessAssertionInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String entityUrn;
    @javax.annotation.Nonnull
    private FreshnessAssertionType type;
    @javax.annotation.Nonnull
    private FreshnessAssertionSchedule schedule;
    private DatasetFilter filter;

    public FreshnessAssertionInfo() {
    }

    public FreshnessAssertionInfo(String entityUrn, FreshnessAssertionType type, FreshnessAssertionSchedule schedule, DatasetFilter filter) {
        this.entityUrn = entityUrn;
        this.type = type;
        this.schedule = schedule;
        this.filter = filter;
    }

    /**
     * The urn of the entity that the Freshness assertion is related to
     */
    public String getEntityUrn() {
        return entityUrn;
    }
    /**
     * The urn of the entity that the Freshness assertion is related to
     */
    public void setEntityUrn(String entityUrn) {
        this.entityUrn = entityUrn;
    }

    /**
     * The type of the Freshness Assertion
     */
    public FreshnessAssertionType getType() {
        return type;
    }
    /**
     * The type of the Freshness Assertion
     */
    public void setType(FreshnessAssertionType type) {
        this.type = type;
    }

    /**
     * Produce FAIL Assertion Result if the asset is not updated on the cadence and within the time range described by the schedule.
     */
    public FreshnessAssertionSchedule getSchedule() {
        return schedule;
    }
    /**
     * Produce FAIL Assertion Result if the asset is not updated on the cadence and within the time range described by the schedule.
     */
    public void setSchedule(FreshnessAssertionSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * A filter applied when querying an external Dataset or Table
     */
    public DatasetFilter getFilter() {
        return filter;
    }
    /**
     * A filter applied when querying an external Dataset or Table
     */
    public void setFilter(DatasetFilter filter) {
        this.filter = filter;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entityUrn != null) {
            joiner.add("entityUrn: \"" + entityUrn + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (schedule != null) {
            joiner.add("schedule: " + schedule);
        }
        if (filter != null) {
            joiner.add("filter: " + filter);
        }
        return joiner.toString();
    }

    public static FreshnessAssertionInfo.Builder builder() {
        return new FreshnessAssertionInfo.Builder();
    }

    public static class Builder {

        private String entityUrn;
        private FreshnessAssertionType type;
        private FreshnessAssertionSchedule schedule;
        private DatasetFilter filter;

        public Builder() {
        }

        /**
         * The urn of the entity that the Freshness assertion is related to
         */
        public Builder setEntityUrn(String entityUrn) {
            this.entityUrn = entityUrn;
            return this;
        }

        /**
         * The type of the Freshness Assertion
         */
        public Builder setType(FreshnessAssertionType type) {
            this.type = type;
            return this;
        }

        /**
         * Produce FAIL Assertion Result if the asset is not updated on the cadence and within the time range described by the schedule.
         */
        public Builder setSchedule(FreshnessAssertionSchedule schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * A filter applied when querying an external Dataset or Table
         */
        public Builder setFilter(DatasetFilter filter) {
            this.filter = filter;
            return this;
        }


        public FreshnessAssertionInfo build() {
            return new FreshnessAssertionInfo(entityUrn, type, schedule, filter);
        }

    }
}
