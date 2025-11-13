package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Metadata about a lineage relationship between two entities
 */
public class LineageRelationship implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String type;
    private Entity entity;
    private int degree;
    private Long createdOn;
    private Entity createdActor;
    private Long updatedOn;
    private Entity updatedActor;
    private Boolean isManual;
    private java.util.List<EntityPath> paths;

    public LineageRelationship() {
    }

    public LineageRelationship(String type, Entity entity, int degree, Long createdOn, Entity createdActor, Long updatedOn, Entity updatedActor, Boolean isManual, java.util.List<EntityPath> paths) {
        this.type = type;
        this.entity = entity;
        this.degree = degree;
        this.createdOn = createdOn;
        this.createdActor = createdActor;
        this.updatedOn = updatedOn;
        this.updatedActor = updatedActor;
        this.isManual = isManual;
        this.paths = paths;
    }

    /**
     * The type of the relationship
     */
    public String getType() {
        return type;
    }
    /**
     * The type of the relationship
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Entity that is related via lineage
     */
    public Entity getEntity() {
        return entity;
    }
    /**
     * Entity that is related via lineage
     */
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    /**
     * Degree of relationship (number of hops to get to entity)
     */
    public int getDegree() {
        return degree;
    }
    /**
     * Degree of relationship (number of hops to get to entity)
     */
    public void setDegree(int degree) {
        this.degree = degree;
    }

    /**
     * Timestamp for when this lineage relationship was created. Could be null.
     */
    public Long getCreatedOn() {
        return createdOn;
    }
    /**
     * Timestamp for when this lineage relationship was created. Could be null.
     */
    public void setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * The actor who created this lineage relationship. Could be null.
     */
    public Entity getCreatedActor() {
        return createdActor;
    }
    /**
     * The actor who created this lineage relationship. Could be null.
     */
    public void setCreatedActor(Entity createdActor) {
        this.createdActor = createdActor;
    }

    /**
     * Timestamp for when this lineage relationship was last updated. Could be null.
     */
    public Long getUpdatedOn() {
        return updatedOn;
    }
    /**
     * Timestamp for when this lineage relationship was last updated. Could be null.
     */
    public void setUpdatedOn(Long updatedOn) {
        this.updatedOn = updatedOn;
    }

    /**
     * The actor who last updated this lineage relationship. Could be null.
     */
    public Entity getUpdatedActor() {
        return updatedActor;
    }
    /**
     * The actor who last updated this lineage relationship. Could be null.
     */
    public void setUpdatedActor(Entity updatedActor) {
        this.updatedActor = updatedActor;
    }

    /**
     * Whether this edge is a manual edge. Could be null.
     */
    public Boolean getIsManual() {
        return isManual;
    }
    /**
     * Whether this edge is a manual edge. Could be null.
     */
    public void setIsManual(Boolean isManual) {
        this.isManual = isManual;
    }

    /**
     * The paths traversed for this relationship
     */
    public java.util.List<EntityPath> getPaths() {
        return paths;
    }
    /**
     * The paths traversed for this relationship
     */
    public void setPaths(java.util.List<EntityPath> paths) {
        this.paths = paths;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: \"" + type + "\"");
        }
        if (entity != null) {
            joiner.add("entity: " + entity);
        }
        joiner.add("degree: " + degree);
        if (createdOn != null) {
            joiner.add("createdOn: " + createdOn);
        }
        if (createdActor != null) {
            joiner.add("createdActor: " + createdActor);
        }
        if (updatedOn != null) {
            joiner.add("updatedOn: " + updatedOn);
        }
        if (updatedActor != null) {
            joiner.add("updatedActor: " + updatedActor);
        }
        if (isManual != null) {
            joiner.add("isManual: " + isManual);
        }
        if (paths != null) {
            joiner.add("paths: " + paths);
        }
        return joiner.toString();
    }

    public static LineageRelationship.Builder builder() {
        return new LineageRelationship.Builder();
    }

    public static class Builder {

        private String type;
        private Entity entity;
        private int degree;
        private Long createdOn;
        private Entity createdActor;
        private Long updatedOn;
        private Entity updatedActor;
        private Boolean isManual;
        private java.util.List<EntityPath> paths;

        public Builder() {
        }

        /**
         * The type of the relationship
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * Entity that is related via lineage
         */
        public Builder setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }

        /**
         * Degree of relationship (number of hops to get to entity)
         */
        public Builder setDegree(int degree) {
            this.degree = degree;
            return this;
        }

        /**
         * Timestamp for when this lineage relationship was created. Could be null.
         */
        public Builder setCreatedOn(Long createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * The actor who created this lineage relationship. Could be null.
         */
        public Builder setCreatedActor(Entity createdActor) {
            this.createdActor = createdActor;
            return this;
        }

        /**
         * Timestamp for when this lineage relationship was last updated. Could be null.
         */
        public Builder setUpdatedOn(Long updatedOn) {
            this.updatedOn = updatedOn;
            return this;
        }

        /**
         * The actor who last updated this lineage relationship. Could be null.
         */
        public Builder setUpdatedActor(Entity updatedActor) {
            this.updatedActor = updatedActor;
            return this;
        }

        /**
         * Whether this edge is a manual edge. Could be null.
         */
        public Builder setIsManual(Boolean isManual) {
            this.isManual = isManual;
            return this;
        }

        /**
         * The paths traversed for this relationship
         */
        public Builder setPaths(java.util.List<EntityPath> paths) {
            this.paths = paths;
            return this;
        }


        public LineageRelationship build() {
            return new LineageRelationship(type, entity, degree, createdOn, createdActor, updatedOn, updatedActor, isManual, paths);
        }

    }
}
