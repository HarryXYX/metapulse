package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about a raw Table Schema
 */
public class TableSchema implements java.io.Serializable, PlatformSchema {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String schema;

    public TableSchema() {
    }

    public TableSchema(String schema) {
        this.schema = schema;
    }

    /**
     * Raw table schema
     */
    public String getSchema() {
        return schema;
    }
    /**
     * Raw table schema
     */
    public void setSchema(String schema) {
        this.schema = schema;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (schema != null) {
            joiner.add("schema: \"" + schema + "\"");
        }
        return joiner.toString();
    }

    public static TableSchema.Builder builder() {
        return new TableSchema.Builder();
    }

    public static class Builder {

        private String schema;

        public Builder() {
        }

        /**
         * Raw table schema
         */
        public Builder setSchema(String schema) {
            this.schema = schema;
            return this;
        }


        public TableSchema build() {
            return new TableSchema(schema);
        }

    }
}
