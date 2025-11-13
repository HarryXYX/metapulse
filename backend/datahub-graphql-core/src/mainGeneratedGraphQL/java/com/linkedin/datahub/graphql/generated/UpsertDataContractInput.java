package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to upsert a Data Contract entity for an asset
 */
public class UpsertDataContractInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String entityUrn;
    private java.util.List<FreshnessContractInput> freshness;
    private java.util.List<SchemaContractInput> schema;
    private java.util.List<DataQualityContractInput> dataQuality;
    private DataContractState state;
    private String id;

    public UpsertDataContractInput() {
    }

    public UpsertDataContractInput(String entityUrn, java.util.List<FreshnessContractInput> freshness, java.util.List<SchemaContractInput> schema, java.util.List<DataQualityContractInput> dataQuality, DataContractState state, String id) {
        this.entityUrn = entityUrn;
        this.freshness = freshness;
        this.schema = schema;
        this.dataQuality = dataQuality;
        this.state = state;
        this.id = id;
    }

    public String getEntityUrn() {
        return entityUrn;
    }
    public void setEntityUrn(String entityUrn) {
        this.entityUrn = entityUrn;
    }

    public java.util.List<FreshnessContractInput> getFreshness() {
        return freshness;
    }
    public void setFreshness(java.util.List<FreshnessContractInput> freshness) {
        this.freshness = freshness;
    }

    public java.util.List<SchemaContractInput> getSchema() {
        return schema;
    }
    public void setSchema(java.util.List<SchemaContractInput> schema) {
        this.schema = schema;
    }

    public java.util.List<DataQualityContractInput> getDataQuality() {
        return dataQuality;
    }
    public void setDataQuality(java.util.List<DataQualityContractInput> dataQuality) {
        this.dataQuality = dataQuality;
    }

    public DataContractState getState() {
        return state;
    }
    public void setState(DataContractState state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entityUrn != null) {
            joiner.add("entityUrn: \"" + entityUrn + "\"");
        }
        if (freshness != null) {
            joiner.add("freshness: " + freshness);
        }
        if (schema != null) {
            joiner.add("schema: " + schema);
        }
        if (dataQuality != null) {
            joiner.add("dataQuality: " + dataQuality);
        }
        if (state != null) {
            joiner.add("state: " + state);
        }
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
        return joiner.toString();
    }

    public static UpsertDataContractInput.Builder builder() {
        return new UpsertDataContractInput.Builder();
    }

    public static class Builder {

        private String entityUrn;
        private java.util.List<FreshnessContractInput> freshness;
        private java.util.List<SchemaContractInput> schema;
        private java.util.List<DataQualityContractInput> dataQuality;
        private DataContractState state;
        private String id;

        public Builder() {
        }

        public Builder setEntityUrn(String entityUrn) {
            this.entityUrn = entityUrn;
            return this;
        }

        public Builder setFreshness(java.util.List<FreshnessContractInput> freshness) {
            this.freshness = freshness;
            return this;
        }

        public Builder setSchema(java.util.List<SchemaContractInput> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setDataQuality(java.util.List<DataQualityContractInput> dataQuality) {
            this.dataQuality = dataQuality;
            return this;
        }

        public Builder setState(DataContractState state) {
            this.state = state;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }


        public UpsertDataContractInput build() {
            return new UpsertDataContractInput(entityUrn, freshness, schema, dataQuality, state, id);
        }

    }
}
