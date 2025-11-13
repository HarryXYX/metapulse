package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A cron schedule
 */
public class CronSchedule implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String cron;
    @javax.annotation.Nonnull
    private String timezone;

    public CronSchedule() {
    }

    public CronSchedule(String cron, String timezone) {
        this.cron = cron;
        this.timezone = timezone;
    }

    /**
     * A cron-formatted execution interval, as a cron string, e.g. 1 * * * *
     */
    public String getCron() {
        return cron;
    }
    /**
     * A cron-formatted execution interval, as a cron string, e.g. 1 * * * *
     */
    public void setCron(String cron) {
        this.cron = cron;
    }

    /**
     * Timezone in which the cron interval applies, e.g. America/Los_Angeles
     */
    public String getTimezone() {
        return timezone;
    }
    /**
     * Timezone in which the cron interval applies, e.g. America/Los_Angeles
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cron != null) {
            joiner.add("cron: \"" + cron + "\"");
        }
        if (timezone != null) {
            joiner.add("timezone: \"" + timezone + "\"");
        }
        return joiner.toString();
    }

    public static CronSchedule.Builder builder() {
        return new CronSchedule.Builder();
    }

    public static class Builder {

        private String cron;
        private String timezone;

        public Builder() {
        }

        /**
         * A cron-formatted execution interval, as a cron string, e.g. 1 * * * *
         */
        public Builder setCron(String cron) {
            this.cron = cron;
            return this;
        }

        /**
         * Timezone in which the cron interval applies, e.g. America/Los_Angeles
         */
        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }


        public CronSchedule build() {
            return new CronSchedule(cron, timezone);
        }

    }
}
