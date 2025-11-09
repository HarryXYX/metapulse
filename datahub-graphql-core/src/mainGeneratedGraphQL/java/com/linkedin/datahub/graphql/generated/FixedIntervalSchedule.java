package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A fixed interval schedule.
 */
public class FixedIntervalSchedule implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private DateInterval unit;
    private int multiple;

    public FixedIntervalSchedule() {
    }

    public FixedIntervalSchedule(DateInterval unit, int multiple) {
        this.unit = unit;
        this.multiple = multiple;
    }

    /**
     * Interval unit such as minute/hour/day etc.
     */
    public DateInterval getUnit() {
        return unit;
    }
    /**
     * Interval unit such as minute/hour/day etc.
     */
    public void setUnit(DateInterval unit) {
        this.unit = unit;
    }

    /**
     * How many units. Defaults to 1.
     */
    public int getMultiple() {
        return multiple;
    }
    /**
     * How many units. Defaults to 1.
     */
    public void setMultiple(int multiple) {
        this.multiple = multiple;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (unit != null) {
            joiner.add("unit: " + unit);
        }
        joiner.add("multiple: " + multiple);
        return joiner.toString();
    }

    public static FixedIntervalSchedule.Builder builder() {
        return new FixedIntervalSchedule.Builder();
    }

    public static class Builder {

        private DateInterval unit;
        private int multiple;

        public Builder() {
        }

        /**
         * Interval unit such as minute/hour/day etc.
         */
        public Builder setUnit(DateInterval unit) {
            this.unit = unit;
            return this;
        }

        /**
         * How many units. Defaults to 1.
         */
        public Builder setMultiple(int multiple) {
            this.multiple = multiple;
            return this;
        }


        public FixedIntervalSchedule build() {
            return new FixedIntervalSchedule(unit, multiple);
        }

    }
}
