package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class BooleanBox implements java.io.Serializable, HyperParameterValueType {

    private static final long serialVersionUID = 1L;

    private boolean booleanValue;

    public BooleanBox() {
    }

    public BooleanBox(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public boolean getBooleanValue() {
        return booleanValue;
    }
    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("booleanValue: " + booleanValue);
        return joiner.toString();
    }

    public static BooleanBox.Builder builder() {
        return new BooleanBox.Builder();
    }

    public static class Builder {

        private boolean booleanValue;

        public Builder() {
        }

        public Builder setBooleanValue(boolean booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }


        public BooleanBox build() {
            return new BooleanBox(booleanValue);
        }

    }
}
