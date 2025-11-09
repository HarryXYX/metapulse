package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about the field to use in an assertion
 */
public class SchemaFieldSpec implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String path;
    @javax.annotation.Nonnull
    private String type;
    @javax.annotation.Nonnull
    private String nativeType;

    public SchemaFieldSpec() {
    }

    public SchemaFieldSpec(String path, String type, String nativeType) {
        this.path = path;
        this.type = type;
        this.nativeType = nativeType;
    }

    /**
     * The field path
     */
    public String getPath() {
        return path;
    }
    /**
     * The field path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * The DataHub standard schema field type.
     */
    public String getType() {
        return type;
    }
    /**
     * The DataHub standard schema field type.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The native field type
     */
    public String getNativeType() {
        return nativeType;
    }
    /**
     * The native field type
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
            joiner.add("type: \"" + type + "\"");
        }
        if (nativeType != null) {
            joiner.add("nativeType: \"" + nativeType + "\"");
        }
        return joiner.toString();
    }

    public static SchemaFieldSpec.Builder builder() {
        return new SchemaFieldSpec.Builder();
    }

    public static class Builder {

        private String path;
        private String type;
        private String nativeType;

        public Builder() {
        }

        /**
         * The field path
         */
        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        /**
         * The DataHub standard schema field type.
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * The native field type
         */
        public Builder setNativeType(String nativeType) {
            this.nativeType = nativeType;
            return this;
        }


        public SchemaFieldSpec build() {
            return new SchemaFieldSpec(path, type, nativeType);
        }

    }
}
