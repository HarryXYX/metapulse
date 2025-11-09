package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input field of the chart
 */
public class InputField implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String schemaFieldUrn;
    private SchemaField schemaField;

    public InputField() {
    }

    public InputField(String schemaFieldUrn, SchemaField schemaField) {
        this.schemaFieldUrn = schemaFieldUrn;
        this.schemaField = schemaField;
    }

    public String getSchemaFieldUrn() {
        return schemaFieldUrn;
    }
    public void setSchemaFieldUrn(String schemaFieldUrn) {
        this.schemaFieldUrn = schemaFieldUrn;
    }

    public SchemaField getSchemaField() {
        return schemaField;
    }
    public void setSchemaField(SchemaField schemaField) {
        this.schemaField = schemaField;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (schemaFieldUrn != null) {
            joiner.add("schemaFieldUrn: \"" + schemaFieldUrn + "\"");
        }
        if (schemaField != null) {
            joiner.add("schemaField: " + schemaField);
        }
        return joiner.toString();
    }

    public static InputField.Builder builder() {
        return new InputField.Builder();
    }

    public static class Builder {

        private String schemaFieldUrn;
        private SchemaField schemaField;

        public Builder() {
        }

        public Builder setSchemaFieldUrn(String schemaFieldUrn) {
            this.schemaFieldUrn = schemaFieldUrn;
            return this;
        }

        public Builder setSchemaField(SchemaField schemaField) {
            this.schemaField = schemaField;
            return this;
        }


        public InputField build() {
            return new InputField(schemaFieldUrn, schemaField);
        }

    }
}
