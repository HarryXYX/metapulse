package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A single Custom Ownership Type
 */
public class OwnershipTypeEntity implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private OwnershipTypeInfo info;
    private Status status;
    private EntityRelationshipsResult relationships;

    public OwnershipTypeEntity() {
    }

    public OwnershipTypeEntity(String urn, EntityType type, OwnershipTypeInfo info, Status status, EntityRelationshipsResult relationships) {
        this.urn = urn;
        this.type = type;
        this.info = info;
        this.status = status;
        this.relationships = relationships;
    }

    /**
     * A primary key associated with the custom ownership type.
     */
    public String getUrn() {
        return urn;
    }
    /**
     * A primary key associated with the custom ownership type.
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
     * Information about the Custom Ownership Type
     */
    public OwnershipTypeInfo getInfo() {
        return info;
    }
    /**
     * Information about the Custom Ownership Type
     */
    public void setInfo(OwnershipTypeInfo info) {
        this.info = info;
    }

    /**
     * Status of the Custom Ownership Type
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status of the Custom Ownership Type
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Granular API for querying edges extending from the Custom Ownership Type
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * Granular API for querying edges extending from the Custom Ownership Type
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
        if (info != null) {
            joiner.add("info: " + info);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static OwnershipTypeEntity.Builder builder() {
        return new OwnershipTypeEntity.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private OwnershipTypeInfo info;
        private Status status;
        private EntityRelationshipsResult relationships;

        public Builder() {
        }

        /**
         * A primary key associated with the custom ownership type.
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
         * Information about the Custom Ownership Type
         */
        public Builder setInfo(OwnershipTypeInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Status of the Custom Ownership Type
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * Granular API for querying edges extending from the Custom Ownership Type
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }


        public OwnershipTypeEntity build() {
            return new OwnershipTypeEntity(urn, type, info, status, relationships);
        }

    }
}
