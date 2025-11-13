package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Page Template used for rendering custom or default layouts in the UI
 */
public class DataHubPageTemplate implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private DataHubPageTemplateProperties properties;
    private EntityRelationshipsResult relationships;

    public DataHubPageTemplate() {
    }

    public DataHubPageTemplate(String urn, EntityType type, DataHubPageTemplateProperties properties, EntityRelationshipsResult relationships) {
        this.urn = urn;
        this.type = type;
        this.properties = properties;
        this.relationships = relationships;
    }

    /**
     * A primary key associated with the Page Template
     */
    public String getUrn() {
        return urn;
    }
    /**
     * A primary key associated with the Page Template
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
     * The main properties of a DataHub page template
     */
    public DataHubPageTemplateProperties getProperties() {
        return properties;
    }
    /**
     * The main properties of a DataHub page template
     */
    public void setProperties(DataHubPageTemplateProperties properties) {
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
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static DataHubPageTemplate.Builder builder() {
        return new DataHubPageTemplate.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private DataHubPageTemplateProperties properties;
        private EntityRelationshipsResult relationships;

        public Builder() {
        }

        /**
         * A primary key associated with the Page Template
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
         * The main properties of a DataHub page template
         */
        public Builder setProperties(DataHubPageTemplateProperties properties) {
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


        public DataHubPageTemplate build() {
            return new DataHubPageTemplate(urn, type, properties, relationships);
        }

    }
}
