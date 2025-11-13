package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required for creating a DataHub View Definition
 */
public class DataHubViewDefinitionInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<EntityType> entityTypes;
    @javax.annotation.Nonnull
    private DataHubViewFilterInput filter;

    public DataHubViewDefinitionInput() {
    }

    public DataHubViewDefinitionInput(java.util.List<EntityType> entityTypes, DataHubViewFilterInput filter) {
        this.entityTypes = entityTypes;
        this.filter = filter;
    }

    public java.util.List<EntityType> getEntityTypes() {
        return entityTypes;
    }
    public void setEntityTypes(java.util.List<EntityType> entityTypes) {
        this.entityTypes = entityTypes;
    }

    public DataHubViewFilterInput getFilter() {
        return filter;
    }
    public void setFilter(DataHubViewFilterInput filter) {
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

    public static DataHubViewDefinitionInput.Builder builder() {
        return new DataHubViewDefinitionInput.Builder();
    }

    public static class Builder {

        private java.util.List<EntityType> entityTypes;
        private DataHubViewFilterInput filter;

        public Builder() {
        }

        public Builder setEntityTypes(java.util.List<EntityType> entityTypes) {
            this.entityTypes = entityTypes;
            return this;
        }

        public Builder setFilter(DataHubViewFilterInput filter) {
            this.filter = filter;
            return this;
        }


        public DataHubViewDefinitionInput build() {
            return new DataHubViewDefinitionInput(entityTypes, filter);
        }

    }
}
