package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Data Contract Entity. A Data Contract is a verifiable group of assertions regarding various aspects of the data: its freshness (sla),
schema, and data quality or validity. This group of assertions represents a data owner's commitment to producing data that confirms to the agreed
upon contract. Each dataset can have a single contract. The contract can be in a "passing" or "violating" state, depending
on whether the assertions that compose the contract are passing or failing.
Note that the data contract entity is currently in early preview (beta).
 */
public class DataContract implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private DataContractProperties properties;
    private DataContractStatus status;
    private StructuredProperties structuredProperties;
    private EntityRelationshipsResult relationships;

    public DataContract() {
    }

    public DataContract(String urn, EntityType type, DataContractProperties properties, DataContractStatus status, StructuredProperties structuredProperties, EntityRelationshipsResult relationships) {
        this.urn = urn;
        this.type = type;
        this.properties = properties;
        this.status = status;
        this.structuredProperties = structuredProperties;
        this.relationships = relationships;
    }

    /**
     * A primary key of the data contract
     */
    public String getUrn() {
        return urn;
    }
    /**
     * A primary key of the data contract
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * The standard entity type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * The standard entity type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * Properties describing the data contract
     */
    public DataContractProperties getProperties() {
        return properties;
    }
    /**
     * Properties describing the data contract
     */
    public void setProperties(DataContractProperties properties) {
        this.properties = properties;
    }

    /**
     * The status of the data contract
     */
    public DataContractStatus getStatus() {
        return status;
    }
    /**
     * The status of the data contract
     */
    public void setStatus(DataContractStatus status) {
        this.status = status;
    }

    /**
     * Structured properties about this Data Contract
     */
    public StructuredProperties getStructuredProperties() {
        return structuredProperties;
    }
    /**
     * Structured properties about this Data Contract
     */
    public void setStructuredProperties(StructuredProperties structuredProperties) {
        this.structuredProperties = structuredProperties;
    }

    /**
     * List of relationships between the source Entity and some destination entities with a given types
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * List of relationships between the source Entity and some destination entities with a given types
     */
    public void setRelationships(EntityRelationshipsResult relationships) {
        this.relationships = relationships;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (structuredProperties != null) {
            joiner.add("structuredProperties: " + structuredProperties);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static DataContract.Builder builder() {
        return new DataContract.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private DataContractProperties properties;
        private DataContractStatus status;
        private StructuredProperties structuredProperties;
        private EntityRelationshipsResult relationships;

        public Builder() {
        }

        /**
         * A primary key of the data contract
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * The standard entity type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * Properties describing the data contract
         */
        public Builder setProperties(DataContractProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * The status of the data contract
         */
        public Builder setStatus(DataContractStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Structured properties about this Data Contract
         */
        public Builder setStructuredProperties(StructuredProperties structuredProperties) {
            this.structuredProperties = structuredProperties;
            return this;
        }

        /**
         * List of relationships between the source Entity and some destination entities with a given types
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }


        public DataContract build() {
            return new DataContract(urn, type, properties, status, structuredProperties, relationships);
        }

    }
}
