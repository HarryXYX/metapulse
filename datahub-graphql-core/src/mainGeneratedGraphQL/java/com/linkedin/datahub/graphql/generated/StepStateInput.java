package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The input required to update the state of a step
 */
public class StepStateInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String id;
    @javax.annotation.Nonnull
    private java.util.List<StringMapEntryInput> properties;

    public StepStateInput() {
    }

    public StepStateInput(String id, java.util.List<StringMapEntryInput> properties) {
        this.id = id;
        this.properties = properties;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public java.util.List<StringMapEntryInput> getProperties() {
        return properties;
    }
    public void setProperties(java.util.List<StringMapEntryInput> properties) {
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

    public static StepStateInput.Builder builder() {
        return new StepStateInput.Builder();
    }

    public static class Builder {

        private String id;
        private java.util.List<StringMapEntryInput> properties;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setProperties(java.util.List<StringMapEntryInput> properties) {
            this.properties = properties;
            return this;
        }


        public StepStateInput build() {
            return new StepStateInput(id, properties);
        }

    }
}
