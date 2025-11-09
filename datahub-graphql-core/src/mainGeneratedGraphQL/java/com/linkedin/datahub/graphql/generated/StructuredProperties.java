package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Object containing structured properties for an entity
 */
public class StructuredProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<StructuredPropertiesEntry> properties;

    public StructuredProperties() {
    }

    public StructuredProperties(java.util.List<StructuredPropertiesEntry> properties) {
        this.properties = properties;
    }

    /**
     * Structured properties on this entity
     */
    public java.util.List<StructuredPropertiesEntry> getProperties() {
        return properties;
    }
    /**
     * Structured properties on this entity
     */
    public void setProperties(java.util.List<StructuredPropertiesEntry> properties) {
        this.properties = properties;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        return joiner.toString();
    }

    public static StructuredProperties.Builder builder() {
        return new StructuredProperties.Builder();
    }

    public static class Builder {

        private java.util.List<StructuredPropertiesEntry> properties;

        public Builder() {
        }

        /**
         * Structured properties on this entity
         */
        public Builder setProperties(java.util.List<StructuredPropertiesEntry> properties) {
            this.properties = properties;
            return this;
        }


        public StructuredProperties build() {
            return new StructuredProperties(properties);
        }

    }
}
