package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * String property value
 */
public class StringValue implements java.io.Serializable, PropertyValue {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String stringValue;

    public StringValue() {
    }

    public StringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * The value of a string type property
     */
    public String getStringValue() {
        return stringValue;
    }
    /**
     * The value of a string type property
     */
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

    public static StringValue.Builder builder() {
        return new StringValue.Builder();
    }

    public static class Builder {

        private String stringValue;

        public Builder() {
        }

        /**
         * The value of a string type property
         */
        public Builder setStringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }


        public StringValue build() {
            return new StringValue(stringValue);
        }

    }
}
