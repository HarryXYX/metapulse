package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Deprecated, use relationships query instead
 */
public class UpstreamEntityRelationships implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<EntityRelationshipLegacy> entities;

    public UpstreamEntityRelationships() {
    }

    public UpstreamEntityRelationships(java.util.List<EntityRelationshipLegacy> entities) {
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

    public static UpstreamEntityRelationships.Builder builder() {
        return new UpstreamEntityRelationships.Builder();
    }

    public static class Builder {

        private java.util.List<EntityRelationshipLegacy> entities;

        public Builder() {
        }

        public Builder setEntities(java.util.List<EntityRelationshipLegacy> entities) {
            this.entities = entities;
            return this;
        }


        public UpstreamEntityRelationships build() {
            return new UpstreamEntityRelationships(entities);
        }

    }
}
