package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Contains valid fields to filter search results further on
 */
public class FacetMetadata implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String field;
    private String displayName;
    private Entity entity;
    @javax.annotation.Nonnull
    private java.util.List<AggregationMetadata> aggregations;

    public FacetMetadata() {
    }

    public FacetMetadata(String field, String displayName, Entity entity, java.util.List<AggregationMetadata> aggregations) {
        this.field = field;
        this.displayName = displayName;
        this.entity = entity;
        this.aggregations = aggregations;
    }

    /**
     * Name of a field present in the search entity
     */
    public String getField() {
        return field;
    }
    /**
     * Name of a field present in the search entity
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * Display name of the field
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * Display name of the field
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Entity corresponding to the facet
     */
    public Entity getEntity() {
        return entity;
    }
    /**
     * Entity corresponding to the facet
     */
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    /**
     * Aggregated search result counts by value of the field
     */
    public java.util.List<AggregationMetadata> getAggregations() {
        return aggregations;
    }
    /**
     * Aggregated search result counts by value of the field
     */
    public void setAggregations(java.util.List<AggregationMetadata> aggregations) {
        this.aggregations = aggregations;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (field != null) {
            joiner.add("field: \"" + field + "\"");
        }
        if (displayName != null) {
            joiner.add("displayName: \"" + displayName + "\"");
        }
        if (entity != null) {
            joiner.add("entity: " + entity);
        }
        if (aggregations != null) {
            joiner.add("aggregations: " + aggregations);
        }
        return joiner.toString();
    }

    public static FacetMetadata.Builder builder() {
        return new FacetMetadata.Builder();
    }

    public static class Builder {

        private String field;
        private String displayName;
        private Entity entity;
        private java.util.List<AggregationMetadata> aggregations;

        public Builder() {
        }

        /**
         * Name of a field present in the search entity
         */
        public Builder setField(String field) {
            this.field = field;
            return this;
        }

        /**
         * Display name of the field
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Entity corresponding to the facet
         */
        public Builder setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }

        /**
         * Aggregated search result counts by value of the field
         */
        public Builder setAggregations(java.util.List<AggregationMetadata> aggregations) {
            this.aggregations = aggregations;
            return this;
        }


        public FacetMetadata build() {
            return new FacetMetadata(field, displayName, entity, aggregations);
        }

    }
}
