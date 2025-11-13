package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Additional properties about a ERModelRelationship
 */
public class ERModelRelationshipProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private Dataset source;
    @javax.annotation.Nonnull
    private Dataset destination;
    private java.util.List<RelationshipFieldMapping> relationshipFieldMappings;
    @javax.annotation.Nonnull
    private ERModelRelationshipCardinality cardinality;
    private Long createdTime;
    private Entity createdActor;

    public ERModelRelationshipProperties() {
    }

    public ERModelRelationshipProperties(String name, Dataset source, Dataset destination, java.util.List<RelationshipFieldMapping> relationshipFieldMappings, ERModelRelationshipCardinality cardinality, Long createdTime, Entity createdActor) {
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.relationshipFieldMappings = relationshipFieldMappings;
        this.cardinality = cardinality;
        this.createdTime = createdTime;
        this.createdActor = createdActor;
    }

    /**
     * The name of the ERModelRelationship used in display
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the ERModelRelationship used in display
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The urn of source
     */
    public Dataset getSource() {
        return source;
    }
    /**
     * The urn of source
     */
    public void setSource(Dataset source) {
        this.source = source;
    }

    /**
     * The urn of destination
     */
    public Dataset getDestination() {
        return destination;
    }
    /**
     * The urn of destination
     */
    public void setDestination(Dataset destination) {
        this.destination = destination;
    }

    /**
     * The relationFieldMappings
     */
    public java.util.List<RelationshipFieldMapping> getRelationshipFieldMappings() {
        return relationshipFieldMappings;
    }
    /**
     * The relationFieldMappings
     */
    public void setRelationshipFieldMappings(java.util.List<RelationshipFieldMapping> relationshipFieldMappings) {
        this.relationshipFieldMappings = relationshipFieldMappings;
    }

    /**
     * Cardinality of the ERModelRelationship
     */
    public ERModelRelationshipCardinality getCardinality() {
        return cardinality;
    }
    /**
     * Cardinality of the ERModelRelationship
     */
    public void setCardinality(ERModelRelationshipCardinality cardinality) {
        this.cardinality = cardinality;
    }

    /**
     * Created timestamp millis associated with the ERModelRelationship
     */
    public Long getCreatedTime() {
        return createdTime;
    }
    /**
     * Created timestamp millis associated with the ERModelRelationship
     */
    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * Created actor urn associated with the ERModelRelationship
     */
    public Entity getCreatedActor() {
        return createdActor;
    }
    /**
     * Created actor urn associated with the ERModelRelationship
     */
    public void setCreatedActor(Entity createdActor) {
        this.createdActor = createdActor;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (source != null) {
            joiner.add("source: " + source);
        }
        if (destination != null) {
            joiner.add("destination: " + destination);
        }
        if (relationshipFieldMappings != null) {
            joiner.add("relationshipFieldMappings: " + relationshipFieldMappings);
        }
        if (cardinality != null) {
            joiner.add("cardinality: " + cardinality);
        }
        if (createdTime != null) {
            joiner.add("createdTime: " + createdTime);
        }
        if (createdActor != null) {
            joiner.add("createdActor: " + createdActor);
        }
        return joiner.toString();
    }

    public static ERModelRelationshipProperties.Builder builder() {
        return new ERModelRelationshipProperties.Builder();
    }

    public static class Builder {

        private String name;
        private Dataset source;
        private Dataset destination;
        private java.util.List<RelationshipFieldMapping> relationshipFieldMappings;
        private ERModelRelationshipCardinality cardinality;
        private Long createdTime;
        private Entity createdActor;

        public Builder() {
        }

        /**
         * The name of the ERModelRelationship used in display
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The urn of source
         */
        public Builder setSource(Dataset source) {
            this.source = source;
            return this;
        }

        /**
         * The urn of destination
         */
        public Builder setDestination(Dataset destination) {
            this.destination = destination;
            return this;
        }

        /**
         * The relationFieldMappings
         */
        public Builder setRelationshipFieldMappings(java.util.List<RelationshipFieldMapping> relationshipFieldMappings) {
            this.relationshipFieldMappings = relationshipFieldMappings;
            return this;
        }

        /**
         * Cardinality of the ERModelRelationship
         */
        public Builder setCardinality(ERModelRelationshipCardinality cardinality) {
            this.cardinality = cardinality;
            return this;
        }

        /**
         * Created timestamp millis associated with the ERModelRelationship
         */
        public Builder setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * Created actor urn associated with the ERModelRelationship
         */
        public Builder setCreatedActor(Entity createdActor) {
            this.createdActor = createdActor;
            return this;
        }


        public ERModelRelationshipProperties build() {
            return new ERModelRelationshipProperties(name, source, destination, relationshipFieldMappings, cardinality, createdTime, createdActor);
        }

    }
}
