package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A DataHub Role is a high-level abstraction on top of Policies that dictates what actions users can take.
 */
public class DataHubRole implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private EntityRelationshipsResult relationships;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String description;
    private java.util.List<RawAspect> aspects;

    public DataHubRole() {
    }

    public DataHubRole(String urn, EntityType type, EntityRelationshipsResult relationships, String name, String description, java.util.List<RawAspect> aspects) {
        this.urn = urn;
        this.type = type;
        this.relationships = relationships;
        this.name = name;
        this.description = description;
        this.aspects = aspects;
    }

    /**
     * The primary key of the role
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the role
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
     * Granular API for querying edges extending from the Role
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * Granular API for querying edges extending from the Role
     */
    public void setRelationships(EntityRelationshipsResult relationships) {
        this.relationships = relationships;
    }

    /**
     * The name of the Role.
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the Role.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The description of the Role
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description of the Role
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Experimental API.
For fetching extra entities that do not have custom UI code yet
     */
    public java.util.List<RawAspect> getAspects() {
        return aspects;
    }
    /**
     * Experimental API.
For fetching extra entities that do not have custom UI code yet
     */
    public void setAspects(java.util.List<RawAspect> aspects) {
        this.aspects = aspects;
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
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (aspects != null) {
            joiner.add("aspects: " + aspects);
        }
        return joiner.toString();
    }

    public static DataHubRole.Builder builder() {
        return new DataHubRole.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private EntityRelationshipsResult relationships;
        private String name;
        private String description;
        private java.util.List<RawAspect> aspects;

        public Builder() {
        }

        /**
         * The primary key of the role
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
         * Granular API for querying edges extending from the Role
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }

        /**
         * The name of the Role.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The description of the Role
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Experimental API.
For fetching extra entities that do not have custom UI code yet
         */
        public Builder setAspects(java.util.List<RawAspect> aspects) {
            this.aspects = aspects;
            return this;
        }


        public DataHubRole build() {
            return new DataHubRole(urn, type, relationships, name, description, aspects);
        }

    }
}
