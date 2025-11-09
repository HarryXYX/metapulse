package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class FloatBox implements java.io.Serializable, HyperParameterValueType {

    private static final long serialVersionUID = 1L;

    private double floatValue;

    public FloatBox() {
    }

    public FloatBox(double floatValue) {
        this.floatValue = floatValue;
    }

    public double getFloatValue() {
        return floatValue;
    }
    public void setFloatValue(double floatValue) {
        this.floatValue = floatValue;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("floatValue: " + floatValue);
        return joiner.toString();
    }

    public static FloatBox.Builder builder() {
        return new FloatBox.Builder();
    }

    public static class Builder {

        private double floatValue;

        public Builder() {
        }

        public Builder setFloatValue(double floatValue) {
            this.floatValue = floatValue;
            return this;
        }


        public FloatBox build() {
            return new FloatBox(floatValue);
        }

    }
}
