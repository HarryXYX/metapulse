package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An DataHub View - Filters that are applied across the application automatically.
 */
public class DataHubView implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private DataHubViewType viewType;
    @javax.annotation.Nonnull
    private String name;
    private String description;
    @javax.annotation.Nonnull
    private DataHubViewDefinition definition;
    private EntityRelationshipsResult relationships;

    public DataHubView() {
    }

    public DataHubView(String urn, EntityType type, DataHubViewType viewType, String name, String description, DataHubViewDefinition definition, EntityRelationshipsResult relationships) {
        this.urn = urn;
        this.type = type;
        this.viewType = viewType;
        this.name = name;
        this.description = description;
        this.definition = definition;
        this.relationships = relationships;
    }

    /**
     * The primary key of the View
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the View
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * The standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * The standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * The type of the View
     */
    public DataHubViewType getViewType() {
        return viewType;
    }
    /**
     * The type of the View
     */
    public void setViewType(DataHubViewType viewType) {
        this.viewType = viewType;
    }

    /**
     * The name of the View
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the View
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The description of the View
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description of the View
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The definition of the View
     */
    public DataHubViewDefinition getDefinition() {
        return definition;
    }
    /**
     * The definition of the View
     */
    public void setDefinition(DataHubViewDefinition definition) {
        this.definition = definition;
    }

    /**
     * Granular API for querying edges extending from the View
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * Granular API for querying edges extending from the View
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
        if (viewType != null) {
            joiner.add("viewType: " + viewType);
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (definition != null) {
            joiner.add("definition: " + definition);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static DataHubView.Builder builder() {
        return new DataHubView.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private DataHubViewType viewType;
        private String name;
        private String description;
        private DataHubViewDefinition definition;
        private EntityRelationshipsResult relationships;

        public Builder() {
        }

        /**
         * The primary key of the View
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * The standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * The type of the View
         */
        public Builder setViewType(DataHubViewType viewType) {
            this.viewType = viewType;
            return this;
        }

        /**
         * The name of the View
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The description of the View
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * The definition of the View
         */
        public Builder setDefinition(DataHubViewDefinition definition) {
            this.definition = definition;
            return this;
        }

        /**
         * Granular API for querying edges extending from the View
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }


        public DataHubView build() {
            return new DataHubView(urn, type, viewType, name, description, definition, relationships);
        }

    }
}
