package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class OperationsStatsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private TimeRange range;
    private String timeZone;

    public OperationsStatsInput() {
    }

    public OperationsStatsInput(TimeRange range, String timeZone) {
        this.range = range;
        this.timeZone = timeZone;
    }

    public TimeRange getRange() {
        return range;
    }
    public void setRange(TimeRange range) {
        this.range = range;
    }

    public String getTimeZone() {
        return timeZone;
    }
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (range != null) {
            joiner.add("range: " + range);
        }
        if (timeZone != null) {
            joiner.add("timeZone: \"" + timeZone + "\"");
        }
        return joiner.toString();
    }

    public static OperationsStatsInput.Builder builder() {
        return new OperationsStatsInput.Builder();
    }

    public static class Builder {

        private TimeRange range;
        private String timeZone;

        public Builder() {
        }

        public Builder setRange(TimeRange range) {
            this.range = range;
            return this;
        }

        public Builder setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }


        public OperationsStatsInput build() {
            return new OperationsStatsInput(range, timeZone);
        }

    }
}
