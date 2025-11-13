package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class DataContractProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String entityUrn;
    private java.util.List<FreshnessContract> freshness;
    private java.util.List<SchemaContract> schema;
    private java.util.List<DataQualityContract> dataQuality;

    public DataContractProperties() {
    }

    public DataContractProperties(String entityUrn, java.util.List<FreshnessContract> freshness, java.util.List<SchemaContract> schema, java.util.List<DataQualityContract> dataQuality) {
        this.entityUrn = entityUrn;
        this.freshness = freshness;
        this.schema = schema;
        this.dataQuality = dataQuality;
    }

    /**
     * The urn of the related entity, e.g. the Dataset today. In the future, we may support additional contract entities.
     */
    public String getEntityUrn() {
        return entityUrn;
    }
    /**
     * The urn of the related entity, e.g. the Dataset today. In the future, we may support additional contract entities.
     */
    public void setEntityUrn(String entityUrn) {
        this.entityUrn = entityUrn;
    }

    /**
     * The Freshness (SLA) portion of the contract.
As of today, it is expected that there will not be more than 1 Freshness contract. If there are, only the first will be displayed.
     */
    public java.util.List<FreshnessContract> getFreshness() {
        return freshness;
    }
    /**
     * The Freshness (SLA) portion of the contract.
As of today, it is expected that there will not be more than 1 Freshness contract. If there are, only the first will be displayed.
     */
    public void setFreshness(java.util.List<FreshnessContract> freshness) {
        this.freshness = freshness;
    }

    /**
     * The schema / structural portion of the contract.
As of today, it is expected that there will not be more than 1 Schema contract. If there are, only the first will be displayed.
     */
    public java.util.List<SchemaContract> getSchema() {
        return schema;
    }
    /**
     * The schema / structural portion of the contract.
As of today, it is expected that there will not be more than 1 Schema contract. If there are, only the first will be displayed.
     */
    public void setSchema(java.util.List<SchemaContract> schema) {
        this.schema = schema;
    }

    /**
     * A set of data quality related contracts, e.g. table and column-level contract constraints.
     */
    public java.util.List<DataQualityContract> getDataQuality() {
        return dataQuality;
    }
    /**
     * A set of data quality related contracts, e.g. table and column-level contract constraints.
     */
    public void setDataQuality(java.util.List<DataQualityContract> dataQuality) {
        this.dataQuality = dataQuality;
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
        return joiner.toString();
    }

    public static DataContractProperties.Builder builder() {
        return new DataContractProperties.Builder();
    }

    public static class Builder {

        private String entityUrn;
        private java.util.List<FreshnessContract> freshness;
        private java.util.List<SchemaContract> schema;
        private java.util.List<DataQualityContract> dataQuality;

        public Builder() {
        }

        /**
         * The urn of the related entity, e.g. the Dataset today. In the future, we may support additional contract entities.
         */
        public Builder setEntityUrn(String entityUrn) {
            this.entityUrn = entityUrn;
            return this;
        }

        /**
         * The Freshness (SLA) portion of the contract.
As of today, it is expected that there will not be more than 1 Freshness contract. If there are, only the first will be displayed.
         */
        public Builder setFreshness(java.util.List<FreshnessContract> freshness) {
            this.freshness = freshness;
            return this;
        }

        /**
         * The schema / structural portion of the contract.
As of today, it is expected that there will not be more than 1 Schema contract. If there are, only the first will be displayed.
         */
        public Builder setSchema(java.util.List<SchemaContract> schema) {
            this.schema = schema;
            return this;
        }

        /**
         * A set of data quality related contracts, e.g. table and column-level contract constraints.
         */
        public Builder setDataQuality(java.util.List<DataQualityContract> dataQuality) {
            this.dataQuality = dataQuality;
            return this;
        }


        public DataContractProperties build() {
            return new DataContractProperties(entityUrn, freshness, schema, dataQuality);
        }

    }
}
