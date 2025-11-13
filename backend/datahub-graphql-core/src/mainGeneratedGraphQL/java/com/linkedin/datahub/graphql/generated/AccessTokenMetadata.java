package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class AccessTokenMetadata implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String id;
    @javax.annotation.Nonnull
    private String name;
    private String description;
    @javax.annotation.Nonnull
    private String actorUrn;
    @javax.annotation.Nonnull
    private String ownerUrn;
    @javax.annotation.Nonnull
    private Long createdAt;
    private Long expiresAt;
    private EntityRelationshipsResult relationships;

    public AccessTokenMetadata() {
    }

    public AccessTokenMetadata(String urn, EntityType type, String id, String name, String description, String actorUrn, String ownerUrn, Long createdAt, Long expiresAt, EntityRelationshipsResult relationships) {
        this.urn = urn;
        this.type = type;
        this.id = id;
        this.name = name;
        this.description = description;
        this.actorUrn = actorUrn;
        this.ownerUrn = ownerUrn;
        this.createdAt = createdAt;
        this.expiresAt = expiresAt;
        this.relationships = relationships;
    }

    /**
     * The primary key of the access token
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the access token
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
     * The unique identifier of the token.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier of the token.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The name of the token, if it exists.
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the token, if it exists.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The description of the token if defined.
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description of the token if defined.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The actor associated with the Access Token.
     */
    public String getActorUrn() {
        return actorUrn;
    }
    /**
     * The actor associated with the Access Token.
     */
    public void setActorUrn(String actorUrn) {
        this.actorUrn = actorUrn;
    }

    /**
     * The actor who created the Access Token.
     */
    public String getOwnerUrn() {
        return ownerUrn;
    }
    /**
     * The actor who created the Access Token.
     */
    public void setOwnerUrn(String ownerUrn) {
        this.ownerUrn = ownerUrn;
    }

    /**
     * The time when token was generated at.
     */
    public Long getCreatedAt() {
        return createdAt;
    }
    /**
     * The time when token was generated at.
     */
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Time when token will be expired.
     */
    public Long getExpiresAt() {
        return expiresAt;
    }
    /**
     * Time when token will be expired.
     */
    public void setExpiresAt(Long expiresAt) {
        this.expiresAt = expiresAt;
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
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (actorUrn != null) {
            joiner.add("actorUrn: \"" + actorUrn + "\"");
        }
        if (ownerUrn != null) {
            joiner.add("ownerUrn: \"" + ownerUrn + "\"");
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + createdAt);
        }
        if (expiresAt != null) {
            joiner.add("expiresAt: " + expiresAt);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static AccessTokenMetadata.Builder builder() {
        return new AccessTokenMetadata.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String id;
        private String name;
        private String description;
        private String actorUrn;
        private String ownerUrn;
        private Long createdAt;
        private Long expiresAt;
        private EntityRelationshipsResult relationships;

        public Builder() {
        }

        /**
         * The primary key of the access token
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
         * The unique identifier of the token.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The name of the token, if it exists.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The description of the token if defined.
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * The actor associated with the Access Token.
         */
        public Builder setActorUrn(String actorUrn) {
            this.actorUrn = actorUrn;
            return this;
        }

        /**
         * The actor who created the Access Token.
         */
        public Builder setOwnerUrn(String ownerUrn) {
            this.ownerUrn = ownerUrn;
            return this;
        }

        /**
         * The time when token was generated at.
         */
        public Builder setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Time when token will be expired.
         */
        public Builder setExpiresAt(Long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Granular API for querying edges extending from this entity
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }


        public AccessTokenMetadata build() {
            return new AccessTokenMetadata(urn, type, id, name, description, actorUrn, ownerUrn, createdAt, expiresAt, relationships);
        }

    }
}
