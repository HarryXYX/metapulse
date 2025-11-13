package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Type of assertion. Assertion types can evolve to span Datasets, Flows (Pipelines), Models, Features etc.
 */
public class AssertionInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private AssertionType type;
    private DatasetAssertionInfo datasetAssertion;
    private String description;
    private String externalUrl;
    private FreshnessAssertionInfo freshnessAssertion;
    private VolumeAssertionInfo volumeAssertion;
    private SqlAssertionInfo sqlAssertion;
    private FieldAssertionInfo fieldAssertion;
    private SchemaAssertionInfo schemaAssertion;
    private CustomAssertionInfo customAssertion;
    private AssertionSource source;
    private AuditStamp lastUpdated;

    public AssertionInfo() {
    }

    public AssertionInfo(AssertionType type, DatasetAssertionInfo datasetAssertion, String description, String externalUrl, FreshnessAssertionInfo freshnessAssertion, VolumeAssertionInfo volumeAssertion, SqlAssertionInfo sqlAssertion, FieldAssertionInfo fieldAssertion, SchemaAssertionInfo schemaAssertion, CustomAssertionInfo customAssertion, AssertionSource source, AuditStamp lastUpdated) {
        this.type = type;
        this.datasetAssertion = datasetAssertion;
        this.description = description;
        this.externalUrl = externalUrl;
        this.freshnessAssertion = freshnessAssertion;
        this.volumeAssertion = volumeAssertion;
        this.sqlAssertion = sqlAssertion;
        this.fieldAssertion = fieldAssertion;
        this.schemaAssertion = schemaAssertion;
        this.customAssertion = customAssertion;
        this.source = source;
        this.lastUpdated = lastUpdated;
    }

    /**
     * Top-level type of the assertion.
     */
    public AssertionType getType() {
        return type;
    }
    /**
     * Top-level type of the assertion.
     */
    public void setType(AssertionType type) {
        this.type = type;
    }

    /**
     * Dataset-specific assertion information
     */
    public DatasetAssertionInfo getDatasetAssertion() {
        return datasetAssertion;
    }
    /**
     * Dataset-specific assertion information
     */
    public void setDatasetAssertion(DatasetAssertionInfo datasetAssertion) {
        this.datasetAssertion = datasetAssertion;
    }

    /**
     * An optional human-readable description of the assertion
     */
    public String getDescription() {
        return description;
    }
    /**
     * An optional human-readable description of the assertion
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * URL where assertion details are available
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * URL where assertion details are available
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * Information about an Freshness Assertion
     */
    public FreshnessAssertionInfo getFreshnessAssertion() {
        return freshnessAssertion;
    }
    /**
     * Information about an Freshness Assertion
     */
    public void setFreshnessAssertion(FreshnessAssertionInfo freshnessAssertion) {
        this.freshnessAssertion = freshnessAssertion;
    }

    /**
     * Information about an Volume Assertion
     */
    public VolumeAssertionInfo getVolumeAssertion() {
        return volumeAssertion;
    }
    /**
     * Information about an Volume Assertion
     */
    public void setVolumeAssertion(VolumeAssertionInfo volumeAssertion) {
        this.volumeAssertion = volumeAssertion;
    }

    /**
     * Information about a SQL Assertion
     */
    public SqlAssertionInfo getSqlAssertion() {
        return sqlAssertion;
    }
    /**
     * Information about a SQL Assertion
     */
    public void setSqlAssertion(SqlAssertionInfo sqlAssertion) {
        this.sqlAssertion = sqlAssertion;
    }

    /**
     * Information about a Field Assertion
     */
    public FieldAssertionInfo getFieldAssertion() {
        return fieldAssertion;
    }
    /**
     * Information about a Field Assertion
     */
    public void setFieldAssertion(FieldAssertionInfo fieldAssertion) {
        this.fieldAssertion = fieldAssertion;
    }

    /**
     * Schema assertion, e.g. defining the expected structure for an asset.
     */
    public SchemaAssertionInfo getSchemaAssertion() {
        return schemaAssertion;
    }
    /**
     * Schema assertion, e.g. defining the expected structure for an asset.
     */
    public void setSchemaAssertion(SchemaAssertionInfo schemaAssertion) {
        this.schemaAssertion = schemaAssertion;
    }

    /**
     * Information about Custom assertion
     */
    public CustomAssertionInfo getCustomAssertion() {
        return customAssertion;
    }
    /**
     * Information about Custom assertion
     */
    public void setCustomAssertion(CustomAssertionInfo customAssertion) {
        this.customAssertion = customAssertion;
    }

    /**
     * The source or origin of the Assertion definition.
     */
    public AssertionSource getSource() {
        return source;
    }
    /**
     * The source or origin of the Assertion definition.
     */
    public void setSource(AssertionSource source) {
        this.source = source;
    }

    /**
     * The time that the status last changed and the actor who changed it
     */
    public AuditStamp getLastUpdated() {
        return lastUpdated;
    }
    /**
     * The time that the status last changed and the actor who changed it
     */
    public void setLastUpdated(AuditStamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (datasetAssertion != null) {
            joiner.add("datasetAssertion: " + datasetAssertion);
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (externalUrl != null) {
            joiner.add("externalUrl: \"" + externalUrl + "\"");
        }
        if (freshnessAssertion != null) {
            joiner.add("freshnessAssertion: " + freshnessAssertion);
        }
        if (volumeAssertion != null) {
            joiner.add("volumeAssertion: " + volumeAssertion);
        }
        if (sqlAssertion != null) {
            joiner.add("sqlAssertion: " + sqlAssertion);
        }
        if (fieldAssertion != null) {
            joiner.add("fieldAssertion: " + fieldAssertion);
        }
        if (schemaAssertion != null) {
            joiner.add("schemaAssertion: " + schemaAssertion);
        }
        if (customAssertion != null) {
            joiner.add("customAssertion: " + customAssertion);
        }
        if (source != null) {
            joiner.add("source: " + source);
        }
        if (lastUpdated != null) {
            joiner.add("lastUpdated: " + lastUpdated);
        }
        return joiner.toString();
    }

    public static AssertionInfo.Builder builder() {
        return new AssertionInfo.Builder();
    }

    public static class Builder {

        private AssertionType type;
        private DatasetAssertionInfo datasetAssertion;
        private String description;
        private String externalUrl;
        private FreshnessAssertionInfo freshnessAssertion;
        private VolumeAssertionInfo volumeAssertion;
        private SqlAssertionInfo sqlAssertion;
        private FieldAssertionInfo fieldAssertion;
        private SchemaAssertionInfo schemaAssertion;
        private CustomAssertionInfo customAssertion;
        private AssertionSource source;
        private AuditStamp lastUpdated;

        public Builder() {
        }

        /**
         * Top-level type of the assertion.
         */
        public Builder setType(AssertionType type) {
            this.type = type;
            return this;
        }

        /**
         * Dataset-specific assertion information
         */
        public Builder setDatasetAssertion(DatasetAssertionInfo datasetAssertion) {
            this.datasetAssertion = datasetAssertion;
            return this;
        }

        /**
         * An optional human-readable description of the assertion
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * URL where assertion details are available
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Information about an Freshness Assertion
         */
        public Builder setFreshnessAssertion(FreshnessAssertionInfo freshnessAssertion) {
            this.freshnessAssertion = freshnessAssertion;
            return this;
        }

        /**
         * Information about an Volume Assertion
         */
        public Builder setVolumeAssertion(VolumeAssertionInfo volumeAssertion) {
            this.volumeAssertion = volumeAssertion;
            return this;
        }

        /**
         * Information about a SQL Assertion
         */
        public Builder setSqlAssertion(SqlAssertionInfo sqlAssertion) {
            this.sqlAssertion = sqlAssertion;
            return this;
        }

        /**
         * Information about a Field Assertion
         */
        public Builder setFieldAssertion(FieldAssertionInfo fieldAssertion) {
            this.fieldAssertion = fieldAssertion;
            return this;
        }

        /**
         * Schema assertion, e.g. defining the expected structure for an asset.
         */
        public Builder setSchemaAssertion(SchemaAssertionInfo schemaAssertion) {
            this.schemaAssertion = schemaAssertion;
            return this;
        }

        /**
         * Information about Custom assertion
         */
        public Builder setCustomAssertion(CustomAssertionInfo customAssertion) {
            this.customAssertion = customAssertion;
            return this;
        }

        /**
         * The source or origin of the Assertion definition.
         */
        public Builder setSource(AssertionSource source) {
            this.source = source;
            return this;
        }

        /**
         * The time that the status last changed and the actor who changed it
         */
        public Builder setLastUpdated(AuditStamp lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }


        public AssertionInfo build() {
            return new AssertionInfo(type, datasetAssertion, description, externalUrl, freshnessAssertion, volumeAssertion, sqlAssertion, fieldAssertion, schemaAssertion, customAssertion, source, lastUpdated);
        }

    }
}
