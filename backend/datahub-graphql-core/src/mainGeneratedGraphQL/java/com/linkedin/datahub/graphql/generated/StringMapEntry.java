package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An entry in a string string map represented as a tuple
 */
public class StringMapEntry implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String key;
    private String value;

    public StringMapEntry() {
    }

    public StringMapEntry(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * The key of the map entry
     */
    public String getKey() {
        return key;
    }
    /**
     * The key of the map entry
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * The value fo the map entry
     */
    public String getValue() {
        return value;
    }
    /**
     * The value fo the map entry
     */
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

    public static StringMapEntry.Builder builder() {
        return new StringMapEntry.Builder();
    }

    public static class Builder {

        private String key;
        private String value;

        public Builder() {
        }

        /**
         * The key of the map entry
         */
        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        /**
         * The value fo the map entry
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public StringMapEntry build() {
            return new StringMapEntry(key, value);
        }

    }
}
