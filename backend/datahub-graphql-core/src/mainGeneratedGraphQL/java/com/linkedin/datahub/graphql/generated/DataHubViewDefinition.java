package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An DataHub View Definition
 */
public class DataHubViewDefinition implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<EntityType> entityTypes;
    @javax.annotation.Nonnull
    private DataHubViewFilter filter;

    public DataHubViewDefinition() {
    }

    public DataHubViewDefinition(java.util.List<EntityType> entityTypes, DataHubViewFilter filter) {
        this.entityTypes = entityTypes;
        this.filter = filter;
    }

    /**
     * A set of filters to apply. If left empty, then ALL entity types are in scope.
     */
    public java.util.List<EntityType> getEntityTypes() {
        return entityTypes;
    }
    /**
     * A set of filters to apply. If left empty, then ALL entity types are in scope.
     */
    public void setEntityTypes(java.util.List<EntityType> entityTypes) {
        this.entityTypes = entityTypes;
    }

    /**
     * A set of filters to apply. If left empty, then no filters will be applied.
     */
    public DataHubViewFilter getFilter() {
        return filter;
    }
    /**
     * A set of filters to apply. If left empty, then no filters will be applied.
     */
    public void setFilter(DataHubViewFilter filter) {
        this.filter = filter;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entityTypes != null) {
            joiner.add("entityTypes: " + entityTypes);
        }
        if (filter != null) {
            joiner.add("filter: " + filter);
        }
        return joiner.toString();
    }

    public static DataHubViewDefinition.Builder builder() {
        return new DataHubViewDefinition.Builder();
    }

    public static class Builder {

        private java.util.List<EntityType> entityTypes;
        private DataHubViewFilter filter;

        public Builder() {
        }

        /**
         * A set of filters to apply. If left empty, then ALL entity types are in scope.
         */
        public Builder setEntityTypes(java.util.List<EntityType> entityTypes) {
            this.entityTypes = entityTypes;
            return this;
        }

        /**
         * A set of filters to apply. If left empty, then no filters will be applied.
         */
        public Builder setFilter(DataHubViewFilter filter) {
            this.filter = filter;
            return this;
        }


        public DataHubViewDefinition build() {
            return new DataHubViewDefinition(entityTypes, filter);
        }

    }
}
