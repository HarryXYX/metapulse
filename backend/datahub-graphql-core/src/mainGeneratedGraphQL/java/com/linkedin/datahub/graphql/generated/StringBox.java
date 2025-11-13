package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class StringBox implements java.io.Serializable, ResultsType, HyperParameterValueType {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String stringValue;

    public StringBox() {
    }

    public StringBox(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getStringValue() {
        return stringValue;
    }
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (stringValue != null) {
            joiner.add("stringValue: \"" + stringValue + "\"");
        }
        return joiner.toString();
    }

    public static StringBox.Builder builder() {
        return new StringBox.Builder();
    }

    public static class Builder {

        private String stringValue;

        public Builder() {
        }

        public Builder setStringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }


        public StringBox build() {
            return new StringBox(stringValue);
        }

    }
}
