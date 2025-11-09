package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An error encountered when evaluating an AssertionResult
 */
public class AssertionResultError implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private AssertionResultErrorType type;
    private java.util.List<StringMapEntry> properties;

    public AssertionResultError() {
    }

    public AssertionResultError(AssertionResultErrorType type, java.util.List<StringMapEntry> properties) {
        this.type = type;
        this.properties = properties;
    }

    /**
     * The type of error encountered
     */
    public AssertionResultErrorType getType() {
        return type;
    }
    /**
     * The type of error encountered
     */
    public void setType(AssertionResultErrorType type) {
        this.type = type;
    }

    /**
     * Additional metadata depending on the type of error
     */
    public java.util.List<StringMapEntry> getProperties() {
        return properties;
    }
    /**
     * Additional metadata depending on the type of error
     */
    public void setProperties(java.util.List<StringMapEntry> properties) {
        this.properties = properties;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        return joiner.toString();
    }

    public static AssertionResultError.Builder builder() {
        return new AssertionResultError.Builder();
    }

    public static class Builder {

        private AssertionResultErrorType type;
        private java.util.List<StringMapEntry> properties;

        public Builder() {
        }

        /**
         * The type of error encountered
         */
        public Builder setType(AssertionResultErrorType type) {
            this.type = type;
            return this;
        }

        /**
         * Additional metadata depending on the type of error
         */
        public Builder setProperties(java.util.List<StringMapEntry> properties) {
            this.properties = properties;
            return this;
        }


        public AssertionResultError build() {
            return new AssertionResultError(type, properties);
        }

    }
}
