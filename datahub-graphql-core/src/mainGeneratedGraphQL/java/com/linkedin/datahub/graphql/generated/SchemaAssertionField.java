package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Defines a schema field, each with a specified path and type.
 */
public class SchemaAssertionField implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String path;
    @javax.annotation.Nonnull
    private SchemaFieldDataType type;
    private String nativeType;

    public SchemaAssertionField() {
    }

    public SchemaAssertionField(String path, SchemaFieldDataType type, String nativeType) {
        this.path = path;
        this.type = type;
        this.nativeType = nativeType;
    }

    /**
     * The standard V1 path of the field within the schema.
     */
    public String getPath() {
        return path;
    }
    /**
     * The standard V1 path of the field within the schema.
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * The std type of the field
     */
    public SchemaFieldDataType getType() {
        return type;
    }
    /**
     * The std type of the field
     */
    public void setType(SchemaFieldDataType type) {
        this.type = type;
    }

    /**
     * Optional: The specific native or standard type of the field.
     */
    public String getNativeType() {
        return nativeType;
    }
    /**
     * Optional: The specific native or standard type of the field.
     */
    public void setNativeType(String nativeType) {
        this.nativeType = nativeType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (path != null) {
            joiner.add("path: \"" + path + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (nativeType != null) {
            joiner.add("nativeType: \"" + nativeType + "\"");
        }
        return joiner.toString();
    }

    public static SchemaAssertionField.Builder builder() {
        return new SchemaAssertionField.Builder();
    }

    public static class Builder {

        private String path;
        private SchemaFieldDataType type;
        private String nativeType;

        public Builder() {
        }

        /**
         * The standard V1 path of the field within the schema.
         */
        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        /**
         * The std type of the field
         */
        public Builder setType(SchemaFieldDataType type) {
            this.type = type;
            return this;
        }

        /**
         * Optional: The specific native or standard type of the field.
         */
        public Builder setNativeType(String nativeType) {
            this.nativeType = nativeType;
            return this;
        }


        public SchemaAssertionField build() {
            return new SchemaAssertionField(path, type, nativeType);
        }

    }
}
