package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required for creating a Query. Requires the 'Edit Queries' privilege for all query subjects.
 */
public class CreateQueryInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private CreateQueryPropertiesInput properties;
    @javax.annotation.Nonnull
    private java.util.List<CreateQuerySubjectInput> subjects;

    public CreateQueryInput() {
    }

    public CreateQueryInput(CreateQueryPropertiesInput properties, java.util.List<CreateQuerySubjectInput> subjects) {
        this.properties = properties;
        this.subjects = subjects;
    }

    public CreateQueryPropertiesInput getProperties() {
        return properties;
    }
    public void setProperties(CreateQueryPropertiesInput properties) {
        this.properties = properties;
    }

    public java.util.List<CreateQuerySubjectInput> getSubjects() {
        return subjects;
    }
    public void setSubjects(java.util.List<CreateQuerySubjectInput> subjects) {
        this.subjects = subjects;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (subjects != null) {
            joiner.add("subjects: " + subjects);
        }
        return joiner.toString();
    }

    public static CreateQueryInput.Builder builder() {
        return new CreateQueryInput.Builder();
    }

    public static class Builder {

        private CreateQueryPropertiesInput properties;
        private java.util.List<CreateQuerySubjectInput> subjects;

        public Builder() {
        }

        public Builder setProperties(CreateQueryPropertiesInput properties) {
            this.properties = properties;
            return this;
        }

        public Builder setSubjects(java.util.List<CreateQuerySubjectInput> subjects) {
            this.subjects = subjects;
            return this;
        }


        public CreateQueryInput build() {
            return new CreateQueryInput(properties, subjects);
        }

    }
}
