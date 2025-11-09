package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about an Schema assertion
 */
public class SchemaAssertionInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String entityUrn;
    @javax.annotation.Nonnull
    private java.util.List<SchemaAssertionField> fields;
    private SchemaMetadata schema;
    @javax.annotation.Nonnull
    private SchemaAssertionCompatibility compatibility;

    public SchemaAssertionInfo() {
    }

    public SchemaAssertionInfo(String entityUrn, java.util.List<SchemaAssertionField> fields, SchemaMetadata schema, SchemaAssertionCompatibility compatibility) {
        this.entityUrn = entityUrn;
        this.fields = fields;
        this.schema = schema;
        this.compatibility = compatibility;
    }

    /**
     * The entity targeted by this schema assertion.
     */
    public String getEntityUrn() {
        return entityUrn;
    }
    /**
     * The entity targeted by this schema assertion.
     */
    public void setEntityUrn(String entityUrn) {
        this.entityUrn = entityUrn;
    }

    /**
     * A single field in the schema assertion.
     */
    public java.util.List<SchemaAssertionField> getFields() {
        return fields;
    }
    /**
     * A single field in the schema assertion.
     */
    public void setFields(java.util.List<SchemaAssertionField> fields) {
        this.fields = fields;
    }

    /**
     * A definition of the expected structure for the asset
Deprecated! Use the simpler 'fields' instead.
     */
    public SchemaMetadata getSchema() {
        return schema;
    }
    /**
     * A definition of the expected structure for the asset
Deprecated! Use the simpler 'fields' instead.
     */
    public void setSchema(SchemaMetadata schema) {
        this.schema = schema;
    }

    /**
     * The compatibility level required for the assertion to pass.
     */
    public SchemaAssertionCompatibility getCompatibility() {
        return compatibility;
    }
    /**
     * The compatibility level required for the assertion to pass.
     */
    public void setCompatibility(SchemaAssertionCompatibility compatibility) {
        this.compatibility = compatibility;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entityUrn != null) {
            joiner.add("entityUrn: \"" + entityUrn + "\"");
        }
        if (fields != null) {
            joiner.add("fields: " + fields);
        }
        if (schema != null) {
            joiner.add("schema: " + schema);
        }
        if (compatibility != null) {
            joiner.add("compatibility: " + compatibility);
        }
        return joiner.toString();
    }

    public static SchemaAssertionInfo.Builder builder() {
        return new SchemaAssertionInfo.Builder();
    }

    public static class Builder {

        private String entityUrn;
        private java.util.List<SchemaAssertionField> fields;
        private SchemaMetadata schema;
        private SchemaAssertionCompatibility compatibility;

        public Builder() {
        }

        /**
         * The entity targeted by this schema assertion.
         */
        public Builder setEntityUrn(String entityUrn) {
            this.entityUrn = entityUrn;
            return this;
        }

        /**
         * A single field in the schema assertion.
         */
        public Builder setFields(java.util.List<SchemaAssertionField> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * A definition of the expected structure for the asset
Deprecated! Use the simpler 'fields' instead.
         */
        public Builder setSchema(SchemaMetadata schema) {
            this.schema = schema;
            return this;
        }

        /**
         * The compatibility level required for the assertion to pass.
         */
        public Builder setCompatibility(SchemaAssertionCompatibility compatibility) {
            this.compatibility = compatibility;
            return this;
        }


        public SchemaAssertionInfo build() {
            return new SchemaAssertionInfo(entityUrn, fields, schema, compatibility);
        }

    }
}
