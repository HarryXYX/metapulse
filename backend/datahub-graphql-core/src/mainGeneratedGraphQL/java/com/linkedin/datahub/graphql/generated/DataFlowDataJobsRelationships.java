package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Deprecated, use relationships query instead
 */
public class DataFlowDataJobsRelationships implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<EntityRelationshipLegacy> entities;

    public DataFlowDataJobsRelationships() {
    }

    public DataFlowDataJobsRelationships(java.util.List<EntityRelationshipLegacy> entities) {
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

    public static DataFlowDataJobsRelationships.Builder builder() {
        return new DataFlowDataJobsRelationships.Builder();
    }

    public static class Builder {

        private java.util.List<EntityRelationshipLegacy> entities;

        public Builder() {
        }

        public Builder setEntities(java.util.List<EntityRelationshipLegacy> entities) {
            this.entities = entities;
            return this;
        }


        public DataFlowDataJobsRelationships build() {
            return new DataFlowDataJobsRelationships(entities);
        }

    }
}
