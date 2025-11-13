package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Deprecated, use relationships query instead
 */
public class DownstreamEntityRelationships implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<EntityRelationshipLegacy> entities;

    public DownstreamEntityRelationships() {
    }

    public DownstreamEntityRelationships(java.util.List<EntityRelationshipLegacy> entities) {
        this.entities = entities;
    }

    public java.util.List<EntityRelationshipLegacy> getEntities() {
        return entities;
    }
    public void setEntities(java.util.List<EntityRelationshipLegacy> entities) {
        this.entities = entities;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entities != null) {
            joiner.add("entities: " + entities);
        }
        return joiner.toString();
    }

    public static DownstreamEntityRelationships.Builder builder() {
        return new DownstreamEntityRelationships.Builder();
    }

    public static class Builder {

        private java.util.List<EntityRelationshipLegacy> entities;

        public Builder() {
        }

        public Builder setEntities(java.util.List<EntityRelationshipLegacy> entities) {
            this.entities = entities;
            return this;
        }


        public DownstreamEntityRelationships build() {
            return new DownstreamEntityRelationships(entities);
        }

    }
}
