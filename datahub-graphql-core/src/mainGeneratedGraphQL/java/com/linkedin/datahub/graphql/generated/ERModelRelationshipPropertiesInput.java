package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Details about the ERModelRelationship
 */
public class ERModelRelationshipPropertiesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String source;
    @javax.annotation.Nonnull
    private String destination;
    private java.util.List<RelationshipFieldMappingInput> relationshipFieldmappings;
    private ERModelRelationshipCardinality erModelRelationshipCardinality;
    private Boolean created;
    private Long createdAt;
    private String createdBy;

    public ERModelRelationshipPropertiesInput() {
    }

    public ERModelRelationshipPropertiesInput(String name, String source, String destination, java.util.List<RelationshipFieldMappingInput> relationshipFieldmappings, ERModelRelationshipCardinality erModelRelationshipCardinality, Boolean created, Long createdAt, String createdBy) {
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.relationshipFieldmappings = relationshipFieldmappings;
        this.erModelRelationshipCardinality = erModelRelationshipCardinality;
        this.created = created;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public java.util.List<RelationshipFieldMappingInput> getRelationshipFieldmappings() {
        return relationshipFieldmappings;
    }
    public void setRelationshipFieldmappings(java.util.List<RelationshipFieldMappingInput> relationshipFieldmappings) {
        this.relationshipFieldmappings = relationshipFieldmappings;
    }

    public ERModelRelationshipCardinality getErModelRelationshipCardinality() {
        return erModelRelationshipCardinality;
    }
    public void setErModelRelationshipCardinality(ERModelRelationshipCardinality erModelRelationshipCardinality) {
        this.erModelRelationshipCardinality = erModelRelationshipCardinality;
    }

    public Boolean getCreated() {
        return created;
    }
    public void setCreated(Boolean created) {
        this.created = created;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (source != null) {
            joiner.add("source: \"" + source + "\"");
        }
        if (destination != null) {
            joiner.add("destination: \"" + destination + "\"");
        }
        if (relationshipFieldmappings != null) {
            joiner.add("relationshipFieldmappings: " + relationshipFieldmappings);
        }
        if (erModelRelationshipCardinality != null) {
            joiner.add("erModelRelationshipCardinality: " + erModelRelationshipCardinality);
        }
        if (created != null) {
            joiner.add("created: " + created);
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + createdAt);
        }
        if (createdBy != null) {
            joiner.add("createdBy: \"" + createdBy + "\"");
        }
        return joiner.toString();
    }

    public static ERModelRelationshipPropertiesInput.Builder builder() {
        return new ERModelRelationshipPropertiesInput.Builder();
    }

    public static class Builder {

        private String name;
        private String source;
        private String destination;
        private java.util.List<RelationshipFieldMappingInput> relationshipFieldmappings;
        private ERModelRelationshipCardinality erModelRelationshipCardinality;
        private Boolean created;
        private Long createdAt;
        private String createdBy;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSource(String source) {
            this.source = source;
            return this;
        }

        public Builder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder setRelationshipFieldmappings(java.util.List<RelationshipFieldMappingInput> relationshipFieldmappings) {
            this.relationshipFieldmappings = relationshipFieldmappings;
            return this;
        }

        public Builder setErModelRelationshipCardinality(ERModelRelationshipCardinality erModelRelationshipCardinality) {
            this.erModelRelationshipCardinality = erModelRelationshipCardinality;
            return this;
        }

        public Builder setCreated(Boolean created) {
            this.created = created;
            return this;
        }

        public Builder setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }


        public ERModelRelationshipPropertiesInput build() {
            return new ERModelRelationshipPropertiesInput(name, source, destination, relationshipFieldmappings, erModelRelationshipCardinality, created, createdAt, createdBy);
        }

    }
}
