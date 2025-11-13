package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required for updating an existing Query. Requires the 'Edit Queries' privilege for all query subjects.
 */
public class UpdateQueryInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private UpdateQueryPropertiesInput properties;
    private java.util.List<UpdateQuerySubjectInput> subjects;

    public UpdateQueryInput() {
    }

    public UpdateQueryInput(UpdateQueryPropertiesInput properties, java.util.List<UpdateQuerySubjectInput> subjects) {
        this.properties = properties;
        this.subjects = subjects;
    }

    public UpdateQueryPropertiesInput getProperties() {
        return properties;
    }
    public void setProperties(UpdateQueryPropertiesInput properties) {
        this.properties = properties;
    }

    public java.util.List<UpdateQuerySubjectInput> getSubjects() {
        return subjects;
    }
    public void setSubjects(java.util.List<UpdateQuerySubjectInput> subjects) {
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

    public static UpdateQueryInput.Builder builder() {
        return new UpdateQueryInput.Builder();
    }

    public static class Builder {

        private UpdateQueryPropertiesInput properties;
        private java.util.List<UpdateQuerySubjectInput> subjects;

        public Builder() {
        }

        public Builder setProperties(UpdateQueryPropertiesInput properties) {
            this.properties = properties;
            return this;
        }

        public Builder setSubjects(java.util.List<UpdateQuerySubjectInput> subjects) {
            this.subjects = subjects;
            return this;
        }


        public UpdateQueryInput build() {
            return new UpdateQueryInput(properties, subjects);
        }

    }
}
