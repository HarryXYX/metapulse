package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A restricted entity that the user does not have full permissions to view.
This entity type does not relate to an entity type in the database.
 */
public class Restricted implements java.io.Serializable, Entity, EntityWithRelationships {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private EntityRelationshipsResult relationships;
    private EntityLineageResult lineage;

    public Restricted() {
    }

    public Restricted(String urn, EntityType type, EntityRelationshipsResult relationships, EntityLineageResult lineage) {
        this.urn = urn;
        this.type = type;
        this.relationships = relationships;
        this.lineage = lineage;
    }

    /**
     * The primary key of the restricted entity
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the restricted entity
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
     * Edges extending from this entity
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * Edges extending from this entity
     */
    public void setRelationships(EntityRelationshipsResult relationships) {
        this.relationships = relationships;
    }

    /**
     * Edges extending from this entity grouped by direction in the lineage graph
     */
    public EntityLineageResult getLineage() {
        return lineage;
    }
    /**
     * Edges extending from this entity grouped by direction in the lineage graph
     */
    public void setLineage(EntityLineageResult lineage) {
        this.lineage = lineage;
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
        if (lineage != null) {
            joiner.add("lineage: " + lineage);
        }
        return joiner.toString();
    }

    public static Restricted.Builder builder() {
        return new Restricted.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private EntityRelationshipsResult relationships;
        private EntityLineageResult lineage;

        public Builder() {
        }

        /**
         * The primary key of the restricted entity
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
         * Edges extending from this entity
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }

        /**
         * Edges extending from this entity grouped by direction in the lineage graph
         */
        public Builder setLineage(EntityLineageResult lineage) {
            this.lineage = lineage;
            return this;
        }


        public Restricted build() {
            return new Restricted(urn, type, relationships, lineage);
        }

    }
}
