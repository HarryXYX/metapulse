package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Schema changes computed at a specific version.
 */
public class GetSchemaBlameResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private SemanticVersionStruct version;
    private java.util.List<SchemaFieldBlame> schemaFieldBlameList;

    public GetSchemaBlameResult() {
    }

    public GetSchemaBlameResult(SemanticVersionStruct version, java.util.List<SchemaFieldBlame> schemaFieldBlameList) {
        this.version = version;
        this.schemaFieldBlameList = schemaFieldBlameList;
    }

    /**
     * Selected semantic version
     */
    public SemanticVersionStruct getVersion() {
        return version;
    }
    /**
     * Selected semantic version
     */
    public void setVersion(SemanticVersionStruct version) {
        this.version = version;
    }

    /**
     * List of schema blame. Absent when there are no fields to return history for.
     */
    public java.util.List<SchemaFieldBlame> getSchemaFieldBlameList() {
        return schemaFieldBlameList;
    }
    /**
     * List of schema blame. Absent when there are no fields to return history for.
     */
    public void setSchemaFieldBlameList(java.util.List<SchemaFieldBlame> schemaFieldBlameList) {
        this.schemaFieldBlameList = schemaFieldBlameList;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (version != null) {
            joiner.add("version: " + version);
        }
        if (schemaFieldBlameList != null) {
            joiner.add("schemaFieldBlameList: " + schemaFieldBlameList);
        }
        return joiner.toString();
    }

    public static GetSchemaBlameResult.Builder builder() {
        return new GetSchemaBlameResult.Builder();
    }

    public static class Builder {

        private SemanticVersionStruct version;
        private java.util.List<SchemaFieldBlame> schemaFieldBlameList;

        public Builder() {
        }

        /**
         * Selected semantic version
         */
        public Builder setVersion(SemanticVersionStruct version) {
            this.version = version;
            return this;
        }

        /**
         * List of schema blame. Absent when there are no fields to return history for.
         */
        public Builder setSchemaFieldBlameList(java.util.List<SchemaFieldBlame> schemaFieldBlameList) {
            this.schemaFieldBlameList = schemaFieldBlameList;
            return this;
        }


        public GetSchemaBlameResult build() {
            return new GetSchemaBlameResult(version, schemaFieldBlameList);
        }

    }
}
