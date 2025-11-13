package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A structured property that can be shared between different entities
 */
public class StructuredPropertyEntity implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private Boolean exists;
    @javax.annotation.Nonnull
    private StructuredPropertyDefinition definition;
    private StructuredPropertySettings settings;
    private EntityRelationshipsResult relationships;

    public StructuredPropertyEntity() {
    }

    public StructuredPropertyEntity(String urn, EntityType type, Boolean exists, StructuredPropertyDefinition definition, StructuredPropertySettings settings, EntityRelationshipsResult relationships) {
        this.urn = urn;
        this.type = type;
        this.exists = exists;
        this.definition = definition;
        this.settings = settings;
        this.relationships = relationships;
    }

    /**
     * A primary key associated with the structured property
     */
    public String getUrn() {
        return urn;
    }
    /**
     * A primary key associated with the structured property
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
     * Whether or not this entity exists on DataHub
     */
    public Boolean getExists() {
        return exists;
    }
    /**
     * Whether or not this entity exists on DataHub
     */
    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    /**
     * Definition of this structured property including its name
     */
    public StructuredPropertyDefinition getDefinition() {
        return definition;
    }
    /**
     * Definition of this structured property including its name
     */
    public void setDefinition(StructuredPropertyDefinition definition) {
        this.definition = definition;
    }

    /**
     * Definition of this structured property including its name
     */
    public StructuredPropertySettings getSettings() {
        return settings;
    }
    /**
     * Definition of this structured property including its name
     */
    public void setSettings(StructuredPropertySettings settings) {
        this.settings = settings;
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
        if (definition != null) {
            joiner.add("definition: " + definition);
        }
        if (settings != null) {
            joiner.add("settings: " + settings);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static StructuredPropertyEntity.Builder builder() {
        return new StructuredPropertyEntity.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private Boolean exists;
        private StructuredPropertyDefinition definition;
        private StructuredPropertySettings settings;
        private EntityRelationshipsResult relationships;

        public Builder() {
        }

        /**
         * A primary key associated with the structured property
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
         * Whether or not this entity exists on DataHub
         */
        public Builder setExists(Boolean exists) {
            this.exists = exists;
            return this;
        }

        /**
         * Definition of this structured property including its name
         */
        public Builder setDefinition(StructuredPropertyDefinition definition) {
            this.definition = definition;
            return this;
        }

        /**
         * Definition of this structured property including its name
         */
        public Builder setSettings(StructuredPropertySettings settings) {
            this.settings = settings;
            return this;
        }

        /**
         * Granular API for querying edges extending from this entity
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }


        public StructuredPropertyEntity build() {
            return new StructuredPropertyEntity(urn, type, exists, definition, settings, relationships);
        }

    }
}
