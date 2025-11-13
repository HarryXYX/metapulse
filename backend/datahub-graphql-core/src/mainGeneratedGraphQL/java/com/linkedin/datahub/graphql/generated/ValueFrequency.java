package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A frequency distribution of a specific value within a dataset
 */
public class ValueFrequency implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String value;
    @javax.annotation.Nonnull
    private Long frequency;

    public ValueFrequency() {
    }

    public ValueFrequency(String value, Long frequency) {
        this.value = value;
        this.frequency = frequency;
    }

    /**
     * Specific value. For numeric colums, the value will contain a strigified value
     */
    public String getValue() {
        return value;
    }
    /**
     * Specific value. For numeric colums, the value will contain a strigified value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Volume of the value
     */
    public Long getFrequency() {
        return frequency;
    }
    /**
     * Volume of the value
     */
    public void setFrequency(Long frequency) {
        this.frequency = frequency;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (value != null) {
            joiner.add("value: \"" + value + "\"");
        }
        if (frequency != null) {
            joiner.add("frequency: " + frequency);
        }
        return joiner.toString();
    }

    public static ValueFrequency.Builder builder() {
        return new ValueFrequency.Builder();
    }

    public static class Builder {

        private String value;
        private Long frequency;

        public Builder() {
        }

        /**
         * Specific value. For numeric colums, the value will contain a strigified value
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        /**
         * Volume of the value
         */
        public Builder setFrequency(Long frequency) {
            this.frequency = frequency;
            return this;
        }


        public ValueFrequency build() {
            return new ValueFrequency(value, frequency);
        }

    }
}
