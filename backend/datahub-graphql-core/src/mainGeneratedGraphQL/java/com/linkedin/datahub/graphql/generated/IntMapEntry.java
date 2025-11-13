package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An entry in a integer string map represented as a tuple
 */
public class IntMapEntry implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String key;
    private Integer value;

    public IntMapEntry() {
    }

    public IntMapEntry(String key, Integer value) {
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
     * The value for the map entry
     */
    public Integer getValue() {
        return value;
    }
    /**
     * The value for the map entry
     */
    public void setValue(Integer value) {
        this.value = value;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (key != null) {
            joiner.add("key: \"" + key + "\"");
        }
        if (value != null) {
            joiner.add("value: " + value);
        }
        return joiner.toString();
    }

    public static IntMapEntry.Builder builder() {
        return new IntMapEntry.Builder();
    }

    public static class Builder {

        private String key;
        private Integer value;

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
         * The value for the map entry
         */
        public Builder setValue(Integer value) {
            this.value = value;
            return this;
        }


        public IntMapEntry build() {
            return new IntMapEntry(key, value);
        }

    }
}
