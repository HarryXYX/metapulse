package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Page Module used for rendering custom or default layouts in the UI
 */
public class DataHubPageModule implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private Boolean exists;
    @javax.annotation.Nonnull
    private DataHubPageModuleProperties properties;
    private EntityRelationshipsResult relationships;

    public DataHubPageModule() {
    }

    public DataHubPageModule(String urn, EntityType type, Boolean exists, DataHubPageModuleProperties properties, EntityRelationshipsResult relationships) {
        this.urn = urn;
        this.type = type;
        this.exists = exists;
        this.properties = properties;
        this.relationships = relationships;
    }

    /**
     * A primary key associated with the Page Module
     */
    public String getUrn() {
        return urn;
    }
    /**
     * A primary key associated with the Page Module
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * A standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * A standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * Whether or not this module exists on DataHub
     */
    public Boolean getExists() {
        return exists;
    }
    /**
     * Whether or not this module exists on DataHub
     */
    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    /**
     * The main properties of a DataHub page module
     */
    public DataHubPageModuleProperties getProperties() {
        return properties;
    }
    /**
     * The main properties of a DataHub page module
     */
    public void setProperties(DataHubPageModuleProperties properties) {
        this.properties = properties;
    }

    /**
     * Granular API for querying edges extending from this entity
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * Granular API for querying edges extending from this entity
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
        if (exists != null) {
            joiner.add("exists: " + exists);
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static DataHubPageModule.Builder builder() {
        return new DataHubPageModule.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private Boolean exists;
        private DataHubPageModuleProperties properties;
        private EntityRelationshipsResult relationships;

        public Builder() {
        }

        /**
         * A primary key associated with the Page Module
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * A standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * Whether or not this module exists on DataHub
         */
        public Builder setExists(Boolean exists) {
            this.exists = exists;
            return this;
        }

        /**
         * The main properties of a DataHub page module
         */
        public Builder setProperties(DataHubPageModuleProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Granular API for querying edges extending from this entity
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }


        public DataHubPageModule build() {
            return new DataHubPageModule(urn, type, exists, properties, relationships);
        }

    }
}
