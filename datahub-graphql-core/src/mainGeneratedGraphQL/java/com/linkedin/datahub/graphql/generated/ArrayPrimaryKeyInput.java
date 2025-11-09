package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class ArrayPrimaryKeyInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String arrayField;
    @javax.annotation.Nonnull
    private java.util.List<String> keys;

    public ArrayPrimaryKeyInput() {
    }

    public ArrayPrimaryKeyInput(String arrayField, java.util.List<String> keys) {
        this.arrayField = arrayField;
        this.keys = keys;
    }

    public String getArrayField() {
        return arrayField;
    }
    public void setArrayField(String arrayField) {
        this.arrayField = arrayField;
    }

    public java.util.List<String> getKeys() {
        return keys;
    }
    public void setKeys(java.util.List<String> keys) {
        this.keys = keys;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (arrayField != null) {
            joiner.add("arrayField: \"" + arrayField + "\"");
        }
        if (keys != null) {
            joiner.add("keys: " + keys);
        }
        return joiner.toString();
    }

    public static ArrayPrimaryKeyInput.Builder builder() {
        return new ArrayPrimaryKeyInput.Builder();
    }

    public static class Builder {

        private String arrayField;
        private java.util.List<String> keys;

        public Builder() {
        }

        public Builder setArrayField(String arrayField) {
            this.arrayField = arrayField;
            return this;
        }

        public Builder setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }


        public ArrayPrimaryKeyInput build() {
            return new ArrayPrimaryKeyInput(arrayField, keys);
        }

    }
}
