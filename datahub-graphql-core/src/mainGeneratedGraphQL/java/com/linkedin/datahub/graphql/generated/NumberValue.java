package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Numeric property value
 */
public class NumberValue implements java.io.Serializable, PropertyValue {

    private static final long serialVersionUID = 1L;

    private double numberValue;

    public NumberValue() {
    }

    public NumberValue(double numberValue) {
        this.numberValue = numberValue;
    }

    /**
     * The value of a number type property
     */
    public double getNumberValue() {
        return numberValue;
    }
    /**
     * The value of a number type property
     */
    public void setNumberValue(double numberValue) {
        this.numberValue = numberValue;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("numberValue: " + numberValue);
        return joiner.toString();
    }

    public static NumberValue.Builder builder() {
        return new NumberValue.Builder();
    }

    public static class Builder {

        private double numberValue;

        public Builder() {
        }

        /**
         * The value of a number type property
         */
        public Builder setNumberValue(double numberValue) {
            this.numberValue = numberValue;
            return this;
        }


        public NumberValue build() {
            return new NumberValue(numberValue);
        }

    }
}
