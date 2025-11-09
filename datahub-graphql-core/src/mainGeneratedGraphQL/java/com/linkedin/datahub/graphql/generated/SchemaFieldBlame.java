package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Blame for a single field
 */
public class SchemaFieldBlame implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String fieldPath;
    @javax.annotation.Nonnull
    private SchemaFieldChange schemaFieldChange;

    public SchemaFieldBlame() {
    }

    public SchemaFieldBlame(String fieldPath, SchemaFieldChange schemaFieldChange) {
        this.fieldPath = fieldPath;
        this.schemaFieldChange = schemaFieldChange;
    }

    /**
     * Flattened name of a schema field
     */
    public String getFieldPath() {
        return fieldPath;
    }
    /**
     * Flattened name of a schema field
     */
    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    /**
     * Attributes identifying a field change
     */
    public SchemaFieldChange getSchemaFieldChange() {
        return schemaFieldChange;
    }
    /**
     * Attributes identifying a field change
     */
    public void setSchemaFieldChange(SchemaFieldChange schemaFieldChange) {
        this.schemaFieldChange = schemaFieldChange;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (fieldPath != null) {
            joiner.add("fieldPath: \"" + fieldPath + "\"");
        }
        if (schemaFieldChange != null) {
            joiner.add("schemaFieldChange: " + schemaFieldChange);
        }
        return joiner.toString();
    }

    public static SchemaFieldBlame.Builder builder() {
        return new SchemaFieldBlame.Builder();
    }

    public static class Builder {

        private String fieldPath;
        private SchemaFieldChange schemaFieldChange;

        public Builder() {
        }

        /**
         * Flattened name of a schema field
         */
        public Builder setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }

        /**
         * Attributes identifying a field change
         */
        public Builder setSchemaFieldChange(SchemaFieldChange schemaFieldChange) {
            this.schemaFieldChange = schemaFieldChange;
            return this;
        }


        public SchemaFieldBlame build() {
            return new SchemaFieldBlame(fieldPath, schemaFieldChange);
        }

    }
}
