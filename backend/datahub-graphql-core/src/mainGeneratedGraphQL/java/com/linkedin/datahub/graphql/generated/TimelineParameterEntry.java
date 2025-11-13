package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A timeline parameter entry
 */
public class TimelineParameterEntry implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String key;
    private String value;

    public TimelineParameterEntry() {
    }

    public TimelineParameterEntry(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * The key of the parameter
     */
    public String getKey() {
        return key;
    }
    /**
     * The key of the parameter
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * The value of the parameter
     */
    public String getValue() {
        return value;
    }
    /**
     * The value of the parameter
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

    public static TimelineParameterEntry.Builder builder() {
        return new TimelineParameterEntry.Builder();
    }

    public static class Builder {

        private String key;
        private String value;

        public Builder() {
        }

        /**
         * The key of the parameter
         */
        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        /**
         * The value of the parameter
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public TimelineParameterEntry build() {
            return new TimelineParameterEntry(key, value);
        }

    }
}
