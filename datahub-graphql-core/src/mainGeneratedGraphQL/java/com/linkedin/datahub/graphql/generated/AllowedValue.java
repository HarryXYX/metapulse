package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An entry for an allowed value for a structured property
 */
public class AllowedValue implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private PropertyValue value;
    private String description;

    public AllowedValue() {
    }

    public AllowedValue(PropertyValue value, String description) {
        this.value = value;
        this.description = description;
    }

    /**
     * The allowed value
     */
    public PropertyValue getValue() {
        return value;
    }
    /**
     * The allowed value
     */
    public void setValue(PropertyValue value) {
        this.value = value;
    }

    /**
     * The description of this allowed value
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description of this allowed value
     */
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (value != null) {
            joiner.add("value: " + value);
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        return joiner.toString();
    }

    public static AllowedValue.Builder builder() {
        return new AllowedValue.Builder();
    }

    public static class Builder {

        private PropertyValue value;
        private String description;

        public Builder() {
        }

        /**
         * The allowed value
         */
        public Builder setValue(PropertyValue value) {
            this.value = value;
            return this;
        }

        /**
         * The description of this allowed value
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public AllowedValue build() {
            return new AllowedValue(value, description);
        }

    }
}
