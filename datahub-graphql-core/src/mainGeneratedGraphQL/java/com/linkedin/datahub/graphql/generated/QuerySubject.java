package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The subject for a Query
 */
public class QuerySubject implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Dataset dataset;
    private SchemaFieldEntity schemaField;

    public QuerySubject() {
    }

    public QuerySubject(Dataset dataset, SchemaFieldEntity schemaField) {
        this.dataset = dataset;
        this.schemaField = schemaField;
    }

    /**
     * The dataset which is the subject of the Query
     */
    public Dataset getDataset() {
        return dataset;
    }
    /**
     * The dataset which is the subject of the Query
     */
    public void setDataset(Dataset dataset) {
        this.dataset = dataset;
    }

    /**
     * The schema field which is the subject of the Query.
This will be populated if the subject is specifically a schema field.
     */
    public SchemaFieldEntity getSchemaField() {
        return schemaField;
    }
    /**
     * The schema field which is the subject of the Query.
This will be populated if the subject is specifically a schema field.
     */
    public void setSchemaField(SchemaFieldEntity schemaField) {
        this.schemaField = schemaField;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (dataset != null) {
            joiner.add("dataset: " + dataset);
        }
        if (schemaField != null) {
            joiner.add("schemaField: " + schemaField);
        }
        return joiner.toString();
    }

    public static QuerySubject.Builder builder() {
        return new QuerySubject.Builder();
    }

    public static class Builder {

        private Dataset dataset;
        private SchemaFieldEntity schemaField;

        public Builder() {
        }

        /**
         * The dataset which is the subject of the Query
         */
        public Builder setDataset(Dataset dataset) {
            this.dataset = dataset;
            return this;
        }

        /**
         * The schema field which is the subject of the Query.
This will be populated if the subject is specifically a schema field.
         */
        public Builder setSchemaField(SchemaFieldEntity schemaField) {
            this.schemaField = schemaField;
            return this;
        }


        public QuerySubject build() {
            return new QuerySubject(dataset, schemaField);
        }

    }
}
