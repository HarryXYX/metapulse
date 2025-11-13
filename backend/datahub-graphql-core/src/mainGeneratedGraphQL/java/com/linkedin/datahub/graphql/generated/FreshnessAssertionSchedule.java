package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Attributes defining a single Freshness schedule.
 */
public class FreshnessAssertionSchedule implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private FreshnessAssertionScheduleType type;
    private FreshnessCronSchedule cron;
    private FixedIntervalSchedule fixedInterval;

    public FreshnessAssertionSchedule() {
    }

    public FreshnessAssertionSchedule(FreshnessAssertionScheduleType type, FreshnessCronSchedule cron, FixedIntervalSchedule fixedInterval) {
        this.type = type;
        this.cron = cron;
        this.fixedInterval = fixedInterval;
    }

    /**
     * The type of schedule
     */
    public FreshnessAssertionScheduleType getType() {
        return type;
    }
    /**
     * The type of schedule
     */
    public void setType(FreshnessAssertionScheduleType type) {
        this.type = type;
    }

    /**
     * A cron schedule. This is populated if the type is CRON.
     */
    public FreshnessCronSchedule getCron() {
        return cron;
    }
    /**
     * A cron schedule. This is populated if the type is CRON.
     */
    public void setCron(FreshnessCronSchedule cron) {
        this.cron = cron;
    }

    /**
     * A fixed interval schedule. This is populated if the type is FIXED_INTERVAL.
     */
    public FixedIntervalSchedule getFixedInterval() {
        return fixedInterval;
    }
    /**
     * A fixed interval schedule. This is populated if the type is FIXED_INTERVAL.
     */
    public void setFixedInterval(FixedIntervalSchedule fixedInterval) {
        this.fixedInterval = fixedInterval;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (cron != null) {
            joiner.add("cron: " + cron);
        }
        if (fixedInterval != null) {
            joiner.add("fixedInterval: " + fixedInterval);
        }
        return joiner.toString();
    }

    public static FreshnessAssertionSchedule.Builder builder() {
        return new FreshnessAssertionSchedule.Builder();
    }

    public static class Builder {

        private FreshnessAssertionScheduleType type;
        private FreshnessCronSchedule cron;
        private FixedIntervalSchedule fixedInterval;

        public Builder() {
        }

        /**
         * The type of schedule
         */
        public Builder setType(FreshnessAssertionScheduleType type) {
            this.type = type;
            return this;
        }

        /**
         * A cron schedule. This is populated if the type is CRON.
         */
        public Builder setCron(FreshnessCronSchedule cron) {
            this.cron = cron;
            return this;
        }

        /**
         * A fixed interval schedule. This is populated if the type is FIXED_INTERVAL.
         */
        public Builder setFixedInterval(FixedIntervalSchedule fixedInterval) {
            this.fixedInterval = fixedInterval;
            return this;
        }


        public FreshnessAssertionSchedule build() {
            return new FreshnessAssertionSchedule(type, cron, fixedInterval);
        }

    }
}
