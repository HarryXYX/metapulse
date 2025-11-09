package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A prompt shown to the user to collect metadata about an entity
 */
public class StructuredPropertyParams implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private StructuredPropertyEntity structuredProperty;

    public StructuredPropertyParams() {
    }

    public StructuredPropertyParams(StructuredPropertyEntity structuredProperty) {
        this.structuredProperty = structuredProperty;
    }

    /**
     * The structured property required for the prompt on this entity
     */
    public StructuredPropertyEntity getStructuredProperty() {
        return structuredProperty;
    }
    /**
     * The structured property required for the prompt on this entity
     */
    public void setStructuredProperty(StructuredPropertyEntity structuredProperty) {
        this.structuredProperty = structuredProperty;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (structuredProperty != null) {
            joiner.add("structuredProperty: " + structuredProperty);
        }
        return joiner.toString();
    }

    public static StructuredPropertyParams.Builder builder() {
        return new StructuredPropertyParams.Builder();
    }

    public static class Builder {

        private StructuredPropertyEntity structuredProperty;

        public Builder() {
        }

        /**
         * The structured property required for the prompt on this entity
         */
        public Builder setStructuredProperty(StructuredPropertyEntity structuredProperty) {
            this.structuredProperty = structuredProperty;
            return this;
        }


        public StructuredPropertyParams build() {
            return new StructuredPropertyParams(structuredProperty);
        }

    }
}
