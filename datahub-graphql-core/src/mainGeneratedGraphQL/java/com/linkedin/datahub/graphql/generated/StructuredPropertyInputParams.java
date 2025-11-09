package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A prompt shown to the user to collect metadata about an entity
 */
public class StructuredPropertyInputParams implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String structuredPropertyUrn;
    @javax.annotation.Nonnull
    private java.util.List<PropertyValueInput> values;

    public StructuredPropertyInputParams() {
    }

    public StructuredPropertyInputParams(String structuredPropertyUrn, java.util.List<PropertyValueInput> values) {
        this.structuredPropertyUrn = structuredPropertyUrn;
        this.values = values;
    }

    public String getStructuredPropertyUrn() {
        return structuredPropertyUrn;
    }
    public void setStructuredPropertyUrn(String structuredPropertyUrn) {
        this.structuredPropertyUrn = structuredPropertyUrn;
    }

    public java.util.List<PropertyValueInput> getValues() {
        return values;
    }
    public void setValues(java.util.List<PropertyValueInput> values) {
        this.values = values;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (structuredPropertyUrn != null) {
            joiner.add("structuredPropertyUrn: \"" + structuredPropertyUrn + "\"");
        }
        if (values != null) {
            joiner.add("values: " + values);
        }
        return joiner.toString();
    }

    public static StructuredPropertyInputParams.Builder builder() {
        return new StructuredPropertyInputParams.Builder();
    }

    public static class Builder {

        private String structuredPropertyUrn;
        private java.util.List<PropertyValueInput> values;

        public Builder() {
        }

        public Builder setStructuredPropertyUrn(String structuredPropertyUrn) {
            this.structuredPropertyUrn = structuredPropertyUrn;
            return this;
        }

        public Builder setValues(java.util.List<PropertyValueInput> values) {
            this.values = values;
            return this;
        }


        public StructuredPropertyInputParams build() {
            return new StructuredPropertyInputParams(structuredPropertyUrn, values);
        }

    }
}
