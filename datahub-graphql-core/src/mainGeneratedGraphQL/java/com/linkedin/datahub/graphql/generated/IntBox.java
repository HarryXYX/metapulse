package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class IntBox implements java.io.Serializable, HyperParameterValueType {

    private static final long serialVersionUID = 1L;

    private int intValue;

    public IntBox() {
    }

    public IntBox(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }
    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("intValue: " + intValue);
        return joiner.toString();
    }

    public static IntBox.Builder builder() {
        return new IntBox.Builder();
    }

    public static class Builder {

        private int intValue;

        public Builder() {
        }

        public Builder setIntValue(int intValue) {
            this.intValue = intValue;
            return this;
        }


        public IntBox build() {
            return new IntBox(intValue);
        }

    }
}
