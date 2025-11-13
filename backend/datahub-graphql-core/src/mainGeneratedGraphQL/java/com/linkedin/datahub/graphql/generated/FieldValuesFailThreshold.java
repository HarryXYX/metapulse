package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class FieldValuesFailThreshold implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private FieldValuesFailThresholdType type;
    @javax.annotation.Nonnull
    private Long value;

    public FieldValuesFailThreshold() {
    }

    public FieldValuesFailThreshold(FieldValuesFailThresholdType type, Long value) {
        this.type = type;
        this.value = value;
    }

    /**
     * The type of failure threshold.
     */
    public FieldValuesFailThresholdType getType() {
        return type;
    }
    /**
     * The type of failure threshold.
     */
    public void setType(FieldValuesFailThresholdType type) {
        this.type = type;
    }

    /**
     * The value of the threshold, either representing a count or percentage.
     */
    public Long getValue() {
        return value;
    }
    /**
     * The value of the threshold, either representing a count or percentage.
     */
    public void setValue(Long value) {
        this.value = value;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (value != null) {
            joiner.add("value: " + value);
        }
        return joiner.toString();
    }

    public static FieldValuesFailThreshold.Builder builder() {
        return new FieldValuesFailThreshold.Builder();
    }

    public static class Builder {

        private FieldValuesFailThresholdType type;
        private Long value;

        public Builder() {
        }

        /**
         * The type of failure threshold.
         */
        public Builder setType(FieldValuesFailThresholdType type) {
            this.type = type;
            return this;
        }

        /**
         * The value of the threshold, either representing a count or percentage.
         */
        public Builder setValue(Long value) {
            this.value = value;
            return this;
        }


        public FieldValuesFailThreshold build() {
            return new FieldValuesFailThreshold(type, value);
        }

    }
}
