package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A time window with a finite start and end time
 */
public class TimeWindow implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Long startTimeMillis;
    @javax.annotation.Nonnull
    private Long durationMillis;

    public TimeWindow() {
    }

    public TimeWindow(Long startTimeMillis, Long durationMillis) {
        this.startTimeMillis = startTimeMillis;
        this.durationMillis = durationMillis;
    }

    /**
     * The start time of the time window
     */
    public Long getStartTimeMillis() {
        return startTimeMillis;
    }
    /**
     * The start time of the time window
     */
    public void setStartTimeMillis(Long startTimeMillis) {
        this.startTimeMillis = startTimeMillis;
    }

    /**
     * The end time of the time window
     */
    public Long getDurationMillis() {
        return durationMillis;
    }
    /**
     * The end time of the time window
     */
    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (startTimeMillis != null) {
            joiner.add("startTimeMillis: " + startTimeMillis);
        }
        if (durationMillis != null) {
            joiner.add("durationMillis: " + durationMillis);
        }
        return joiner.toString();
    }

    public static TimeWindow.Builder builder() {
        return new TimeWindow.Builder();
    }

    public static class Builder {

        private Long startTimeMillis;
        private Long durationMillis;

        public Builder() {
        }

        /**
         * The start time of the time window
         */
        public Builder setStartTimeMillis(Long startTimeMillis) {
            this.startTimeMillis = startTimeMillis;
            return this;
        }

        /**
         * The end time of the time window
         */
        public Builder setDurationMillis(Long durationMillis) {
            this.durationMillis = durationMillis;
            return this;
        }


        public TimeWindow build() {
            return new TimeWindow(startTimeMillis, durationMillis);
        }

    }
}
