package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class ExtraProperty implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String value;

    public ExtraProperty() {
    }

    public ExtraProperty(String name, String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Name of the extra property
     */
    public String getName() {
        return name;
    }
    /**
     * Name of the extra property
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Value of the extra property
     */
    public String getValue() {
        return value;
    }
    /**
     * Value of the extra property
     */
    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (value != null) {
            joiner.add("value: \"" + value + "\"");
        }
        return joiner.toString();
    }

    public static ExtraProperty.Builder builder() {
        return new ExtraProperty.Builder();
    }

    public static class Builder {

        private String name;
        private String value;

        public Builder() {
        }

        /**
         * Name of the extra property
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Value of the extra property
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public ExtraProperty build() {
            return new ExtraProperty(name, value);
        }

    }
}
