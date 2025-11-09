package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class Role implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private EntityRelationshipsResult relationships;
    @javax.annotation.Nonnull
    private String id;
    private RoleProperties properties;
    private Actor actors;
    private boolean isAssignedToMe;

    public Role() {
    }

    public Role(String urn, EntityType type, EntityRelationshipsResult relationships, String id, RoleProperties properties, Actor actors, boolean isAssignedToMe) {
        this.urn = urn;
        this.type = type;
        this.relationships = relationships;
        this.id = id;
        this.properties = properties;
        this.actors = actors;
        this.isAssignedToMe = isAssignedToMe;
    }

    /**
     * A primary key of the Metadata Entity
     */
    public String getUrn() {
        return urn;
    }
    /**
     * A primary key of the Metadata Entity
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

    /**
     * Id of the Role
     */
    public String getId() {
        return id;
    }
    /**
     * Id of the Role
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Role properties to include Request Access Url
     */
    public RoleProperties getProperties() {
        return properties;
    }
    /**
     * Role properties to include Request Access Url
     */
    public void setProperties(RoleProperties properties) {
        this.properties = properties;
    }

    /**
     * A standard Entity Type
     */
    public Actor getActors() {
        return actors;
    }
    /**
     * A standard Entity Type
     */
    public void setActors(Actor actors) {
        this.actors = actors;
    }

    public boolean getIsAssignedToMe() {
        return isAssignedToMe;
    }
    public void setIsAssignedToMe(boolean isAssignedToMe) {
        this.isAssignedToMe = isAssignedToMe;
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
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (actors != null) {
            joiner.add("actors: " + actors);
        }
        joiner.add("isAssignedToMe: " + isAssignedToMe);
        return joiner.toString();
    }

    public static Role.Builder builder() {
        return new Role.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private EntityRelationshipsResult relationships;
        private String id;
        private RoleProperties properties;
        private Actor actors;
        private boolean isAssignedToMe;

        public Builder() {
        }

        /**
         * A primary key of the Metadata Entity
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
         * List of relationships between the source Entity and some destination entities with a given types
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }

        /**
         * Id of the Role
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * Role properties to include Request Access Url
         */
        public Builder setProperties(RoleProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * A standard Entity Type
         */
        public Builder setActors(Actor actors) {
            this.actors = actors;
            return this;
        }

        public Builder setIsAssignedToMe(boolean isAssignedToMe) {
            this.isAssignedToMe = isAssignedToMe;
            return this;
        }


        public Role build() {
            return new Role(urn, type, relationships, id, properties, actors, isAssignedToMe);
        }

    }
}
