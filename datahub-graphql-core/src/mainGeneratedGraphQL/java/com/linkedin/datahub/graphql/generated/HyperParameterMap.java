package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class HyperParameterMap implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String key;
    @javax.annotation.Nonnull
    private HyperParameterValueType value;

    public HyperParameterMap() {
    }

    public HyperParameterMap(String key, HyperParameterValueType value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public HyperParameterValueType getValue() {
        return value;
    }
    public void setValue(HyperParameterValueType value) {
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

    public static HyperParameterMap.Builder builder() {
        return new HyperParameterMap.Builder();
    }

    public static class Builder {

        private String key;
        private HyperParameterValueType value;

        public Builder() {
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setValue(HyperParameterValueType value) {
            this.value = value;
            return this;
        }


        public HyperParameterMap build() {
            return new HyperParameterMap(key, value);
        }

    }
}
