package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for performing an auto completion query against a single Metadata Entity
 */
public class AutoCompleteInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private EntityType type;
    @javax.annotation.Nonnull
    private String query;
    private String field;
    private Integer limit;
    private java.util.List<FacetFilterInput> filters;
    private java.util.List<AndFilterInput> orFilters;

    public AutoCompleteInput() {
    }

    public AutoCompleteInput(EntityType type, String query, String field, Integer limit, java.util.List<FacetFilterInput> filters, java.util.List<AndFilterInput> orFilters) {
        this.type = type;
        this.query = query;
        this.field = field;
        this.limit = limit;
        this.filters = filters;
        this.orFilters = orFilters;
    }

    public EntityType getType() {
        return type;
    }
    public void setType(EntityType type) {
        this.type = type;
    }

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }

    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public java.util.List<FacetFilterInput> getFilters() {
        return filters;
    }
    public void setFilters(java.util.List<FacetFilterInput> filters) {
        this.filters = filters;
    }

    public java.util.List<AndFilterInput> getOrFilters() {
        return orFilters;
    }
    public void setOrFilters(java.util.List<AndFilterInput> orFilters) {
        this.orFilters = orFilters;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (query != null) {
            joiner.add("query: \"" + query + "\"");
        }
        if (field != null) {
            joiner.add("field: \"" + field + "\"");
        }
        if (limit != null) {
            joiner.add("limit: " + limit);
        }
        if (filters != null) {
            joiner.add("filters: " + filters);
        }
        if (orFilters != null) {
            joiner.add("orFilters: " + orFilters);
        }
        return joiner.toString();
    }

    public static AutoCompleteInput.Builder builder() {
        return new AutoCompleteInput.Builder();
    }

    public static class Builder {

        private EntityType type;
        private String query;
        private String field;
        private Integer limit;
        private java.util.List<FacetFilterInput> filters;
        private java.util.List<AndFilterInput> orFilters;

        public Builder() {
        }

        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder setField(String field) {
            this.field = field;
            return this;
        }

        public Builder setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder setFilters(java.util.List<FacetFilterInput> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setOrFilters(java.util.List<AndFilterInput> orFilters) {
            this.orFilters = orFilters;
            return this;
        }


        public AutoCompleteInput build() {
            return new AutoCompleteInput(type, query, field, limit, filters, orFilters);
        }

    }
}
