package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input arguments for creating / updating the schedule of an Ingestion Source
 */
public class UpdateIngestionSourceScheduleInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String interval;
    @javax.annotation.Nonnull
    private String timezone;

    public UpdateIngestionSourceScheduleInput() {
    }

    public UpdateIngestionSourceScheduleInput(String interval, String timezone) {
        this.interval = interval;
        this.timezone = timezone;
    }

    public String getInterval() {
        return interval;
    }
    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getTimezone() {
        return timezone;
    }
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (interval != null) {
            joiner.add("interval: \"" + interval + "\"");
        }
        if (timezone != null) {
            joiner.add("timezone: \"" + timezone + "\"");
        }
        return joiner.toString();
    }

    public static UpdateIngestionSourceScheduleInput.Builder builder() {
        return new UpdateIngestionSourceScheduleInput.Builder();
    }

    public static class Builder {

        private String interval;
        private String timezone;

        public Builder() {
        }

        public Builder setInterval(String interval) {
            this.interval = interval;
            return this;
        }

        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }


        public UpdateIngestionSourceScheduleInput build() {
            return new UpdateIngestionSourceScheduleInput(interval, timezone);
        }

    }
}
