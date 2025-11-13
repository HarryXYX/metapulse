package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Parameters for AssertionStdOperators
 */
public class AssertionStdParameters implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private AssertionStdParameter value;
    private AssertionStdParameter maxValue;
    private AssertionStdParameter minValue;

    public AssertionStdParameters() {
    }

    public AssertionStdParameters(AssertionStdParameter value, AssertionStdParameter maxValue, AssertionStdParameter minValue) {
        this.value = value;
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    /**
     * The value parameter of an assertion
     */
    public AssertionStdParameter getValue() {
        return value;
    }
    /**
     * The value parameter of an assertion
     */
    public void setValue(AssertionStdParameter value) {
        this.value = value;
    }

    /**
     * The maxValue parameter of an assertion
     */
    public AssertionStdParameter getMaxValue() {
        return maxValue;
    }
    /**
     * The maxValue parameter of an assertion
     */
    public void setMaxValue(AssertionStdParameter maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * The minValue parameter of an assertion
     */
    public AssertionStdParameter getMinValue() {
        return minValue;
    }
    /**
     * The minValue parameter of an assertion
     */
    public void setMinValue(AssertionStdParameter minValue) {
        this.minValue = minValue;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (value != null) {
            joiner.add("value: " + value);
        }
        if (maxValue != null) {
            joiner.add("maxValue: " + maxValue);
        }
        if (minValue != null) {
            joiner.add("minValue: " + minValue);
        }
        return joiner.toString();
    }

    public static AssertionStdParameters.Builder builder() {
        return new AssertionStdParameters.Builder();
    }

    public static class Builder {

        private AssertionStdParameter value;
        private AssertionStdParameter maxValue;
        private AssertionStdParameter minValue;

        public Builder() {
        }

        /**
         * The value parameter of an assertion
         */
        public Builder setValue(AssertionStdParameter value) {
            this.value = value;
            return this;
        }

        /**
         * The maxValue parameter of an assertion
         */
        public Builder setMaxValue(AssertionStdParameter maxValue) {
            this.maxValue = maxValue;
            return this;
        }

        /**
         * The minValue parameter of an assertion
         */
        public Builder setMinValue(AssertionStdParameter minValue) {
            this.minValue = minValue;
            return this;
        }


        public AssertionStdParameters build() {
            return new AssertionStdParameters(value, maxValue, minValue);
        }

    }
}
