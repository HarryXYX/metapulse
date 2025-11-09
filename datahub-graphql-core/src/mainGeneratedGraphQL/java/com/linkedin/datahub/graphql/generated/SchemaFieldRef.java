package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Dataset schema field (i.e. column)
 */
public class SchemaFieldRef implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private String path;

    public SchemaFieldRef() {
    }

    public SchemaFieldRef(String urn, String path) {
        this.urn = urn;
        this.path = path;
    }

    /**
     * A schema field urn
     */
    public String getUrn() {
        return urn;
    }
    /**
     * A schema field urn
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * A schema field path
     */
    public String getPath() {
        return path;
    }
    /**
     * A schema field path
     */
    public void setPath(String path) {
        this.path = path;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (path != null) {
            joiner.add("path: \"" + path + "\"");
        }
        return joiner.toString();
    }

    public static SchemaFieldRef.Builder builder() {
        return new SchemaFieldRef.Builder();
    }

    public static class Builder {

        private String urn;
        private String path;

        public Builder() {
        }

        /**
         * A schema field urn
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * A schema field path
         */
        public Builder setPath(String path) {
            this.path = path;
            return this;
        }


        public SchemaFieldRef build() {
            return new SchemaFieldRef(urn, path);
        }

    }
}
