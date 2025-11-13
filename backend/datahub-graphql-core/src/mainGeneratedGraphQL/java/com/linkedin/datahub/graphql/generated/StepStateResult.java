package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A single step state
 */
public class StepStateResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String id;
    @javax.annotation.Nonnull
    private java.util.List<StringMapEntry> properties;

    public StepStateResult() {
    }

    public StepStateResult(String id, java.util.List<StringMapEntry> properties) {
        this.id = id;
        this.properties = properties;
    }

    /**
     * Unique id of the step
     */
    public String getId() {
        return id;
    }
    /**
     * Unique id of the step
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The properties for the step state
     */
    public java.util.List<StringMapEntry> getProperties() {
        return properties;
    }
    /**
     * The properties for the step state
     */
    public void setProperties(java.util.List<StringMapEntry> properties) {
        this.properties = properties;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        return joiner.toString();
    }

    public static StepStateResult.Builder builder() {
        return new StepStateResult.Builder();
    }

    public static class Builder {

        private String id;
        private java.util.List<StringMapEntry> properties;

        public Builder() {
        }

        /**
         * Unique id of the step
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The properties for the step state
         */
        public Builder setProperties(java.util.List<StringMapEntry> properties) {
            this.properties = properties;
            return this;
        }


        public StepStateResult build() {
            return new StepStateResult(id, properties);
        }

    }
}
