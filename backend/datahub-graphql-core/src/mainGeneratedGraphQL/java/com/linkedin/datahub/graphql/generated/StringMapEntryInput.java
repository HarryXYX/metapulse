package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * String map entry input
 */
public class StringMapEntryInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String key;
    private String value;

    public StringMapEntryInput() {
    }

    public StringMapEntryInput(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (key != null) {
            joiner.add("key: \"" + key + "\"");
        }
        if (value != null) {
            joiner.add("value: \"" + value + "\"");
        }
        return joiner.toString();
    }

    public static StringMapEntryInput.Builder builder() {
        return new StringMapEntryInput.Builder();
    }

    public static class Builder {

        private String key;
        private String value;

        public Builder() {
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public StringMapEntryInput build() {
            return new StringMapEntryInput(key, value);
        }

    }
}
