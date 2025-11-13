package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Deprecated, use relationships query instead
 */
public class EntityRelationshipLegacy implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private EntityWithRelationships entity;
    private AuditStamp created;

    public EntityRelationshipLegacy() {
    }

    public EntityRelationshipLegacy(EntityWithRelationships entity, AuditStamp created) {
        this.entity = entity;
        this.created = created;
    }

    /**
     * Entity that is related via lineage
     */
    public EntityWithRelationships getEntity() {
        return entity;
    }
    /**
     * Entity that is related via lineage
     */
    public void setEntity(EntityWithRelationships entity) {
        this.entity = entity;
    }

    /**
     * An AuditStamp corresponding to the last modification of this relationship
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * An AuditStamp corresponding to the last modification of this relationship
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entity != null) {
            joiner.add("entity: " + entity);
        }
        if (created != null) {
            joiner.add("created: " + created);
        }
        return joiner.toString();
    }

    public static EntityRelationshipLegacy.Builder builder() {
        return new EntityRelationshipLegacy.Builder();
    }

    public static class Builder {

        private EntityWithRelationships entity;
        private AuditStamp created;

        public Builder() {
        }

        /**
         * Entity that is related via lineage
         */
        public Builder setEntity(EntityWithRelationships entity) {
            this.entity = entity;
            return this;
        }

        /**
         * An AuditStamp corresponding to the last modification of this relationship
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }


        public EntityRelationshipLegacy build() {
            return new EntityRelationshipLegacy(entity, created);
        }

    }
}
