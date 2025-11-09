package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An entity type registered in DataHub
 */
public class EntityTypeEntity implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private EntityTypeInfo info;
    private EntityRelationshipsResult relationships;

    public EntityTypeEntity() {
    }

    public EntityTypeEntity(String urn, EntityType type, EntityTypeInfo info, EntityRelationshipsResult relationships) {
        this.urn = urn;
        this.type = type;
        this.info = info;
        this.relationships = relationships;
    }

    /**
     * A primary key associated with the Query
     */
    public String getUrn() {
        return urn;
    }
    /**
     * A primary key associated with the Query
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
     * Info about this type including its name
     */
    public EntityTypeInfo getInfo() {
        return info;
    }
    /**
     * Info about this type including its name
     */
    public void setInfo(EntityTypeInfo info) {
        this.info = info;
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
        if (info != null) {
            joiner.add("info: " + info);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static EntityTypeEntity.Builder builder() {
        return new EntityTypeEntity.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private EntityTypeInfo info;
        private EntityRelationshipsResult relationships;

        public Builder() {
        }

        /**
         * A primary key associated with the Query
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
         * Info about this type including its name
         */
        public Builder setInfo(EntityTypeInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Granular API for querying edges extending from this entity
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }


        public EntityTypeEntity build() {
            return new EntityTypeEntity(urn, type, info, relationships);
        }

    }
}
